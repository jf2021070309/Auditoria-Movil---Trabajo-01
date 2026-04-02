package com.ellation.crunchyroll.downloading.bulk;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: BulkDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl$remove$1", f = "BulkDownloadsManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public final /* synthetic */ BulkDownloadsManagerImpl h;
    public final /* synthetic */ List<com.amazon.aps.iva.hg.a> i;

    /* compiled from: BulkDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ BulkDownloadsManagerImpl h;
        public final /* synthetic */ com.amazon.aps.iva.hg.a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BulkDownloadsManagerImpl bulkDownloadsManagerImpl, com.amazon.aps.iva.hg.a aVar) {
            super(0);
            this.h = bulkDownloadsManagerImpl;
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.g.a(this.i);
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(BulkDownloadsManagerImpl bulkDownloadsManagerImpl, List<? extends com.amazon.aps.iva.hg.a> list, com.amazon.aps.iva.ob0.d<? super d> dVar) {
        super(2, dVar);
        this.h = bulkDownloadsManagerImpl;
        this.i = list;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new d(this.h, this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((d) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        InternalDownloadsManager internalDownloadsManager;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        BulkDownloadsManagerImpl bulkDownloadsManagerImpl = this.h;
        BulkDownloadsManagerImpl.b bVar = bulkDownloadsManagerImpl.g;
        List<com.amazon.aps.iva.hg.a> list = this.i;
        com.amazon.aps.iva.hg.a[] aVarArr = (com.amazon.aps.iva.hg.a[]) list.toArray(new com.amazon.aps.iva.hg.a[0]);
        com.amazon.aps.iva.hg.a[] aVarArr2 = (com.amazon.aps.iva.hg.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        bVar.getClass();
        j.f(aVarArr2, "data");
        t.e0(bVar.a, aVarArr2);
        bulkDownloadsManagerImpl.notify(com.amazon.aps.iva.vv.j.h);
        List<com.amazon.aps.iva.hg.a> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            internalDownloadsManager = bulkDownloadsManagerImpl.b;
            if (!hasNext) {
                break;
            }
            internalDownloadsManager.W7((com.amazon.aps.iva.hg.a) it.next());
        }
        for (com.amazon.aps.iva.hg.a aVar2 : list2) {
            a aVar3 = new a(bulkDownloadsManagerImpl, aVar2);
            if (aVar2.getSeasonId() != null) {
                String k0 = aVar2.k0();
                String seasonId = aVar2.getSeasonId();
                j.c(seasonId);
                internalDownloadsManager.a6(k0, seasonId, aVar3);
            } else {
                internalDownloadsManager.H6(aVar2.k0(), aVar3);
            }
        }
        return q.a;
    }
}
