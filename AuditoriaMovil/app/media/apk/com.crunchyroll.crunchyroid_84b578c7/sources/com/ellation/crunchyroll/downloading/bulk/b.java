package com.ellation.crunchyroll.downloading.bulk;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: BulkDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.hg.a, Boolean> {
    public final /* synthetic */ com.amazon.aps.iva.hg.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.hg.a aVar) {
        super(1);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(com.amazon.aps.iva.hg.a aVar) {
        boolean a;
        com.amazon.aps.iva.hg.a aVar2 = aVar;
        j.f(aVar2, "removing");
        com.amazon.aps.iva.hg.a aVar3 = this.h;
        if (aVar3.getSeasonId() != null) {
            a = j.a(aVar3.getSeasonId(), aVar2.getSeasonId());
        } else {
            a = j.a(aVar3.k0(), aVar3.k0());
        }
        return Boolean.valueOf(a);
    }
}
