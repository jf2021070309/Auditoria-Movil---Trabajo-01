package com.amazon.aps.iva.l40;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.amazon.aps.iva.gn.c;
import com.amazon.aps.iva.l40.q;
import com.amazon.aps.iva.l40.u;
import com.amazon.aps.iva.m40.a;
import com.amazon.aps.iva.n60.b;
import com.amazon.aps.iva.ph.a;
import com.amazon.aps.iva.sv.h;
import com.amazon.aps.iva.y30.h;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.index.PolicyChangeMonitor;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.application.d;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.ellation.crunchyroll.ui.duration.SmallDurationFormatter;
import java.util.Arrays;
import java.util.List;
/* compiled from: ShowPageModule.kt */
/* loaded from: classes2.dex */
public final class e implements s {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] r = {com.amazon.aps.iva.k.q.a(e.class, "showPageViewModel", "getShowPageViewModel()Lcom/ellation/crunchyroll/presentation/showpage/ShowPageViewModel;", 0), com.amazon.aps.iva.k.q.a(e.class, "assetListViewModel", "getAssetListViewModel()Lcom/ellation/crunchyroll/presentation/assets/AssetListViewModel;", 0), com.amazon.aps.iva.k.q.a(e.class, "cardWatchlistItemToggleViewModel", "getCardWatchlistItemToggleViewModel()Lcom/ellation/crunchyroll/watchlisttoggle/CardWatchlistItemToggleViewModelImpl;", 0)};
    public final ShowPageActivity a;
    public final p b;
    public final com.amazon.aps.iva.o40.c c;
    public final InternalDownloadsManager d;
    public final com.amazon.aps.iva.f60.d e;
    public final DurationFormatter f;
    public final com.amazon.aps.iva.f00.a0 g;
    public final com.amazon.aps.iva.ez.a h;
    public final com.amazon.aps.iva.ez.a i;
    public final com.amazon.aps.iva.kb0.m j;
    public final com.amazon.aps.iva.kb0.m k;
    public final v l;
    public final com.amazon.aps.iva.f60.e m;
    public final com.amazon.aps.iva.k30.a n;
    public final com.amazon.aps.iva.d20.i o;
    public final com.amazon.aps.iva.a50.a p;
    public final com.amazon.aps.iva.y00.a q;

    /* compiled from: ShowPageModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.qz.c> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.qz.c invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            e eVar = e.this;
            return new com.amazon.aps.iva.qz.c(eVar.g, eVar.c);
        }
    }

    /* compiled from: ShowPageModule.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.f60.m> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.f60.m invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            return e.this.e.b();
        }
    }

    /* compiled from: ShowPageModule.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hg.g> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.hg.g invoke() {
            return e.this.e().P();
        }
    }

    /* compiled from: ShowPageModule.kt */
    /* renamed from: com.amazon.aps.iva.l40.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0468e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.oh.g> {
        public C0468e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.oh.g invoke() {
            e eVar = e.this;
            return ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).y.b(eVar.a, eVar.b.c);
        }
    }

    /* compiled from: ShowPageModule.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class f extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public f(j1 j1Var) {
            super(0, j1Var, j1.class, "reloadScreen", "reloadScreen()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((j1) this.receiver).g8();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPageModule.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class g extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.u70.i, com.amazon.aps.iva.kb0.q> {
        public g(Object obj) {
            super(1, obj, ShowPageActivity.class, "showSnackbar", "showSnackbar(Lcom/ellation/widgets/snackbar/MessageSnackbarUiModel;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.u70.i iVar) {
            com.amazon.aps.iva.u70.i iVar2 = iVar;
            com.amazon.aps.iva.yb0.j.f(iVar2, "p0");
            ((ShowPageActivity) this.receiver).showSnackbar(iVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPageModule.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends String>, com.amazon.aps.iva.kb0.q> {
        public h() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(List<? extends String> list) {
            List<? extends String> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "assetIdList");
            com.amazon.aps.iva.oh.g b = e.this.b();
            String[] strArr = (String[]) list2.toArray(new String[0]);
            b.O7((String[]) Arrays.copyOf(strArr, strArr.length));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPageModule.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.gn.c> {
        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.gn.c invoke() {
            ShowPageActivity showPageActivity = e.this.a;
            com.amazon.aps.iva.ts.b.a.getClass();
            return c.a.a(showPageActivity, com.amazon.aps.iva.ts.a.j);
        }
    }

    /* compiled from: ShowPageModule.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.fs.c> {
        public static final j h = new j();

        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.fs.c invoke() {
            return new com.amazon.aps.iva.fs.d();
        }
    }

    /* compiled from: ShowPageModule.kt */
    /* loaded from: classes2.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, v1> {
        public k() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final v1 invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            e eVar = e.this;
            com.amazon.aps.iva.o40.c cVar = eVar.c;
            com.amazon.aps.iva.r40.e eVar2 = new com.amazon.aps.iva.r40.e();
            ShowPageActivity showPageActivity = eVar.a;
            return new v1(cVar, eVar2, new com.amazon.aps.iva.m40.d(a.C0501a.a(showPageActivity)), new com.amazon.aps.iva.l40.g(q.a.a(showPageActivity)), (com.amazon.aps.iva.qz.b) eVar.i.getValue(eVar, e.r[1]));
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

    public e(com.amazon.aps.iva.o40.k kVar, ShowPageActivity showPageActivity, com.amazon.aps.iva.o40.j jVar) {
        this.a = showPageActivity;
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        com.amazon.aps.iva.x50.t tVar = jVar.c;
        com.amazon.aps.iva.yb0.j.f(tVar, "resourceType");
        j jVar2 = j.h;
        com.amazon.aps.iva.yb0.j.f(jVar2, "createTimer");
        p pVar = new p(tVar, jVar2);
        this.b = pVar;
        this.c = kVar.a(jVar, showPageActivity);
        com.amazon.aps.iva.sv.h hVar = h.a.a;
        if (hVar != null) {
            InternalDownloadsManager a2 = hVar.a();
            this.d = a2;
            LifecycleCoroutineScopeImpl O = com.amazon.aps.iva.ab.x.O(showPageActivity);
            com.amazon.aps.iva.sv.h hVar2 = h.a.a;
            if (hVar2 != null) {
                com.amazon.aps.iva.sv.c b2 = hVar2.b();
                com.amazon.aps.iva.sv.h hVar3 = h.a.a;
                if (hVar3 != null) {
                    InternalDownloadsManager a3 = hVar3.a();
                    com.ellation.crunchyroll.downloading.bulk.g gVar = com.amazon.aps.iva.a9.k0.d;
                    if (gVar != null) {
                        BulkDownloadsManager a4 = gVar.a();
                        com.amazon.aps.iva.wu.b bVar = com.amazon.aps.iva.wu.b.a;
                        com.amazon.aps.iva.yb0.j.f(b2, "downloadingCoroutineScope");
                        com.amazon.aps.iva.yb0.j.f(a3, "downloadsManager");
                        com.amazon.aps.iva.yb0.j.f(a4, "bulkDownloadsManager");
                        com.amazon.aps.iva.sv.n nVar = new com.amazon.aps.iva.sv.n(O, b2, a3, a4, bVar);
                        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.MEDIA;
                        EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
                        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
                        com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
                        com.amazon.aps.iva.f60.d dVar = new com.amazon.aps.iva.f60.d(aVar, etpContentService, showPageActivity);
                        this.e = dVar;
                        com.amazon.aps.iva.mt.m mVar = new com.amazon.aps.iva.mt.m(showPageActivity);
                        DurationFormatter create = DurationFormatter.Companion.create(showPageActivity);
                        this.f = create;
                        this.g = new com.amazon.aps.iva.f00.a0(showPageActivity, nVar, a2, new com.amazon.aps.iva.at.c(new com.amazon.aps.iva.yb0.t(com.ellation.crunchyroll.application.f.a(null, 3)) { // from class: com.amazon.aps.iva.l40.e.b
                            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
                            public final Object get() {
                                return Boolean.valueOf(((com.amazon.aps.iva.ct.j) this.receiver).getHasPremiumBenefit());
                            }
                        }, com.amazon.aps.iva.at.b.h), mVar, create, SmallDurationFormatter.Companion.create(showPageActivity, create));
                        this.h = new com.amazon.aps.iva.ez.a(v1.class, new l(showPageActivity), new k());
                        com.amazon.aps.iva.ez.a aVar2 = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.qz.c.class, new m(showPageActivity), new a());
                        this.i = aVar2;
                        c cVar2 = new c();
                        n nVar2 = new n(showPageActivity);
                        this.j = com.amazon.aps.iva.kb0.f.b(new i());
                        f1 f1Var = new f1(new h());
                        this.k = com.amazon.aps.iva.kb0.f.b(new C0468e());
                        j1 e = e();
                        com.amazon.aps.iva.i50.c cVar3 = new com.amazon.aps.iva.i50.c(showPageActivity, new com.amazon.aps.iva.i50.a(showPageActivity, true));
                        String stringExtra = showPageActivity.getIntent().getStringExtra("show_page_notification_season_id");
                        com.amazon.aps.iva.rv.e n2 = com.amazon.aps.iva.aq.k.n(showPageActivity);
                        com.ellation.crunchyroll.application.d a5 = d.a.a();
                        com.ellation.crunchyroll.downloading.bulk.g gVar2 = com.amazon.aps.iva.a9.k0.d;
                        if (gVar2 != null) {
                            BulkDownloadsManager a6 = gVar2.a();
                            com.ellation.crunchyroll.application.a aVar3 = a.C0959a.a;
                            if (aVar3 != null) {
                                Object c2 = aVar3.c().c(com.amazon.aps.iva.cx.p.class, "app_resume_screens_reload_intervals");
                                if (c2 != null) {
                                    com.amazon.aps.iva.n60.c a7 = b.a.a((com.amazon.aps.iva.cx.p) c2);
                                    com.amazon.aps.iva.gn.c a8 = a();
                                    com.amazon.aps.iva.x50.v vVar = com.ellation.crunchyroll.application.e.b().i;
                                    if (vVar != null) {
                                        this.l = u.a.a(true, e, pVar, cVar3, stringExtra, n2, a5, a6, a7, a8, vVar, f1Var, b(), showPageActivity);
                                        com.amazon.aps.iva.fc0.l<?>[] lVarArr = r;
                                        com.amazon.aps.iva.yb0.j.f(lVarArr[2], "property");
                                        this.m = dVar.a((com.amazon.aps.iva.f60.m) com.amazon.aps.iva.ez.l.a(nVar2.invoke(), com.amazon.aps.iva.f60.m.class, cVar2));
                                        com.amazon.aps.iva.d20.k kVar2 = new com.amazon.aps.iva.d20.k(com.ellation.crunchyroll.application.e.c().getAccountService(), com.ellation.crunchyroll.application.e.c().getJwtInvalidator(), h.a.a(null, 7), ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).c.a);
                                        EtpContentService etpContentService2 = com.ellation.crunchyroll.application.e.c().getEtpContentService();
                                        LifecycleCoroutineScopeImpl O2 = com.amazon.aps.iva.ab.x.O(showPageActivity);
                                        com.amazon.aps.iva.yb0.j.f(etpContentService2, "contentService");
                                        com.amazon.aps.iva.d20.b bVar2 = new com.amazon.aps.iva.d20.b(kVar2, etpContentService2, O2);
                                        b1 b1Var = new b1(new f(e()), new g(showPageActivity));
                                        PolicyChangeMonitor policyChangeMonitor = com.ellation.crunchyroll.application.e.c().getPolicyChangeMonitor();
                                        com.amazon.aps.iva.yb0.j.f(policyChangeMonitor, "policyChangeMonitor");
                                        this.n = new com.amazon.aps.iva.k30.a(policyChangeMonitor, b1Var, showPageActivity);
                                        com.amazon.aps.iva.iw.c m2 = ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).l.m(showPageActivity);
                                        com.amazon.aps.iva.yb0.j.f(m2, "matureContentDialogRouter");
                                        this.o = new com.amazon.aps.iva.d20.i(showPageActivity, bVar2, m2, b1Var);
                                        com.amazon.aps.iva.xh.b a9 = a.C0616a.a(((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).i, showPageActivity, null, null, null, null, 30);
                                        com.amazon.aps.iva.z20.g p = ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).i.p(showPageActivity);
                                        com.amazon.aps.iva.yb0.j.f(a9, "upgradeFlowRouter");
                                        com.amazon.aps.iva.yb0.j.f(p, "dialogRouter");
                                        this.p = new com.amazon.aps.iva.a50.a(showPageActivity, a9, p);
                                        this.q = new com.amazon.aps.iva.y00.a(new com.amazon.aps.iva.s00.a(showPageActivity, (com.amazon.aps.iva.qz.b) aVar2.getValue(this, lVarArr[1])), new d(), a2);
                                        return;
                                    }
                                    com.amazon.aps.iva.yb0.j.m("userActivityLogger");
                                    throw null;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.ScreenReloadIntervalsImpl");
                            }
                            com.amazon.aps.iva.yb0.j.m("instance");
                            throw null;
                        }
                        com.amazon.aps.iva.yb0.j.m("instance");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("instance");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("instance");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.l40.s
    public final com.amazon.aps.iva.gn.c a() {
        return (com.amazon.aps.iva.gn.c) this.j.getValue();
    }

    @Override // com.amazon.aps.iva.l40.s
    public final com.amazon.aps.iva.oh.g b() {
        return (com.amazon.aps.iva.oh.g) this.k.getValue();
    }

    @Override // com.amazon.aps.iva.l40.s
    public final o c() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.l40.s
    public final com.amazon.aps.iva.k30.a d() {
        return this.n;
    }

    @Override // com.amazon.aps.iva.l40.s
    public final j1 e() {
        return (j1) this.h.getValue(this, r[0]);
    }

    @Override // com.amazon.aps.iva.l40.s
    public final com.amazon.aps.iva.a50.a f() {
        return this.p;
    }

    @Override // com.amazon.aps.iva.l40.s
    public final com.amazon.aps.iva.f60.e g() {
        return this.m;
    }

    @Override // com.amazon.aps.iva.l40.s
    public final v getPresenter() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.l40.s
    public final com.amazon.aps.iva.d20.i h() {
        return this.o;
    }

    @Override // com.amazon.aps.iva.l40.s
    public final com.amazon.aps.iva.y00.a i() {
        return this.q;
    }
}
