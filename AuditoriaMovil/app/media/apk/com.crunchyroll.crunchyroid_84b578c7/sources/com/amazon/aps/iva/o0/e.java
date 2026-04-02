package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.ob0.g;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BroadcastFrameClock.kt */
/* loaded from: classes.dex */
public final class e implements i1 {
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> b;
    public Throwable d;
    public final Object c = new Object();
    public List<a<?>> e = new ArrayList();
    public List<a<?>> f = new ArrayList();

    /* compiled from: BroadcastFrameClock.kt */
    /* loaded from: classes.dex */
    public static final class a<R> {
        public final com.amazon.aps.iva.xb0.l<Long, R> a;
        public final com.amazon.aps.iva.ob0.d<R> b;

        public a(com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.se0.n nVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "onFrame");
            this.a = lVar;
            this.b = nVar;
        }
    }

    /* compiled from: BroadcastFrameClock.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<a<R>> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.yb0.d0<a<R>> d0Var) {
            super(1);
            this.i = d0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
            e eVar = e.this;
            Object obj = eVar.c;
            com.amazon.aps.iva.yb0.d0<a<R>> d0Var = this.i;
            synchronized (obj) {
                List<a<?>> list = eVar.e;
                T t = d0Var.b;
                if (t != 0) {
                    list.remove((a) t);
                } else {
                    com.amazon.aps.iva.yb0.j.m("awaiter");
                    throw null;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public e(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        this.b = aVar;
    }

    public final void b(long j) {
        synchronized (this.c) {
            List<a<?>> list = this.e;
            this.e = this.f;
            this.f = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a<?> aVar = list.get(i);
                aVar.getClass();
                aVar.b.resumeWith(aVar.a.invoke(Long.valueOf(j)));
            }
            list.clear();
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
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

    /* JADX WARN: Type inference failed for: r3v1, types: [com.amazon.aps.iva.o0.e$a, T] */
    @Override // com.amazon.aps.iva.o0.i1
    public final <R> Object m0(com.amazon.aps.iva.xb0.l<? super Long, ? extends R> lVar, com.amazon.aps.iva.ob0.d<? super R> dVar) {
        boolean z;
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar;
        com.amazon.aps.iva.se0.n nVar = new com.amazon.aps.iva.se0.n(1, com.amazon.aps.iva.a60.b.s(dVar));
        nVar.r();
        com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
        synchronized (this.c) {
            Throwable th = this.d;
            if (th != null) {
                nVar.resumeWith(com.amazon.aps.iva.ab.x.H(th));
            } else {
                d0Var.b = new a(lVar, nVar);
                if (!this.e.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                List<a<?>> list = this.e;
                T t = d0Var.b;
                if (t != 0) {
                    list.add((a) t);
                    boolean z2 = !z;
                    nVar.w(new b(d0Var));
                    if (z2 && (aVar = this.b) != null) {
                        try {
                            aVar.invoke();
                        } catch (Throwable th2) {
                            synchronized (this.c) {
                                if (this.d == null) {
                                    this.d = th2;
                                    List<a<?>> list2 = this.e;
                                    int size = list2.size();
                                    for (int i = 0; i < size; i++) {
                                        list2.get(i).b.resumeWith(com.amazon.aps.iva.ab.x.H(th2));
                                    }
                                    this.e.clear();
                                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                                }
                            }
                        }
                    }
                } else {
                    com.amazon.aps.iva.yb0.j.m("awaiter");
                    throw null;
                }
            }
        }
        Object q = nVar.q();
        com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
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
