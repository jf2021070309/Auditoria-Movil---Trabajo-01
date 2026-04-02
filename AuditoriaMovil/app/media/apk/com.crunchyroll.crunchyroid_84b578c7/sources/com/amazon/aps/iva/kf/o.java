package com.amazon.aps.iva.kf;

import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyApp;
import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyAppAuthUrls;
import java.util.List;
/* compiled from: ConnectedAppsPresenter.kt */
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.wy.b<v> implements j {
    public final x b;
    public final com.amazon.aps.iva.kf.c c;
    public final com.ellation.crunchyroll.application.d d;
    public boolean e;

    /* compiled from: ConnectedAppsPresenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends c0>>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends c0>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends c0>> gVar2 = gVar;
            o oVar = o.this;
            gVar2.c(new k(oVar));
            gVar2.e(new l(oVar));
            gVar2.b(new n(oVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ConnectedAppsPresenter.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends ThirdPartyAppAuthUrls>>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends ThirdPartyAppAuthUrls>> dVar) {
            com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends ThirdPartyAppAuthUrls>> dVar2 = dVar;
            o oVar = o.this;
            ((com.amazon.aps.iva.ez.g) dVar2.b).c(new p(oVar));
            com.amazon.aps.iva.ez.g<? extends ThirdPartyAppAuthUrls> a = dVar2.a();
            if (a != null) {
                a.e(new q(oVar));
                a.b(new r(oVar));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ConnectedAppsPresenter.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends c0>>, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends c0>> dVar) {
            com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends c0>> dVar2 = dVar;
            o oVar = o.this;
            ((com.amazon.aps.iva.ez.g) dVar2.b).c(new s(oVar));
            com.amazon.aps.iva.ez.g<? extends c0> a = dVar2.a();
            if (a != null) {
                a.e(new t(oVar));
                a.b(new u(oVar));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ConnectedAppsPresenter.kt */
    /* loaded from: classes.dex */
    public static final class d implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public d(com.amazon.aps.iva.xb0.l lVar) {
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

    public o(g gVar, y yVar, com.amazon.aps.iva.kf.d dVar, com.ellation.crunchyroll.application.d dVar2) {
        super(gVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = yVar;
        this.c = dVar;
        this.d = dVar2;
    }

    @Override // com.amazon.aps.iva.kf.j
    public final void B0(c0 c0Var, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "uiModel");
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        boolean a2 = c0Var.a();
        com.amazon.aps.iva.kf.c cVar = this.c;
        ThirdPartyApp thirdPartyApp = c0Var.k;
        if (a2) {
            getView().pd(c0Var);
            cVar.v(thirdPartyApp.getPlatform(), bVar);
            return;
        }
        this.b.s5(thirdPartyApp);
        cVar.A(thirdPartyApp.getPlatform(), bVar);
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppResume(boolean z) {
        if (z) {
            this.b.d7();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        x xVar = this.b;
        xVar.y3().e(getView(), new d(new a()));
        xVar.w8().e(getView(), new d(new b()));
        xVar.F4().e(getView(), new d(new c()));
        this.d.S7(this, getView());
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        if (this.e) {
            this.b.d7();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onStop() {
        this.e = true;
    }

    @Override // com.amazon.aps.iva.kf.j
    public final void t4(c0 c0Var) {
        this.b.j1(c0Var);
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppCreate() {
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppStop() {
    }
}
