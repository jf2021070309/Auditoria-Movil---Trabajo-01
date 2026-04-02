package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.ee0.f1;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes.dex */
public final class k<T> implements Comparator {
    public final /* synthetic */ com.amazon.aps.iva.f0.r b;

    public k(com.amazon.aps.iva.f0.r rVar) {
        this.b = rVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Object obj = ((c0) t).j;
        com.amazon.aps.iva.f0.r rVar = this.b;
        return f1.t(Integer.valueOf(rVar.a(obj)), Integer.valueOf(rVar.a(((c0) t2).j)));
    }
}
