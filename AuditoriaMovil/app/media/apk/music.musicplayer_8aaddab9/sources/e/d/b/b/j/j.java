package e.d.b.b.j;

import e.d.b.b.j.r;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class j extends r {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f6264b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.b.b.d f6265c;

    /* loaded from: classes.dex */
    public static final class b extends r.a {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f6266b;

        /* renamed from: c  reason: collision with root package name */
        public e.d.b.b.d f6267c;

        @Override // e.d.b.b.j.r.a
        public r a() {
            String str = this.a == null ? " backendName" : "";
            if (this.f6267c == null) {
                str = e.a.d.a.a.k(str, " priority");
            }
            if (str.isEmpty()) {
                return new j(this.a, this.f6266b, this.f6267c, null);
            }
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
        }

        @Override // e.d.b.b.j.r.a
        public r.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.a = str;
            return this;
        }

        @Override // e.d.b.b.j.r.a
        public r.a c(e.d.b.b.d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f6267c = dVar;
            return this;
        }
    }

    public j(String str, byte[] bArr, e.d.b.b.d dVar, a aVar) {
        this.a = str;
        this.f6264b = bArr;
        this.f6265c = dVar;
    }

    @Override // e.d.b.b.j.r
    public String b() {
        return this.a;
    }

    @Override // e.d.b.b.j.r
    public byte[] c() {
        return this.f6264b;
    }

    @Override // e.d.b.b.j.r
    public e.d.b.b.d d() {
        return this.f6265c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.a.equals(rVar.b())) {
                if (Arrays.equals(this.f6264b, rVar instanceof j ? ((j) rVar).f6264b : rVar.c()) && this.f6265c.equals(rVar.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6264b)) * 1000003) ^ this.f6265c.hashCode();
    }
}
