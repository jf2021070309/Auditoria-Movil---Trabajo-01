package com.amazon.aps.iva.v4;

import java.io.IOException;
/* compiled from: Schema.java */
/* loaded from: classes.dex */
public interface e1<T> {
    void a(Object obj, l lVar) throws IOException;

    void b(T t, d1 d1Var, o oVar) throws IOException;

    boolean equals(T t, T t2);

    int getSerializedSize(T t);

    int hashCode(T t);

    boolean isInitialized(T t);

    void makeImmutable(T t);

    void mergeFrom(T t, T t2);

    T newInstance();
}
