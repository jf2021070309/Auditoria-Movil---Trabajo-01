package com.amazon.aps.iva.le;
/* compiled from: VerifyNumberScreen.kt */
/* loaded from: classes.dex */
public final class i {
    public final String a;
    public final boolean b;
    public final boolean c;

    public i(String str, boolean z, boolean z2) {
        com.amazon.aps.iva.yb0.j.f(str, "phoneNumber");
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, iVar.a) && this.b == iVar.b && this.c == iVar.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 1;
        boolean z = this.b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        boolean z2 = this.c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyNumberState(phoneNumber=");
        sb.append(this.a);
        sb.append(", isSignUpFlow=");
        sb.append(this.b);
        sb.append(", isOptInCheckboxEnabled=");
        return com.amazon.aps.iva.e4.e.c(sb, this.c, ")");
    }
}
