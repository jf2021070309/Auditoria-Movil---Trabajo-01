package com.amazon.aps.iva.d20;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: MatureContentInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.mature.MatureContentInteractorImpl$enableMatureContent$4", f = "MatureContentInteractor.kt", l = {61, 62}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public PlayableAsset h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ l<Throwable, q> k;
    public final /* synthetic */ b l;
    public final /* synthetic */ PlayableAsset m;
    public final /* synthetic */ l<PlayableAsset, q> n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(l<? super Throwable, q> lVar, b bVar, PlayableAsset playableAsset, l<? super PlayableAsset, q> lVar2, com.amazon.aps.iva.ob0.d<? super d> dVar) {
        super(2, dVar);
        this.k = lVar;
        this.l = bVar;
        this.m = playableAsset;
        this.n = lVar2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        d dVar2 = new d(this.k, this.l, this.m, this.n, dVar);
        dVar2.j = obj;
        return dVar2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((d) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r6.i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.lang.Throwable -> L57
            goto L54
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            com.ellation.crunchyroll.model.PlayableAsset r1 = r6.h
            java.lang.Object r4 = r6.j
            com.amazon.aps.iva.d20.b r4 = (com.amazon.aps.iva.d20.b) r4
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.lang.Throwable -> L57
            goto L3c
        L22:
            com.amazon.aps.iva.ab.x.i0(r7)
            java.lang.Object r7 = r6.j
            com.amazon.aps.iva.se0.g0 r7 = (com.amazon.aps.iva.se0.g0) r7
            com.amazon.aps.iva.d20.b r4 = r6.l
            com.ellation.crunchyroll.model.PlayableAsset r1 = r6.m
            com.amazon.aps.iva.d20.j r7 = r4.b     // Catch: java.lang.Throwable -> L57
            r6.j = r4     // Catch: java.lang.Throwable -> L57
            r6.h = r1     // Catch: java.lang.Throwable -> L57
            r6.i = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = r7.s0(r3, r6)     // Catch: java.lang.Throwable -> L57
            if (r7 != r0) goto L3c
            return r0
        L3c:
            com.ellation.crunchyroll.api.etp.content.EtpContentService r7 = r4.c     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = r1.getId()     // Catch: java.lang.Throwable -> L57
            com.amazon.aps.iva.x50.t r1 = r1.getParentType()     // Catch: java.lang.Throwable -> L57
            r5 = 0
            r6.j = r5     // Catch: java.lang.Throwable -> L57
            r6.h = r5     // Catch: java.lang.Throwable -> L57
            r6.i = r2     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt.loadAsset(r7, r4, r1, r6)     // Catch: java.lang.Throwable -> L57
            if (r7 != r0) goto L54
            return r0
        L54:
            com.ellation.crunchyroll.model.PlayableAsset r7 = (com.ellation.crunchyroll.model.PlayableAsset) r7     // Catch: java.lang.Throwable -> L57
            goto L5c
        L57:
            r7 = move-exception
            com.amazon.aps.iva.kb0.k$a r7 = com.amazon.aps.iva.ab.x.H(r7)
        L5c:
            boolean r0 = r7 instanceof com.amazon.aps.iva.kb0.k.a
            r0 = r0 ^ r3
            if (r0 == 0) goto L69
            r0 = r7
            com.ellation.crunchyroll.model.PlayableAsset r0 = (com.ellation.crunchyroll.model.PlayableAsset) r0
            com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.model.PlayableAsset, com.amazon.aps.iva.kb0.q> r1 = r6.n
            r1.invoke(r0)
        L69:
            java.lang.Throwable r7 = com.amazon.aps.iva.kb0.k.a(r7)
            if (r7 == 0) goto L74
            com.amazon.aps.iva.xb0.l<java.lang.Throwable, com.amazon.aps.iva.kb0.q> r0 = r6.k
            r0.invoke(r7)
        L74:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d20.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
