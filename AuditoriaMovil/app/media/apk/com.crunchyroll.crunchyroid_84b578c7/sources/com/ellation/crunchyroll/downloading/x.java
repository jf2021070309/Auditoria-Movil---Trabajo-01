package com.ellation.crunchyroll.downloading;

import java.util.List;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.xg.a>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ DownloadsManagerImpl h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(DownloadsManagerImpl downloadsManagerImpl, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        super(1);
        this.h = downloadsManagerImpl;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.xg.a> list) {
        List<? extends com.amazon.aps.iva.xg.a> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "it");
        this.h.p.invoke(list2);
        this.i.invoke();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
