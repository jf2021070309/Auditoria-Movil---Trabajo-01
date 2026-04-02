package h.o.c;

import java.util.Objects;
/* loaded from: classes2.dex */
public class h extends b implements g, h.r.d {

    /* renamed from: g  reason: collision with root package name */
    public final int f8945g;

    /* renamed from: h  reason: collision with root package name */
    public final int f8946h;

    public h(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f8945g = i2;
        this.f8946h = i3 >> 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return j.a(u(), hVar.u()) && this.f8938d.equals(hVar.f8938d) && this.f8939e.equals(hVar.f8939e) && this.f8946h == hVar.f8946h && this.f8945g == hVar.f8945g && j.a(this.f8936b, hVar.f8936b);
        } else if (obj instanceof h.r.d) {
            return obj.equals(b());
        } else {
            return false;
        }
    }

    @Override // h.o.c.g
    public int getArity() {
        return this.f8945g;
    }

    public int hashCode() {
        return this.f8939e.hashCode() + e.a.d.a.a.x(this.f8938d, u() == null ? 0 : u().hashCode() * 31, 31);
    }

    @Override // h.o.c.b
    public h.r.a t() {
        Objects.requireNonNull(r.a);
        return this;
    }

    public String toString() {
        h.r.a b2 = b();
        return b2 != this ? b2.toString() : "<init>".equals(this.f8938d) ? "constructor (Kotlin reflection is not available)" : e.a.d.a.a.r(e.a.d.a.a.y("function "), this.f8938d, " (Kotlin reflection is not available)");
    }
}
