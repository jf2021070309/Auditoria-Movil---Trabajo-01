package com.amazon.aps.iva.qm;

import com.amazon.aps.iva.ez.g;
import com.crunchyroll.profiles.presentation.profileactivation.ProfileActivationActivityLegacy;
/* compiled from: ProfileActivationPresenter.kt */
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.wy.b<z> implements o {
    public final a0 b;
    public final com.amazon.aps.iva.jm.y c;
    public final c0 d;
    public final com.amazon.aps.iva.rm.a e;

    /* compiled from: ProfileActivationPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends String>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends String> gVar) {
            com.amazon.aps.iva.ez.g<? extends String> gVar2 = gVar;
            s sVar = s.this;
            gVar2.c(new p(sVar));
            gVar2.e(new q(sVar));
            gVar2.b(new r(sVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ProfileActivationPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.q> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.q> gVar2 = gVar;
            s sVar = s.this;
            gVar2.c(new t(sVar));
            gVar2.e(new u(sVar));
            gVar2.b(new v(sVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ProfileActivationPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public c(com.amazon.aps.iva.xb0.l lVar) {
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

    public s(ProfileActivationActivityLegacy profileActivationActivityLegacy, b0 b0Var, com.amazon.aps.iva.jm.y yVar, d0 d0Var, com.amazon.aps.iva.rm.b bVar) {
        super(profileActivationActivityLegacy, new com.amazon.aps.iva.wy.j[0]);
        this.b = b0Var;
        this.c = yVar;
        this.d = d0Var;
        this.e = bVar;
    }

    @Override // com.amazon.aps.iva.qm.o
    public final void J4(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "username");
        this.b.setUsername(str);
    }

    @Override // com.amazon.aps.iva.qm.o
    public final void L() {
        String str;
        g.c a2;
        z view = getView();
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) this.b.c0().d();
        if (gVar != null && (a2 = gVar.a()) != null) {
            str = (String) a2.a;
        } else {
            str = null;
        }
        view.ke(str);
    }

    @Override // com.amazon.aps.iva.qm.o
    public final void c() {
        getView().finish();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        a0 a0Var = this.b;
        a0Var.c0().e(getView(), new c(new a()));
        a0Var.D4().e(getView(), new c(new b()));
        this.e.a();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        String v = this.c.v();
        if (v != null) {
            getView().S(v);
        }
    }

    @Override // com.amazon.aps.iva.qm.o
    public final void x2() {
        getView().h6();
    }

    @Override // com.amazon.aps.iva.qm.o
    public final void y3() {
        this.b.Z4();
    }
}
