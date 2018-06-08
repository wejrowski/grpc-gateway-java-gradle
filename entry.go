package main

import (
  "flag"
  "net/http"

  "github.com/golang/glog"
  "golang.org/x/net/context"
  "github.com/grpc-ecosystem/grpc-gateway/runtime"
  "google.golang.org/grpc"

  customFieldGateway "./src/main/proto/contactsapi/customfield"
  companyGateway "./src/main/proto/contactsapi/company"
)

var (
  gRpcServer = flag.String("echo_endpoint", "localhost:50051", "endpoint of YourService")
)

func run() error {
  ctx := context.Background()
  ctx, cancel := context.WithCancel(ctx)
  defer cancel()

  mux := runtime.NewServeMux()
  opts := []grpc.DialOption{grpc.WithInsecure()}

  companyErr := companyGateway.RegisterCompanyServiceHandlerFromEndpoint(ctx, mux, *gRpcServer, opts)
  customFieldErr := customFieldGateway.RegisterCustomFieldServiceHandlerFromEndpoint(ctx, mux, *gRpcServer, opts)

  if companyErr != nil {
    return companyErr
  }

  if customFieldErr != nil {
    return customFieldErr
  }

  return http.ListenAndServe(":8080", mux)
}

func main() {
  flag.Parse()
  defer glog.Flush()

  if err := run(); err != nil {
    glog.Fatal(err)
  }

}
