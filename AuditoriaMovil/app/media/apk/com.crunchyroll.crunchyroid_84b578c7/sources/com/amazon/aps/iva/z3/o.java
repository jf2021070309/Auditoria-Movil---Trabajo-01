package com.amazon.aps.iva.z3;

import com.amazon.aps.iva.se0.g0;
/* compiled from: SimpleActor.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public com.amazon.aps.iva.xb0.p h;
    public int i;
    public final /* synthetic */ p<Object> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p<Object> pVar, com.amazon.aps.iva.ob0.d<? super o> dVar) {
        super(2, dVar);
        this.j = pVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new o(this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((o) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:22:0x005b). Please submit an issue!!! */
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
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            com.amazon.aps.iva.ab.x.i0(r7)
            r7 = r6
            goto L5b
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            com.amazon.aps.iva.xb0.p r1 = r6.h
            com.amazon.aps.iva.ab.x.i0(r7)
            r4 = r1
            r1 = r7
            r7 = r6
            goto L4f
        L22:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.z3.p<java.lang.Object> r7 = r6.j
            java.util.concurrent.atomic.AtomicInteger r7 = r7.d
            int r7 = r7.get()
            if (r7 <= 0) goto L31
            r7 = r3
            goto L32
        L31:
            r7 = 0
        L32:
            if (r7 == 0) goto L68
            r7 = r6
        L35:
            com.amazon.aps.iva.z3.p<java.lang.Object> r1 = r7.j
            com.amazon.aps.iva.se0.g0 r4 = r1.a
            com.amazon.aps.iva.ob0.g r4 = r4.getCoroutineContext()
            com.amazon.aps.iva.a60.b.p(r4)
            com.amazon.aps.iva.xb0.p<T, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, java.lang.Object> r4 = r1.b
            r7.h = r4
            r7.i = r3
            com.amazon.aps.iva.ue0.a r1 = r1.c
            java.lang.Object r1 = r1.o(r7)
            if (r1 != r0) goto L4f
            return r0
        L4f:
            r5 = 0
            r7.h = r5
            r7.i = r2
            java.lang.Object r1 = r4.invoke(r1, r7)
            if (r1 != r0) goto L5b
            return r0
        L5b:
            com.amazon.aps.iva.z3.p<java.lang.Object> r1 = r7.j
            java.util.concurrent.atomic.AtomicInteger r1 = r1.d
            int r1 = r1.decrementAndGet()
            if (r1 != 0) goto L35
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        L68:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z3.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
