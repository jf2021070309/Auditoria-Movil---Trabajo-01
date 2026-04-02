package com.amazon.aps.iva.zo;

import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenDownloadUpsellFlowPresenter.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.b<com.amazon.aps.iva.zo.c> implements com.amazon.aps.iva.pg.a {
    public final com.amazon.aps.iva.xh.b b;
    public final com.amazon.aps.iva.vh.b c;
    public com.amazon.aps.iva.xb0.a<q> d;

    /* compiled from: WatchScreenDownloadUpsellFlowPresenter.kt */
    /* renamed from: com.amazon.aps.iva.zo.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0926a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public C0926a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            a aVar = a.this;
            aVar.d.invoke();
            aVar.getView().M();
            return q.a;
        }
    }

    /* compiled from: WatchScreenDownloadUpsellFlowPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            a.this.b.a(null);
            return q.a;
        }
    }

    /* compiled from: WatchScreenDownloadUpsellFlowPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<q> {
        public static final c h = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ q invoke() {
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.amazon.aps.iva.zo.c cVar, com.amazon.aps.iva.xh.b bVar, com.amazon.aps.iva.vh.b bVar2) {
        super(cVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(cVar, "view");
        this.b = bVar;
        this.c = bVar2;
        this.d = c.h;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.b(new C0926a());
        this.c.b(new b());
    }

    @Override // com.amazon.aps.iva.pg.a
    public final void q2(PlayableAsset playableAsset, com.amazon.aps.iva.pg.b bVar, com.amazon.aps.iva.xb0.a<q> aVar) {
        com.amazon.aps.iva.vh.a aVar2;
        com.amazon.aps.iva.yb0.j.f(playableAsset, "premiumAsset");
        com.amazon.aps.iva.yb0.j.f(bVar, "accessReason");
        com.amazon.aps.iva.yb0.j.f(aVar, "onPremiumContentAccessible");
        this.d = aVar;
        int i = com.amazon.aps.iva.zo.b.a[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                aVar2 = com.amazon.aps.iva.vh.a.SYNC;
            } else {
                throw new h();
            }
        } else {
            aVar2 = com.amazon.aps.iva.vh.a.PLAY;
        }
        this.c.a(playableAsset, aVar2);
    }
}
