package com.amazon.aps.iva.y;

import com.amazon.aps.iva.o0.v1;
/* compiled from: AnimatedContent.kt */
/* loaded from: classes.dex */
public final class e0 {
    public final r0 a;
    public final t0 b;
    public final v1 c;
    public final d1 d;

    public e0(r0 r0Var, t0 t0Var, float f, int i) {
        e1 e1Var;
        f = (i & 4) != 0 ? 0.0f : f;
        if ((i & 8) != 0) {
            i iVar = i.h;
            com.amazon.aps.iva.yb0.j.f(iVar, "sizeAnimationSpec");
            e1Var = new e1(true, iVar);
        } else {
            e1Var = null;
        }
        com.amazon.aps.iva.yb0.j.f(r0Var, "targetContentEnter");
        com.amazon.aps.iva.yb0.j.f(t0Var, "initialContentExit");
        this.a = r0Var;
        this.b = t0Var;
        this.c = com.amazon.aps.iva.e.z.I(f);
        this.d = e1Var;
    }
}
