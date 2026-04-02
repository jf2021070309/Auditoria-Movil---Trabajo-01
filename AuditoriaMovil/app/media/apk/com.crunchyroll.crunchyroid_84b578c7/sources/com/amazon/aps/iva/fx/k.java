package com.amazon.aps.iva.fx;

import com.ellation.crunchyroll.model.Channel;
/* compiled from: DownloadingFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class k implements com.amazon.aps.iva.zv.g, com.amazon.aps.iva.x50.a {
    public final /* synthetic */ com.amazon.aps.iva.x50.a a;

    public k(com.amazon.aps.iva.x50.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.zv.g, com.amazon.aps.iva.x50.a
    public final boolean a() {
        return this.a.a();
    }

    @Override // com.amazon.aps.iva.zv.g, com.amazon.aps.iva.x50.a
    public final void b(boolean z) {
        this.a.b(z);
    }

    @Override // com.amazon.aps.iva.x50.a
    public final Channel c(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        return this.a.c(str);
    }
}
