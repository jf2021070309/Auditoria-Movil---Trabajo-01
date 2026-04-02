package i.a.i2;

import e.j.d.w;
import i.a.c0;
import i.a.n0;
import i.a.t0;
import i.a.x;
import i.a.y1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public final class e<T> extends n0<T> implements h.m.i.a.d, h.m.d<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9060d = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: e  reason: collision with root package name */
    public final c0 f9061e;

    /* renamed from: f  reason: collision with root package name */
    public final h.m.d<T> f9062f;

    /* renamed from: g  reason: collision with root package name */
    public Object f9063g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f9064h;

    /* JADX WARN: Multi-variable type inference failed */
    public e(c0 c0Var, h.m.d<? super T> dVar) {
        super(-1);
        this.f9061e = c0Var;
        this.f9062f = dVar;
        this.f9063g = f.a;
        Object fold = getContext().fold(0, s.f9081b);
        h.o.c.j.c(fold);
        this.f9064h = fold;
        this._reusableCancellableContinuation = null;
    }

    @Override // i.a.n0
    public void b(Object obj, Throwable th) {
        if (obj instanceof x) {
            ((x) obj).f9179b.invoke(th);
        }
    }

    @Override // i.a.n0
    public h.m.d<T> c() {
        return this;
    }

    @Override // i.a.n0
    public Object g() {
        Object obj = this.f9063g;
        this.f9063g = f.a;
        return obj;
    }

    @Override // h.m.i.a.d
    public h.m.i.a.d getCallerFrame() {
        h.m.d<T> dVar = this.f9062f;
        if (dVar instanceof h.m.i.a.d) {
            return (h.m.i.a.d) dVar;
        }
        return null;
    }

    @Override // h.m.d
    public h.m.f getContext() {
        return this.f9062f.getContext();
    }

    public final boolean h() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean i(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            q qVar = f.f9065b;
            if (h.o.c.j.a(obj, qVar)) {
                if (f9060d.compareAndSet(this, qVar, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f9060d.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void j() {
        do {
        } while (this._reusableCancellableContinuation == f.f9065b);
        Object obj = this._reusableCancellableContinuation;
        i.a.k kVar = obj instanceof i.a.k ? (i.a.k) obj : null;
        if (kVar == null) {
            return;
        }
        kVar.k();
    }

    public final Throwable k(i.a.j<?> jVar) {
        q qVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            qVar = f.f9065b;
            if (obj != qVar) {
                if (obj instanceof Throwable) {
                    if (f9060d.compareAndSet(this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(h.o.c.j.i("Inconsistent state ", obj).toString());
            }
        } while (!f9060d.compareAndSet(this, qVar, jVar));
        return null;
    }

    @Override // h.m.d
    public void resumeWith(Object obj) {
        h.m.f context = this.f9062f.getContext();
        Object I0 = w.I0(obj, null);
        if (this.f9061e.g0(context)) {
            this.f9063g = I0;
            this.f9153c = 0;
            this.f9061e.e0(context, this);
            return;
        }
        y1 y1Var = y1.a;
        t0 a = y1.a();
        if (a.l0()) {
            this.f9063g = I0;
            this.f9153c = 0;
            a.j0(this);
            return;
        }
        a.k0(true);
        try {
            h.m.f context2 = getContext();
            Object b2 = s.b(context2, this.f9064h);
            this.f9062f.resumeWith(obj);
            s.a(context2, b2);
            do {
            } while (a.m0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("DispatchedContinuation[");
        y.append(this.f9061e);
        y.append(", ");
        y.append(w.F0(this.f9062f));
        y.append(']');
        return y.toString();
    }
}
