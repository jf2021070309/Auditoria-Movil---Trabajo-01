package com.amazon.aps.iva.b0;

import com.google.android.gms.cast.MediaError;
/* compiled from: ForEachGesture.kt */
/* loaded from: classes.dex */
public final class c0 {

    /* compiled from: ForEachGesture.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {86}, m = "awaitAllPointersUp")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public com.amazon.aps.iva.p1.c h;
        public /* synthetic */ Object i;
        public int j;

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.j |= Integer.MIN_VALUE;
            return c0.a(null, this);
        }
    }

    /* compiled from: ForEachGesture.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED, 107, 112}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int i;
        public /* synthetic */ Object j;
        public final /* synthetic */ com.amazon.aps.iva.ob0.g k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.ob0.d dVar, com.amazon.aps.iva.ob0.g gVar, com.amazon.aps.iva.xb0.p pVar) {
            super(dVar);
            this.k = gVar;
            this.l = pVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            b bVar = new b(dVar, this.k, this.l);
            bVar.j = obj;
            return bVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.p1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x005f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0060 -> B:20:0x003d). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0081 -> B:20:0x003d). Please submit an issue!!! */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r8.i
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L35
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r8.j
                com.amazon.aps.iva.p1.c r1 = (com.amazon.aps.iva.p1.c) r1
                com.amazon.aps.iva.ab.x.i0(r9)
                goto L26
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.j
                com.amazon.aps.iva.p1.c r1 = (com.amazon.aps.iva.p1.c) r1
                com.amazon.aps.iva.ab.x.i0(r9)     // Catch: java.util.concurrent.CancellationException -> L31
            L26:
                r9 = r1
                goto L3c
            L28:
                java.lang.Object r1 = r8.j
                com.amazon.aps.iva.p1.c r1 = (com.amazon.aps.iva.p1.c) r1
                com.amazon.aps.iva.ab.x.i0(r9)     // Catch: java.util.concurrent.CancellationException -> L31
                r9 = r8
                goto L55
            L31:
                r9 = move-exception
                r5 = r1
                r1 = r8
                goto L6e
            L35:
                com.amazon.aps.iva.ab.x.i0(r9)
                java.lang.Object r9 = r8.j
                com.amazon.aps.iva.p1.c r9 = (com.amazon.aps.iva.p1.c) r9
            L3c:
                r1 = r8
            L3d:
                com.amazon.aps.iva.ob0.g r5 = r1.k
                boolean r5 = com.amazon.aps.iva.a60.b.t(r5)
                if (r5 == 0) goto L84
                com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, java.lang.Object> r5 = r1.l     // Catch: java.util.concurrent.CancellationException -> L6a
                r1.j = r9     // Catch: java.util.concurrent.CancellationException -> L6a
                r1.i = r4     // Catch: java.util.concurrent.CancellationException -> L6a
                java.lang.Object r5 = r5.invoke(r9, r1)     // Catch: java.util.concurrent.CancellationException -> L6a
                if (r5 != r0) goto L52
                return r0
            L52:
                r7 = r1
                r1 = r9
                r9 = r7
            L55:
                r9.j = r1     // Catch: java.util.concurrent.CancellationException -> L64
                r9.i = r3     // Catch: java.util.concurrent.CancellationException -> L64
                java.lang.Object r5 = com.amazon.aps.iva.b0.c0.a(r1, r9)     // Catch: java.util.concurrent.CancellationException -> L64
                if (r5 != r0) goto L60
                return r0
            L60:
                r7 = r1
                r1 = r9
                r9 = r7
                goto L3d
            L64:
                r5 = move-exception
                r7 = r1
                r1 = r9
                r9 = r5
                r5 = r7
                goto L6e
            L6a:
                r5 = move-exception
                r7 = r5
                r5 = r9
                r9 = r7
            L6e:
                com.amazon.aps.iva.ob0.g r6 = r1.k
                boolean r6 = com.amazon.aps.iva.a60.b.t(r6)
                if (r6 == 0) goto L83
                r1.j = r5
                r1.i = r2
                java.lang.Object r9 = com.amazon.aps.iva.b0.c0.a(r5, r1)
                if (r9 != r0) goto L81
                return r0
            L81:
                r9 = r5
                goto L3d
            L83:
                throw r9
            L84:
                com.amazon.aps.iva.kb0.q r9 = com.amazon.aps.iva.kb0.q.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.c0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if ((!r8) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        r8 = com.amazon.aps.iva.p1.n.Final;
        r0.h = r7;
        r0.j = 1;
        r8 = r7.G(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        if (r8 != r1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
        if (r8 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
        return com.amazon.aps.iva.kb0.q.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:26:0x0067). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.amazon.aps.iva.p1.c r7, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r8) {
        /*
            boolean r0 = r8 instanceof com.amazon.aps.iva.b0.c0.a
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.b0.c0$a r0 = (com.amazon.aps.iva.b0.c0.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.b0.c0$a r0 = new com.amazon.aps.iva.b0.c0$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            com.amazon.aps.iva.p1.c r7 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L67
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            com.amazon.aps.iva.ab.x.i0(r8)
            java.lang.String r8 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r7, r8)
            com.amazon.aps.iva.p1.m r8 = r7.v0()
            java.util.List<com.amazon.aps.iva.p1.y> r8 = r8.a
            int r2 = r8.size()
            r5 = r3
        L45:
            if (r5 >= r2) goto L56
            java.lang.Object r6 = r8.get(r5)
            com.amazon.aps.iva.p1.y r6 = (com.amazon.aps.iva.p1.y) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L53
            r8 = r4
            goto L57
        L53:
            int r5 = r5 + 1
            goto L45
        L56:
            r8 = r3
        L57:
            r8 = r8 ^ r4
            if (r8 != 0) goto L84
        L5a:
            com.amazon.aps.iva.p1.n r8 = com.amazon.aps.iva.p1.n.Final
            r0.h = r7
            r0.j = r4
            java.lang.Object r8 = r7.G(r8, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            com.amazon.aps.iva.p1.m r8 = (com.amazon.aps.iva.p1.m) r8
            java.util.List<com.amazon.aps.iva.p1.y> r8 = r8.a
            int r2 = r8.size()
            r5 = r3
        L70:
            if (r5 >= r2) goto L81
            java.lang.Object r6 = r8.get(r5)
            com.amazon.aps.iva.p1.y r6 = (com.amazon.aps.iva.p1.y) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L7e
            r8 = r4
            goto L82
        L7e:
            int r5 = r5 + 1
            goto L70
        L81:
            r8 = r3
        L82:
            if (r8 != 0) goto L5a
        L84:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.c0.a(com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static final Object b(com.amazon.aps.iva.p1.f0 f0Var, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.p1.c, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object X = f0Var.X(new b(null, dVar.getContext(), pVar), dVar);
        if (X == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return X;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
