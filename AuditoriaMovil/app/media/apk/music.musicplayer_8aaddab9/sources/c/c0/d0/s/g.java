package c.c0.d0.s;
/* loaded from: classes.dex */
public class g {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1498b;

    public g(String str, int i2) {
        this.a = str;
        this.f1498b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f1498b != gVar.f1498b) {
                return false;
            }
            return this.a.equals(gVar.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.f1498b;
    }
}
