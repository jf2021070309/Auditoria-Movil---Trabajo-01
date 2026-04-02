package com.amazon.aps.iva.v1;

import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes.dex */
public final class v<T> implements Comparator {
    public final /* synthetic */ Comparator b;
    public final /* synthetic */ Comparator c;

    public v(com.amazon.aps.iva.nb0.a aVar, com.amazon.aps.iva.u1.y yVar) {
        this.b = aVar;
        this.c = yVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.b.compare(t, t2);
        if (compare == 0) {
            return this.c.compare(((com.amazon.aps.iva.a2.r) t).c, ((com.amazon.aps.iva.a2.r) t2).c);
        }
        return compare;
    }
}
