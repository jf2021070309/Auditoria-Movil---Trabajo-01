package com.amazon.aps.iva.se0;

import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.se0.j1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
public class o1 implements j1, s, y1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(o1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* compiled from: JobSupport.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> extends n<T> {
        public final o1 j;

        public a(com.amazon.aps.iva.ob0.d<? super T> dVar, o1 o1Var) {
            super(1, dVar);
            this.j = o1Var;
        }

        @Override // com.amazon.aps.iva.se0.n
        public final Throwable p(o1 o1Var) {
            Throwable b;
            Object b0 = this.j.b0();
            if ((b0 instanceof c) && (b = ((c) b0).b()) != null) {
                return b;
            }
            if (b0 instanceof w) {
                return ((w) b0).a;
            }
            return o1Var.p();
        }

        @Override // com.amazon.aps.iva.se0.n
        public final String x() {
            return "AwaitContinuation";
        }
    }

    /* compiled from: JobSupport.kt */
    /* loaded from: classes4.dex */
    public static final class b extends n1 {
        public final o1 f;
        public final c g;
        public final r h;
        public final Object i;

        public b(o1 o1Var, c cVar, r rVar, Object obj) {
            this.f = o1Var;
            this.g = cVar;
            this.h = rVar;
            this.i = obj;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(Throwable th) {
            q(th);
            return com.amazon.aps.iva.kb0.q.a;
        }

        @Override // com.amazon.aps.iva.se0.y
        public final void q(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o1.b;
            o1 o1Var = this.f;
            o1Var.getClass();
            r k0 = o1.k0(this.h);
            c cVar = this.g;
            Object obj = this.i;
            if (k0 == null || !o1Var.v0(cVar, k0, obj)) {
                o1Var.x(o1Var.U(cVar, obj));
            }
        }
    }

    /* compiled from: JobSupport.kt */
    /* loaded from: classes4.dex */
    public static final class c implements f1 {
        private volatile /* synthetic */ Object _rootCause;
        public final u1 b;
        private volatile /* synthetic */ int _isCompleting = 0;
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        public c(u1 u1Var, Throwable th) {
            this.b = u1Var;
            this._rootCause = th;
        }

        public final void a(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th == th2) {
            } else {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th == obj) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(obj);
                    arrayList.add(th);
                    this._exceptionsHolder = arrayList;
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        public final Throwable b() {
            return (Throwable) this._rootCause;
        }

        public final boolean c() {
            if (((Throwable) this._rootCause) != null) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.se0.f1
        public final u1 d() {
            return this.b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        public final boolean e() {
            return this._isCompleting;
        }

        public final boolean f() {
            if (this._exceptionsHolder == com.amazon.aps.iva.ab.t.h) {
                return true;
            }
            return false;
        }

        public final ArrayList g(Throwable th) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !com.amazon.aps.iva.yb0.j.a(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = com.amazon.aps.iva.ab.t.h;
            return arrayList;
        }

        public final void h() {
            this._isCompleting = 1;
        }

        @Override // com.amazon.aps.iva.se0.f1
        public final boolean isActive() {
            if (((Throwable) this._rootCause) == null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [int, boolean] */
        public final String toString() {
            return "Finishing[cancelling=" + c() + ", completing=" + ((boolean) this._isCompleting) + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.b + ']';
        }
    }

    public o1(boolean z) {
        w0 w0Var;
        if (z) {
            w0Var = com.amazon.aps.iva.ab.t.j;
        } else {
            w0Var = com.amazon.aps.iva.ab.t.i;
        }
        this._state = w0Var;
        this._parentHandle = null;
    }

    public static r k0(com.amazon.aps.iva.xe0.h hVar) {
        while (hVar.m()) {
            hVar = hVar.k();
        }
        while (true) {
            hVar = hVar.j();
            if (!hVar.m()) {
                if (hVar instanceof r) {
                    return (r) hVar;
                }
                if (hVar instanceof u1) {
                    return null;
                }
            }
        }
    }

    public static String t0(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.c()) {
                return "Cancelling";
            }
            if (cVar.e()) {
                return "Completing";
            }
        } else if (obj instanceof f1) {
            if (!((f1) obj).isActive()) {
                return "New";
            }
        } else if (obj instanceof w) {
            return "Cancelled";
        } else {
            return "Completed";
        }
        return "Active";
    }

    public final Object B(com.amazon.aps.iva.ob0.d<Object> dVar) {
        Object b0;
        do {
            b0 = b0();
            if (!(b0 instanceof f1)) {
                if (!(b0 instanceof w)) {
                    return com.amazon.aps.iva.ab.t.w(b0);
                }
                throw ((w) b0).a;
            }
        } while (r0(b0) < 0);
        a aVar = new a(com.amazon.aps.iva.a60.b.s(dVar), this);
        aVar.r();
        aVar.w(new u0(s0(new i1(aVar, 1))));
        Object q = aVar.q();
        com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        return q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f4, code lost:
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.se0.o1.D(java.lang.Object):boolean");
    }

    public void E(CancellationException cancellationException) {
        D(cancellationException);
    }

    public boolean G(Object obj) {
        return g0(obj);
    }

    @Override // com.amazon.aps.iva.se0.y1
    public final CancellationException I() {
        Throwable th;
        Object b0 = b0();
        CancellationException cancellationException = null;
        if (b0 instanceof c) {
            th = ((c) b0).b();
        } else if (b0 instanceof w) {
            th = ((w) b0).a;
        } else if (!(b0 instanceof f1)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + b0).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            return new k1("Parent job is ".concat(t0(b0)), th, this);
        }
        return cancellationException;
    }

    public final boolean L(Throwable th) {
        if (f0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        q qVar = (q) this._parentHandle;
        if (qVar != null && qVar != w1.b) {
            if (qVar.c(th) || z) {
                return true;
            }
            return false;
        }
        return z;
    }

    public String M() {
        return "Job was cancelled";
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final Object N(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        boolean z;
        while (true) {
            Object b0 = b0();
            if (!(b0 instanceof f1)) {
                z = false;
                break;
            } else if (r0(b0) >= 0) {
                z = true;
                break;
            }
        }
        if (!z) {
            com.amazon.aps.iva.a60.b.p(dVar.getContext());
            return com.amazon.aps.iva.kb0.q.a;
        }
        n nVar = new n(1, com.amazon.aps.iva.a60.b.s(dVar));
        nVar.r();
        nVar.w(new u0(s0(new a2(nVar))));
        Object q = nVar.q();
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        if (q != aVar) {
            q = com.amazon.aps.iva.kb0.q.a;
        }
        if (q == aVar) {
            return q;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    public boolean Q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (D(th) && X()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final q R(o1 o1Var) {
        return (q) j1.a.a(this, true, new r(o1Var), 2);
    }

    public final void S(f1 f1Var, Object obj) {
        w wVar;
        Throwable th;
        q qVar = (q) this._parentHandle;
        if (qVar != null) {
            qVar.dispose();
            this._parentHandle = w1.b;
        }
        z zVar = null;
        if (obj instanceof w) {
            wVar = (w) obj;
        } else {
            wVar = null;
        }
        if (wVar != null) {
            th = wVar.a;
        } else {
            th = null;
        }
        if (f1Var instanceof n1) {
            try {
                ((n1) f1Var).q(th);
                return;
            } catch (Throwable th2) {
                d0(new z("Exception in completion handler " + f1Var + " for " + this, th2));
                return;
            }
        }
        u1 d = f1Var.d();
        if (d != null) {
            for (com.amazon.aps.iva.xe0.h hVar = (com.amazon.aps.iva.xe0.h) d.i(); !com.amazon.aps.iva.yb0.j.a(hVar, d); hVar = hVar.j()) {
                if (hVar instanceof n1) {
                    n1 n1Var = (n1) hVar;
                    try {
                        n1Var.q(th);
                    } catch (Throwable th3) {
                        if (zVar != null) {
                            com.amazon.aps.iva.aq.k.f(zVar, th3);
                        } else {
                            zVar = new z("Exception in completion handler " + n1Var + " for " + this, th3);
                            com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
                        }
                    }
                }
            }
            if (zVar != null) {
                d0(zVar);
            }
        }
    }

    public final Throwable T(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        if (z) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new k1(M(), null, this);
            }
            return th;
        } else if (obj != null) {
            return ((y1) obj).I();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    public final Object U(c cVar, Object obj) {
        w wVar;
        Throwable W;
        Object obj2;
        boolean z;
        Throwable th = null;
        if (obj instanceof w) {
            wVar = (w) obj;
        } else {
            wVar = null;
        }
        if (wVar != null) {
            th = wVar.a;
        }
        synchronized (cVar) {
            cVar.c();
            ArrayList<Throwable> g = cVar.g(th);
            W = W(cVar, g);
            if (W != null && g.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g.size()));
                for (Throwable th2 : g) {
                    if (th2 != W && th2 != W && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        com.amazon.aps.iva.aq.k.f(W, th2);
                    }
                }
            }
        }
        if (W != null && W != th) {
            obj = new w(W, false);
        }
        if (W != null) {
            if (!L(W) && !c0(W)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (obj != null) {
                    w.b.compareAndSet((w) obj, 0, 1);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        n0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        if (obj instanceof f1) {
            obj2 = new g1((f1) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, obj2) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        S(cVar, obj);
        return obj;
    }

    public final Object V() {
        Object b0 = b0();
        if (!(b0 instanceof f1)) {
            if (!(b0 instanceof w)) {
                return com.amazon.aps.iva.ab.t.w(b0);
            }
            throw ((w) b0).a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public final Throwable W(c cVar, ArrayList arrayList) {
        Object obj;
        boolean z;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!cVar.c()) {
                return null;
            }
            return new k1(M(), null, this);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof h2) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof h2)) {
                    z = true;
                    continue;
                } else {
                    z = false;
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

    public boolean X() {
        return true;
    }

    public boolean Y() {
        return this instanceof u;
    }

    public final u1 Z(f1 f1Var) {
        u1 d = f1Var.d();
        if (d == null) {
            if (f1Var instanceof w0) {
                return new u1();
            }
            if (f1Var instanceof n1) {
                q0((n1) f1Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + f1Var).toString());
        }
        return d;
    }

    @Override // com.amazon.aps.iva.se0.j1
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new k1(M(), null, this);
        }
        E(cancellationException);
    }

    public final q a0() {
        return (q) this._parentHandle;
    }

    public final Object b0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof com.amazon.aps.iva.xe0.m)) {
                return obj;
            }
            ((com.amazon.aps.iva.xe0.m) obj).a(this);
        }
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final boolean c() {
        return !(b0() instanceof f1);
    }

    public boolean c0(Throwable th) {
        return false;
    }

    public final void e0(j1 j1Var) {
        w1 w1Var = w1.b;
        if (j1Var == null) {
            this._parentHandle = w1Var;
            return;
        }
        j1Var.start();
        q R = j1Var.R(this);
        this._parentHandle = R;
        if (c()) {
            R.dispose();
            this._parentHandle = w1Var;
        }
    }

    public boolean f0() {
        return this instanceof g;
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final <R> R fold(R r, com.amazon.aps.iva.xb0.p<? super R, ? super g.b, ? extends R> pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public final boolean g0(Object obj) {
        Object u0;
        do {
            u0 = u0(b0(), obj);
            if (u0 == com.amazon.aps.iva.ab.t.d) {
                return false;
            }
            if (u0 == com.amazon.aps.iva.ab.t.e) {
                return true;
            }
        } while (u0 == com.amazon.aps.iva.ab.t.f);
        x(u0);
        return true;
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.a(this, cVar);
    }

    @Override // com.amazon.aps.iva.ob0.g.b
    public final g.c<?> getKey() {
        return j1.b.b;
    }

    public final Object h0(Object obj) {
        Object u0;
        w wVar;
        do {
            u0 = u0(b0(), obj);
            if (u0 == com.amazon.aps.iva.ab.t.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof w) {
                    wVar = (w) obj;
                } else {
                    wVar = null;
                }
                if (wVar != null) {
                    th = wVar.a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (u0 == com.amazon.aps.iva.ab.t.f);
        return u0;
    }

    public Object i() {
        return V();
    }

    @Override // com.amazon.aps.iva.se0.j1
    public boolean isActive() {
        Object b0 = b0();
        if ((b0 instanceof f1) && ((f1) b0).isActive()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final boolean isCancelled() {
        Object b0 = b0();
        if (!(b0 instanceof w) && (!(b0 instanceof c) || !((c) b0).c())) {
            return false;
        }
        return true;
    }

    public String j0() {
        return getClass().getSimpleName();
    }

    public final void l0(u1 u1Var, Throwable th) {
        z zVar = null;
        for (com.amazon.aps.iva.xe0.h hVar = (com.amazon.aps.iva.xe0.h) u1Var.i(); !com.amazon.aps.iva.yb0.j.a(hVar, u1Var); hVar = hVar.j()) {
            if (hVar instanceof l1) {
                n1 n1Var = (n1) hVar;
                try {
                    n1Var.q(th);
                } catch (Throwable th2) {
                    if (zVar != null) {
                        com.amazon.aps.iva.aq.k.f(zVar, th2);
                    } else {
                        zVar = new z("Exception in completion handler " + n1Var + " for " + this, th2);
                        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                    }
                }
            }
        }
        if (zVar != null) {
            d0(zVar);
        }
        L(th);
    }

    public final Throwable m() {
        w wVar;
        Object b0 = b0();
        if (!(b0 instanceof f1)) {
            if (b0 instanceof w) {
                wVar = (w) b0;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                return null;
            }
            return wVar.a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final com.amazon.aps.iva.ob0.g minusKey(g.c<?> cVar) {
        return g.b.a.b(this, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.amazon.aps.iva.se0.e1] */
    @Override // com.amazon.aps.iva.se0.j1
    public final t0 n(boolean z, boolean z2, com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar) {
        n1 n1Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        w wVar;
        Throwable th;
        boolean z3;
        Throwable th2 = null;
        if (z) {
            if (lVar instanceof l1) {
                n1Var = (l1) lVar;
            } else {
                n1Var = null;
            }
            if (n1Var == null) {
                n1Var = new h1(lVar);
            }
        } else {
            if (lVar instanceof n1) {
                n1Var = (n1) lVar;
            } else {
                n1Var = null;
            }
            if (n1Var == null) {
                n1Var = new i1(lVar, 0);
            }
        }
        n1Var.e = this;
        while (true) {
            Object b0 = b0();
            boolean z4 = true;
            if (b0 instanceof w0) {
                w0 w0Var = (w0) b0;
                if (w0Var.b) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, b0, n1Var)) {
                            if (atomicReferenceFieldUpdater2.get(this) != b0) {
                                z4 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z4) {
                        return n1Var;
                    }
                } else {
                    u1 u1Var = new u1();
                    if (!w0Var.b) {
                        u1Var = new e1(u1Var);
                    }
                    do {
                        atomicReferenceFieldUpdater = b;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, w0Var, u1Var)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == w0Var);
                }
            } else if (b0 instanceof f1) {
                u1 d = ((f1) b0).d();
                if (d == null) {
                    if (b0 != null) {
                        q0((n1) b0);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                } else {
                    t0 t0Var = w1.b;
                    if (z && (b0 instanceof c)) {
                        synchronized (b0) {
                            th = ((c) b0).b();
                            if (th == null || ((lVar instanceof r) && !((c) b0).e())) {
                                p1 p1Var = new p1(n1Var, this, b0);
                                while (true) {
                                    int p = d.k().p(n1Var, d, p1Var);
                                    if (p != 1) {
                                        if (p == 2) {
                                            z3 = false;
                                            break;
                                        }
                                    } else {
                                        z3 = true;
                                        break;
                                    }
                                }
                                if (z3) {
                                    if (th == null) {
                                        return n1Var;
                                    }
                                    t0Var = n1Var;
                                }
                            }
                            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z2) {
                            lVar.invoke(th);
                        }
                        return t0Var;
                    }
                    p1 p1Var2 = new p1(n1Var, this, b0);
                    while (true) {
                        int p2 = d.k().p(n1Var, d, p1Var2);
                        if (p2 == 1) {
                            break;
                        } else if (p2 == 2) {
                            z4 = false;
                            break;
                        }
                    }
                    if (z4) {
                        return n1Var;
                    }
                }
            } else {
                if (z2) {
                    if (b0 instanceof w) {
                        wVar = (w) b0;
                    } else {
                        wVar = null;
                    }
                    if (wVar != null) {
                        th2 = wVar.a;
                    }
                    lVar.invoke(th2);
                }
                return w1.b;
            }
        }
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final CancellationException p() {
        Object b0 = b0();
        CancellationException cancellationException = null;
        if (b0 instanceof c) {
            Throwable b2 = ((c) b0).b();
            if (b2 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (b2 instanceof CancellationException) {
                    cancellationException = (CancellationException) b2;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = M();
                    }
                    return new k1(concat, b2, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(b0 instanceof f1)) {
            if (b0 instanceof w) {
                Throwable th = ((w) b0).a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new k1(M(), th, this);
                }
                return cancellationException;
            }
            return new k1(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final com.amazon.aps.iva.ob0.g plus(com.amazon.aps.iva.ob0.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "context");
        return g.a.a(this, gVar);
    }

    public final void q0(n1 n1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z;
        u1 u1Var = new u1();
        n1Var.getClass();
        com.amazon.aps.iva.xe0.h.c.lazySet(u1Var, n1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = com.amazon.aps.iva.xe0.h.b;
        atomicReferenceFieldUpdater2.lazySet(u1Var, n1Var);
        while (true) {
            if (n1Var.i() == n1Var) {
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(n1Var, n1Var, u1Var)) {
                        z = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(n1Var) != n1Var) {
                        z = false;
                        continue;
                        break;
                    }
                }
                if (z) {
                    u1Var.h(n1Var);
                    break;
                }
            } else {
                break;
            }
        }
        com.amazon.aps.iva.xe0.h j = n1Var.j();
        do {
            atomicReferenceFieldUpdater = b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, n1Var, j)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == n1Var);
    }

    public final int r0(Object obj) {
        boolean z = obj instanceof w0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        boolean z2 = false;
        if (z) {
            if (((w0) obj).b) {
                return 0;
            }
            w0 w0Var = com.amazon.aps.iva.ab.t.j;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, w0Var)) {
                    z2 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z2) {
                return -1;
            }
            p0();
            return 1;
        } else if (!(obj instanceof e1)) {
            return 0;
        } else {
            u1 u1Var = ((e1) obj).b;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, u1Var)) {
                    z2 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z2) {
                return -1;
            }
            p0();
            return 1;
        }
    }

    @Override // com.amazon.aps.iva.se0.s
    public final void s(o1 o1Var) {
        D(o1Var);
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final t0 s0(com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar) {
        return n(false, true, lVar);
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final boolean start() {
        int r0;
        do {
            r0 = r0(b0());
            if (r0 == 0) {
                return false;
            }
        } while (r0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(j0() + '{' + t0(b0()) + '}');
        sb.append('@');
        sb.append(j0.e(this));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Throwable, T] */
    public final Object u0(Object obj, Object obj2) {
        g1 g1Var;
        boolean z;
        c cVar;
        w wVar;
        r rVar;
        if (!(obj instanceof f1)) {
            return com.amazon.aps.iva.ab.t.d;
        }
        boolean z2 = true;
        boolean z3 = false;
        if (((obj instanceof w0) || (obj instanceof n1)) && !(obj instanceof r) && !(obj2 instanceof w)) {
            f1 f1Var = (f1) obj;
            if (obj2 instanceof f1) {
                g1Var = new g1((f1) obj2);
            } else {
                g1Var = obj2;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, f1Var, g1Var)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != f1Var) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                z2 = false;
            } else {
                n0(obj2);
                S(f1Var, obj2);
            }
            if (z2) {
                return obj2;
            }
            return com.amazon.aps.iva.ab.t.f;
        }
        f1 f1Var2 = (f1) obj;
        u1 Z = Z(f1Var2);
        if (Z == null) {
            return com.amazon.aps.iva.ab.t.f;
        }
        r rVar2 = null;
        if (f1Var2 instanceof c) {
            cVar = (c) f1Var2;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            cVar = new c(Z, null);
        }
        com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
        synchronized (cVar) {
            if (cVar.e()) {
                return com.amazon.aps.iva.ab.t.d;
            }
            cVar.h();
            if (cVar != f1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, f1Var2, cVar)) {
                        z3 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != f1Var2) {
                        break;
                    }
                }
                if (!z3) {
                    return com.amazon.aps.iva.ab.t.f;
                }
            }
            boolean c2 = cVar.c();
            if (obj2 instanceof w) {
                wVar = (w) obj2;
            } else {
                wVar = null;
            }
            if (wVar != null) {
                cVar.a(wVar.a);
            }
            ?? b2 = Boolean.valueOf(true ^ c2).booleanValue() ? cVar.b() : 0;
            d0Var.b = b2;
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            if (b2 != 0) {
                l0(Z, b2);
            }
            if (f1Var2 instanceof r) {
                rVar = (r) f1Var2;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                u1 d = f1Var2.d();
                if (d != null) {
                    rVar2 = k0(d);
                }
            } else {
                rVar2 = rVar;
            }
            if (rVar2 != null && v0(cVar, rVar2, obj2)) {
                return com.amazon.aps.iva.ab.t.e;
            }
            return U(cVar, obj2);
        }
    }

    public final boolean v0(c cVar, r rVar, Object obj) {
        while (j1.a.a(rVar.f, false, new b(this, cVar, rVar, obj), 1) == w1.b) {
            rVar = k0(rVar);
            if (rVar == null) {
                return false;
            }
        }
        return true;
    }

    public void y(Object obj) {
        x(obj);
    }

    public void p0() {
    }

    public void d0(z zVar) {
        throw zVar;
    }

    public void n0(Object obj) {
    }

    public void x(Object obj) {
    }
}
