package com.ellation.crunchyroll.feed;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.p;
import com.amazon.aps.iva.gn.c;
import com.amazon.aps.iva.gy.o;
import com.amazon.aps.iva.gy.r;
import com.amazon.aps.iva.gy.v;
import com.amazon.aps.iva.gy.x;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.vx.a0;
import com.amazon.aps.iva.vx.n;
import com.amazon.aps.iva.yb0.t;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.EmptyMeta;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.api.model.HomeFeedItemResourceType;
import com.ellation.crunchyroll.api.model.HomeFeedItemResponseType;
import com.ellation.crunchyroll.watchlist.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: FeedModule.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] r = {q.a(a.class, "viewModel", "getViewModel()Lcom/ellation/crunchyroll/feed/HomeFeedViewModel;", 0), q.a(a.class, "cardWatchlistItemToggleViewModel", "getCardWatchlistItemToggleViewModel()Lcom/ellation/crunchyroll/watchlisttoggle/CardWatchlistItemToggleViewModelImpl;", 0)};
    public final com.amazon.aps.iva.xb0.q<Integer, Integer, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<HomeFeedItemRaw, EmptyMeta>>, Object> a;
    public final List<HomeFeedItemResponseType> b;
    public final boolean c;
    public final v d;
    public final com.amazon.aps.iva.gy.f e;
    public final com.amazon.aps.iva.gy.e f;
    public final x g;
    public final com.amazon.aps.iva.gy.d h;
    public final o i;
    public final com.amazon.aps.iva.gy.a j;
    public final r k;
    public final com.amazon.aps.iva.gy.c l;
    public final com.amazon.aps.iva.kb0.m m;
    public final HomeFeedPresenter n;
    public final com.amazon.aps.iva.f60.d o;
    public final com.amazon.aps.iva.f60.e p;
    public final com.amazon.aps.iva.gn.d q;

    /* compiled from: FeedModule.kt */
    /* renamed from: com.ellation.crunchyroll.feed.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0967a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.f60.m> {
        public C0967a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.f60.m invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            return a.this.o.b();
        }
    }

    /* compiled from: FeedModule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.oh.g> {
        public final /* synthetic */ Fragment h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.h = fragment;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.oh.g invoke() {
            com.amazon.aps.iva.vx.k kVar = defpackage.i.f;
            if (kVar != null) {
                com.amazon.aps.iva.xb0.l<Activity, com.amazon.aps.iva.oh.g> t = kVar.t();
                androidx.fragment.app.h requireActivity = this.h.requireActivity();
                com.amazon.aps.iva.yb0.j.e(requireActivity, "fragment.requireActivity()");
                return t.invoke(requireActivity);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: FeedModule.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, a0> {
        public c() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.ellation.crunchyroll.feed.b] */
        @Override // com.amazon.aps.iva.xb0.l
        public final a0 invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            final a aVar = a.this;
            return new a0(new t(aVar) { // from class: com.ellation.crunchyroll.feed.b
                @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
                public final Object get() {
                    a aVar2 = (a) this.receiver;
                    aVar2.getClass();
                    HomeFeedItemResourceType homeFeedItemResourceType = HomeFeedItemResourceType.DYNAMIC_COLLECTION;
                    com.amazon.aps.iva.kb0.j jVar = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.gy.m(homeFeedItemResourceType, HomeFeedItemResponseType.WATCHLIST), aVar2.g);
                    com.amazon.aps.iva.kb0.j jVar2 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.gy.m(homeFeedItemResourceType, HomeFeedItemResponseType.HISTORY), aVar2.h);
                    HomeFeedItemResourceType homeFeedItemResourceType2 = HomeFeedItemResourceType.CURATED_COLLECTION;
                    com.amazon.aps.iva.kb0.j jVar3 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.gy.m(homeFeedItemResourceType2, HomeFeedItemResponseType.SERIES), aVar2.f);
                    com.amazon.aps.iva.gy.m mVar = new com.amazon.aps.iva.gy.m(homeFeedItemResourceType, HomeFeedItemResponseType.RECOMMENDATIONS);
                    com.amazon.aps.iva.gy.f fVar = aVar2.e;
                    com.amazon.aps.iva.kb0.j jVar4 = new com.amazon.aps.iva.kb0.j(mVar, fVar);
                    com.amazon.aps.iva.kb0.j jVar5 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.gy.m(homeFeedItemResourceType, HomeFeedItemResponseType.BROWSE), fVar);
                    com.amazon.aps.iva.kb0.j jVar6 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.gy.m(homeFeedItemResourceType, HomeFeedItemResponseType.BECAUSE_YOU_WATCHED), fVar);
                    HomeFeedItemResourceType homeFeedItemResourceType3 = HomeFeedItemResourceType.PANEL;
                    HomeFeedItemResponseType homeFeedItemResponseType = HomeFeedItemResponseType.UNDEFINED;
                    com.amazon.aps.iva.kb0.j jVar7 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.gy.m(homeFeedItemResourceType3, homeFeedItemResponseType), aVar2.d);
                    com.amazon.aps.iva.gy.m mVar2 = new com.amazon.aps.iva.gy.m(homeFeedItemResourceType2, HomeFeedItemResponseType.MUSIC_VIDEO);
                    o oVar = aVar2.i;
                    com.amazon.aps.iva.kb0.j jVar8 = new com.amazon.aps.iva.kb0.j(mVar2, oVar);
                    com.amazon.aps.iva.kb0.j jVar9 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.gy.m(homeFeedItemResourceType2, HomeFeedItemResponseType.CONCERT), oVar);
                    com.amazon.aps.iva.kb0.j jVar10 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.gy.m(homeFeedItemResourceType2, HomeFeedItemResponseType.MUSIC_MEDIA_MIXED), oVar);
                    com.amazon.aps.iva.kb0.j jVar11 = new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.gy.m(homeFeedItemResourceType2, HomeFeedItemResponseType.ARTIST), aVar2.j);
                    com.amazon.aps.iva.gy.m mVar3 = new com.amazon.aps.iva.gy.m(HomeFeedItemResourceType.ARTIST, homeFeedItemResponseType);
                    r rVar = aVar2.k;
                    LinkedHashMap V = i0.V(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, new com.amazon.aps.iva.kb0.j(mVar3, rVar), new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.gy.m(HomeFeedItemResourceType.MUSIC_VIDEO, homeFeedItemResponseType), rVar), new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.gy.m(HomeFeedItemResourceType.MUSIC_CONCERT, homeFeedItemResponseType), rVar), new com.amazon.aps.iva.kb0.j(new com.amazon.aps.iva.gy.m(HomeFeedItemResourceType.GAMES_COLLECTION, homeFeedItemResponseType), aVar2.l));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : V.entrySet()) {
                        if (aVar2.b.contains(((com.amazon.aps.iva.gy.m) entry.getKey()).b)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    boolean z = aVar2.c;
                    com.amazon.aps.iva.vx.k kVar = defpackage.i.f;
                    if (kVar != null) {
                        com.amazon.aps.iva.vx.a i = kVar.i();
                        com.amazon.aps.iva.vx.k kVar2 = defpackage.i.f;
                        if (kVar2 != null) {
                            com.amazon.aps.iva.xb0.a<Boolean> u = kVar2.u();
                            com.amazon.aps.iva.yb0.j.f(u, "shouldShowLegalDisclaimer");
                            com.amazon.aps.iva.xb0.q<Integer, Integer, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<HomeFeedItemRaw, EmptyMeta>>, Object> qVar = aVar2.a;
                            com.amazon.aps.iva.yb0.j.f(qVar, "getFeed");
                            com.amazon.aps.iva.yb0.j.f(i, "bentoConfig");
                            return new com.amazon.aps.iva.gy.h(linkedHashMap, u, qVar, z, i);
                        }
                        com.amazon.aps.iva.yb0.j.m("dependencies");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("dependencies");
                    throw null;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(HomeFeedScreenView homeFeedScreenView, Fragment fragment, com.amazon.aps.iva.xb0.a<Boolean> aVar, com.amazon.aps.iva.xb0.a<Boolean> aVar2, com.amazon.aps.iva.xb0.q<? super Integer, ? super Integer, ? super com.amazon.aps.iva.ob0.d<? super ContentApiResponse<HomeFeedItemRaw, EmptyMeta>>, ? extends Object> qVar, List<? extends HomeFeedItemResponseType> list, boolean z, boolean z2, com.amazon.aps.iva.ls.a aVar3) {
        com.amazon.aps.iva.yb0.j.f(homeFeedScreenView, "view");
        com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
        com.amazon.aps.iva.yb0.j.f(aVar, "isInGraceButtonVisible");
        com.amazon.aps.iva.yb0.j.f(aVar2, "isSubscriptionButtonVisible");
        com.amazon.aps.iva.yb0.j.f(aVar3, "screen");
        this.a = qVar;
        this.b = list;
        this.c = z;
        this.d = new v(defpackage.i.v().getEtpContentService());
        this.e = new com.amazon.aps.iva.gy.f(defpackage.i.v().getEtpContentService());
        this.f = new com.amazon.aps.iva.gy.e(defpackage.i.v().getEtpContentService());
        EtpContentService etpContentService = defpackage.i.v().getEtpContentService();
        com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
        this.g = new x(etpContentService);
        EtpContentService etpContentService2 = defpackage.i.v().getEtpContentService();
        com.amazon.aps.iva.yb0.j.f(etpContentService2, "contentService");
        this.h = new com.amazon.aps.iva.gy.d(etpContentService2);
        EtpContentService etpContentService3 = defpackage.i.v().getEtpContentService();
        com.amazon.aps.iva.at.f fVar = new com.amazon.aps.iva.at.f(defpackage.i.v().getHasPremiumBenefit());
        com.amazon.aps.iva.xb0.l<Context, com.amazon.aps.iva.yh.c> m = defpackage.i.v().m();
        Context requireContext = fragment.requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "fragment.requireContext()");
        com.amazon.aps.iva.yh.c invoke = m.invoke(requireContext);
        com.amazon.aps.iva.yb0.j.f(etpContentService3, "etpContentService");
        com.amazon.aps.iva.yb0.j.f(invoke, "multipleArtistsFormatter");
        this.i = new o(etpContentService3, fVar, invoke);
        EtpContentService etpContentService4 = defpackage.i.v().getEtpContentService();
        com.amazon.aps.iva.yb0.j.f(etpContentService4, "etpContentService");
        this.j = new com.amazon.aps.iva.gy.a(etpContentService4);
        EtpContentService etpContentService5 = defpackage.i.v().getEtpContentService();
        com.amazon.aps.iva.xb0.l<Context, com.amazon.aps.iva.yh.c> m2 = defpackage.i.v().m();
        Context requireContext2 = fragment.requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext2, "fragment.requireContext()");
        com.amazon.aps.iva.yh.c invoke2 = m2.invoke(requireContext2);
        com.amazon.aps.iva.yb0.j.f(etpContentService5, "etpContentService");
        com.amazon.aps.iva.yb0.j.f(invoke2, "multipleArtistsFormatter");
        this.k = new r(etpContentService5, invoke2);
        com.amazon.aps.iva.xb0.a<Boolean> n = defpackage.i.v().n();
        com.amazon.aps.iva.yb0.j.f(n, "hasBentoBenefit");
        this.l = new com.amazon.aps.iva.gy.c(n);
        this.m = com.amazon.aps.iva.kb0.f.b(new b(fragment));
        com.amazon.aps.iva.ez.f fVar2 = new com.amazon.aps.iva.ez.f(fragment, a0.class, new c());
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = r;
        com.amazon.aps.iva.vx.x xVar = (com.amazon.aps.iva.vx.x) fVar2.getValue(this, lVarArr[0]);
        com.amazon.aps.iva.vw.a q = defpackage.i.v().q();
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        com.amazon.aps.iva.vx.k kVar = defpackage.i.f;
        if (kVar != null) {
            com.amazon.aps.iva.vx.g gVar = new com.amazon.aps.iva.vx.g(kVar);
            com.amazon.aps.iva.vx.f fVar3 = com.amazon.aps.iva.vx.f.h;
            com.amazon.aps.iva.yb0.j.f(fVar3, "createTimer");
            com.amazon.aps.iva.vx.i iVar = new com.amazon.aps.iva.vx.i(aVar, aVar2, q, cVar, fVar3, gVar, aVar3);
            com.amazon.aps.iva.n60.b r2 = defpackage.i.v().r();
            com.amazon.aps.iva.oh.g a = a();
            com.ellation.crunchyroll.watchlist.a.u0.getClass();
            com.ellation.crunchyroll.watchlist.a aVar4 = a.C0975a.b;
            com.amazon.aps.iva.yb0.j.f(r2, "reloadDebouncer");
            com.amazon.aps.iva.yb0.j.f(aVar4, "watchlistChangeRegister");
            com.amazon.aps.iva.yb0.j.f(a, "markAsWatchedToggleViewModel");
            HomeFeedPresenterImpl homeFeedPresenterImpl = new HomeFeedPresenterImpl(homeFeedScreenView, xVar, iVar, r2, aVar4, z2, a, (com.amazon.aps.iva.bh.c) fragment);
            androidx.fragment.app.h requireActivity = fragment.requireActivity();
            com.amazon.aps.iva.yb0.j.d(requireActivity, "null cannot be cast to non-null type com.ellation.crunchyroll.feed.HomeFeedListener");
            homeFeedPresenterImpl.addEventListener((com.amazon.aps.iva.vx.m) requireActivity);
            this.n = homeFeedPresenterImpl;
            n f = defpackage.i.v().f();
            androidx.fragment.app.h requireActivity2 = fragment.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity2, "fragment.requireActivity()");
            f.e(requireActivity2);
            com.amazon.aps.iva.ls.a aVar5 = com.amazon.aps.iva.ls.a.HOME;
            EtpContentService etpContentService6 = defpackage.i.v().getEtpContentService();
            com.amazon.aps.iva.yb0.j.f(aVar5, "screen");
            com.amazon.aps.iva.yb0.j.f(etpContentService6, "etpContentService");
            com.amazon.aps.iva.f60.d dVar = new com.amazon.aps.iva.f60.d(aVar5, etpContentService6, homeFeedScreenView);
            this.o = dVar;
            this.p = dVar.a((com.amazon.aps.iva.f60.m) new com.amazon.aps.iva.ez.f(fragment, com.amazon.aps.iva.f60.m.class, new C0967a()).getValue(this, lVarArr[1]));
            this.q = c.a.a(homeFeedScreenView, defpackage.i.v().d());
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    public final com.amazon.aps.iva.oh.g a() {
        return (com.amazon.aps.iva.oh.g) this.m.getValue();
    }
}
