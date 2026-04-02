package e.c.a.r;

import e.c.a.m.k;
import java.security.MessageDigest;
import java.util.Objects;
/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: b  reason: collision with root package name */
    public final Object f6017b;

    public b(Object obj) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f6017b = obj;
    }

    @Override // e.c.a.m.k
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f6017b.toString().getBytes(k.a));
    }

    @Override // e.c.a.m.k
    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f6017b.equals(((b) obj).f6017b);
        }
        return false;
    }

    @Override // e.c.a.m.k
    public int hashCode() {
        return this.f6017b.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("ObjectKey{object=");
        y.append(this.f6017b);
        y.append('}');
        return y.toString();
    }
}
