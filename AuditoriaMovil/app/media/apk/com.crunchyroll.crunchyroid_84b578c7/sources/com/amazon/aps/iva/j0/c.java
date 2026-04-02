package com.amazon.aps.iva.j0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
/* compiled from: AndroidCursorHandle.android.kt */
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.c1.e, com.amazon.aps.iva.c1.i> {
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j) {
        super(1);
        this.h = j;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.c1.i invoke(com.amazon.aps.iva.c1.e eVar) {
        ColorFilter porterDuffColorFilter;
        com.amazon.aps.iva.c1.e eVar2 = eVar;
        com.amazon.aps.iva.yb0.j.f(eVar2, "$this$drawWithCache");
        float d = com.amazon.aps.iva.e1.g.d(eVar2.h()) / 2.0f;
        com.amazon.aps.iva.f1.i0 d2 = com.amazon.aps.iva.l0.a.d(eVar2, d);
        int i = Build.VERSION.SDK_INT;
        long j = this.h;
        if (i >= 29) {
            porterDuffColorFilter = com.amazon.aps.iva.f1.q.a.a(j, 5);
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(defpackage.i.G(j), com.amazon.aps.iva.f1.f.b(5));
        }
        return eVar2.b(new b(d, d2, new com.amazon.aps.iva.f1.y(porterDuffColorFilter)));
    }
}
