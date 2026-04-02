package com.amazon.aps.iva.f0;
/* compiled from: LazyLayoutItemProvider.kt */
/* loaded from: classes.dex */
public interface p {
    default int a(Object obj) {
        com.amazon.aps.iva.yb0.j.f(obj, "key");
        return -1;
    }

    int b();

    default Object c(int i) {
        return null;
    }

    void f(int i, Object obj, com.amazon.aps.iva.o0.i iVar, int i2);

    default Object getKey(int i) {
        return new b(i);
    }
}
