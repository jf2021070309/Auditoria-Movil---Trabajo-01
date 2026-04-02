package com.amazon.aps.iva.ur;

import java.math.BigInteger;
import java.util.Random;
/* compiled from: StringCachingBigInteger.java */
/* loaded from: classes2.dex */
public final class f extends BigInteger {
    public String b;

    public f(Random random) {
        super(63, random);
    }

    @Override // java.math.BigInteger
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.math.BigInteger
    public final int hashCode() {
        return super.hashCode();
    }

    @Override // java.math.BigInteger
    public final String toString() {
        if (this.b == null) {
            this.b = super.toString();
        }
        return this.b;
    }
}
