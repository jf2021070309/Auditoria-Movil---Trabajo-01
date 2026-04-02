package com.amazon.aps.iva.qq;

import com.amazon.aps.iva.yb0.j;
/* compiled from: DatadogContext.kt */
/* loaded from: classes2.dex */
public final class a {
    public final c a;

    public a() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && j.a(this.a, ((a) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        c cVar = this.a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "DatadogContext(rum=" + this.a + ")";
    }

    public a(c cVar) {
        this.a = cVar;
    }
}
