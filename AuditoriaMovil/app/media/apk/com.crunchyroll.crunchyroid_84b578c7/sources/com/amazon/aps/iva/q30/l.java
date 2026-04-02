package com.amazon.aps.iva.q30;

import com.amazon.aps.iva.ee0.f1;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class l<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return f1.t(Long.valueOf(((b) t2).d()), Long.valueOf(((b) t).d()));
    }
}
