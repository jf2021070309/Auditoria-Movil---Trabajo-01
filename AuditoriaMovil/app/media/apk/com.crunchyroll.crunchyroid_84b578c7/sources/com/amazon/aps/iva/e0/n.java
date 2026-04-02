package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.ee0.f1;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes.dex */
public final class n<T> implements Comparator {
    public final /* synthetic */ o b;

    public n(o oVar) {
        this.b = oVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        o oVar = this.b;
        return f1.t(Integer.valueOf(oVar.b.a(((c0) t2).j)), Integer.valueOf(oVar.b.a(((c0) t).j)));
    }
}
