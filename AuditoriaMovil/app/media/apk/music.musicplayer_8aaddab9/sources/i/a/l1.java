package i.a;

import h.m.f;
import i.a.g1;
import i.a.i2.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public class l1 implements g1, q, t1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* loaded from: classes2.dex */
    public static final class a<T> extends k<T> {

        /* renamed from: i  reason: collision with root package name */
        public final l1 f9137i;

        public a(h.m.d<? super T> dVar, l1 l1Var) {
            super(dVar, 1);
            this.f9137i = l1Var;
        }

        @Override // i.a.k
        public Throwable n(g1 g1Var) {
            Throwable e2;
            Object A = this.f9137i.A();
            return (!(A instanceof c) || (e2 = ((c) A).e()) == null) ? A instanceof w ? ((w) A).f9177b : ((l1) g1Var).v() : e2;
        }

        @Override // i.a.k
        public String w() {
            return "AwaitContinuation";
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends k1 {

        /* renamed from: e  reason: collision with root package name */
        public final l1 f9138e;

        /* renamed from: f  reason: collision with root package name */
        public final c f9139f;

        /* renamed from: g  reason: collision with root package name */
        public final p f9140g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f9141h;

        public b(l1 l1Var, c cVar, p pVar, Object obj) {
            this.f9138e = l1Var;
            this.f9139f = cVar;
            this.f9140g = pVar;
            this.f9141h = obj;
        }

        @Override // h.o.b.l
        public /* bridge */ /* synthetic */ h.k invoke(Throwable th) {
            o(th);
            return h.k.a;
        }

        @Override // i.a.y
        public void o(Throwable th) {
            l1 l1Var = this.f9138e;
            c cVar = this.f9139f;
            p pVar = this.f9140g;
            Object obj = this.f9141h;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l1.a;
            p L = l1Var.L(pVar);
            if (L == null || !l1Var.Z(cVar, L, obj)) {
                l1Var.c(l1Var.o(cVar, obj));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements b1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;
        public final q1 a;

        public c(q1 q1Var, boolean z, Throwable th) {
            this.a = q1Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        @Override // i.a.b1
        public boolean a() {
            return ((Throwable) this._rootCause) == null;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
        public final void b(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th == th2) {
            } else {
                ?? r0 = this._exceptionsHolder;
                if (r0 == 0) {
                    this._exceptionsHolder = th;
                } else if (!(r0 instanceof Throwable)) {
                    if (!(r0 instanceof ArrayList)) {
                        throw new IllegalStateException(h.o.c.j.i("State is ", r0).toString());
                    }
                    ((ArrayList) r0).add(th);
                } else if (th == r0) {
                } else {
                    ArrayList<Throwable> d2 = d();
                    d2.add(r0);
                    d2.add(th);
                    this._exceptionsHolder = d2;
                }
            }
        }

        @Override // i.a.b1
        public q1 c() {
            return this.a;
        }

        public final ArrayList<Throwable> d() {
            return new ArrayList<>(4);
        }

        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        public final boolean f() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            return this._exceptionsHolder == m1.f9149e;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        public final List<Throwable> i(Throwable th) {
            ArrayList<Throwable> arrayList;
            ?? r0 = this._exceptionsHolder;
            if (r0 == 0) {
                arrayList = d();
            } else if (r0 instanceof Throwable) {
                ArrayList<Throwable> d2 = d();
                d2.add(r0);
                arrayList = d2;
            } else if (!(r0 instanceof ArrayList)) {
                throw new IllegalStateException(h.o.c.j.i("State is ", r0).toString());
            } else {
                arrayList = (ArrayList) r0;
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !h.o.c.j.a(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = m1.f9149e;
            return arrayList;
        }

        public final void j(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("Finishing[cancelling=");
            y.append(f());
            y.append(", completing=");
            y.append(g());
            y.append(", rootCause=");
            y.append((Throwable) this._rootCause);
            y.append(", exceptions=");
            y.append(this._exceptionsHolder);
            y.append(", list=");
            y.append(this.a);
            y.append(']');
            return y.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends i.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ l1 f9142d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f9143e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i.a.i2.i iVar, l1 l1Var, Object obj) {
            super(iVar);
            this.f9142d = l1Var;
            this.f9143e = obj;
        }

        @Override // i.a.i2.c
        public Object c(i.a.i2.i iVar) {
            if (this.f9142d.A() == this.f9143e) {
                return null;
            }
            return i.a.i2.h.a;
        }
    }

    public l1(boolean z) {
        this._state = z ? m1.f9151g : m1.f9150f;
        this._parentHandle = null;
    }

    public final Object A() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof i.a.i2.m)) {
                return obj;
            }
            ((i.a.i2.m) obj).a(this);
        }
    }

    public boolean C(Throwable th) {
        return false;
    }

    public void D(Throwable th) {
        throw th;
    }

    public final void E(g1 g1Var) {
        if (g1Var == null) {
            this._parentHandle = r1.a;
            return;
        }
        g1Var.start();
        o d0 = g1Var.d0(this);
        this._parentHandle = d0;
        if (!(A() instanceof b1)) {
            d0.dispose();
            this._parentHandle = r1.a;
        }
    }

    public boolean F() {
        return false;
    }

    public final Object H(Object obj) {
        Object Y;
        do {
            Y = Y(A(), obj);
            if (Y == m1.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                w wVar = obj instanceof w ? (w) obj : null;
                throw new IllegalStateException(str, wVar != null ? wVar.f9177b : null);
            }
        } while (Y == m1.f9147c);
        return Y;
    }

    @Override // i.a.g1
    public final p0 I(h.o.b.l<? super Throwable, h.k> lVar) {
        return u(false, true, lVar);
    }

    public String J() {
        return getClass().getSimpleName();
    }

    public final p L(i.a.i2.i iVar) {
        while (iVar.m()) {
            iVar = iVar.k();
        }
        while (true) {
            iVar = iVar.j();
            if (!iVar.m()) {
                if (iVar instanceof p) {
                    return (p) iVar;
                }
                if (iVar instanceof q1) {
                    return null;
                }
            }
        }
    }

    public final void N(q1 q1Var, Throwable th) {
        z zVar;
        z zVar2 = null;
        for (i.a.i2.i iVar = (i.a.i2.i) q1Var.g(); !h.o.c.j.a(iVar, q1Var); iVar = iVar.j()) {
            if (iVar instanceof i1) {
                k1 k1Var = (k1) iVar;
                try {
                    k1Var.o(th);
                } catch (Throwable th2) {
                    if (zVar2 == null) {
                        zVar = null;
                    } else {
                        e.j.d.w.f(zVar2, th2);
                        zVar = zVar2;
                    }
                    if (zVar == null) {
                        zVar2 = new z("Exception in completion handler " + k1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (zVar2 != null) {
            D(zVar2);
        }
        j(th);
    }

    public void O(Object obj) {
    }

    @Override // i.a.t1
    public CancellationException Q() {
        Throwable th;
        Object A = A();
        if (A instanceof c) {
            th = ((c) A).e();
        } else if (A instanceof w) {
            th = ((w) A).f9177b;
        } else if (A instanceof b1) {
            throw new IllegalStateException(h.o.c.j.i("Cannot be cancelling child in this state: ", A).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        return cancellationException == null ? new h1(h.o.c.j.i("Parent job is ", V(A)), th, this) : cancellationException;
    }

    public void R() {
    }

    public final void S(k1 k1Var) {
        q1 q1Var = new q1();
        i.a.i2.i.f9066b.lazySet(q1Var, k1Var);
        i.a.i2.i.a.lazySet(q1Var, k1Var);
        while (true) {
            if (k1Var.g() != k1Var) {
                break;
            } else if (i.a.i2.i.a.compareAndSet(k1Var, k1Var, q1Var)) {
                q1Var.e(k1Var);
                break;
            }
        }
        a.compareAndSet(this, k1Var, k1Var.j());
    }

    public final int U(Object obj) {
        if (obj instanceof s0) {
            if (((s0) obj).a) {
                return 0;
            }
            if (a.compareAndSet(this, obj, m1.f9151g)) {
                R();
                return 1;
            }
            return -1;
        } else if (obj instanceof a1) {
            if (a.compareAndSet(this, obj, ((a1) obj).a)) {
                R();
                return 1;
            }
            return -1;
        } else {
            return 0;
        }
    }

    public final String V(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof b1 ? ((b1) obj).a() ? "Active" : "New" : obj instanceof w ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.f() ? "Cancelling" : cVar.g() ? "Completing" : "Active";
    }

    @Override // i.a.g1
    public void W(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new h1(k(), null, this);
        }
        e(cancellationException);
    }

    public final CancellationException X(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = k();
            }
            cancellationException = new h1(str, th, this);
        }
        return cancellationException;
    }

    public final Object Y(Object obj, Object obj2) {
        if (obj instanceof b1) {
            boolean z = true;
            if (((obj instanceof s0) || (obj instanceof k1)) && !(obj instanceof p) && !(obj2 instanceof w)) {
                b1 b1Var = (b1) obj;
                if (a.compareAndSet(this, b1Var, obj2 instanceof b1 ? new c1((b1) obj2) : obj2)) {
                    O(obj2);
                    m(b1Var, obj2);
                } else {
                    z = false;
                }
                return z ? obj2 : m1.f9147c;
            }
            b1 b1Var2 = (b1) obj;
            q1 w = w(b1Var2);
            if (w == null) {
                return m1.f9147c;
            }
            p pVar = null;
            c cVar = b1Var2 instanceof c ? (c) b1Var2 : null;
            if (cVar == null) {
                cVar = new c(w, false, null);
            }
            synchronized (cVar) {
                if (cVar.g()) {
                    return m1.a;
                }
                cVar.j(true);
                if (cVar != b1Var2 && !a.compareAndSet(this, b1Var2, cVar)) {
                    return m1.f9147c;
                }
                boolean f2 = cVar.f();
                w wVar = obj2 instanceof w ? (w) obj2 : null;
                if (wVar != null) {
                    cVar.b(wVar.f9177b);
                }
                Throwable e2 = cVar.e();
                if (!(true ^ f2)) {
                    e2 = null;
                }
                if (e2 != null) {
                    N(w, e2);
                }
                p pVar2 = b1Var2 instanceof p ? (p) b1Var2 : null;
                if (pVar2 == null) {
                    q1 c2 = b1Var2.c();
                    if (c2 != null) {
                        pVar = L(c2);
                    }
                } else {
                    pVar = pVar2;
                }
                return (pVar == null || !Z(cVar, pVar, obj2)) ? o(cVar, obj2) : m1.f9146b;
            }
        }
        return m1.a;
    }

    public final boolean Z(c cVar, p pVar, Object obj) {
        while (e.j.d.w.Q(pVar.f9157e, false, false, new b(this, cVar, pVar, obj), 1, null) == r1.a) {
            pVar = L(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // i.a.g1
    public boolean a() {
        Object A = A();
        return (A instanceof b1) && ((b1) A).a();
    }

    public final boolean b(Object obj, q1 q1Var, k1 k1Var) {
        char c2;
        d dVar = new d(k1Var, this, obj);
        do {
            i.a.i2.i k2 = q1Var.k();
            i.a.i2.i.f9066b.lazySet(k1Var, k2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i.a.i2.i.a;
            atomicReferenceFieldUpdater.lazySet(k1Var, q1Var);
            dVar.f9069c = q1Var;
            c2 = !atomicReferenceFieldUpdater.compareAndSet(k2, q1Var, dVar) ? (char) 0 : dVar.a(k2) == null ? (char) 1 : (char) 2;
            if (c2 == 1) {
                return true;
            }
        } while (c2 != 2);
        return false;
    }

    public void c(Object obj) {
    }

    public final Object d(h.m.d<Object> dVar) {
        Object A;
        do {
            A = A();
            if (!(A instanceof b1)) {
                if (A instanceof w) {
                    throw ((w) A).f9177b;
                }
                return m1.a(A);
            }
        } while (U(A) < 0);
        a aVar = new a(e.j.d.w.P(dVar), this);
        aVar.p();
        aVar.r(new q0(u(false, true, new u1(aVar))));
        Object o = aVar.o();
        if (o == h.m.h.a.COROUTINE_SUSPENDED) {
            h.o.c.j.e(dVar, "frame");
        }
        return o;
    }

    @Override // i.a.g1
    public final o d0(q qVar) {
        return (o) e.j.d.w.Q(this, true, false, new p(qVar), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0040 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.l1.e(java.lang.Object):boolean");
    }

    @Override // h.m.f
    public <R> R fold(R r, h.o.b.p<? super R, ? super f.a, ? extends R> pVar) {
        return (R) f.a.C0201a.a(this, r, pVar);
    }

    @Override // h.m.f.a, h.m.f
    public <E extends f.a> E get(f.b<E> bVar) {
        return (E) f.a.C0201a.b(this, bVar);
    }

    @Override // h.m.f.a
    public final f.b<?> getKey() {
        return g1.a.a;
    }

    public final boolean j(Throwable th) {
        if (F()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        o oVar = (o) this._parentHandle;
        return (oVar == null || oVar == r1.a) ? z : oVar.b(th) || z;
    }

    public String k() {
        return "Job was cancelled";
    }

    public boolean l(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return e(th) && r();
    }

    public final void m(b1 b1Var, Object obj) {
        z zVar;
        o oVar = (o) this._parentHandle;
        if (oVar != null) {
            oVar.dispose();
            this._parentHandle = r1.a;
        }
        w wVar = obj instanceof w ? (w) obj : null;
        Throwable th = wVar == null ? null : wVar.f9177b;
        if (b1Var instanceof k1) {
            try {
                ((k1) b1Var).o(th);
                return;
            } catch (Throwable th2) {
                D(new z("Exception in completion handler " + b1Var + " for " + this, th2));
                return;
            }
        }
        q1 c2 = b1Var.c();
        if (c2 == null) {
            return;
        }
        z zVar2 = null;
        for (i.a.i2.i iVar = (i.a.i2.i) c2.g(); !h.o.c.j.a(iVar, c2); iVar = iVar.j()) {
            if (iVar instanceof k1) {
                k1 k1Var = (k1) iVar;
                try {
                    k1Var.o(th);
                } catch (Throwable th3) {
                    if (zVar2 == null) {
                        zVar = null;
                    } else {
                        e.j.d.w.f(zVar2, th3);
                        zVar = zVar2;
                    }
                    if (zVar == null) {
                        zVar2 = new z("Exception in completion handler " + k1Var + " for " + this, th3);
                    }
                }
            }
        }
        if (zVar2 == null) {
            return;
        }
        D(zVar2);
    }

    @Override // h.m.f
    public h.m.f minusKey(f.b<?> bVar) {
        return f.a.C0201a.c(this, bVar);
    }

    public final Throwable n(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new h1(k(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((t1) obj).Q();
    }

    public final Object o(c cVar, Object obj) {
        Throwable q;
        w wVar = obj instanceof w ? (w) obj : null;
        Throwable th = wVar != null ? wVar.f9177b : null;
        synchronized (cVar) {
            cVar.f();
            List<Throwable> i2 = cVar.i(th);
            q = q(cVar, i2);
            if (q != null && i2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(i2.size()));
                for (Throwable th2 : i2) {
                    if (th2 != q && th2 != q && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        e.j.d.w.f(q, th2);
                    }
                }
            }
        }
        if (q != null && q != th) {
            obj = new w(q, false, 2);
        }
        if (q != null) {
            if (j(q) || C(q)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                w.a.compareAndSet((w) obj, 0, 1);
            }
        }
        O(obj);
        a.compareAndSet(this, cVar, obj instanceof b1 ? new c1((b1) obj) : obj);
        m(cVar, obj);
        return obj;
    }

    public final Object p() {
        Object A = A();
        if (!(A instanceof b1)) {
            if (A instanceof w) {
                throw ((w) A).f9177b;
            }
            return m1.a(A);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // h.m.f
    public h.m.f plus(h.m.f fVar) {
        return f.a.C0201a.d(this, fVar);
    }

    public final Throwable q(c cVar, List<? extends Throwable> list) {
        Object obj;
        boolean z;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.f()) {
                return new h1(k(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof z1) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 == th2 || !(th3 instanceof z1)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean r() {
        return true;
    }

    public boolean s() {
        return this instanceof t;
    }

    @Override // i.a.g1
    public final boolean start() {
        int U;
        do {
            U = U(A());
            if (U == 0) {
                return false;
            }
        } while (U != 1);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(J() + '{' + V(A()) + '}');
        sb.append('@');
        sb.append(e.j.d.w.M(this));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [i.a.a1] */
    @Override // i.a.g1
    public final p0 u(boolean z, boolean z2, h.o.b.l<? super Throwable, h.k> lVar) {
        k1 k1Var;
        Throwable th;
        if (z) {
            k1Var = lVar instanceof i1 ? (i1) lVar : null;
            if (k1Var == null) {
                k1Var = new e1(lVar);
            }
        } else {
            k1Var = lVar instanceof k1 ? (k1) lVar : null;
            if (k1Var == null) {
                k1Var = null;
            }
            if (k1Var == null) {
                k1Var = new f1(lVar);
            }
        }
        k1Var.f9096d = this;
        while (true) {
            Object A = A();
            if (A instanceof s0) {
                s0 s0Var = (s0) A;
                if (!s0Var.a) {
                    q1 q1Var = new q1();
                    if (!s0Var.a) {
                        q1Var = new a1(q1Var);
                    }
                    a.compareAndSet(this, s0Var, q1Var);
                } else if (a.compareAndSet(this, A, k1Var)) {
                    return k1Var;
                }
            } else if (!(A instanceof b1)) {
                if (z2) {
                    w wVar = A instanceof w ? (w) A : null;
                    lVar.invoke(wVar != null ? wVar.f9177b : null);
                }
                return r1.a;
            } else {
                q1 c2 = ((b1) A).c();
                if (c2 == null) {
                    Objects.requireNonNull(A, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    S((k1) A);
                } else {
                    p0 p0Var = r1.a;
                    if (z && (A instanceof c)) {
                        synchronized (A) {
                            th = ((c) A).e();
                            if (th == null || ((lVar instanceof p) && !((c) A).g())) {
                                if (b(A, c2, k1Var)) {
                                    if (th == null) {
                                        return k1Var;
                                    }
                                    p0Var = k1Var;
                                }
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z2) {
                            lVar.invoke(th);
                        }
                        return p0Var;
                    } else if (b(A, c2, k1Var)) {
                        return k1Var;
                    }
                }
            }
        }
    }

    @Override // i.a.g1
    public final CancellationException v() {
        Object A = A();
        if (!(A instanceof c)) {
            if (A instanceof b1) {
                throw new IllegalStateException(h.o.c.j.i("Job is still new or active: ", this).toString());
            }
            return A instanceof w ? X(((w) A).f9177b, null) : new h1(h.o.c.j.i(getClass().getSimpleName(), " has completed normally"), null, this);
        }
        Throwable e2 = ((c) A).e();
        if (e2 != null) {
            return X(e2, h.o.c.j.i(getClass().getSimpleName(), " is cancelling"));
        }
        throw new IllegalStateException(h.o.c.j.i("Job is still new or active: ", this).toString());
    }

    public final q1 w(b1 b1Var) {
        q1 c2 = b1Var.c();
        if (c2 == null) {
            if (b1Var instanceof s0) {
                return new q1();
            }
            if (b1Var instanceof k1) {
                S((k1) b1Var);
                return null;
            }
            throw new IllegalStateException(h.o.c.j.i("State should have list: ", b1Var).toString());
        }
        return c2;
    }

    public final o x() {
        return (o) this._parentHandle;
    }

    @Override // i.a.q
    public final void z(t1 t1Var) {
        e(t1Var);
    }
}
