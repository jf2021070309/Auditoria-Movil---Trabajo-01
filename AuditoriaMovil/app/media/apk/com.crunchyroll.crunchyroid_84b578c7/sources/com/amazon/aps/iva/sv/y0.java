package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import java.util.List;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class y0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.ellation.crunchyroll.downloading.e0>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ DownloadsManagerImpl h;
    public final /* synthetic */ List<String> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(DownloadsManagerImpl downloadsManagerImpl, List<String> list) {
        super(1);
        this.h = downloadsManagerImpl;
        this.i = list;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.ellation.crunchyroll.downloading.e0> list) {
        List<? extends com.ellation.crunchyroll.downloading.e0> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "downloads");
        this.h.notify(new com.ellation.crunchyroll.downloading.i(list2, this.i));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
