// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contactsapi/customfield/customfieldschema.proto

package contactsapi.customfield;

public interface UpdateCustomFieldRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:contactsapi.customfield.UpdateCustomFieldRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  boolean hasUpdateMask();
  /**
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  google.protobuf.FieldMaskOuterClass.FieldMask getUpdateMask();
  /**
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  google.protobuf.FieldMaskOuterClass.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
