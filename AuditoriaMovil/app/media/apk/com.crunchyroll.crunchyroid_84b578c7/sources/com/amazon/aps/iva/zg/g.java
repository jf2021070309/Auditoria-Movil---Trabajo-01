package com.amazon.aps.iva.zg;

import com.amazon.aps.iva.i5.w;
import com.crunchyroll.emailverification.banner.EmailVerificationBannerLayout;
/* compiled from: EmailVerificationBannerPresenter.kt */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.wy.b<k> implements f {
    public final d b;
    public final boolean c;
    public final com.amazon.aps.iva.yg.e d;

    /* compiled from: EmailVerificationBannerPresenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<j, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(j jVar) {
            j jVar2 = jVar;
            boolean z = jVar2 instanceof r;
            g gVar = g.this;
            if (z) {
                g.r6(gVar);
            } else if (jVar2 instanceof com.amazon.aps.iva.zg.a) {
                k q6 = g.q6(gVar);
                com.amazon.aps.iva.yb0.j.e(jVar2, "model");
                q6.H2(jVar2);
                g.s6(gVar);
                g.q6(gVar).O3();
                gVar.d.b();
            } else if (jVar2 instanceof q) {
                if (gVar.c) {
                    k q62 = g.q6(gVar);
                    com.amazon.aps.iva.yb0.j.e(jVar2, "model");
                    q62.H2(jVar2);
                    g.s6(gVar);
                    g.q6(gVar).w5();
                    gVar.d.c();
                } else {
                    g.r6(gVar);
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: EmailVerificationBannerPresenter.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends String>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends String> gVar) {
            com.amazon.aps.iva.ez.g<? extends String> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "$this$observeEvent");
            g gVar3 = g.this;
            gVar2.e(new h(gVar3));
            gVar2.b(new i(gVar3));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: EmailVerificationBannerPresenter.kt */
    /* loaded from: classes.dex */
    public static final class c implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public c(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
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

    public g(EmailVerificationBannerLayout emailVerificationBannerLayout, e eVar, boolean z, com.amazon.aps.iva.yg.f fVar) {
        super(emailVerificationBannerLayout, new com.amazon.aps.iva.wy.j[0]);
        this.b = eVar;
        this.c = z;
        this.d = fVar;
    }

    public static final /* synthetic */ k q6(g gVar) {
        return gVar.getView();
    }

    public static final void r6(g gVar) {
        d dVar = gVar.b;
        if (dVar.h()) {
            gVar.getView().pb();
            dVar.e();
            return;
        }
        gVar.getView().hide();
    }

    public static final void s6(g gVar) {
        d dVar = gVar.b;
        if (dVar.h()) {
            gVar.getView().Pe();
            dVar.e();
            return;
        }
        gVar.getView().show();
    }

    @Override // com.amazon.aps.iva.zg.f
    public final void T1() {
        this.b.g();
    }

    @Override // com.amazon.aps.iva.zg.f
    public final void j5(com.amazon.aps.iva.fs.b bVar) {
        this.d.a(bVar);
        this.b.f();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        d dVar = this.b;
        dVar.b().e(getView(), new c(new a()));
        com.amazon.aps.iva.ez.e.a(dVar.c(), getView(), new b());
    }
}
