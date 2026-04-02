package com.vungle.publisher;
/* loaded from: classes4.dex */
public abstract class vt<T> {
    public abstract T b();

    public String e() {
        T b = b();
        if (b == null) {
            return null;
        }
        return b.toString();
    }
}
