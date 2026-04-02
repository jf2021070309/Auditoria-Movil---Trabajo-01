package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.b0.h;
/* compiled from: LongPressTextDragObserver.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.se0.j1>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ com.amazon.aps.iva.p1.f0 i;
    public final /* synthetic */ g1 j;

    /* compiled from: LongPressTextDragObserver.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {83}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.p1.f0 i;
        public final /* synthetic */ g1 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.p1.f0 f0Var, g1 g1Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = f0Var;
            this.j = g1Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                this.h = 1;
                Object b = com.amazon.aps.iva.b0.c0.b(this.i, new b1(this.j, null), this);
                if (b != obj2) {
                    b = com.amazon.aps.iva.kb0.q.a;
                }
                if (b == obj2) {
                    return obj2;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {86}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.p1.f0 i;
        public final /* synthetic */ g1 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.p1.f0 f0Var, g1 g1Var, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.i = f0Var;
            this.j = g1Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                this.h = 1;
                g1 g1Var = this.j;
                x0 x0Var = new x0(g1Var);
                y0 y0Var = new y0(g1Var);
                z0 z0Var = new z0(g1Var);
                a1 a1Var = new a1(g1Var);
                h.a aVar = com.amazon.aps.iva.b0.h.a;
                Object b = com.amazon.aps.iva.b0.c0.b(this.i, new com.amazon.aps.iva.b0.i(null, z0Var, y0Var, x0Var, a1Var), this);
                if (b != obj2) {
                    b = com.amazon.aps.iva.kb0.q.a;
                }
                if (b != obj2) {
                    b = com.amazon.aps.iva.kb0.q.a;
                }
                if (b == obj2) {
                    return obj2;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.amazon.aps.iva.p1.f0 f0Var, g1 g1Var, com.amazon.aps.iva.ob0.d<? super v0> dVar) {
        super(2, dVar);
        this.i = f0Var;
        this.j = g1Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        v0 v0Var = new v0(this.i, this.j, dVar);
        v0Var.h = obj;
        return v0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.se0.j1> dVar) {
        return ((v0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        com.amazon.aps.iva.se0.g0 g0Var = (com.amazon.aps.iva.se0.g0) this.h;
        com.amazon.aps.iva.se0.h0 h0Var = com.amazon.aps.iva.se0.h0.UNDISPATCHED;
        com.amazon.aps.iva.p1.f0 f0Var = this.i;
        g1 g1Var = this.j;
        com.amazon.aps.iva.se0.i.d(g0Var, null, h0Var, new a(f0Var, g1Var, null), 1);
        return com.amazon.aps.iva.se0.i.d(g0Var, null, h0Var, new b(f0Var, g1Var, null), 1);
    }
}
