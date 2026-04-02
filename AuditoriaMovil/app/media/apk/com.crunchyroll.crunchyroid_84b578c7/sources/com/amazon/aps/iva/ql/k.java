package com.amazon.aps.iva.ql;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
/* compiled from: PlayerSettingsSynchronizer.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.data.PlayerSettingsSynchronizerImpl$synchronize$2", f = "PlayerSettingsSynchronizer.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ i i;
    public final /* synthetic */ ProfileApiModel j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, ProfileApiModel profileApiModel, com.amazon.aps.iva.ob0.d<? super k> dVar) {
        super(2, dVar);
        this.i = iVar;
        this.j = profileApiModel;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new k(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((k) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[RETURN] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r5.h
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L72
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel r6 = r5.j
            java.lang.String r6 = r6.getAudioLanguage()
            r5.h = r2
            com.amazon.aps.iva.ql.i r1 = r5.i
            if (r6 == 0) goto L6a
            com.amazon.aps.iva.jh.i r3 = r1.b
            java.util.List r3 = r3.read()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L3a
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L3a
            goto L55
        L3a:
            java.util.Iterator r3 = r3.iterator()
        L3e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L55
            java.lang.Object r4 = r3.next()
            com.amazon.aps.iva.jh.f r4 = (com.amazon.aps.iva.jh.f) r4
            java.lang.String r4 = r4.a()
            boolean r4 = com.amazon.aps.iva.yb0.j.a(r4, r6)
            if (r4 == 0) goto L3e
            goto L56
        L55:
            r2 = 0
        L56:
            if (r2 == 0) goto L6d
            com.amazon.aps.iva.ql.c r1 = r1.c
            com.amazon.aps.iva.yy.a r1 = r1.b()
            java.lang.Object r6 = r1.a(r6, r5)
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            if (r6 != r1) goto L67
            goto L6f
        L67:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            goto L6f
        L6a:
            r1.getClass()
        L6d:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
        L6f:
            if (r6 != r0) goto L72
            return r0
        L72:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ql.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
