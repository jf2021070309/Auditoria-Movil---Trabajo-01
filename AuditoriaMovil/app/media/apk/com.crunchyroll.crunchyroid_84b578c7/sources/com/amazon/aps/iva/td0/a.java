package com.amazon.aps.iva.td0;

import com.amazon.aps.iva.yb0.j;
/* compiled from: DeprecationInfo.kt */
/* loaded from: classes4.dex */
public abstract class a implements Comparable<a> {
    public abstract b a();

    public abstract void b();

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        a aVar2 = aVar;
        j.f(aVar2, "other");
        int compareTo = a().compareTo(aVar2.a());
        if (compareTo == 0) {
            b();
        }
        return compareTo;
    }
}
