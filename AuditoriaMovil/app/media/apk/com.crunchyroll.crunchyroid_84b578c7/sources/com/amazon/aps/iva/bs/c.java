package com.amazon.aps.iva.bs;

import java.math.BigDecimal;
import java.math.BigInteger;
/* compiled from: DeterministicSampler.java */
/* loaded from: classes2.dex */
public final class c implements f {
    public static final BigInteger c = new BigInteger("1111111111111111111");
    public static final BigDecimal d = new BigDecimal(com.amazon.aps.iva.ur.c.p);
    public static final BigInteger e = new BigInteger("2").pow(64);
    public final BigInteger a;
    public final double b;

    public c(double d2) {
        this.b = d2;
        this.a = new BigDecimal(d2).multiply(d).toBigInteger();
    }

    @Override // com.amazon.aps.iva.bs.f
    public final double a() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.bs.g
    public final boolean c(com.amazon.aps.iva.ur.a aVar) {
        double d2 = this.b;
        if (d2 == 1.0d) {
            return true;
        }
        if (d2 != 0.0d && aVar.b.d.multiply(c).mod(e).compareTo(this.a) < 0) {
            return true;
        }
        return false;
    }
}
