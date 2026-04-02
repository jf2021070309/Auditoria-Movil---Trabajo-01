package i.a;

import i.a.g1;
import java.util.concurrent.CancellationException;
/* loaded from: classes2.dex */
public abstract class n0<T> extends i.a.k2.i {

    /* renamed from: c  reason: collision with root package name */
    public int f9153c;

    public n0(int i2) {
        this.f9153c = i2;
    }

    public void b(Object obj, Throwable th) {
    }

    public abstract h.m.d<T> c();

    public Throwable d(Object obj) {
        w wVar = obj instanceof w ? (w) obj : null;
        if (wVar == null) {
            return null;
        }
        return wVar.f9177b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object obj) {
        return obj;
    }

    public final void f(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            e.j.d.w.f(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        h.o.c.j.c(th);
        e.j.d.w.O(c().getContext(), new g0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        Object y;
        g1 g1Var;
        i.a.k2.j jVar = this.f9127b;
        try {
            i.a.i2.e eVar = (i.a.i2.e) c();
            h.m.d<T> dVar = eVar.f9062f;
            Object obj = eVar.f9064h;
            h.m.f context = dVar.getContext();
            Object b2 = i.a.i2.s.b(context, obj);
            c2<?> b3 = b2 != i.a.i2.s.a ? a0.b(dVar, context, b2) : null;
            h.m.f context2 = dVar.getContext();
            Object g2 = g();
            Throwable d2 = d(g2);
            if (d2 == null && e.j.d.w.T(this.f9153c)) {
                int i2 = g1.T;
                g1Var = (g1) context2.get(g1.a.a);
            } else {
                g1Var = null;
            }
            if (g1Var != null && !g1Var.a()) {
                CancellationException v = g1Var.v();
                b(g2, v);
                dVar.resumeWith(e.j.d.w.y(v));
            } else if (d2 != null) {
                dVar.resumeWith(e.j.d.w.y(d2));
            } else {
                dVar.resumeWith(e(g2));
            }
            Object obj2 = h.k.a;
            if (b3 == null || b3.g0()) {
                i.a.i2.s.a(context, b2);
            }
            try {
                jVar.r();
            } catch (Throwable th) {
                obj2 = e.j.d.w.y(th);
            }
            f(null, h.g.a(obj2));
        } catch (Throwable th2) {
            try {
                jVar.r();
                y = h.k.a;
            } catch (Throwable th3) {
                y = e.j.d.w.y(th3);
            }
            f(th2, h.g.a(y));
        }
    }
}
