package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.sv.x0;
import com.ellation.crunchyroll.downloading.e0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.xg.a>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ DownloadsManagerImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(DownloadsManagerImpl downloadsManagerImpl) {
        super(1);
        this.h = downloadsManagerImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.xg.a> list) {
        List<? extends com.amazon.aps.iva.xg.a> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "inputs");
        List<? extends com.amazon.aps.iva.xg.a> list3 = list2;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list3));
        for (com.amazon.aps.iva.xg.a aVar : list3) {
            arrayList.add(f0.a(aVar, e0.b.NEW));
        }
        DownloadsManagerImpl downloadsManagerImpl = this.h;
        downloadsManagerImpl.getClass();
        downloadsManagerImpl.notify(new x0(arrayList));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
