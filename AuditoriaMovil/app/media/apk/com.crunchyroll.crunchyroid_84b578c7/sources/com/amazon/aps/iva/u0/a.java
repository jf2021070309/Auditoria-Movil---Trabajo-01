package com.amazon.aps.iva.u0;

import com.amazon.aps.iva.d0.b2;
/* compiled from: MutableCounter.kt */
/* loaded from: classes.dex */
public final class a {
    public int a;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.a == ((a) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b2.b(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }

    public a(int i) {
        this.a = 0;
    }
}
