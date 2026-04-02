package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.ee0.f1;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes4.dex */
public final class l<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return f1.t(((com.amazon.aps.iva.fc0.k) t).getName(), ((com.amazon.aps.iva.fc0.k) t2).getName());
    }
}
