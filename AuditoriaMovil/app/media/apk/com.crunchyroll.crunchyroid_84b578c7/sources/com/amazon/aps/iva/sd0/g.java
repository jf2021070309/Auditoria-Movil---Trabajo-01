package com.amazon.aps.iva.sd0;

import com.amazon.aps.iva.ee0.e0;
/* compiled from: constantValues.kt */
/* loaded from: classes4.dex */
public abstract class g<T> {
    public final T a;

    public g(T t) {
        this.a = t;
    }

    public abstract e0 a(com.amazon.aps.iva.oc0.c0 c0Var);

    public T b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        g gVar;
        if (this != obj) {
            T b = b();
            Object obj2 = null;
            if (obj instanceof g) {
                gVar = (g) obj;
            } else {
                gVar = null;
            }
            if (gVar != null) {
                obj2 = gVar.b();
            }
            if (!com.amazon.aps.iva.yb0.j.a(b, obj2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        T b = b();
        if (b != null) {
            return b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
