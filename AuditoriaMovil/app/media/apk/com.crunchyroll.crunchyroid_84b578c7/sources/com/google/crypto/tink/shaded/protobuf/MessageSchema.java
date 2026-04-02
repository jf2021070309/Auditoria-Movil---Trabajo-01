package com.google.crypto.tink.shaded.protobuf;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.k.q;
import com.google.ads.AdSize;
import com.google.android.gms.common.ConnectionResult;
import com.google.crypto.tink.shaded.protobuf.ArrayDecoders;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.MapEntryLite;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import com.google.crypto.tink.shaded.protobuf.Writer;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: classes4.dex */
public final class MessageSchema<T> implements Schema<T> {
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.MessageSchema$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, boolean z2, int[] iArr2, int i3, int i4, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        boolean z3;
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.proto3 = z;
        if (extensionSchema != null && extensionSchema.hasExtensions(messageLite)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.hasExtensions = z3;
        this.useCachedSizeField = z2;
        this.intArray = iArr2;
        this.checkInitializedCount = i3;
        this.repeatedFieldOffsetStart = i4;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t, T t2, int i) {
        if (isFieldPresent(t, i) == isFieldPresent(t2, i)) {
            return true;
        }
        return false;
    }

    private static <T> boolean booleanAt(T t, long j) {
        return UnsafeUtil.getBoolean(t, j);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    private <K, V> int decodeMapEntry(byte[] bArr, int i, int i2, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws IOException {
        int i3;
        int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
        int i4 = registers.int1;
        if (i4 >= 0 && i4 <= i2 - decodeVarint32) {
            int i5 = decodeVarint32 + i4;
            K k = metadata.defaultKey;
            V v = metadata.defaultValue;
            while (decodeVarint32 < i5) {
                int i6 = decodeVarint32 + 1;
                byte b = bArr[decodeVarint32];
                if (b < 0) {
                    i3 = ArrayDecoders.decodeVarint32(b, bArr, i6, registers);
                    b = registers.int1;
                } else {
                    i3 = i6;
                }
                int i7 = b >>> 3;
                int i8 = b & 7;
                if (i7 != 1) {
                    if (i7 == 2 && i8 == metadata.valueType.getWireType()) {
                        decodeVarint32 = decodeMapEntryValue(bArr, i3, i2, metadata.valueType, metadata.defaultValue.getClass(), registers);
                        v = registers.object1;
                    }
                    decodeVarint32 = ArrayDecoders.skipField(b, bArr, i3, i2, registers);
                } else if (i8 == metadata.keyType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(bArr, i3, i2, metadata.keyType, null, registers);
                    k = registers.object1;
                } else {
                    decodeVarint32 = ArrayDecoders.skipField(b, bArr, i3, i2, registers);
                }
            }
            if (decodeVarint32 == i5) {
                map.put(k, v);
                return i5;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    private int decodeMapEntryValue(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) throws IOException {
        boolean z;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                if (registers.long1 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                registers.object1 = Boolean.valueOf(z);
                return decodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i));
                return i + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i));
                return i + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i));
                return i + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return decodeVarint32;
            case 12:
            case 13:
                int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return decodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i, i2, registers);
            case 15:
                int decodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return decodeVarint322;
            case 16:
                int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return decodeVarint643;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t, long j) {
        return UnsafeUtil.getDouble(t, j);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        int numberAt = numberAt(i);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i)));
        if (object == null) {
            return ub;
        }
        Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i);
        if (enumFieldVerifier == null) {
            return ub;
        }
        return (UB) filterUnknownEnumMap(i, numberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i2, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> forMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(newCodedBuilder.getCodedOutput(), forMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub, i2, newCodedBuilder.build());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t, long j) {
        return UnsafeUtil.getFloat(t, j);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i) {
        return (Internal.EnumVerifier) this.objects[t0.c(i, 3, 2, 1)];
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i) {
        int i2 = (i / 3) * 2;
        Schema schema = (Schema) this.objects[i2];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaFor = Protobuf.getInstance().schemaFor((Class) ((Class) this.objects[i2 + 1]));
        this.objects[i2] = schemaFor;
        return schemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = newInstance;
            return newInstance;
        }
        return unknownFieldSetLite;
    }

    private int getSerializedSizeProto2(T t) {
        int i;
        int i2;
        int i3;
        int computeDoubleSize;
        int computeStringSize;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i7 < this.buffer.length) {
            int typeAndOffsetAt = typeAndOffsetAt(i7);
            int numberAt = numberAt(i7);
            int type = type(typeAndOffsetAt);
            if (type <= 17) {
                i2 = this.buffer[i7 + 2];
                int i9 = i4 & i2;
                i3 = 1 << (i2 >>> 20);
                if (i9 != i8) {
                    i5 = unsafe.getInt(t, i9);
                    i8 = i9;
                }
            } else {
                if (this.useCachedSizeField && type >= FieldType.DOUBLE_LIST_PACKED.id() && type <= FieldType.SINT64_LIST_PACKED.id()) {
                    i = i4 & this.buffer[i7 + 2];
                } else {
                    i = 0;
                }
                i2 = i;
                i3 = 0;
            }
            long offset = offset(typeAndOffsetAt);
            int i10 = i8;
            switch (type) {
                case 0:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 1:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 2:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, unsafe.getLong(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 3:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, unsafe.getLong(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 4:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, unsafe.getInt(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 5:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 6:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 7:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 8:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(t, offset);
                        if (object instanceof ByteString) {
                            computeStringSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object);
                        } else {
                            computeStringSize = CodedOutputStream.computeStringSize(numberAt, (String) object);
                        }
                        i6 += computeStringSize;
                        break;
                    }
                case 9:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t, offset), getMessageFieldSchema(i7));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 10:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 11:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, unsafe.getInt(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 12:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, unsafe.getInt(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 13:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 14:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 15:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, unsafe.getInt(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 16:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, unsafe.getLong(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 17:
                    if ((i5 & i3) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t, offset), getMessageFieldSchema(i7));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 18:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeDoubleSize;
                    break;
                case 19:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeDoubleSize;
                    break;
                case 20:
                    computeDoubleSize = SchemaUtil.computeSizeInt64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeDoubleSize;
                    break;
                case 21:
                    computeDoubleSize = SchemaUtil.computeSizeUInt64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeDoubleSize;
                    break;
                case 22:
                    computeDoubleSize = SchemaUtil.computeSizeInt32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeDoubleSize;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeDoubleSize;
                    break;
                case 24:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeDoubleSize;
                    break;
                case 25:
                    computeDoubleSize = SchemaUtil.computeSizeBoolList(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeDoubleSize;
                    break;
                case 26:
                    computeDoubleSize = SchemaUtil.computeSizeStringList(numberAt, (List) unsafe.getObject(t, offset));
                    i6 += computeDoubleSize;
                    break;
                case 27:
                    computeDoubleSize = SchemaUtil.computeSizeMessageList(numberAt, (List) unsafe.getObject(t, offset), getMessageFieldSchema(i7));
                    i6 += computeDoubleSize;
                    break;
                case 28:
                    computeDoubleSize = SchemaUtil.computeSizeByteStringList(numberAt, (List) unsafe.getObject(t, offset));
                    i6 += computeDoubleSize;
                    break;
                case 29:
                    computeDoubleSize = SchemaUtil.computeSizeUInt32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeDoubleSize;
                    break;
                case 30:
                    computeDoubleSize = SchemaUtil.computeSizeEnumList(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeDoubleSize;
                    break;
                case 31:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeDoubleSize;
                    break;
                case 32:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeDoubleSize;
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    computeDoubleSize = SchemaUtil.computeSizeSInt32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeDoubleSize;
                    break;
                case 34:
                    computeDoubleSize = SchemaUtil.computeSizeSInt64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeDoubleSize;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i2, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i6 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i2, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i6 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i2, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i6 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i2, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i6 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i2, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i6 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i2, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i6 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i2, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i6 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i2, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i6 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i2, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i6 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i2, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i6 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i2, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i6 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i2, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i6 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i2, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i6 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i2, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i6 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    computeDoubleSize = SchemaUtil.computeSizeGroupList(numberAt, (List) unsafe.getObject(t, offset), getMessageFieldSchema(i7));
                    i6 += computeDoubleSize;
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    computeDoubleSize = this.mapFieldSchema.getSerializedSize(numberAt, unsafe.getObject(t, offset), getMapFieldDefaultEntry(i7));
                    i6 += computeDoubleSize;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 52:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 53:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 54:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 55:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 56:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 57:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 58:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 59:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(t, offset);
                        if (object2 instanceof ByteString) {
                            computeStringSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2);
                        } else {
                            computeStringSize = CodedOutputStream.computeStringSize(numberAt, (String) object2);
                        }
                        i6 += computeStringSize;
                        break;
                    }
                case 60:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t, offset), getMessageFieldSchema(i7));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 61:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 62:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 63:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 64:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 65:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 66:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 67:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 68:
                    if (!isOneofPresent(t, numberAt, i7)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t, offset), getMessageFieldSchema(i7));
                        i6 += computeDoubleSize;
                        break;
                    }
            }
            i7 += 3;
            i4 = 1048575;
            i8 = i10;
        }
        int unknownFieldsSerializedSize = i6 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t);
        if (this.hasExtensions) {
            return unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t).getSerializedSize();
        }
        return unknownFieldsSerializedSize;
    }

    private int getSerializedSizeProto3(T t) {
        int i;
        int computeDoubleSize;
        int computeStringSize;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i2 = 0;
        for (int i3 = 0; i3 < this.buffer.length; i3 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i3);
            int type = type(typeAndOffsetAt);
            int numberAt = numberAt(i3);
            long offset = offset(typeAndOffsetAt);
            if (type >= FieldType.DOUBLE_LIST_PACKED.id() && type <= FieldType.SINT64_LIST_PACKED.id()) {
                i = this.buffer[i3 + 2] & 1048575;
            } else {
                i = 0;
            }
            switch (type) {
                case 0:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, UnsafeUtil.getLong(t, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, UnsafeUtil.getLong(t, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, UnsafeUtil.getInt(t, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (isFieldPresent(t, i3)) {
                        Object object = UnsafeUtil.getObject(t, offset);
                        if (object instanceof ByteString) {
                            computeStringSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object);
                        } else {
                            computeStringSize = CodedOutputStream.computeStringSize(numberAt, (String) object);
                        }
                        i2 += computeStringSize;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, UnsafeUtil.getObject(t, offset), getMessageFieldSchema(i3));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) UnsafeUtil.getObject(t, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, UnsafeUtil.getInt(t, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, UnsafeUtil.getInt(t, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, UnsafeUtil.getInt(t, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, UnsafeUtil.getLong(t, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (isFieldPresent(t, i3)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) UnsafeUtil.getObject(t, offset), getMessageFieldSchema(i3));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 19:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 20:
                    computeDoubleSize = SchemaUtil.computeSizeInt64List(numberAt, listAt(t, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 21:
                    computeDoubleSize = SchemaUtil.computeSizeUInt64List(numberAt, listAt(t, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 22:
                    computeDoubleSize = SchemaUtil.computeSizeInt32List(numberAt, listAt(t, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 24:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 25:
                    computeDoubleSize = SchemaUtil.computeSizeBoolList(numberAt, listAt(t, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 26:
                    computeDoubleSize = SchemaUtil.computeSizeStringList(numberAt, listAt(t, offset));
                    i2 += computeDoubleSize;
                    break;
                case 27:
                    computeDoubleSize = SchemaUtil.computeSizeMessageList(numberAt, listAt(t, offset), getMessageFieldSchema(i3));
                    i2 += computeDoubleSize;
                    break;
                case 28:
                    computeDoubleSize = SchemaUtil.computeSizeByteStringList(numberAt, listAt(t, offset));
                    i2 += computeDoubleSize;
                    break;
                case 29:
                    computeDoubleSize = SchemaUtil.computeSizeUInt32List(numberAt, listAt(t, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 30:
                    computeDoubleSize = SchemaUtil.computeSizeEnumList(numberAt, listAt(t, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 31:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 32:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    computeDoubleSize = SchemaUtil.computeSizeSInt32List(numberAt, listAt(t, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 34:
                    computeDoubleSize = SchemaUtil.computeSizeSInt64List(numberAt, listAt(t, offset), false);
                    i2 += computeDoubleSize;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    }
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    }
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    }
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    }
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    }
                case 40:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    }
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    }
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    }
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    }
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    }
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    }
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    }
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    }
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i2 += computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag;
                        break;
                    }
                case 49:
                    computeDoubleSize = SchemaUtil.computeSizeGroupList(numberAt, listAt(t, offset), getMessageFieldSchema(i3));
                    i2 += computeDoubleSize;
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    computeDoubleSize = this.mapFieldSchema.getSerializedSize(numberAt, UnsafeUtil.getObject(t, offset), getMapFieldDefaultEntry(i3));
                    i2 += computeDoubleSize;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t, numberAt, i3)) {
                        Object object2 = UnsafeUtil.getObject(t, offset);
                        if (object2 instanceof ByteString) {
                            computeStringSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2);
                        } else {
                            computeStringSize = CodedOutputStream.computeStringSize(numberAt, (String) object2);
                        }
                        i2 += computeStringSize;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, UnsafeUtil.getObject(t, offset), getMessageFieldSchema(i3));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) UnsafeUtil.getObject(t, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t, offset));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) UnsafeUtil.getObject(t, offset), getMessageFieldSchema(i3));
                        i2 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i2 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t));
    }

    private static <T> int intAt(T t, long j) {
        return UnsafeUtil.getInt(t, j);
    }

    private static boolean isEnforceUtf8(int i) {
        if ((i & ENFORCE_UTF8_MASK) != 0) {
            return true;
        }
        return false;
    }

    private boolean isFieldPresent(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return isFieldPresent(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i, int i2) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!messageFieldSchema.isInitialized(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.crypto.tink.shaded.protobuf.Schema] */
    private boolean isMapInitialized(T t, int i, int i2) {
        Map<?, ?> forMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t, offset(i)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        Schema<T> schema = 0;
        for (Object obj : forMapData.values()) {
            if (schema == null) {
                schema = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            boolean isInitialized = schema.isInitialized(obj);
            schema = schema;
            if (!isInitialized) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t, T t2, int i) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        if (UnsafeUtil.getInt(t, presenceMaskAndOffsetAt) == UnsafeUtil.getInt(t2, presenceMaskAndOffsetAt)) {
            return true;
        }
        return false;
    }

    private boolean isOneofPresent(T t, int i, int i2) {
        if (UnsafeUtil.getInt(t, presenceMaskAndOffsetAt(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean isRequired(int i) {
        if ((i & REQUIRED_MASK) != 0) {
            return true;
        }
        return false;
    }

    private static List<?> listAt(Object obj, long j) {
        return (List) UnsafeUtil.getObject(obj, j);
    }

    private static <T> long longAt(T t, long j) {
        return UnsafeUtil.getLong(t, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0649 A[Catch: all -> 0x06a1, TRY_LEAVE, TryCatch #2 {all -> 0x06a1, blocks: (B:158:0x061a, B:169:0x0643, B:171:0x0649, B:181:0x0671, B:182:0x0676), top: B:212:0x061a }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06b3 A[LOOP:2: B:201:0x06af->B:203:0x06b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06c8  */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema] */
    /* JADX WARN: Type inference failed for: r14v62 */
    /* JADX WARN: Type inference failed for: r1v139, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.google.crypto.tink.shaded.protobuf.Reader] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r19, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<ET> r20, T r21, com.google.crypto.tink.shaded.protobuf.Reader r22, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.mergeFromHelper(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema, com.google.crypto.tink.shaded.protobuf.ExtensionSchema, java.lang.Object, com.google.crypto.tink.shaded.protobuf.Reader, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
        long offset = offset(typeAndOffsetAt(i));
        Object object = UnsafeUtil.getObject(obj, offset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, offset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            UnsafeUtil.putObject(obj, offset, newMapField);
            object = newMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t, T t2, int i) {
        if (!isFieldPresent(t2, i)) {
            return;
        }
        long offset = offset(typeAndOffsetAt(i));
        Unsafe unsafe = UNSAFE;
        Object object = unsafe.getObject(t2, offset);
        if (object != null) {
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isFieldPresent(t, i)) {
                if (!isMutable(object)) {
                    unsafe.putObject(t, offset, object);
                } else {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(t, offset, newInstance);
                }
                setFieldPresent(t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(t, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t, T t2, int i) {
        int numberAt = numberAt(i);
        if (!isOneofPresent(t2, numberAt, i)) {
            return;
        }
        long offset = offset(typeAndOffsetAt(i));
        Unsafe unsafe = UNSAFE;
        Object object = unsafe.getObject(t2, offset);
        if (object != null) {
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isOneofPresent(t, numberAt, i)) {
                if (!isMutable(object)) {
                    unsafe.putObject(t, offset, object);
                } else {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(t, offset, newInstance);
                }
                setOneofPresent(t, numberAt, i);
                return;
            }
            Object object2 = unsafe.getObject(t, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(t, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t2);
    }

    private void mergeSingleField(T t, T t2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(i);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putDouble(t, offset, UnsafeUtil.getDouble(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 1:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putFloat(t, offset, UnsafeUtil.getFloat(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 2:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 3:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 4:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 5:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 6:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 7:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putBoolean(t, offset, UnsafeUtil.getBoolean(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 8:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putObject(t, offset, UnsafeUtil.getObject(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 9:
                mergeMessage(t, t2, i);
                return;
            case 10:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putObject(t, offset, UnsafeUtil.getObject(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 11:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 12:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 13:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 14:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 15:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 16:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    return;
                }
                return;
            case 17:
                mergeMessage(t, t2, i);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t, t2, offset);
                return;
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                SchemaUtil.mergeMap(this.mapFieldSchema, t, t2, offset);
                return;
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t2, numberAt, i)) {
                    UnsafeUtil.putObject(t, offset, UnsafeUtil.getObject(t2, offset));
                    setOneofPresent(t, numberAt, i);
                    return;
                }
                return;
            case 60:
                mergeOneofMessage(t, t2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t2, numberAt, i)) {
                    UnsafeUtil.putObject(t, offset, UnsafeUtil.getObject(t2, offset));
                    setOneofPresent(t, numberAt, i);
                    return;
                }
                return;
            case 68:
                mergeOneofMessage(t, t2, i);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t, int i) {
        Schema messageFieldSchema = getMessageFieldSchema(i);
        long offset = offset(typeAndOffsetAt(i));
        if (!isFieldPresent(t, i)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t, offset);
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t, int i, int i2) {
        Schema messageFieldSchema = getMessageFieldSchema(i2);
        if (!isOneofPresent(t, i, i2)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t, offset(typeAndOffsetAt(i2)));
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        return newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        boolean z;
        int fieldNumber;
        int fieldNumber2;
        int[] iArr;
        int i;
        if (structuralMessageInfo.getSyntax() == ProtoSyntax.PROTO3) {
            z = true;
        } else {
            z = false;
        }
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr2 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i2 = 0;
        int i3 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i2++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i3++;
            }
        }
        int[] iArr3 = null;
        if (i2 > 0) {
            iArr = new int[i2];
        } else {
            iArr = null;
        }
        if (i3 > 0) {
            iArr3 = new int[i3];
        }
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < fields.length) {
            FieldInfo fieldInfo2 = fields[i4];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr2, i5, objArr);
            if (i6 < checkInitialized.length && checkInitialized[i6] == fieldNumber3) {
                checkInitialized[i6] = i5;
                i6++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr[i7] = i5;
                i7++;
            } else if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                i = i5;
                iArr3[i8] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                i8++;
                i4++;
                i5 = i + 3;
            }
            i = i5;
            i4++;
            i5 = i + 3;
        }
        if (iArr == null) {
            iArr = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr, 0, iArr4, checkInitialized.length, iArr.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr.length, iArr3.length);
        return new MessageSchema<>(iArr2, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), z, true, iArr4, checkInitialized.length, checkInitialized.length + iArr.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.crypto.tink.shaded.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(com.google.crypto.tink.shaded.protobuf.RawMessageInfo r29, com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r30, com.google.crypto.tink.shaded.protobuf.ListFieldSchema r31, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r32, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r33, com.google.crypto.tink.shaded.protobuf.MapFieldSchema r34) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.newSchemaForRawMessageInfo(com.google.crypto.tink.shaded.protobuf.RawMessageInfo, com.google.crypto.tink.shaded.protobuf.NewInstanceSchema, com.google.crypto.tink.shaded.protobuf.ListFieldSchema, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema, com.google.crypto.tink.shaded.protobuf.ExtensionSchema, com.google.crypto.tink.shaded.protobuf.MapFieldSchema):com.google.crypto.tink.shaded.protobuf.MessageSchema");
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t, long j) {
        return ((Boolean) UnsafeUtil.getObject(t, j)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t, long j) {
        return ((Double) UnsafeUtil.getObject(t, j)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t, long j) {
        return ((Float) UnsafeUtil.getObject(t, j)).floatValue();
    }

    private static <T> int oneofIntAt(T t, long j) {
        return ((Integer) UnsafeUtil.getObject(t, j)).intValue();
    }

    private static <T> long oneofLongAt(T t, long j) {
        return ((Long) UnsafeUtil.getObject(t, j)).longValue();
    }

    private <K, V> int parseMapField(T t, byte[] bArr, int i, int i2, int i3, long j, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i3);
        Object object = unsafe.getObject(t, j);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            unsafe.putObject(t, j, newMapField);
            object = newMapField;
        }
        return decodeMapEntry(bArr, i, i2, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j2 = this.buffer[i8 + 2] & 1048575;
        switch (i7) {
            case ONEOF_TYPE_OFFSET /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i)));
                    int i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i)));
                    int i10 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                    unsafe.putObject(t, j, Long.valueOf(registers.long1));
                    unsafe.putInt(t, j2, i4);
                    return decodeVarint64;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                    unsafe.putObject(t, j, Integer.valueOf(registers.int1));
                    unsafe.putInt(t, j2, i4);
                    return decodeVarint32;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                    unsafe.putObject(t, j, Boolean.valueOf(registers.long1 != 0));
                    unsafe.putInt(t, j2, i4);
                    return decodeVarint642;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int decodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                    int i13 = registers.int1;
                    if (i13 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & ENFORCE_UTF8_MASK) != 0 && !Utf8.isValidUtf8(bArr, decodeVarint322, decodeVarint322 + i13)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, decodeVarint322, i13, Internal.UTF_8));
                        decodeVarint322 += i13;
                    }
                    unsafe.putInt(t, j2, i4);
                    return decodeVarint322;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object mutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t, i4, i8);
                    int mergeMessageField = ArrayDecoders.mergeMessageField(mutableOneofMessageFieldForMerge, getMessageFieldSchema(i8), bArr, i, i2, registers);
                    storeOneofMessageField(t, i4, i8, mutableOneofMessageFieldForMerge);
                    return mergeMessageField;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int decodeBytes = ArrayDecoders.decodeBytes(bArr, i, registers);
                    unsafe.putObject(t, j, registers.object1);
                    unsafe.putInt(t, j2, i4);
                    return decodeBytes;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int decodeVarint323 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                    int i14 = registers.int1;
                    Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i8);
                    if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i14)) {
                        getMutableUnknownFields(t).storeField(i3, Long.valueOf(i14));
                    } else {
                        unsafe.putObject(t, j, Integer.valueOf(i14));
                        unsafe.putInt(t, j2, i4);
                    }
                    return decodeVarint323;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int decodeVarint324 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                    unsafe.putObject(t, j, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                    unsafe.putInt(t, j2, i4);
                    return decodeVarint324;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                    unsafe.putObject(t, j, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                    unsafe.putInt(t, j2, i4);
                    return decodeVarint643;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object mutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t, i4, i8);
                    int mergeGroupField = ArrayDecoders.mergeGroupField(mutableOneofMessageFieldForMerge2, getMessageFieldSchema(i8), bArr, i, i2, (i3 & (-8)) | 4, registers);
                    storeOneofMessageField(t, i4, i8, mutableOneofMessageFieldForMerge2);
                    return mergeGroupField;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02e1, code lost:
        if (r0 != r15) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0304, code lost:
        if (r0 != r15) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0307, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x029c, code lost:
        if (r0 != r10) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x029e, code lost:
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r1 = r18;
        r2 = r19;
        r7 = r22;
        r6 = r26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @com.google.crypto.tink.shaded.protobuf.CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int parseProto3Message(T r30, byte[] r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.parseProto3Message(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.ArrayDecoders$Registers):int");
    }

    private int parseRepeatedField(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, ArrayDecoders.Registers registers) throws IOException {
        int decodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(t, j2);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            protobufList = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, protobufList);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i, protobufList, registers);
                }
                if (i5 == 1) {
                    return ArrayDecoders.decodeDoubleList(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i, protobufList, registers);
                }
                if (i5 == 5) {
                    return ArrayDecoders.decodeFloatList(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeVarint64List(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeVarint32List(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i, protobufList, registers);
                }
                if (i5 == 1) {
                    return ArrayDecoders.decodeFixed64List(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i, protobufList, registers);
                }
                if (i5 == 5) {
                    return ArrayDecoders.decodeFixed32List(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeBoolList(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        return ArrayDecoders.decodeStringList(i3, bArr, i, i2, protobufList, registers);
                    }
                    return ArrayDecoders.decodeStringListRequireUtf8(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 27:
                if (i5 == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 28:
                if (i5 == 2) {
                    return ArrayDecoders.decodeBytesList(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    decodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i, protobufList, registers);
                } else if (i5 == 0) {
                    decodeVarint32List = ArrayDecoders.decodeVarint32List(i3, bArr, i, i2, protobufList, registers);
                }
                SchemaUtil.filterUnknownEnumList((Object) t, i4, (List<Integer>) protobufList, getEnumFieldVerifier(i6), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return decodeVarint32List;
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
            case 47:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeSInt32List(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeSInt64List(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 49:
                if (i5 == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufList, registers);
                }
                break;
        }
        return i;
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private <E> void readGroupList(Object obj, long j, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i, Reader reader) throws IOException {
        if (isEnforceUtf8(i)) {
            UnsafeUtil.putObject(obj, offset(i), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i, Reader reader) throws IOException {
        if (isEnforceUtf8(i)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder c = q.c("Field ", str, " for ");
            i.d(cls, c, " not found. Known fields are ");
            c.append(Arrays.toString(declaredFields));
            throw new RuntimeException(c.toString());
        }
    }

    private void setFieldPresent(T t, int i) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & presenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t, j, (1 << (presenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t, j));
    }

    private void setOneofPresent(T t, int i, int i2) {
        UnsafeUtil.putInt(t, presenceMaskAndOffsetAt(i2) & 1048575, i);
    }

    private int slowPositionForFieldNumber(int i, int i2) {
        int length = (this.buffer.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int numberAt = numberAt(i4);
            if (i == numberAt) {
                return i4;
            }
            if (i < numberAt) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void storeFieldData(com.google.crypto.tink.shaded.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            com.google.crypto.tink.shaded.protobuf.OneofInfo r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L23
            com.google.crypto.tink.shaded.protobuf.FieldType r2 = r8.getType()
            int r2 = r2.id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r0)
            goto L69
        L23:
            com.google.crypto.tink.shaded.protobuf.FieldType r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r2)
            int r3 = (int) r2
            int r2 = r0.id()
            boolean r4 = r0.isList()
            if (r4 != 0) goto L58
            boolean r0 = r0.isMap()
            if (r0 != 0) goto L58
            java.lang.reflect.Field r0 = r8.getPresenceField()
            if (r0 != 0) goto L4a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L4f
        L4a:
            long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r0)
            int r0 = (int) r4
        L4f:
            int r4 = r8.getPresenceMask()
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            goto L6b
        L58:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            if (r0 != 0) goto L61
            r0 = r1
            r4 = r0
            goto L6b
        L61:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r0)
        L69:
            int r0 = (int) r4
            r4 = r1
        L6b:
            int r5 = r8.getFieldNumber()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.isEnforceUtf8()
            if (r6 == 0) goto L7c
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7d
        L7c:
            r6 = r1
        L7d:
            boolean r7 = r8.isRequired()
            if (r7 == 0) goto L85
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L85:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r3
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r4 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.getMessageFieldClass()
            java.lang.Object r0 = r8.getMapDefaultEntry()
            if (r0 == 0) goto Lbd
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r0 = r8.getMapDefaultEntry()
            r11[r10] = r0
            if (r9 == 0) goto Lae
            int r10 = r10 + 1
            r11[r10] = r9
            goto Ldc
        Lae:
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldc
            int r10 = r10 + 1
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
            goto Ldc
        Lbd:
            if (r9 == 0) goto Lc9
            r8 = 3
            r0 = 2
            r1 = 1
            int r8 = com.amazon.aps.iva.e4.t0.c(r10, r8, r0, r1)
            r11[r8] = r9
            goto Ldc
        Lc9:
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldc
            r9 = 3
            r0 = 2
            r1 = 1
            int r9 = com.amazon.aps.iva.e4.t0.c(r10, r9, r0, r1)
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r9] = r8
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.storeFieldData(com.google.crypto.tink.shaded.protobuf.FieldInfo, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(T t, int i, Object obj) {
        UNSAFE.putObject(t, offset(typeAndOffsetAt(i)), obj);
        setFieldPresent(t, i);
    }

    private void storeOneofMessageField(T t, int i, int i2, Object obj) {
        UNSAFE.putObject(t, offset(typeAndOffsetAt(i2)), obj);
        setOneofPresent(t, i, i2);
    }

    private static int type(int i) {
        return (i & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x048f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInAscendingOrderProto2(T r18, com.google.crypto.tink.shaded.protobuf.Writer r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.writeFieldsInAscendingOrderProto2(java.lang.Object, com.google.crypto.tink.shaded.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInAscendingOrderProto3(T r13, com.google.crypto.tink.shaded.protobuf.Writer r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.writeFieldsInAscendingOrderProto3(java.lang.Object, com.google.crypto.tink.shaded.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInDescendingOrder(T r11, com.google.crypto.tink.shaded.protobuf.Writer r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.writeFieldsInDescendingOrder(java.lang.Object, com.google.crypto.tink.shaded.protobuf.Writer):void");
    }

    private <K, V> void writeMapHelper(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            writer.writeMap(i, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i, (String) obj);
        } else {
            writer.writeBytes(i, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, Writer writer) throws IOException {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t), writer);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public boolean equals(T t, T t2) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(t, t2, i)) {
                return false;
            }
        }
        if (this.unknownFieldSchema.getFromMessage(t).equals(this.unknownFieldSchema.getFromMessage(t2))) {
            if (this.hasExtensions) {
                return this.extensionSchema.getExtensions(t).equals(this.extensionSchema.getExtensions(t2));
            }
            return true;
        }
        return false;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public int getSerializedSize(T t) {
        if (this.proto3) {
            return getSerializedSizeProto3(t);
        }
        return getSerializedSizeProto2(t);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public int hashCode(T t) {
        int i;
        int hashLong;
        int i2;
        int i3;
        int length = this.buffer.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i5);
            int numberAt = numberAt(i5);
            long offset = offset(typeAndOffsetAt);
            int i6 = 37;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t, offset)));
                    i4 = hashLong + i;
                    break;
                case 1:
                    i = i4 * 53;
                    hashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t, offset));
                    i4 = hashLong + i;
                    break;
                case 2:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    i4 = hashLong + i;
                    break;
                case 3:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    i4 = hashLong + i;
                    break;
                case 4:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 5:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    i4 = hashLong + i;
                    break;
                case 6:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 7:
                    i = i4 * 53;
                    hashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t, offset));
                    i4 = hashLong + i;
                    break;
                case 8:
                    i = i4 * 53;
                    hashLong = ((String) UnsafeUtil.getObject(t, offset)).hashCode();
                    i4 = hashLong + i;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t, offset);
                    if (object != null) {
                        i6 = object.hashCode();
                    }
                    i4 = (i4 * 53) + i6;
                    break;
                case 10:
                    i = i4 * 53;
                    hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                    i4 = hashLong + i;
                    break;
                case 11:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 12:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 13:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 14:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    i4 = hashLong + i;
                    break;
                case 15:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 16:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    i4 = hashLong + i;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t, offset);
                    if (object2 != null) {
                        i6 = object2.hashCode();
                    }
                    i4 = (i4 * 53) + i6;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i4 * 53;
                    hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                    i4 = hashLong + i;
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    i = i4 * 53;
                    hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                    i4 = hashLong + i;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t, offset)));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Float.floatToIntBits(oneofFloatAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashBoolean(oneofBooleanAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = ((String) UnsafeUtil.getObject(t, offset)).hashCode();
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.unknownFieldSchema.getFromMessage(t).hashCode() + (i4 * 53);
        if (this.hasExtensions) {
            return (hashCode * 53) + this.extensionSchema.getExtensions(t).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final boolean isInitialized(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.checkInitializedCount) {
            int i6 = this.intArray[i5];
            int numberAt = numberAt(i6);
            int typeAndOffsetAt = typeAndOffsetAt(i6);
            int i7 = this.buffer[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = UNSAFE.getInt(t, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if (isRequired(typeAndOffsetAt) && !isFieldPresent(t, i6, i, i2, i9)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type != 9 && type != 17) {
                if (type != 27) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(t, numberAt, i6) && !isInitialized(t, typeAndOffsetAt, getMessageFieldSchema(i6))) {
                            return false;
                        }
                    } else if (type != 49) {
                        if (type == 50 && !isMapInitialized(t, typeAndOffsetAt, i6)) {
                            return false;
                        }
                    }
                }
                if (!isListInitialized(t, typeAndOffsetAt, i6)) {
                    return false;
                }
            } else if (isFieldPresent(t, i6, i, i2, i9) && !isInitialized(t, typeAndOffsetAt, getMessageFieldSchema(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t).isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void makeImmutable(T t) {
        if (!isMutable(t)) {
            return;
        }
        if (t instanceof GeneratedMessageLite) {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
            generatedMessageLite.clearMemoizedSerializedSize();
            generatedMessageLite.clearMemoizedHashCode();
            generatedMessageLite.markImmutable();
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i);
            long offset = offset(typeAndOffsetAt);
            int type = type(typeAndOffsetAt);
            if (type != 9) {
                switch (type) {
                    case 17:
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case ConnectionResult.API_DISABLED /* 23 */:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.listFieldSchema.makeImmutableListAt(t, offset);
                        continue;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        Unsafe unsafe = UNSAFE;
                        Object object = unsafe.getObject(t, offset);
                        if (object != null) {
                            unsafe.putObject(t, offset, this.mapFieldSchema.toImmutable(object));
                        } else {
                            continue;
                        }
                    default:
                }
            }
            if (isFieldPresent(t, i)) {
                getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(t, offset));
            }
        }
        this.unknownFieldSchema.makeImmutable(t);
        if (this.hasExtensions) {
            this.extensionSchema.makeImmutable(t);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T t, T t2) {
        checkMutable(t);
        t2.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(t, t2, i);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t, t2);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t, t2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    @CanIgnoreReturnValue
    public int parseProto2Message(T t, byte[] bArr, int i, int i2, int i3, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe;
        int i4;
        MessageSchema<T> messageSchema;
        int i5;
        int i6;
        int i7;
        int i8;
        T t2;
        byte b;
        int positionForFieldNumber;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        byte[] bArr2;
        int decodeVarint64;
        boolean z;
        int i19;
        int i20;
        int i21;
        MessageSchema<T> messageSchema2 = this;
        T t3 = t;
        byte[] bArr3 = bArr;
        int i22 = i2;
        int i23 = i3;
        ArrayDecoders.Registers registers2 = registers;
        checkMutable(t);
        Unsafe unsafe2 = UNSAFE;
        int i24 = i;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = -1;
        int i29 = 1048575;
        while (true) {
            if (i24 < i22) {
                int i30 = i24 + 1;
                byte b2 = bArr3[i24];
                if (b2 < 0) {
                    int decodeVarint32 = ArrayDecoders.decodeVarint32(b2, bArr3, i30, registers2);
                    b = registers2.int1;
                    i30 = decodeVarint32;
                } else {
                    b = b2;
                }
                int i31 = b >>> 3;
                int i32 = b & 7;
                if (i31 > i28) {
                    positionForFieldNumber = messageSchema2.positionForFieldNumber(i31, i25 / 3);
                } else {
                    positionForFieldNumber = messageSchema2.positionForFieldNumber(i31);
                }
                int i33 = positionForFieldNumber;
                if (i33 == -1) {
                    i9 = i31;
                    i10 = i30;
                    i6 = b;
                    i11 = i27;
                    i12 = i29;
                    unsafe = unsafe2;
                    i4 = i23;
                    i13 = 0;
                } else {
                    int i34 = messageSchema2.buffer[i33 + 1];
                    int type = type(i34);
                    long offset = offset(i34);
                    int i35 = b;
                    if (type <= 17) {
                        int i36 = messageSchema2.buffer[i33 + 2];
                        int i37 = 1 << (i36 >>> 20);
                        int i38 = i36 & 1048575;
                        if (i38 != i29) {
                            if (i29 != 1048575) {
                                unsafe2.putInt(t3, i29, i27);
                            }
                            i15 = i38;
                            i14 = unsafe2.getInt(t3, i38);
                        } else {
                            i14 = i27;
                            i15 = i29;
                        }
                        switch (type) {
                            case 0:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 1) {
                                    UnsafeUtil.putDouble(t3, offset, ArrayDecoders.decodeDouble(bArr2, i30));
                                    i24 = i30 + 8;
                                    i27 = i14 | i37;
                                    i23 = i3;
                                    i25 = i18;
                                    i26 = i17;
                                    i28 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 5) {
                                    UnsafeUtil.putFloat(t3, offset, ArrayDecoders.decodeFloat(bArr2, i30));
                                    i24 = i30 + 4;
                                    i27 = i14 | i37;
                                    i23 = i3;
                                    i25 = i18;
                                    i26 = i17;
                                    i28 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 0) {
                                    decodeVarint64 = ArrayDecoders.decodeVarint64(bArr2, i30, registers2);
                                    unsafe2.putLong(t, offset, registers2.long1);
                                    i27 = i14 | i37;
                                    i23 = i3;
                                    i25 = i18;
                                    i24 = decodeVarint64;
                                    i26 = i17;
                                    i28 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 0) {
                                    i24 = ArrayDecoders.decodeVarint32(bArr2, i30, registers2);
                                    unsafe2.putInt(t3, offset, registers2.int1);
                                    i27 = i14 | i37;
                                    i23 = i3;
                                    i25 = i18;
                                    i26 = i17;
                                    i28 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 1) {
                                    unsafe2.putLong(t, offset, ArrayDecoders.decodeFixed64(bArr2, i30));
                                    i24 = i30 + 8;
                                    i27 = i14 | i37;
                                    i23 = i3;
                                    i25 = i18;
                                    i26 = i17;
                                    i28 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 5) {
                                    unsafe2.putInt(t3, offset, ArrayDecoders.decodeFixed32(bArr2, i30));
                                    i24 = i30 + 4;
                                    i27 = i14 | i37;
                                    i23 = i3;
                                    i25 = i18;
                                    i26 = i17;
                                    i28 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 0) {
                                    i24 = ArrayDecoders.decodeVarint64(bArr2, i30, registers2);
                                    if (registers2.long1 != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    UnsafeUtil.putBoolean(t3, offset, z);
                                    i27 = i14 | i37;
                                    i23 = i3;
                                    i25 = i18;
                                    i26 = i17;
                                    i28 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 2) {
                                    if ((ENFORCE_UTF8_MASK & i34) == 0) {
                                        i24 = ArrayDecoders.decodeString(bArr2, i30, registers2);
                                    } else {
                                        i24 = ArrayDecoders.decodeStringRequireUtf8(bArr2, i30, registers2);
                                    }
                                    unsafe2.putObject(t3, offset, registers2.object1);
                                    i27 = i14 | i37;
                                    i23 = i3;
                                    i25 = i18;
                                    i26 = i17;
                                    i28 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 9:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 2) {
                                    Object mutableMessageFieldForMerge = messageSchema2.mutableMessageFieldForMerge(t3, i18);
                                    i24 = ArrayDecoders.mergeMessageField(mutableMessageFieldForMerge, messageSchema2.getMessageFieldSchema(i18), bArr, i30, i2, registers);
                                    messageSchema2.storeMessageField(t3, i18, mutableMessageFieldForMerge);
                                    i27 = i14 | i37;
                                    i23 = i3;
                                    i25 = i18;
                                    i26 = i17;
                                    i28 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 10:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 2) {
                                    i24 = ArrayDecoders.decodeBytes(bArr2, i30, registers2);
                                    unsafe2.putObject(t3, offset, registers2.object1);
                                    i27 = i14 | i37;
                                    i23 = i3;
                                    i25 = i18;
                                    i26 = i17;
                                    i28 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 12:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 0) {
                                    i24 = ArrayDecoders.decodeVarint32(bArr2, i30, registers2);
                                    int i39 = registers2.int1;
                                    Internal.EnumVerifier enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i18);
                                    if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i39)) {
                                        getMutableUnknownFields(t).storeField(i17, Long.valueOf(i39));
                                        i25 = i18;
                                        i27 = i14;
                                        i26 = i17;
                                        i28 = i9;
                                        i29 = i16;
                                        i23 = i3;
                                        bArr3 = bArr2;
                                    } else {
                                        unsafe2.putInt(t3, offset, i39);
                                        i27 = i14 | i37;
                                        i23 = i3;
                                        i25 = i18;
                                        i26 = i17;
                                        i28 = i9;
                                        i29 = i16;
                                        bArr3 = bArr2;
                                        break;
                                    }
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                if (i32 == 0) {
                                    i24 = ArrayDecoders.decodeVarint32(bArr2, i30, registers2);
                                    unsafe2.putInt(t3, offset, CodedInputStream.decodeZigZag32(registers2.int1));
                                    i27 = i14 | i37;
                                    i23 = i3;
                                    i25 = i18;
                                    i26 = i17;
                                    i28 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 16:
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                bArr2 = bArr;
                                if (i32 == 0) {
                                    decodeVarint64 = ArrayDecoders.decodeVarint64(bArr2, i30, registers2);
                                    unsafe2.putLong(t, offset, CodedInputStream.decodeZigZag64(registers2.long1));
                                    i27 = i14 | i37;
                                    i23 = i3;
                                    i25 = i18;
                                    i24 = decodeVarint64;
                                    i26 = i17;
                                    i28 = i9;
                                    i29 = i16;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            case 17:
                                if (i32 == 3) {
                                    Object mutableMessageFieldForMerge2 = messageSchema2.mutableMessageFieldForMerge(t3, i33);
                                    i24 = ArrayDecoders.mergeGroupField(mutableMessageFieldForMerge2, messageSchema2.getMessageFieldSchema(i33), bArr, i30, i2, (i31 << 3) | 4, registers);
                                    messageSchema2.storeMessageField(t3, i33, mutableMessageFieldForMerge2);
                                    i27 = i14 | i37;
                                    i29 = i15;
                                    i23 = i3;
                                    i25 = i33;
                                    i26 = i35;
                                    i28 = i31;
                                    bArr3 = bArr;
                                    break;
                                } else {
                                    i9 = i31;
                                    i16 = i15;
                                    i17 = i35;
                                    i18 = i33;
                                    i12 = i16;
                                    i4 = i3;
                                    i10 = i30;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i6 = i17;
                                    break;
                                }
                            default:
                                i9 = i31;
                                i18 = i33;
                                i16 = i15;
                                i17 = i35;
                                i12 = i16;
                                i4 = i3;
                                i10 = i30;
                                i13 = i18;
                                unsafe = unsafe2;
                                i11 = i14;
                                i6 = i17;
                                break;
                        }
                    } else {
                        i9 = i31;
                        i12 = i29;
                        i11 = i27;
                        if (type == 27) {
                            if (i32 == 2) {
                                Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe2.getObject(t3, offset);
                                if (!protobufList.isModifiable()) {
                                    int size = protobufList.size();
                                    if (size == 0) {
                                        i21 = 10;
                                    } else {
                                        i21 = size * 2;
                                    }
                                    protobufList = protobufList.mutableCopyWithCapacity(i21);
                                    unsafe2.putObject(t3, offset, protobufList);
                                }
                                i24 = ArrayDecoders.decodeMessageList(messageSchema2.getMessageFieldSchema(i33), i35, bArr, i30, i2, protobufList, registers);
                                i25 = i33;
                                i26 = i35;
                                i29 = i12;
                                i27 = i11;
                                i28 = i9;
                                bArr3 = bArr;
                                i23 = i3;
                            } else {
                                i19 = i30;
                                unsafe = unsafe2;
                                i13 = i33;
                                i20 = i35;
                                i4 = i3;
                                i10 = i19;
                            }
                        } else if (type <= 49) {
                            int i40 = i30;
                            unsafe = unsafe2;
                            i13 = i33;
                            i20 = i35;
                            i24 = parseRepeatedField(t, bArr, i30, i2, i35, i9, i32, i33, i34, type, offset, registers);
                            if (i24 != i40) {
                                messageSchema2 = this;
                                t3 = t;
                                bArr3 = bArr;
                                i22 = i2;
                                i23 = i3;
                                registers2 = registers;
                                i29 = i12;
                                i27 = i11;
                                i25 = i13;
                                i26 = i20;
                                i28 = i9;
                                unsafe2 = unsafe;
                            } else {
                                i4 = i3;
                                i10 = i24;
                            }
                        } else {
                            i19 = i30;
                            unsafe = unsafe2;
                            i13 = i33;
                            i20 = i35;
                            if (type == 50) {
                                if (i32 == 2) {
                                    i24 = parseMapField(t, bArr, i19, i2, i13, offset, registers);
                                    if (i24 != i19) {
                                        messageSchema2 = this;
                                        t3 = t;
                                        bArr3 = bArr;
                                        i22 = i2;
                                        i23 = i3;
                                        registers2 = registers;
                                        i29 = i12;
                                        i27 = i11;
                                        i25 = i13;
                                        i26 = i20;
                                        i28 = i9;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i10 = i24;
                                    }
                                } else {
                                    i4 = i3;
                                    i10 = i19;
                                }
                            } else {
                                i24 = parseOneofField(t, bArr, i19, i2, i20, i9, i32, i34, type, offset, i13, registers);
                                if (i24 != i19) {
                                    messageSchema2 = this;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i22 = i2;
                                    i23 = i3;
                                    registers2 = registers;
                                    i29 = i12;
                                    i27 = i11;
                                    i25 = i13;
                                    i26 = i20;
                                    i28 = i9;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i10 = i24;
                                }
                            }
                        }
                        i6 = i20;
                    }
                }
                if (i6 == i4 && i4 != 0) {
                    i8 = 1048575;
                    messageSchema = this;
                    i5 = i10;
                    i7 = i12;
                    i27 = i11;
                } else {
                    if (this.hasExtensions && registers.extensionRegistry != ExtensionRegistryLite.getEmptyRegistry()) {
                        i24 = ArrayDecoders.decodeExtensionOrUnknownField(i6, bArr, i10, i2, t, this.defaultInstance, this.unknownFieldSchema, registers);
                    } else {
                        i24 = ArrayDecoders.decodeUnknownField(i6, bArr, i10, i2, getMutableUnknownFields(t), registers);
                    }
                    t3 = t;
                    bArr3 = bArr;
                    i22 = i2;
                    i26 = i6;
                    messageSchema2 = this;
                    registers2 = registers;
                    i29 = i12;
                    i27 = i11;
                    i25 = i13;
                    i28 = i9;
                    unsafe2 = unsafe;
                    i23 = i4;
                }
            } else {
                int i41 = i29;
                unsafe = unsafe2;
                i4 = i23;
                messageSchema = messageSchema2;
                i5 = i24;
                i6 = i26;
                i7 = i41;
                i8 = 1048575;
            }
        }
        if (i7 != i8) {
            t2 = t;
            unsafe.putInt(t2, i7, i27);
        } else {
            t2 = t;
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i42 = messageSchema.checkInitializedCount; i42 < messageSchema.repeatedFieldOffsetStart; i42++) {
            unknownFieldSetLite = (UnknownFieldSetLite) filterMapUnknownEnumValues(t, messageSchema.intArray[i42], unknownFieldSetLite, messageSchema.unknownFieldSchema, t);
        }
        if (unknownFieldSetLite != null) {
            messageSchema.unknownFieldSchema.setBuilderToMessage(t2, unknownFieldSetLite);
        }
        if (i4 == 0) {
            if (i5 != i2) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i5 > i2 || i6 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i5;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void writeTo(T t, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t, writer);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(t, writer);
        } else {
            writeFieldsInAscendingOrderProto2(t, writer);
        }
    }

    private boolean isFieldPresent(T t, int i) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & presenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (UnsafeUtil.getInt(t, j) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t, offset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t, offset)) != 0;
            case 2:
                return UnsafeUtil.getLong(t, offset) != 0;
            case 3:
                return UnsafeUtil.getLong(t, offset) != 0;
            case 4:
                return UnsafeUtil.getInt(t, offset) != 0;
            case 5:
                return UnsafeUtil.getLong(t, offset) != 0;
            case 6:
                return UnsafeUtil.getInt(t, offset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t, offset);
            case 8:
                Object object = UnsafeUtil.getObject(t, offset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.getObject(t, offset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.getObject(t, offset));
            case 11:
                return UnsafeUtil.getInt(t, offset) != 0;
            case 12:
                return UnsafeUtil.getInt(t, offset) != 0;
            case 13:
                return UnsafeUtil.getInt(t, offset) != 0;
            case 14:
                return UnsafeUtil.getLong(t, offset) != 0;
            case 15:
                return UnsafeUtil.getInt(t, offset) != 0;
            case 16:
                return UnsafeUtil.getLong(t, offset) != 0;
            case 17:
                return UnsafeUtil.getObject(t, offset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i, int i2) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        extensionRegistryLite.getClass();
        checkMutable(t);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t, reader, extensionRegistryLite);
    }

    private boolean equals(T t, T t2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t, t2, i) && Double.doubleToLongBits(UnsafeUtil.getDouble(t, offset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(t2, offset));
            case 1:
                return arePresentForEquals(t, t2, i) && Float.floatToIntBits(UnsafeUtil.getFloat(t, offset)) == Float.floatToIntBits(UnsafeUtil.getFloat(t2, offset));
            case 2:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getLong(t, offset) == UnsafeUtil.getLong(t2, offset);
            case 3:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getLong(t, offset) == UnsafeUtil.getLong(t2, offset);
            case 4:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getInt(t, offset) == UnsafeUtil.getInt(t2, offset);
            case 5:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getLong(t, offset) == UnsafeUtil.getLong(t2, offset);
            case 6:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getInt(t, offset) == UnsafeUtil.getInt(t2, offset);
            case 7:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getBoolean(t, offset) == UnsafeUtil.getBoolean(t2, offset);
            case 8:
                return arePresentForEquals(t, t2, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset));
            case 9:
                return arePresentForEquals(t, t2, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset));
            case 10:
                return arePresentForEquals(t, t2, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset));
            case 11:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getInt(t, offset) == UnsafeUtil.getInt(t2, offset);
            case 12:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getInt(t, offset) == UnsafeUtil.getInt(t2, offset);
            case 13:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getInt(t, offset) == UnsafeUtil.getInt(t2, offset);
            case 14:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getLong(t, offset) == UnsafeUtil.getLong(t2, offset);
            case 15:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getInt(t, offset) == UnsafeUtil.getInt(t2, offset);
            case 16:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.getLong(t, offset) == UnsafeUtil.getLong(t2, offset);
            case 17:
                return arePresentForEquals(t, t2, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset));
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset));
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(t, t2, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset));
            default:
                return true;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T t, byte[] bArr, int i, int i2, ArrayDecoders.Registers registers) throws IOException {
        if (this.proto3) {
            parseProto3Message(t, bArr, i, i2, registers);
        } else {
            parseProto2Message(t, bArr, i, i2, 0, registers);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i)));
    }
}
