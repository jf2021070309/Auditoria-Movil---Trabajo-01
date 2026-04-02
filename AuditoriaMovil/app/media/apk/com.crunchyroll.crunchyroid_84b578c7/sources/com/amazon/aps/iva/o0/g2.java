package com.amazon.aps.iva.o0;
/* compiled from: CompositionLocal.kt */
/* loaded from: classes.dex */
public abstract class g2<T> extends k0<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.amazon.aps.iva.xb0.a<? extends T> aVar) {
        super(aVar);
        com.amazon.aps.iva.yb0.j.f(aVar, "defaultFactory");
    }

    public final h2<T> b(T t) {
        return new h2<>(this, t, true);
    }
}
