package com.amazon.aps.iva.kb0;

import com.amazon.aps.iva.e4.l1;
import java.io.Serializable;
/* compiled from: LazyJVM.kt */
/* loaded from: classes4.dex */
public final class m<T> implements e<T>, Serializable {
    public com.amazon.aps.iva.xb0.a<? extends T> b;
    public volatile Object c;
    public final Object d;

    public m(com.amazon.aps.iva.xb0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "initializer");
        this.b = aVar;
        this.c = l1.a;
        this.d = this;
    }

    @Override // com.amazon.aps.iva.kb0.e
    public final T getValue() {
        T t;
        T t2 = (T) this.c;
        l1 l1Var = l1.a;
        if (t2 != l1Var) {
            return t2;
        }
        synchronized (this.d) {
            t = (T) this.c;
            if (t == l1Var) {
                com.amazon.aps.iva.xb0.a<? extends T> aVar = this.b;
                com.amazon.aps.iva.yb0.j.c(aVar);
                t = aVar.invoke();
                this.c = t;
                this.b = null;
            }
        }
        return t;
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
