package c.i.e;

import android.graphics.Insets;
/* loaded from: classes.dex */
public final class c {
    public static final c a = new c(0, 0, 0, 0);

    /* renamed from: b  reason: collision with root package name */
    public final int f2035b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2036c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2037d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2038e;

    public c(int i2, int i3, int i4, int i5) {
        this.f2035b = i2;
        this.f2036c = i3;
        this.f2037d = i4;
        this.f2038e = i5;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f2035b, cVar2.f2035b), Math.max(cVar.f2036c, cVar2.f2036c), Math.max(cVar.f2037d, cVar2.f2037d), Math.max(cVar.f2038e, cVar2.f2038e));
    }

    public static c b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? a : new c(i2, i3, i4, i5);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets d() {
        return Insets.of(this.f2035b, this.f2036c, this.f2037d, this.f2038e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2038e == cVar.f2038e && this.f2035b == cVar.f2035b && this.f2037d == cVar.f2037d && this.f2036c == cVar.f2036c;
    }

    public int hashCode() {
        return (((((this.f2035b * 31) + this.f2036c) * 31) + this.f2037d) * 31) + this.f2038e;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Insets{left=");
        y.append(this.f2035b);
        y.append(", top=");
        y.append(this.f2036c);
        y.append(", right=");
        y.append(this.f2037d);
        y.append(", bottom=");
        y.append(this.f2038e);
        y.append('}');
        return y.toString();
    }
}
