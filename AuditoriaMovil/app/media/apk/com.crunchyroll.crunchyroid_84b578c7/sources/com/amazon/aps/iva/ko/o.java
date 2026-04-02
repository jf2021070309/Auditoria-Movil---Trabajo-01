package com.amazon.aps.iva.ko;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.k50.j;
import com.amazon.aps.iva.us.u;
import com.amazon.aps.iva.us.v;
import com.crunchyroll.usermigration.welcome.UserMigrationWelcomeActivity;
import com.ellation.crunchyroll.api.etp.auth.model.WatchDataStatus;
/* compiled from: UserMigrationWelcomePresenter.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.wy.b<s> implements k {
    public final com.amazon.aps.iva.ko.a b;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> c;
    public final com.amazon.aps.iva.k50.j d;
    public final boolean e;
    public final com.amazon.aps.iva.fo.g f;
    public final u g;
    public final com.amazon.aps.iva.co.b h;
    public final g i;

    /* compiled from: UserMigrationWelcomePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.co.j>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.co.j> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.co.j> gVar2 = gVar;
            o oVar = o.this;
            gVar2.c(new l(oVar));
            gVar2.e(new m(oVar));
            gVar2.b(new n(oVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UserMigrationWelcomePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends WatchDataStatus>>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends WatchDataStatus>> dVar) {
            com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends WatchDataStatus>> dVar2 = dVar;
            o oVar = o.this;
            ((com.amazon.aps.iva.ez.g) dVar2.b).c(new p(oVar));
            com.amazon.aps.iva.ez.g<? extends WatchDataStatus> a = dVar2.a();
            if (a != null) {
                a.e(new q(oVar));
                a.b(new r(oVar));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UserMigrationWelcomePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public c(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
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

    public o(UserMigrationWelcomeActivity userMigrationWelcomeActivity, com.amazon.aps.iva.ko.b bVar, com.crunchyroll.usermigration.welcome.a aVar, com.amazon.aps.iva.k50.j jVar, boolean z, com.amazon.aps.iva.fo.g gVar, v vVar, com.amazon.aps.iva.co.b bVar2, g gVar2) {
        super(userMigrationWelcomeActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = bVar;
        this.c = aVar;
        this.d = jVar;
        this.e = z;
        this.f = gVar;
        this.g = vVar;
        this.h = bVar2;
        this.i = gVar2;
    }

    @Override // com.amazon.aps.iva.ko.k
    public final void C2(com.amazon.aps.iva.fs.b bVar) {
        this.i.y(bVar);
        getView().closeScreen();
        this.c.invoke();
    }

    @Override // com.amazon.aps.iva.ko.k
    public final void j(com.amazon.aps.iva.fs.b bVar) {
        u.a.a(this.g, bVar, null, 6);
        j.a.a(this.d, this.c, 1);
    }

    @Override // com.amazon.aps.iva.ko.k
    public final void n5(com.amazon.aps.iva.fs.b bVar) {
        this.i.A(bVar);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        com.amazon.aps.iva.ko.a aVar = this.b;
        aVar.o1().e(getView(), new c(new a()));
        aVar.N7().e(getView(), new c(new b()));
    }

    @Override // com.amazon.aps.iva.ko.k
    public final void q5() {
        this.b.X3();
    }

    @Override // com.amazon.aps.iva.ko.k
    public final void s1(com.amazon.aps.iva.co.c cVar, com.amazon.aps.iva.fs.b bVar) {
        this.i.B(bVar);
        this.b.u8(cVar);
    }

    @Override // com.amazon.aps.iva.ko.k
    public final void x(com.amazon.aps.iva.co.c cVar, com.amazon.aps.iva.fs.b bVar) {
        g gVar = this.i;
        gVar.x(cVar, bVar);
        getView().b0();
        gVar.C();
    }
}
