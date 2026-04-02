package com.amazon.aps.iva.hv;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.model.search.SearchItemsContainer;
import com.ellation.crunchyroll.model.search.SearchResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CrunchylistSearchViewModel.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.ez.b implements s {
    public final c b;
    public final com.amazon.aps.iva.kv.c c;
    public final v<String> d;
    public final v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.iv.b>>> e;

    /* compiled from: CrunchylistSearchViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.crunchylists.crunchylistsearch.CrunchylistSearchViewModelImpl$search$1", f = "CrunchylistSearchViewModel.kt", l = {56}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ List<com.amazon.aps.iva.iv.a> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<com.amazon.aps.iva.iv.a> list, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = list;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            int i2 = 0;
            o oVar = o.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    c cVar = oVar.b;
                    String d = oVar.d.d();
                    com.amazon.aps.iva.yb0.j.c(d);
                    this.h = 1;
                    obj = cVar.G(d, 20, 0, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                SearchResponse searchResponse = (SearchResponse) obj;
                v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.iv.b>>> vVar = oVar.e;
                List R = com.amazon.aps.iva.aq.j.R(searchResponse.getPanelsContainers(), this.j);
                SearchItemsContainer searchItemsContainer = (SearchItemsContainer) com.amazon.aps.iva.lb0.x.v0(searchResponse.getPanelsContainers());
                if (searchItemsContainer != null) {
                    i2 = searchItemsContainer.getTotalCount();
                }
                com.amazon.aps.iva.kv.e eVar = new com.amazon.aps.iva.kv.e(20, i2, R);
                vVar.k(new g.c(oVar.c.a(new n(oVar, eVar, null), eVar), null));
            } catch (IOException e) {
                com.amazon.aps.iva.e4.e.g(null, e, oVar.e);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d dVar) {
        super(dVar);
        com.amazon.aps.iva.kv.d dVar2 = com.amazon.aps.iva.kv.d.a;
        com.amazon.aps.iva.yb0.j.f(dVar, "interactor");
        this.b = dVar;
        this.c = dVar2;
        this.d = new v<>("");
        this.e = new v<>();
    }

    @Override // com.amazon.aps.iva.hv.s
    public final void A() {
        y1();
    }

    @Override // com.amazon.aps.iva.hv.s
    public final void A8(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "searchText");
        v<String> vVar = this.d;
        if (!com.amazon.aps.iva.yb0.j.a(vVar.d(), str)) {
            vVar.k(str);
            y1();
        }
    }

    @Override // com.amazon.aps.iva.hv.s
    public final v D7() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.hv.s
    public final void V() {
        this.d.k("");
        v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.iv.b>>> vVar = this.e;
        com.amazon.aps.iva.kv.e eVar = new com.amazon.aps.iva.kv.e(0, 0, z.b);
        vVar.k(new g.c(this.c.a(new n(this, eVar, null), eVar), null));
    }

    @Override // com.amazon.aps.iva.hv.s
    public final v q0() {
        return this.d;
    }

    public final void y1() {
        ArrayList arrayList = new ArrayList(20);
        for (int i = 0; i < 20; i++) {
            arrayList.add(new com.amazon.aps.iva.iv.a(0));
        }
        v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.iv.b>>> vVar = this.e;
        com.amazon.aps.iva.kv.e eVar = new com.amazon.aps.iva.kv.e(20, 20, arrayList);
        vVar.k(new g.c(this.c.a(new n(this, eVar, null), eVar), null));
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(arrayList, null), 3);
    }
}
