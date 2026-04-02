package com.amazon.aps.iva.jr;

import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.yb0.j;
/* compiled from: DatadogTree.kt */
/* loaded from: classes2.dex */
public final class a extends a.b {
    public final com.amazon.aps.iva.iq.a b;

    public a(com.amazon.aps.iva.iq.a aVar) {
        this.b = aVar;
        aVar.c.add("android:timber");
    }

    @Override // com.amazon.aps.iva.mf0.a.b
    public final void h(String str, int i, String str2, Throwable th) {
        j.f(str2, "message");
        this.b.d(i, str2, th, a0.b);
    }
}
