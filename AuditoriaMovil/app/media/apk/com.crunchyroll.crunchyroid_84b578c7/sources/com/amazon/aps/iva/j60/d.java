package com.amazon.aps.iva.j60;
/* compiled from: EmptyView.kt */
/* loaded from: classes2.dex */
public final class d {
    public final int a;
    public final int b;

    public d(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && this.b == dVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmptyViewUiModel(titleStringRes=");
        sb.append(this.a);
        sb.append(", subtitleStringRes=");
        return e.f(sb, this.b, ")");
    }
}
