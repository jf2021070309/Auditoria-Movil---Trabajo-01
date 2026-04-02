package com.amazon.aps.iva.qf;

import com.amazon.aps.iva.a0.r;
/* compiled from: PlayerPremiumOverlayCopies.kt */
/* loaded from: classes.dex */
public final class b {
    public final int a;
    public final int b;
    public final int c;

    public b(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + r.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerPremiumOverlayCopies(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", subscriptionButtonText=");
        return e.f(sb, this.c, ")");
    }
}
