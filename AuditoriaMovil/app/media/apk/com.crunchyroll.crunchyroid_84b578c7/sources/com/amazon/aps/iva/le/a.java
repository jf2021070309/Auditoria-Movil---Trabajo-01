package com.amazon.aps.iva.le;
/* compiled from: VerifyNumberInput.kt */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.ui.a {
    public final String b;
    public final boolean c;
    public final boolean d;

    public a(String str, boolean z, boolean z2) {
        com.amazon.aps.iva.yb0.j.f(str, "phoneNumber");
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        int i = 1;
        boolean z = this.c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        boolean z2 = this.d;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyNumberInput(phoneNumber=");
        sb.append(this.b);
        sb.append(", isSignUpFlow=");
        sb.append(this.c);
        sb.append(", isOptInCheckboxEnabled=");
        return com.amazon.aps.iva.e4.e.c(sb, this.d, ")");
    }
}
