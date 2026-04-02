package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.b0.w;
/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes.dex */
public final class p implements com.amazon.aps.iva.b0.a0 {
    public final a a;
    public final /* synthetic */ k<Object> b;

    /* compiled from: AnchoredDraggable.kt */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.b0.k {
        public final /* synthetic */ k<Object> a;

        public a(k<Object> kVar) {
            this.a = kVar;
        }

        @Override // com.amazon.aps.iva.b0.k
        public final void b(float f) {
            k<Object> kVar = this.a;
            kVar.p.a(kVar.e(f), 0.0f);
        }
    }

    public p(k<Object> kVar) {
        this.b = kVar;
        this.a = new a(kVar);
    }

    @Override // com.amazon.aps.iva.b0.a0
    public final Object a(com.amazon.aps.iva.a0.g1 g1Var, w.c.a.C0125a.C0126a c0126a, w.c.a.C0125a c0125a) {
        o oVar = new o(this, c0126a, null);
        k<Object> kVar = this.b;
        kVar.getClass();
        Object p = com.amazon.aps.iva.e.z.p(new n(null, kVar, g1Var, oVar, null), c0125a);
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        if (p != aVar) {
            p = com.amazon.aps.iva.kb0.q.a;
        }
        if (p != aVar) {
            p = com.amazon.aps.iva.kb0.q.a;
        }
        if (p == aVar) {
            return p;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
