package com.amazon.aps.iva.p8;
/* compiled from: EntityInsertionAdapter.java */
/* loaded from: classes.dex */
public abstract class b<T> extends k {
    public abstract void d(com.amazon.aps.iva.v8.e eVar, T t);

    public final void e(T t) {
        com.amazon.aps.iva.v8.e a = a();
        try {
            d(a, t);
            a.c.executeInsert();
        } finally {
            c(a);
        }
    }
}
