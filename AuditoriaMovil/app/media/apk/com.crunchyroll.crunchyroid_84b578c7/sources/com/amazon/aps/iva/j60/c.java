package com.amazon.aps.iva.j60;
/* compiled from: EmptyCtaLayout.kt */
/* loaded from: classes2.dex */
public final class c {
    public final int a;
    public final int b;

    public c(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a == cVar.a && this.b == cVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmptyCtaViewUiModel(primaryButtonRes=");
        sb.append(this.a);
        sb.append(", primaryButtonAmazonRes=");
        return e.f(sb, this.b, ")");
    }
}
