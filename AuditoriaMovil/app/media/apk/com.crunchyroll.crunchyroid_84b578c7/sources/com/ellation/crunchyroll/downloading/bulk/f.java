package com.ellation.crunchyroll.downloading.bulk;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.downloading.e0;
/* compiled from: BulkDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl$startOrResumeRelatedDubs$1", f = "BulkDownloadsManager.kt", l = {118}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ BulkDownloadsManagerImpl i;
    public final /* synthetic */ com.amazon.aps.iva.hg.g j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> l;

    /* compiled from: BulkDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<e0, Boolean> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(e0 e0Var) {
            boolean z;
            e0 e0Var2 = e0Var;
            j.f(e0Var2, "it");
            if (!e0Var2.m() && !e0Var2.l() && !e0Var2.i() && !e0Var2.j()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BulkDownloadsManagerImpl bulkDownloadsManagerImpl, com.amazon.aps.iva.hg.g gVar, boolean z, com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(2, dVar);
        this.i = bulkDownloadsManagerImpl;
        this.j = gVar;
        this.k = z;
        this.l = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new f(this.i, this.j, this.k, this.l, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((f) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0127 A[EDGE_INSN: B:111:0x0127->B:62:0x0127 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124 A[LOOP:3: B:37:0x00c9->B:60:0x0124, LOOP_END] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.downloading.bulk.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
