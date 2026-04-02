package com.worldturner.medeia.parser.gson;

import com.amazon.aps.iva.yb0.j;
import java.math.BigInteger;
import kotlin.Metadata;
/* compiled from: GsonJsonReaderDecorator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0002¨\u0006\u0005"}, d2 = {"exactIntValue", "", "Ljava/math/BigInteger;", "exactLongValue", "", "medeia-validator-gson"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class GsonJsonReaderDecoratorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int exactIntValue(BigInteger bigInteger) {
        int intValue = bigInteger.intValue();
        if (j.a(bigInteger, new BigInteger(String.valueOf(intValue)))) {
            return intValue;
        }
        throw new ArithmeticException("BigInteger out of int range");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long exactLongValue(BigInteger bigInteger) {
        long longValue = bigInteger.longValue();
        if (j.a(bigInteger, new BigInteger(String.valueOf(longValue)))) {
            return longValue;
        }
        throw new ArithmeticException("BigInteger out of long range");
    }
}
