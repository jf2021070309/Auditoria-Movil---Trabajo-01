package com.amazon.aps.iva.el;

import android.content.res.Configuration;
/* compiled from: PlayerViewPresenter.kt */
/* loaded from: classes2.dex */
public final class j0 extends com.amazon.aps.iva.wy.b<com.amazon.aps.iva.el.a> {
    public final k0 b;
    public final com.amazon.aps.iva.cj.h c;
    public final com.amazon.aps.iva.rv.a d;
    public final com.amazon.aps.iva.k50.g e;
    public final com.amazon.aps.iva.vk.a f;

    /* compiled from: PlayerViewPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
            Boolean bool2 = bool;
            com.amazon.aps.iva.yb0.j.e(bool2, "isStarted");
            if (bool2.booleanValue()) {
                j0 j0Var = j0.this;
                com.amazon.aps.iva.cj.h hVar = j0Var.c;
                j0Var.getView().bc(hVar);
                j0Var.getView().Jf(hVar);
                j0Var.getView().K2(hVar);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerViewPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(a aVar) {
            this.a = aVar;
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
    public j0(com.amazon.aps.iva.el.a aVar, p0 p0Var, com.amazon.aps.iva.cj.h hVar, com.amazon.aps.iva.rv.e eVar, com.amazon.aps.iva.k50.g gVar, com.amazon.aps.iva.vk.b bVar) {
        super(aVar, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(aVar, "view");
        this.b = p0Var;
        this.c = hVar;
        this.d = eVar;
        this.e = gVar;
        this.f = bVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onConfigurationChanged(Configuration configuration) {
        getView().yd();
        com.amazon.aps.iva.rv.a aVar = this.d;
        boolean c = aVar.c();
        k0 k0Var = this.b;
        com.amazon.aps.iva.cj.h hVar = this.c;
        if (!c && aVar.S0()) {
            if (k0Var.getSizeState().d() != h0.FULL_SCREEN_LOCKED) {
                k0Var.J0(h0.FULL_SCREEN);
                hVar.b().b(true);
            }
        } else if (k0Var.getSizeState().d() != h0.FULL_SCREEN_LOCKED) {
            k0Var.J0(h0.MINIMIZED);
            hVar.b().b(false);
        }
        hVar.b().a(aVar.b());
        if (configuration != null) {
            this.f.a(aVar, ((h0) com.amazon.aps.iva.xw.b0.a(k0Var.getSizeState())).isFullscreen());
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.c.P().e(getView(), new b(new a()));
        getView().yd();
    }

    public final void q6() {
        getView().yd();
        k0 k0Var = this.b;
        boolean isFullscreen = ((h0) com.amazon.aps.iva.xw.b0.a(k0Var.getSizeState())).isFullscreen();
        com.amazon.aps.iva.cj.h hVar = this.c;
        if (isFullscreen) {
            k0Var.v8();
            hVar.b().b(false);
        } else {
            k0Var.J0(h0.FULL_SCREEN_LOCKED);
            hVar.b().b(true);
        }
        k0Var.Z2();
    }
}
