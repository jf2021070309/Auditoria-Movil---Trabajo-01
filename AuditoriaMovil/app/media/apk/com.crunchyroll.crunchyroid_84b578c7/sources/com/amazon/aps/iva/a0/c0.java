package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.a1.f;
/* compiled from: Focusable.kt */
/* loaded from: classes.dex */
public final class c0 extends f.c {
    public com.amazon.aps.iva.c0.l o;
    public com.amazon.aps.iva.c0.d p;

    /* compiled from: Focusable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1", f = "Focusable.kt", l = {310}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.c0.l i;
        public final /* synthetic */ com.amazon.aps.iva.c0.j j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.c0.l lVar, com.amazon.aps.iva.c0.j jVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = lVar;
            this.j = jVar;
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
                if (this.i.b(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public c0(com.amazon.aps.iva.c0.l lVar) {
        this.o = lVar;
    }

    public final void t1(com.amazon.aps.iva.c0.l lVar, com.amazon.aps.iva.c0.j jVar) {
        if (this.n) {
            com.amazon.aps.iva.se0.i.d(i1(), null, null, new a(lVar, jVar, null), 3);
        } else {
            lVar.a(jVar);
        }
    }
}
