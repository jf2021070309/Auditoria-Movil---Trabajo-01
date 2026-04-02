package com.amazon.aps.iva.b0;

import java.util.List;
/* compiled from: DragGestureDetector.kt */
/* loaded from: classes.dex */
public final class h {
    public static final a a = new a();
    public static final b b = new b();
    public static final float c = ((float) 0.125d) / 18;

    /* compiled from: DragGestureDetector.kt */
    /* loaded from: classes.dex */
    public static final class a implements g0 {
        @Override // com.amazon.aps.iva.b0.g0
        public final float a(long j) {
            return com.amazon.aps.iva.e1.c.c(j);
        }

        @Override // com.amazon.aps.iva.b0.g0
        public final long b(float f, float f2) {
            return com.amazon.aps.iva.e1.d.d(f, f2);
        }

        @Override // com.amazon.aps.iva.b0.g0
        public final float c(long j) {
            return com.amazon.aps.iva.e1.c.d(j);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    /* loaded from: classes.dex */
    public static final class b implements g0 {
        @Override // com.amazon.aps.iva.b0.g0
        public final float a(long j) {
            return com.amazon.aps.iva.e1.c.d(j);
        }

        @Override // com.amazon.aps.iva.b0.g0
        public final long b(float f, float f2) {
            return com.amazon.aps.iva.e1.d.d(f2, f);
        }

        @Override // com.amazon.aps.iva.b0.g0
        public final float c(long j) {
            return com.amazon.aps.iva.e1.c.c(j);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {876}, m = "awaitDragOrCancellation-rnUCldI")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public com.amazon.aps.iva.p1.c h;
        public com.amazon.aps.iva.yb0.c0 i;
        public /* synthetic */ Object j;
        public int k;

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.k |= Integer.MIN_VALUE;
            return h.a(null, 0L, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {808}, m = "awaitLongPressOrCancellation-rnUCldI")
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.qb0.c {
        public com.amazon.aps.iva.p1.y h;
        public com.amazon.aps.iva.yb0.d0 i;
        public /* synthetic */ Object j;
        public int k;

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.k |= Integer.MIN_VALUE;
            return h.b(null, 0L, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {811, 828}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public com.amazon.aps.iva.p1.m i;
        public int j;
        public int k;
        public /* synthetic */ Object l;
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.p1.y> m;
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.p1.y> n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.p1.y> d0Var, com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.p1.y> d0Var2, com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(dVar);
            this.m = d0Var;
            this.n = d0Var2;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            e eVar = new e(this.m, this.n, dVar);
            eVar.l = obj;
            return eVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.p1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((e) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00ba A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00d9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0073 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00a6 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r12v11, types: [T, com.amazon.aps.iva.p1.y] */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00bb -> B:44:0x00bd). Please submit an issue!!! */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.h.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {109}, m = "drag-jO51t88")
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.qb0.c {
        public com.amazon.aps.iva.p1.c h;
        public com.amazon.aps.iva.xb0.l i;
        public /* synthetic */ Object j;
        public int k;

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.k |= Integer.MIN_VALUE;
            return h.c(null, 0L, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
        if ((!com.amazon.aps.iva.e1.c.a(com.amazon.aps.iva.ee0.f1.P(r11, true), com.amazon.aps.iva.e1.c.b)) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0061 -> B:22:0x0066). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.amazon.aps.iva.p1.c r17, long r18, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.p1.y> r20) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.h.a(com.amazon.aps.iva.p1.c, long, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, com.amazon.aps.iva.p1.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.amazon.aps.iva.p1.c r9, long r10, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.p1.y> r12) {
        /*
            boolean r0 = r12 instanceof com.amazon.aps.iva.b0.h.d
            if (r0 == 0) goto L13
            r0 = r12
            com.amazon.aps.iva.b0.h$d r0 = (com.amazon.aps.iva.b0.h.d) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.b0.h$d r0 = new com.amazon.aps.iva.b0.h$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.amazon.aps.iva.yb0.d0 r9 = r0.i
            com.amazon.aps.iva.p1.y r10 = r0.h
            com.amazon.aps.iva.ab.x.i0(r12)     // Catch: com.amazon.aps.iva.p1.o -> L2d
            goto L9b
        L2d:
            r4 = r10
            goto L93
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            com.amazon.aps.iva.ab.x.i0(r12)
            com.amazon.aps.iva.p1.m r12 = r9.v0()
            boolean r12 = d(r12, r10)
            if (r12 == 0) goto L45
            return r4
        L45:
            com.amazon.aps.iva.p1.m r12 = r9.v0()
            java.util.List<com.amazon.aps.iva.p1.y> r12 = r12.a
            int r2 = r12.size()
            r5 = 0
        L50:
            if (r5 >= r2) goto L65
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            com.amazon.aps.iva.p1.y r7 = (com.amazon.aps.iva.p1.y) r7
            long r7 = r7.a
            boolean r7 = com.amazon.aps.iva.p1.x.a(r7, r10)
            if (r7 == 0) goto L62
            goto L66
        L62:
            int r5 = r5 + 1
            goto L50
        L65:
            r6 = r4
        L66:
            com.amazon.aps.iva.p1.y r6 = (com.amazon.aps.iva.p1.y) r6
            if (r6 != 0) goto L6b
            return r4
        L6b:
            com.amazon.aps.iva.yb0.d0 r10 = new com.amazon.aps.iva.yb0.d0
            r10.<init>()
            com.amazon.aps.iva.yb0.d0 r11 = new com.amazon.aps.iva.yb0.d0
            r11.<init>()
            r11.b = r6
            com.amazon.aps.iva.v1.v2 r12 = r9.getViewConfiguration()
            long r7 = r12.c()
            com.amazon.aps.iva.b0.h$e r12 = new com.amazon.aps.iva.b0.h$e     // Catch: com.amazon.aps.iva.p1.o -> L91
            r12.<init>(r11, r10, r4)     // Catch: com.amazon.aps.iva.p1.o -> L91
            r0.h = r6     // Catch: com.amazon.aps.iva.p1.o -> L91
            r0.i = r10     // Catch: com.amazon.aps.iva.p1.o -> L91
            r0.k = r3     // Catch: com.amazon.aps.iva.p1.o -> L91
            java.lang.Object r9 = r9.z0(r7, r12, r0)     // Catch: com.amazon.aps.iva.p1.o -> L91
            if (r9 != r1) goto L9b
            return r1
        L91:
            r9 = r10
            r4 = r6
        L93:
            T r9 = r9.b
            com.amazon.aps.iva.p1.y r9 = (com.amazon.aps.iva.p1.y) r9
            if (r9 != 0) goto L9a
            goto L9b
        L9a:
            r4 = r9
        L9b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.h.b(com.amazon.aps.iva.p1.c, long, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.amazon.aps.iva.p1.c r4, long r5, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.p1.y, com.amazon.aps.iva.kb0.q> r7, com.amazon.aps.iva.ob0.d<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof com.amazon.aps.iva.b0.h.f
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.b0.h$f r0 = (com.amazon.aps.iva.b0.h.f) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.b0.h$f r0 = new com.amazon.aps.iva.b0.h$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.amazon.aps.iva.xb0.l r4 = r0.i
            com.amazon.aps.iva.p1.c r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            com.amazon.aps.iva.ab.x.i0(r8)
        L38:
            r0.h = r4
            r0.i = r7
            r0.k = r3
            java.lang.Object r8 = a(r4, r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            com.amazon.aps.iva.p1.y r8 = (com.amazon.aps.iva.p1.y) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = com.amazon.aps.iva.ee0.f1.p(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.invoke(r8)
            long r5 = r8.a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.h.c(com.amazon.aps.iva.p1.c, long, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static final boolean d(com.amazon.aps.iva.p1.m mVar, long j) {
        com.amazon.aps.iva.p1.y yVar;
        List<com.amazon.aps.iva.p1.y> list = mVar.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                yVar = list.get(i);
                if (com.amazon.aps.iva.p1.x.a(yVar.a, j)) {
                    break;
                }
                i++;
            } else {
                yVar = null;
                break;
            }
        }
        com.amazon.aps.iva.p1.y yVar2 = yVar;
        if (yVar2 != null && yVar2.d) {
            z = true;
        }
        return true ^ z;
    }
}
