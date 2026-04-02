package com.amazon.aps.iva.bw;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
/* compiled from: DashDrmLicenseManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.drm.DashDrmLicenseManagerImpl$renewLicenseIfNeeded$1", f = "DashDrmLicenseManager.kt", l = {113, 115}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public g h;
    public long i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.m6.m, q> l;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, q> m;
    public final /* synthetic */ com.amazon.aps.iva.m6.m n;
    public final /* synthetic */ g o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.m6.m, q> lVar, com.amazon.aps.iva.xb0.l<? super Throwable, q> lVar2, com.amazon.aps.iva.m6.m mVar, g gVar, long j, com.amazon.aps.iva.ob0.d<? super i> dVar) {
        super(2, dVar);
        this.l = lVar;
        this.m = lVar2;
        this.n = mVar;
        this.o = gVar;
        this.p = j;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        i iVar = new i(this.l, this.m, this.n, this.o, this.p, dVar);
        iVar.k = obj;
        return iVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((i) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.amazon.aps.iva.bw.g] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.amazon.aps.iva.m6.m] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r9.j
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            com.amazon.aps.iva.ab.x.i0(r10)     // Catch: java.lang.Throwable -> L5e
            goto L5a
        L10:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L18:
            long r4 = r9.i
            com.amazon.aps.iva.bw.g r1 = r9.h
            java.lang.Object r6 = r9.k
            com.amazon.aps.iva.m6.m r6 = (com.amazon.aps.iva.m6.m) r6
            com.amazon.aps.iva.ab.x.i0(r10)     // Catch: java.lang.Throwable -> L5e
            goto L44
        L24:
            com.amazon.aps.iva.ab.x.i0(r10)
            java.lang.Object r10 = r9.k
            com.amazon.aps.iva.se0.g0 r10 = (com.amazon.aps.iva.se0.g0) r10
            com.amazon.aps.iva.m6.m r6 = r9.n
            com.amazon.aps.iva.bw.g r1 = r9.o
            long r4 = r9.p
            byte[] r10 = r6.f     // Catch: java.lang.Throwable -> L5e
            if (r10 == 0) goto L63
            r9.k = r6     // Catch: java.lang.Throwable -> L5e
            r9.h = r1     // Catch: java.lang.Throwable -> L5e
            r9.i = r4     // Catch: java.lang.Throwable -> L5e
            r9.j = r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r10 = r1.g(r10, r9)     // Catch: java.lang.Throwable -> L5e
            if (r10 != r0) goto L44
            return r0
        L44:
            com.amazon.aps.iva.bw.l r10 = (com.amazon.aps.iva.bw.l) r10     // Catch: java.lang.Throwable -> L5e
            long r7 = r10.a     // Catch: java.lang.Throwable -> L5e
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 >= 0) goto L63
            r10 = 0
            r9.k = r10     // Catch: java.lang.Throwable -> L5e
            r9.h = r10     // Catch: java.lang.Throwable -> L5e
            r9.j = r2     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r10 = r1.f(r6, r9)     // Catch: java.lang.Throwable -> L5e
            if (r10 != r0) goto L5a
            return r0
        L5a:
            r6 = r10
            com.amazon.aps.iva.m6.m r6 = (com.amazon.aps.iva.m6.m) r6     // Catch: java.lang.Throwable -> L5e
            goto L63
        L5e:
            r10 = move-exception
            com.amazon.aps.iva.kb0.k$a r6 = com.amazon.aps.iva.ab.x.H(r10)
        L63:
            boolean r10 = r6 instanceof com.amazon.aps.iva.kb0.k.a
            r10 = r10 ^ r3
            if (r10 == 0) goto L6d
            com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.m6.m, com.amazon.aps.iva.kb0.q> r10 = r9.l
            r10.invoke(r6)
        L6d:
            java.lang.Throwable r10 = com.amazon.aps.iva.kb0.k.a(r6)
            if (r10 == 0) goto L78
            com.amazon.aps.iva.xb0.l<java.lang.Throwable, com.amazon.aps.iva.kb0.q> r0 = r9.m
            r0.invoke(r10)
        L78:
            com.amazon.aps.iva.kb0.q r10 = com.amazon.aps.iva.kb0.q.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.bw.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
