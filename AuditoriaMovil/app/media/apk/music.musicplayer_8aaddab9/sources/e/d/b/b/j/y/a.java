package e.d.b.b.j.y;

import e.d.b.b.j.n;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a extends f {
    public final Iterable<n> a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f6295b;

    public a(Iterable iterable, byte[] bArr, C0136a c0136a) {
        this.a = iterable;
        this.f6295b = bArr;
    }

    @Override // e.d.b.b.j.y.f
    public Iterable<n> a() {
        return this.a;
    }

    @Override // e.d.b.b.j.y.f
    public byte[] b() {
        return this.f6295b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.a.equals(fVar.a())) {
                if (Arrays.equals(this.f6295b, fVar instanceof a ? ((a) fVar).f6295b : fVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6295b);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("BackendRequest{events=");
        y.append(this.a);
        y.append(", extras=");
        y.append(Arrays.toString(this.f6295b));
        y.append("}");
        return y.toString();
    }
}
