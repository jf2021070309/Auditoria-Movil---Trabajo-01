package com.amazon.aps.iva.cn;

import com.amazon.aps.iva.e4.t0;
/* compiled from: AvatarIconStyleV2.kt */
/* loaded from: classes2.dex */
public final class c {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public c(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (com.amazon.aps.iva.o2.e.a(this.a, cVar.a) && com.amazon.aps.iva.o2.e.a(this.b, cVar.b) && com.amazon.aps.iva.o2.e.a(this.c, cVar.c) && com.amazon.aps.iva.o2.e.a(this.d, cVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + t0.b(this.c, t0.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        String b = com.amazon.aps.iva.o2.e.b(this.a);
        String b2 = com.amazon.aps.iva.o2.e.b(this.b);
        return com.amazon.aps.iva.ab.f.a(com.amazon.aps.iva.n4.a.b("AvatarIconStyleV2SizeSpec(containerSize=", b, ", maxBorderWidth=", b2, ", statusIconSize="), com.amazon.aps.iva.o2.e.b(this.c), ", statusIconPadding=", com.amazon.aps.iva.o2.e.b(this.d), ")");
    }

    public c(float f, int i) {
        this((i & 1) != 0 ? 120 : f, (i & 2) != 0 ? 4 : 0.0f, (i & 4) != 0 ? 32 : 0.0f, (i & 8) != 0 ? 6 : 0.0f);
    }
}
