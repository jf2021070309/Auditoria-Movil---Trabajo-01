package com.amazon.aps.iva.e40;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.js.o0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.us.u;
/* compiled from: PremiumMembershipPresenter.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.wy.b<n> implements i {
    public final com.amazon.aps.iva.g40.b b;
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.g40.a, f> c;
    public final com.amazon.aps.iva.f40.a d;
    public final com.amazon.aps.iva.qh.a e;
    public final com.amazon.aps.iva.rh.a f;
    public final com.amazon.aps.iva.xh.b g;

    /* compiled from: PremiumMembershipPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.g40.a>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.g40.a> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.g40.a> gVar2 = gVar;
            m mVar = m.this;
            gVar2.c(new j(mVar));
            gVar2.e(new k(mVar));
            gVar2.b(new l(mVar));
            return q.a;
        }
    }

    /* compiled from: PremiumMembershipPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(a aVar) {
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

    public m(com.amazon.aps.iva.e40.a aVar, com.amazon.aps.iva.g40.g gVar, d dVar, com.amazon.aps.iva.f40.b bVar, com.amazon.aps.iva.qh.a aVar2, com.amazon.aps.iva.s20.h hVar, com.amazon.aps.iva.xh.b bVar2) {
        super(aVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = gVar;
        this.c = dVar;
        this.d = bVar;
        this.e = aVar2;
        this.f = hVar;
        this.g = bVar2;
    }

    @Override // com.amazon.aps.iva.e40.i
    public final void I5(com.amazon.aps.iva.fs.b bVar) {
        u.a.a(this.d, bVar, null, 6);
        this.g.a(null);
    }

    @Override // com.amazon.aps.iva.e40.i
    public final void X1(boolean z) {
        String str;
        g.c a2;
        com.amazon.aps.iva.g40.a aVar;
        if (z) {
            getView().Gh();
            return;
        }
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) this.b.I4().d();
        if (gVar != null && (a2 = gVar.a()) != null && (aVar = (com.amazon.aps.iva.g40.a) a2.a) != null) {
            str = aVar.a;
        } else {
            str = null;
        }
        if (com.amazon.aps.iva.yb0.j.a(str, "crunchyroll.google.premium.monthly")) {
            getView().G3();
        }
    }

    @Override // com.amazon.aps.iva.e40.i
    public final void k4(com.amazon.aps.iva.fs.b bVar) {
        g.c a2;
        com.amazon.aps.iva.g40.a aVar;
        String str;
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) this.b.I4().d();
        if (gVar != null && (a2 = gVar.a()) != null && (aVar = (com.amazon.aps.iva.g40.a) a2.a) != null && (str = aVar.a) != null) {
            this.e.a(new com.amazon.aps.iva.sh.a(str));
        }
        this.d.d(bVar);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        com.amazon.aps.iva.g40.b bVar = this.b;
        if (bVar.B7()) {
            getView().S3(bVar.D3());
            this.d.e(o0.b.a);
            return;
        }
        bVar.I4().e(getView(), new b(new a()));
    }
}
