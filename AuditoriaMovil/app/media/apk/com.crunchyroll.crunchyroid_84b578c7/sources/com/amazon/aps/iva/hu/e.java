package com.amazon.aps.iva.hu;

import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.List;
/* compiled from: LocalCommentsPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<f> implements com.amazon.aps.iva.hu.c {
    public final g b;
    public final com.amazon.aps.iva.nu.f c;

    /* compiled from: LocalCommentsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<List<? extends x>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(List<? extends x> list) {
            List<? extends x> list2 = list;
            e eVar = e.this;
            j.e(list2, "comments");
            eVar.getView().ub(list2, new d(list2, eVar));
            return q.a;
        }
    }

    /* compiled from: LocalCommentsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<q, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(q qVar) {
            j.f(qVar, "$this$observeEvent");
            e.this.c.D6();
            return q.a;
        }
    }

    /* compiled from: LocalCommentsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public c(a aVar) {
            this.a = aVar;
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

    public e(f fVar, h hVar, com.amazon.aps.iva.nu.f fVar2) {
        super(fVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = hVar;
        this.c = fVar2;
    }

    @Override // com.amazon.aps.iva.du.f
    public final void M0(com.amazon.aps.iva.du.a aVar, x xVar) {
        j.f(aVar, "action");
    }

    @Override // com.amazon.aps.iva.du.f
    public final void O0(x xVar) {
        getView().Xb(xVar);
    }

    @Override // com.amazon.aps.iva.hu.c
    public final void X5() {
        this.b.n8();
    }

    @Override // com.amazon.aps.iva.du.f
    public final void b3(x xVar) {
        j.f(xVar, "model");
    }

    @Override // com.amazon.aps.iva.du.f
    public final void n2(x xVar) {
    }

    @Override // com.amazon.aps.iva.du.f
    public final void o(x xVar) {
        j.f(xVar, "updatedModel");
        this.b.o(xVar);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        g gVar = this.b;
        gVar.o2().e(getView(), new c(new a()));
        com.amazon.aps.iva.ez.e.a(gVar.b7(), getView(), new b());
    }
}
