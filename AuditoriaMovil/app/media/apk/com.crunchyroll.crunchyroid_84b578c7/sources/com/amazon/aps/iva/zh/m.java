package com.amazon.aps.iva.zh;

import com.amazon.aps.iva.ez.g;
import com.crunchyroll.music.artist.ArtistActivity;
import java.util.List;
/* compiled from: ArtistPresenter.kt */
/* loaded from: classes.dex */
public final class m extends com.amazon.aps.iva.wy.b<u> implements l {
    public final v b;
    public final com.ellation.crunchyroll.application.d c;
    public final com.amazon.aps.iva.n60.b d;
    public final com.amazon.aps.iva.rv.a e;
    public final com.amazon.aps.iva.gn.b f;
    public final com.amazon.aps.iva.bi.a g;
    public final com.amazon.aps.iva.zh.c h;

    /* compiled from: ArtistPresenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            m.this.b.c5();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ArtistPresenter.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends t>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends t> gVar) {
            com.amazon.aps.iva.ez.g<? extends t> gVar2 = gVar;
            m mVar = m.this;
            gVar2.c(new n(mVar));
            gVar2.e(new o(mVar));
            gVar2.b(new q(mVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ArtistPresenter.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.ci.h>, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.ci.h> list) {
            List<? extends com.amazon.aps.iva.ci.h> list2 = list;
            u q6 = m.q6(m.this);
            com.amazon.aps.iva.yb0.j.e(list2, "it");
            q6.z6(list2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ArtistPresenter.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.zh.e, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.zh.e eVar) {
            m mVar = m.this;
            m.q6(mVar).n6(eVar.a, new r(mVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ArtistPresenter.kt */
    /* loaded from: classes.dex */
    public static final class e implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public e(com.amazon.aps.iva.xb0.l lVar) {
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

    public m(ArtistActivity artistActivity, w wVar, com.ellation.crunchyroll.application.d dVar, com.amazon.aps.iva.n60.b bVar, com.amazon.aps.iva.rv.e eVar, com.amazon.aps.iva.gn.c cVar, com.amazon.aps.iva.bi.a aVar, com.amazon.aps.iva.zh.d dVar2) {
        super(artistActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = wVar;
        this.c = dVar;
        this.d = bVar;
        this.e = eVar;
        this.f = cVar;
        this.g = aVar;
        this.h = dVar2;
    }

    public static final /* synthetic */ u q6(m mVar) {
        return mVar.getView();
    }

    @Override // com.amazon.aps.iva.zh.l
    public final void D2() {
        g.c a2;
        t tVar;
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) this.b.X4().d();
        if (gVar != null && (a2 = gVar.a()) != null && (tVar = (t) a2.a) != null) {
            this.f.g3(tVar.a, tVar.b.a);
        }
    }

    @Override // com.amazon.aps.iva.zh.l
    public final void H2() {
        getView().k7();
    }

    @Override // com.amazon.aps.iva.zh.l
    public final void S() {
        getView().y1(this.b.d0());
    }

    @Override // com.amazon.aps.iva.zh.l
    public final void Z0() {
        this.b.c5();
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppResume(boolean z) {
        if (z) {
            this.d.c(new a());
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        v vVar = this.b;
        vVar.X4().e(getView(), new e(new b()));
        com.amazon.aps.iva.rv.a aVar = this.e;
        if (aVar.c() && aVar.S0()) {
            getView().cf();
        } else {
            getView().Zf();
        }
        if (!getView().E()) {
            getView().M6();
        }
        vVar.E1().e(getView(), new e(new c()));
        vVar.L2().e(getView(), new e(new d()));
        this.c.S7(this, getView());
    }

    @Override // com.amazon.aps.iva.zh.l
    public final void p(com.amazon.aps.iva.gn.a aVar) {
        g.c a2;
        t tVar;
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) this.b.X4().d();
        if (gVar != null && (a2 = gVar.a()) != null && (tVar = (t) a2.a) != null) {
            this.f.f0(aVar, tVar.a, tVar.b.a);
        }
    }

    @Override // com.amazon.aps.iva.zh.l
    public final void w1(int i) {
        v vVar = this.b;
        if (i == 0) {
            vVar.k7();
        } else {
            vVar.N6();
        }
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppCreate() {
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppStop() {
    }
}
