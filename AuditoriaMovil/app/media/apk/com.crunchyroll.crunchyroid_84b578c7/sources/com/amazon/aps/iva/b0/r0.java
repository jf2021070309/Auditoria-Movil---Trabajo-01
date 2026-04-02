package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
/* compiled from: Scrollable.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.o2.o, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public /* synthetic */ long h;
    public final /* synthetic */ q1<com.amazon.aps.iva.o1.b> i;
    public final /* synthetic */ p3<v0> j;

    /* compiled from: Scrollable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1", f = "Scrollable.kt", l = {286}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ p3<v0> i;
        public final /* synthetic */ long j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p3<v0> p3Var, long j, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = p3Var;
            this.j = j;
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
                this.h = 1;
                if (this.i.getValue().c(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(q1<com.amazon.aps.iva.o1.b> q1Var, p3<v0> p3Var, com.amazon.aps.iva.ob0.d<? super r0> dVar) {
        super(3, dVar);
        this.i = q1Var;
        this.j = p3Var;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.o2.o oVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        long j = oVar.a;
        r0 r0Var = new r0(this.i, this.j, dVar);
        r0Var.h = j;
        return r0Var.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        com.amazon.aps.iva.se0.i.d(this.i.getValue().d(), null, null, new a(this.j, this.h, null), 3);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
