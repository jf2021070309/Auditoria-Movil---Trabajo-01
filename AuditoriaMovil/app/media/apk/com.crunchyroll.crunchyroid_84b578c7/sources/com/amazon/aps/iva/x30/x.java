package com.amazon.aps.iva.x30;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.se0.g0;
import java.io.IOException;
import java.util.List;
/* compiled from: SearchResultSummaryViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.search.result.summary.SearchResultSummaryViewModelImpl$loadSearchResults$1", f = "SearchResultSummaryViewModel.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class x extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ y i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, String str, com.amazon.aps.iva.ob0.d<? super x> dVar) {
        super(2, dVar);
        this.i = yVar;
        this.j = str;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new x(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((x) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        y yVar = this.i;
        try {
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                j jVar = yVar.d;
                String str = this.j;
                int i2 = yVar.c;
                this.h = 1;
                obj = jVar.V(str, i2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            yVar.b.k(new g.c((List) obj, null));
        } catch (IOException e) {
            com.amazon.aps.iva.e4.e.g(null, e, yVar.b);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
