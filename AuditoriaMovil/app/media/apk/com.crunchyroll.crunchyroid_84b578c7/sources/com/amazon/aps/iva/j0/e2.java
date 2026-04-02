package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.b0.w0;
import com.amazon.aps.iva.o0.p3;
import org.apache.commons.codec.binary.BaseNCodec;
/* compiled from: TextFieldPressGestureFilter.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e2 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.f0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.se0.g0 j;
    public final /* synthetic */ com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.c0.o> k;
    public final /* synthetic */ com.amazon.aps.iva.c0.l l;
    public final /* synthetic */ p3<com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q>> m;

    /* compiled from: TextFieldPressGestureFilter.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.b0.h0, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ com.amazon.aps.iva.b0.h0 i;
        public /* synthetic */ long j;
        public final /* synthetic */ com.amazon.aps.iva.se0.g0 k;
        public final /* synthetic */ com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.c0.o> l;
        public final /* synthetic */ com.amazon.aps.iva.c0.l m;

        /* compiled from: TextFieldPressGestureFilter.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {60, 64}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.j0.e2$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0391a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public Object h;
            public int i;
            public final /* synthetic */ com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.c0.o> j;
            public final /* synthetic */ long k;
            public final /* synthetic */ com.amazon.aps.iva.c0.l l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0391a(com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.c0.o> q1Var, long j, com.amazon.aps.iva.c0.l lVar, com.amazon.aps.iva.ob0.d<? super C0391a> dVar) {
                super(2, dVar);
                this.j = q1Var;
                this.k = j;
                this.l = lVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new C0391a(this.j, this.k, this.l, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((C0391a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
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
                    com.amazon.aps.iva.c0.l r2 = r8.l
                    r3 = 2
                    r4 = 1
                    com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.c0.o> r5 = r8.j
                    if (r1 == 0) goto L28
                    if (r1 == r4) goto L20
                    if (r1 != r3) goto L18
                    java.lang.Object r0 = r8.h
                    com.amazon.aps.iva.c0.o r0 = (com.amazon.aps.iva.c0.o) r0
                    com.amazon.aps.iva.ab.x.i0(r9)
                    goto L5f
                L18:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L20:
                    java.lang.Object r1 = r8.h
                    com.amazon.aps.iva.o0.q1 r1 = (com.amazon.aps.iva.o0.q1) r1
                    com.amazon.aps.iva.ab.x.i0(r9)
                    goto L46
                L28:
                    com.amazon.aps.iva.ab.x.i0(r9)
                    java.lang.Object r9 = r5.getValue()
                    com.amazon.aps.iva.c0.o r9 = (com.amazon.aps.iva.c0.o) r9
                    if (r9 == 0) goto L4a
                    com.amazon.aps.iva.c0.n r1 = new com.amazon.aps.iva.c0.n
                    r1.<init>(r9)
                    if (r2 == 0) goto L45
                    r8.h = r5
                    r8.i = r4
                    java.lang.Object r9 = r2.b(r1, r8)
                    if (r9 != r0) goto L45
                    return r0
                L45:
                    r1 = r5
                L46:
                    r9 = 0
                    r1.setValue(r9)
                L4a:
                    com.amazon.aps.iva.c0.o r9 = new com.amazon.aps.iva.c0.o
                    long r6 = r8.k
                    r9.<init>(r6)
                    if (r2 == 0) goto L60
                    r8.h = r9
                    r8.i = r3
                    java.lang.Object r1 = r2.b(r9, r8)
                    if (r1 != r0) goto L5e
                    return r0
                L5e:
                    r0 = r9
                L5f:
                    r9 = r0
                L60:
                    r5.setValue(r9)
                    com.amazon.aps.iva.kb0.q r9 = com.amazon.aps.iva.kb0.q.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.j0.e2.a.C0391a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: TextFieldPressGestureFilter.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", l = {BaseNCodec.MIME_CHUNK_SIZE}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public com.amazon.aps.iva.o0.q1 h;
            public int i;
            public final /* synthetic */ com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.c0.o> j;
            public final /* synthetic */ boolean k;
            public final /* synthetic */ com.amazon.aps.iva.c0.l l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.c0.o> q1Var, boolean z, com.amazon.aps.iva.c0.l lVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
                super(2, dVar);
                this.j = q1Var;
                this.k = z;
                this.l = lVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new b(this.j, this.k, this.l, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.c0.o> q1Var;
                com.amazon.aps.iva.c0.j nVar;
                com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.c0.o> q1Var2;
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.i;
                if (i != 0) {
                    if (i == 1) {
                        q1Var2 = this.h;
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    q1Var = this.j;
                    com.amazon.aps.iva.c0.o value = q1Var.getValue();
                    if (value != null) {
                        if (this.k) {
                            nVar = new com.amazon.aps.iva.c0.p(value);
                        } else {
                            nVar = new com.amazon.aps.iva.c0.n(value);
                        }
                        com.amazon.aps.iva.c0.l lVar = this.l;
                        if (lVar != null) {
                            this.h = q1Var;
                            this.i = 1;
                            if (lVar.b(nVar, this) == aVar) {
                                return aVar;
                            }
                            q1Var2 = q1Var;
                        }
                        q1Var.setValue(null);
                    }
                    return com.amazon.aps.iva.kb0.q.a;
                }
                q1Var = q1Var2;
                q1Var.setValue(null);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.c0.o> q1Var, com.amazon.aps.iva.c0.l lVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(3, dVar);
            this.k = g0Var;
            this.l = q1Var;
            this.m = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final Object invoke(com.amazon.aps.iva.b0.h0 h0Var, com.amazon.aps.iva.e1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            long j = cVar.a;
            a aVar = new a(this.k, this.l, this.m, dVar);
            aVar.i = h0Var;
            aVar.j = j;
            return aVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            com.amazon.aps.iva.se0.g0 g0Var = this.k;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.b0.h0 h0Var = this.i;
                com.amazon.aps.iva.se0.i.d(g0Var, null, null, new C0391a(this.l, this.j, this.m, null), 3);
                this.h = 1;
                obj = h0Var.S0(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            com.amazon.aps.iva.se0.i.d(g0Var, null, null, new b(this.l, ((Boolean) obj).booleanValue(), this.m, null), 3);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: TextFieldPressGestureFilter.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ p3<com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q>> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(p3<? extends com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q>> p3Var) {
            super(1);
            this.h = p3Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e1.c cVar) {
            this.h.getValue().invoke(new com.amazon.aps.iva.e1.c(cVar.a));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e2(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.c0.o> q1Var, com.amazon.aps.iva.c0.l lVar, p3<? extends com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q>> p3Var, com.amazon.aps.iva.ob0.d<? super e2> dVar) {
        super(2, dVar);
        this.j = g0Var;
        this.k = q1Var;
        this.l = lVar;
        this.m = p3Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        e2 e2Var = new e2(this.j, this.k, this.l, this.m, dVar);
        e2Var.i = obj;
        return e2Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.p1.f0 f0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((e2) create(f0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
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
            a aVar = new a(this.j, this.k, this.l, null);
            b bVar = new b(this.m);
            this.h = 1;
            w0.a aVar2 = com.amazon.aps.iva.b0.w0.a;
            Object p = com.amazon.aps.iva.e.z.p(new com.amazon.aps.iva.b0.z0(f0Var, aVar, bVar, new com.amazon.aps.iva.b0.i0(f0Var), null), this);
            if (p != obj2) {
                p = com.amazon.aps.iva.kb0.q.a;
            }
            if (p == obj2) {
                return obj2;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
