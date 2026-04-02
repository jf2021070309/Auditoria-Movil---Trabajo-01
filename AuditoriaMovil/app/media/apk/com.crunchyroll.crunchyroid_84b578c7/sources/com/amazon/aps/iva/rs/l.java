package com.amazon.aps.iva.rs;

import android.app.Activity;
/* compiled from: BillingFlowLauncher.kt */
/* loaded from: classes2.dex */
public final class l implements k {
    public final Activity a;
    public final f b;

    public l(com.amazon.aps.iva.i60.b bVar, f fVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "activity");
        this.a = bVar;
        this.b = fVar;
    }

    @Override // com.amazon.aps.iva.rs.k
    public final Object a(String str, String str2, com.amazon.aps.iva.ob0.d<? super p> dVar) {
        return this.b.d(this.a, str, str2, 1, dVar);
    }

    @Override // com.amazon.aps.iva.rs.k
    public final Object b(String str, String str2, com.amazon.aps.iva.ob0.d<? super p> dVar) {
        return this.b.d(this.a, str, str2, 2, dVar);
    }

    @Override // com.amazon.aps.iva.rs.k
    public final Object c(String str, com.amazon.aps.iva.ob0.d<? super p> dVar) {
        return this.b.e(this.a, str, dVar);
    }
}
