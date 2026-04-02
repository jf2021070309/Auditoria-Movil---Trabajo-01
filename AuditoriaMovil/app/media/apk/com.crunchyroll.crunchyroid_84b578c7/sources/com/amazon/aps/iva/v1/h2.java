package com.amazon.aps.iva.v1;

import java.util.ArrayList;
import java.util.List;
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes.dex */
public final class h2 implements com.amazon.aps.iva.u1.v0 {
    public final int b;
    public final List<h2> c;
    public Float d;
    public Float e;
    public com.amazon.aps.iva.a2.j f;
    public com.amazon.aps.iva.a2.j g;

    public h2(int i, ArrayList arrayList) {
        com.amazon.aps.iva.yb0.j.f(arrayList, "allScopes");
        this.b = i;
        this.c = arrayList;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    @Override // com.amazon.aps.iva.u1.v0
    public final boolean y0() {
        return this.c.contains(this);
    }
}
