package com.amazon.aps.iva.r00;

import com.amazon.aps.iva.p00.c;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
/* compiled from: DownloadAccessPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<com.amazon.aps.iva.q00.a> implements com.amazon.aps.iva.og.a {
    public final InternalDownloadsManager b;
    public final com.amazon.aps.iva.ng.a c;
    public final com.amazon.aps.iva.aj.a d;
    public final com.amazon.aps.iva.pg.a e;
    public final com.amazon.aps.iva.at.a f;
    public final boolean g;
    public final com.amazon.aps.iva.q00.d h;
    public final com.amazon.aps.iva.zv.c i;

    /* compiled from: DownloadAccessPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ PlayableAsset i;
        public final /* synthetic */ com.amazon.aps.iva.pg.b j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PlayableAsset playableAsset, com.amazon.aps.iva.pg.b bVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
            super(1);
            this.i = playableAsset;
            this.j = bVar;
            this.k = aVar;
            this.l = aVar2;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            e eVar = e.this;
            com.amazon.aps.iva.at.a aVar = eVar.f;
            PlayableAsset playableAsset = this.i;
            String a = aVar.a(playableAsset);
            if (playableAsset.getExtendedMaturityRating() != null) {
                ExtendedMaturityRating extendedMaturityRating = playableAsset.getExtendedMaturityRating();
                com.amazon.aps.iva.yb0.j.c(extendedMaturityRating);
                if (eVar.d.b(extendedMaturityRating.getRating())) {
                    eVar.getView().Z4(playableAsset);
                    return com.amazon.aps.iva.kb0.q.a;
                }
            }
            boolean a2 = com.amazon.aps.iva.yb0.j.a(a, "matureBlocked");
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2 = this.l;
            com.amazon.aps.iva.pg.b bVar = this.j;
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar3 = this.k;
            if (a2) {
                eVar.c.y4(playableAsset, new c(eVar, bVar, aVar2, aVar3), bVar);
                aVar3.invoke();
            } else if (com.amazon.aps.iva.yb0.j.a(a, "premium")) {
                eVar.e.q2(playableAsset, bVar, aVar2);
                aVar3.invoke();
            } else {
                com.amazon.aps.iva.pg.b bVar2 = com.amazon.aps.iva.pg.b.PLAY;
                if (bVar == bVar2 && !booleanValue) {
                    eVar.getView().P7();
                    aVar3.invoke();
                } else {
                    com.amazon.aps.iva.pg.b bVar3 = com.amazon.aps.iva.pg.b.SYNC;
                    if (bVar == bVar3 && !eVar.g) {
                        eVar.getView().showSnackbar(com.amazon.aps.iva.bt.a.b);
                        aVar3.invoke();
                    } else if (bVar == bVar3 && eVar.h.a()) {
                        eVar.getView().I3(aVar2);
                        aVar3.invoke();
                    } else if (bVar == bVar2) {
                        eVar.i.w1(playableAsset.getId(), aVar2, new d(eVar, aVar3));
                    } else {
                        aVar2.invoke();
                    }
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c.b bVar, InternalDownloadsManager internalDownloadsManager, com.amazon.aps.iva.ng.a aVar, com.amazon.aps.iva.aj.a aVar2, com.amazon.aps.iva.pg.a aVar3, com.amazon.aps.iva.gg.a aVar4, boolean z, com.amazon.aps.iva.q00.d dVar, com.amazon.aps.iva.zv.c cVar) {
        super(bVar, cVar);
        com.amazon.aps.iva.yb0.j.f(aVar, "matureFlowComponent");
        com.amazon.aps.iva.yb0.j.f(aVar3, "downloadAccessUpsellFlowComponent");
        this.b = internalDownloadsManager;
        this.c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.g = z;
        this.h = dVar;
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.og.a
    public final void j2(PlayableAsset playableAsset, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        q6(playableAsset, com.amazon.aps.iva.pg.b.SYNC, aVar, b.h);
    }

    public final void q6(PlayableAsset playableAsset, com.amazon.aps.iva.pg.b bVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        String id = playableAsset.getId();
        a aVar3 = new a(playableAsset, bVar, aVar2, aVar);
        if (!this.g) {
            aVar3.invoke(Boolean.TRUE);
            return;
        }
        f fVar = new f(aVar3);
        this.b.P0(id, new g(aVar3), fVar);
    }
}
