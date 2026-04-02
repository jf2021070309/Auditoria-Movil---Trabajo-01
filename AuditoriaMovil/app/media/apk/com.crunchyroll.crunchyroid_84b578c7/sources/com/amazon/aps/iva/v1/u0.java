package com.amazon.aps.iva.v1;

import android.view.Choreographer;
import com.amazon.aps.iva.ob0.e;
import com.amazon.aps.iva.ob0.g;
/* compiled from: AndroidUiFrameClock.android.kt */
/* loaded from: classes.dex */
public final class u0 implements com.amazon.aps.iva.o0.i1 {
    public final Choreographer b;
    public final t0 c;

    /* compiled from: AndroidUiFrameClock.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ t0 h;
        public final /* synthetic */ Choreographer.FrameCallback i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t0 t0Var, c cVar) {
            super(1);
            this.h = t0Var;
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
            t0 t0Var = this.h;
            Choreographer.FrameCallback frameCallback = this.i;
            t0Var.getClass();
            com.amazon.aps.iva.yb0.j.f(frameCallback, "callback");
            synchronized (t0Var.e) {
                t0Var.g.remove(frameCallback);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidUiFrameClock.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ Choreographer.FrameCallback i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(1);
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
            u0.this.b.removeFrameCallback(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidUiFrameClock.android.kt */
    /* loaded from: classes.dex */
    public static final class c implements Choreographer.FrameCallback {
        public final /* synthetic */ com.amazon.aps.iva.se0.m<R> b;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Long, R> c;

        public c(com.amazon.aps.iva.se0.n nVar, u0 u0Var, com.amazon.aps.iva.xb0.l lVar) {
            this.b = nVar;
            this.c = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object H;
            try {
                H = this.c.invoke(Long.valueOf(j));
            } catch (Throwable th) {
                H = com.amazon.aps.iva.ab.x.H(th);
            }
            this.b.resumeWith(H);
        }
    }

    public u0(Choreographer choreographer, t0 t0Var) {
        this.b = choreographer;
        this.c = t0Var;
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
        t0 t0Var = this.c;
        if (t0Var == null) {
            g.b bVar = dVar.getContext().get(e.a.b);
            if (bVar instanceof t0) {
                t0Var = (t0) bVar;
            } else {
                t0Var = null;
            }
        }
        com.amazon.aps.iva.se0.n nVar = new com.amazon.aps.iva.se0.n(1, com.amazon.aps.iva.a60.b.s(dVar));
        nVar.r();
        c cVar = new c(nVar, this, lVar);
        if (t0Var != null && com.amazon.aps.iva.yb0.j.a(t0Var.c, this.b)) {
            synchronized (t0Var.e) {
                t0Var.g.add(cVar);
                if (!t0Var.j) {
                    t0Var.j = true;
                    t0Var.c.postFrameCallback(t0Var.k);
                }
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            nVar.w(new a(t0Var, cVar));
        } else {
            this.b.postFrameCallback(cVar);
            nVar.w(new b(cVar));
        }
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
