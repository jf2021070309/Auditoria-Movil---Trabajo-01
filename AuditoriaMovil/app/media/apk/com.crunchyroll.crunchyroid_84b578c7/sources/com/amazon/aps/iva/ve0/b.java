package com.amazon.aps.iva.ve0;
/* compiled from: Builders.kt */
/* loaded from: classes4.dex */
public final class b<T> extends c<T> {
    public final com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ue0.q<? super T>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> f;

    /* compiled from: Builders.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {336}, m = "collectTo")
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public com.amazon.aps.iva.ue0.q h;
        public /* synthetic */ Object i;
        public final /* synthetic */ b<T> j;
        public int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
            this.j = bVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return this.j.d(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.ue0.q<? super T>, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar, com.amazon.aps.iva.ob0.g gVar, int i, com.amazon.aps.iva.ue0.e eVar) {
        super(pVar, gVar, i, eVar);
        this.f = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    @Override // com.amazon.aps.iva.we0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.amazon.aps.iva.ue0.q<? super T> r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.ve0.b.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.ve0.b$a r0 = (com.amazon.aps.iva.ve0.b.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.ve0.b$a r0 = new com.amazon.aps.iva.ve0.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.ue0.q r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.h = r5
            r0.k = r3
            com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ue0.q<? super T>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, java.lang.Object> r6 = r4.e
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L41
            goto L43
        L41:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
        L43:
            if (r6 != r1) goto L46
            return r1
        L46:
            boolean r5 = r5.u()
            if (r5 == 0) goto L4f
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        L4f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ve0.b.d(com.amazon.aps.iva.ue0.q, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.we0.f
    public final com.amazon.aps.iva.we0.f<T> e(com.amazon.aps.iva.ob0.g gVar, int i, com.amazon.aps.iva.ue0.e eVar) {
        return new b(this.f, gVar, i, eVar);
    }
}
