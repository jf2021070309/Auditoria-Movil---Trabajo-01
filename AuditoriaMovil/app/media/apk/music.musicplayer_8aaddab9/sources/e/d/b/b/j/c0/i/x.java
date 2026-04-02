package e.d.b.b.j.c0.i;
/* loaded from: classes.dex */
public final class x extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public final long f6237b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6238c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6239d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6240e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6241f;

    public x(long j2, int i2, int i3, long j3, int i4, a aVar) {
        this.f6237b = j2;
        this.f6238c = i2;
        this.f6239d = i3;
        this.f6240e = j3;
        this.f6241f = i4;
    }

    @Override // e.d.b.b.j.c0.i.b0
    public int a() {
        return this.f6239d;
    }

    @Override // e.d.b.b.j.c0.i.b0
    public long b() {
        return this.f6240e;
    }

    @Override // e.d.b.b.j.c0.i.b0
    public int c() {
        return this.f6238c;
    }

    @Override // e.d.b.b.j.c0.i.b0
    public int d() {
        return this.f6241f;
    }

    @Override // e.d.b.b.j.c0.i.b0
    public long e() {
        return this.f6237b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            return this.f6237b == b0Var.e() && this.f6238c == b0Var.c() && this.f6239d == b0Var.a() && this.f6240e == b0Var.b() && this.f6241f == b0Var.d();
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f6237b;
        long j3 = this.f6240e;
        return this.f6241f ^ ((((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f6238c) * 1000003) ^ this.f6239d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("EventStoreConfig{maxStorageSizeInBytes=");
        y.append(this.f6237b);
        y.append(", loadBatchSize=");
        y.append(this.f6238c);
        y.append(", criticalSectionEnterTimeoutMs=");
        y.append(this.f6239d);
        y.append(", eventCleanUpAge=");
        y.append(this.f6240e);
        y.append(", maxBlobByteSizePerRow=");
        return e.a.d.a.a.p(y, this.f6241f, "}");
    }
}
