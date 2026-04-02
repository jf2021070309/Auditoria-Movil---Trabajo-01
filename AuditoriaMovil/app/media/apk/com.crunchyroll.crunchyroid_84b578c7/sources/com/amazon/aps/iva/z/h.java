package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.p;
/* compiled from: Animatable.kt */
/* loaded from: classes.dex */
public final class h<T, V extends p> {
    public final l<T, V> a;
    public final g b;

    public h(l<T, V> lVar, g gVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "endState");
        com.amazon.aps.iva.yb0.j.f(gVar, "endReason");
        this.a = lVar;
        this.b = gVar;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + this.b + ", endState=" + this.a + ')';
    }
}
