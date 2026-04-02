package com.amazon.aps.iva.oo;

import com.amazon.aps.iva.xb0.q;
/* compiled from: WatchScreenPlayerViewModelImpl.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.player.WatchScreenPlayerViewModelImpl$playerStreamsFlow$1", f = "WatchScreenPlayerViewModelImpl.kt", l = {60, 62, 62}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.qb0.i implements q<com.amazon.aps.iva.ve0.g<? super com.amazon.aps.iva.kj.c>, com.amazon.aps.iva.no.b, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ com.amazon.aps.iva.ve0.g i;
    public /* synthetic */ com.amazon.aps.iva.no.b j;
    public final /* synthetic */ m k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, com.amazon.aps.iva.ob0.d<? super i> dVar) {
        super(3, dVar);
        this.k = mVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(com.amazon.aps.iva.ve0.g<? super com.amazon.aps.iva.kj.c> gVar, com.amazon.aps.iva.no.b bVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        i iVar = new i(this.k, dVar);
        iVar.i = gVar;
        iVar.j = bVar;
        return iVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[RETURN] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r10.h
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1f
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            goto L1f
        L11:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L19:
            com.amazon.aps.iva.ve0.g r1 = r10.i
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L61
        L1f:
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L6c
        L23:
            com.amazon.aps.iva.ab.x.i0(r11)
            com.amazon.aps.iva.ve0.g r1 = r10.i
            com.amazon.aps.iva.no.b r11 = r10.j
            com.amazon.aps.iva.oo.m r6 = r10.k
            com.amazon.aps.iva.az.d r7 = r6.g
            com.amazon.aps.iva.az.e<T> r7 = r7.c
            T r7 = r7.c
            com.amazon.aps.iva.kj.c r7 = (com.amazon.aps.iva.kj.c) r7
            if (r7 == 0) goto L51
            java.lang.String r8 = r7.a()
            com.ellation.crunchyroll.model.PlayableAsset r9 = r11.a
            java.lang.String r9 = r9.getId()
            boolean r8 = com.amazon.aps.iva.yb0.j.a(r8, r9)
            if (r8 == 0) goto L51
            r10.i = r2
            r10.h = r5
            java.lang.Object r11 = r1.a(r7, r10)
            if (r11 != r0) goto L6c
            return r0
        L51:
            com.ellation.crunchyroll.model.PlayableAsset r11 = r11.a
            r10.i = r1
            r10.h = r4
            r4 = 0
            com.amazon.aps.iva.po.e r5 = r6.c
            java.lang.Object r11 = r5.a(r11, r4, r10)
            if (r11 != r0) goto L61
            return r0
        L61:
            r10.i = r2
            r10.h = r3
            java.lang.Object r11 = r1.a(r11, r10)
            if (r11 != r0) goto L6c
            return r0
        L6c:
            com.amazon.aps.iva.kb0.q r11 = com.amazon.aps.iva.kb0.q.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.oo.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
