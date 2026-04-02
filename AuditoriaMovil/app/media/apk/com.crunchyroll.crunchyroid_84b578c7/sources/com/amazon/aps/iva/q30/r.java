package com.amazon.aps.iva.q30;

import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.MusicAsset;
import com.ellation.crunchyroll.presentation.search.recent.RecentSearchesLayout;
/* compiled from: RecentSearchesPresenter.kt */
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.wy.b<w> implements q {
    public final u b;
    public final k c;
    public final x d;
    public final com.amazon.aps.iva.p30.f e;

    /* compiled from: RecentSearchesPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            String str2 = str;
            com.amazon.aps.iva.yb0.j.e(str2, "it");
            boolean b0 = com.amazon.aps.iva.oe0.m.b0(str2);
            r rVar = r.this;
            if (b0) {
                rVar.getClass();
                rVar.c.l1(new s(rVar, true));
            } else {
                rVar.q6(true);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: RecentSearchesPresenter.kt */
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

    public r(v vVar, m mVar, x xVar, com.amazon.aps.iva.p30.f fVar, RecentSearchesLayout recentSearchesLayout) {
        super(recentSearchesLayout, mVar);
        this.b = vVar;
        this.c = mVar;
        this.d = xVar;
        this.e = fVar;
    }

    @Override // com.amazon.aps.iva.q30.q
    public final void B5() {
        k kVar = this.c;
        kVar.M0();
        kVar.l1(new s(this, true));
    }

    @Override // com.amazon.aps.iva.q30.c
    public final void H1(com.amazon.aps.iva.q30.b bVar) {
        String a2 = bVar.a();
        k kVar = this.c;
        kVar.I1(a2);
        kVar.l1(new s(this, true));
    }

    @Override // com.amazon.aps.iva.q30.c
    public final void e5(com.amazon.aps.iva.q30.b bVar, int i) {
        this.b.a(bVar);
        boolean f = bVar.f();
        com.amazon.aps.iva.p30.f fVar = this.e;
        if (f) {
            MusicAsset b2 = bVar.b();
            com.amazon.aps.iva.yb0.j.c(b2);
            fVar.E(i, b2, "", true);
            return;
        }
        Panel c = bVar.c();
        com.amazon.aps.iva.yb0.j.c(c);
        fVar.s(i, c, "", true);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        boolean z;
        x xVar = this.d;
        CharSequence charSequence = (CharSequence) xVar.q0().d();
        if (charSequence != null && !com.amazon.aps.iva.oe0.m.b0(charSequence)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.c.l1(new s(this, false));
        } else {
            q6(false);
        }
        xVar.q0().e(getView(), new b(new a()));
    }

    public final void q6(boolean z) {
        if (z) {
            if (getView().isVisible()) {
                getView().se();
                return;
            }
            return;
        }
        getView().fe();
    }
}
