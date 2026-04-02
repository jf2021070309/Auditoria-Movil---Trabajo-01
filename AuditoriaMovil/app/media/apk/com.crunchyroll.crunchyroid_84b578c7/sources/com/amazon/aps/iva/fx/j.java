package com.amazon.aps.iva.fx;

import android.content.Intent;
/* compiled from: DownloadingFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class j implements com.amazon.aps.iva.zv.f, com.amazon.aps.iva.y30.h {
    public final /* synthetic */ com.amazon.aps.iva.y30.h a;

    public j(com.amazon.aps.iva.y30.i iVar) {
        this.a = iVar;
    }

    @Override // com.amazon.aps.iva.y30.h
    public final void G(com.amazon.aps.iva.wg.b bVar, com.amazon.aps.iva.wg.b bVar2) {
        com.amazon.aps.iva.yb0.j.f(bVar, "oldValue");
        com.amazon.aps.iva.yb0.j.f(bVar2, "newValue");
        this.a.G(bVar, bVar2);
    }

    @Override // com.amazon.aps.iva.y30.h
    public final void I(boolean z) {
        this.a.I(z);
    }

    @Override // com.amazon.aps.iva.y30.h
    public final void J(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "preferenceName");
        this.a.J(str);
    }

    @Override // com.amazon.aps.iva.us.r
    public final void c() {
        this.a.c();
    }

    @Override // com.amazon.aps.iva.zv.f, com.amazon.aps.iva.y30.h
    public final void i(boolean z) {
        this.a.i(z);
    }

    @Override // com.amazon.aps.iva.y30.h
    public final void j() {
        this.a.j();
    }

    @Override // com.amazon.aps.iva.y30.h
    public final void k(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "preferenceName");
        this.a.k(str);
    }

    @Override // com.amazon.aps.iva.us.c
    public final void onNewIntent(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        this.a.onNewIntent(intent);
    }

    @Override // com.amazon.aps.iva.y30.h
    public final void z(com.amazon.aps.iva.d40.a aVar, com.amazon.aps.iva.d40.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(aVar2, "newValue");
        this.a.z(aVar, aVar2);
    }
}
