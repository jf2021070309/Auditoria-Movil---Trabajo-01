package com.amazon.aps.iva.ic0;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: CacheByClass.kt */
/* loaded from: classes4.dex */
public final class c<V> extends com.amazon.aps.iva.ab.a {
    public final com.amazon.aps.iva.xb0.l<Class<?>, V> a;
    public final ConcurrentHashMap<Class<?>, V> b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(com.amazon.aps.iva.xb0.l<? super Class<?>, ? extends V> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "compute");
        this.a = lVar;
        this.b = new ConcurrentHashMap<>();
    }
}
