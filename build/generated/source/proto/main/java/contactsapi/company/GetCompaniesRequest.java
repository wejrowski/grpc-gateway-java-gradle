// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contactsapi/company/companies.proto

package contactsapi.company;

/**
 * Protobuf type {@code contactsapi.company.GetCompaniesRequest}
 */
public  final class GetCompaniesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:contactsapi.company.GetCompaniesRequest)
    GetCompaniesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCompaniesRequest.newBuilder() to construct.
  private GetCompaniesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCompaniesRequest() {
    pageToken_ = "";
    pageSize_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetCompaniesRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            pageToken_ = s;
            break;
          }
          case 16: {

            pageSize_ = input.readInt32();
            break;
          }
          case 26: {
            google.protobuf.FieldMaskOuterClass.FieldMask.Builder subBuilder = null;
            if (fieldMask_ != null) {
              subBuilder = fieldMask_.toBuilder();
            }
            fieldMask_ = input.readMessage(google.protobuf.FieldMaskOuterClass.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fieldMask_);
              fieldMask_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return contactsapi.company.Companies.internal_static_contactsapi_company_GetCompaniesRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return contactsapi.company.Companies.internal_static_contactsapi_company_GetCompaniesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            contactsapi.company.GetCompaniesRequest.class, contactsapi.company.GetCompaniesRequest.Builder.class);
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 1;
  private volatile java.lang.Object pageToken_;
  /**
   * <code>string page_token = 1;</code>
   */
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <code>string page_token = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 2;
  private int pageSize_;
  /**
   * <code>int32 page_size = 2;</code>
   */
  public int getPageSize() {
    return pageSize_;
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 3;
  private google.protobuf.FieldMaskOuterClass.FieldMask fieldMask_;
  /**
   * <code>.google.protobuf.FieldMask field_mask = 3;</code>
   */
  public boolean hasFieldMask() {
    return fieldMask_ != null;
  }
  /**
   * <code>.google.protobuf.FieldMask field_mask = 3;</code>
   */
  public google.protobuf.FieldMaskOuterClass.FieldMask getFieldMask() {
    return fieldMask_ == null ? google.protobuf.FieldMaskOuterClass.FieldMask.getDefaultInstance() : fieldMask_;
  }
  /**
   * <code>.google.protobuf.FieldMask field_mask = 3;</code>
   */
  public google.protobuf.FieldMaskOuterClass.FieldMaskOrBuilder getFieldMaskOrBuilder() {
    return getFieldMask();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pageToken_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(2, pageSize_);
    }
    if (fieldMask_ != null) {
      output.writeMessage(3, getFieldMask());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pageToken_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageSize_);
    }
    if (fieldMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFieldMask());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof contactsapi.company.GetCompaniesRequest)) {
      return super.equals(obj);
    }
    contactsapi.company.GetCompaniesRequest other = (contactsapi.company.GetCompaniesRequest) obj;

    boolean result = true;
    result = result && getPageToken()
        .equals(other.getPageToken());
    result = result && (getPageSize()
        == other.getPageSize());
    result = result && (hasFieldMask() == other.hasFieldMask());
    if (hasFieldMask()) {
      result = result && getFieldMask()
          .equals(other.getFieldMask());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static contactsapi.company.GetCompaniesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static contactsapi.company.GetCompaniesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static contactsapi.company.GetCompaniesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static contactsapi.company.GetCompaniesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static contactsapi.company.GetCompaniesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static contactsapi.company.GetCompaniesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static contactsapi.company.GetCompaniesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static contactsapi.company.GetCompaniesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static contactsapi.company.GetCompaniesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static contactsapi.company.GetCompaniesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static contactsapi.company.GetCompaniesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static contactsapi.company.GetCompaniesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(contactsapi.company.GetCompaniesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code contactsapi.company.GetCompaniesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:contactsapi.company.GetCompaniesRequest)
      contactsapi.company.GetCompaniesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return contactsapi.company.Companies.internal_static_contactsapi_company_GetCompaniesRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return contactsapi.company.Companies.internal_static_contactsapi_company_GetCompaniesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              contactsapi.company.GetCompaniesRequest.class, contactsapi.company.GetCompaniesRequest.Builder.class);
    }

    // Construct using contactsapi.company.GetCompaniesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      pageToken_ = "";

      pageSize_ = 0;

      if (fieldMaskBuilder_ == null) {
        fieldMask_ = null;
      } else {
        fieldMask_ = null;
        fieldMaskBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return contactsapi.company.Companies.internal_static_contactsapi_company_GetCompaniesRequest_descriptor;
    }

    public contactsapi.company.GetCompaniesRequest getDefaultInstanceForType() {
      return contactsapi.company.GetCompaniesRequest.getDefaultInstance();
    }

    public contactsapi.company.GetCompaniesRequest build() {
      contactsapi.company.GetCompaniesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public contactsapi.company.GetCompaniesRequest buildPartial() {
      contactsapi.company.GetCompaniesRequest result = new contactsapi.company.GetCompaniesRequest(this);
      result.pageToken_ = pageToken_;
      result.pageSize_ = pageSize_;
      if (fieldMaskBuilder_ == null) {
        result.fieldMask_ = fieldMask_;
      } else {
        result.fieldMask_ = fieldMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof contactsapi.company.GetCompaniesRequest) {
        return mergeFrom((contactsapi.company.GetCompaniesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(contactsapi.company.GetCompaniesRequest other) {
      if (other == contactsapi.company.GetCompaniesRequest.getDefaultInstance()) return this;
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (other.hasFieldMask()) {
        mergeFieldMask(other.getFieldMask());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      contactsapi.company.GetCompaniesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (contactsapi.company.GetCompaniesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <code>string page_token = 1;</code>
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string page_token = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string page_token = 1;</code>
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string page_token = 1;</code>
     */
    public Builder clearPageToken() {
      
      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>string page_token = 1;</code>
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pageToken_ = value;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <code>int32 page_size = 2;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <code>int32 page_size = 2;</code>
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page_size = 2;</code>
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private google.protobuf.FieldMaskOuterClass.FieldMask fieldMask_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        google.protobuf.FieldMaskOuterClass.FieldMask, google.protobuf.FieldMaskOuterClass.FieldMask.Builder, google.protobuf.FieldMaskOuterClass.FieldMaskOrBuilder> fieldMaskBuilder_;
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3;</code>
     */
    public boolean hasFieldMask() {
      return fieldMaskBuilder_ != null || fieldMask_ != null;
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3;</code>
     */
    public google.protobuf.FieldMaskOuterClass.FieldMask getFieldMask() {
      if (fieldMaskBuilder_ == null) {
        return fieldMask_ == null ? google.protobuf.FieldMaskOuterClass.FieldMask.getDefaultInstance() : fieldMask_;
      } else {
        return fieldMaskBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3;</code>
     */
    public Builder setFieldMask(google.protobuf.FieldMaskOuterClass.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fieldMask_ = value;
        onChanged();
      } else {
        fieldMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3;</code>
     */
    public Builder setFieldMask(
        google.protobuf.FieldMaskOuterClass.FieldMask.Builder builderForValue) {
      if (fieldMaskBuilder_ == null) {
        fieldMask_ = builderForValue.build();
        onChanged();
      } else {
        fieldMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3;</code>
     */
    public Builder mergeFieldMask(google.protobuf.FieldMaskOuterClass.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (fieldMask_ != null) {
          fieldMask_ =
            google.protobuf.FieldMaskOuterClass.FieldMask.newBuilder(fieldMask_).mergeFrom(value).buildPartial();
        } else {
          fieldMask_ = value;
        }
        onChanged();
      } else {
        fieldMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3;</code>
     */
    public Builder clearFieldMask() {
      if (fieldMaskBuilder_ == null) {
        fieldMask_ = null;
        onChanged();
      } else {
        fieldMask_ = null;
        fieldMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3;</code>
     */
    public google.protobuf.FieldMaskOuterClass.FieldMask.Builder getFieldMaskBuilder() {
      
      onChanged();
      return getFieldMaskFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3;</code>
     */
    public google.protobuf.FieldMaskOuterClass.FieldMaskOrBuilder getFieldMaskOrBuilder() {
      if (fieldMaskBuilder_ != null) {
        return fieldMaskBuilder_.getMessageOrBuilder();
      } else {
        return fieldMask_ == null ?
            google.protobuf.FieldMaskOuterClass.FieldMask.getDefaultInstance() : fieldMask_;
      }
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        google.protobuf.FieldMaskOuterClass.FieldMask, google.protobuf.FieldMaskOuterClass.FieldMask.Builder, google.protobuf.FieldMaskOuterClass.FieldMaskOrBuilder> 
        getFieldMaskFieldBuilder() {
      if (fieldMaskBuilder_ == null) {
        fieldMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            google.protobuf.FieldMaskOuterClass.FieldMask, google.protobuf.FieldMaskOuterClass.FieldMask.Builder, google.protobuf.FieldMaskOuterClass.FieldMaskOrBuilder>(
                getFieldMask(),
                getParentForChildren(),
                isClean());
        fieldMask_ = null;
      }
      return fieldMaskBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:contactsapi.company.GetCompaniesRequest)
  }

  // @@protoc_insertion_point(class_scope:contactsapi.company.GetCompaniesRequest)
  private static final contactsapi.company.GetCompaniesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new contactsapi.company.GetCompaniesRequest();
  }

  public static contactsapi.company.GetCompaniesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCompaniesRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetCompaniesRequest>() {
    public GetCompaniesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetCompaniesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCompaniesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCompaniesRequest> getParserForType() {
    return PARSER;
  }

  public contactsapi.company.GetCompaniesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
