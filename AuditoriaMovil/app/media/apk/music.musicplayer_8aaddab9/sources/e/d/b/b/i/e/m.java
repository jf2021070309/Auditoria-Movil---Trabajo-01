package e.d.b.b.i.e;
/* loaded from: classes.dex */
public final class m extends s {
    public final long a;

    public m(long j2) {
        this.a = j2;
    }

    @Override // e.d.b.b.i.e.s
    public long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof s) && this.a == ((s) obj).b();
    }

    public int hashCode() {
        long j2 = this.a;
        return 1000003 ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return e.a.d.a.a.q(e.a.d.a.a.y("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
