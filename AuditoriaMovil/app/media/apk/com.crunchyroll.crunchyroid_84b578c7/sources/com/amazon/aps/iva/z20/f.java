package com.amazon.aps.iva.z20;

import com.amazon.aps.iva.wy.j;
import com.ellation.crunchyroll.api.etp.subscription.model.Product;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.List;
/* compiled from: OfflineAccessUpsellDialogPresenter.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.wy.b<h> implements e {
    public final PlayableAsset b;
    public final com.amazon.aps.iva.vh.a c;
    public final a d;
    public final com.amazon.aps.iva.r20.a e;
    public final com.amazon.aps.iva.wh.d f;

    public f(d dVar, PlayableAsset playableAsset, com.amazon.aps.iva.vh.a aVar, b bVar, com.amazon.aps.iva.r20.b bVar2, com.amazon.aps.iva.wh.d dVar2) {
        super(dVar, new j[0]);
        this.b = playableAsset;
        this.c = aVar;
        this.d = bVar;
        this.e = bVar2;
        this.f = dVar2;
    }

    @Override // com.amazon.aps.iva.z20.e
    public final void W0(com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.vw.a aVar) {
        this.e.onUpsellFlowEntryPointClick(bVar, this.b, aVar);
        getView().dismiss();
    }

    @Override // com.amazon.aps.iva.z20.e
    public final void e() {
        getView().cancel();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        getView().q6(this.b.getThumbnails());
        List<Product> c = this.f.c();
        a aVar = this.d;
        getView().w2(aVar.b(c));
        getView().S8(aVar.a(this.c, c));
        this.e.b();
    }
}
