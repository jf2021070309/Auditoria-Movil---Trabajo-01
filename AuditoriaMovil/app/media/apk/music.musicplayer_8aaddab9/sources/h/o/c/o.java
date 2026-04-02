package h.o.c;
/* loaded from: classes2.dex */
public abstract class o extends b implements h.r.f {
    public o() {
    }

    public o(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return u().equals(oVar.u()) && this.f8938d.equals(oVar.f8938d) && this.f8939e.equals(oVar.f8939e) && j.a(this.f8936b, oVar.f8936b);
        } else if (obj instanceof h.r.f) {
            return obj.equals(b());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.f8939e.hashCode() + e.a.d.a.a.x(this.f8938d, u().hashCode() * 31, 31);
    }

    public String toString() {
        h.r.a b2 = b();
        return b2 != this ? b2.toString() : e.a.d.a.a.r(e.a.d.a.a.y("property "), this.f8938d, " (Kotlin reflection is not available)");
    }
}
