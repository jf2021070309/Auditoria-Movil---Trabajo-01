package e.d.d.m.j.l;

import e.d.d.m.j.l.c0;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class y extends c0.b {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7487b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7488c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7489d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7490e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7491f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7492g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7493h;

    /* renamed from: i  reason: collision with root package name */
    public final String f7494i;

    public y(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
        this.a = i2;
        Objects.requireNonNull(str, "Null model");
        this.f7487b = str;
        this.f7488c = i3;
        this.f7489d = j2;
        this.f7490e = j3;
        this.f7491f = z;
        this.f7492g = i4;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f7493h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f7494i = str3;
    }

    @Override // e.d.d.m.j.l.c0.b
    public int a() {
        return this.a;
    }

    @Override // e.d.d.m.j.l.c0.b
    public int b() {
        return this.f7488c;
    }

    @Override // e.d.d.m.j.l.c0.b
    public long c() {
        return this.f7490e;
    }

    @Override // e.d.d.m.j.l.c0.b
    public boolean d() {
        return this.f7491f;
    }

    @Override // e.d.d.m.j.l.c0.b
    public String e() {
        return this.f7493h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.b) {
            c0.b bVar = (c0.b) obj;
            return this.a == bVar.a() && this.f7487b.equals(bVar.f()) && this.f7488c == bVar.b() && this.f7489d == bVar.i() && this.f7490e == bVar.c() && this.f7491f == bVar.d() && this.f7492g == bVar.h() && this.f7493h.equals(bVar.e()) && this.f7494i.equals(bVar.g());
        }
        return false;
    }

    @Override // e.d.d.m.j.l.c0.b
    public String f() {
        return this.f7487b;
    }

    @Override // e.d.d.m.j.l.c0.b
    public String g() {
        return this.f7494i;
    }

    @Override // e.d.d.m.j.l.c0.b
    public int h() {
        return this.f7492g;
    }

    public int hashCode() {
        long j2 = this.f7489d;
        long j3 = this.f7490e;
        return ((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.f7487b.hashCode()) * 1000003) ^ this.f7488c) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f7491f ? 1231 : 1237)) * 1000003) ^ this.f7492g) * 1000003) ^ this.f7493h.hashCode()) * 1000003) ^ this.f7494i.hashCode();
    }

    @Override // e.d.d.m.j.l.c0.b
    public long i() {
        return this.f7489d;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("DeviceData{arch=");
        y.append(this.a);
        y.append(", model=");
        y.append(this.f7487b);
        y.append(", availableProcessors=");
        y.append(this.f7488c);
        y.append(", totalRam=");
        y.append(this.f7489d);
        y.append(", diskSpace=");
        y.append(this.f7490e);
        y.append(", isEmulator=");
        y.append(this.f7491f);
        y.append(", state=");
        y.append(this.f7492g);
        y.append(", manufacturer=");
        y.append(this.f7493h);
        y.append(", modelClass=");
        return e.a.d.a.a.r(y, this.f7494i, "}");
    }
}
