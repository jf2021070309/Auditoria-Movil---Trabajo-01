package com.amazon.aps.iva.u1;
/* compiled from: ObserverModifierNode.kt */
/* loaded from: classes.dex */
public final class r0 implements v0 {
    public static final a c = a.h;
    public final p0 b;

    /* compiled from: ObserverModifierNode.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<r0, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(r0 r0Var) {
            r0 r0Var2 = r0Var;
            com.amazon.aps.iva.yb0.j.f(r0Var2, "it");
            if (r0Var2.y0()) {
                r0Var2.b.a0();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public r0(p0 p0Var) {
        com.amazon.aps.iva.yb0.j.f(p0Var, "observerNode");
        this.b = p0Var;
    }

    @Override // com.amazon.aps.iva.u1.v0
    public final boolean y0() {
        return this.b.V().n;
    }
}
