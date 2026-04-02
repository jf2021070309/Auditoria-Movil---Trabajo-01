package com.amazon.aps.iva.h20;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.List;
/* compiled from: CrPlusAlternativeFlowPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.b<f> implements g {
    public final com.amazon.aps.iva.d30.d b;
    public final com.amazon.aps.iva.rv.a c;
    public final e d;

    /* compiled from: CrPlusAlternativeFlowPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.b30.c>>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.b30.c>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.b30.c>> gVar2 = gVar;
            d dVar = d.this;
            gVar2.c(new com.amazon.aps.iva.h20.a(dVar));
            gVar2.e(new com.amazon.aps.iva.h20.b(dVar));
            gVar2.b(new c(dVar));
            return q.a;
        }
    }

    /* compiled from: CrPlusAlternativeFlowPresenter.kt */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, com.amazon.aps.iva.d30.d dVar, com.amazon.aps.iva.rv.e eVar, e eVar2) {
        super(fVar, new com.amazon.aps.iva.wy.j[0]);
        j.f(fVar, "view");
        j.f(dVar, "viewModel");
        j.f(eVar2, "alternativeFlowRouter");
        this.b = dVar;
        this.c = eVar;
        this.d = eVar2;
    }

    @Override // com.amazon.aps.iva.h20.g
    public final void X() {
        getView().j5();
    }

    @Override // com.amazon.aps.iva.h20.g
    public final void c() {
        this.d.closeScreen();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        if (this.c.a()) {
            getView().lg();
        } else {
            getView().sf();
        }
        this.b.H0().e(getView(), new b(new a()));
    }
}
