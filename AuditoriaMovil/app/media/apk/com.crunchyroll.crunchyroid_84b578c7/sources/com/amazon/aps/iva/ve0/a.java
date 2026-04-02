package com.amazon.aps.iva.ve0;
/* compiled from: Flow.kt */
/* loaded from: classes4.dex */
public abstract class a<T> implements f<T> {

    /* compiled from: Flow.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: com.amazon.aps.iva.ve0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0797a extends com.amazon.aps.iva.qb0.c {
        public com.amazon.aps.iva.we0.o h;
        public /* synthetic */ Object i;
        public final /* synthetic */ a<T> j;
        public int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0797a(a<T> aVar, com.amazon.aps.iva.ob0.d<? super C0797a> dVar) {
            super(dVar);
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return this.j.c(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // com.amazon.aps.iva.ve0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.amazon.aps.iva.ve0.g<? super T> r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.ve0.a.C0797a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.ve0.a$a r0 = (com.amazon.aps.iva.ve0.a.C0797a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.ve0.a$a r0 = new com.amazon.aps.iva.ve0.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.amazon.aps.iva.we0.o r6 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.lang.Throwable -> L29
            goto L55
        L29:
            r7 = move-exception
            goto L5f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.we0.o r7 = new com.amazon.aps.iva.we0.o
            com.amazon.aps.iva.ob0.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.h = r7     // Catch: java.lang.Throwable -> L5b
            r0.k = r3     // Catch: java.lang.Throwable -> L5b
            r6 = r5
            com.amazon.aps.iva.ve0.j0 r6 = (com.amazon.aps.iva.ve0.j0) r6     // Catch: java.lang.Throwable -> L5b
            com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ve0.g<? super T>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, java.lang.Object> r6 = r6.b     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L5b
            if (r6 != r1) goto L4f
            goto L51
        L4f:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L5b
        L51:
            if (r6 != r1) goto L54
            return r1
        L54:
            r6 = r7
        L55:
            r6.releaseIntercepted()
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        L5b:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L5f:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ve0.a.c(com.amazon.aps.iva.ve0.g, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
