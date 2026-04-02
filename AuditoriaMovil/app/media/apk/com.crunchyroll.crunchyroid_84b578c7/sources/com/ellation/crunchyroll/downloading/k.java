package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.sv.q0;
import com.ellation.crunchyroll.downloading.e0;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.xg.a, Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ DownloadsManagerImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DownloadsManagerImpl downloadsManagerImpl) {
        super(2);
        this.h = downloadsManagerImpl;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xg.a aVar, Throwable th) {
        com.amazon.aps.iva.xg.a aVar2 = aVar;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(aVar2, "input");
        com.amazon.aps.iva.yb0.j.f(th2, "throwable");
        e0.a aVar3 = new e0.a(aVar2.a, aVar2.b, aVar2.d, aVar2.c, e0.b.FAILED);
        DownloadsManagerImpl downloadsManagerImpl = this.h;
        downloadsManagerImpl.getClass();
        downloadsManagerImpl.notify(new q0(aVar3, th2));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
