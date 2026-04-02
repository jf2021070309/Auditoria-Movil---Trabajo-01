package com.amazon.aps.iva.o0;
/* compiled from: ValueHolders.kt */
/* loaded from: classes.dex */
public final class r3<T> implements p3<T> {
    public final T b;

    public r3(T t) {
        this.b = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r3) && com.amazon.aps.iva.yb0.j.a(this.b, ((r3) obj).b)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.o0.p3
    public final T getValue() {
        return this.b;
    }

    public final int hashCode() {
        T t = this.b;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        return defpackage.b.b(new StringBuilder("StaticValueHolder(value="), this.b, ')');
    }
}
