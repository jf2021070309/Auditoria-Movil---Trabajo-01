package com.facebook.ads.internal.q.a;

import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public abstract class w<T> implements Runnable {
    private final WeakReference<T> a;

    public w(T t) {
        this.a = new WeakReference<>(t);
    }

    public T a() {
        return this.a.get();
    }
}
