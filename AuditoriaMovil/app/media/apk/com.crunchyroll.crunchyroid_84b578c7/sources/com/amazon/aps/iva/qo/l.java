package com.amazon.aps.iva.qo;

import com.amazon.aps.iva.ez.g;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
/* compiled from: WatchScreenPresenter.kt */
/* loaded from: classes2.dex */
public class l extends com.amazon.aps.iva.wy.b<v> implements com.amazon.aps.iva.qo.k {
    public final w b;
    public final com.amazon.aps.iva.ll.g c;
    public final com.amazon.aps.iva.xo.a d;
    public final com.amazon.aps.iva.ro.b e;
    public final u f;
    public final com.amazon.aps.iva.gn.b g;
    public final com.amazon.aps.iva.cj.i h;
    public final com.amazon.aps.iva.qo.a i;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hf.a> j;
    public final com.amazon.aps.iva.ye.f k;

    /* compiled from: WatchScreenPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            l lVar = l.this;
            if (!lVar.i.G()) {
                if (l.q6(lVar).z1() > 0) {
                    l.q6(lVar).a1();
                } else {
                    l.q6(lVar).closeScreen();
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.hp.c>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.hp.c> gVar) {
            gVar.e(new m(l.q6(l.this)));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends LabelUiModel>, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends LabelUiModel> gVar) {
            gVar.e(new n(l.q6(l.this)));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.sf.e>, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.sf.e> gVar) {
            gVar.e(new o(l.this));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.qo.g>, com.amazon.aps.iva.kb0.q> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.qo.g> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.qo.g> gVar2 = gVar;
            l lVar = l.this;
            gVar2.c(new p(lVar));
            gVar2.e(new s(lVar));
            gVar2.b(new t(lVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nl.a, com.amazon.aps.iva.kb0.q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.nl.a aVar) {
            boolean z;
            com.amazon.aps.iva.nl.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$observeEvent");
            l lVar = l.this;
            long x = com.amazon.aps.iva.gr.n.x(lVar.h.T());
            lVar.h.Q().f();
            Long valueOf = Long.valueOf(x - 10);
            long j = 0;
            if (valueOf.longValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                j = valueOf.longValue();
            }
            lVar.b.V7(j, aVar2.a);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.u70.i, com.amazon.aps.iva.kb0.q> {
        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.u70.i iVar) {
            com.amazon.aps.iva.u70.i iVar2 = iVar;
            com.amazon.aps.iva.yb0.j.f(iVar2, "$this$observeEvent");
            l.q6(l.this).showSnackbar(iVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<PlayableAsset> {
        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final PlayableAsset invoke() {
            return l.this.b.getCurrentAsset();
        }
    }

    /* compiled from: WatchScreenPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<DownloadButtonState, com.amazon.aps.iva.kb0.q> {
        public i() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(DownloadButtonState downloadButtonState) {
            DownloadButtonState downloadButtonState2 = downloadButtonState;
            v q6 = l.q6(l.this);
            com.amazon.aps.iva.yb0.j.e(downloadButtonState2, "it");
            q6.Z6(downloadButtonState2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q> {
        public j() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar) {
            com.amazon.aps.iva.yb0.j.f(qVar, "$this$observeEvent");
            l.q6(l.this).closeScreen();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class k implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public k(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof com.amazon.aps.iva.i5.w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.amazon.aps.iva.ye.f fVar, com.amazon.aps.iva.cj.i iVar, com.amazon.aps.iva.ll.g gVar, com.amazon.aps.iva.gn.c cVar, com.amazon.aps.iva.qo.a aVar, u uVar, v vVar, w wVar, com.amazon.aps.iva.ro.c cVar2, com.amazon.aps.iva.xo.d dVar, com.amazon.aps.iva.xb0.a aVar2) {
        super(vVar, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(vVar, "view");
        com.amazon.aps.iva.yb0.j.f(gVar, "audioSettingsMonitor");
        com.amazon.aps.iva.yb0.j.f(uVar, "watchScreenRouter");
        com.amazon.aps.iva.yb0.j.f(cVar, "shareComponent");
        com.amazon.aps.iva.yb0.j.f(iVar, "player");
        com.amazon.aps.iva.yb0.j.f(aVar, "playerBackButtonHandler");
        com.amazon.aps.iva.yb0.j.f(fVar, "castStateProvider");
        this.b = wVar;
        this.c = gVar;
        this.d = dVar;
        this.e = cVar2;
        this.f = uVar;
        this.g = cVar;
        this.h = iVar;
        this.i = aVar;
        this.j = aVar2;
        this.k = fVar;
    }

    public static final /* synthetic */ v q6(l lVar) {
        return lVar.getView();
    }

    @Override // com.amazon.aps.iva.qo.k
    public final void A5() {
        this.f.A();
    }

    @Override // com.amazon.aps.iva.cl.b
    public final void E0() {
        g.c a2;
        com.amazon.aps.iva.no.b bVar;
        PlayableAsset playableAsset;
        w wVar = this.b;
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) wVar.L8().getValue();
        if (gVar != null && (a2 = gVar.a()) != null && (bVar = (com.amazon.aps.iva.no.b) a2.a) != null && (playableAsset = bVar.a) != null) {
            t6(wVar.getCurrentAsset(), playableAsset);
        }
    }

    @Override // com.amazon.aps.iva.qo.k
    public final void E3() {
        PlayableAsset currentAsset = this.b.getCurrentAsset();
        if (currentAsset != null) {
            this.f.C(currentAsset);
        }
    }

    @Override // com.amazon.aps.iva.qo.k
    public final void H() {
        this.h.Q().f();
        this.b.l0(true);
    }

    @Override // com.amazon.aps.iva.so.b
    public final void N2(PlayableAsset playableAsset) {
        t6(this.b.getCurrentAsset(), playableAsset);
    }

    @Override // com.amazon.aps.iva.qo.k
    public final void a() {
        this.j.invoke().Oa(new a());
    }

    @Override // com.amazon.aps.iva.qo.k
    public final void b() {
        this.e.b();
        this.b.l0(false);
    }

    @Override // com.amazon.aps.iva.cl.b
    public final void f1() {
    }

    @Override // com.amazon.aps.iva.cl.b
    public final void h0() {
    }

    @Override // com.amazon.aps.iva.so.b
    public final void j1() {
        PlayableAsset currentAsset = this.b.getCurrentAsset();
        if (currentAsset != null) {
            this.f.C(currentAsset);
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public void onCreate() {
        w wVar = this.b;
        getView().Vc(new com.amazon.aps.iva.ep.c(wVar.o0().d));
        wVar.f4().e(getView(), new k(new b()));
        wVar.h4().e(getView(), new k(new c()));
        wVar.x().e(getView(), new k(new d()));
        wVar.D5().e(getView(), new k(new e()));
        com.amazon.aps.iva.ll.g gVar = this.c;
        com.amazon.aps.iva.ez.e.a(gVar.c(), getView(), new f());
        com.amazon.aps.iva.ez.e.a(gVar.b(), getView(), new g());
        this.h.U(getView().getLifecycle());
        getView().Ka(new h());
        com.amazon.aps.iva.xo.a aVar = this.d;
        aVar.s2().e(getView(), new k(new i()));
        com.amazon.aps.iva.ez.e.a(aVar.M8(), getView(), new j());
    }

    @Override // com.amazon.aps.iva.qo.k
    public final void p(com.amazon.aps.iva.gn.a aVar) {
        PlayableAsset currentAsset = this.b.getCurrentAsset();
        if (currentAsset != null) {
            this.g.w4(aVar, currentAsset);
        }
    }

    @Override // com.amazon.aps.iva.qo.k
    public final void r2(PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "newAsset");
        u6(playableAsset);
    }

    public void r6(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        getView().Xg(str);
    }

    public void s6(com.amazon.aps.iva.sf.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "rating");
        getView().u9(eVar);
    }

    public final void t6(PlayableAsset playableAsset, PlayableAsset playableAsset2) {
        boolean z;
        String audioLocale;
        if (playableAsset != null && (audioLocale = playableAsset.getAudioLocale()) != null && (!com.amazon.aps.iva.oe0.m.b0(audioLocale))) {
            z = true;
        } else {
            z = false;
        }
        if (z && (true ^ com.amazon.aps.iva.oe0.m.b0(playableAsset2.getAudioLocale()))) {
            if (com.amazon.aps.iva.yb0.j.a(playableAsset.getAudioLocale(), playableAsset2.getAudioLocale())) {
                u6(playableAsset2);
                return;
            } else {
                getView().q8(playableAsset2, playableAsset.getAudioLocale());
                return;
            }
        }
        u6(playableAsset2);
    }

    public final void u6(PlayableAsset playableAsset) {
        String str;
        g.c a2;
        com.amazon.aps.iva.no.b bVar;
        PlayableAsset playableAsset2;
        boolean isTryingToCast = this.k.isTryingToCast();
        w wVar = this.b;
        if (isTryingToCast) {
            wVar.c8(playableAsset, null);
            return;
        }
        String id = playableAsset.getId();
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) wVar.L8().getValue();
        if (gVar != null && (a2 = gVar.a()) != null && (bVar = (com.amazon.aps.iva.no.b) a2.a) != null && (playableAsset2 = bVar.a) != null) {
            str = playableAsset2.getId();
        } else {
            str = null;
        }
        boolean a3 = com.amazon.aps.iva.yb0.j.a(id, str);
        com.amazon.aps.iva.cj.i iVar = this.h;
        if (a3 && !iVar.N()) {
            iVar.Q().e();
            return;
        }
        iVar.Q().f();
        wVar.c8(playableAsset, null);
    }
}
