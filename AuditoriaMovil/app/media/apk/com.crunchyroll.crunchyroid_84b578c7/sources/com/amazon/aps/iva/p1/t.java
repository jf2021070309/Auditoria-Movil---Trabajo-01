package com.amazon.aps.iva.p1;

import com.google.android.gms.cast.MediaError;
/* compiled from: PointerIcon.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1", f = "PointerIcon.kt", l = {MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<f0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ v j;

    /* compiled from: PointerIcon.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1$1", f = "PointerIcon.kt", l = {112}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int i;
        public /* synthetic */ Object j;
        public final /* synthetic */ v k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
            this.k = vVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.k, dVar);
            aVar.j = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:13:0x0037). Please submit an issue!!! */
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
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r8.j
                com.amazon.aps.iva.p1.c r1 = (com.amazon.aps.iva.p1.c) r1
                com.amazon.aps.iva.ab.x.i0(r9)
                r3 = r1
                r1 = r0
                r0 = r8
                goto L37
            L14:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                com.amazon.aps.iva.ab.x.i0(r9)
                java.lang.Object r9 = r8.j
                com.amazon.aps.iva.p1.c r9 = (com.amazon.aps.iva.p1.c) r9
                r1 = r9
                r9 = r8
            L25:
                com.amazon.aps.iva.p1.n r3 = com.amazon.aps.iva.p1.n.Main
                r9.j = r1
                r9.i = r2
                java.lang.Object r3 = r1.G(r3, r9)
                if (r3 != r0) goto L32
                return r0
            L32:
                r7 = r0
                r0 = r9
                r9 = r3
                r3 = r1
                r1 = r7
            L37:
                com.amazon.aps.iva.p1.m r9 = (com.amazon.aps.iva.p1.m) r9
                int r9 = r9.c
                r4 = 4
                r5 = 0
                if (r9 != r4) goto L41
                r4 = r2
                goto L42
            L41:
                r4 = r5
            L42:
                com.amazon.aps.iva.p1.v r6 = r0.k
                if (r4 == 0) goto L5d
                r6.h = r2
                boolean r9 = r6.g
                if (r9 != 0) goto L7b
                com.amazon.aps.iva.p1.v r9 = r6.l()
                if (r9 == 0) goto L55
                r9.x()
            L55:
                com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.p1.p, com.amazon.aps.iva.kb0.q> r9 = r6.e
                com.amazon.aps.iva.p1.p r4 = r6.c
                r9.invoke(r4)
                goto L7b
            L5d:
                r4 = 5
                if (r9 != r4) goto L62
                r9 = r2
                goto L63
            L62:
                r9 = r5
            L63:
                if (r9 == 0) goto L7b
                com.amazon.aps.iva.p1.v r9 = r6.l()
                boolean r4 = r6.h
                if (r4 == 0) goto L79
                if (r9 != 0) goto L76
                com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.p1.p, com.amazon.aps.iva.kb0.q> r9 = r6.e
                r4 = 0
                r9.invoke(r4)
                goto L79
            L76:
                r9.y()
            L79:
                r6.h = r5
            L7b:
                r9 = r0
                r0 = r1
                r1 = r3
                goto L25
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p1.t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, com.amazon.aps.iva.ob0.d<? super t> dVar) {
        super(2, dVar);
        this.j = vVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        t tVar = new t(this.j, dVar);
        tVar.i = obj;
        return tVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(f0 f0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((t) create(f0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            a aVar2 = new a(this.j, null);
            this.h = 1;
            if (((f0) this.i).X(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
