package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.z.m1;
import com.amazon.aps.iva.z.n1;
import com.amazon.aps.iva.z.u0;
/* compiled from: SelectionMagnifier.kt */
/* loaded from: classes.dex */
public final class p {
    public static final com.amazon.aps.iva.z.n a = new com.amazon.aps.iva.z.n(Float.NaN, Float.NaN);
    public static final m1 b = n1.a(a.h, b.h);
    public static final long c;
    public static final u0<com.amazon.aps.iva.e1.c> d;

    /* compiled from: SelectionMagnifier.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.z.n> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.z.n invoke(com.amazon.aps.iva.e1.c cVar) {
            long j = cVar.a;
            if (com.amazon.aps.iva.e1.d.h(j)) {
                return new com.amazon.aps.iva.z.n(com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.c.d(j));
            }
            return p.a;
        }
    }

    /* compiled from: SelectionMagnifier.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.z.n, com.amazon.aps.iva.e1.c> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.e1.c invoke(com.amazon.aps.iva.z.n nVar) {
            com.amazon.aps.iva.z.n nVar2 = nVar;
            com.amazon.aps.iva.yb0.j.f(nVar2, "it");
            return new com.amazon.aps.iva.e1.c(com.amazon.aps.iva.e1.d.d(nVar2.a, nVar2.b));
        }
    }

    static {
        long d2 = com.amazon.aps.iva.e1.d.d(0.01f, 0.01f);
        c = d2;
        d = new u0<>(0.0f, 0.0f, new com.amazon.aps.iva.e1.c(d2), 3);
    }
}
