package com.worldturner.medeia.parser;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.o;
import com.amazon.aps.iva.oe0.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.schema.validation.HashResult;
import com.worldturner.medeia.schema.validation.NodeHasher;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import kotlin.Metadata;
/* compiled from: JsonTokenData.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B=\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b0\u00101J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0006\u0010\u0012\u001a\u00020\u0003J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u0004\u0018\u00010\rR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0013\u0010/\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/worldturner/medeia/parser/JsonTokenData;", "Lcom/worldturner/medeia/schema/validation/NodeHasher;", "Lcom/worldturner/medeia/schema/validation/HashResult;", "", "toBoolean", "hasLongValue", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "toDecimal", "Ljava/security/MessageDigest;", "digester", "Lcom/amazon/aps/iva/kb0/q;", "digest", "", "other", "equals", "", "hashCode", "isInteger", "", "toString", "toValue", "decimal", "Ljava/math/BigDecimal;", "getDecimal", "()Ljava/math/BigDecimal;", "Lcom/worldturner/medeia/parser/JsonTokenType;", "type", "Lcom/worldturner/medeia/parser/JsonTokenType;", "getType", "()Lcom/worldturner/medeia/parser/JsonTokenType;", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "", "longValue", "J", "getLongValue", "()J", "Ljava/math/BigInteger;", "integer", "Ljava/math/BigInteger;", "getInteger", "()Ljava/math/BigInteger;", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Lcom/worldturner/medeia/parser/JsonTokenType;Ljava/lang/String;JLjava/math/BigInteger;Ljava/math/BigDecimal;)V", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class JsonTokenData implements NodeHasher, HashResult {
    private static final JsonTokenData[] array;
    private final BigDecimal decimal;
    private final BigInteger integer;
    private final long longValue;
    private final String text;
    private final JsonTokenType type;
    public static final Companion Companion = new Companion(null);
    private static final int minLongValue = minLongValue;
    private static final int minLongValue = minLongValue;
    private static final int maxLongValue = 127;

    /* compiled from: JsonTokenData.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/worldturner/medeia/parser/JsonTokenData$Companion;", "", "()V", "array", "", "Lcom/worldturner/medeia/parser/JsonTokenData;", "getArray", "()[Lcom/worldturner/medeia/parser/JsonTokenData;", "[Lcom/worldturner/medeia/parser/JsonTokenData;", "maxLongValue", "", "getMaxLongValue", "()I", "minLongValue", "getMinLongValue", "createNumber", "longValue", "", "createText", "text", "", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final JsonTokenData createNumber(long j) {
            if (j >= getMinLongValue() && j <= getMaxLongValue()) {
                return getArray()[((int) j) - getMinLongValue()];
            }
            if (j == Long.MIN_VALUE) {
                return new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, BigInteger.valueOf(j), null, 22, null);
            }
            return new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, j, null, null, 26, null);
        }

        public final JsonTokenData createText(String str) {
            boolean z;
            j.g(str, "text");
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return JsonTokenDataKt.getTOKEN_EMPTY_STRING();
            }
            return new JsonTokenData(JsonTokenType.VALUE_TEXT, str, 0L, null, null, 28, null);
        }

        public final JsonTokenData[] getArray() {
            return JsonTokenData.array;
        }

        public final int getMaxLongValue() {
            return JsonTokenData.maxLongValue;
        }

        public final int getMinLongValue() {
            return JsonTokenData.minLongValue;
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[JsonTokenType.values().length];
            $EnumSwitchMapping$0 = iArr;
            JsonTokenType jsonTokenType = JsonTokenType.VALUE_BOOLEAN_TRUE;
            iArr[jsonTokenType.ordinal()] = 1;
            JsonTokenType jsonTokenType2 = JsonTokenType.VALUE_BOOLEAN_FALSE;
            iArr[jsonTokenType2.ordinal()] = 2;
            int[] iArr2 = new int[JsonTokenType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            JsonTokenType jsonTokenType3 = JsonTokenType.VALUE_TEXT;
            iArr2[jsonTokenType3.ordinal()] = 1;
            JsonTokenType jsonTokenType4 = JsonTokenType.VALUE_NUMBER;
            iArr2[jsonTokenType4.ordinal()] = 2;
            int[] iArr3 = new int[JsonTokenType.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[JsonTokenType.START_ARRAY.ordinal()] = 1;
            iArr3[JsonTokenType.END_ARRAY.ordinal()] = 2;
            iArr3[jsonTokenType4.ordinal()] = 3;
            iArr3[JsonTokenType.START_OBJECT.ordinal()] = 4;
            iArr3[JsonTokenType.END_OBJECT.ordinal()] = 5;
            iArr3[jsonTokenType3.ordinal()] = 6;
            JsonTokenType jsonTokenType5 = JsonTokenType.VALUE_NULL;
            iArr3[jsonTokenType5.ordinal()] = 7;
            iArr3[jsonTokenType.ordinal()] = 8;
            iArr3[jsonTokenType2.ordinal()] = 9;
            int[] iArr4 = new int[JsonTokenType.values().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[jsonTokenType4.ordinal()] = 1;
            iArr4[jsonTokenType3.ordinal()] = 2;
            iArr4[jsonTokenType5.ordinal()] = 3;
            iArr4[jsonTokenType.ordinal()] = 4;
            iArr4[jsonTokenType2.ordinal()] = 5;
        }
    }

    static {
        int i = 127 - minLongValue;
        JsonTokenData[] jsonTokenDataArr = new JsonTokenData[i];
        for (int i2 = 0; i2 < i; i2++) {
            jsonTokenDataArr[i2] = new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, minLongValue + i2, null, null, 26, null);
        }
        array = jsonTokenDataArr;
    }

    public JsonTokenData(JsonTokenType jsonTokenType, String str, long j, BigInteger bigInteger, BigDecimal bigDecimal) {
        j.g(jsonTokenType, "type");
        this.type = jsonTokenType;
        this.text = str;
        this.longValue = j;
        this.integer = bigInteger;
        this.decimal = bigDecimal != null ? bigDecimal.stripTrailingZeros() : null;
    }

    @Override // com.worldturner.medeia.schema.validation.NodeHasher
    public void digest(MessageDigest messageDigest) {
        j.g(messageDigest, "digester");
        messageDigest.update((byte) 1);
        messageDigest.update((byte) this.type.ordinal());
        if (hasLongValue()) {
            long j = this.longValue;
            messageDigest.update((byte) (j >>> 56));
            messageDigest.update((byte) (j >>> 48));
            messageDigest.update((byte) (j >>> 40));
            messageDigest.update((byte) (j >>> 32));
            messageDigest.update((byte) (j >>> 24));
            messageDigest.update((byte) (j >>> 16));
            messageDigest.update((byte) (j >>> 8));
            messageDigest.update((byte) j);
        }
        String str = this.text;
        if (str != null) {
            byte[] bytes = str.getBytes(a.b);
            j.b(bytes, "(this as java.lang.String).getBytes(charset)");
            x.s0(messageDigest, bytes);
        }
        BigInteger bigInteger = this.integer;
        if (bigInteger != null) {
            byte[] byteArray = bigInteger.toByteArray();
            x.r0(messageDigest, 0);
            j.b(byteArray, "bytes");
            x.s0(messageDigest, byteArray);
        }
        BigDecimal bigDecimal = this.decimal;
        if (bigDecimal != null) {
            x.r0(messageDigest, bigDecimal.scale());
            byte[] byteArray2 = bigDecimal.unscaledValue().toByteArray();
            j.b(byteArray2, "b.unscaledValue().toByteArray()");
            x.s0(messageDigest, byteArray2);
        }
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        BigDecimal bigDecimal;
        BigInteger bigInteger;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!j.a(JsonTokenData.class, cls)) {
            return false;
        }
        if (obj != null) {
            JsonTokenData jsonTokenData = (JsonTokenData) obj;
            JsonTokenType jsonTokenType = this.type;
            if (jsonTokenType != jsonTokenData.type) {
                return false;
            }
            int i = WhenMappings.$EnumSwitchMapping$1[jsonTokenType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                BigInteger bigInteger2 = this.integer;
                if (bigInteger2 != null && (bigInteger = jsonTokenData.integer) != null) {
                    return j.a(bigInteger2, bigInteger);
                }
                BigDecimal bigDecimal2 = this.decimal;
                if (bigDecimal2 != null && (bigDecimal = jsonTokenData.decimal) != null) {
                    if (bigDecimal2.compareTo(bigDecimal) == 0) {
                        return true;
                    }
                    return false;
                }
                return j.a(toDecimal(), jsonTokenData.toDecimal());
            }
            return j.a(this.text, jsonTokenData.text);
        }
        throw new o("null cannot be cast to non-null type com.worldturner.medeia.parser.JsonTokenData");
    }

    public final BigDecimal getDecimal() {
        return this.decimal;
    }

    public final BigInteger getInteger() {
        return this.integer;
    }

    public final long getLongValue() {
        return this.longValue;
    }

    public final String getText() {
        return this.text;
    }

    public final JsonTokenType getType() {
        return this.type;
    }

    public final Object getValue() {
        Object obj = this.text;
        if (obj == null) {
            obj = this.integer;
        }
        if (obj == null) {
            return this.decimal;
        }
        return obj;
    }

    public final boolean hasLongValue() {
        if (this.longValue != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.type.hashCode() * 31;
        String str = this.text;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        BigInteger bigInteger = this.integer;
        if (bigInteger != null) {
            i2 = JsonTokenDataKt.standardizedHashCode(bigInteger);
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        BigDecimal bigDecimal = this.decimal;
        if (bigDecimal != null) {
            i3 = JsonTokenDataKt.standardizedHashCode(bigDecimal);
        }
        return i5 + i3;
    }

    public final boolean isInteger() {
        if (!hasLongValue() && this.integer == null) {
            BigDecimal bigDecimal = this.decimal;
            if (bigDecimal != null) {
                if (!JsonTokenDataKt.isIntegerForStrippedTrailingZeroes(bigDecimal)) {
                    return false;
                }
            } else {
                j.l();
                throw null;
            }
        }
        return true;
    }

    public final boolean toBoolean() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(this.type));
    }

    public final BigDecimal toDecimal() {
        if (hasLongValue()) {
            return BigDecimal.valueOf(this.longValue);
        }
        BigInteger bigInteger = this.integer;
        if (bigInteger != null) {
            return new BigDecimal(bigInteger);
        }
        BigDecimal bigDecimal = this.decimal;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        j.l();
        throw null;
    }

    public String toString() {
        String str;
        String bigInteger;
        switch (WhenMappings.$EnumSwitchMapping$2[this.type.ordinal()]) {
            case 1:
                return "[";
            case 2:
                return "]";
            case 3:
                if (hasLongValue()) {
                    return String.valueOf(this.longValue);
                }
                BigInteger bigInteger2 = this.integer;
                if (bigInteger2 == null || (bigInteger = bigInteger2.toString()) == null) {
                    BigDecimal bigDecimal = this.decimal;
                    if (bigDecimal != null) {
                        str = bigDecimal.toString();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        j.l();
                        throw null;
                    }
                    return str;
                }
                return bigInteger;
            case 4:
                return "{";
            case 5:
                return "}";
            case 6:
                String str2 = this.text;
                if (str2 != null) {
                    StringBuilder sb = new StringBuilder(str2.length() + 2);
                    l1.t(sb, this.text);
                    String sb2 = sb.toString();
                    j.b(sb2, "StringBuilder(text!!.len…onString(text).toString()");
                    return sb2;
                }
                j.l();
                throw null;
            case 7:
                return "null";
            case 8:
                return "true";
            case 9:
                return "false";
            default:
                return "?";
        }
    }

    public final Object toValue() {
        Object obj;
        int i = WhenMappings.$EnumSwitchMapping$3[this.type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return null;
                }
                if (i != 4) {
                    if (i == 5) {
                        return Boolean.FALSE;
                    }
                    throw new IllegalStateException("Token of type " + this.type + " can't be expressed as a value");
                }
                return Boolean.TRUE;
            }
            obj = this.text;
            if (obj == null) {
                j.l();
                throw null;
            }
        } else if (hasLongValue()) {
            return Long.valueOf(this.longValue);
        } else {
            obj = this.integer;
            if (obj == null && (obj = this.decimal) == null) {
                j.l();
                throw null;
            }
        }
        return obj;
    }

    public /* synthetic */ JsonTokenData(JsonTokenType jsonTokenType, String str, long j, BigInteger bigInteger, BigDecimal bigDecimal, int i, e eVar) {
        this(jsonTokenType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? Long.MIN_VALUE : j, (i & 8) != 0 ? null : bigInteger, (i & 16) == 0 ? bigDecimal : null);
    }
}
