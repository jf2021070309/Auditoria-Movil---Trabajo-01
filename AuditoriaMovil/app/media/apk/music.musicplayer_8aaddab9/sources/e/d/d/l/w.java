package e.d.d.l;

import java.util.Objects;
/* loaded from: classes.dex */
public final class w {
    public final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7128b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7129c;

    public w(Class<?> cls, int i2, int i3) {
        Objects.requireNonNull(cls, "Null dependency anInterface.");
        this.a = cls;
        this.f7128b = i2;
        this.f7129c = i3;
    }

    public Class<?> a() {
        return this.a;
    }

    public boolean b() {
        return this.f7128b == 1;
    }

    public boolean c() {
        return this.f7128b == 2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            return this.a == wVar.a && this.f7128b == wVar.f7128b && this.f7129c == wVar.f7129c;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f7128b) * 1000003) ^ this.f7129c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i2 = this.f7128b;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i3 = this.f7129c;
        if (i3 == 0) {
            str = "direct";
        } else if (i3 == 1) {
            str = "provider";
        } else if (i3 != 2) {
            throw new AssertionError(e.a.d.a.a.e("Unsupported injection: ", i3));
        } else {
            str = "deferred";
        }
        return e.a.d.a.a.r(sb, str, "}");
    }
}
