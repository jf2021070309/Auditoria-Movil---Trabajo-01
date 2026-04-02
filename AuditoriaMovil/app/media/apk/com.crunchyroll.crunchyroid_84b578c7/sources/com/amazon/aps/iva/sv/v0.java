package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class v0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.downloading.e0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ DownloadsManagerImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(DownloadsManagerImpl downloadsManagerImpl) {
        super(1);
        this.h = downloadsManagerImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.ellation.crunchyroll.downloading.e0 e0Var) {
        com.ellation.crunchyroll.downloading.e0 e0Var2 = e0Var;
        com.amazon.aps.iva.yb0.j.f(e0Var2, "it");
        this.h.notify(new u0(e0Var2));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
