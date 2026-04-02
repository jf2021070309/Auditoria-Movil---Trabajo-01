package com.amazon.aps.iva.ee0;
/* compiled from: ClassifierBasedTypeConstructor.kt */
/* loaded from: classes4.dex */
public abstract class n implements c1 {
    public int a;

    public abstract boolean c(com.amazon.aps.iva.oc0.h hVar);

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1) || obj.hashCode() != hashCode()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (c1Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        com.amazon.aps.iva.oc0.h k = k();
        com.amazon.aps.iva.oc0.h k2 = c1Var.k();
        if (k2 == null) {
            return false;
        }
        if (!com.amazon.aps.iva.ge0.k.f(k) && !com.amazon.aps.iva.qd0.i.o(k)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (com.amazon.aps.iva.ge0.k.f(k2) || com.amazon.aps.iva.qd0.i.o(k2)) {
                z2 = false;
            }
            if (z2) {
                return c(k2);
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z;
        int identityHashCode;
        int i = this.a;
        if (i != 0) {
            return i;
        }
        com.amazon.aps.iva.oc0.h k = k();
        if (!com.amazon.aps.iva.ge0.k.f(k) && !com.amazon.aps.iva.qd0.i.o(k)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            identityHashCode = com.amazon.aps.iva.qd0.i.g(k).hashCode();
        } else {
            identityHashCode = System.identityHashCode(this);
        }
        this.a = identityHashCode;
        return identityHashCode;
    }
}
