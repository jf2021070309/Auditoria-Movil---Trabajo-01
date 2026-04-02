package com.amazon.aps.iva.kb0;

import com.amazon.aps.iva.e4.l1;
import java.io.Serializable;
/* compiled from: Lazy.kt */
/* loaded from: classes4.dex */
public final class r<T> implements e<T>, Serializable {
    public com.amazon.aps.iva.xb0.a<? extends T> b;
    public Object c;

    public r(com.amazon.aps.iva.xb0.a<? extends T> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "initializer");
        this.b = aVar;
        this.c = l1.a;
    }

    @Override // com.amazon.aps.iva.kb0.e
    public final T getValue() {
        if (this.c == l1.a) {
            com.amazon.aps.iva.xb0.a<? extends T> aVar = this.b;
            com.amazon.aps.iva.yb0.j.c(aVar);
            this.c = aVar.invoke();
            this.b = null;
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
