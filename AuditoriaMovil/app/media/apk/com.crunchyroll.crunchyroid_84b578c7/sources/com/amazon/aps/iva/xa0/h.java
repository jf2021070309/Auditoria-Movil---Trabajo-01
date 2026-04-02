package com.amazon.aps.iva.xa0;

import com.amazon.aps.iva.a0.r;
/* compiled from: ViewDimensions.kt */
/* loaded from: classes4.dex */
public final class h {
    public static final h e = new h(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public h(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.a != hVar.a || this.b != hVar.b || this.c != hVar.c || this.d != hVar.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + r.a(this.c, r.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewDimensions(left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return defpackage.e.f(sb, this.d, ")");
    }
}
