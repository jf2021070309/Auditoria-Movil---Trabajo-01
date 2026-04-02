package com.amazon.aps.iva.ss;

import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
/* compiled from: BillingPeriodParser.kt */
/* loaded from: classes2.dex */
public final class b implements Serializable {
    public final int b;
    public final a c;

    public b(int i, a aVar) {
        j.f(aVar, "timeUnit");
        this.b = i;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.b == bVar.b && this.c == bVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "BillingPeriod(number=" + this.b + ", timeUnit=" + this.c + ")";
    }
}
