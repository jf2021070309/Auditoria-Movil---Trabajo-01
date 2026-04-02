package com.ellation.crunchyroll.downloading.bulk;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl;
/* compiled from: BulkDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl$BulkDownloadListenerImpl$notifyListenerIfNeeded$1", f = "BulkDownloadsManager.kt", l = {392}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ BulkDownloadsManagerImpl j;
    public final /* synthetic */ BulkDownloadsManagerImpl.a k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BulkDownloadsManagerImpl bulkDownloadsManagerImpl, BulkDownloadsManagerImpl.a aVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
        super(2, dVar);
        this.j = bulkDownloadsManagerImpl;
        this.k = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        a aVar = new a(this.j, this.k, dVar);
        aVar.i = obj;
        return aVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        g0 g0Var;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        BulkDownloadsManagerImpl.a aVar2 = this.k;
        if (i != 0) {
            if (i == 1) {
                g0Var = (g0) this.i;
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            g0 g0Var2 = (g0) this.i;
            com.amazon.aps.iva.hg.g gVar = aVar2.c;
            this.i = g0Var2;
            this.h = 1;
            Object m0 = this.j.m0(gVar, this);
            if (m0 == aVar) {
                return aVar;
            }
            g0Var = g0Var2;
            obj = m0;
        }
        com.amazon.aps.iva.hg.f fVar = (com.amazon.aps.iva.hg.f) obj;
        if (z.E(g0Var) && !j.a(aVar2.b, fVar.b)) {
            com.amazon.aps.iva.hg.c cVar = fVar.b;
            aVar2.b = cVar;
            aVar2.d.invoke(cVar);
        }
        return q.a;
    }
}
