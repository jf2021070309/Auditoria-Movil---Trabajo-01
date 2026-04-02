package com.amazon.aps.iva.ob0;

import com.amazon.aps.iva.kb0.k;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: SafeContinuationJvm.kt */
/* loaded from: classes4.dex */
public final class i<T> implements d<T>, com.amazon.aps.iva.qb0.d {
    public static final AtomicReferenceFieldUpdater<i<?>, Object> c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");
    public final d<T> b;
    private volatile Object result;

    public i(com.amazon.aps.iva.pb0.a aVar, d dVar) {
        this.b = dVar;
        this.result = aVar;
    }

    public final Object a() {
        boolean z;
        Object obj = this.result;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.UNDECIDED;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater<i<?>, Object> atomicReferenceFieldUpdater = c;
            com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    z = false;
                    break;
                }
            }
            if (z) {
                return com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            }
            obj = this.result;
        }
        if (obj == com.amazon.aps.iva.pb0.a.RESUMED) {
            return com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        }
        if (!(obj instanceof k.a)) {
            return obj;
        }
        throw ((k.a) obj).b;
    }

    @Override // com.amazon.aps.iva.qb0.d
    public final com.amazon.aps.iva.qb0.d getCallerFrame() {
        d<T> dVar = this.b;
        if (dVar instanceof com.amazon.aps.iva.qb0.d) {
            return (com.amazon.aps.iva.qb0.d) dVar;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.ob0.d
    public final g getContext() {
        return this.b.getContext();
    }

    @Override // com.amazon.aps.iva.ob0.d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.UNDECIDED;
            boolean z = false;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater<i<?>, Object> atomicReferenceFieldUpdater = c;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                if (obj2 == aVar2) {
                    AtomicReferenceFieldUpdater<i<?>, Object> atomicReferenceFieldUpdater2 = c;
                    com.amazon.aps.iva.pb0.a aVar3 = com.amazon.aps.iva.pb0.a.RESUMED;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                            z = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                            break;
                        }
                    }
                    if (z) {
                        this.b.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(d<? super T> dVar) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.UNDECIDED;
        this.b = dVar;
        this.result = aVar;
    }
}
