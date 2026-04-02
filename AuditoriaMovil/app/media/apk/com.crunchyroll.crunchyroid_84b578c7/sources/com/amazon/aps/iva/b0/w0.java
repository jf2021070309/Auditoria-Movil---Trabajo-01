package com.amazon.aps.iva.b0;
/* compiled from: TapGestureDetector.kt */
/* loaded from: classes.dex */
public final class w0 {
    public static final a a = new a(null);

    /* compiled from: TapGestureDetector.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<h0, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final Object invoke(h0 h0Var, com.amazon.aps.iva.e1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            long j = cVar.a;
            return new a(dVar).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {279}, m = "awaitFirstDown")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public com.amazon.aps.iva.p1.c h;
        public com.amazon.aps.iva.p1.n i;
        public boolean j;
        public /* synthetic */ Object k;
        public int l;

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.l |= Integer.MIN_VALUE;
            return w0.b(null, false, null, this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {305, 320}, m = "waitForUpOrCancellation")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public com.amazon.aps.iva.p1.c h;
        public com.amazon.aps.iva.p1.n i;
        public /* synthetic */ Object j;
        public int k;

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.k |= Integer.MIN_VALUE;
            return w0.e(null, null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004b A[LOOP:0: B:53:0x0049->B:54:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006f A[EDGE_INSN: B:66:0x006f->B:61:0x006f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x003c -> B:52:0x003f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.amazon.aps.iva.p1.c r8, com.amazon.aps.iva.ob0.d r9) {
        /*
            boolean r0 = r9 instanceof com.amazon.aps.iva.b0.y0
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.b0.y0 r0 = (com.amazon.aps.iva.b0.y0) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.b0.y0 r0 = new com.amazon.aps.iva.b0.y0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.p1.c r8 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            com.amazon.aps.iva.ab.x.i0(r9)
        L34:
            r0.h = r8
            r0.j = r3
            java.lang.Object r9 = com.amazon.aps.iva.p1.c.h1(r8, r0)
            if (r9 != r1) goto L3f
            goto L73
        L3f:
            com.amazon.aps.iva.p1.m r9 = (com.amazon.aps.iva.p1.m) r9
            java.util.List<com.amazon.aps.iva.p1.y> r2 = r9.a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L49:
            if (r6 >= r4) goto L57
            java.lang.Object r7 = r2.get(r6)
            com.amazon.aps.iva.p1.y r7 = (com.amazon.aps.iva.p1.y) r7
            r7.a()
            int r6 = r6 + 1
            goto L49
        L57:
            java.util.List<com.amazon.aps.iva.p1.y> r9 = r9.a
            int r2 = r9.size()
            r4 = r5
        L5e:
            if (r4 >= r2) goto L6f
            java.lang.Object r6 = r9.get(r4)
            com.amazon.aps.iva.p1.y r6 = (com.amazon.aps.iva.p1.y) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L6c
            r5 = r3
            goto L6f
        L6c:
            int r4 = r4 + 1
            goto L5e
        L6f:
            if (r5 != 0) goto L34
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.w0.a(com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0048 -> B:58:0x004b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.amazon.aps.iva.p1.c r10, boolean r11, com.amazon.aps.iva.p1.n r12, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.p1.y> r13) {
        /*
            boolean r0 = r13 instanceof com.amazon.aps.iva.b0.w0.b
            if (r0 == 0) goto L13
            r0 = r13
            com.amazon.aps.iva.b0.w0$b r0 = (com.amazon.aps.iva.b0.w0.b) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.b0.w0$b r0 = new com.amazon.aps.iva.b0.w0$b
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r10 = r0.j
            com.amazon.aps.iva.p1.n r11 = r0.i
            com.amazon.aps.iva.p1.c r12 = r0.h
            com.amazon.aps.iva.ab.x.i0(r13)
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r9
            goto L4b
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            com.amazon.aps.iva.ab.x.i0(r13)
        L3c:
            r0.h = r10
            r0.i = r12
            r0.j = r11
            r0.l = r3
            java.lang.Object r13 = r10.G(r12, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            com.amazon.aps.iva.p1.m r13 = (com.amazon.aps.iva.p1.m) r13
            java.util.List<com.amazon.aps.iva.p1.y> r2 = r13.a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L55:
            if (r6 >= r4) goto L81
            java.lang.Object r7 = r2.get(r6)
            com.amazon.aps.iva.p1.y r7 = (com.amazon.aps.iva.p1.y) r7
            if (r11 == 0) goto L76
            java.lang.String r8 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r7, r8)
            boolean r8 = r7.b()
            if (r8 != 0) goto L74
            boolean r8 = r7.h
            if (r8 != 0) goto L74
            boolean r7 = r7.d
            if (r7 == 0) goto L74
            r7 = r3
            goto L7a
        L74:
            r7 = r5
            goto L7a
        L76:
            boolean r7 = com.amazon.aps.iva.ee0.f1.o(r7)
        L7a:
            if (r7 != 0) goto L7e
            r2 = r5
            goto L82
        L7e:
            int r6 = r6 + 1
            goto L55
        L81:
            r2 = r3
        L82:
            if (r2 == 0) goto L3c
            java.util.List<com.amazon.aps.iva.p1.y> r10 = r13.a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.w0.b(com.amazon.aps.iva.p1.c, boolean, com.amazon.aps.iva.p1.n, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static /* synthetic */ Object c(com.amazon.aps.iva.p1.c cVar, com.amazon.aps.iva.ob0.d dVar, int i) {
        boolean z;
        com.amazon.aps.iva.p1.n nVar;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            nVar = com.amazon.aps.iva.p1.n.Main;
        } else {
            nVar = null;
        }
        return b(cVar, z, nVar, dVar);
    }

    public static Object d(com.amazon.aps.iva.p1.f0 f0Var, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.ob0.d dVar) {
        Object p = com.amazon.aps.iva.e.z.p(new a1(f0Var, null, null, null, lVar, a), dVar);
        if (p != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return com.amazon.aps.iva.kb0.q.a;
        }
        return p;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x00de -> B:87:0x0031). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.amazon.aps.iva.p1.c r18, com.amazon.aps.iva.p1.n r19, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.p1.y> r20) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.w0.e(com.amazon.aps.iva.p1.c, com.amazon.aps.iva.p1.n, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
