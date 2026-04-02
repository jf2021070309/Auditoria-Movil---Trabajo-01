package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.m0;
/* compiled from: AnimationSpec.kt */
/* loaded from: classes.dex */
public final class k {
    public static g0 a(w wVar) {
        s0 s0Var = s0.Restart;
        com.amazon.aps.iva.yb0.j.f(s0Var, "repeatMode");
        return new g0(wVar, s0Var, 0);
    }

    public static final <T> m0<T> b(com.amazon.aps.iva.xb0.l<? super m0.b<T>, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "init");
        m0.b bVar = new m0.b();
        lVar.invoke(bVar);
        return new m0<>(bVar);
    }

    public static u0 c(float f, Object obj, int i) {
        float f2;
        if ((i & 1) != 0) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new u0(f2, f, obj);
    }

    public static k1 d(int i, int i2, x xVar, int i3) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            xVar = y.a;
        }
        com.amazon.aps.iva.yb0.j.f(xVar, "easing");
        return new k1(i, i2, xVar);
    }
}
