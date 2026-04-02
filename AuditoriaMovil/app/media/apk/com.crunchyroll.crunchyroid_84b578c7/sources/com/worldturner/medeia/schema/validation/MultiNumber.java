package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.parser.JsonTokenData;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Metadata;
/* compiled from: NumberValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/worldturner/medeia/schema/validation/MultiNumber;", "", "bigDecimalValue", "Ljava/math/BigDecimal;", "(Ljava/math/BigDecimal;)V", "getBigDecimalValue", "()Ljava/math/BigDecimal;", "bigIntegerValue", "Ljava/math/BigInteger;", "getBigIntegerValue", "()Ljava/math/BigInteger;", "longValue", "", "getLongValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "compareTo", "", "token", "Lcom/worldturner/medeia/parser/JsonTokenData;", "isMultiple", "", "toString", "", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class MultiNumber {
    private final BigDecimal bigDecimalValue;
    private final BigInteger bigIntegerValue;
    private final Long longValue;

    public MultiNumber(BigDecimal bigDecimal) {
        Long l;
        j.g(bigDecimal, "bigDecimalValue");
        this.bigDecimalValue = bigDecimal;
        BigInteger bigInteger = null;
        try {
            l = Long.valueOf(bigDecimal.longValueExact());
        } catch (ArithmeticException unused) {
            l = null;
        }
        this.longValue = l;
        try {
            bigInteger = this.bigDecimalValue.toBigIntegerExact();
        } catch (ArithmeticException unused2) {
        }
        this.bigIntegerValue = bigInteger;
    }

    public final int compareTo(JsonTokenData jsonTokenData) {
        BigInteger bigInteger;
        Long l;
        j.g(jsonTokenData, "token");
        if (jsonTokenData.hasLongValue() && (l = this.longValue) != null) {
            return (l.longValue() > jsonTokenData.getLongValue() ? 1 : (l.longValue() == jsonTokenData.getLongValue() ? 0 : -1));
        }
        if (jsonTokenData.getInteger() != null && (bigInteger = this.bigIntegerValue) != null) {
            return bigInteger.compareTo(jsonTokenData.getInteger());
        }
        return this.bigDecimalValue.compareTo(jsonTokenData.toDecimal());
    }

    public final BigDecimal getBigDecimalValue() {
        return this.bigDecimalValue;
    }

    public final BigInteger getBigIntegerValue() {
        return this.bigIntegerValue;
    }

    public final Long getLongValue() {
        return this.longValue;
    }

    public final boolean isMultiple(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        if (jsonTokenData.hasLongValue() && this.longValue != null) {
            if (jsonTokenData.getLongValue() % this.longValue.longValue() == 0) {
                return true;
            }
            return false;
        } else if (jsonTokenData.getInteger() != null && this.bigIntegerValue != null) {
            BigInteger remainder = jsonTokenData.getInteger().remainder(this.bigIntegerValue);
            j.b(remainder, "this.remainder(other)");
            return j.a(remainder, BigInteger.ZERO);
        } else {
            BigDecimal decimal = jsonTokenData.toDecimal();
            j.b(decimal, "token.toDecimal()");
            BigDecimal remainder2 = decimal.remainder(this.bigDecimalValue);
            j.b(remainder2, "this.remainder(other)");
            if (remainder2.compareTo(BigDecimal.ZERO) == 0) {
                return true;
            }
            return false;
        }
    }

    public String toString() {
        String bigDecimal = this.bigDecimalValue.toString();
        j.b(bigDecimal, "bigDecimalValue.toString()");
        return bigDecimal;
    }
}
