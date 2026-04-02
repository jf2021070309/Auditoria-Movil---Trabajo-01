package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class c1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xg.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ DownloadsManagerImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(DownloadsManagerImpl downloadsManagerImpl) {
        super(1);
        this.h = downloadsManagerImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xg.a aVar) {
        com.amazon.aps.iva.xg.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "input");
        DownloadsManagerImpl downloadsManagerImpl = this.h;
        String str = aVar2.a;
        downloadsManagerImpl.z(str);
        downloadsManagerImpl.notify(new t0(str));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
