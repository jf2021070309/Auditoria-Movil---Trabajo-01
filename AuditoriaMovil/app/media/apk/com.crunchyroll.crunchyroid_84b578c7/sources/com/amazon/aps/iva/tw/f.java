package com.amazon.aps.iva.tw;

import com.amazon.aps.iva.ee0.f1;
import java.util.Comparator;
import java.util.List;
/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class f<T> implements Comparator {
    public final /* synthetic */ List b;

    public f(List list) {
        this.b = list;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String a = ((b) t).a();
        List list = this.b;
        return f1.t(Integer.valueOf(list.indexOf(a)), Integer.valueOf(list.indexOf(((b) t2).a())));
    }
}
