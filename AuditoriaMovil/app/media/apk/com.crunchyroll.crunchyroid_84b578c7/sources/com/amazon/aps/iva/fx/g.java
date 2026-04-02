package com.amazon.aps.iva.fx;

import com.ellation.crunchyroll.model.Channel;
/* compiled from: DownloadingFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, Channel> {
    public final /* synthetic */ com.amazon.aps.iva.x50.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.x50.a aVar) {
        super(1);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Channel invoke(String str) {
        String str2 = str;
        com.amazon.aps.iva.yb0.j.f(str2, "it");
        Channel c = this.h.c(str2);
        com.amazon.aps.iva.yb0.j.c(c);
        return c;
    }
}
