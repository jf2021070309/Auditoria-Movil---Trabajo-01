package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.p;
/* compiled from: Animation.kt */
/* loaded from: classes.dex */
public interface f<T, V extends p> {
    boolean a();

    V b(long j);

    default boolean c(long j) {
        if (j >= d()) {
            return true;
        }
        return false;
    }

    long d();

    l1<T, V> e();

    T f(long j);

    T g();
}
