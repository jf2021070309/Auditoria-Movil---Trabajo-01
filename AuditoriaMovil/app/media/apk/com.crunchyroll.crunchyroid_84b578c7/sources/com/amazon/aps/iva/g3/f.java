package com.amazon.aps.iva.g3;

import android.graphics.Insets;
import com.amazon.aps.iva.d0.b2;
/* compiled from: Insets.java */
/* loaded from: classes.dex */
public final class f {
    public static final f e = new f(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    /* compiled from: Insets.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Insets a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public f(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static f a(f fVar, f fVar2) {
        return b(Math.max(fVar.a, fVar2.a), Math.max(fVar.b, fVar2.b), Math.max(fVar.c, fVar2.c), Math.max(fVar.d, fVar2.d));
    }

    public static f b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new f(i, i2, i3, i4);
    }

    public static f c(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return b(i, i2, i3, i4);
    }

    public final Insets d() {
        return a.a(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.d == fVar.d && this.a == fVar.a && this.c == fVar.c && this.b == fVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return b2.b(sb, this.d, '}');
    }
}
