package com.ellation.crunchyroll.downloading;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: InternalDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$resumeUnpreparedDownloads$2", f = "InternalDownloadsManager.kt", l = {525}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class w extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public DownloadsManagerImpl h;
    public Collection i;
    public Iterator j;
    public Object k;
    public int l;
    public final /* synthetic */ DownloadsManagerImpl m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(DownloadsManagerImpl downloadsManagerImpl, com.amazon.aps.iva.ob0.d<? super w> dVar) {
        super(2, dVar);
        this.m = downloadsManagerImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new w(this.m, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((w) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0062 -> B:15:0x006a). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r9.l
            r2 = 1
            if (r1 == 0) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r1 = r9.k
            java.util.Iterator r3 = r9.j
            java.util.Collection r4 = r9.i
            java.util.Collection r4 = (java.util.Collection) r4
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl r5 = r9.h
            com.amazon.aps.iva.ab.x.i0(r10)
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            goto L6a
        L1d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L25:
            com.amazon.aps.iva.ab.x.i0(r10)
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl r10 = r9.m
            com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue r1 = r10.l
            java.util.ArrayList r1 = r1.F6()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
            r5 = r10
            r4 = r3
            r10 = r9
            r3 = r1
        L3d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r3.next()
            r6 = r1
            com.ellation.crunchyroll.downloading.e0$a r6 = (com.ellation.crunchyroll.downloading.e0.a) r6
            java.lang.String r6 = r6.e()
            r10.h = r5
            r7 = r4
            java.util.Collection r7 = (java.util.Collection) r7
            r10.i = r7
            r10.j = r3
            r10.k = r1
            r10.l = r2
            java.lang.Object r6 = r5.h(r6, r10)
            if (r6 != r0) goto L62
            return r0
        L62:
            r8 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r8
        L6a:
            if (r10 != 0) goto L6e
            r10 = r2
            goto L6f
        L6e:
            r10 = 0
        L6f:
            if (r10 == 0) goto L74
            r5.add(r3)
        L74:
            r10 = r0
            r0 = r1
            r3 = r4
            r4 = r5
            r5 = r6
            goto L3d
        L7a:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = com.amazon.aps.iva.lb0.r.Y(r4)
            r0.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        L8b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r1.next()
            com.ellation.crunchyroll.downloading.e0$a r2 = (com.ellation.crunchyroll.downloading.e0.a) r2
            java.lang.String r3 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r2, r3)
            com.amazon.aps.iva.xg.a r3 = new com.amazon.aps.iva.xg.a
            java.lang.String r4 = r2.e()
            java.lang.String r5 = r2.p()
            com.amazon.aps.iva.x50.t r6 = r2.q()
            java.lang.String r2 = r2.r()
            r3.<init>(r4, r5, r6, r2)
            r0.add(r3)
            goto L8b
        Lb5:
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl r10 = r10.m
            com.ellation.crunchyroll.downloading.InternalDownloadsManager.a.a(r10, r0)
            com.amazon.aps.iva.kb0.q r10 = com.amazon.aps.iva.kb0.q.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.downloading.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
