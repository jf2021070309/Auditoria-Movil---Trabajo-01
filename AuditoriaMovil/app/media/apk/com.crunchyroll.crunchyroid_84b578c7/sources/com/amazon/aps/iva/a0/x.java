package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.f1.k0;
/* compiled from: ClipScrollableContainer.kt */
/* loaded from: classes.dex */
public final class x {
    public static final float a = 30;
    public static final com.amazon.aps.iva.a1.f b;
    public static final com.amazon.aps.iva.a1.f c;

    /* compiled from: ClipScrollableContainer.kt */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.f1.u0 {
        @Override // com.amazon.aps.iva.f1.u0
        public final com.amazon.aps.iva.f1.k0 a(long j, com.amazon.aps.iva.o2.l lVar, com.amazon.aps.iva.o2.c cVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
            com.amazon.aps.iva.yb0.j.f(cVar, "density");
            float f0 = cVar.f0(x.a);
            return new k0.b(new com.amazon.aps.iva.e1.e(0.0f, -f0, com.amazon.aps.iva.e1.g.d(j), com.amazon.aps.iva.e1.g.b(j) + f0));
        }
    }

    /* compiled from: ClipScrollableContainer.kt */
    /* loaded from: classes.dex */
    public static final class b implements com.amazon.aps.iva.f1.u0 {
        @Override // com.amazon.aps.iva.f1.u0
        public final com.amazon.aps.iva.f1.k0 a(long j, com.amazon.aps.iva.o2.l lVar, com.amazon.aps.iva.o2.c cVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
            com.amazon.aps.iva.yb0.j.f(cVar, "density");
            float f0 = cVar.f0(x.a);
            return new k0.b(new com.amazon.aps.iva.e1.e(-f0, 0.0f, com.amazon.aps.iva.e1.g.d(j) + f0, com.amazon.aps.iva.e1.g.b(j)));
        }
    }

    static {
        int i = com.amazon.aps.iva.a1.f.a;
        f.a aVar = f.a.c;
        b = com.amazon.aps.iva.cq.b.F(aVar, new a());
        c = com.amazon.aps.iva.cq.b.F(aVar, new b());
    }
}
