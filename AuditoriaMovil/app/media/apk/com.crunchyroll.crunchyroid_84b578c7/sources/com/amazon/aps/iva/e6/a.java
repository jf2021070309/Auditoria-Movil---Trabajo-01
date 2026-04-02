package com.amazon.aps.iva.e6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: AdaptationSet.java */
/* loaded from: classes.dex */
public final class a {
    public final long a;
    public final int b;
    public final List<j> c;
    public final List<e> d;
    public final List<e> e;
    public final List<e> f;

    public a(long j, int i, ArrayList arrayList, List list, List list2, List list3) {
        this.a = j;
        this.b = i;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
    }
}
