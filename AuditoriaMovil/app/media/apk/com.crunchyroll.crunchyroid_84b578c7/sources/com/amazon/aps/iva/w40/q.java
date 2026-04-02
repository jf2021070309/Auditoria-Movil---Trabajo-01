package com.amazon.aps.iva.w40;

import com.amazon.aps.iva.j8.f;
import com.amazon.aps.iva.uz.h;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.model.Panel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SimulcastDataSource.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.j8.f<Integer, com.amazon.aps.iva.uz.h> implements com.amazon.aps.iva.jz.a, com.amazon.aps.iva.mf.a {
    public final x f;
    public final com.amazon.aps.iva.xb0.l<List<h.a>, com.amazon.aps.iva.kb0.q> g;
    public final com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.kb0.q> h;
    public final com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> i;
    public final com.amazon.aps.iva.se0.g0 j;
    public final /* synthetic */ com.amazon.aps.iva.jz.b k;
    public final com.amazon.aps.iva.jz.d l = new com.amazon.aps.iva.jz.d();

    /* compiled from: SimulcastDataSource.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.simulcast.SimulcastDataSource$loadAfter$1", f = "SimulcastDataSource.kt", l = {60}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public Integer h;
        public int i;
        public final /* synthetic */ f.C0407f<Integer> j;
        public final /* synthetic */ q k;
        public final /* synthetic */ f.a<Integer, com.amazon.aps.iva.uz.h> l;

        /* compiled from: SimulcastDataSource.kt */
        /* renamed from: com.amazon.aps.iva.w40.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0818a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ q h;
            public final /* synthetic */ f.C0407f<Integer> i;
            public final /* synthetic */ f.a<Integer, com.amazon.aps.iva.uz.h> j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0818a(q qVar, f.C0407f<Integer> c0407f, f.a<Integer, com.amazon.aps.iva.uz.h> aVar) {
                super(0);
                this.h = qVar;
                this.i = c0407f;
                this.j = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final com.amazon.aps.iva.kb0.q invoke() {
                this.h.j(this.i, this.j);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f.C0407f<Integer> c0407f, q qVar, f.a<Integer, com.amazon.aps.iva.uz.h> aVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = c0407f;
            this.k = qVar;
            this.l = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, this.k, this.l, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Integer num;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            q qVar = this.k;
            f.a<Integer, com.amazon.aps.iva.uz.h> aVar2 = this.l;
            f.C0407f<Integer> c0407f = this.j;
            try {
            } catch (IOException unused) {
                com.amazon.aps.iva.jz.d dVar = qVar.l;
                dVar.a.add(new C0818a(qVar, c0407f, aVar2));
            }
            if (i != 0) {
                if (i == 1) {
                    num = this.h;
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                Integer num2 = c0407f.a;
                Integer num3 = num2;
                if (num3 != null) {
                    x xVar = qVar.f;
                    int intValue = num2.intValue();
                    int i2 = c0407f.b;
                    int i3 = intValue * i2;
                    this.h = num3;
                    this.i = 1;
                    obj = xVar.x0(i2, i3, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    num = num3;
                } else {
                    aVar2.a(null, com.amazon.aps.iva.lb0.z.b);
                    return com.amazon.aps.iva.kb0.q.a;
                }
            }
            ArrayList n = q.n(qVar, ((ContentApiResponse) obj).getData());
            if (n.size() < c0407f.b) {
                aVar2.a(null, n);
            } else {
                aVar2.a(new Integer(num.intValue() + 1), n);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public q(y yVar, t0 t0Var, u0 u0Var, v0 v0Var, com.amazon.aps.iva.se0.g0 g0Var) {
        this.f = yVar;
        this.g = t0Var;
        this.h = u0Var;
        this.i = v0Var;
        this.j = g0Var;
        this.k = new com.amazon.aps.iva.jz.b(yVar);
    }

    public static final ArrayList n(q qVar, List list) {
        qVar.getClass();
        List<Panel> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (Panel panel : list2) {
            arrayList.add(new h.c.C0774c(panel));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.jz.a
    public final void destroy() {
        this.k.destroy();
    }

    @Override // com.amazon.aps.iva.j8.f
    public final void j(f.C0407f<Integer> c0407f, f.a<Integer, com.amazon.aps.iva.uz.h> aVar) {
        com.amazon.aps.iva.yb0.j.f(c0407f, "params");
        com.amazon.aps.iva.yb0.j.f(aVar, "callback");
        com.amazon.aps.iva.se0.i.d(this.j, null, null, new a(c0407f, this, aVar, null), 3);
    }

    @Override // com.amazon.aps.iva.j8.f
    public final void k(f.C0407f c0407f, f.b bVar) {
    }

    @Override // com.amazon.aps.iva.j8.f
    public final void m(f.e eVar, f.d dVar) {
        int i = eVar.a;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(h.a.b);
        }
        this.g.invoke(arrayList);
        com.amazon.aps.iva.se0.i.d(this.j, null, null, new r(this, eVar, dVar, null), 3);
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionLost() {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRefresh(boolean z) {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRestored() {
        this.l.a();
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionUpdated(boolean z) {
    }
}
