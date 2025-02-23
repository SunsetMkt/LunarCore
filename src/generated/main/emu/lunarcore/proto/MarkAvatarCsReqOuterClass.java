// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class MarkAvatarCsReqOuterClass {
  /**
   * Protobuf type {@code MarkAvatarCsReq}
   */
  public static final class MarkAvatarCsReq extends ProtoMessage<MarkAvatarCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 avatar_id = 2;</code>
     */
    private int avatarId;

    /**
     * <code>optional bool is_marked = 3;</code>
     */
    private boolean isMarked;

    private MarkAvatarCsReq() {
    }

    /**
     * @return a new empty instance of {@code MarkAvatarCsReq}
     */
    public static MarkAvatarCsReq newInstance() {
      return new MarkAvatarCsReq();
    }

    /**
     * <code>optional uint32 avatar_id = 2;</code>
     * @return whether the avatarId field is set
     */
    public boolean hasAvatarId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 avatar_id = 2;</code>
     * @return this
     */
    public MarkAvatarCsReq clearAvatarId() {
      bitField0_ &= ~0x00000001;
      avatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 avatar_id = 2;</code>
     * @return the avatarId
     */
    public int getAvatarId() {
      return avatarId;
    }

    /**
     * <code>optional uint32 avatar_id = 2;</code>
     * @param value the avatarId to set
     * @return this
     */
    public MarkAvatarCsReq setAvatarId(final int value) {
      bitField0_ |= 0x00000001;
      avatarId = value;
      return this;
    }

    /**
     * <code>optional bool is_marked = 3;</code>
     * @return whether the isMarked field is set
     */
    public boolean hasIsMarked() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional bool is_marked = 3;</code>
     * @return this
     */
    public MarkAvatarCsReq clearIsMarked() {
      bitField0_ &= ~0x00000002;
      isMarked = false;
      return this;
    }

    /**
     * <code>optional bool is_marked = 3;</code>
     * @return the isMarked
     */
    public boolean getIsMarked() {
      return isMarked;
    }

    /**
     * <code>optional bool is_marked = 3;</code>
     * @param value the isMarked to set
     * @return this
     */
    public MarkAvatarCsReq setIsMarked(final boolean value) {
      bitField0_ |= 0x00000002;
      isMarked = value;
      return this;
    }

    @Override
    public MarkAvatarCsReq copyFrom(final MarkAvatarCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        avatarId = other.avatarId;
        isMarked = other.isMarked;
      }
      return this;
    }

    @Override
    public MarkAvatarCsReq mergeFrom(final MarkAvatarCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAvatarId()) {
        setAvatarId(other.avatarId);
      }
      if (other.hasIsMarked()) {
        setIsMarked(other.isMarked);
      }
      return this;
    }

    @Override
    public MarkAvatarCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      avatarId = 0;
      isMarked = false;
      return this;
    }

    @Override
    public MarkAvatarCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof MarkAvatarCsReq)) {
        return false;
      }
      MarkAvatarCsReq other = (MarkAvatarCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasAvatarId() || avatarId == other.avatarId)
        && (!hasIsMarked() || isMarked == other.isMarked);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 24);
        output.writeBoolNoTag(isMarked);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public MarkAvatarCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // avatarId
            avatarId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // isMarked
            isMarked = input.readBool();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.avatarId, avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeBool(FieldNames.isMarked, isMarked);
      }
      output.endObject();
    }

    @Override
    public MarkAvatarCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1787287636:
          case -428636735: {
            if (input.isAtField(FieldNames.avatarId)) {
              if (!input.trySkipNullValue()) {
                avatarId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -407271946:
          case -617266975: {
            if (input.isAtField(FieldNames.isMarked)) {
              if (!input.trySkipNullValue()) {
                isMarked = input.readBool();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public MarkAvatarCsReq clone() {
      return new MarkAvatarCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static MarkAvatarCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new MarkAvatarCsReq(), data).checkInitialized();
    }

    public static MarkAvatarCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MarkAvatarCsReq(), input).checkInitialized();
    }

    public static MarkAvatarCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MarkAvatarCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating MarkAvatarCsReq messages
     */
    public static MessageFactory<MarkAvatarCsReq> getFactory() {
      return MarkAvatarCsReqFactory.INSTANCE;
    }

    private enum MarkAvatarCsReqFactory implements MessageFactory<MarkAvatarCsReq> {
      INSTANCE;

      @Override
      public MarkAvatarCsReq create() {
        return MarkAvatarCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName avatarId = FieldName.forField("avatarId", "avatar_id");

      static final FieldName isMarked = FieldName.forField("isMarked", "is_marked");
    }
  }
}
