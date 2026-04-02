package com.amazon.aps.iva.jf0;
/* compiled from: KotlinExtensions.kt */
/* loaded from: classes4.dex */
public final class r {

    /* compiled from: KotlinExtensions.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ com.amazon.aps.iva.ob0.d b;
        public final /* synthetic */ Exception c;

        public a(Exception exc, b bVar) {
            this.b = bVar;
            this.c = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.amazon.aps.iva.a60.b.s(this.b).resumeWith(com.amazon.aps.iva.ab.x.H(this.c));
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @com.amazon.aps.iva.qb0.e(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int i;

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.i |= Integer.MIN_VALUE;
            return r.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.lang.Exception r4, com.amazon.aps.iva.ob0.d<?> r5) {
        /*
            boolean r0 = r5 instanceof com.amazon.aps.iva.jf0.r.b
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.jf0.r$b r0 = (com.amazon.aps.iva.jf0.r.b) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            com.amazon.aps.iva.jf0.r$b r0 = new com.amazon.aps.iva.jf0.r$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.i
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.ab.x.i0(r5)
            com.amazon.aps.iva.kb0.q r4 = com.amazon.aps.iva.kb0.q.a
            return r4
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            com.amazon.aps.iva.ab.x.i0(r5)
            r0.getClass()
            r0.i = r3
            com.amazon.aps.iva.ye0.c r5 = com.amazon.aps.iva.se0.r0.a
            com.amazon.aps.iva.ob0.g r2 = r0.getContext()
            com.amazon.aps.iva.jf0.r$a r3 = new com.amazon.aps.iva.jf0.r$a
            r3.<init>(r4, r0)
            r5.x(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jf0.r.a(java.lang.Exception, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
