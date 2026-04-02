package com.amazon.aps.iva.o0;

import android.view.Choreographer;
import com.amazon.aps.iva.ob0.g;
/* compiled from: ActualAndroid.android.kt */
/* loaded from: classes.dex */
public final class p0 implements i1 {
    public static final p0 b = new p0();
    public static final Choreographer c;

    /* compiled from: ActualAndroid.android.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super Choreographer>, Object> {
        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super Choreographer> dVar) {
            return new a(dVar).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            return Choreographer.getInstance();
        }
    }

    /* compiled from: ActualAndroid.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ Choreographer.FrameCallback h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(1);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
            p0.c.removeFrameCallback(this.h);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ActualAndroid.android.kt */
    /* loaded from: classes.dex */
    public static final class c implements Choreographer.FrameCallback {
        public final /* synthetic */ com.amazon.aps.iva.se0.m<R> b;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Long, R> c;

        public c(com.amazon.aps.iva.se0.n nVar, com.amazon.aps.iva.xb0.l lVar) {
            this.b = nVar;
            this.c = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object H;
            p0 p0Var = p0.b;
            try {
                H = this.c.invoke(Long.valueOf(j));
            } catch (Throwable th) {
                H = com.amazon.aps.iva.ab.x.H(th);
            }
            this.b.resumeWith(H);
        }
    }

    static {
        com.amazon.aps.iva.ye0.c cVar = com.amazon.aps.iva.se0.r0.a;
        c = (Choreographer) com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.xe0.k.a.C(), new a(null));
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
        com.amazon.aps.iva.se0.n nVar = new com.amazon.aps.iva.se0.n(1, com.amazon.aps.iva.a60.b.s(dVar));
        nVar.r();
        c cVar = new c(nVar, lVar);
        c.postFrameCallback(cVar);
        nVar.w(new b(cVar));
        Object q = nVar.q();
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        return q;
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
