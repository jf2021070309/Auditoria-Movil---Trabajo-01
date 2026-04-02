package com.amazon.aps.iva.lb0;

import java.util.Set;
/* compiled from: AbstractSet.kt */
/* loaded from: classes4.dex */
public abstract class i<E> extends a<E> implements Set<E> {
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        com.amazon.aps.iva.yb0.j.f(set, "other");
        if (size() != set.size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int i;
        int i2 = 0;
        for (E e : this) {
            if (e != null) {
                i = e.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }
}
