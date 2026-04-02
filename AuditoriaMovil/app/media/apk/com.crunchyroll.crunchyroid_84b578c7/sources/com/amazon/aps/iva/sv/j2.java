package com.amazon.aps.iva.sv;

import java.util.List;
/* compiled from: LocalVideosManagerFactory.kt */
/* loaded from: classes2.dex */
public final class j2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.m6.c>> {
    public final /* synthetic */ com.amazon.aps.iva.m6.i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.amazon.aps.iva.m6.i iVar) {
        super(0);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final List<? extends com.amazon.aps.iva.m6.c> invoke() {
        List<com.amazon.aps.iva.m6.c> list = this.h.m;
        com.amazon.aps.iva.yb0.j.e(list, "downloadManager.currentDownloads");
        return list;
    }
}
