package com.amazon.aps.iva.nl;
/* compiled from: AudioSettingOption.kt */
/* loaded from: classes2.dex */
public final class a {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public a(String str, String str2, boolean z, boolean z2, boolean z3) {
        com.amazon.aps.iva.yb0.j.f(str, "mediaId");
        com.amazon.aps.iva.yb0.j.f(str2, "text");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
        int i = 1;
        boolean z = this.c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (b + i2) * 31;
        boolean z2 = this.d;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z3 = this.e;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSettingOption(mediaId=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", isPremiumBlocked=");
        sb.append(this.c);
        sb.append(", isSelected=");
        sb.append(this.d);
        sb.append(", isOriginal=");
        return com.amazon.aps.iva.e4.e.c(sb, this.e, ")");
    }
}
