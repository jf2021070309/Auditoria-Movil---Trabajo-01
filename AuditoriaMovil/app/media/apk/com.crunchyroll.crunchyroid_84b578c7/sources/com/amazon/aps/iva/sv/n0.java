package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.List;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class n0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.ellation.crunchyroll.downloading.e0>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ DownloadsManagerImpl h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<List<? extends PlayableAsset>, com.amazon.aps.iva.kb0.q> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(DownloadsManagerImpl downloadsManagerImpl, String str, String str2, com.amazon.aps.iva.b10.r rVar) {
        super(1);
        this.h = downloadsManagerImpl;
        this.i = str;
        this.j = str2;
        this.k = rVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.ellation.crunchyroll.downloading.e0> list) {
        List<? extends com.ellation.crunchyroll.downloading.e0> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "localVideos");
        DownloadsManagerImpl downloadsManagerImpl = this.h;
        com.amazon.aps.iva.se0.i.d(downloadsManagerImpl.n, downloadsManagerImpl.o.a(), null, new m0(list2, this.h, this.i, this.j, this.k, null), 2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
