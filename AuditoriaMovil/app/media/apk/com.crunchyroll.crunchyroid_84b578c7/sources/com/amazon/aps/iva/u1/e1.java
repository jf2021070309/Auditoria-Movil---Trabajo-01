package com.amazon.aps.iva.u1;

import androidx.compose.ui.platform.AndroidComposeView;
/* compiled from: OwnerSnapshotObserver.kt */
/* loaded from: classes.dex */
public final class e1 {
    public final com.amazon.aps.iva.y0.y a;
    public final b1 b = b1.h;
    public final c1 c = c1.h;
    public final d1 d = d1.h;
    public final x0 e = x0.h;
    public final y0 f = y0.h;
    public final z0 g = z0.h;
    public final a1 h = a1.h;

    public e1(AndroidComposeView.l lVar) {
        this.a = new com.amazon.aps.iva.y0.y(lVar);
    }

    public final <T extends v0> void a(T t, com.amazon.aps.iva.xb0.l<? super T, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        com.amazon.aps.iva.yb0.j.f(t, "target");
        com.amazon.aps.iva.yb0.j.f(lVar, "onChanged");
        this.a.c(t, lVar, aVar);
    }
}
