package com.amazon.aps.iva.se0;

import com.amazon.aps.iva.se0.j1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes4.dex */
public class n<T> extends q0<T> implements m<T>, com.amazon.aps.iva.qb0.d {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(n.class, "_decision");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;
    public final com.amazon.aps.iva.ob0.d<T> e;
    public final com.amazon.aps.iva.ob0.g f;
    public t0 g;

    public n(int i2, com.amazon.aps.iva.ob0.d dVar) {
        super(i2);
        this.e = dVar;
        this.f = dVar.getContext();
        this._decision = 0;
        this._state = b.b;
    }

    public static Object B(x1 x1Var, Object obj, int i2, com.amazon.aps.iva.xb0.l lVar, Object obj2) {
        k kVar;
        if (!(obj instanceof w)) {
            boolean z = true;
            if (i2 != 1 && i2 != 2) {
                z = false;
            }
            if (z || obj2 != null) {
                if (lVar != null || (((x1Var instanceof k) && !(x1Var instanceof f)) || obj2 != null)) {
                    if (x1Var instanceof k) {
                        kVar = (k) x1Var;
                    } else {
                        kVar = null;
                    }
                    return new v(obj, kVar, lVar, obj2, null, 16);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    public static void u(Object obj, com.amazon.aps.iva.xb0.l lVar) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0020, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(java.lang.Object r7, int r8, com.amazon.aps.iva.xb0.l<? super java.lang.Throwable, com.amazon.aps.iva.kb0.q> r9) {
        /*
            r6 = this;
        L0:
            java.lang.Object r0 = r6._state
            boolean r1 = r0 instanceof com.amazon.aps.iva.se0.x1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2f
            r1 = r0
            com.amazon.aps.iva.se0.x1 r1 = (com.amazon.aps.iva.se0.x1) r1
            r4 = 0
            java.lang.Object r1 = B(r1, r7, r8, r9, r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = com.amazon.aps.iva.se0.n.i
        L12:
            boolean r5 = r4.compareAndSet(r6, r0, r1)
            if (r5 == 0) goto L1a
            r2 = r3
            goto L20
        L1a:
            java.lang.Object r5 = r4.get(r6)
            if (r5 == r0) goto L12
        L20:
            if (r2 == 0) goto L0
            boolean r7 = r6.t()
            if (r7 != 0) goto L2b
            r6.n()
        L2b:
            r6.o(r8)
            return
        L2f:
            boolean r8 = r0 instanceof com.amazon.aps.iva.se0.o
            if (r8 == 0) goto L48
            com.amazon.aps.iva.se0.o r0 = (com.amazon.aps.iva.se0.o) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = com.amazon.aps.iva.se0.o.c
            boolean r8 = r8.compareAndSet(r0, r2, r3)
            if (r8 == 0) goto L48
            if (r9 == 0) goto L47
            java.lang.Throwable r7 = r0.a
            r6.m(r7, r9)
        L47:
            return
        L48:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Already resumed, but proposed with update "
            r9.<init>(r0)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.se0.n.A(java.lang.Object, int, com.amazon.aps.iva.xb0.l):void");
    }

    public final com.amazon.aps.iva.xe0.s C(Object obj, Object obj2, com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.xe0.s sVar;
        boolean z;
        do {
            Object obj3 = this._state;
            boolean z2 = obj3 instanceof x1;
            sVar = com.amazon.aps.iva.ff0.b.c;
            if (z2) {
                Object B = B((x1) obj3, obj, this.d, lVar, obj2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, B)) {
                        z = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        z = false;
                        continue;
                        break;
                    }
                }
            } else if (!(obj3 instanceof v)) {
                return null;
            } else {
                if (obj2 == null || ((v) obj3).d != obj2) {
                    return null;
                }
                return sVar;
            }
        } while (!z);
        if (!t()) {
            n();
        }
        return sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0020, code lost:
        continue;
     */
    @Override // com.amazon.aps.iva.se0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J(java.lang.Throwable r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._state
            boolean r1 = r0 instanceof com.amazon.aps.iva.se0.x1
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            com.amazon.aps.iva.se0.o r1 = new com.amazon.aps.iva.se0.o
            boolean r3 = r0 instanceof com.amazon.aps.iva.se0.k
            r1.<init>(r7, r8, r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = com.amazon.aps.iva.se0.n.i
        L11:
            boolean r5 = r4.compareAndSet(r7, r0, r1)
            r6 = 1
            if (r5 == 0) goto L1a
            r2 = r6
            goto L20
        L1a:
            java.lang.Object r5 = r4.get(r7)
            if (r5 == r0) goto L11
        L20:
            if (r2 == 0) goto L0
            if (r3 == 0) goto L27
            com.amazon.aps.iva.se0.k r0 = (com.amazon.aps.iva.se0.k) r0
            goto L28
        L27:
            r0 = 0
        L28:
            if (r0 == 0) goto L2d
            r7.j(r0, r8)
        L2d:
            boolean r8 = r7.t()
            if (r8 != 0) goto L36
            r7.n()
        L36:
            int r8 = r7.d
            r7.o(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.se0.n.J(java.lang.Throwable):boolean");
    }

    @Override // com.amazon.aps.iva.se0.m
    public final void P(T t, com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar) {
        A(t, this.d, lVar);
    }

    @Override // com.amazon.aps.iva.se0.q0
    public final void a(Object obj, CancellationException cancellationException) {
        boolean z;
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof x1)) {
                if (obj2 instanceof w) {
                    return;
                }
                boolean z2 = true;
                if (obj2 instanceof v) {
                    v vVar = (v) obj2;
                    if (vVar.e != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        v a = v.a(vVar, null, cancellationException, 15);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    z2 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z2) {
                            k kVar = vVar.b;
                            if (kVar != null) {
                                j(kVar, cancellationException);
                            }
                            com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> lVar = vVar.c;
                            if (lVar != null) {
                                m(cancellationException, lVar);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i;
                    v vVar2 = new v(obj2, null, null, null, cancellationException, 14);
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, vVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                z2 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z2) {
                        return;
                    }
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // com.amazon.aps.iva.se0.q0
    public final com.amazon.aps.iva.ob0.d<T> b() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.se0.m
    public final boolean c() {
        return !(this._state instanceof x1);
    }

    @Override // com.amazon.aps.iva.se0.m
    public final com.amazon.aps.iva.xe0.s d(Object obj, Object obj2) {
        return C(obj, obj2, null);
    }

    @Override // com.amazon.aps.iva.se0.m
    public final com.amazon.aps.iva.xe0.s e(Object obj, com.amazon.aps.iva.xb0.l lVar) {
        return C(obj, null, lVar);
    }

    @Override // com.amazon.aps.iva.se0.q0
    public final Throwable f(Object obj) {
        Throwable f = super.f(obj);
        if (f == null) {
            return null;
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.se0.q0
    public final <T> T g(Object obj) {
        if (obj instanceof v) {
            return (T) ((v) obj).a;
        }
        return obj;
    }

    @Override // com.amazon.aps.iva.qb0.d
    public final com.amazon.aps.iva.qb0.d getCallerFrame() {
        com.amazon.aps.iva.ob0.d<T> dVar = this.e;
        if (dVar instanceof com.amazon.aps.iva.qb0.d) {
            return (com.amazon.aps.iva.qb0.d) dVar;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.ob0.d
    public final com.amazon.aps.iva.ob0.g getContext() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.se0.q0
    public final Object i() {
        return this._state;
    }

    public final void j(k kVar, Throwable th) {
        try {
            kVar.a(th);
        } catch (Throwable th2) {
            i.c(this.f, new z("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(Throwable th, com.amazon.aps.iva.xb0.l lVar) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            i.c(this.f, new z("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // com.amazon.aps.iva.se0.m
    public final void l() {
        o(this.d);
    }

    public final void m(Throwable th, com.amazon.aps.iva.xb0.l lVar) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            i.c(this.f, new z("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n() {
        t0 t0Var = this.g;
        if (t0Var == null) {
            return;
        }
        t0Var.dispose();
        this.g = w1.b;
    }

    /* JADX WARN: Finally extract failed */
    public final void o(int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        while (true) {
            int i3 = this._decision;
            z = false;
            if (i3 != 0) {
                if (i3 == 1) {
                    z2 = false;
                } else {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (h.compareAndSet(this, 0, 2)) {
                z2 = true;
                break;
            }
        }
        if (z2) {
            return;
        }
        com.amazon.aps.iva.ob0.d<T> dVar = this.e;
        if (i2 == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && (dVar instanceof com.amazon.aps.iva.xe0.e)) {
            if (i2 != 1 && i2 != 2) {
                z4 = false;
            } else {
                z4 = true;
            }
            int i4 = this.d;
            if (i4 == 1 || i4 == 2) {
                z = true;
            }
            if (z4 == z) {
                d0 d0Var = ((com.amazon.aps.iva.xe0.e) dVar).e;
                com.amazon.aps.iva.ob0.g context = dVar.getContext();
                if (d0Var.B()) {
                    d0Var.x(context, this);
                    return;
                }
                x0 a = g2.a();
                if (a.V()) {
                    a.L(this);
                    return;
                }
                a.M(true);
                try {
                    com.amazon.aps.iva.a60.b.v(this, this.e, true);
                    do {
                    } while (a.a0());
                } catch (Throwable th) {
                    try {
                        h(th, null);
                    } finally {
                        a.C(true);
                    }
                }
                return;
            }
        }
        com.amazon.aps.iva.a60.b.v(this, dVar, z3);
    }

    public Throwable p(o1 o1Var) {
        return o1Var.p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r1 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r6.g != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r0 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        r0 = r6.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
        if ((r0 instanceof com.amazon.aps.iva.xe0.e) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        r5 = (com.amazon.aps.iva.xe0.e) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r5 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
        r0 = r5.o(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
        n();
        J(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
        return com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
        r0 = r6.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
        if ((r0 instanceof com.amazon.aps.iva.xe0.e) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
        r5 = (com.amazon.aps.iva.xe0.e) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
        if (r5 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
        r0 = r5.o(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
        n();
        J(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
        r0 = r6._state;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0069, code lost:
        if ((r0 instanceof com.amazon.aps.iva.se0.w) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006b, code lost:
        r1 = r6.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006d, code lost:
        if (r1 == 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006f, code lost:
        if (r1 != 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
        if (r3 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0075, code lost:
        r1 = (com.amazon.aps.iva.se0.j1) r6.f.get(com.amazon.aps.iva.se0.j1.b.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
        if (r1 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0085, code lost:
        if (r1.isActive() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0088, code lost:
        r1 = r1.p();
        a(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008f, code lost:
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0094, code lost:
        return g(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
        throw ((com.amazon.aps.iva.se0.w) r0).a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q() {
        /*
            r6 = this;
            boolean r0 = r6.t()
        L4:
            int r1 = r6._decision
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1b
            if (r1 != r2) goto Lf
            r1 = r4
            goto L24
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = com.amazon.aps.iva.se0.n.h
            boolean r1 = r1.compareAndSet(r6, r4, r3)
            if (r1 == 0) goto L4
            r1 = r3
        L24:
            r5 = 0
            if (r1 == 0) goto L4b
            com.amazon.aps.iva.se0.t0 r1 = r6.g
            if (r1 != 0) goto L2e
            r6.s()
        L2e:
            if (r0 == 0) goto L48
            com.amazon.aps.iva.ob0.d<T> r0 = r6.e
            boolean r1 = r0 instanceof com.amazon.aps.iva.xe0.e
            if (r1 == 0) goto L39
            r5 = r0
            com.amazon.aps.iva.xe0.e r5 = (com.amazon.aps.iva.xe0.e) r5
        L39:
            if (r5 == 0) goto L48
            java.lang.Throwable r0 = r5.o(r6)
            if (r0 != 0) goto L42
            goto L48
        L42:
            r6.n()
            r6.J(r0)
        L48:
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            return r0
        L4b:
            if (r0 == 0) goto L65
            com.amazon.aps.iva.ob0.d<T> r0 = r6.e
            boolean r1 = r0 instanceof com.amazon.aps.iva.xe0.e
            if (r1 == 0) goto L56
            r5 = r0
            com.amazon.aps.iva.xe0.e r5 = (com.amazon.aps.iva.xe0.e) r5
        L56:
            if (r5 == 0) goto L65
            java.lang.Throwable r0 = r5.o(r6)
            if (r0 != 0) goto L5f
            goto L65
        L5f:
            r6.n()
            r6.J(r0)
        L65:
            java.lang.Object r0 = r6._state
            boolean r1 = r0 instanceof com.amazon.aps.iva.se0.w
            if (r1 != 0) goto L95
            int r1 = r6.d
            if (r1 == r3) goto L73
            if (r1 != r2) goto L72
            goto L73
        L72:
            r3 = r4
        L73:
            if (r3 == 0) goto L90
            com.amazon.aps.iva.ob0.g r1 = r6.f
            com.amazon.aps.iva.se0.j1$b r2 = com.amazon.aps.iva.se0.j1.b.b
            com.amazon.aps.iva.ob0.g$b r1 = r1.get(r2)
            com.amazon.aps.iva.se0.j1 r1 = (com.amazon.aps.iva.se0.j1) r1
            if (r1 == 0) goto L90
            boolean r2 = r1.isActive()
            if (r2 == 0) goto L88
            goto L90
        L88:
            java.util.concurrent.CancellationException r1 = r1.p()
            r6.a(r0, r1)
            throw r1
        L90:
            java.lang.Object r0 = r6.g(r0)
            return r0
        L95:
            com.amazon.aps.iva.se0.w r0 = (com.amazon.aps.iva.se0.w) r0
            java.lang.Throwable r0 = r0.a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.se0.n.q():java.lang.Object");
    }

    public final void r() {
        t0 s = s();
        if (s != null && c()) {
            s.dispose();
            this.g = w1.b;
        }
    }

    @Override // com.amazon.aps.iva.ob0.d
    public final void resumeWith(Object obj) {
        Throwable a = com.amazon.aps.iva.kb0.k.a(obj);
        if (a != null) {
            obj = new w(a, false);
        }
        A(obj, this.d, null);
    }

    public final t0 s() {
        j1 j1Var = (j1) this.f.get(j1.b.b);
        if (j1Var == null) {
            return null;
        }
        t0 a = j1.a.a(j1Var, true, new p(this), 2);
        this.g = a;
        return a;
    }

    public final boolean t() {
        boolean z;
        if (this.d == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z && ((com.amazon.aps.iva.xe0.e) this.e).k()) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(j0.g(this.e));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof x1) {
            str = "Active";
        } else if (obj instanceof o) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(j0.e(this));
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.se0.m
    public final void v(d0 d0Var, com.amazon.aps.iva.kb0.q qVar) {
        com.amazon.aps.iva.xe0.e eVar;
        d0 d0Var2;
        int i2;
        com.amazon.aps.iva.ob0.d<T> dVar = this.e;
        if (dVar instanceof com.amazon.aps.iva.xe0.e) {
            eVar = (com.amazon.aps.iva.xe0.e) dVar;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            d0Var2 = eVar.e;
        } else {
            d0Var2 = null;
        }
        if (d0Var2 == d0Var) {
            i2 = 4;
        } else {
            i2 = this.d;
        }
        A(qVar, i2, null);
    }

    @Override // com.amazon.aps.iva.se0.m
    public final void w(com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar) {
        k jVar;
        boolean z;
        if (lVar instanceof k) {
            jVar = (k) lVar;
        } else {
            jVar = new j(lVar, 1);
        }
        while (true) {
            Object obj = this._state;
            boolean z2 = false;
            if (obj instanceof b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, jVar)) {
                        z2 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (z2) {
                    return;
                }
            } else {
                Throwable th = null;
                if (!(obj instanceof k)) {
                    boolean z3 = obj instanceof w;
                    if (z3) {
                        w wVar = (w) obj;
                        wVar.getClass();
                        if (w.b.compareAndSet(wVar, 0, 1)) {
                            if (obj instanceof o) {
                                if (!z3) {
                                    wVar = null;
                                }
                                if (wVar != null) {
                                    th = wVar.a;
                                }
                                k(th, lVar);
                                return;
                            }
                            return;
                        }
                        u(obj, lVar);
                        throw null;
                    } else if (obj instanceof v) {
                        v vVar = (v) obj;
                        if (vVar.b == null) {
                            if (jVar instanceof f) {
                                return;
                            }
                            Throwable th2 = vVar.e;
                            if (th2 != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                k(th2, lVar);
                                return;
                            }
                            v a = v.a(vVar, jVar, null, 29);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i;
                            while (true) {
                                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, a)) {
                                    z2 = true;
                                    break;
                                } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                    break;
                                }
                            }
                            if (z2) {
                                return;
                            }
                        } else {
                            u(obj, lVar);
                            throw null;
                        }
                    } else if (jVar instanceof f) {
                        return;
                    } else {
                        v vVar2 = new v(obj, jVar, null, null, null, 28);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = i;
                        while (true) {
                            if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, vVar2)) {
                                z2 = true;
                                break;
                            } else if (atomicReferenceFieldUpdater3.get(this) != obj) {
                                break;
                            }
                        }
                        if (z2) {
                            return;
                        }
                    }
                } else {
                    u(obj, lVar);
                    throw null;
                }
            }
        }
    }

    public String x() {
        return "CancellableContinuation";
    }

    public final boolean y() {
        Object obj = this._state;
        if ((obj instanceof v) && ((v) obj).d != null) {
            n();
            return false;
        }
        this._decision = 0;
        this._state = b.b;
        return true;
    }

    @Override // com.amazon.aps.iva.se0.m
    public final com.amazon.aps.iva.xe0.s z(Throwable th) {
        return C(new w(th, false), null, null);
    }
}
