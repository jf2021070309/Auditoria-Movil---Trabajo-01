package e.c.a.m;

import e.c.a.m.l;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class m implements k {

    /* renamed from: b  reason: collision with root package name */
    public final c.f.a<l<?>, Object> f5559b = new e.c.a.s.b();

    @Override // e.c.a.m.k
    public void a(MessageDigest messageDigest) {
        int i2 = 0;
        while (true) {
            c.f.a<l<?>, Object> aVar = this.f5559b;
            if (i2 >= aVar.f1665g) {
                return;
            }
            l<?> h2 = aVar.h(i2);
            Object l2 = this.f5559b.l(i2);
            l.b<?> bVar = h2.f5556c;
            if (h2.f5558e == null) {
                h2.f5558e = h2.f5557d.getBytes(k.a);
            }
            bVar.a(h2.f5558e, l2, messageDigest);
            i2++;
        }
    }

    public <T> T c(l<T> lVar) {
        return this.f5559b.e(lVar) >= 0 ? (T) this.f5559b.getOrDefault(lVar, null) : lVar.f5555b;
    }

    public void d(m mVar) {
        this.f5559b.i(mVar.f5559b);
    }

    @Override // e.c.a.m.k
    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f5559b.equals(((m) obj).f5559b);
        }
        return false;
    }

    @Override // e.c.a.m.k
    public int hashCode() {
        return this.f5559b.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Options{values=");
        y.append(this.f5559b);
        y.append('}');
        return y.toString();
    }
}
