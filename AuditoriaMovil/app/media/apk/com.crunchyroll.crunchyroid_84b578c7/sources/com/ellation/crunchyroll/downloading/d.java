package com.ellation.crunchyroll.downloading;

import com.google.zxing.aztec.encoder.Encoder;
import java.util.Iterator;
import java.util.List;
/* compiled from: DownloadsDataSynchronizer.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsDataSynchronizerImpl$synchronize$1$1$1", f = "DownloadsDataSynchronizer.kt", l = {Encoder.DEFAULT_EC_PERCENT, 39}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public e h;
    public Iterator i;
    public int j;
    public final /* synthetic */ e k;
    public final /* synthetic */ List<e0> l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(e eVar, List<? extends e0> list, com.amazon.aps.iva.ob0.d<? super d> dVar) {
        super(2, dVar);
        this.k = eVar;
        this.l = list;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new d(this.k, this.l, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((d) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r6.j
            r2 = 2
            r3 = 1
            com.ellation.crunchyroll.downloading.e r4 = r6.k
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r6.i
            com.ellation.crunchyroll.downloading.e r4 = r6.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L83
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L32
        L22:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.ellation.crunchyroll.downloading.InternalDownloadsManager r7 = r4.b()
            r6.j = r3
            java.lang.Object r7 = r7.j(r6)
            if (r7 != r0) goto L32
            return r0
        L32:
            java.util.List r7 = (java.util.List) r7
            java.util.List<com.ellation.crunchyroll.downloading.e0> r1 = r6.l
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Class<com.ellation.crunchyroll.downloading.e0$c> r3 = com.ellation.crunchyroll.downloading.e0.c.class
            java.util.ArrayList r1 = com.amazon.aps.iva.lb0.u.j0(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = com.amazon.aps.iva.lb0.r.Y(r1)
            r3.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L4b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L5d
            java.lang.Object r5 = r1.next()
            com.ellation.crunchyroll.downloading.e0$c r5 = (com.ellation.crunchyroll.downloading.e0.c) r5
            java.lang.String r5 = r5.a
            r3.add(r5)
            goto L4b
        L5d:
            com.ellation.crunchyroll.downloading.InternalDownloadsManager r1 = r4.b()
            java.util.List r1 = r1.G()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r5 = com.amazon.aps.iva.lb0.x.H0(r7, r3)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r7 = com.amazon.aps.iva.lb0.x.H0(r3, r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r7 = com.amazon.aps.iva.lb0.x.L0(r7, r5)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r7 = com.amazon.aps.iva.lb0.x.H0(r7, r1)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r1 = r7.iterator()
        L83:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto La4
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            com.ellation.crunchyroll.downloading.InternalDownloadsManager r3 = r4.b()
            java.lang.String[] r7 = new java.lang.String[]{r7}
            r6.h = r4
            r6.i = r1
            r6.j = r2
            java.lang.Object r7 = r3.R3(r7, r6)
            if (r7 != r0) goto L83
            return r0
        La4:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.downloading.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
