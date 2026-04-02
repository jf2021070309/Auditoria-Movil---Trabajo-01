package com.amazon.aps.iva.g0;

import com.google.android.gms.cast.MediaError;
/* compiled from: BringIntoViewRequester.kt */
/* loaded from: classes.dex */
public final class e implements d {
    public final com.amazon.aps.iva.p0.f<g> a = new com.amazon.aps.iva.p0.f<>(new g[16]);

    /* compiled from: BringIntoViewRequester.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE}, m = "bringIntoView")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public com.amazon.aps.iva.e1.e h;
        public Object[] i;
        public int j;
        public int k;
        public /* synthetic */ Object l;
        public int n;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.l = obj;
            this.n |= Integer.MIN_VALUE;
            return e.this.a(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        if (r11 < r2) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007c -> B:29:0x007f). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.g0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.e1.e r11, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.amazon.aps.iva.g0.e.a
            if (r0 == 0) goto L13
            r0 = r12
            com.amazon.aps.iva.g0.e$a r0 = (com.amazon.aps.iva.g0.e.a) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            com.amazon.aps.iva.g0.e$a r0 = new com.amazon.aps.iva.g0.e$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.l
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.n
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r11 = r0.k
            int r2 = r0.j
            java.lang.Object[] r4 = r0.i
            com.amazon.aps.iva.e1.e r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r12)
            r12 = r5
            goto L7f
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            com.amazon.aps.iva.ab.x.i0(r12)
            com.amazon.aps.iva.p0.f<com.amazon.aps.iva.g0.g> r12 = r10.a
            int r2 = r12.d
            if (r2 <= 0) goto L82
            T[] r12 = r12.b
            r4 = 0
            r9 = r12
            r12 = r11
            r11 = r4
            r4 = r9
        L48:
            r5 = r4[r11]
            com.amazon.aps.iva.g0.g r5 = (com.amazon.aps.iva.g0.g) r5
            r0.h = r12
            r0.i = r4
            r0.j = r2
            r0.k = r11
            r0.n = r3
            r5.getClass()
            com.amazon.aps.iva.t1.i<com.amazon.aps.iva.g0.c> r6 = com.amazon.aps.iva.g0.b.a
            java.lang.Object r6 = r5.l(r6)
            com.amazon.aps.iva.g0.c r6 = (com.amazon.aps.iva.g0.c) r6
            if (r6 != 0) goto L65
            com.amazon.aps.iva.g0.j r6 = r5.o
        L65:
            com.amazon.aps.iva.s1.q r7 = r5.t1()
            if (r7 != 0) goto L6c
            goto L7a
        L6c:
            com.amazon.aps.iva.g0.f r8 = new com.amazon.aps.iva.g0.f
            r8.<init>(r12, r5)
            java.lang.Object r5 = r6.Z(r7, r8, r0)
            com.amazon.aps.iva.pb0.a r6 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            if (r5 != r6) goto L7a
            goto L7c
        L7a:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
        L7c:
            if (r5 != r1) goto L7f
            return r1
        L7f:
            int r11 = r11 + r3
            if (r11 < r2) goto L48
        L82:
            com.amazon.aps.iva.kb0.q r11 = com.amazon.aps.iva.kb0.q.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g0.e.a(com.amazon.aps.iva.e1.e, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
