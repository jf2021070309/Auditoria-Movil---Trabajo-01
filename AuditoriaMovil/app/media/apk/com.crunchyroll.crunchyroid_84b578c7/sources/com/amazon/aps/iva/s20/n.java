package com.amazon.aps.iva.s20;

import com.amazon.aps.iva.js.f;
import com.amazon.aps.iva.js.j0;
import com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.UpgradeActivity;
import java.util.List;
/* compiled from: UpgradePresenter.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.wy.b<s> implements i {
    public final t b;
    public final com.amazon.aps.iva.g30.g c;
    public final com.amazon.aps.iva.i20.e d;
    public final com.amazon.aps.iva.s20.b e;
    public final com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> f;
    public final boolean g;

    /* compiled from: UpgradePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n20.f>>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n20.f>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n20.f>> gVar2 = gVar;
            n nVar = n.this;
            gVar2.c(new j(nVar));
            gVar2.e(new k(nVar));
            gVar2.b(new m(nVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UpgradePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.wh.a>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.wh.a> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.wh.a> gVar2 = gVar;
            n nVar = n.this;
            gVar2.c(new o(nVar));
            gVar2.e(new p(nVar));
            gVar2.b(new q(nVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UpgradePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e30.a, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e30.a aVar) {
            com.amazon.aps.iva.e30.a aVar2 = aVar;
            n nVar = n.this;
            s q6 = n.q6(nVar);
            com.amazon.aps.iva.yb0.j.e(aVar2, "ctaModel");
            q6.H0(aVar2);
            com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> d = nVar.b.R7().d();
            com.amazon.aps.iva.yb0.j.c(d);
            n.q6(nVar).w0(d.b, aVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UpgradePresenter.kt */
    /* loaded from: classes2.dex */
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

    public n(UpgradeActivity upgradeActivity, z zVar, com.amazon.aps.iva.g30.g gVar, com.amazon.aps.iva.i20.e eVar, com.amazon.aps.iva.s20.b bVar, com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.a aVar, boolean z) {
        super(upgradeActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = zVar;
        this.c = gVar;
        this.d = eVar;
        this.e = bVar;
        this.f = aVar;
        this.g = z;
    }

    public static final /* synthetic */ s q6(n nVar) {
        return nVar.getView();
    }

    @Override // com.amazon.aps.iva.s20.i
    public final void Y(com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.js.i iVar) {
        com.amazon.aps.iva.b30.c cVar;
        String str;
        String str2;
        com.amazon.aps.iva.rs.m mVar;
        com.amazon.aps.iva.js.i iVar2;
        com.amazon.aps.iva.js.q qVar;
        String str3;
        String str4;
        com.amazon.aps.iva.rs.m mVar2;
        com.amazon.aps.iva.js.i iVar3;
        com.amazon.aps.iva.js.q qVar2;
        t tVar = this.b;
        com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> d2 = tVar.R7().d();
        com.amazon.aps.iva.ks.j jVar = null;
        if (d2 != null) {
            cVar = d2.b;
        } else {
            cVar = null;
        }
        if (this.g) {
            com.amazon.aps.iva.s20.b bVar2 = this.e;
            if (cVar != null) {
                str3 = cVar.b;
            } else {
                str3 = null;
            }
            if (cVar != null) {
                str4 = cVar.c;
            } else {
                str4 = null;
            }
            f.c cVar2 = f.c.a;
            if (cVar != null) {
                mVar2 = cVar.i;
            } else {
                mVar2 = null;
            }
            if (mVar2 != null) {
                iVar3 = com.amazon.aps.iva.js.i.CR_VOD_INTRO_OFFER;
            } else {
                iVar3 = iVar;
            }
            if (cVar != null) {
                qVar2 = com.amazon.aps.iva.b30.d.d(cVar);
            } else {
                qVar2 = null;
            }
            if (cVar != null) {
                jVar = com.amazon.aps.iva.b30.d.b(cVar);
            }
            bVar2.a(bVar, str3, str4, cVar2, iVar3, qVar2, jVar);
        } else {
            com.amazon.aps.iva.i20.e eVar = this.d;
            if (cVar != null) {
                str = cVar.b;
            } else {
                str = null;
            }
            if (cVar != null) {
                str2 = cVar.c;
            } else {
                str2 = null;
            }
            f.d dVar = f.d.a;
            if (cVar != null) {
                mVar = cVar.i;
            } else {
                mVar = null;
            }
            if (mVar != null) {
                iVar2 = com.amazon.aps.iva.js.i.CR_VOD_INTRO_OFFER;
            } else {
                iVar2 = iVar;
            }
            if (cVar != null) {
                qVar = com.amazon.aps.iva.b30.d.d(cVar);
            } else {
                qVar = null;
            }
            if (cVar != null) {
                jVar = com.amazon.aps.iva.b30.d.b(cVar);
            }
            eVar.a(bVar, str, str2, dVar, iVar2, qVar, jVar);
        }
        tVar.S1(bVar);
    }

    @Override // com.amazon.aps.iva.s20.i
    public final void a() {
        this.d.e();
    }

    @Override // com.amazon.aps.iva.s20.i
    public final void c() {
        getView().closeScreen();
        this.d.e();
    }

    @Override // com.amazon.aps.iva.s20.i
    public final void k(int i) {
        j0 j0Var;
        com.amazon.aps.iva.b30.c l = this.b.l(i);
        this.f.invoke(Integer.valueOf(i));
        if (l != null) {
            com.amazon.aps.iva.i20.e eVar = this.d;
            String str = l.b;
            String str2 = l.c;
            if (this.g) {
                j0Var = j0.UPGRADE;
            } else {
                j0Var = j0.UPSELL;
            }
            eVar.c(str, str2, j0Var, com.amazon.aps.iva.b30.d.a(l), com.amazon.aps.iva.b30.d.d(l), com.amazon.aps.iva.b30.d.b(l));
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        t tVar = this.b;
        tVar.c().e(getView(), new d(new a()));
        tVar.e1().e(getView(), new d(new b()));
        tVar.F().e(getView(), new d(new c()));
    }
}
