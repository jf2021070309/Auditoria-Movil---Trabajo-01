package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.sv.s0;
import com.ellation.crunchyroll.downloading.e0;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xg.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ DownloadsManagerImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(DownloadsManagerImpl downloadsManagerImpl) {
        super(1);
        this.h = downloadsManagerImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xg.a aVar) {
        com.amazon.aps.iva.xg.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "it");
        e0.a aVar3 = new e0.a(aVar2.a, aVar2.b, aVar2.d, aVar2.c, e0.b.PAUSED);
        DownloadsManagerImpl downloadsManagerImpl = this.h;
        downloadsManagerImpl.getClass();
        downloadsManagerImpl.notify(new s0(aVar3));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
