package com.amazon.aps.iva.f0;
/* compiled from: IntervalList.kt */
/* loaded from: classes.dex */
public final class d<T> {
    public final int a;
    public final int b;
    public final T c;

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i, int i2, com.amazon.aps.iva.e0.h hVar) {
        boolean z;
        this.a = i;
        this.b = i2;
        this.c = hVar;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 > 0) {
                return;
            }
            throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("size should be >0, but was ", i2).toString());
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("startIndex should be >= 0, but was ", i).toString());
    }
}
