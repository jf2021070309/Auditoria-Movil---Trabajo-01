package com.amazon.aps.iva.tf;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.contentrating.contentrating.ContentRatingLayout;
/* compiled from: ContentRatingPresenter.kt */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.wy.b<e> implements com.amazon.aps.iva.tf.c {
    public final f b;

    /* compiled from: ContentRatingPresenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.uf.b, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.uf.b bVar) {
            com.amazon.aps.iva.uf.b bVar2 = bVar;
            j.e(bVar2, "it");
            d.this.getView().n3(bVar2);
            return q.a;
        }
    }

    /* compiled from: ContentRatingPresenter.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            Boolean bool2 = bool;
            j.e(bool2, "isEnabled");
            boolean booleanValue = bool2.booleanValue();
            d dVar = d.this;
            if (booleanValue) {
                dVar.getView().D5();
            } else {
                dVar.getView().Q6();
            }
            return q.a;
        }
    }

    /* compiled from: ContentRatingPresenter.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<q, q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(q qVar) {
            j.f(qVar, "$this$observeEvent");
            d.this.getView().tb(com.amazon.aps.iva.bt.c.b);
            return q.a;
        }
    }

    /* compiled from: ContentRatingPresenter.kt */
    /* renamed from: com.amazon.aps.iva.tf.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0740d implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public C0740d(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
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

    public d(ContentRatingLayout contentRatingLayout, f fVar) {
        super(contentRatingLayout, new com.amazon.aps.iva.wy.j[0]);
        this.b = fVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        f fVar = this.b;
        fVar.o3().e(getView(), new C0740d(new a()));
        fVar.n6().e(getView(), new C0740d(new b()));
        com.amazon.aps.iva.ez.e.a(fVar.R4(), getView(), new c());
    }

    @Override // com.amazon.aps.iva.tf.c
    public final void v0(com.amazon.aps.iva.sf.e eVar) {
        j.f(eVar, "contentRatingInput");
        if (eVar.c == t.EPISODE) {
            getView().k();
            this.b.g4(eVar);
            return;
        }
        getView().f();
    }
}
