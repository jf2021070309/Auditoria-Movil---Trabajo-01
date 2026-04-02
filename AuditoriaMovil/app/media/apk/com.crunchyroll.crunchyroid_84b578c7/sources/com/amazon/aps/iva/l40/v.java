package com.amazon.aps.iva.l40;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.g00.a;
import com.amazon.aps.iva.sv.f2;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Images;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShowPagePresenter.kt */
/* loaded from: classes2.dex */
public final class v extends com.amazon.aps.iva.wy.b<i1> implements u {
    public final boolean b;
    public final j1 c;
    public final com.amazon.aps.iva.l40.o d;
    public final com.amazon.aps.iva.i50.b e;
    public final String f;
    public final com.amazon.aps.iva.rv.a g;
    public final com.ellation.crunchyroll.application.d h;
    public final BulkDownloadsManager i;
    public final com.amazon.aps.iva.n60.b j;
    public final com.amazon.aps.iva.gn.b k;
    public final com.amazon.aps.iva.x50.u l;
    public final com.amazon.aps.iva.n70.d<t> m;
    public final com.amazon.aps.iva.oh.g n;
    public f2<com.amazon.aps.iva.vv.a> o;

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            v.this.c.g8();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.m00.b>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.m00.b> gVar) {
            gVar.e(new b0(v.this));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.qz.a>, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.qz.a> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.qz.a> gVar2 = gVar;
            v vVar = v.this;
            gVar2.e(new c0(vVar));
            gVar2.b(new e0(vVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends ContentContainer>, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends ContentContainer> gVar) {
            com.amazon.aps.iva.ez.g<? extends ContentContainer> gVar2 = gVar;
            v vVar = v.this;
            gVar2.c(new x(vVar));
            gVar2.e(new y(vVar));
            gVar2.b(new a0(vVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.m50.b>, com.amazon.aps.iva.kb0.q> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.m50.b> gVar) {
            gVar.e(new f0(v.q6(v.this)));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.di.d>, com.amazon.aps.iva.kb0.q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.di.d> gVar) {
            gVar.e(new g0(v.q6(v.this)));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends Images>, com.amazon.aps.iva.kb0.q> {
        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends Images> gVar) {
            gVar.e(new h0(v.this));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.r40.a>, com.amazon.aps.iva.kb0.q> {
        public h() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.r40.a> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.r40.a> gVar2 = gVar;
            v vVar = v.this;
            gVar2.c(new i0(vVar));
            gVar2.e(new j0(vVar));
            gVar2.b(new l0(vVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.m40.c>, com.amazon.aps.iva.kb0.q> {
        public i() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.m40.c> gVar) {
            gVar.e(new m0(v.this));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.o00.e>, com.amazon.aps.iva.kb0.q> {
        public j() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.o00.e> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.o00.e> gVar2 = gVar;
            v vVar = v.this;
            gVar2.e(new o0(vVar));
            gVar2.b(new p0(vVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.l40.f>, com.amazon.aps.iva.kb0.q> {
        public k() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.l40.f> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.l40.f> gVar2 = gVar;
            v vVar = v.this;
            gVar2.c(new q0(vVar));
            gVar2.e(new r0(vVar));
            gVar2.b(new t0(vVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends Season>, com.amazon.aps.iva.kb0.q> {
        public l() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends Season> gVar) {
            com.amazon.aps.iva.ez.g<? extends Season> gVar2 = gVar;
            v vVar = v.this;
            gVar2.e(new u0(vVar));
            gVar2.b(new v0(vVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.oh.a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.amazon.aps.iva.oh.a aVar) {
            super(0);
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            v.this.n.H8(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ List<String> i;
        public final /* synthetic */ Season j;
        public final /* synthetic */ ContentContainer k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(List<String> list, Season season, ContentContainer contentContainer) {
            super(0);
            this.i = list;
            this.j = season;
            this.k = contentContainer;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            com.amazon.aps.iva.oh.g gVar = v.this.n;
            List<String> list = this.i;
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
            for (String str : list) {
                arrayList.add(new com.amazon.aps.iva.nz.a(str, this.k.getId()));
            }
            Season season = this.j;
            com.amazon.aps.iva.yb0.j.f(season, "season");
            com.amazon.aps.iva.xb0.l lVar = com.amazon.aps.iva.e.w.e;
            if (lVar != null) {
                gVar.U4(new com.amazon.aps.iva.oh.a(arrayList, new com.amazon.aps.iva.ks.e(com.amazon.aps.iva.us.s.a(season.getChannelId(), lVar), com.amazon.aps.iva.js.p.SEASON, season.getId(), "", "", season.getTitle(), null, null, 448)));
                return com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.m("getChannelById");
            throw null;
        }
    }

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public o() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            v.this.c.a4();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPagePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class p implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public p(com.amazon.aps.iva.xb0.l lVar) {
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
    public v(boolean z, j1 j1Var, com.amazon.aps.iva.l40.p pVar, com.amazon.aps.iva.i50.c cVar, String str, com.amazon.aps.iva.rv.e eVar, com.ellation.crunchyroll.application.d dVar, BulkDownloadsManager bulkDownloadsManager, com.amazon.aps.iva.n60.c cVar2, com.amazon.aps.iva.gn.c cVar3, com.amazon.aps.iva.x50.u uVar, f1 f1Var, com.amazon.aps.iva.oh.g gVar, i1 i1Var) {
        super(i1Var, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(dVar, "appLifecycle");
        com.amazon.aps.iva.yb0.j.f(bulkDownloadsManager, "bulkDownloadsManager");
        com.amazon.aps.iva.yb0.j.f(cVar3, "shareComponent");
        com.amazon.aps.iva.yb0.j.f(gVar, "markAsWatchedToggleViewModel");
        this.b = z;
        this.c = j1Var;
        this.d = pVar;
        this.e = cVar;
        this.f = str;
        this.g = eVar;
        this.h = dVar;
        this.i = bulkDownloadsManager;
        this.j = cVar2;
        this.k = cVar3;
        this.l = uVar;
        this.m = f1Var;
        this.n = gVar;
    }

    public static final /* synthetic */ i1 q6(v vVar) {
        return vVar.getView();
    }

    @Override // com.amazon.aps.iva.l40.u
    public final void F4() {
        getView().H4();
    }

    @Override // com.amazon.aps.iva.l40.u
    public final void O(com.amazon.aps.iva.a70.b bVar) {
        com.amazon.aps.iva.ez.g gVar;
        g.c a2;
        ContentContainer contentContainer;
        ContentContainer contentContainer2;
        g.c a3;
        com.amazon.aps.iva.yb0.j.f(bVar, "menuItem");
        boolean a4 = com.amazon.aps.iva.yb0.j.a(bVar, a.C0284a.e);
        j1 j1Var = this.c;
        if (a4) {
            com.amazon.aps.iva.ez.g gVar2 = (com.amazon.aps.iva.ez.g) j1Var.h0().d();
            if (gVar2 != null && (a3 = gVar2.a()) != null) {
                contentContainer2 = (ContentContainer) a3.a;
            } else {
                contentContainer2 = null;
            }
            if (contentContainer2 != null) {
                getView().e(contentContainer2.getTitle(), new w0(this, contentContainer2), new x0(this));
            }
        } else if (com.amazon.aps.iva.yb0.j.a(bVar, a.b.e) && (gVar = (com.amazon.aps.iva.ez.g) j1Var.h0().d()) != null && (a2 = gVar.a()) != null && (contentContainer = (ContentContainer) a2.a) != null) {
            this.k.F5(contentContainer);
        }
    }

    @Override // com.amazon.aps.iva.l40.u
    public final void R4(Season season) {
        com.amazon.aps.iva.yb0.j.f(season, "season");
        this.c.E5(season);
    }

    @Override // com.amazon.aps.iva.l40.u
    public final void S() {
        g.c a2;
        com.amazon.aps.iva.e20.a aVar;
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) this.c.d0().d();
        if (gVar != null && (a2 = gVar.a()) != null && (aVar = (com.amazon.aps.iva.e20.a) a2.a) != null) {
            getView().y1(aVar);
        }
    }

    @Override // com.amazon.aps.iva.l40.u
    public final void Y3() {
        getView().nh(com.amazon.aps.iva.ee0.f1.K(a.C0284a.e, a.b.e));
    }

    @Override // com.amazon.aps.iva.l40.u
    public final void b2(List<String> list) {
        com.amazon.aps.iva.yb0.j.f(list, "assetIds");
        j1 j1Var = this.c;
        j1Var.W1(list);
        T d2 = j1Var.h0().d();
        com.amazon.aps.iva.yb0.j.c(d2);
        g.c a2 = ((com.amazon.aps.iva.ez.g) d2).a();
        com.amazon.aps.iva.yb0.j.c(a2);
        ContentContainer contentContainer = (ContentContainer) a2.a;
        T d3 = j1Var.q5().d();
        com.amazon.aps.iva.yb0.j.c(d3);
        g.c a3 = ((com.amazon.aps.iva.ez.g) d3).a();
        com.amazon.aps.iva.yb0.j.c(a3);
        T t = a3.a;
        com.amazon.aps.iva.yb0.j.c(t);
        getView().e(contentContainer.getTitle(), new n(list, (Season) t, contentContainer), new o());
    }

    @Override // com.amazon.aps.iva.l40.u
    public final void c0() {
        getView().G9();
    }

    @Override // com.amazon.aps.iva.l40.u
    public final void n(com.amazon.aps.iva.oh.a aVar, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        getView().e(str, new m(aVar), h1.h);
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppCreate() {
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppResume(boolean z) {
        if (z) {
            this.j.c(new a());
        }
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppStop() {
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        j1 j1Var = this.c;
        j1Var.h0().e(getView(), new p(new d()));
        j1Var.x().e(getView(), new p(new e()));
        j1Var.Q0().e(getView(), new p(new f()));
        j1Var.X0().e(getView(), new p(new g()));
        j1Var.z2().e(getView(), new p(new h()));
        j1Var.r7().e(getView(), new p(new i()));
        j1Var.K1().e(getView(), new p(new j()));
        j1Var.j6().e(getView(), new p(new k()));
        j1Var.q5().e(getView(), new p(new l()));
        j1Var.c4().e(getView(), new p(new b()));
        j1Var.l7().e(getView(), new p(new c()));
        if (!getView().E()) {
            getView().Uh();
        }
        String str = this.f;
        if (str != null) {
            getView().we(str);
        }
        this.h.S7(this, getView());
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onDestroy() {
        f2<com.amazon.aps.iva.vv.a> f2Var = this.o;
        if (f2Var != null) {
            this.i.removeEventListener(f2Var);
        }
    }

    @Override // com.amazon.aps.iva.l40.u
    public final void p(com.amazon.aps.iva.gn.a aVar) {
        g.c a2;
        ContentContainer contentContainer;
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) this.c.h0().d();
        if (gVar != null && (a2 = gVar.a()) != null && (contentContainer = (ContentContainer) a2.a) != null) {
            this.k.G2(aVar, contentContainer);
        }
    }

    @Override // com.amazon.aps.iva.l40.u
    public final void s0() {
        getView().H4();
    }

    @Override // com.amazon.aps.iva.l40.u
    public final void v3() {
        this.c.q2();
    }

    @Override // com.amazon.aps.iva.l40.u
    public final void x5() {
        getView().showSnackbar(com.amazon.aps.iva.bt.c.b);
        this.c.a4();
    }
}
