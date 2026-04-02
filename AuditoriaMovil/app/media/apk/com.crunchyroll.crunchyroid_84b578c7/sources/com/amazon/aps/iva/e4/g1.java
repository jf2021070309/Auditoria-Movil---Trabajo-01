package com.amazon.aps.iva.e4;

import java.io.IOException;
/* compiled from: Schema.java */
/* loaded from: classes.dex */
public interface g1<T> {
    void a(T t, f1 f1Var, p pVar) throws IOException;

    void b(Object obj, m mVar) throws IOException;

    boolean equals(T t, T t2);

    int getSerializedSize(T t);

    int hashCode(T t);

    boolean isInitialized(T t);

    void makeImmutable(T t);

    void mergeFrom(T t, T t2);

    T newInstance();
}
