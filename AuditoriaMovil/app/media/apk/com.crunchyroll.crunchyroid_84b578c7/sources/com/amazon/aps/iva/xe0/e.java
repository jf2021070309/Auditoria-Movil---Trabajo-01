package com.amazon.aps.iva.xe0;

import com.amazon.aps.iva.se0.d0;
import com.amazon.aps.iva.se0.g2;
import com.amazon.aps.iva.se0.j0;
import com.amazon.aps.iva.se0.q0;
import com.amazon.aps.iva.se0.x0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes4.dex */
public final class e<T> extends q0<T> implements com.amazon.aps.iva.qb0.d, com.amazon.aps.iva.ob0.d<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;
    public final d0 e;
    public final com.amazon.aps.iva.ob0.d<T> f;
    public Object g;
    public final Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public e(d0 d0Var, com.amazon.aps.iva.ob0.d<? super T> dVar) {
        super(-1);
        this.e = d0Var;
        this.f = dVar;
        this.g = com.amazon.aps.iva.cq.b.f;
        this.h = u.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    @Override // com.amazon.aps.iva.se0.q0
    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof com.amazon.aps.iva.se0.x) {
            ((com.amazon.aps.iva.se0.x) obj).b.invoke(cancellationException);
        }
    }

    @Override // com.amazon.aps.iva.qb0.d
    public final com.amazon.aps.iva.qb0.d getCallerFrame() {
        com.amazon.aps.iva.ob0.d<T> dVar = this.f;
        if (dVar instanceof com.amazon.aps.iva.qb0.d) {
            return (com.amazon.aps.iva.qb0.d) dVar;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.ob0.d
    public final com.amazon.aps.iva.ob0.g getContext() {
        return this.f.getContext();
    }

    @Override // com.amazon.aps.iva.se0.q0
    public final Object i() {
        Object obj = this.g;
        this.g = com.amazon.aps.iva.cq.b.f;
        return obj;
    }

    public final com.amazon.aps.iva.se0.n<T> j() {
        boolean z;
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            s sVar = com.amazon.aps.iva.cq.b.g;
            if (obj == null) {
                this._reusableCancellableContinuation = sVar;
                return null;
            } else if (obj instanceof com.amazon.aps.iva.se0.n) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return (com.amazon.aps.iva.se0.n) obj;
                }
            } else if (obj != sVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean k() {
        if (this._reusableCancellableContinuation != null) {
            return true;
        }
        return false;
    }

    public final boolean m(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            s sVar = com.amazon.aps.iva.cq.b.g;
            boolean z = false;
            boolean z2 = true;
            if (com.amazon.aps.iva.yb0.j.a(obj, sVar)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, th)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != sVar) {
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z2 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z2) {
                    return false;
                }
            }
        }
    }

    public final void n() {
        com.amazon.aps.iva.se0.n nVar;
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof com.amazon.aps.iva.se0.n) {
            nVar = (com.amazon.aps.iva.se0.n) obj;
        } else {
            nVar = null;
        }
        if (nVar != null) {
            nVar.n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0019, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Throwable o(com.amazon.aps.iva.se0.m<?> r7) {
        /*
            r6 = this;
        L0:
            java.lang.Object r0 = r6._reusableCancellableContinuation
            com.amazon.aps.iva.xe0.s r1 = com.amazon.aps.iva.cq.b.g
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L1c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = com.amazon.aps.iva.xe0.e.i
        Lb:
            boolean r0 = r5.compareAndSet(r6, r1, r7)
            if (r0 == 0) goto L13
            r3 = r4
            goto L19
        L13:
            java.lang.Object r0 = r5.get(r6)
            if (r0 == r1) goto Lb
        L19:
            if (r3 == 0) goto L0
            return r2
        L1c:
            boolean r7 = r0 instanceof java.lang.Throwable
            if (r7 == 0) goto L41
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = com.amazon.aps.iva.xe0.e.i
        L22:
            boolean r1 = r7.compareAndSet(r6, r0, r2)
            if (r1 == 0) goto L2a
            r3 = r4
            goto L30
        L2a:
            java.lang.Object r1 = r7.get(r6)
            if (r1 == r0) goto L22
        L30:
            if (r3 == 0) goto L35
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        L35:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L41:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Inconsistent state "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xe0.e.o(com.amazon.aps.iva.se0.m):java.lang.Throwable");
    }

    @Override // com.amazon.aps.iva.ob0.d
    public final void resumeWith(Object obj) {
        Object wVar;
        com.amazon.aps.iva.ob0.d<T> dVar = this.f;
        com.amazon.aps.iva.ob0.g context = dVar.getContext();
        Throwable a = com.amazon.aps.iva.kb0.k.a(obj);
        if (a == null) {
            wVar = obj;
        } else {
            wVar = new com.amazon.aps.iva.se0.w(a, false);
        }
        d0 d0Var = this.e;
        if (d0Var.B()) {
            this.g = wVar;
            this.d = 0;
            d0Var.x(context, this);
            return;
        }
        x0 a2 = g2.a();
        if (a2.V()) {
            this.g = wVar;
            this.d = 0;
            a2.L(this);
            return;
        }
        a2.M(true);
        try {
            com.amazon.aps.iva.ob0.g context2 = getContext();
            Object c = u.c(context2, this.h);
            dVar.resumeWith(obj);
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            u.a(context2, c);
            do {
            } while (a2.a0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.e + ", " + j0.g(this.f) + ']';
    }

    @Override // com.amazon.aps.iva.se0.q0
    public final com.amazon.aps.iva.ob0.d<T> b() {
        return this;
    }
}
