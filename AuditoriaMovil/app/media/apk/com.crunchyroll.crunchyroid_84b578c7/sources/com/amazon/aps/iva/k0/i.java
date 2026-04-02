package com.amazon.aps.iva.k0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.c2.y;
import com.amazon.aps.iva.l0.u;
import com.amazon.aps.iva.o0.v2;
import com.amazon.aps.iva.p1.l0;
import com.amazon.aps.iva.p1.v;
import com.amazon.aps.iva.v1.t1;
/* compiled from: SelectionController.kt */
/* loaded from: classes.dex */
public final class i implements v2 {
    public final u b;
    public m c;
    public final long d;
    public final com.amazon.aps.iva.a1.f e;

    /* compiled from: SelectionController.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.s1.q> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.s1.q invoke() {
            return i.this.c.a;
        }
    }

    /* compiled from: SelectionController.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<y> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final y invoke() {
            return i.this.c.b;
        }
    }

    public i(u uVar, long j) {
        m mVar = m.c;
        this.b = uVar;
        this.c = mVar;
        long a2 = uVar.a();
        this.d = a2;
        k kVar = new k(new g(this), uVar, a2, new h(this));
        com.amazon.aps.iva.a1.f a3 = l0.a(f.a.c, kVar, new j(kVar, null));
        com.amazon.aps.iva.yb0.j.f(a3, "<this>");
        com.amazon.aps.iva.t1.i<v> iVar = com.amazon.aps.iva.p1.q.a;
        this.e = com.amazon.aps.iva.a1.e.a(a3, t1.a, new com.amazon.aps.iva.p1.u(false));
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onRemembered() {
        new a();
        new b();
        this.b.e();
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onAbandoned() {
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onForgotten() {
    }
}
