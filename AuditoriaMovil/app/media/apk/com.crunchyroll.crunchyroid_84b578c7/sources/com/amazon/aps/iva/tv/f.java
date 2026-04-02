package com.amazon.aps.iva.tv;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ks.w;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.downloading.e0;
/* compiled from: DownloadsAnalytics.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.analytics.DownloadsAnalyticsImpl$trackFailure$1", f = "DownloadsAnalytics.kt", l = {141, 149}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public d h;
    public Throwable i;
    public w j;
    public com.amazon.aps.iva.ks.q k;
    public d l;
    public int m;
    public final /* synthetic */ d n;
    public final /* synthetic */ e0 o;
    public final /* synthetic */ t p;
    public final /* synthetic */ Throwable q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, e0 e0Var, t tVar, Throwable th, com.amazon.aps.iva.ob0.d<? super f> dVar2) {
        super(2, dVar2);
        this.n = dVar;
        this.o = e0Var;
        this.p = tVar;
        this.q = th;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new f(this.n, this.o, this.p, this.q, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((f) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r8.m
            com.ellation.crunchyroll.downloading.e0 r2 = r8.o
            com.amazon.aps.iva.tv.d r3 = r8.n
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L28
            if (r1 != r4) goto L20
            com.amazon.aps.iva.tv.d r3 = r8.l
            com.amazon.aps.iva.ks.q r0 = r8.k
            com.amazon.aps.iva.ks.w r1 = r8.j
            java.lang.Throwable r2 = r8.i
            com.amazon.aps.iva.tv.d r4 = r8.h
            com.amazon.aps.iva.ab.x.i0(r9)
            r6 = r3
            r3 = r0
            goto L6a
        L20:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L28:
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L3e
        L2c:
            com.amazon.aps.iva.ab.x.i0(r9)
            java.lang.String r9 = r2.e()
            r8.m = r5
            com.amazon.aps.iva.x50.t r1 = r8.p
            java.lang.Object r9 = r3.d(r9, r1, r8)
            if (r9 != r0) goto L3e
            return r0
        L3e:
            r1 = r9
            com.amazon.aps.iva.ks.w r1 = (com.amazon.aps.iva.ks.w) r1
            if (r1 == 0) goto L89
            com.amazon.aps.iva.ks.q r9 = new com.amazon.aps.iva.ks.q
            int r5 = r2.h()
            int r6 = r2.d()
            r9.<init>(r5, r6)
            r8.h = r3
            java.lang.Throwable r5 = r8.q
            r8.i = r5
            r8.j = r1
            r8.k = r9
            r8.l = r3
            r8.m = r4
            java.lang.Object r2 = com.amazon.aps.iva.tv.d.a(r3, r2, r8)
            if (r2 != r0) goto L65
            return r0
        L65:
            r4 = r3
            r6 = r4
            r3 = r9
            r9 = r2
            r2 = r5
        L6a:
            com.amazon.aps.iva.ks.f r9 = (com.amazon.aps.iva.ks.f) r9
            com.amazon.aps.iva.ks.m r4 = com.amazon.aps.iva.tv.d.b(r4)
            if (r2 == 0) goto L77
            java.lang.String r0 = r2.getMessage()
            goto L78
        L77:
            r0 = 0
        L78:
            if (r0 != 0) goto L7c
            java.lang.String r0 = ""
        L7c:
            r5 = r0
            com.amazon.aps.iva.es.b0 r7 = new com.amazon.aps.iva.es.b0
            r0 = r7
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            com.amazon.aps.iva.ds.a r9 = r6.b
            r9.e(r7)
        L89:
            com.amazon.aps.iva.kb0.q r9 = com.amazon.aps.iva.kb0.q.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.tv.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
