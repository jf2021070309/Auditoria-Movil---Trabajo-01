package com.amazon.aps.iva.p40;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.p40.a;
import com.amazon.aps.iva.p40.h;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.uz.h;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SimilarViewModel.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.ez.b implements n, g0 {
    public final b b;
    public final int c;
    public final /* synthetic */ com.amazon.aps.iva.xe0.d d;
    public final v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.p40.a>> e;

    /* compiled from: SimilarViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.similar.SimilarViewModelImpl$loadSimilarShows$1", f = "SimilarViewModel.kt", l = {43}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ String k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.k = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.k, dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.p40.a>> vVar;
            v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.p40.a>> vVar2;
            Object H;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    vVar2 = (v) this.i;
                    try {
                        x.i0(obj);
                    } catch (Throwable th) {
                        th = th;
                        vVar = vVar2;
                        H = x.H(th);
                        vVar2 = vVar;
                        vVar2.k(com.amazon.aps.iva.ez.h.e(H));
                        return q.a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                g0 g0Var = (g0) this.i;
                o oVar = o.this;
                v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.p40.a>> vVar3 = oVar.e;
                int i2 = oVar.c;
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    arrayList.add(h.a.b);
                }
                vVar3.k(new g.b(new a.b(arrayList)));
                vVar = oVar.e;
                String str = this.k;
                try {
                    b bVar = oVar.b;
                    this.i = vVar;
                    this.h = 1;
                    obj = bVar.q0(str, 10, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    vVar2 = vVar;
                } catch (Throwable th2) {
                    th = th2;
                    H = x.H(th);
                    vVar2 = vVar;
                    vVar2.k(com.amazon.aps.iva.ez.h.e(H));
                    return q.a;
                }
            }
            H = (com.amazon.aps.iva.p40.a) obj;
            vVar2.k(com.amazon.aps.iva.ez.h.e(H));
            return q.a;
        }
    }

    public o(c cVar, int i) {
        super(cVar);
        this.b = cVar;
        this.c = i;
        this.d = z.j();
        this.e = new v<>();
    }

    @Override // com.amazon.aps.iva.p40.n
    public final v g3() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.d.b;
    }

    @Override // com.amazon.aps.iva.p40.n
    public final void invalidate() {
        this.e.k(null);
    }

    @Override // com.amazon.aps.iva.ez.b, com.amazon.aps.iva.i5.f0
    public final void onCleared() {
        super.onCleared();
        z.l(this, null);
    }

    @Override // com.amazon.aps.iva.p40.n
    public final void q3(com.amazon.aps.iva.b60.j jVar, h.b bVar) {
        List<com.amazon.aps.iva.uz.h> list;
        g.c<com.amazon.aps.iva.p40.a> a2;
        com.amazon.aps.iva.p40.a aVar;
        com.amazon.aps.iva.yb0.j.f(jVar, "data");
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.p40.a> d = this.e.d();
        if (d != null && (a2 = d.a()) != null && (aVar = a2.a) != null) {
            list = aVar.a;
        } else {
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            com.amazon.aps.iva.uz.i.a(list, jVar.b, jVar.c, new p(arrayList));
        }
        if (!arrayList.isEmpty()) {
            bVar.invoke(arrayList);
        }
    }

    @Override // com.amazon.aps.iva.p40.n
    public final void s1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "contentId");
        if (this.e.d() == null) {
            com.amazon.aps.iva.se0.i.d(this, null, null, new a(str, null), 3);
        }
    }
}
