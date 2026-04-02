package com.amazon.aps.iva.pi;

import com.amazon.aps.iva.i5.w;
/* compiled from: WatchMusicPlayerPresenter.kt */
/* loaded from: classes.dex */
public final class e extends com.amazon.aps.iva.wy.b<f> {
    public final g b;
    public final com.amazon.aps.iva.ye.a c;

    /* compiled from: WatchMusicPlayerPresenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
            Boolean bool2 = bool;
            com.amazon.aps.iva.yb0.j.e(bool2, "showDialog");
            boolean booleanValue = bool2.booleanValue();
            e eVar = e.this;
            if (booleanValue) {
                eVar.getView().P2();
            } else {
                eVar.getView().Ad();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchMusicPlayerPresenter.kt */
    /* loaded from: classes.dex */
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

    public e(f fVar, p pVar, com.amazon.aps.iva.ye.a aVar) {
        super(fVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = pVar;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.z7().e(getView(), new b(new a()));
    }

    public final void q6() {
        getView().closeScreen();
    }

    public final void r6() {
        this.c.endCastingSession();
    }

    public final void s6() {
        this.b.k();
    }
}
