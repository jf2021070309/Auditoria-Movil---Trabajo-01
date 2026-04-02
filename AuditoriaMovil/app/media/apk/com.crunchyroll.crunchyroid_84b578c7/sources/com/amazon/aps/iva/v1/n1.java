package com.amazon.aps.iva.v1;
/* compiled from: GlobalSnapshotManager.android.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n1 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public com.amazon.aps.iva.ue0.s h;
    public com.amazon.aps.iva.ue0.h i;
    public int j;
    public final /* synthetic */ com.amazon.aps.iva.ue0.f<com.amazon.aps.iva.kb0.q> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.amazon.aps.iva.ue0.f<com.amazon.aps.iva.kb0.q> fVar, com.amazon.aps.iva.ob0.d<? super n1> dVar) {
        super(2, dVar);
        this.k = fVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new n1(this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((n1) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[Catch: all -> 0x0076, TryCatch #4 {all -> 0x0076, blocks: (B:16:0x003b, B:18:0x0043, B:19:0x004b, B:26:0x0061, B:28:0x0064, B:20:0x004c, B:22:0x0058), top: B:47:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:47:0x003b). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r7.j
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            com.amazon.aps.iva.ue0.h r1 = r7.i
            com.amazon.aps.iva.ue0.s r3 = r7.h
            com.amazon.aps.iva.ab.x.i0(r8)     // Catch: java.lang.Throwable -> L78
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r7
            goto L3b
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            com.amazon.aps.iva.ab.x.i0(r8)
            com.amazon.aps.iva.ue0.f<com.amazon.aps.iva.kb0.q> r3 = r7.k
            com.amazon.aps.iva.ue0.h r8 = r3.iterator()     // Catch: java.lang.Throwable -> L78
            r1 = r8
            r8 = r7
        L28:
            r8.h = r3     // Catch: java.lang.Throwable -> L78
            r8.i = r1     // Catch: java.lang.Throwable -> L78
            r8.j = r2     // Catch: java.lang.Throwable -> L78
            java.lang.Object r4 = r1.a(r8)     // Catch: java.lang.Throwable -> L78
            if (r4 != r0) goto L35
            return r0
        L35:
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r6
        L3b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L76
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L76
            if (r8 == 0) goto L6f
            java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> L76
            com.amazon.aps.iva.kb0.q r8 = (com.amazon.aps.iva.kb0.q) r8     // Catch: java.lang.Throwable -> L76
            java.lang.Object r8 = com.amazon.aps.iva.y0.m.c     // Catch: java.lang.Throwable -> L76
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.atomic.AtomicReference<com.amazon.aps.iva.y0.a> r5 = com.amazon.aps.iva.y0.m.j     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L6c
            com.amazon.aps.iva.y0.a r5 = (com.amazon.aps.iva.y0.a) r5     // Catch: java.lang.Throwable -> L6c
            com.amazon.aps.iva.p0.c<com.amazon.aps.iva.y0.h0> r5 = r5.h     // Catch: java.lang.Throwable -> L6c
            if (r5 == 0) goto L60
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L6c
            if (r5 != r2) goto L60
            r5 = r2
            goto L61
        L60:
            r5 = 0
        L61:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L76
            if (r5 == 0) goto L67
            com.amazon.aps.iva.y0.m.a()     // Catch: java.lang.Throwable -> L76
        L67:
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L28
        L6c:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L76
            throw r0     // Catch: java.lang.Throwable -> L76
        L6f:
            r8 = 0
            com.amazon.aps.iva.ee0.f1.n(r4, r8)
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
            return r8
        L76:
            r8 = move-exception
            goto L7a
        L78:
            r8 = move-exception
            r4 = r3
        L7a:
            throw r8     // Catch: java.lang.Throwable -> L7b
        L7b:
            r0 = move-exception
            com.amazon.aps.iva.ee0.f1.n(r4, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v1.n1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
