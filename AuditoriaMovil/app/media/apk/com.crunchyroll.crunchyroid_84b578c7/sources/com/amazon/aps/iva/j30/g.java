package com.amazon.aps.iva.j30;
/* compiled from: UpsellV2Input.kt */
/* loaded from: classes2.dex */
public final class g {
    public final boolean a;
    public final int b;
    public final int c;

    public g(int i, int i2, boolean z) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.a == gVar.a && this.b == gVar.b && this.c == gVar.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return Integer.hashCode(this.c) + com.amazon.aps.iva.a0.r.a(this.b, r0 * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpsellV2Input(allowSkippingSubscription=");
        sb.append(this.a);
        sb.append(", ctaButtonText=");
        sb.append(this.b);
        sb.append(", ctaButtonTextWithIntroOffer=");
        return defpackage.e.f(sb, this.c, ")");
    }
}
