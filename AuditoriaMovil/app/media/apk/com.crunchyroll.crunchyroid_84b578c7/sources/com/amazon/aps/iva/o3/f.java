package com.amazon.aps.iva.o3;
/* compiled from: Pools.java */
/* loaded from: classes.dex */
public final class f<T> extends e {
    public final Object c;

    public f(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // com.amazon.aps.iva.o3.e, com.amazon.aps.iva.o3.d
    public final boolean a(T t) {
        boolean a;
        synchronized (this.c) {
            a = super.a(t);
        }
        return a;
    }

    @Override // com.amazon.aps.iva.o3.e, com.amazon.aps.iva.o3.d
    public final T b() {
        T t;
        synchronized (this.c) {
            t = (T) super.b();
        }
        return t;
    }
}
