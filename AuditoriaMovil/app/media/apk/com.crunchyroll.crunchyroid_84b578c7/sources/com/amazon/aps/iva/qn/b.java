package com.amazon.aps.iva.qn;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.mn.g;
import com.amazon.aps.iva.mn.h;
import com.amazon.aps.iva.mn.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.ArrayList;
import java.util.List;
/* compiled from: EmptyFilterResultPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<com.amazon.aps.iva.qn.c> implements com.amazon.aps.iva.qn.a {
    public final i b;
    public final h c;
    public List<? extends com.amazon.aps.iva.mn.b> d;

    /* compiled from: EmptyFilterResultPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mn.e, q> {
        public final /* synthetic */ com.amazon.aps.iva.fs.b i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.fs.b bVar) {
            super(1);
            this.i = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.mn.e eVar) {
            com.amazon.aps.iva.mn.e eVar2 = eVar;
            j.f(eVar2, "filters");
            b.this.c.e(eVar2, this.i);
            return q.a;
        }
    }

    /* compiled from: EmptyFilterResultPresenter.kt */
    /* renamed from: com.amazon.aps.iva.qn.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0649b extends l implements com.amazon.aps.iva.xb0.l<g, q> {
        public C0649b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(g gVar) {
            g gVar2 = gVar;
            j.f(gVar2, "it");
            ArrayList b = gVar2.b.b();
            b bVar = b.this;
            bVar.d = b;
            bVar.getView().c3(bVar.d);
            return q.a;
        }
    }

    /* compiled from: EmptyFilterResultPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mn.e, q> {
        public final /* synthetic */ com.amazon.aps.iva.fs.b i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.fs.b bVar) {
            super(1);
            this.i = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.mn.e eVar) {
            com.amazon.aps.iva.mn.e eVar2 = eVar;
            j.f(eVar2, "filters");
            b.this.c.e(eVar2, this.i);
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.qn.c cVar, i iVar, h hVar) {
        super(cVar, new com.amazon.aps.iva.wy.j[0]);
        j.f(cVar, "view");
        j.f(iVar, "interactor");
        j.f(hVar, "sortAndFiltersAnalytics");
        this.b = iVar;
        this.c = hVar;
        this.d = z.b;
    }

    @Override // com.amazon.aps.iva.qn.a
    public final void K1(com.amazon.aps.iva.fs.b bVar) {
        this.b.w0(new a(bVar));
    }

    @Override // com.amazon.aps.iva.qn.a
    public final void m4(com.amazon.aps.iva.mn.b bVar, com.amazon.aps.iva.fs.b bVar2) {
        j.f(bVar, "filter");
        j.f(bVar2, "clickedView");
        this.b.t0(bVar, new c(bVar2));
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        C0649b c0649b = new C0649b();
        this.b.u0(getView(), c0649b);
    }
}
