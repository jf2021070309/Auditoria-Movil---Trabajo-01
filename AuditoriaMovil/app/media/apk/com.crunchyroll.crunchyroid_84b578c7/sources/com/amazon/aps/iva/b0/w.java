package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.u1.g1;
import com.google.android.gms.cast.MediaError;
import okhttp3.internal.http.StatusLine;
/* compiled from: Draggable.kt */
/* loaded from: classes.dex */
public final class w extends com.amazon.aps.iva.u1.j implements g1 {
    public final b A;
    public final com.amazon.aps.iva.q1.c B;
    public final com.amazon.aps.iva.p1.m0 C;
    public final com.amazon.aps.iva.ue0.a D;
    public com.amazon.aps.iva.c0.b E;
    public a0 q;
    public com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.p1.y, Boolean> r;
    public f0 s;
    public boolean t;
    public com.amazon.aps.iva.c0.l u;
    public com.amazon.aps.iva.xb0.a<Boolean> v;
    public com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.se0.g0, ? super com.amazon.aps.iva.e1.c, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> w;
    public com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.se0.g0, ? super com.amazon.aps.iva.o2.o, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> x;
    public boolean y;
    public final a z;

    /* compiled from: Draggable.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.p1.y, Boolean> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(com.amazon.aps.iva.p1.y yVar) {
            com.amazon.aps.iva.p1.y yVar2 = yVar;
            com.amazon.aps.iva.yb0.j.f(yVar2, "it");
            return w.this.r.invoke(yVar2);
        }
    }

    /* compiled from: Draggable.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            return w.this.v.invoke();
        }
    }

    /* compiled from: Draggable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1", f = "Draggable.kt", l = {302}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.f0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;

        /* compiled from: Draggable.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1", f = "Draggable.kt", l = {326}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public /* synthetic */ Object i;
            public final /* synthetic */ com.amazon.aps.iva.p1.f0 j;
            public final /* synthetic */ w k;

            /* compiled from: Draggable.kt */
            @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1", f = "Draggable.kt", l = {305, StatusLine.HTTP_TEMP_REDIRECT, 309, MediaError.DetailedErrorCode.HLS_SEGMENT_PARSING, 318, MediaError.DetailedErrorCode.DASH_NETWORK}, m = "invokeSuspend")
            /* renamed from: com.amazon.aps.iva.b0.w$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0125a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
                public com.amazon.aps.iva.yb0.d0 h;
                public com.amazon.aps.iva.yb0.d0 i;
                public int j;
                public /* synthetic */ Object k;
                public final /* synthetic */ w l;

                /* compiled from: Draggable.kt */
                @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1$1", f = "Draggable.kt", l = {MediaError.DetailedErrorCode.HLS_NETWORK_PLAYLIST}, m = "invokeSuspend")
                /* renamed from: com.amazon.aps.iva.b0.w$c$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0126a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<k, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
                    public com.amazon.aps.iva.yb0.d0 h;
                    public int i;
                    public /* synthetic */ Object j;
                    public final /* synthetic */ com.amazon.aps.iva.yb0.d0<g> k;
                    public final /* synthetic */ w l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0126a(com.amazon.aps.iva.yb0.d0<g> d0Var, w wVar, com.amazon.aps.iva.ob0.d<? super C0126a> dVar) {
                        super(2, dVar);
                        this.k = d0Var;
                        this.l = wVar;
                    }

                    @Override // com.amazon.aps.iva.qb0.a
                    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                        C0126a c0126a = new C0126a(this.k, this.l, dVar);
                        c0126a.j = obj;
                        return c0126a;
                    }

                    @Override // com.amazon.aps.iva.xb0.p
                    public final Object invoke(k kVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                        return ((C0126a) create(kVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0063 -> B:28:0x0069). Please submit an issue!!! */
                    @Override // com.amazon.aps.iva.qb0.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                        /*
                            r11 = this;
                            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                            int r1 = r11.i
                            r2 = 1
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            com.amazon.aps.iva.yb0.d0 r1 = r11.h
                            java.lang.Object r3 = r11.j
                            com.amazon.aps.iva.b0.k r3 = (com.amazon.aps.iva.b0.k) r3
                            com.amazon.aps.iva.ab.x.i0(r12)
                            r4 = r3
                            r3 = r1
                            r1 = r0
                            r0 = r11
                            goto L69
                        L17:
                            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r12.<init>(r0)
                            throw r12
                        L1f:
                            com.amazon.aps.iva.ab.x.i0(r12)
                            java.lang.Object r12 = r11.j
                            com.amazon.aps.iva.b0.k r12 = (com.amazon.aps.iva.b0.k) r12
                            r3 = r12
                            r12 = r11
                        L28:
                            com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.b0.g> r1 = r12.k
                            T r4 = r1.b
                            boolean r5 = r4 instanceof com.amazon.aps.iva.b0.g.d
                            if (r5 != 0) goto L6f
                            boolean r5 = r4 instanceof com.amazon.aps.iva.b0.g.a
                            if (r5 != 0) goto L6f
                            boolean r5 = r4 instanceof com.amazon.aps.iva.b0.g.b
                            if (r5 == 0) goto L3b
                            com.amazon.aps.iva.b0.g$b r4 = (com.amazon.aps.iva.b0.g.b) r4
                            goto L3c
                        L3b:
                            r4 = 0
                        L3c:
                            com.amazon.aps.iva.b0.w r5 = r12.l
                            if (r4 == 0) goto L54
                            com.amazon.aps.iva.b0.f0 r6 = r5.s
                            com.amazon.aps.iva.b0.f0 r7 = com.amazon.aps.iva.b0.f0.Vertical
                            long r8 = r4.a
                            if (r6 != r7) goto L4d
                            float r4 = com.amazon.aps.iva.e1.c.d(r8)
                            goto L51
                        L4d:
                            float r4 = com.amazon.aps.iva.e1.c.c(r8)
                        L51:
                            r3.b(r4)
                        L54:
                            com.amazon.aps.iva.ue0.a r4 = r5.D
                            r12.j = r3
                            r12.h = r1
                            r12.i = r2
                            java.lang.Object r4 = r4.o(r12)
                            if (r4 != r0) goto L63
                            return r0
                        L63:
                            r10 = r0
                            r0 = r12
                            r12 = r4
                            r4 = r3
                            r3 = r1
                            r1 = r10
                        L69:
                            r3.b = r12
                            r12 = r0
                            r0 = r1
                            r3 = r4
                            goto L28
                        L6f:
                            com.amazon.aps.iva.kb0.q r12 = com.amazon.aps.iva.kb0.q.a
                            return r12
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.w.c.a.C0125a.C0126a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0125a(w wVar, com.amazon.aps.iva.ob0.d<? super C0125a> dVar) {
                    super(2, dVar);
                    this.l = wVar;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                    C0125a c0125a = new C0125a(this.l, dVar);
                    c0125a.k = obj;
                    return c0125a;
                }

                @Override // com.amazon.aps.iva.xb0.p
                public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                    return ((C0125a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00b7 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00be A[Catch: CancellationException -> 0x00e9, TryCatch #2 {CancellationException -> 0x00e9, blocks: (B:31:0x009f, B:34:0x00b8, B:36:0x00be, B:39:0x00d5, B:41:0x00d9), top: B:57:0x009f }] */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00d5 A[Catch: CancellationException -> 0x00e9, TryCatch #2 {CancellationException -> 0x00e9, blocks: (B:31:0x009f, B:34:0x00b8, B:36:0x00be, B:39:0x00d5, B:41:0x00d9), top: B:57:0x009f }] */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00f8 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f9 -> B:19:0x005d). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00fe -> B:19:0x005d). Please submit an issue!!! */
                @Override // com.amazon.aps.iva.qb0.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                    /*
                        Method dump skipped, instructions count: 280
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.w.c.a.C0125a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* compiled from: Draggable.kt */
            @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$2", f = "Draggable.kt", l = {328, 336}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class b extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
                public w i;
                public com.amazon.aps.iva.se0.g0 j;
                public int k;
                public /* synthetic */ Object l;
                public final /* synthetic */ com.amazon.aps.iva.se0.g0 m;
                public final /* synthetic */ w n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(w wVar, com.amazon.aps.iva.ob0.d dVar, com.amazon.aps.iva.se0.g0 g0Var) {
                    super(dVar);
                    this.m = g0Var;
                    this.n = wVar;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                    b bVar = new b(this.n, dVar, this.m);
                    bVar.l = obj;
                    return bVar;
                }

                @Override // com.amazon.aps.iva.xb0.p
                public final Object invoke(com.amazon.aps.iva.p1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                    return ((b) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
                }

                /* JADX WARN: Can't wrap try/catch for region: R(7:28|29|30|31|32|33|(1:35)(4:36|9|10|(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x00f7, code lost:
                    r0 = th;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x00f9, code lost:
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x00fe, code lost:
                    r13 = r18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x0108, code lost:
                    r8 = r2;
                    r2 = r4;
                    r14 = r6;
                    r6 = r17;
                    r7 = r18;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x011f A[Catch: all -> 0x0120, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:52:0x010f, B:56:0x011f), top: B:66:0x010f }] */
                /* JADX WARN: Removed duplicated region for block: B:62:0x012b  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0133  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a2 -> B:71:0x00a9). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0115 -> B:55:0x0117). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x012b -> B:63:0x0130). Please submit an issue!!! */
                @Override // com.amazon.aps.iva.qb0.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r20) {
                    /*
                        Method dump skipped, instructions count: 310
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.w.c.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.amazon.aps.iva.p1.f0 f0Var, w wVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
                super(2, dVar);
                this.j = f0Var;
                this.k = wVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                a aVar = new a(this.j, this.k, dVar);
                aVar.i = obj;
                return aVar;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
            @Override // com.amazon.aps.iva.qb0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                    int r1 = r7.h
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r0 = r7.i
                    com.amazon.aps.iva.se0.g0 r0 = (com.amazon.aps.iva.se0.g0) r0
                    com.amazon.aps.iva.ab.x.i0(r8)     // Catch: java.util.concurrent.CancellationException -> L11
                    goto L4b
                L11:
                    r8 = move-exception
                    goto L45
                L13:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1b:
                    com.amazon.aps.iva.ab.x.i0(r8)
                    java.lang.Object r8 = r7.i
                    com.amazon.aps.iva.se0.g0 r8 = (com.amazon.aps.iva.se0.g0) r8
                    com.amazon.aps.iva.se0.h0 r1 = com.amazon.aps.iva.se0.h0.UNDISPATCHED
                    com.amazon.aps.iva.b0.w$c$a$a r3 = new com.amazon.aps.iva.b0.w$c$a$a
                    com.amazon.aps.iva.b0.w r4 = r7.k
                    r5 = 0
                    r3.<init>(r4, r5)
                    com.amazon.aps.iva.se0.i.d(r8, r5, r1, r3, r2)
                    com.amazon.aps.iva.p1.f0 r1 = r7.j     // Catch: java.util.concurrent.CancellationException -> L41
                    com.amazon.aps.iva.b0.w$c$a$b r3 = new com.amazon.aps.iva.b0.w$c$a$b     // Catch: java.util.concurrent.CancellationException -> L41
                    r3.<init>(r4, r5, r8)     // Catch: java.util.concurrent.CancellationException -> L41
                    r7.i = r8     // Catch: java.util.concurrent.CancellationException -> L41
                    r7.h = r2     // Catch: java.util.concurrent.CancellationException -> L41
                    java.lang.Object r8 = r1.X(r3, r7)     // Catch: java.util.concurrent.CancellationException -> L41
                    if (r8 != r0) goto L4b
                    return r0
                L41:
                    r0 = move-exception
                    r6 = r0
                    r0 = r8
                    r8 = r6
                L45:
                    boolean r0 = com.amazon.aps.iva.e.z.E(r0)
                    if (r0 == 0) goto L4e
                L4b:
                    com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
                    return r8
                L4e:
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.w.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.i = obj;
            return cVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.p1.f0 f0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((c) create(f0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.p1.f0 f0Var = (com.amazon.aps.iva.p1.f0) this.i;
                w wVar = w.this;
                if (!wVar.t) {
                    return com.amazon.aps.iva.kb0.q.a;
                }
                a aVar2 = new a(f0Var, wVar, null);
                this.h = 1;
                if (com.amazon.aps.iva.e.z.p(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public w(a0 a0Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.p1.y, Boolean> lVar, f0 f0Var, boolean z, com.amazon.aps.iva.c0.l lVar2, com.amazon.aps.iva.xb0.a<Boolean> aVar, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.se0.g0, ? super com.amazon.aps.iva.e1.c, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> qVar, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.se0.g0, ? super com.amazon.aps.iva.o2.o, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> qVar2, boolean z2) {
        com.amazon.aps.iva.yb0.j.f(a0Var, "state");
        com.amazon.aps.iva.yb0.j.f(lVar, "canDrag");
        com.amazon.aps.iva.yb0.j.f(f0Var, "orientation");
        com.amazon.aps.iva.yb0.j.f(aVar, "startDragImmediately");
        com.amazon.aps.iva.yb0.j.f(qVar, "onDragStarted");
        com.amazon.aps.iva.yb0.j.f(qVar2, "onDragStopped");
        this.q = a0Var;
        this.r = lVar;
        this.s = f0Var;
        this.t = z;
        this.u = lVar2;
        this.v = aVar;
        this.w = qVar;
        this.x = qVar2;
        this.y = z2;
        this.z = new a();
        this.A = new b();
        this.B = new com.amazon.aps.iva.q1.c();
        c cVar = new c(null);
        com.amazon.aps.iva.p1.m mVar = com.amazon.aps.iva.p1.l0.a;
        com.amazon.aps.iva.p1.n0 n0Var = new com.amazon.aps.iva.p1.n0(cVar);
        t1(n0Var);
        this.C = n0Var;
        this.D = com.amazon.aps.iva.dg.b.c(Integer.MAX_VALUE, null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u1(com.amazon.aps.iva.b0.w r9, com.amazon.aps.iva.ob0.d r10, com.amazon.aps.iva.se0.g0 r11) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof com.amazon.aps.iva.b0.x
            if (r0 == 0) goto L16
            r0 = r10
            com.amazon.aps.iva.b0.x r0 = (com.amazon.aps.iva.b0.x) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.l = r1
            goto L1b
        L16:
            com.amazon.aps.iva.b0.x r0 = new com.amazon.aps.iva.b0.x
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.amazon.aps.iva.ab.x.i0(r10)
            goto L76
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            com.amazon.aps.iva.se0.g0 r9 = r0.i
            com.amazon.aps.iva.b0.w r11 = r0.h
            com.amazon.aps.iva.ab.x.i0(r10)
            r8 = r11
            r11 = r9
            r9 = r8
            goto L5e
        L41:
            com.amazon.aps.iva.ab.x.i0(r10)
            com.amazon.aps.iva.c0.b r10 = r9.E
            if (r10 == 0) goto L60
            com.amazon.aps.iva.c0.l r2 = r9.u
            if (r2 == 0) goto L5e
            com.amazon.aps.iva.c0.a r6 = new com.amazon.aps.iva.c0.a
            r6.<init>(r10)
            r0.h = r9
            r0.i = r11
            r0.l = r4
            java.lang.Object r10 = r2.b(r6, r0)
            if (r10 != r1) goto L5e
            goto L78
        L5e:
            r9.E = r5
        L60:
            com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.se0.g0, ? super com.amazon.aps.iva.o2.o, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends java.lang.Object> r9 = r9.x
            long r6 = com.amazon.aps.iva.o2.o.b
            com.amazon.aps.iva.o2.o r10 = new com.amazon.aps.iva.o2.o
            r10.<init>(r6)
            r0.h = r5
            r0.i = r5
            r0.l = r3
            java.lang.Object r9 = r9.invoke(r11, r10, r0)
            if (r9 != r1) goto L76
            goto L78
        L76:
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.w.u1(com.amazon.aps.iva.b0.w, com.amazon.aps.iva.ob0.d, com.amazon.aps.iva.se0.g0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v1(com.amazon.aps.iva.b0.w r8, com.amazon.aps.iva.se0.g0 r9, com.amazon.aps.iva.b0.g.c r10, com.amazon.aps.iva.ob0.d r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof com.amazon.aps.iva.b0.y
            if (r0 == 0) goto L16
            r0 = r11
            com.amazon.aps.iva.b0.y r0 = (com.amazon.aps.iva.b0.y) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.n = r1
            goto L1b
        L16:
            com.amazon.aps.iva.b0.y r0 = new com.amazon.aps.iva.b0.y
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.l
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.n
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            com.amazon.aps.iva.ab.x.i0(r11)
            goto Laf
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            com.amazon.aps.iva.c0.b r8 = r0.k
            com.amazon.aps.iva.b0.g$c r9 = r0.j
            com.amazon.aps.iva.se0.g0 r10 = r0.i
            com.amazon.aps.iva.b0.w r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L8d
        L45:
            com.amazon.aps.iva.b0.g$c r10 = r0.j
            com.amazon.aps.iva.se0.g0 r9 = r0.i
            com.amazon.aps.iva.b0.w r8 = r0.h
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L6e
        L4f:
            com.amazon.aps.iva.ab.x.i0(r11)
            com.amazon.aps.iva.c0.b r11 = r8.E
            if (r11 == 0) goto L6e
            com.amazon.aps.iva.c0.l r2 = r8.u
            if (r2 == 0) goto L6e
            com.amazon.aps.iva.c0.a r6 = new com.amazon.aps.iva.c0.a
            r6.<init>(r11)
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.n = r5
            java.lang.Object r11 = r2.b(r6, r0)
            if (r11 != r1) goto L6e
            goto Lb1
        L6e:
            com.amazon.aps.iva.c0.b r11 = new com.amazon.aps.iva.c0.b
            r11.<init>()
            com.amazon.aps.iva.c0.l r2 = r8.u
            if (r2 == 0) goto L92
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.k = r11
            r0.n = r4
            java.lang.Object r2 = r2.b(r11, r0)
            if (r2 != r1) goto L88
            goto Lb1
        L88:
            r2 = r8
            r8 = r11
            r7 = r10
            r10 = r9
            r9 = r7
        L8d:
            r11 = r8
            r8 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L92:
            r8.E = r11
            com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.se0.g0, ? super com.amazon.aps.iva.e1.c, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends java.lang.Object> r8 = r8.w
            long r10 = r10.a
            com.amazon.aps.iva.e1.c r2 = new com.amazon.aps.iva.e1.c
            r2.<init>(r10)
            r10 = 0
            r0.h = r10
            r0.i = r10
            r0.j = r10
            r0.k = r10
            r0.n = r3
            java.lang.Object r8 = r8.invoke(r9, r2, r0)
            if (r8 != r1) goto Laf
            goto Lb1
        Laf:
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.w.v1(com.amazon.aps.iva.b0.w, com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.b0.g$c, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w1(com.amazon.aps.iva.b0.w r8, com.amazon.aps.iva.se0.g0 r9, com.amazon.aps.iva.b0.g.d r10, com.amazon.aps.iva.ob0.d r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof com.amazon.aps.iva.b0.z
            if (r0 == 0) goto L16
            r0 = r11
            com.amazon.aps.iva.b0.z r0 = (com.amazon.aps.iva.b0.z) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.m = r1
            goto L1b
        L16:
            com.amazon.aps.iva.b0.z r0 = new com.amazon.aps.iva.b0.z
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L7c
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            com.amazon.aps.iva.b0.g$d r8 = r0.j
            com.amazon.aps.iva.se0.g0 r9 = r0.i
            com.amazon.aps.iva.b0.w r10 = r0.h
            com.amazon.aps.iva.ab.x.i0(r11)
            r7 = r10
            r10 = r8
            r8 = r7
            goto L62
        L43:
            com.amazon.aps.iva.ab.x.i0(r11)
            com.amazon.aps.iva.c0.b r11 = r8.E
            if (r11 == 0) goto L64
            com.amazon.aps.iva.c0.l r2 = r8.u
            if (r2 == 0) goto L62
            com.amazon.aps.iva.c0.c r6 = new com.amazon.aps.iva.c0.c
            r6.<init>(r11)
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.m = r4
            java.lang.Object r11 = r2.b(r6, r0)
            if (r11 != r1) goto L62
            goto L7e
        L62:
            r8.E = r5
        L64:
            com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.se0.g0, ? super com.amazon.aps.iva.o2.o, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends java.lang.Object> r8 = r8.x
            long r10 = r10.a
            com.amazon.aps.iva.o2.o r2 = new com.amazon.aps.iva.o2.o
            r2.<init>(r10)
            r0.h = r5
            r0.i = r5
            r0.j = r5
            r0.m = r3
            java.lang.Object r8 = r8.invoke(r9, r2, r0)
            if (r8 != r1) goto L7c
            goto L7e
        L7c:
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.w.w1(com.amazon.aps.iva.b0.w, com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.b0.g$d, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void C0(com.amazon.aps.iva.p1.m mVar, com.amazon.aps.iva.p1.n nVar, long j) {
        com.amazon.aps.iva.yb0.j.f(nVar, "pass");
        this.C.C0(mVar, nVar, j);
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void G0() {
        this.C.G0();
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void n1() {
        x1();
    }

    public final void x1() {
        com.amazon.aps.iva.c0.b bVar = this.E;
        if (bVar != null) {
            com.amazon.aps.iva.c0.l lVar = this.u;
            if (lVar != null) {
                lVar.a(new com.amazon.aps.iva.c0.a(bVar));
            }
            this.E = null;
        }
    }
}
