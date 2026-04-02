package com.amazon.aps.iva.tn;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mn.h;
import com.amazon.aps.iva.mn.m;
import com.amazon.aps.iva.mn.n;
import com.amazon.aps.iva.mn.o;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.List;
/* compiled from: SortPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.b<f> implements com.amazon.aps.iva.tn.b {
    public final d b;
    public final h c;

    /* compiled from: SortPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<o, q> {
        public final /* synthetic */ com.amazon.aps.iva.fs.b i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.fs.b bVar) {
            super(1);
            this.i = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(o oVar) {
            o oVar2 = oVar;
            j.f(oVar2, "sorting");
            c.this.c.a(oVar2, this.i);
            return q.a;
        }
    }

    /* compiled from: SortPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<o, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(o oVar) {
            o oVar2 = oVar;
            j.f(oVar2, "sorting");
            c cVar = c.this;
            m mVar = oVar2.a;
            cVar.getView().x5(mVar);
            List<n> orderOptions = mVar.getOrderOptions();
            cVar.getView().i5(orderOptions);
            if (orderOptions.isEmpty()) {
                cVar.getView().Ff();
            } else {
                cVar.getView().Ba();
            }
            n nVar = oVar2.b;
            if (nVar != null) {
                cVar.getView().kc(nVar);
            }
            f view = cVar.getView();
            if (cVar.b.L()) {
                view.u1();
            } else {
                view.V0();
            }
            return q.a;
        }
    }

    public c(com.amazon.aps.iva.tn.a aVar, e eVar, h hVar) {
        super(aVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = eVar;
        this.c = hVar;
    }

    @Override // com.amazon.aps.iva.tn.b
    public final void B4(m mVar) {
        j.f(mVar, "option");
        this.b.W0(mVar);
    }

    @Override // com.amazon.aps.iva.tn.b
    public final void G1(n nVar) {
        j.f(nVar, "order");
        this.b.h8(nVar);
    }

    @Override // com.amazon.aps.iva.tn.b
    public final void N(com.amazon.aps.iva.fs.b bVar) {
        this.b.q4(new a(bVar));
        getView().close();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        d dVar = this.b;
        getView().E8(dVar.p0());
        dVar.f0(getView(), new b());
    }
}
