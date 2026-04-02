package com.amazon.aps.iva.we0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.yb0.d0;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Merge.kt */
/* loaded from: classes4.dex */
public final class i<T, R> extends h<T, R> {
    public final com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.ve0.g<? super R>, T, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> f;

    /* compiled from: Merge.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {27}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ i<T, R> j;
        public final /* synthetic */ com.amazon.aps.iva.ve0.g<R> k;

        /* compiled from: Merge.kt */
        /* renamed from: com.amazon.aps.iva.we0.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0822a<T> implements com.amazon.aps.iva.ve0.g {
            public final /* synthetic */ d0<j1> b;
            public final /* synthetic */ g0 c;
            public final /* synthetic */ i<T, R> d;
            public final /* synthetic */ com.amazon.aps.iva.ve0.g<R> e;

            /* compiled from: Merge.kt */
            @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {34}, m = "invokeSuspend")
            /* renamed from: com.amazon.aps.iva.we0.i$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0823a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
                public int h;
                public final /* synthetic */ i<T, R> i;
                public final /* synthetic */ com.amazon.aps.iva.ve0.g<R> j;
                public final /* synthetic */ T k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0823a(i<T, R> iVar, com.amazon.aps.iva.ve0.g<? super R> gVar, T t, com.amazon.aps.iva.ob0.d<? super C0823a> dVar) {
                    super(2, dVar);
                    this.i = iVar;
                    this.j = gVar;
                    this.k = t;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                    return new C0823a(this.i, this.j, this.k, dVar);
                }

                @Override // com.amazon.aps.iva.xb0.p
                public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                    return ((C0823a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                    int i = this.h;
                    if (i != 0) {
                        if (i == 1) {
                            x.i0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        x.i0(obj);
                        this.h = 1;
                        if (this.i.f.invoke(this.j, this.k, this) == aVar) {
                            return aVar;
                        }
                    }
                    return com.amazon.aps.iva.kb0.q.a;
                }
            }

            /* compiled from: Merge.kt */
            @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {30}, m = "emit")
            /* renamed from: com.amazon.aps.iva.we0.i$a$a$b */
            /* loaded from: classes4.dex */
            public static final class b extends com.amazon.aps.iva.qb0.c {
                public C0822a h;
                public Object i;
                public j1 j;
                public /* synthetic */ Object k;
                public final /* synthetic */ C0822a<T> l;
                public int m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0822a<? super T> c0822a, com.amazon.aps.iva.ob0.d<? super b> dVar) {
                    super(dVar);
                    this.l = c0822a;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    this.k = obj;
                    this.m |= Integer.MIN_VALUE;
                    return this.l.a(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0822a(d0<j1> d0Var, g0 g0Var, i<T, R> iVar, com.amazon.aps.iva.ve0.g<? super R> gVar) {
                this.b = d0Var;
                this.c = g0Var;
                this.d = iVar;
                this.e = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
            @Override // com.amazon.aps.iva.ve0.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(T r8, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.amazon.aps.iva.we0.i.a.C0822a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.amazon.aps.iva.we0.i$a$a$b r0 = (com.amazon.aps.iva.we0.i.a.C0822a.b) r0
                    int r1 = r0.m
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.m = r1
                    goto L18
                L13:
                    com.amazon.aps.iva.we0.i$a$a$b r0 = new com.amazon.aps.iva.we0.i$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.k
                    com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                    int r2 = r0.m
                    r3 = 1
                    if (r2 == 0) goto L33
                    if (r2 != r3) goto L2b
                    java.lang.Object r8 = r0.i
                    com.amazon.aps.iva.we0.i$a$a r0 = r0.h
                    com.amazon.aps.iva.ab.x.i0(r9)
                    goto L56
                L2b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L33:
                    com.amazon.aps.iva.ab.x.i0(r9)
                    com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.se0.j1> r9 = r7.b
                    T r9 = r9.b
                    com.amazon.aps.iva.se0.j1 r9 = (com.amazon.aps.iva.se0.j1) r9
                    if (r9 == 0) goto L55
                    com.amazon.aps.iva.we0.j r2 = new com.amazon.aps.iva.we0.j
                    r2.<init>()
                    r9.a(r2)
                    r0.h = r7
                    r0.i = r8
                    r0.j = r9
                    r0.m = r3
                    java.lang.Object r9 = r9.N(r0)
                    if (r9 != r1) goto L55
                    return r1
                L55:
                    r0 = r7
                L56:
                    com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.se0.j1> r9 = r0.b
                    com.amazon.aps.iva.se0.h0 r1 = com.amazon.aps.iva.se0.h0.UNDISPATCHED
                    com.amazon.aps.iva.we0.i$a$a$a r2 = new com.amazon.aps.iva.we0.i$a$a$a
                    com.amazon.aps.iva.ve0.g<R> r4 = r0.e
                    com.amazon.aps.iva.we0.i<T, R> r5 = r0.d
                    r6 = 0
                    r2.<init>(r5, r4, r8, r6)
                    com.amazon.aps.iva.se0.g0 r8 = r0.c
                    com.amazon.aps.iva.se0.c2 r8 = com.amazon.aps.iva.se0.i.d(r8, r6, r1, r2, r3)
                    r9.b = r8
                    com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.we0.i.a.C0822a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i<T, R> iVar, com.amazon.aps.iva.ve0.g<? super R> gVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = iVar;
            this.k = gVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.j, this.k, dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                d0 d0Var = new d0();
                i<T, R> iVar = this.j;
                com.amazon.aps.iva.ve0.f<S> fVar = iVar.e;
                C0822a c0822a = new C0822a(d0Var, (g0) this.i, iVar, this.k);
                this.h = 1;
                if (fVar.c(c0822a, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.ve0.g<? super R>, ? super T, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> qVar, com.amazon.aps.iva.ve0.f<? extends T> fVar, com.amazon.aps.iva.ob0.g gVar, int i, com.amazon.aps.iva.ue0.e eVar) {
        super(i, gVar, eVar, fVar);
        this.f = qVar;
    }

    @Override // com.amazon.aps.iva.we0.f
    public final f<R> e(com.amazon.aps.iva.ob0.g gVar, int i, com.amazon.aps.iva.ue0.e eVar) {
        return new i(this.f, this.e, gVar, i, eVar);
    }

    @Override // com.amazon.aps.iva.we0.h
    public final Object i(com.amazon.aps.iva.ve0.g<? super R> gVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object p = z.p(new a(this, gVar, null), dVar);
        if (p == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return p;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
