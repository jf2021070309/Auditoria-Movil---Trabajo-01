package com.amazon.aps.iva.j0;

import com.google.android.gms.cast.MediaError;
/* compiled from: LongPressTextDragObserver.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {99, MediaError.DetailedErrorCode.MEDIA_NETWORK}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b1 extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public com.amazon.aps.iva.p1.y i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ g1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(g1 g1Var, com.amazon.aps.iva.ob0.d<? super b1> dVar) {
        super(dVar);
        this.l = g1Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        b1 b1Var = new b1(this.l, dVar);
        b1Var.k = obj;
        return b1Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.p1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((b1) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[EDGE_INSN: B:31:0x0086->B:28:0x0086 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0059 -> B:17:0x005c). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L2d
            if (r2 == r4) goto L23
            if (r2 != r3) goto L1b
            com.amazon.aps.iva.p1.y r2 = r0.i
            java.lang.Object r5 = r0.k
            com.amazon.aps.iva.p1.c r5 = (com.amazon.aps.iva.p1.c) r5
            com.amazon.aps.iva.ab.x.i0(r18)
            r7 = r18
            r6 = r0
            goto L5c
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L23:
            java.lang.Object r2 = r0.k
            com.amazon.aps.iva.p1.c r2 = (com.amazon.aps.iva.p1.c) r2
            com.amazon.aps.iva.ab.x.i0(r18)
            r5 = r18
            goto L40
        L2d:
            com.amazon.aps.iva.ab.x.i0(r18)
            java.lang.Object r2 = r0.k
            com.amazon.aps.iva.p1.c r2 = (com.amazon.aps.iva.p1.c) r2
            r0.k = r2
            r0.j = r4
            r5 = 3
            java.lang.Object r5 = com.amazon.aps.iva.b0.w0.c(r2, r0, r5)
            if (r5 != r1) goto L40
            return r1
        L40:
            com.amazon.aps.iva.p1.y r5 = (com.amazon.aps.iva.p1.y) r5
            long r6 = r5.c
            com.amazon.aps.iva.j0.g1 r6 = r0.l
            r6.a()
            r6 = r0
            r16 = r5
            r5 = r2
            r2 = r16
        L4f:
            r6.k = r5
            r6.i = r2
            r6.j = r3
            java.lang.Object r7 = com.amazon.aps.iva.p1.c.h1(r5, r6)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            com.amazon.aps.iva.p1.m r7 = (com.amazon.aps.iva.p1.m) r7
            java.util.List<com.amazon.aps.iva.p1.y> r7 = r7.a
            int r8 = r7.size()
            r9 = 0
            r10 = r9
        L66:
            if (r10 >= r8) goto L86
            java.lang.Object r11 = r7.get(r10)
            com.amazon.aps.iva.p1.y r11 = (com.amazon.aps.iva.p1.y) r11
            long r12 = r11.a
            long r14 = r2.a
            boolean r12 = com.amazon.aps.iva.p1.x.a(r12, r14)
            if (r12 == 0) goto L7e
            boolean r11 = r11.d
            if (r11 == 0) goto L7e
            r11 = r4
            goto L7f
        L7e:
            r11 = r9
        L7f:
            if (r11 == 0) goto L83
            r9 = r4
            goto L86
        L83:
            int r10 = r10 + 1
            goto L66
        L86:
            if (r9 != 0) goto L4f
            com.amazon.aps.iva.j0.g1 r1 = r6.l
            r1.c()
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.j0.b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
