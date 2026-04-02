package e.c.a.m.s;

import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class e implements e.c.a.m.k {

    /* renamed from: b  reason: collision with root package name */
    public final e.c.a.m.k f5654b;

    /* renamed from: c  reason: collision with root package name */
    public final e.c.a.m.k f5655c;

    public e(e.c.a.m.k kVar, e.c.a.m.k kVar2) {
        this.f5654b = kVar;
        this.f5655c = kVar2;
    }

    @Override // e.c.a.m.k
    public void a(MessageDigest messageDigest) {
        this.f5654b.a(messageDigest);
        this.f5655c.a(messageDigest);
    }

    @Override // e.c.a.m.k
    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f5654b.equals(eVar.f5654b) && this.f5655c.equals(eVar.f5655c);
        }
        return false;
    }

    @Override // e.c.a.m.k
    public int hashCode() {
        return this.f5655c.hashCode() + (this.f5654b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("DataCacheKey{sourceKey=");
        y.append(this.f5654b);
        y.append(", signature=");
        y.append(this.f5655c);
        y.append('}');
        return y.toString();
    }
}
