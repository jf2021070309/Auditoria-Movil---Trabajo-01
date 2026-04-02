package com.amazon.aps.iva.gp;

import com.amazon.aps.iva.hg.g;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.ContentContainer;
/* compiled from: OfflineWatchScreenModuleImpl.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hg.e> {
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar) {
        super(0);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.hg.e invoke() {
        a aVar = this.h;
        g P = a.k(aVar).P();
        if (P == null) {
            return null;
        }
        ContentContainer h0 = aVar.b().h0();
        j.c(h0);
        return new com.amazon.aps.iva.hg.e(h0, null, P);
    }
}
