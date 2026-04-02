package com.amazon.aps.iva.v1;

import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes.dex */
public final class w<T> implements Comparator {
    public final /* synthetic */ Comparator b;

    public w(v vVar) {
        this.b = vVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.b.compare(t, t2);
        if (compare == 0) {
            return com.amazon.aps.iva.ee0.f1.t(Integer.valueOf(((com.amazon.aps.iva.a2.r) t).g), Integer.valueOf(((com.amazon.aps.iva.a2.r) t2).g));
        }
        return compare;
    }
}
