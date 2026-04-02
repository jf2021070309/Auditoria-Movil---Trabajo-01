package com.amazon.aps.iva.o0;

import java.util.List;
/* compiled from: RecomposeScopeImpl.kt */
/* loaded from: classes.dex */
public final class j2 implements i2 {
    public int a;
    public l2 b;
    public c c;
    public com.amazon.aps.iva.xb0.p<? super i, ? super Integer, com.amazon.aps.iva.kb0.q> d;
    public int e;
    public com.amazon.aps.iva.p0.a f;
    public com.amazon.aps.iva.p0.b<r0<?>, Object> g;

    /* compiled from: RecomposeScopeImpl.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(b3 b3Var, List list, l2 l2Var) {
            j2 j2Var;
            com.amazon.aps.iva.yb0.j.f(b3Var, "slots");
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    c cVar = (c) list.get(i);
                    com.amazon.aps.iva.yb0.j.f(cVar, "anchor");
                    Object I = b3Var.I(b3Var.c(cVar), 0);
                    if (I instanceof j2) {
                        j2Var = (j2) I;
                    } else {
                        j2Var = null;
                    }
                    if (j2Var != null) {
                        j2Var.b = l2Var;
                    }
                }
            }
        }
    }

    public j2(i0 i0Var) {
        this.b = i0Var;
    }

    public final b1 a(Object obj) {
        b1 c;
        l2 l2Var = this.b;
        if (l2Var == null || (c = l2Var.c(this, obj)) == null) {
            return b1.IGNORED;
        }
        return c;
    }

    @Override // com.amazon.aps.iva.o0.i2
    public final void invalidate() {
        l2 l2Var = this.b;
        if (l2Var != null) {
            l2Var.c(this, null);
        }
    }
}
