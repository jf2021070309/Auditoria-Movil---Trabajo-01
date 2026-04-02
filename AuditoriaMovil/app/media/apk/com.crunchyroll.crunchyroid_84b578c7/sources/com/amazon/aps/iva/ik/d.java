package com.amazon.aps.iva.ik;

import com.amazon.aps.iva.ee0.f1;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes.dex */
public final class d<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return f1.t(Integer.valueOf(((f) t2).b()), Integer.valueOf(((f) t).b()));
    }
}
