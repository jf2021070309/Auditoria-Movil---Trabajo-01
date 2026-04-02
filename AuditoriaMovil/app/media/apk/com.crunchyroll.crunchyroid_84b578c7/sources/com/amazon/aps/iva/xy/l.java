package com.amazon.aps.iva.xy;

import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xb0.q;
/* compiled from: FlowExtensions.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.mvp.flow.FlowExtensionsKt$toResourceFlow$2", f = "FlowExtensions.kt", l = {38, 40, 41, 44}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.qb0.i implements q<com.amazon.aps.iva.ve0.g<? super com.amazon.aps.iva.ez.g<Object>>, Object, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ com.amazon.aps.iva.ve0.g i;
    public /* synthetic */ Object j;
    public final /* synthetic */ p<Object, com.amazon.aps.iva.ob0.d<Object>, Object> k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, Boolean> l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(p<Object, ? super com.amazon.aps.iva.ob0.d<Object>, ? extends Object> pVar, com.amazon.aps.iva.xb0.l<? super Throwable, Boolean> lVar, com.amazon.aps.iva.ob0.d<? super l> dVar) {
        super(3, dVar);
        this.k = pVar;
        this.l = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(com.amazon.aps.iva.ve0.g<? super com.amazon.aps.iva.ez.g<Object>> gVar, Object obj, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        l lVar = new l(this.k, this.l, dVar);
        lVar.i = gVar;
        lVar.j = obj;
        return lVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(1:2)|(1:(1:(3:(1:(1:8)(2:12|13))(2:14|15)|9|10)(6:16|17|18|(1:20)|9|10))(1:21))(2:35|(1:37)(1:38))|22|23|(1:25)(5:26|18|(0)|9|10)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r8.l.invoke(r9).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
        r1 = new com.amazon.aps.iva.ez.g.a(null, r9);
        r8.i = null;
        r8.j = null;
        r8.h = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
        if (r5.a(r1, r8) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r8.h
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L37
            if (r1 == r5) goto L2f
            if (r1 == r4) goto L27
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L94
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            com.amazon.aps.iva.ve0.g r1 = r8.i
            com.amazon.aps.iva.ab.x.i0(r9)     // Catch: java.lang.Throwable -> L2d
            goto L94
        L27:
            com.amazon.aps.iva.ve0.g r1 = r8.i
            com.amazon.aps.iva.ab.x.i0(r9)     // Catch: java.lang.Throwable -> L2d
            goto L61
        L2d:
            r9 = move-exception
            goto L71
        L2f:
            java.lang.Object r1 = r8.j
            com.amazon.aps.iva.ve0.g r5 = r8.i
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L51
        L37:
            com.amazon.aps.iva.ab.x.i0(r9)
            com.amazon.aps.iva.ve0.g r9 = r8.i
            java.lang.Object r1 = r8.j
            com.amazon.aps.iva.ez.g$b r7 = new com.amazon.aps.iva.ez.g$b
            r7.<init>(r6)
            r8.i = r9
            r8.j = r1
            r8.h = r5
            java.lang.Object r5 = r9.a(r7, r8)
            if (r5 != r0) goto L50
            return r0
        L50:
            r5 = r9
        L51:
            com.amazon.aps.iva.xb0.p<java.lang.Object, com.amazon.aps.iva.ob0.d<java.lang.Object>, java.lang.Object> r9 = r8.k     // Catch: java.lang.Throwable -> L73
            r8.i = r5     // Catch: java.lang.Throwable -> L73
            r8.j = r6     // Catch: java.lang.Throwable -> L73
            r8.h = r4     // Catch: java.lang.Throwable -> L73
            java.lang.Object r9 = r9.invoke(r1, r8)     // Catch: java.lang.Throwable -> L73
            if (r9 != r0) goto L60
            return r0
        L60:
            r1 = r5
        L61:
            com.amazon.aps.iva.ez.g$c r4 = new com.amazon.aps.iva.ez.g$c     // Catch: java.lang.Throwable -> L2d
            r4.<init>(r9, r6)     // Catch: java.lang.Throwable -> L2d
            r8.i = r1     // Catch: java.lang.Throwable -> L2d
            r8.h = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r9 = r1.a(r4, r8)     // Catch: java.lang.Throwable -> L2d
            if (r9 != r0) goto L94
            return r0
        L71:
            r5 = r1
            goto L74
        L73:
            r9 = move-exception
        L74:
            com.amazon.aps.iva.xb0.l<java.lang.Throwable, java.lang.Boolean> r1 = r8.l
            java.lang.Object r1 = r1.invoke(r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L97
            com.amazon.aps.iva.ez.g$a r1 = new com.amazon.aps.iva.ez.g$a
            r1.<init>(r6, r9)
            r8.i = r6
            r8.j = r6
            r8.h = r2
            java.lang.Object r9 = r5.a(r1, r8)
            if (r9 != r0) goto L94
            return r0
        L94:
            com.amazon.aps.iva.kb0.q r9 = com.amazon.aps.iva.kb0.q.a
            return r9
        L97:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xy.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
