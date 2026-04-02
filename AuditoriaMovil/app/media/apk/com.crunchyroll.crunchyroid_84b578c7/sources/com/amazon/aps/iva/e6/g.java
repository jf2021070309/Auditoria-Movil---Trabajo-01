package com.amazon.aps.iva.e6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: Period.java */
/* loaded from: classes.dex */
public final class g {
    public final String a;
    public final long b;
    public final List<a> c;
    public final List<f> d;

    public g() {
        throw null;
    }

    public g(String str, long j, ArrayList arrayList, List list) {
        this.a = str;
        this.b = j;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(list);
    }
}
