package com.amazon.aps.iva.lc;
/* compiled from: DataFetcher.java */
/* loaded from: classes.dex */
public interface d<T> {

    /* compiled from: DataFetcher.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        void c(Exception exc);

        void f(T t);
    }

    Class<T> a();

    void b();

    void cancel();

    void d(com.amazon.aps.iva.ec.c cVar, a<? super T> aVar);

    com.amazon.aps.iva.kc.a e();
}
