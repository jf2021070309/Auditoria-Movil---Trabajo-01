package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.ee0.f1;
/* compiled from: DragGestureDetector.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {235, 236, 241}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> l;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> m;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.y, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> n;

    /* compiled from: DragGestureDetector.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.p1.y, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.y, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.p1.y, ? super com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> pVar) {
            super(1);
            this.h = pVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.p1.y yVar) {
            com.amazon.aps.iva.p1.y yVar2 = yVar;
            com.amazon.aps.iva.yb0.j.f(yVar2, "it");
            this.h.invoke(yVar2, new com.amazon.aps.iva.e1.c(f1.P(yVar2, false)));
            yVar2.a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.amazon.aps.iva.ob0.d dVar, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.a aVar2, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.p pVar) {
        super(dVar);
        this.k = lVar;
        this.l = aVar;
        this.m = aVar2;
        this.n = pVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        j jVar = new j(dVar, this.l, this.m, this.k, this.n);
        jVar.j = obj;
        return jVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.p1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((j) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[Catch: CancellationException -> 0x00a9, TryCatch #0 {CancellationException -> 0x00a9, blocks: (B:8:0x0015, B:31:0x0078, B:33:0x0080, B:35:0x008e, B:37:0x009f, B:39:0x00a3, B:46:0x00ae, B:47:0x00b1, B:48:0x00b4, B:49:0x00ba, B:13:0x0025, B:25:0x0053, B:27:0x0057, B:16:0x002d, B:22:0x0044, B:19:0x0039), top: B:54:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[Catch: CancellationException -> 0x00a9, TryCatch #0 {CancellationException -> 0x00a9, blocks: (B:8:0x0015, B:31:0x0078, B:33:0x0080, B:35:0x008e, B:37:0x009f, B:39:0x00a3, B:46:0x00ae, B:47:0x00b1, B:48:0x00b4, B:49:0x00ba, B:13:0x0025, B:25:0x0053, B:27:0x0057, B:16:0x002d, B:22:0x0044, B:19:0x0039), top: B:54:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba A[Catch: CancellationException -> 0x00a9, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00a9, blocks: (B:8:0x0015, B:31:0x0078, B:33:0x0080, B:35:0x008e, B:37:0x009f, B:39:0x00a3, B:46:0x00ae, B:47:0x00b1, B:48:0x00b4, B:49:0x00ba, B:13:0x0025, B:25:0x0053, B:27:0x0057, B:16:0x002d, B:22:0x0044, B:19:0x0039), top: B:54:0x0009 }] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r9.i
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r2 = r9.m
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L31
            if (r1 == r5) goto L29
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r0 = r9.j
            com.amazon.aps.iva.p1.c r0 = (com.amazon.aps.iva.p1.c) r0
            com.amazon.aps.iva.ab.x.i0(r10)     // Catch: java.util.concurrent.CancellationException -> La9
            goto L78
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.lang.Object r1 = r9.j
            com.amazon.aps.iva.p1.c r1 = (com.amazon.aps.iva.p1.c) r1
            com.amazon.aps.iva.ab.x.i0(r10)     // Catch: java.util.concurrent.CancellationException -> La9
            goto L53
        L29:
            java.lang.Object r1 = r9.j
            com.amazon.aps.iva.p1.c r1 = (com.amazon.aps.iva.p1.c) r1
            com.amazon.aps.iva.ab.x.i0(r10)     // Catch: java.util.concurrent.CancellationException -> La9
            goto L44
        L31:
            com.amazon.aps.iva.ab.x.i0(r10)
            java.lang.Object r10 = r9.j
            r1 = r10
            com.amazon.aps.iva.p1.c r1 = (com.amazon.aps.iva.p1.c) r1
            r9.j = r1     // Catch: java.util.concurrent.CancellationException -> La9
            r9.i = r5     // Catch: java.util.concurrent.CancellationException -> La9
            java.lang.Object r10 = com.amazon.aps.iva.b0.w0.c(r1, r9, r4)     // Catch: java.util.concurrent.CancellationException -> La9
            if (r10 != r0) goto L44
            return r0
        L44:
            com.amazon.aps.iva.p1.y r10 = (com.amazon.aps.iva.p1.y) r10     // Catch: java.util.concurrent.CancellationException -> La9
            long r6 = r10.a     // Catch: java.util.concurrent.CancellationException -> La9
            r9.j = r1     // Catch: java.util.concurrent.CancellationException -> La9
            r9.i = r4     // Catch: java.util.concurrent.CancellationException -> La9
            java.lang.Object r10 = com.amazon.aps.iva.b0.h.b(r1, r6, r9)     // Catch: java.util.concurrent.CancellationException -> La9
            if (r10 != r0) goto L53
            return r0
        L53:
            com.amazon.aps.iva.p1.y r10 = (com.amazon.aps.iva.p1.y) r10     // Catch: java.util.concurrent.CancellationException -> La9
            if (r10 == 0) goto Lbd
            com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> r4 = r9.k     // Catch: java.util.concurrent.CancellationException -> La9
            long r6 = r10.c     // Catch: java.util.concurrent.CancellationException -> La9
            com.amazon.aps.iva.e1.c r8 = new com.amazon.aps.iva.e1.c     // Catch: java.util.concurrent.CancellationException -> La9
            r8.<init>(r6)     // Catch: java.util.concurrent.CancellationException -> La9
            r4.invoke(r8)     // Catch: java.util.concurrent.CancellationException -> La9
            long r6 = r10.a     // Catch: java.util.concurrent.CancellationException -> La9
            com.amazon.aps.iva.b0.j$a r10 = new com.amazon.aps.iva.b0.j$a     // Catch: java.util.concurrent.CancellationException -> La9
            com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.y, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> r4 = r9.n     // Catch: java.util.concurrent.CancellationException -> La9
            r10.<init>(r4)     // Catch: java.util.concurrent.CancellationException -> La9
            r9.j = r1     // Catch: java.util.concurrent.CancellationException -> La9
            r9.i = r3     // Catch: java.util.concurrent.CancellationException -> La9
            java.lang.Object r10 = com.amazon.aps.iva.b0.h.c(r1, r6, r10, r9)     // Catch: java.util.concurrent.CancellationException -> La9
            if (r10 != r0) goto L77
            return r0
        L77:
            r0 = r1
        L78:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.util.concurrent.CancellationException -> La9
            boolean r10 = r10.booleanValue()     // Catch: java.util.concurrent.CancellationException -> La9
            if (r10 == 0) goto Lba
            com.amazon.aps.iva.p1.m r10 = r0.v0()     // Catch: java.util.concurrent.CancellationException -> La9
            java.util.List<com.amazon.aps.iva.p1.y> r10 = r10.a     // Catch: java.util.concurrent.CancellationException -> La9
            int r0 = r10.size()     // Catch: java.util.concurrent.CancellationException -> La9
            r1 = 0
            r3 = r1
        L8c:
            if (r3 >= r0) goto Lb4
            java.lang.Object r4 = r10.get(r3)     // Catch: java.util.concurrent.CancellationException -> La9
            com.amazon.aps.iva.p1.y r4 = (com.amazon.aps.iva.p1.y) r4     // Catch: java.util.concurrent.CancellationException -> La9
            java.lang.String r6 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r4, r6)     // Catch: java.util.concurrent.CancellationException -> La9
            boolean r6 = r4.b()     // Catch: java.util.concurrent.CancellationException -> La9
            if (r6 != 0) goto Lab
            boolean r6 = r4.h     // Catch: java.util.concurrent.CancellationException -> La9
            if (r6 == 0) goto Lab
            boolean r6 = r4.d     // Catch: java.util.concurrent.CancellationException -> La9
            if (r6 != 0) goto Lab
            r6 = r5
            goto Lac
        La9:
            r10 = move-exception
            goto Lc0
        Lab:
            r6 = r1
        Lac:
            if (r6 == 0) goto Lb1
            r4.a()     // Catch: java.util.concurrent.CancellationException -> La9
        Lb1:
            int r3 = r3 + 1
            goto L8c
        Lb4:
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r10 = r9.l     // Catch: java.util.concurrent.CancellationException -> La9
            r10.invoke()     // Catch: java.util.concurrent.CancellationException -> La9
            goto Lbd
        Lba:
            r2.invoke()     // Catch: java.util.concurrent.CancellationException -> La9
        Lbd:
            com.amazon.aps.iva.kb0.q r10 = com.amazon.aps.iva.kb0.q.a
            return r10
        Lc0:
            r2.invoke()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
