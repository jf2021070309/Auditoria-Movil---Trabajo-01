package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.s1.u0;
/* compiled from: TextFieldScroll.kt */
/* loaded from: classes.dex */
public final class v2 implements com.amazon.aps.iva.s1.v {
    public final k2 c;
    public final int d;
    public final com.amazon.aps.iva.i2.o0 e;
    public final com.amazon.aps.iva.xb0.a<q2> f;

    /* compiled from: TextFieldScroll.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.s1.f0 h;
        public final /* synthetic */ v2 i;
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.s1.f0 f0Var, v2 v2Var, com.amazon.aps.iva.s1.u0 u0Var, int i) {
            super(1);
            this.h = f0Var;
            this.i = v2Var;
            this.j = u0Var;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            com.amazon.aps.iva.c2.y yVar;
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            com.amazon.aps.iva.s1.f0 f0Var = this.h;
            v2 v2Var = this.i;
            int i = v2Var.d;
            com.amazon.aps.iva.i2.o0 o0Var = v2Var.e;
            q2 invoke = v2Var.f.invoke();
            if (invoke != null) {
                yVar = invoke.a;
            } else {
                yVar = null;
            }
            com.amazon.aps.iva.s1.u0 u0Var = this.j;
            com.amazon.aps.iva.e1.e a = g2.a(f0Var, i, o0Var, yVar, false, u0Var.b);
            com.amazon.aps.iva.b0.f0 f0Var2 = com.amazon.aps.iva.b0.f0.Vertical;
            int i2 = u0Var.c;
            k2 k2Var = v2Var.c;
            k2Var.b(f0Var2, a, this.k, i2);
            u0.a.g(aVar2, u0Var, 0, com.amazon.aps.iva.ob0.f.a(-k2Var.a()));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public v2(k2 k2Var, int i, com.amazon.aps.iva.i2.o0 o0Var, p pVar) {
        this.c = k2Var;
        this.d = i;
        this.e = o0Var;
        this.f = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.c, v2Var.c) && this.d == v2Var.d && com.amazon.aps.iva.yb0.j.a(this.e, v2Var.e) && com.amazon.aps.iva.yb0.j.a(this.f, v2Var.f)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.s1.v
    public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.s1.u0 V = c0Var.V(com.amazon.aps.iva.o2.a.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(V.c, com.amazon.aps.iva.o2.a.g(j));
        return f0Var.F0(V.b, min, com.amazon.aps.iva.lb0.a0.b, new a(f0Var, this, V, min));
    }

    public final int hashCode() {
        int a2 = com.amazon.aps.iva.a0.r.a(this.d, this.c.hashCode() * 31, 31);
        return this.f.hashCode() + ((this.e.hashCode() + a2) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.c + ", cursorOffset=" + this.d + ", transformedText=" + this.e + ", textLayoutResultProvider=" + this.f + ')';
    }
}
