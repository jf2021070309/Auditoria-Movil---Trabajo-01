package com.amazon.aps.iva.gp;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ap.g;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.el.h0;
import com.amazon.aps.iva.gn.c;
import com.amazon.aps.iva.j9.i0;
import com.amazon.aps.iva.lo.c;
import com.amazon.aps.iva.ph.a;
import com.amazon.aps.iva.qo.w;
import com.amazon.aps.iva.ro.b;
import com.amazon.aps.iva.x50.t;
import com.crunchyroll.cast.castlistener.VideoCastController;
import com.crunchyroll.watchscreen.screen.offline.OfflineWatchScreenActivity;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.ellation.crunchyroll.ui.duration.SmallDurationFormatter;
/* compiled from: OfflineWatchScreenModuleImpl.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.qo.i {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] r = {com.amazon.aps.iva.k.q.a(a.class, "playerViewModel", "getPlayerViewModel()Lcom/crunchyroll/watchscreen/player/WatchScreenPlayerViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(a.class, "viewModel", "getViewModel()Lcom/crunchyroll/watchscreen/screen/WatchScreenViewModel;", 0), com.amazon.aps.iva.k.q.a(a.class, "matureFlowViewModel", "getMatureFlowViewModel()Lcom/crunchyroll/watchscreen/screen/mature/WatchScreenMatureFlowViewModel;", 0), com.amazon.aps.iva.k.q.a(a.class, "assetsViewModel", "getAssetsViewModel()Lcom/crunchyroll/watchscreen/screen/assets/WatchScreenAssetsViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(a.class, "downloadingViewModel", "getDownloadingViewModel()Lcom/crunchyroll/watchscreen/screen/downloading/WatchScreenDownloadingViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(a.class, "castViewModel", "getCastViewModel()Lcom/crunchyroll/watchscreen/cast/WatchScreenCastViewModelImpl;", 0)};
    public final com.amazon.aps.iva.kb0.m a;
    public final com.amazon.aps.iva.bp.b b;
    public final com.amazon.aps.iva.lo.f c;
    public final com.amazon.aps.iva.ez.a d;
    public final com.amazon.aps.iva.ez.a e;
    public final com.amazon.aps.iva.kb0.m f;
    public final com.amazon.aps.iva.oo.d g;
    public final com.amazon.aps.iva.ip.a h;
    public final com.amazon.aps.iva.ez.a i;
    public final com.amazon.aps.iva.fp.b j;
    public final com.amazon.aps.iva.ez.a k;
    public final com.amazon.aps.iva.ez.a l;
    public final com.amazon.aps.iva.gp.e m;
    public final com.amazon.aps.iva.so.a n;
    public final com.amazon.aps.iva.kb0.m o;
    public final VideoCastController p;
    public final com.amazon.aps.iva.ez.a q;

    /* compiled from: OfflineWatchScreenModuleImpl.kt */
    /* renamed from: com.amazon.aps.iva.gp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0309a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.so.n> {
        public final /* synthetic */ a h;
        public final /* synthetic */ OfflineWatchScreenActivity i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0309a(OfflineWatchScreenActivity offlineWatchScreenActivity, a aVar) {
            super(1);
            this.h = aVar;
            this.i = offlineWatchScreenActivity;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.so.n invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.vo.e aVar;
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            a aVar2 = this.h;
            i0 i0Var = new i0(aVar2.b());
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                InternalDownloadsManager a = dVar.l().a();
                t tVar = aVar2.n().a().c;
                com.amazon.aps.iva.yb0.j.f(a, "downloadsManager");
                com.amazon.aps.iva.lo.f fVar = aVar2.c;
                com.amazon.aps.iva.yb0.j.f(fVar, "nextAssetInteractor");
                com.amazon.aps.iva.bp.b bVar = aVar2.b;
                com.amazon.aps.iva.yb0.j.f(bVar, "watchScreenInteractor");
                com.amazon.aps.iva.yb0.j.f(tVar, "containerResourceType");
                int i = com.amazon.aps.iva.vo.d.a[tVar.ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3 && i != 4) {
                        if (i == 5) {
                            aVar = new f1();
                        } else {
                            throw new IllegalArgumentException("Unexpected " + tVar + " containerResourceType");
                        }
                    } else {
                        aVar = new com.amazon.aps.iva.vo.b(a, bVar);
                    }
                } else {
                    aVar = new com.amazon.aps.iva.vo.a(bVar, fVar);
                }
                com.amazon.aps.iva.lo.d dVar2 = c.a.a;
                if (dVar2 != null) {
                    InternalDownloadsManager a2 = dVar2.l().a();
                    OfflineWatchScreenActivity offlineWatchScreenActivity = this.i;
                    com.amazon.aps.iva.yb0.j.f(offlineWatchScreenActivity, "context");
                    com.amazon.aps.iva.mt.m mVar = new com.amazon.aps.iva.mt.m(offlineWatchScreenActivity);
                    DurationFormatter create = DurationFormatter.Companion.create(offlineWatchScreenActivity);
                    com.amazon.aps.iva.lo.d dVar3 = c.a.a;
                    if (dVar3 != null) {
                        com.amazon.aps.iva.uv.d r = dVar3.l().r();
                        SmallDurationFormatter create$default = SmallDurationFormatter.Companion.create$default(SmallDurationFormatter.Companion, offlineWatchScreenActivity, null, 2, null);
                        com.amazon.aps.iva.yb0.j.f(a2, "downloadsManager");
                        com.amazon.aps.iva.yb0.j.f(create, "durationFormatter");
                        com.amazon.aps.iva.yb0.j.f(r, "contentAvailabilityProvider");
                        com.amazon.aps.iva.yb0.j.f(create$default, "smallDurationFormatter");
                        com.amazon.aps.iva.uo.c cVar = new com.amazon.aps.iva.uo.c(a2, mVar, create, r, create$default);
                        t tVar2 = aVar2.n().a().c;
                        com.amazon.aps.iva.yb0.j.f(tVar2, "containerResourceType");
                        return new com.amazon.aps.iva.so.n(i0Var, aVar, new com.amazon.aps.iva.uo.g(cVar, new com.amazon.aps.iva.uo.a(tVar2)));
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

    /* compiled from: OfflineWatchScreenModuleImpl.kt */
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
                a aVar = a.this;
                w b = aVar.b();
                com.amazon.aps.iva.oo.m mVar = (com.amazon.aps.iva.oo.m) aVar.d.getValue(aVar, a.r[0]);
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

    /* compiled from: OfflineWatchScreenModuleImpl.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.xo.d> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.xo.d invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            a aVar = a.this;
            w b = aVar.b();
            com.amazon.aps.iva.so.n k = a.k(aVar);
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                return new com.amazon.aps.iva.xo.d(b, k, dVar.l().a(), false);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: OfflineWatchScreenModuleImpl.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ap.g> {
        public final /* synthetic */ OfflineWatchScreenActivity h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(OfflineWatchScreenActivity offlineWatchScreenActivity) {
            super(0);
            this.h = offlineWatchScreenActivity;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ap.g invoke() {
            Intent intent = this.h.getIntent();
            com.amazon.aps.iva.yb0.j.e(intent, "activity.intent");
            return g.a.a(intent);
        }
    }

    /* compiled from: OfflineWatchScreenModuleImpl.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.sg.a> {
        public final /* synthetic */ OfflineWatchScreenActivity h;
        public final /* synthetic */ a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(OfflineWatchScreenActivity offlineWatchScreenActivity, a aVar) {
            super(0);
            this.h = offlineWatchScreenActivity;
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.sg.a invoke() {
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                com.amazon.aps.iva.fg.a l = dVar.l();
                a aVar = this.i;
                return l.E(this.h, new com.amazon.aps.iva.gp.b(aVar), a.k(aVar), aVar.m());
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: OfflineWatchScreenModuleImpl.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.fp.e> {
        public static final f h = new f();

        public f() {
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

    /* compiled from: OfflineWatchScreenModuleImpl.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.oo.m> {
        public final /* synthetic */ a h;
        public final /* synthetic */ OfflineWatchScreenActivity i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(OfflineWatchScreenActivity offlineWatchScreenActivity, a aVar) {
            super(1);
            this.h = aVar;
            this.i = offlineWatchScreenActivity;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.oo.m invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                com.amazon.aps.iva.cj.h player = dVar.getPlayerFeature().getPlayer();
                com.amazon.aps.iva.lo.d dVar2 = c.a.a;
                if (dVar2 != null) {
                    com.amazon.aps.iva.tx.d b = dVar2.j().b();
                    com.amazon.aps.iva.lo.d dVar3 = c.a.a;
                    if (dVar3 != null) {
                        com.amazon.aps.iva.uv.d r = dVar3.l().r();
                        com.amazon.aps.iva.po.a aVar = new com.amazon.aps.iva.po.a();
                        com.amazon.aps.iva.lo.d dVar4 = c.a.a;
                        if (dVar4 != null) {
                            com.amazon.aps.iva.aj.b c = dVar4.e().c();
                            com.amazon.aps.iva.yb0.j.f(b, "streamsInteractor");
                            com.amazon.aps.iva.yb0.j.f(r, "contentAvailabilityProvider");
                            com.amazon.aps.iva.yb0.j.f(c, "maturityRestrictionProvider");
                            com.amazon.aps.iva.po.f fVar = new com.amazon.aps.iva.po.f(b, r, aVar, c);
                            w b2 = this.h.b();
                            com.amazon.aps.iva.lo.d dVar5 = c.a.a;
                            if (dVar5 != null) {
                                com.amazon.aps.iva.oo.c cVar = new com.amazon.aps.iva.oo.c(dVar5.l().r());
                                Context applicationContext = this.i.getApplicationContext();
                                com.amazon.aps.iva.yb0.j.e(applicationContext, "activity.applicationContext");
                                return new com.amazon.aps.iva.oo.m(player, fVar, b2, cVar, false, applicationContext);
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
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: OfflineWatchScreenModuleImpl.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.gn.c> {
        public final /* synthetic */ OfflineWatchScreenActivity h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(OfflineWatchScreenActivity offlineWatchScreenActivity) {
            super(0);
            this.h = offlineWatchScreenActivity;
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
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(androidx.fragment.app.h hVar) {
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
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(androidx.fragment.app.h hVar) {
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

    /* compiled from: OfflineWatchScreenModuleImpl.kt */
    /* loaded from: classes2.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.fg.g> {
        public final /* synthetic */ OfflineWatchScreenActivity h;
        public final /* synthetic */ a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(OfflineWatchScreenActivity offlineWatchScreenActivity, a aVar) {
            super(0);
            this.h = offlineWatchScreenActivity;
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.fg.g invoke() {
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                com.amazon.aps.iva.fg.a l = dVar.l();
                OfflineWatchScreenActivity offlineWatchScreenActivity = this.h;
                LifecycleCoroutineScopeImpl O = x.O(offlineWatchScreenActivity);
                a aVar = this.i;
                aVar.getClass();
                com.amazon.aps.iva.fp.d dVar2 = (com.amazon.aps.iva.fp.d) aVar.i.getValue(aVar, a.r[2]);
                com.amazon.aps.iva.lo.d dVar3 = c.a.a;
                if (dVar3 != null) {
                    com.amazon.aps.iva.iw.c m = dVar3.l().m(offlineWatchScreenActivity);
                    com.amazon.aps.iva.yb0.j.f(m, "matureContentDialogRouter");
                    com.amazon.aps.iva.yo.b bVar = new com.amazon.aps.iva.yo.b(dVar2, m, offlineWatchScreenActivity);
                    com.ellation.crunchyroll.mvp.lifecycle.a.a(bVar, offlineWatchScreenActivity);
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                    com.amazon.aps.iva.lo.d dVar4 = c.a.a;
                    if (dVar4 != null) {
                        com.amazon.aps.iva.xh.b a = a.C0616a.a(dVar4.c(), this.h, null, null, null, null, 30);
                        com.amazon.aps.iva.lo.d dVar5 = c.a.a;
                        if (dVar5 != null) {
                            com.amazon.aps.iva.z20.g p = dVar5.c().p(offlineWatchScreenActivity);
                            com.amazon.aps.iva.yb0.j.f(a, "upgradeFlowRouter");
                            com.amazon.aps.iva.yb0.j.f(p, "dialogRouter");
                            com.amazon.aps.iva.zo.a aVar2 = new com.amazon.aps.iva.zo.a(offlineWatchScreenActivity, a, p);
                            com.ellation.crunchyroll.mvp.lifecycle.a.a(aVar2, offlineWatchScreenActivity);
                            com.amazon.aps.iva.lo.d dVar6 = c.a.a;
                            if (dVar6 != null) {
                                return l.v(offlineWatchScreenActivity, O, bVar, aVar2, dVar6.g().invoke(offlineWatchScreenActivity), new com.amazon.aps.iva.gp.c(aVar), new com.amazon.aps.iva.gp.d(aVar));
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
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: OfflineWatchScreenModuleImpl.kt */
    /* loaded from: classes2.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.qo.x> {
        public p() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.qo.x invoke(androidx.lifecycle.p pVar) {
            androidx.lifecycle.p pVar2 = pVar;
            com.amazon.aps.iva.yb0.j.f(pVar2, "savedStateHandle");
            a aVar = a.this;
            com.amazon.aps.iva.ap.g n = aVar.n();
            com.amazon.aps.iva.bp.b bVar = aVar.b;
            com.amazon.aps.iva.lo.f fVar = aVar.c;
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                return new com.amazon.aps.iva.qo.x(n, pVar2, bVar, fVar, dVar.l().w());
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: OfflineWatchScreenModuleImpl.kt */
    /* loaded from: classes2.dex */
    public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<PlayableAsset> {
        public q() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final PlayableAsset invoke() {
            return a.this.b().getCurrentAsset();
        }
    }

    /* compiled from: OfflineWatchScreenModuleImpl.kt */
    /* loaded from: classes2.dex */
    public static final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hf.a> {
        public final /* synthetic */ OfflineWatchScreenActivity h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(OfflineWatchScreenActivity offlineWatchScreenActivity) {
            super(0);
            this.h = offlineWatchScreenActivity;
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

    public a(OfflineWatchScreenActivity offlineWatchScreenActivity) {
        com.amazon.aps.iva.lo.f aVar;
        com.amazon.aps.iva.yb0.j.f(offlineWatchScreenActivity, "activity");
        this.a = com.amazon.aps.iva.kb0.f.b(new d(offlineWatchScreenActivity));
        this.b = c.a.a().f().a(n().a());
        String str = n().a().b;
        t tVar = n().a().c;
        com.amazon.aps.iva.lw.a y = c.a.a().l().y();
        com.amazon.aps.iva.yb0.j.f(str, "contentId");
        com.amazon.aps.iva.yb0.j.f(tVar, "resourceType");
        com.amazon.aps.iva.yb0.j.f(y, "downloadedAssetsProvider");
        int i2 = com.amazon.aps.iva.lo.e.a[tVar.ordinal()];
        if (i2 != 1 && i2 != 2) {
            aVar = new defpackage.i();
        } else {
            aVar = new com.amazon.aps.iva.lo.a(str, y);
        }
        this.c = aVar;
        com.amazon.aps.iva.ez.a aVar2 = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.oo.m.class, new i(offlineWatchScreenActivity), new g(offlineWatchScreenActivity, this));
        this.d = aVar2;
        this.e = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.qo.x.class, new j(offlineWatchScreenActivity), new p());
        this.f = com.amazon.aps.iva.kb0.f.b(new h(offlineWatchScreenActivity));
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = r;
        this.g = new com.amazon.aps.iva.oo.d(offlineWatchScreenActivity, (com.amazon.aps.iva.oo.m) aVar2.getValue(this, lVarArr[0]));
        boolean c2 = com.amazon.aps.iva.aq.k.n(offlineWatchScreenActivity).c();
        LiveData<h0> sizeState = offlineWatchScreenActivity.mi().c.getPlayerView().getSizeState();
        com.amazon.aps.iva.yb0.j.f(sizeState, "sizeState");
        this.h = new com.amazon.aps.iva.ip.a(c2, offlineWatchScreenActivity, sizeState);
        com.amazon.aps.iva.ez.a aVar3 = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.fp.e.class, new k(offlineWatchScreenActivity), f.h);
        this.i = aVar3;
        com.amazon.aps.iva.fp.b bVar = new com.amazon.aps.iva.fp.b(offlineWatchScreenActivity, (com.amazon.aps.iva.fp.d) aVar3.getValue(this, lVarArr[2]));
        com.ellation.crunchyroll.mvp.lifecycle.a.a(bVar, offlineWatchScreenActivity);
        this.j = bVar;
        com.amazon.aps.iva.kb0.m b2 = com.amazon.aps.iva.kb0.f.b(new o(offlineWatchScreenActivity, this));
        this.k = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.so.n.class, new l(offlineWatchScreenActivity), new C0309a(offlineWatchScreenActivity, this));
        this.l = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.xo.d.class, new m(offlineWatchScreenActivity), new c());
        com.amazon.aps.iva.gp.e eVar = new com.amazon.aps.iva.gp.e(offlineWatchScreenActivity, b(), c.a.a().getPlayerFeature().g(), m(), b.a.a(new q()), c.a.a().k().invoke(offlineWatchScreenActivity, Boolean.FALSE), a(), offlineWatchScreenActivity, new r(offlineWatchScreenActivity), c.a.a().a().getCastStateProvider());
        this.m = eVar;
        this.n = new com.amazon.aps.iva.so.a((com.amazon.aps.iva.fg.g) b2.getValue(), c.a.a().l().a(), n().a().c, eVar);
        this.o = com.amazon.aps.iva.kb0.f.b(new e(offlineWatchScreenActivity, this));
        VideoCastController createCastController = c.a.a().a().createCastController(offlineWatchScreenActivity);
        this.p = createCastController;
        this.q = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.mo.d.class, new n(offlineWatchScreenActivity), new b());
        a.C0616a.a(c.a.a().c(), offlineWatchScreenActivity, null, null, null, null, 30);
        createCastController.addEventListener(d());
    }

    public static final com.amazon.aps.iva.so.n k(a aVar) {
        aVar.getClass();
        return (com.amazon.aps.iva.so.n) aVar.k.getValue(aVar, r[3]);
    }

    @Override // com.amazon.aps.iva.qo.i
    public final com.amazon.aps.iva.gn.c a() {
        return (com.amazon.aps.iva.gn.c) this.f.getValue();
    }

    @Override // com.amazon.aps.iva.qo.i
    public final w b() {
        return (w) this.e.getValue(this, r[1]);
    }

    @Override // com.amazon.aps.iva.qo.i
    public final com.amazon.aps.iva.oo.d c() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.qo.i
    public final VideoCastController e() {
        return this.p;
    }

    @Override // com.amazon.aps.iva.qo.i
    public final com.amazon.aps.iva.qo.k f() {
        return this.m;
    }

    @Override // com.amazon.aps.iva.qo.i
    public final com.amazon.aps.iva.so.a g() {
        return this.n;
    }

    @Override // com.amazon.aps.iva.qo.i
    public final com.amazon.aps.iva.sg.a h() {
        return (com.amazon.aps.iva.sg.a) this.o.getValue();
    }

    @Override // com.amazon.aps.iva.qo.i
    public final com.amazon.aps.iva.ip.a i() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.qo.i
    public final com.amazon.aps.iva.fp.b j() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.qo.i
    /* renamed from: l */
    public final com.amazon.aps.iva.mo.d d() {
        return (com.amazon.aps.iva.mo.d) this.q.getValue(this, r[5]);
    }

    public final com.amazon.aps.iva.xo.d m() {
        return (com.amazon.aps.iva.xo.d) this.l.getValue(this, r[4]);
    }

    public final com.amazon.aps.iva.ap.g n() {
        return (com.amazon.aps.iva.ap.g) this.a.getValue();
    }
}
