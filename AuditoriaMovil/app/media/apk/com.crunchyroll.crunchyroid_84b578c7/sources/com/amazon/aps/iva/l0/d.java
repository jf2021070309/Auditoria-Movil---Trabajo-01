package com.amazon.aps.iva.l0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
/* compiled from: AndroidSelectionHandles.android.kt */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.c1.e, com.amazon.aps.iva.c1.i> {
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ com.amazon.aps.iva.n2.g j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j, boolean z, com.amazon.aps.iva.n2.g gVar, boolean z2) {
        super(1);
        this.h = j;
        this.i = z;
        this.j = gVar;
        this.k = z2;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.c1.i invoke(com.amazon.aps.iva.c1.e eVar) {
        ColorFilter porterDuffColorFilter;
        com.amazon.aps.iva.c1.e eVar2 = eVar;
        com.amazon.aps.iva.yb0.j.f(eVar2, "$this$drawWithCache");
        com.amazon.aps.iva.f1.i0 d = a.d(eVar2, com.amazon.aps.iva.e1.g.d(eVar2.h()) / 2.0f);
        int i = Build.VERSION.SDK_INT;
        long j = this.h;
        if (i >= 29) {
            porterDuffColorFilter = com.amazon.aps.iva.f1.q.a.a(j, 5);
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(defpackage.i.G(j), com.amazon.aps.iva.f1.f.b(5));
        }
        return eVar2.b(new c(this.i, this.j, this.k, d, new com.amazon.aps.iva.f1.y(porterDuffColorFilter)));
    }
}
