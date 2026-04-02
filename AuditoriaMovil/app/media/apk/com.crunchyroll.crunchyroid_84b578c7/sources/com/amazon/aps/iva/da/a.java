package com.amazon.aps.iva.da;

import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.se0.g0;
/* compiled from: animateLottieCompositionAsState.kt */
@com.amazon.aps.iva.qb0.e(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", l = {73, 78}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ b k;
    public final /* synthetic */ com.amazon.aps.iva.z9.h l;
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ float o;
    public final /* synthetic */ j p;
    public final /* synthetic */ i q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ q1<Boolean> s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z, boolean z2, b bVar, com.amazon.aps.iva.z9.h hVar, int i, boolean z3, float f, j jVar, i iVar, boolean z4, q1<Boolean> q1Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
        super(2, dVar);
        this.i = z;
        this.j = z2;
        this.k = bVar;
        this.l = hVar;
        this.m = i;
        this.n = z3;
        this.o = f;
        this.p = jVar;
        this.q = iVar;
        this.r = z4;
        this.s = q1Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new a(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[RETURN] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r14.h
            com.amazon.aps.iva.da.b r8 = r14.k
            com.amazon.aps.iva.o0.q1<java.lang.Boolean> r9 = r14.s
            r10 = 2
            boolean r11 = r14.i
            r2 = 1
            if (r1 == 0) goto L24
            if (r1 == r2) goto L1f
            if (r1 != r10) goto L17
            com.amazon.aps.iva.ab.x.i0(r15)
            goto Lb6
        L17:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1f:
            com.amazon.aps.iva.ab.x.i0(r15)
            goto L87
        L24:
            com.amazon.aps.iva.ab.x.i0(r15)
            if (r11 == 0) goto L87
            java.lang.Object r15 = r9.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L87
            boolean r15 = r14.j
            if (r15 == 0) goto L87
            r14.h = r2
            com.amazon.aps.iva.z9.h r15 = r8.u()
            com.amazon.aps.iva.da.j r1 = r8.v()
            float r3 = r8.o()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L4f
            if (r15 != 0) goto L4f
            goto L56
        L4f:
            if (r15 != 0) goto L52
            goto L67
        L52:
            if (r3 >= 0) goto L5f
            if (r1 != 0) goto L5a
        L56:
            r15 = 1065353216(0x3f800000, float:1.0)
        L58:
            r4 = r15
            goto L67
        L5a:
            float r15 = r1.a()
            goto L58
        L5f:
            if (r1 != 0) goto L62
            goto L67
        L62:
            float r15 = r1.b()
            goto L58
        L67:
            com.amazon.aps.iva.z9.h r3 = r8.u()
            r5 = 1
            float r15 = r8.a()
            int r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r15 != 0) goto L76
            r15 = r2
            goto L77
        L76:
            r15 = 0
        L77:
            r6 = r15 ^ 1
            r2 = r8
            r7 = r14
            java.lang.Object r15 = r2.h(r3, r4, r5, r6, r7)
            if (r15 != r0) goto L82
            goto L84
        L82:
            com.amazon.aps.iva.kb0.q r15 = com.amazon.aps.iva.kb0.q.a
        L84:
            if (r15 != r0) goto L87
            return r0
        L87:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r11)
            r9.setValue(r15)
            if (r11 != 0) goto L93
            com.amazon.aps.iva.kb0.q r15 = com.amazon.aps.iva.kb0.q.a
            return r15
        L93:
            com.amazon.aps.iva.z9.h r3 = r14.l
            int r5 = r14.m
            boolean r6 = r14.n
            float r7 = r14.o
            com.amazon.aps.iva.da.j r15 = r14.p
            float r9 = r8.a()
            com.amazon.aps.iva.da.i r11 = r14.q
            boolean r12 = r14.r
            r14.h = r10
            int r4 = r8.s()
            r10 = 0
            r2 = r8
            r8 = r15
            r13 = r14
            java.lang.Object r15 = r2.r(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r15 != r0) goto Lb6
            return r0
        Lb6:
            com.amazon.aps.iva.kb0.q r15 = com.amazon.aps.iva.kb0.q.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.da.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
