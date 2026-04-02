package com.amazon.aps.iva.kv;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.aq.j;
import com.amazon.aps.iva.j8.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.model.search.SearchItemsContainer;
import com.ellation.crunchyroll.model.search.SearchResponse;
import java.io.IOException;
/* compiled from: CrunchylistSearchDataSource.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.crunchylists.crunchylistsearch.list.datasource.CrunchylistSearchDataSource$loadRange$1", f = "CrunchylistSearchDataSource.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ b i;
    public final /* synthetic */ m.g j;
    public final /* synthetic */ m.e<com.amazon.aps.iva.iv.b> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, m.g gVar, m.e<com.amazon.aps.iva.iv.b> eVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
        super(2, dVar);
        this.i = bVar;
        this.j = gVar;
        this.k = eVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new a(this.i, this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        int i;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i2 = this.h;
        b bVar = this.i;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                p<Integer, com.amazon.aps.iva.ob0.d<? super SearchResponse>, Object> pVar = bVar.c;
                Integer num = new Integer(this.j.a);
                this.h = 1;
                obj = pVar.invoke(num, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            SearchResponse searchResponse = (SearchResponse) obj;
            SearchItemsContainer searchItemsContainer = (SearchItemsContainer) com.amazon.aps.iva.lb0.x.v0(searchResponse.getPanelsContainers());
            if (searchItemsContainer != null) {
                i = searchItemsContainer.getTotalCount();
            } else {
                i = 0;
            }
            bVar.e = i;
            this.k.a(j.R(searchResponse.getPanelsContainers(), z.b));
        } catch (IOException unused) {
        }
        return q.a;
    }
}
