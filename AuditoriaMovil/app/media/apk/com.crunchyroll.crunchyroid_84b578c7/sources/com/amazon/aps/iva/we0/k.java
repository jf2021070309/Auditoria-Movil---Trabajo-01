package com.amazon.aps.iva.we0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.lb0.c0;
import com.amazon.aps.iva.se0.g0;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: Combine.kt */
@com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {57, 79, 82}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class k extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public com.amazon.aps.iva.ue0.f h;
    public byte[] i;
    public int j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ com.amazon.aps.iva.ve0.f<Object>[] n;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<Object[]> o;
    public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.ve0.g<Object>, Object[], com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> p;
    public final /* synthetic */ com.amazon.aps.iva.ve0.g<Object> q;

    /* compiled from: Combine.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {34}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.ve0.f<Object>[] i;
        public final /* synthetic */ int j;
        public final /* synthetic */ AtomicInteger k;
        public final /* synthetic */ com.amazon.aps.iva.ue0.f<c0<Object>> l;

        /* compiled from: Combine.kt */
        /* renamed from: com.amazon.aps.iva.we0.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0824a<T> implements com.amazon.aps.iva.ve0.g {
            public final /* synthetic */ com.amazon.aps.iva.ue0.f<c0<Object>> b;
            public final /* synthetic */ int c;

            /* compiled from: Combine.kt */
            @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {35, 36}, m = "emit")
            /* renamed from: com.amazon.aps.iva.we0.k$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0825a extends com.amazon.aps.iva.qb0.c {
                public /* synthetic */ Object h;
                public final /* synthetic */ C0824a<T> i;
                public int j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0825a(C0824a<? super T> c0824a, com.amazon.aps.iva.ob0.d<? super C0825a> dVar) {
                    super(dVar);
                    this.i = c0824a;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    this.h = obj;
                    this.j |= Integer.MIN_VALUE;
                    return this.i.a(null, this);
                }
            }

            public C0824a(com.amazon.aps.iva.ue0.f<c0<Object>> fVar, int i) {
                this.b = fVar;
                this.c = i;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
            @Override // com.amazon.aps.iva.ve0.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(T r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.amazon.aps.iva.we0.k.a.C0824a.C0825a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.amazon.aps.iva.we0.k$a$a$a r0 = (com.amazon.aps.iva.we0.k.a.C0824a.C0825a) r0
                    int r1 = r0.j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.j = r1
                    goto L18
                L13:
                    com.amazon.aps.iva.we0.k$a$a$a r0 = new com.amazon.aps.iva.we0.k$a$a$a
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.h
                    com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                    int r2 = r0.j
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L36
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    com.amazon.aps.iva.ab.x.i0(r7)
                    goto L54
                L2a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L32:
                    com.amazon.aps.iva.ab.x.i0(r7)
                    goto L4b
                L36:
                    com.amazon.aps.iva.ab.x.i0(r7)
                    com.amazon.aps.iva.lb0.c0 r7 = new com.amazon.aps.iva.lb0.c0
                    int r2 = r5.c
                    r7.<init>(r2, r6)
                    r0.j = r4
                    com.amazon.aps.iva.ue0.f<com.amazon.aps.iva.lb0.c0<java.lang.Object>> r6 = r5.b
                    java.lang.Object r6 = r6.g(r7, r0)
                    if (r6 != r1) goto L4b
                    return r1
                L4b:
                    r0.j = r3
                    java.lang.Object r6 = com.amazon.aps.iva.e4.l1.N(r0)
                    if (r6 != r1) goto L54
                    return r1
                L54:
                    com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.we0.k.a.C0824a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.ve0.f<Object>[] fVarArr, int i, AtomicInteger atomicInteger, com.amazon.aps.iva.ue0.f<c0<Object>> fVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = fVarArr;
            this.j = i;
            this.k = atomicInteger;
            this.l = fVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, this.j, this.k, this.l, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            AtomicInteger atomicInteger = this.k;
            com.amazon.aps.iva.ue0.f<c0<Object>> fVar = this.l;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    com.amazon.aps.iva.ve0.f<Object>[] fVarArr = this.i;
                    int i2 = this.j;
                    com.amazon.aps.iva.ve0.f<Object> fVar2 = fVarArr[i2];
                    C0824a c0824a = new C0824a(fVar, i2);
                    this.h = 1;
                    if (fVar2.c(c0824a, this) == aVar) {
                        return aVar;
                    }
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    fVar.r(null);
                }
                return com.amazon.aps.iva.kb0.q.a;
            } finally {
                if (atomicInteger.decrementAndGet() == 0) {
                    fVar.r(null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.amazon.aps.iva.ob0.d dVar, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.q qVar, com.amazon.aps.iva.ve0.g gVar, com.amazon.aps.iva.ve0.f[] fVarArr) {
        super(2, dVar);
        this.n = fVarArr;
        this.o = aVar;
        this.p = qVar;
        this.q = gVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        k kVar = new k(dVar, this.o, this.p, this.q, this.n);
        kVar.m = obj;
        return kVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((k) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5 A[LOOP:0: B:28:0x00c5->B:34:0x00e2, LOOP_START, PHI: r7 r10 
      PHI: (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:25:0x00c0, B:34:0x00e2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v4 com.amazon.aps.iva.lb0.c0) = (r10v3 com.amazon.aps.iva.lb0.c0), (r10v17 com.amazon.aps.iva.lb0.c0) binds: [B:25:0x00c0, B:34:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0109 -> B:45:0x0144). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0141 -> B:45:0x0144). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x014c -> B:45:0x0144). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.we0.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
