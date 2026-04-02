package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.ob0.g;
/* compiled from: ActualAndroid.android.kt */
/* loaded from: classes.dex */
public final class w2 implements i1 {
    public static final w2 b = new w2();

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: ActualAndroid.android.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {52}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a<R> extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super R>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Long, R> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.xb0.l<? super Long, ? extends R> lVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = lVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, Object obj) {
            return ((a) create(g0Var, (com.amazon.aps.iva.ob0.d) obj)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                if (com.amazon.aps.iva.ab.t.l(16L, this) == aVar) {
                    return aVar;
                }
            }
            return this.i.invoke(new Long(System.nanoTime()));
        }
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final <R> R fold(R r, com.amazon.aps.iva.xb0.p<? super R, ? super g.b, ? extends R> pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "operation");
        return pVar.invoke(r, this);
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final <E extends g.b> E get(g.c<E> cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "key");
        return (E) g.b.a.a(this, cVar);
    }

    @Override // com.amazon.aps.iva.o0.i1
    public final <R> Object m0(com.amazon.aps.iva.xb0.l<? super Long, ? extends R> lVar, com.amazon.aps.iva.ob0.d<? super R> dVar) {
        com.amazon.aps.iva.ye0.c cVar = com.amazon.aps.iva.se0.r0.a;
        return com.amazon.aps.iva.se0.i.g(dVar, com.amazon.aps.iva.xe0.k.a, new a(lVar, null));
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final com.amazon.aps.iva.ob0.g minusKey(g.c<?> cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "key");
        return g.b.a.b(this, cVar);
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final com.amazon.aps.iva.ob0.g plus(com.amazon.aps.iva.ob0.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "context");
        return g.a.a(this, gVar);
    }
}
