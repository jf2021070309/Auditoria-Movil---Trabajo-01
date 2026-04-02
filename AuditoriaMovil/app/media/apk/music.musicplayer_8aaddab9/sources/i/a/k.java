package i.a;

import ch.qos.logback.core.CoreConstants;
import i.a.g1;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public class k<T> extends n0<T> implements j<T>, h.m.i.a.d {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9091d = AtomicIntegerFieldUpdater.newUpdater(k.class, "_decision");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9092e = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: f  reason: collision with root package name */
    public final h.m.d<T> f9093f;

    /* renamed from: g  reason: collision with root package name */
    public final h.m.f f9094g;

    /* renamed from: h  reason: collision with root package name */
    public p0 f9095h;

    /* JADX WARN: Multi-variable type inference failed */
    public k(h.m.d<? super T> dVar, int i2) {
        super(i2);
        this.f9093f = dVar;
        this.f9094g = dVar.getContext();
        this._decision = 0;
        this._state = d.a;
    }

    public static void y(k kVar, Object obj, int i2, h.o.b.l lVar, int i3, Object obj2) {
        Object obj3;
        int i4 = i3 & 4;
        do {
            obj3 = kVar._state;
            if (!(obj3 instanceof s1)) {
                if (obj3 instanceof m) {
                    m mVar = (m) obj3;
                    Objects.requireNonNull(mVar);
                    if (m.f9144c.compareAndSet(mVar, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(h.o.c.j.i("Already resumed, but proposed with update ", obj).toString());
            }
        } while (!f9092e.compareAndSet(kVar, obj3, kVar.z((s1) obj3, obj, i2, null, null)));
        kVar.l();
        kVar.m(i2);
    }

    @Override // i.a.j
    public Object B(Throwable th) {
        Object obj;
        w wVar = new w(th, false, 2);
        do {
            obj = this._state;
            if (!(obj instanceof s1)) {
                boolean z = obj instanceof v;
                return null;
            }
        } while (!f9092e.compareAndSet(this, obj, z((s1) obj, wVar, this.f9153c, null, null)));
        l();
        return l.a;
    }

    @Override // i.a.j
    public void G(c0 c0Var, T t) {
        h.m.d<T> dVar = this.f9093f;
        i.a.i2.e eVar = dVar instanceof i.a.i2.e ? (i.a.i2.e) dVar : null;
        y(this, t, (eVar != null ? eVar.f9061e : null) == c0Var ? 4 : this.f9153c, null, 4, null);
    }

    @Override // i.a.j
    public boolean P(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof s1)) {
                return false;
            }
            z = obj instanceof h;
        } while (!f9092e.compareAndSet(this, obj, new m(this, th, z)));
        h hVar = z ? (h) obj : null;
        if (hVar != null) {
            i(hVar, th);
        }
        l();
        m(this.f9153c);
        return true;
    }

    @Override // i.a.j
    public boolean a() {
        return this._state instanceof s1;
    }

    @Override // i.a.n0
    public void b(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof s1) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof w) {
                return;
            }
            if (obj2 instanceof v) {
                v vVar = (v) obj2;
                if (!(!(vVar.f9176e != null))) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (f9092e.compareAndSet(this, obj2, v.a(vVar, null, null, null, null, th, 15))) {
                    h hVar = vVar.f9173b;
                    if (hVar != null) {
                        i(hVar, th);
                    }
                    h.o.b.l<Throwable, h.k> lVar = vVar.f9174c;
                    if (lVar == null) {
                        return;
                    }
                    j(lVar, th);
                    return;
                }
            } else if (f9092e.compareAndSet(this, obj2, new v(obj2, null, null, null, th, 14))) {
                return;
            }
        }
    }

    @Override // i.a.j
    public void b0(Object obj) {
        m(this.f9153c);
    }

    @Override // i.a.n0
    public final h.m.d<T> c() {
        return this.f9093f;
    }

    @Override // i.a.n0
    public Throwable d(Object obj) {
        Throwable d2 = super.d(obj);
        if (d2 == null) {
            return null;
        }
        return d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i.a.n0
    public <T> T e(Object obj) {
        return obj instanceof v ? (T) ((v) obj).a : obj;
    }

    @Override // i.a.n0
    public Object g() {
        return this._state;
    }

    @Override // h.m.i.a.d
    public h.m.i.a.d getCallerFrame() {
        h.m.d<T> dVar = this.f9093f;
        if (dVar instanceof h.m.i.a.d) {
            return (h.m.i.a.d) dVar;
        }
        return null;
    }

    @Override // h.m.d
    public h.m.f getContext() {
        return this.f9094g;
    }

    public final void h(h.o.b.l<? super Throwable, h.k> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            e.j.d.w.O(this.f9094g, new z(h.o.c.j.i("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void i(h hVar, Throwable th) {
        try {
            hVar.a(th);
        } catch (Throwable th2) {
            e.j.d.w.O(this.f9094g, new z(h.o.c.j.i("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void j(h.o.b.l<? super Throwable, h.k> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            e.j.d.w.O(this.f9094g, new z(h.o.c.j.i("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    public final void k() {
        p0 p0Var = this.f9095h;
        if (p0Var == null) {
            return;
        }
        p0Var.dispose();
        this.f9095h = r1.a;
    }

    public final void l() {
        if (u()) {
            return;
        }
        k();
    }

    /* JADX WARN: Finally extract failed */
    public final void m(int i2) {
        boolean z;
        while (true) {
            int i3 = this._decision;
            if (i3 == 0) {
                if (f9091d.compareAndSet(this, 0, 2)) {
                    z = true;
                    break;
                }
            } else if (i3 != 1) {
                throw new IllegalStateException("Already resumed".toString());
            } else {
                z = false;
            }
        }
        if (z) {
            return;
        }
        h.m.d<T> c2 = c();
        boolean z2 = i2 == 4;
        if (z2 || !(c2 instanceof i.a.i2.e) || e.j.d.w.T(i2) != e.j.d.w.T(this.f9153c)) {
            e.j.d.w.l0(this, c2, z2);
            return;
        }
        c0 c0Var = ((i.a.i2.e) c2).f9061e;
        h.m.f context = c2.getContext();
        if (c0Var.g0(context)) {
            c0Var.e0(context, this);
            return;
        }
        y1 y1Var = y1.a;
        t0 a = y1.a();
        if (a.l0()) {
            a.j0(this);
            return;
        }
        a.k0(true);
        try {
            e.j.d.w.l0(this, c(), true);
            do {
            } while (a.m0());
        } catch (Throwable th) {
            try {
                f(th, null);
            } finally {
                a.h0(true);
            }
        }
    }

    public Throwable n(g1 g1Var) {
        return ((l1) g1Var).v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r2 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r4.f9095h != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r0 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
        return h.m.h.a.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r0 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
        x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
        r0 = r4._state;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
        if ((r0 instanceof i.a.w) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
        throw ((i.a.w) r0).f9177b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (e.j.d.w.T(r4.f9153c) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        r1 = r4.f9094g;
        r2 = i.a.g1.T;
        r1 = (i.a.g1) r1.get(i.a.g1.a.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
        if (r1.a() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
        r1 = r1.v();
        b(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
        return e(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o() {
        /*
            r4 = this;
            boolean r0 = r4.u()
        L4:
            int r1 = r4._decision
            r2 = 0
            if (r1 == 0) goto L19
            r3 = 2
            if (r1 != r3) goto Ld
            goto L23
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L19:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = i.a.k.f9091d
            r3 = 1
            boolean r1 = r1.compareAndSet(r4, r2, r3)
            if (r1 == 0) goto L4
            r2 = 1
        L23:
            if (r2 == 0) goto L34
            i.a.p0 r1 = r4.f9095h
            if (r1 != 0) goto L2c
            r4.q()
        L2c:
            if (r0 == 0) goto L31
            r4.x()
        L31:
            h.m.h.a r0 = h.m.h.a.COROUTINE_SUSPENDED
            return r0
        L34:
            if (r0 == 0) goto L39
            r4.x()
        L39:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof i.a.w
            if (r1 == 0) goto L44
            i.a.w r0 = (i.a.w) r0
            java.lang.Throwable r0 = r0.f9177b
            throw r0
        L44:
            int r1 = r4.f9153c
            boolean r1 = e.j.d.w.T(r1)
            if (r1 == 0) goto L68
            h.m.f r1 = r4.f9094g
            int r2 = i.a.g1.T
            i.a.g1$a r2 = i.a.g1.a.a
            h.m.f$a r1 = r1.get(r2)
            i.a.g1 r1 = (i.a.g1) r1
            if (r1 == 0) goto L68
            boolean r2 = r1.a()
            if (r2 != 0) goto L68
            java.util.concurrent.CancellationException r1 = r1.v()
            r4.b(r0, r1)
            throw r1
        L68:
            java.lang.Object r0 = r4.e(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.k.o():java.lang.Object");
    }

    public void p() {
        p0 q = q();
        if (q != null && (!(this._state instanceof s1))) {
            q.dispose();
            this.f9095h = r1.a;
        }
    }

    public final p0 q() {
        h.m.f fVar = this.f9094g;
        int i2 = g1.T;
        g1 g1Var = (g1) fVar.get(g1.a.a);
        if (g1Var == null) {
            return null;
        }
        p0 Q = e.j.d.w.Q(g1Var, true, false, new n(this), 2, null);
        this.f9095h = Q;
        return Q;
    }

    public void r(h.o.b.l<? super Throwable, h.k> lVar) {
        h d1Var = lVar instanceof h ? (h) lVar : new d1(lVar);
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof d)) {
                if (obj instanceof h) {
                    v(lVar, obj);
                    throw null;
                }
                boolean z = obj instanceof w;
                if (z) {
                    w wVar = (w) obj;
                    Objects.requireNonNull(wVar);
                    if (!w.a.compareAndSet(wVar, 0, 1)) {
                        v(lVar, obj);
                        throw null;
                    } else if (obj instanceof m) {
                        if (!z) {
                            wVar = null;
                        }
                        h(lVar, wVar != null ? wVar.f9177b : null);
                        return;
                    } else {
                        return;
                    }
                } else if (obj instanceof v) {
                    v vVar = (v) obj;
                    if (vVar.f9173b != null) {
                        v(lVar, obj);
                        throw null;
                    }
                    Throwable th = vVar.f9176e;
                    if (th != null) {
                        h(lVar, th);
                        return;
                    } else {
                        if (f9092e.compareAndSet(this, obj, v.a(vVar, null, d1Var, null, null, null, 29))) {
                            return;
                        }
                    }
                } else {
                    if (f9092e.compareAndSet(this, obj, new v(obj, d1Var, null, null, null, 28))) {
                        return;
                    }
                }
            } else if (f9092e.compareAndSet(this, obj, d1Var)) {
                return;
            }
        }
    }

    @Override // h.m.d
    public void resumeWith(Object obj) {
        Throwable a = h.g.a(obj);
        if (a != null) {
            obj = new w(a, false, 2);
        }
        y(this, obj, this.f9153c, null, 4, null);
    }

    public boolean s() {
        return !(this._state instanceof s1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(w());
        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb.append(e.j.d.w.F0(this.f9093f));
        sb.append("){");
        Object obj = this._state;
        sb.append(obj instanceof s1 ? "Active" : obj instanceof m ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(e.j.d.w.M(this));
        return sb.toString();
    }

    public final boolean u() {
        return (this.f9153c == 2) && ((i.a.i2.e) this.f9093f).h();
    }

    public final void v(h.o.b.l<? super Throwable, h.k> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public String w() {
        return "CancellableContinuation";
    }

    public final void x() {
        h.m.d<T> dVar = this.f9093f;
        i.a.i2.e eVar = dVar instanceof i.a.i2.e ? (i.a.i2.e) dVar : null;
        Throwable k2 = eVar != null ? eVar.k(this) : null;
        if (k2 == null) {
            return;
        }
        k();
        P(k2);
    }

    public final Object z(s1 s1Var, Object obj, int i2, h.o.b.l<? super Throwable, h.k> lVar, Object obj2) {
        if (obj instanceof w) {
            return obj;
        }
        if (e.j.d.w.T(i2) || obj2 != null) {
            if (lVar == null && !(s1Var instanceof h) && obj2 == null) {
                return obj;
            }
            return new v(obj, s1Var instanceof h ? (h) s1Var : null, lVar, obj2, null, 16);
        }
        return obj;
    }
}
