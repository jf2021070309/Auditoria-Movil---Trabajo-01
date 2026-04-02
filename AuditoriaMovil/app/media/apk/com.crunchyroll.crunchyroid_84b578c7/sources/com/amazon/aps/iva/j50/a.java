package com.amazon.aps.iva.j50;

import com.amazon.aps.iva.a0.r;
/* compiled from: RateButtonConfig.kt */
/* loaded from: classes2.dex */
public final class a {
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public a(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a = r.a(this.b, Integer.hashCode(this.a) * 31, 31);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Integer.hashCode(this.g) + r.a(this.f, r.a(this.e, r.a(this.d, (a + i) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RateButtonConfig(image=");
        sb.append(this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", hideRatesIfMissing=");
        sb.append(this.c);
        sb.append(", animationToDefault=");
        sb.append(this.d);
        sb.append(", animationToSelected=");
        sb.append(this.e);
        sb.append(", defaultContentDescription=");
        sb.append(this.f);
        sb.append(", selectedContentDescription=");
        return defpackage.e.f(sb, this.g, ")");
    }
}
