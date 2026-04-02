package com.amazon.aps.iva.kb0;

import com.amazon.aps.iva.e4.l1;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: LazyJVM.kt */
/* loaded from: classes4.dex */
public final class l<T> implements e<T>, Serializable {
    public static final AtomicReferenceFieldUpdater<l<?>, Object> d = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "c");
    public volatile com.amazon.aps.iva.xb0.a<? extends T> b;
    public volatile Object c;

    public l(com.amazon.aps.iva.xb0.a<? extends T> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "initializer");
        this.b = aVar;
        this.c = l1.a;
    }

    @Override // com.amazon.aps.iva.kb0.e
    public final T getValue() {
        boolean z;
        T t = (T) this.c;
        l1 l1Var = l1.a;
        if (t != l1Var) {
            return t;
        }
        com.amazon.aps.iva.xb0.a<? extends T> aVar = this.b;
        if (aVar != null) {
            T invoke = aVar.invoke();
            AtomicReferenceFieldUpdater<l<?>, Object> atomicReferenceFieldUpdater = d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, l1Var, invoke)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != l1Var) {
                    z = false;
                    break;
                }
            }
            if (z) {
                this.b = null;
                return invoke;
            }
        }
        return (T) this.c;
    }

    public final String toString() {
        boolean z;
        if (this.c != l1.a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
