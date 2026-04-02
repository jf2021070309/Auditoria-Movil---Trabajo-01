package com.amazon.aps.iva.f1;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.u0;
/* compiled from: GraphicsLayerModifier.kt */
/* loaded from: classes.dex */
public final class r extends f.c implements com.amazon.aps.iva.u1.x {
    public com.amazon.aps.iva.xb0.l<? super g0, com.amazon.aps.iva.kb0.q> o;

    /* compiled from: GraphicsLayerModifier.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 h;
        public final /* synthetic */ r i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.s1.u0 u0Var, r rVar) {
            super(1);
            this.h = u0Var;
            this.i = rVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            u0.a.i(aVar2, this.h, 0, 0, this.i.o, 4);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public r(com.amazon.aps.iva.xb0.l<? super g0, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "layerBlock");
        this.o = lVar;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.s1.u0 V = c0Var.V(j);
        return f0Var.F0(V.b, V.c, com.amazon.aps.iva.lb0.a0.b, new a(V, this));
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final boolean j1() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.o + ')';
    }
}
