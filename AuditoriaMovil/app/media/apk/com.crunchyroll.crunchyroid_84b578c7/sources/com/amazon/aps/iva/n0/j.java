package com.amazon.aps.iva.n0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.z.k1;
import com.amazon.aps.iva.z.y;
/* compiled from: RippleAnimation.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super j1>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ i i;

    /* compiled from: RippleAnimation.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", l = {89}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ i i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = iVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, dVar);
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
                com.amazon.aps.iva.z.b<Float, com.amazon.aps.iva.z.m> bVar = this.i.g;
                Float f = new Float(1.0f);
                k1 d = com.amazon.aps.iva.z.k.d(75, 0, y.b, 2);
                this.h = 1;
                if (com.amazon.aps.iva.z.b.b(bVar, f, d, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: RippleAnimation.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", l = {95}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ i i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.i = iVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                com.amazon.aps.iva.z.b<Float, com.amazon.aps.iva.z.m> bVar = this.i.h;
                Float f = new Float(1.0f);
                k1 d = com.amazon.aps.iva.z.k.d(225, 0, y.a, 2);
                this.h = 1;
                if (com.amazon.aps.iva.z.b.b(bVar, f, d, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: RippleAnimation.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", l = {101}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ i i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i iVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
            this.i = iVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new c(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                com.amazon.aps.iva.z.b<Float, com.amazon.aps.iva.z.m> bVar = this.i.i;
                Float f = new Float(1.0f);
                k1 d = com.amazon.aps.iva.z.k.d(225, 0, y.b, 2);
                this.h = 1;
                if (com.amazon.aps.iva.z.b.b(bVar, f, d, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, com.amazon.aps.iva.ob0.d<? super j> dVar) {
        super(2, dVar);
        this.i = iVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        j jVar = new j(this.i, dVar);
        jVar.h = obj;
        return jVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super j1> dVar) {
        return ((j) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        g0 g0Var = (g0) this.h;
        i iVar = this.i;
        com.amazon.aps.iva.se0.i.d(g0Var, null, null, new a(iVar, null), 3);
        com.amazon.aps.iva.se0.i.d(g0Var, null, null, new b(iVar, null), 3);
        return com.amazon.aps.iva.se0.i.d(g0Var, null, null, new c(iVar, null), 3);
    }
}
