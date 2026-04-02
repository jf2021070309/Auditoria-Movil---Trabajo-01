package com.amazon.aps.iva.qo;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ap.g;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.el.h0;
import com.amazon.aps.iva.gn.c;
import com.amazon.aps.iva.j9.i0;
import com.amazon.aps.iva.lo.c;
import com.amazon.aps.iva.ph.a;
import com.amazon.aps.iva.ro.b;
import com.crunchyroll.cast.castlistener.VideoCastController;
import com.crunchyroll.watchscreen.screen.WatchScreenActivity;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.ellation.crunchyroll.ui.duration.SmallDurationFormatter;
/* compiled from: WatchScreenModule.kt */
/* loaded from: classes2.dex */
public final class j implements com.amazon.aps.iva.qo.i {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] s = {com.amazon.aps.iva.k.q.a(j.class, "playerViewModel", "getPlayerViewModel()Lcom/crunchyroll/watchscreen/player/WatchScreenPlayerViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(j.class, "viewModel", "getViewModel()Lcom/crunchyroll/watchscreen/screen/WatchScreenViewModel;", 0), com.amazon.aps.iva.k.q.a(j.class, "matureFlowViewModel", "getMatureFlowViewModel()Lcom/crunchyroll/watchscreen/screen/mature/WatchScreenMatureFlowViewModel;", 0), com.amazon.aps.iva.k.q.a(j.class, "assetsViewModel", "getAssetsViewModel()Lcom/crunchyroll/watchscreen/screen/assets/WatchScreenAssetsViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(j.class, "downloadingViewModel", "getDownloadingViewModel()Lcom/crunchyroll/watchscreen/screen/downloading/WatchScreenDownloadingViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(j.class, "castViewModel", "getCastViewModel()Lcom/crunchyroll/watchscreen/cast/WatchScreenCastViewModelImpl;", 0)};
    public final com.amazon.aps.iva.kb0.m a;
    public final com.amazon.aps.iva.at.c b;
    public final com.amazon.aps.iva.bp.b c;
    public final com.amazon.aps.iva.lo.f d;
    public final com.amazon.aps.iva.ez.a e;
    public final com.amazon.aps.iva.ez.a f;
    public final com.amazon.aps.iva.kb0.m g;
    public final com.amazon.aps.iva.oo.d h;
    public final com.amazon.aps.iva.ip.a i;
    public final com.amazon.aps.iva.fp.b j;
    public final com.amazon.aps.iva.fg.g k;
    public final com.amazon.aps.iva.ez.a l;
    public final com.amazon.aps.iva.ez.a m;
    public final com.amazon.aps.iva.qo.l n;
    public final com.amazon.aps.iva.so.a o;
    public final com.amazon.aps.iva.sg.a p;
    public final VideoCastController q;
    public final com.amazon.aps.iva.ez.a r;

    /* compiled from: WatchScreenModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.so.n> {
        public final /* synthetic */ WatchScreenActivity i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WatchScreenActivity watchScreenActivity) {
            super(1);
            this.i = watchScreenActivity;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.so.n invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.vo.e fVar;
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            j jVar = j.this;
            i0 i0Var = new i0(jVar.b());
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                TalkboxService talkboxService = dVar.getTalkboxService();
                com.amazon.aps.iva.x50.t tVar = jVar.m().a().c;
                com.amazon.aps.iva.yb0.j.f(talkboxService, "talkboxService");
                com.amazon.aps.iva.lo.f fVar2 = jVar.d;
                com.amazon.aps.iva.yb0.j.f(fVar2, "nextAssetInteractor");
                com.amazon.aps.iva.bp.b bVar = jVar.c;
                com.amazon.aps.iva.yb0.j.f(bVar, "watchScreenInteractor");
                com.amazon.aps.iva.yb0.j.f(tVar, "containerResourceType");
                int i = com.amazon.aps.iva.vo.d.a[tVar.ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3 && i != 4) {
                        if (i == 5) {
                            fVar = new f1();
                        } else {
                            throw new IllegalArgumentException("Unexpected " + tVar + " containerResourceType");
                        }
                    } else {
                        fVar = new com.amazon.aps.iva.vo.g(bVar);
                    }
                } else {
                    fVar = new com.amazon.aps.iva.vo.f(talkboxService, bVar, fVar2);
                }
                com.amazon.aps.iva.lo.d dVar2 = c.a.a;
                if (dVar2 != null) {
                    InternalDownloadsManager a = dVar2.l().a();
                    WatchScreenActivity watchScreenActivity = this.i;
                    com.amazon.aps.iva.yb0.j.f(watchScreenActivity, "context");
                    com.amazon.aps.iva.mt.m mVar = new com.amazon.aps.iva.mt.m(watchScreenActivity);
                    DurationFormatter create = DurationFormatter.Companion.create(watchScreenActivity);
                    com.amazon.aps.iva.at.c cVar = jVar.b;
                    SmallDurationFormatter create$default = SmallDurationFormatter.Companion.create$default(SmallDurationFormatter.Companion, watchScreenActivity, null, 2, null);
                    com.amazon.aps.iva.yb0.j.f(a, "downloadsManager");
                    com.amazon.aps.iva.yb0.j.f(create, "durationFormatter");
                    com.amazon.aps.iva.yb0.j.f(cVar, "contentAvailabilityProvider");
                    com.amazon.aps.iva.yb0.j.f(create$default, "smallDurationFormatter");
                    com.amazon.aps.iva.uo.c cVar2 = new com.amazon.aps.iva.uo.c(a, mVar, create, cVar, create$default);
                    com.amazon.aps.iva.x50.t tVar2 = jVar.m().a().c;
                    com.amazon.aps.iva.yb0.j.f(tVar2, "containerResourceType");
                    return new com.amazon.aps.iva.so.n(i0Var, fVar, new com.amazon.aps.iva.uo.g(cVar2, new com.amazon.aps.iva.uo.e(tVar2)));
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: WatchScreenModule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.mo.d> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.mo.d invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                com.amazon.aps.iva.cj.h player = dVar.getPlayerFeature().getPlayer();
                j jVar = j.this;
                w b = jVar.b();
                com.amazon.aps.iva.oo.m mVar = (com.amazon.aps.iva.oo.m) jVar.e.getValue(jVar, j.s[0]);
                com.amazon.aps.iva.lo.d dVar2 = c.a.a;
                if (dVar2 != null) {
                    com.amazon.aps.iva.ef.a castMediaLoader = dVar2.a().getCastMediaLoader();
                    com.amazon.aps.iva.lo.d dVar3 = c.a.a;
                    if (dVar3 != null) {
                        com.amazon.aps.iva.ye.f castStateProvider = dVar3.a().getCastStateProvider();
                        com.amazon.aps.iva.lo.d dVar4 = c.a.a;
                        if (dVar4 != null) {
                            return new com.amazon.aps.iva.mo.d(player, b, mVar, castMediaLoader, castStateProvider, dVar4.a().getSessionManagerProvider());
                        }
                        com.amazon.aps.iva.yb0.j.m("dependencies");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("dependencies");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: WatchScreenModule.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<Boolean> {
        public c(com.amazon.aps.iva.lo.d dVar) {
            super(0, dVar, com.amazon.aps.iva.lo.b.class, "isUserPremium", "isUserPremium()Z", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            return Boolean.valueOf(((com.amazon.aps.iva.lo.b) this.receiver).b());
        }
    }

    /* compiled from: WatchScreenModule.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.xo.d> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.xo.d invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            j jVar = j.this;
            w b = jVar.b();
            com.amazon.aps.iva.so.n k = jVar.k();
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                return new com.amazon.aps.iva.xo.d(b, k, dVar.l().a(), true);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: WatchScreenModule.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ap.g> {
        public final /* synthetic */ WatchScreenActivity h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(WatchScreenActivity watchScreenActivity) {
            super(0);
            this.h = watchScreenActivity;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ap.g invoke() {
            Intent intent = this.h.getIntent();
            com.amazon.aps.iva.yb0.j.e(intent, "activity.intent");
            return g.a.a(intent);
        }
    }

    /* compiled from: WatchScreenModule.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hg.g> {
        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.hg.g invoke() {
            j jVar = j.this;
            jVar.getClass();
            return com.amazon.aps.iva.e.w.u(((com.amazon.aps.iva.xo.d) jVar.m.getValue(jVar, j.s[4])).P(), jVar.k().P());
        }
    }

    /* compiled from: WatchScreenModule.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.fp.e> {
        public static final g h = new g();

        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.fp.e invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                return new com.amazon.aps.iva.fp.e(dVar.getMaturePreferenceInteractor());
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: WatchScreenModule.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.oo.m> {
        public final /* synthetic */ WatchScreenActivity i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(WatchScreenActivity watchScreenActivity) {
            super(1);
            this.i = watchScreenActivity;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.oo.m invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                com.amazon.aps.iva.cj.h player = dVar.getPlayerFeature().getPlayer();
                com.amazon.aps.iva.lo.d dVar2 = c.a.a;
                if (dVar2 != null) {
                    com.amazon.aps.iva.tx.c a = dVar2.j().a();
                    j jVar = j.this;
                    com.amazon.aps.iva.at.c cVar = jVar.b;
                    com.amazon.aps.iva.po.c cVar2 = new com.amazon.aps.iva.po.c();
                    com.amazon.aps.iva.lo.d dVar3 = c.a.a;
                    if (dVar3 != null) {
                        com.amazon.aps.iva.aj.b c = dVar3.e().c();
                        com.amazon.aps.iva.yb0.j.f(a, "streamsInteractor");
                        com.amazon.aps.iva.yb0.j.f(cVar, "contentAvailabilityProvider");
                        com.amazon.aps.iva.yb0.j.f(c, "maturityRestrictionProvider");
                        com.amazon.aps.iva.po.f fVar = new com.amazon.aps.iva.po.f(a, cVar, cVar2, c);
                        w b = jVar.b();
                        com.amazon.aps.iva.oo.c cVar3 = new com.amazon.aps.iva.oo.c(jVar.b);
                        Context applicationContext = this.i.getApplicationContext();
                        com.amazon.aps.iva.yb0.j.e(applicationContext, "activity.applicationContext");
                        return new com.amazon.aps.iva.oo.m(player, fVar, b, cVar3, true, applicationContext);
                    }
                    com.amazon.aps.iva.yb0.j.m("dependencies");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: WatchScreenModule.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.gn.c> {
        public final /* synthetic */ WatchScreenActivity h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(WatchScreenActivity watchScreenActivity) {
            super(0);
            this.h = watchScreenActivity;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.gn.c invoke() {
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                return c.a.a(this.h, dVar.d());
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* renamed from: com.amazon.aps.iva.qo.j$j  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0650j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0650j(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: WatchScreenModule.kt */
    /* loaded from: classes2.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, PlayableAsset> {
        public p() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final PlayableAsset invoke(String str) {
            String str2 = str;
            com.amazon.aps.iva.yb0.j.f(str2, "it");
            com.amazon.aps.iva.vo.c V0 = j.this.k().V0();
            if (V0 != null) {
                return V0.b(str2);
            }
            return null;
        }
    }

    /* compiled from: WatchScreenModule.kt */
    /* loaded from: classes2.dex */
    public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hg.e> {
        public q() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.hg.e invoke() {
            j jVar = j.this;
            com.amazon.aps.iva.hg.g P = jVar.k().P();
            if (P == null) {
                return null;
            }
            ContentContainer h0 = jVar.b().h0();
            com.amazon.aps.iva.yb0.j.c(h0);
            return new com.amazon.aps.iva.hg.e(h0, null, P);
        }
    }

    /* compiled from: WatchScreenModule.kt */
    /* loaded from: classes2.dex */
    public static final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, x> {
        public r() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final x invoke(androidx.lifecycle.p pVar) {
            androidx.lifecycle.p pVar2 = pVar;
            com.amazon.aps.iva.yb0.j.f(pVar2, "savedStateHandle");
            j jVar = j.this;
            com.amazon.aps.iva.ap.g m = jVar.m();
            com.amazon.aps.iva.bp.b bVar = jVar.c;
            com.amazon.aps.iva.lo.f fVar = jVar.d;
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                return new x(m, pVar2, bVar, fVar, dVar.l().l());
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: WatchScreenModule.kt */
    /* loaded from: classes2.dex */
    public static final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<PlayableAsset> {
        public s() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final PlayableAsset invoke() {
            return j.this.b().getCurrentAsset();
        }
    }

    /* compiled from: WatchScreenModule.kt */
    /* loaded from: classes2.dex */
    public static final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hf.a> {
        public final /* synthetic */ WatchScreenActivity h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(WatchScreenActivity watchScreenActivity) {
            super(0);
            this.h = watchScreenActivity;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.hf.a invoke() {
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                com.amazon.aps.iva.ff.a h = dVar.h();
                FragmentManager supportFragmentManager = this.h.getSupportFragmentManager();
                com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "activity.supportFragmentManager");
                return h.a(supportFragmentManager);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    public j(WatchScreenActivity watchScreenActivity) {
        com.amazon.aps.iva.lo.f gVar;
        com.amazon.aps.iva.yb0.j.f(watchScreenActivity, "activity");
        this.a = com.amazon.aps.iva.kb0.f.b(new e(watchScreenActivity));
        this.b = new com.amazon.aps.iva.at.c(new c(c.a.a()), com.amazon.aps.iva.at.b.h);
        this.c = c.a.a().f().b(m().a(), watchScreenActivity);
        EtpContentService contentService = c.a.a().getContentService();
        com.amazon.aps.iva.x50.t tVar = m().a().c;
        com.amazon.aps.iva.yb0.j.f(contentService, "contentService");
        com.amazon.aps.iva.yb0.j.f(tVar, "resourceType");
        int i2 = com.amazon.aps.iva.lo.e.a[tVar.ordinal()];
        if (i2 != 1 && i2 != 2) {
            gVar = new defpackage.i();
        } else {
            gVar = new com.amazon.aps.iva.lo.g(contentService);
        }
        this.d = gVar;
        com.amazon.aps.iva.ez.a aVar = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.oo.m.class, new C0650j(watchScreenActivity), new h(watchScreenActivity));
        this.e = aVar;
        this.f = new com.amazon.aps.iva.ez.a(x.class, new k(watchScreenActivity), new r());
        this.g = com.amazon.aps.iva.kb0.f.b(new i(watchScreenActivity));
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = s;
        this.h = new com.amazon.aps.iva.oo.d(watchScreenActivity, (com.amazon.aps.iva.oo.m) aVar.getValue(this, lVarArr[0]));
        boolean c2 = com.amazon.aps.iva.aq.k.n(watchScreenActivity).c();
        LiveData<h0> sizeState = watchScreenActivity.mi().c.getPlayerView().getSizeState();
        com.amazon.aps.iva.yb0.j.f(sizeState, "sizeState");
        this.i = new com.amazon.aps.iva.ip.a(c2, watchScreenActivity, sizeState);
        com.amazon.aps.iva.ez.a aVar2 = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.fp.e.class, new l(watchScreenActivity), g.h);
        com.amazon.aps.iva.fp.b bVar = new com.amazon.aps.iva.fp.b(watchScreenActivity, (com.amazon.aps.iva.fp.d) aVar2.getValue(this, lVarArr[2]));
        com.ellation.crunchyroll.mvp.lifecycle.a.a(bVar, watchScreenActivity);
        this.j = bVar;
        com.amazon.aps.iva.fg.a l2 = c.a.a().l();
        LifecycleCoroutineScopeImpl O = com.amazon.aps.iva.ab.x.O(watchScreenActivity);
        com.amazon.aps.iva.iw.c m2 = c.a.a().l().m(watchScreenActivity);
        com.amazon.aps.iva.yb0.j.f(m2, "matureContentDialogRouter");
        com.amazon.aps.iva.yo.b bVar2 = new com.amazon.aps.iva.yo.b((com.amazon.aps.iva.fp.d) aVar2.getValue(this, lVarArr[2]), m2, watchScreenActivity);
        com.ellation.crunchyroll.mvp.lifecycle.a.a(bVar2, watchScreenActivity);
        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        com.amazon.aps.iva.xh.b a2 = a.C0616a.a(c.a.a().c(), watchScreenActivity, null, null, null, null, 30);
        com.amazon.aps.iva.z20.g p2 = c.a.a().c().p(watchScreenActivity);
        com.amazon.aps.iva.yb0.j.f(a2, "upgradeFlowRouter");
        com.amazon.aps.iva.yb0.j.f(p2, "dialogRouter");
        com.amazon.aps.iva.zo.a aVar3 = new com.amazon.aps.iva.zo.a(watchScreenActivity, a2, p2);
        com.ellation.crunchyroll.mvp.lifecycle.a.a(aVar3, watchScreenActivity);
        com.amazon.aps.iva.p00.c v = l2.v(watchScreenActivity, O, bVar2, aVar3, c.a.a().g().invoke(watchScreenActivity), new p(), new q());
        this.k = v;
        this.l = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.so.n.class, new m(watchScreenActivity), new a(watchScreenActivity));
        com.amazon.aps.iva.ez.a aVar4 = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.xo.d.class, new n(watchScreenActivity), new d());
        this.m = aVar4;
        w b2 = b();
        com.amazon.aps.iva.tl.b g2 = c.a.a().getPlayerFeature().g();
        com.amazon.aps.iva.xo.d dVar = (com.amazon.aps.iva.xo.d) aVar4.getValue(this, lVarArr[4]);
        com.amazon.aps.iva.ro.c a3 = b.a.a(new s());
        u invoke = c.a.a().k().invoke(watchScreenActivity, Boolean.TRUE);
        com.amazon.aps.iva.qo.l lVar = new com.amazon.aps.iva.qo.l(c.a.a().a().getCastStateProvider(), c.a.a().getPlayerFeature().getPlayer(), g2, a(), watchScreenActivity, invoke, watchScreenActivity, b2, a3, dVar, new t(watchScreenActivity));
        this.n = lVar;
        this.o = new com.amazon.aps.iva.so.a(v, c.a.a().l().a(), m().a().c, lVar);
        this.p = c.a.a().l().E(watchScreenActivity, new f(), k(), (com.amazon.aps.iva.xo.d) aVar4.getValue(this, lVarArr[4]));
        VideoCastController createCastController = c.a.a().a().createCastController(watchScreenActivity);
        this.q = createCastController;
        this.r = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.mo.d.class, new o(watchScreenActivity), new b());
        a.C0616a.a(c.a.a().c(), watchScreenActivity, null, null, null, null, 30);
        createCastController.addEventListener(d());
        watchScreenActivity.getLifecycle().addObserver(c.a.a().getPlayerFeature().getPlayer().S());
    }

    @Override // com.amazon.aps.iva.qo.i
    public final com.amazon.aps.iva.gn.c a() {
        return (com.amazon.aps.iva.gn.c) this.g.getValue();
    }

    @Override // com.amazon.aps.iva.qo.i
    public final w b() {
        return (w) this.f.getValue(this, s[1]);
    }

    @Override // com.amazon.aps.iva.qo.i
    public final com.amazon.aps.iva.oo.d c() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.qo.i
    public final VideoCastController e() {
        return this.q;
    }

    @Override // com.amazon.aps.iva.qo.i
    public final com.amazon.aps.iva.qo.k f() {
        return this.n;
    }

    @Override // com.amazon.aps.iva.qo.i
    public final com.amazon.aps.iva.so.a g() {
        return this.o;
    }

    @Override // com.amazon.aps.iva.qo.i
    public final com.amazon.aps.iva.sg.a h() {
        return this.p;
    }

    @Override // com.amazon.aps.iva.qo.i
    public final com.amazon.aps.iva.ip.a i() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.qo.i
    public final com.amazon.aps.iva.fp.b j() {
        return this.j;
    }

    public final com.amazon.aps.iva.so.n k() {
        return (com.amazon.aps.iva.so.n) this.l.getValue(this, s[3]);
    }

    @Override // com.amazon.aps.iva.qo.i
    /* renamed from: l */
    public final com.amazon.aps.iva.mo.d d() {
        return (com.amazon.aps.iva.mo.d) this.r.getValue(this, s[5]);
    }

    public final com.amazon.aps.iva.ap.g m() {
        return (com.amazon.aps.iva.ap.g) this.a.getValue();
    }
}
