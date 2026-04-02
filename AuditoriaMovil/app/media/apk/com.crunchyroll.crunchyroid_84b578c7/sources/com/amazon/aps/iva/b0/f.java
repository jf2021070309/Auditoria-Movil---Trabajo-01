package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.a0.g1;
import com.amazon.aps.iva.a0.i1;
import com.amazon.aps.iva.a0.k1;
import com.amazon.aps.iva.o0.y1;
/* compiled from: ScrollableState.kt */
/* loaded from: classes.dex */
public final class f implements t0 {
    public final com.amazon.aps.iva.xb0.l<Float, Float> a;
    public final b b = new b();
    public final i1 c = new i1();
    public final y1 d = com.amazon.aps.iva.cq.b.c0(Boolean.FALSE);

    /* compiled from: ScrollableState.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {178}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ g1 j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<n0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> k;

        /* compiled from: ScrollableState.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {181}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.b0.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0124a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<n0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public /* synthetic */ Object i;
            public final /* synthetic */ f j;
            public final /* synthetic */ com.amazon.aps.iva.xb0.p<n0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0124a(f fVar, com.amazon.aps.iva.xb0.p<? super n0, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super C0124a> dVar) {
                super(2, dVar);
                this.j = fVar;
                this.k = pVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                C0124a c0124a = new C0124a(this.j, this.k, dVar);
                c0124a.i = obj;
                return c0124a;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(n0 n0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((C0124a) create(n0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.h;
                f fVar = this.j;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            com.amazon.aps.iva.ab.x.i0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        com.amazon.aps.iva.ab.x.i0(obj);
                        n0 n0Var = (n0) this.i;
                        fVar.d.setValue(Boolean.TRUE);
                        com.amazon.aps.iva.xb0.p<n0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> pVar = this.k;
                        this.h = 1;
                        if (pVar.invoke(n0Var, this) == aVar) {
                            return aVar;
                        }
                    }
                    fVar.d.setValue(Boolean.FALSE);
                    return com.amazon.aps.iva.kb0.q.a;
                } catch (Throwable th) {
                    fVar.d.setValue(Boolean.FALSE);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(g1 g1Var, com.amazon.aps.iva.xb0.p<? super n0, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = g1Var;
            this.k = pVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                f fVar = f.this;
                i1 i1Var = fVar.c;
                b bVar = fVar.b;
                g1 g1Var = this.j;
                C0124a c0124a = new C0124a(fVar, this.k, null);
                this.h = 1;
                i1Var.getClass();
                if (com.amazon.aps.iva.e.z.p(new k1(g1Var, i1Var, c0124a, bVar, null), this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ScrollableState.kt */
    /* loaded from: classes.dex */
    public static final class b implements n0 {
        public b() {
        }

        @Override // com.amazon.aps.iva.b0.n0
        public final float a(float f) {
            if (Float.isNaN(f)) {
                return 0.0f;
            }
            return f.this.a.invoke(Float.valueOf(f)).floatValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(com.amazon.aps.iva.xb0.l<? super Float, Float> lVar) {
        this.a = lVar;
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final boolean c() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final Object f(g1 g1Var, com.amazon.aps.iva.xb0.p<? super n0, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object p = com.amazon.aps.iva.e.z.p(new a(g1Var, pVar, null), dVar);
        if (p == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return p;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final float g(float f) {
        return this.a.invoke(Float.valueOf(f)).floatValue();
    }
}
