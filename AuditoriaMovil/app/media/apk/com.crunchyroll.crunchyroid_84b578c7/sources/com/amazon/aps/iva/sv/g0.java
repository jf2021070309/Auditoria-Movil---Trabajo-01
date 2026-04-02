package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
/* compiled from: InternalDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl", f = "InternalDownloadsManager.kt", l = {571}, m = "getDownloadIds")
/* loaded from: classes2.dex */
public final class g0 extends com.amazon.aps.iva.qb0.c {
    public DownloadsManagerImpl h;
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ DownloadsManagerImpl k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(DownloadsManagerImpl downloadsManagerImpl, com.amazon.aps.iva.ob0.d<? super g0> dVar) {
        super(dVar);
        this.k = downloadsManagerImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return DownloadsManagerImpl.f(this.k, null, this);
    }
}
