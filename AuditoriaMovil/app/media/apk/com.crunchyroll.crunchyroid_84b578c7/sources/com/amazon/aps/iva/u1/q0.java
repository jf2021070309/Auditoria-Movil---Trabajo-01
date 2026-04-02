package com.amazon.aps.iva.u1;

import com.amazon.aps.iva.a1.f;
/* compiled from: ObserverModifierNode.kt */
/* loaded from: classes.dex */
public final class q0 {
    public static final <T extends f.c & p0> void a(T t, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        com.amazon.aps.iva.yb0.j.f(t, "<this>");
        r0 r0Var = t.h;
        if (r0Var == null) {
            r0Var = new r0(t);
            t.h = r0Var;
        }
        i.f(t).getSnapshotObserver().a(r0Var, r0.c, aVar);
    }
}
