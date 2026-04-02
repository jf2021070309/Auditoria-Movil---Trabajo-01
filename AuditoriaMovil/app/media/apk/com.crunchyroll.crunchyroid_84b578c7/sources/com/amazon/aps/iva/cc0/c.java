package com.amazon.aps.iva.cc0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ub0.a;
import java.io.Serializable;
/* compiled from: Random.kt */
/* loaded from: classes4.dex */
public abstract class c {
    public static final a b = new a(0);
    public static final com.amazon.aps.iva.cc0.a c;

    /* compiled from: Random.kt */
    /* loaded from: classes4.dex */
    public static final class a extends c implements Serializable {
        public a(int i) {
        }

        @Override // com.amazon.aps.iva.cc0.c
        public final int a(int i) {
            return c.c.a(i);
        }

        @Override // com.amazon.aps.iva.cc0.c
        public final int b() {
            return c.c.b();
        }

        @Override // com.amazon.aps.iva.cc0.c
        public final long c() {
            return c.c.c();
        }

        @Override // com.amazon.aps.iva.cc0.c
        public final long d(long j, long j2) {
            return c.c.d(j, j2);
        }

        public final int e(int i) {
            return c.c.f(i);
        }
    }

    static {
        com.amazon.aps.iva.cc0.a bVar;
        boolean z = false;
        com.amazon.aps.iva.sb0.b.a.getClass();
        Integer num = a.C0761a.a;
        if ((num == null || num.intValue() >= 34) ? true : true) {
            bVar = new com.amazon.aps.iva.dc0.a();
        } else {
            bVar = new b();
        }
        c = bVar;
    }

    public abstract int a(int i);

    public abstract int b();

    public abstract long c();

    public long d(long j, long j2) {
        boolean z;
        long c2;
        boolean z2;
        long c3;
        long j3;
        long j4;
        int b2;
        if (j2 > j) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j5 = j2 - j;
            if (j5 > 0) {
                if (((-j5) & j5) == j5) {
                    int i = (int) j5;
                    int i2 = (int) (j5 >>> 32);
                    if (i != 0) {
                        b2 = a(31 - Integer.numberOfLeadingZeros(i));
                    } else if (i2 == 1) {
                        b2 = b();
                    } else {
                        j4 = (a(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (b() & 4294967295L);
                    }
                    j4 = b2 & 4294967295L;
                } else {
                    do {
                        c3 = c() >>> 1;
                        j3 = c3 % j5;
                    } while ((j5 - 1) + (c3 - j3) < 0);
                    j4 = j3;
                }
                return j + j4;
            }
            do {
                c2 = c();
                if (j <= c2 && c2 < j2) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
            } while (!z2);
            return c2;
        }
        throw new IllegalArgumentException(l1.v(Long.valueOf(j), Long.valueOf(j2)).toString());
    }
}
