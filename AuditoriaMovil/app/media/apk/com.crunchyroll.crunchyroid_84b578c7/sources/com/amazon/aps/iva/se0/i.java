package com.amazon.aps.iva.se0;

import com.amazon.aps.iva.ob0.e;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.CoroutineExceptionHandler;
/* loaded from: classes4.dex */
public final class i {
    public static e2 a() {
        return new e2(null);
    }

    public static n0 b(g0 g0Var, com.amazon.aps.iva.ob0.g gVar, h0 h0Var, com.amazon.aps.iva.xb0.p pVar, int i) {
        n0 n0Var;
        if ((i & 1) != 0) {
            gVar = com.amazon.aps.iva.ob0.h.b;
        }
        if ((i & 2) != 0) {
            h0Var = h0.DEFAULT;
        }
        com.amazon.aps.iva.ob0.g b = b0.b(g0Var, gVar);
        if (h0Var.isLazy()) {
            n0Var = new r1(b, pVar);
        } else {
            n0Var = new n0(b, true);
        }
        h0Var.invoke(pVar, n0Var, n0Var);
        return n0Var;
    }

    public static final void c(com.amazon.aps.iva.ob0.g gVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) gVar.get(CoroutineExceptionHandler.a.b);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(gVar, th);
            } else {
                e0.a(gVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                com.amazon.aps.iva.aq.k.f(runtimeException, th);
                th = runtimeException;
            }
            e0.a(gVar, th);
        }
    }

    public static c2 d(g0 g0Var, com.amazon.aps.iva.ob0.g gVar, h0 h0Var, com.amazon.aps.iva.xb0.p pVar, int i) {
        c2 c2Var;
        if ((i & 1) != 0) {
            gVar = com.amazon.aps.iva.ob0.h.b;
        }
        if ((i & 2) != 0) {
            h0Var = h0.DEFAULT;
        }
        com.amazon.aps.iva.ob0.g b = b0.b(g0Var, gVar);
        if (h0Var.isLazy()) {
            c2Var = new s1(b, pVar);
        } else {
            c2Var = new c2(b, true);
        }
        h0Var.invoke(pVar, c2Var, c2Var);
        return c2Var;
    }

    public static final Object e(com.amazon.aps.iva.ob0.g gVar, com.amazon.aps.iva.xb0.p pVar) throws InterruptedException {
        x0 x0Var;
        com.amazon.aps.iva.ob0.g a;
        long j;
        w wVar;
        Thread currentThread = Thread.currentThread();
        e.a aVar = e.a.b;
        com.amazon.aps.iva.ob0.e eVar = (com.amazon.aps.iva.ob0.e) gVar.get(aVar);
        com.amazon.aps.iva.ob0.h hVar = com.amazon.aps.iva.ob0.h.b;
        if (eVar == null) {
            x0Var = g2.a();
            a = b0.a(hVar, gVar.plus(x0Var), true);
            com.amazon.aps.iva.ye0.c cVar = r0.a;
            if (a != cVar && a.get(aVar) == null) {
                a = a.plus(cVar);
            }
        } else {
            if (eVar instanceof x0) {
                x0 x0Var2 = (x0) eVar;
            }
            x0Var = g2.a.get();
            a = b0.a(hVar, gVar, true);
            com.amazon.aps.iva.ye0.c cVar2 = r0.a;
            if (a != cVar2 && a.get(aVar) == null) {
                a = a.plus(cVar2);
            }
        }
        g gVar2 = new g(a, currentThread, x0Var);
        h0.DEFAULT.invoke(pVar, gVar2, gVar2);
        x0 x0Var3 = gVar2.e;
        if (x0Var3 != null) {
            int i = x0.f;
            x0Var3.M(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (x0Var3 != null) {
                    j = x0Var3.Z();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (!gVar2.c()) {
                    LockSupport.parkNanos(gVar2, j);
                } else {
                    Object w = com.amazon.aps.iva.ab.t.w(gVar2.b0());
                    if (w instanceof w) {
                        wVar = (w) w;
                    } else {
                        wVar = null;
                    }
                    if (wVar == null) {
                        return w;
                    }
                    throw wVar.a;
                }
            } finally {
                if (x0Var3 != null) {
                    int i2 = x0.f;
                    x0Var3.C(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        gVar2.D(interruptedException);
        throw interruptedException;
    }

    public static final Object g(com.amazon.aps.iva.ob0.d dVar, com.amazon.aps.iva.ob0.g gVar, com.amazon.aps.iva.xb0.p pVar) {
        com.amazon.aps.iva.ob0.g a;
        Object y0;
        com.amazon.aps.iva.ob0.g context = dVar.getContext();
        if (!((Boolean) gVar.fold(Boolean.FALSE, c0.h)).booleanValue()) {
            a = context.plus(gVar);
        } else {
            a = b0.a(context, gVar, false);
        }
        com.amazon.aps.iva.a60.b.p(a);
        if (a == context) {
            com.amazon.aps.iva.xe0.p pVar2 = new com.amazon.aps.iva.xe0.p(dVar, a);
            y0 = com.amazon.aps.iva.ab.t.u(pVar2, pVar2, pVar);
        } else {
            e.a aVar = e.a.b;
            if (com.amazon.aps.iva.yb0.j.a(a.get(aVar), context.get(aVar))) {
                l2 l2Var = new l2(dVar, a);
                Object c = com.amazon.aps.iva.xe0.u.c(a, null);
                try {
                    Object u = com.amazon.aps.iva.ab.t.u(l2Var, l2Var, pVar);
                    com.amazon.aps.iva.xe0.u.a(a, c);
                    y0 = u;
                } catch (Throwable th) {
                    com.amazon.aps.iva.xe0.u.a(a, c);
                    throw th;
                }
            } else {
                p0 p0Var = new p0(dVar, a);
                try {
                    com.amazon.aps.iva.cq.b.j0(com.amazon.aps.iva.kb0.q.a, com.amazon.aps.iva.a60.b.s(com.amazon.aps.iva.a60.b.o(pVar, p0Var, p0Var)), null);
                    y0 = p0Var.y0();
                } catch (Throwable th2) {
                    p0Var.resumeWith(com.amazon.aps.iva.ab.x.H(th2));
                    throw th2;
                }
            }
        }
        com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        return y0;
    }
}
