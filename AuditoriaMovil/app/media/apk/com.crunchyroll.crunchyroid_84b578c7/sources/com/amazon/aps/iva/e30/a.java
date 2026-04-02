package com.amazon.aps.iva.e30;
/* compiled from: SubscriptionCtaButtonUiModel.kt */
/* loaded from: classes2.dex */
public final class a {
    public final int a;
    public final int b;

    public a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.b == aVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionCtaButtonUiModel(icon=");
        sb.append(this.a);
        sb.append(", text=");
        return e.f(sb, this.b, ")");
    }
}
