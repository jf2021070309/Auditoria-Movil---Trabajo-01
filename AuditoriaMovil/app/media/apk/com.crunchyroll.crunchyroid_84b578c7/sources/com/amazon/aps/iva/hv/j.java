package com.amazon.aps.iva.hv;

import com.amazon.aps.iva.cv.y;
import com.amazon.aps.iva.cv.z;
import com.amazon.aps.iva.i5.w;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: CrunchylistSearchPresenter.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.wy.b<m> implements g {
    public final s b;
    public final y c;

    /* compiled from: CrunchylistSearchPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<com.amazon.aps.iva.iv.b>>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<com.amazon.aps.iva.iv.b>> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<com.amazon.aps.iva.iv.b>> gVar2 = gVar;
            j jVar = j.this;
            gVar2.e(new h(jVar));
            gVar2.b(new i(jVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistSearchPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends Panel>>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends Panel>> dVar) {
            com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends Panel>> dVar2 = dVar;
            j jVar = j.this;
            ((com.amazon.aps.iva.ez.g) dVar2.b).c(new k(jVar));
            ((com.amazon.aps.iva.ez.g) dVar2.b).b(new l(jVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistSearchPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            String str2 = str;
            com.amazon.aps.iva.yb0.j.e(str2, "searchText");
            boolean z = !com.amazon.aps.iva.oe0.m.b0(str2);
            j jVar = j.this;
            if (z) {
                j.q6(jVar).J9();
            } else {
                j.q6(jVar).m();
                j.q6(jVar).sc();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistSearchPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public d(com.amazon.aps.iva.xb0.l lVar) {
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

    public j(com.amazon.aps.iva.hv.a aVar, o oVar, z zVar) {
        super(aVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = oVar;
        this.c = zVar;
    }

    public static final /* synthetic */ m q6(j jVar) {
        return jVar.getView();
    }

    @Override // com.amazon.aps.iva.hv.g
    public final void Z4(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "searchText");
        boolean z = !com.amazon.aps.iva.oe0.m.b0(str);
        s sVar = this.b;
        if (z) {
            sVar.A8(str);
        } else {
            sVar.V();
        }
    }

    @Override // com.amazon.aps.iva.hv.g
    public final void b() {
        getView().m();
        this.b.A();
    }

    @Override // com.amazon.aps.iva.hv.g
    public final void d6() {
        getView().d();
    }

    @Override // com.amazon.aps.iva.hv.g
    public final void i0(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        this.c.e6(panel);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        getView().oa();
        s sVar = this.b;
        sVar.D7().e(getView(), new d(new a()));
        this.c.H().e(getView(), new d(new b()));
        sVar.q0().e(getView(), new d(new c()));
    }

    @Override // com.amazon.aps.iva.hv.g
    public final void u() {
        getView().closeScreen();
    }
}
