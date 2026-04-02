package com.amazon.aps.iva.t20;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i20.e;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.js.f;
import java.util.Iterator;
import java.util.List;
/* compiled from: ManageMembershipPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<q> implements com.amazon.aps.iva.t20.d {
    public final com.amazon.aps.iva.sh.a b;
    public final r c;
    public final com.amazon.aps.iva.i20.e d;
    public final com.amazon.aps.iva.i20.g e;
    public final com.amazon.aps.iva.k50.l f;
    public final com.amazon.aps.iva.g30.g g;
    public final com.amazon.aps.iva.k20.i h;
    public final com.amazon.aps.iva.xb0.a<Boolean> i;

    /* compiled from: ManageMembershipPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.u20.c.values().length];
            try {
                iArr[com.amazon.aps.iva.u20.c.CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.u20.c.UPGRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.u20.c.RENEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* compiled from: ManageMembershipPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n20.f>>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n20.f>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n20.f>> gVar2 = gVar;
            e eVar = e.this;
            gVar2.c(new i(eVar));
            gVar2.e(new j(eVar));
            gVar2.b(new l(eVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ManageMembershipPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.wh.a>, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.wh.a> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.wh.a> gVar2 = gVar;
            e eVar = e.this;
            gVar2.c(new m(eVar));
            gVar2.e(new n(eVar));
            gVar2.b(new o(eVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ManageMembershipPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            e.q6(e.this).closeScreen();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ManageMembershipPresenter.kt */
    /* renamed from: com.amazon.aps.iva.t20.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0728e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public C0728e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            e.q6(e.this).closeScreen();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ManageMembershipPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            e.q6(e.this).closeScreen();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ManageMembershipPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class g implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public g(com.amazon.aps.iva.xb0.l lVar) {
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

    public e(q qVar, com.amazon.aps.iva.sh.a aVar, u uVar, com.amazon.aps.iva.i20.e eVar, com.amazon.aps.iva.i20.g gVar, com.amazon.aps.iva.k50.m mVar, com.amazon.aps.iva.g30.g gVar2, com.amazon.aps.iva.k20.g gVar3, com.amazon.aps.iva.xb0.a aVar2) {
        super(qVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = aVar;
        this.c = uVar;
        this.d = eVar;
        this.e = gVar;
        this.f = mVar;
        this.g = gVar2;
        this.h = gVar3;
        this.i = aVar2;
    }

    public static final /* synthetic */ q q6(e eVar) {
        return eVar.getView();
    }

    @Override // com.amazon.aps.iva.t20.d
    public final void k(int i) {
        com.amazon.aps.iva.b30.c l = this.c.l(i);
        getView().dd(i);
        if (l != null) {
            e.b.b(this.d, l.b, l.c, null, null, null, 60);
            getView().R9(l.b, this.b.b);
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        r rVar = this.c;
        rVar.c().e(getView(), new g(new b()));
        rVar.e1().e(getView(), new g(new c()));
        this.h.a(new d(), new C0728e(), new f());
    }

    public final void r6(com.amazon.aps.iva.fs.b bVar) {
        this.e.a(bVar);
        this.f.a();
        getView().closeScreen();
    }

    public final void s6(com.amazon.aps.iva.u20.c cVar, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.b30.c cVar2;
        com.amazon.aps.iva.n20.f fVar;
        g.c a2;
        List list;
        Object obj;
        com.amazon.aps.iva.yb0.j.f(cVar, "manageMembershipCtaType");
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        int i = a.a[cVar.ordinal()];
        String str = null;
        com.amazon.aps.iva.b30.c cVar3 = null;
        com.amazon.aps.iva.b30.c cVar4 = null;
        r rVar = this.c;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> d2 = rVar.R7().d();
                    if (d2 != null) {
                        cVar3 = d2.b;
                    }
                    com.amazon.aps.iva.yb0.j.c(cVar3);
                    e.b.a(this.d, bVar, cVar3.b, cVar3.c, f.b.a, com.amazon.aps.iva.js.i.CR_VOD_ACQUISITION);
                    this.f.a();
                    getView().closeScreen();
                    return;
                }
                return;
            }
            com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> d3 = rVar.R7().d();
            if (d3 != null) {
                cVar4 = d3.b;
            }
            com.amazon.aps.iva.yb0.j.c(cVar4);
            e.b.a(this.d, bVar, cVar4.b, cVar4.c, f.c.a, com.amazon.aps.iva.js.i.CR_VOD_ACQUISITION);
            rVar.E6(this.b.b, bVar);
            return;
        }
        com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> d4 = rVar.R7().d();
        if (d4 != null) {
            cVar2 = d4.b;
        } else {
            cVar2 = null;
        }
        com.amazon.aps.iva.yb0.j.c(cVar2);
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) rVar.c().d();
        if (gVar != null && (a2 = gVar.a()) != null && (list = (List) a2.a) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.n20.f) obj).a, "crunchyroll.google.premium.monthly")) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            fVar = (com.amazon.aps.iva.n20.f) obj;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            str = fVar.b;
        }
        this.h.b(new com.amazon.aps.iva.k20.k(cVar2.b, cVar2.c, str, this.i.invoke().booleanValue()), new com.amazon.aps.iva.t20.f(this), new com.amazon.aps.iva.t20.g(this), new h(this));
        this.e.b(bVar);
    }
}
