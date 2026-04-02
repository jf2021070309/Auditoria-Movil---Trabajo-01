package com.amazon.aps.iva.nb0;

import com.amazon.aps.iva.yb0.j;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes4.dex */
public final class b implements Comparator<Comparable<? super Object>> {
    public static final b b = new b();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable;
        Comparable<? super Object> comparable4 = comparable2;
        j.f(comparable3, "a");
        j.f(comparable4, "b");
        return comparable3.compareTo(comparable4);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return c.b;
    }
}
