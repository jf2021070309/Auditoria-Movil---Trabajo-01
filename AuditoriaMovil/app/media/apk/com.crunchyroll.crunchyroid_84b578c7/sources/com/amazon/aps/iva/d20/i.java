package com.amazon.aps.iva.d20;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.l40.b1;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: MatureFlowPresenter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.wy.b<com.amazon.aps.iva.j00.a> implements com.amazon.aps.iva.ng.a, com.amazon.aps.iva.o30.b {
    public final com.amazon.aps.iva.d20.a b;
    public final com.amazon.aps.iva.lg.a c;
    public final com.amazon.aps.iva.o30.c d;
    public com.amazon.aps.iva.xb0.a<q> e;
    public l<? super PlayableAsset, q> f;
    public com.amazon.aps.iva.pg.b g;

    /* compiled from: MatureFlowPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements l<PlayableAsset, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(PlayableAsset playableAsset) {
            com.amazon.aps.iva.yb0.j.f(playableAsset, "it");
            com.amazon.aps.iva.xb0.a<q> aVar = i.this.e;
            if (aVar != null) {
                aVar.invoke();
            }
            return q.a;
        }
    }

    public i(com.amazon.aps.iva.j00.a aVar, b bVar, com.amazon.aps.iva.lg.a aVar2, b1 b1Var) {
        super(aVar, bVar);
        this.b = bVar;
        this.c = aVar2;
        this.d = b1Var;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.c.b(new a());
    }

    @Override // com.amazon.aps.iva.ng.a
    public final void y4(PlayableAsset playableAsset, com.amazon.aps.iva.r00.c cVar, com.amazon.aps.iva.pg.b bVar) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "matureAsset");
        com.amazon.aps.iva.yb0.j.f(bVar, "accessReason");
        this.f = cVar;
        this.g = bVar;
        this.e = new h(this, playableAsset);
        this.c.a(playableAsset);
    }
}
