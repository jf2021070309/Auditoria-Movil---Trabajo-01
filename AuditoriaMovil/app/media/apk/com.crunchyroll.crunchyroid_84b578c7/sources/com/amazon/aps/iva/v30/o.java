package com.amazon.aps.iva.v30;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.model.search.SearchItemsContainerType;
import com.google.ads.AdSize;
import java.io.IOException;
import java.util.List;
/* compiled from: SearchResultDetailViewModelImpl.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.r30.f implements n {
    public final d c;
    public final String d;
    public final SearchItemsContainerType e;
    public c2 f;

    /* compiled from: SearchResultDetailViewModelImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.search.result.detail.SearchResultDetailViewModelImpl$search$1", f = "SearchResultDetailViewModelImpl.kt", l = {34}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public v h;
        public int i;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.s30.h>>> vVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            o oVar = o.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        vVar = this.h;
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.s30.h>>> vVar2 = oVar.b;
                    d dVar = oVar.c;
                    String str = oVar.d;
                    SearchItemsContainerType searchItemsContainerType = oVar.e;
                    this.h = vVar2;
                    this.i = 1;
                    Object c1 = dVar.c1(str, searchItemsContainerType, this);
                    if (c1 == aVar) {
                        return aVar;
                    }
                    vVar = vVar2;
                    obj = c1;
                }
                vVar.k(new g.c(obj, null));
            } catch (IOException e) {
                com.amazon.aps.iva.e4.e.g(null, e, oVar.b);
            }
            return q.a;
        }
    }

    /* compiled from: SearchResultDetailViewModelImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.search.result.detail.SearchResultDetailViewModelImpl$searchNextPage$1", f = "SearchResultDetailViewModelImpl.kt", l = {AdSize.PORTRAIT_AD_HEIGHT}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
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
                    d dVar = oVar.c;
                    String str = oVar.d;
                    SearchItemsContainerType searchItemsContainerType = oVar.e;
                    v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.s30.h>>> vVar = oVar.b;
                    com.amazon.aps.iva.yb0.j.f(vVar, "<this>");
                    com.amazon.aps.iva.ez.j jVar = new com.amazon.aps.iva.ez.j(vVar);
                    com.amazon.aps.iva.yb0.j.f(vVar, "<this>");
                    com.amazon.aps.iva.ez.j jVar2 = new com.amazon.aps.iva.ez.j(vVar);
                    this.h = 1;
                    obj = dVar.U0(str, searchItemsContainerType, jVar, jVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                oVar.b.k(new g.c((List) obj, null));
            } catch (IOException e) {
                com.amazon.aps.iva.e4.e.g(null, e, oVar.b);
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e eVar, String str, SearchItemsContainerType searchItemsContainerType) {
        super(eVar);
        com.amazon.aps.iva.yb0.j.f(str, "searchString");
        com.amazon.aps.iva.yb0.j.f(searchItemsContainerType, "searchType");
        this.c = eVar;
        this.d = str;
        this.e = searchItemsContainerType;
        y1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r0.isActive() == true) goto L5;
     */
    @Override // com.amazon.aps.iva.v30.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5() {
        /*
            r4 = this;
            com.amazon.aps.iva.se0.c2 r0 = r4.f
            if (r0 == 0) goto Lc
            boolean r0 = r0.isActive()
            r1 = 1
            if (r0 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L10
            return
        L10:
            com.amazon.aps.iva.se0.g0 r0 = com.amazon.aps.iva.e.w.D(r4)
            com.amazon.aps.iva.v30.o$b r1 = new com.amazon.aps.iva.v30.o$b
            r2 = 0
            r1.<init>(r2)
            r3 = 3
            com.amazon.aps.iva.se0.c2 r0 = com.amazon.aps.iva.se0.i.d(r0, r2, r2, r1, r3)
            r4.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v30.o.I5():void");
    }

    @Override // com.amazon.aps.iva.v30.n
    public final void y1() {
        com.amazon.aps.iva.ez.h.c(this.b, null);
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(null), 3);
    }
}
