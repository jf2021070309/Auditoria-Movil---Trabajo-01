package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.b8.l1;
import com.google.gson.annotations.SerializedName;
/* compiled from: LocalVideo.kt */
/* loaded from: classes2.dex */
public abstract class e0 {

    /* compiled from: LocalVideo.kt */
    /* loaded from: classes2.dex */
    public static final class a extends e0 {
        @SerializedName("id")
        private final String a;
        @SerializedName("parentId")
        private final String b;
        @SerializedName("seasonId")
        private final String c;
        @SerializedName("parentType")
        private final com.amazon.aps.iva.x50.t d;
        @SerializedName("state")
        private final b e;

        public a(String str, String str2, String str3, com.amazon.aps.iva.x50.t tVar, b bVar) {
            com.amazon.aps.iva.yb0.j.f(str, "id");
            com.amazon.aps.iva.yb0.j.f(str2, "parentId");
            com.amazon.aps.iva.yb0.j.f(tVar, "parentType");
            com.amazon.aps.iva.yb0.j.f(bVar, "state");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = tVar;
            this.e = bVar;
        }

        public static a o(a aVar, b bVar) {
            String str = aVar.a;
            String str2 = aVar.b;
            String str3 = aVar.c;
            com.amazon.aps.iva.x50.t tVar = aVar.d;
            aVar.getClass();
            com.amazon.aps.iva.yb0.j.f(str, "id");
            com.amazon.aps.iva.yb0.j.f(str2, "parentId");
            com.amazon.aps.iva.yb0.j.f(tVar, "parentType");
            com.amazon.aps.iva.yb0.j.f(bVar, "state");
            return new a(str, str2, str3, tVar, bVar);
        }

        @Override // com.ellation.crunchyroll.downloading.e0
        public final long b() {
            return 0L;
        }

        @Override // com.ellation.crunchyroll.downloading.e0
        public final long c() {
            return 0L;
        }

        @Override // com.ellation.crunchyroll.downloading.e0
        public final int d() {
            return 0;
        }

        @Override // com.ellation.crunchyroll.downloading.e0
        public final String e() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
            return false;
        }

        @Override // com.ellation.crunchyroll.downloading.e0
        public final b g() {
            return this.e;
        }

        @Override // com.ellation.crunchyroll.downloading.e0
        public final int h() {
            return 0;
        }

        public final int hashCode() {
            int hashCode;
            int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
            String str = this.c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return this.e.hashCode() + l1.a(this.d, (b + hashCode) * 31, 31);
        }

        @Override // com.ellation.crunchyroll.downloading.e0
        public final e0 n(b bVar) {
            com.amazon.aps.iva.yb0.j.f(bVar, "state");
            return o(this, bVar);
        }

        public final String p() {
            return this.b;
        }

        public final com.amazon.aps.iva.x50.t q() {
            return this.d;
        }

        public final String r() {
            return this.c;
        }

        public final boolean s() {
            if (this.e == b.INFO_LOADED) {
                return true;
            }
            return false;
        }

        public final String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            com.amazon.aps.iva.x50.t tVar = this.d;
            b bVar = this.e;
            StringBuilder b = com.amazon.aps.iva.n4.a.b("FakeLocalVideo(id=", str, ", parentId=", str2, ", seasonId=");
            b.append(str3);
            b.append(", parentType=");
            b.append(tVar);
            b.append(", state=");
            b.append(bVar);
            b.append(")");
            return b.toString();
        }
    }

    /* compiled from: LocalVideo.kt */
    /* loaded from: classes2.dex */
    public enum b {
        NEW,
        INFO_LOADED,
        STARTED,
        PAUSED,
        IN_PROGRESS,
        COMPLETED,
        FAILED,
        EXPIRED
    }

    /* compiled from: LocalVideo.kt */
    /* loaded from: classes2.dex */
    public static final class c extends e0 {
        public final String a;
        public final b b;
        public final long c;
        public final long d;
        public final int e;
        public final int f;
        public final double g;

        public c(String str, b bVar, long j, long j2, int i, int i2, double d) {
            com.amazon.aps.iva.yb0.j.f(str, "id");
            com.amazon.aps.iva.yb0.j.f(bVar, "state");
            this.a = str;
            this.b = bVar;
            this.c = j;
            this.d = j2;
            this.e = i;
            this.f = i2;
            this.g = d;
        }

        public static c o(c cVar, b bVar) {
            String str = cVar.a;
            long j = cVar.c;
            long j2 = cVar.d;
            int i = cVar.e;
            int i2 = cVar.f;
            double d = cVar.g;
            cVar.getClass();
            com.amazon.aps.iva.yb0.j.f(str, "id");
            com.amazon.aps.iva.yb0.j.f(bVar, "state");
            return new c(str, bVar, j, j2, i, i2, d);
        }

        @Override // com.ellation.crunchyroll.downloading.e0
        public final long b() {
            return this.c;
        }

        @Override // com.ellation.crunchyroll.downloading.e0
        public final long c() {
            return this.d;
        }

        @Override // com.ellation.crunchyroll.downloading.e0
        public final int d() {
            return this.f;
        }

        @Override // com.ellation.crunchyroll.downloading.e0
        public final String e() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && Double.compare(this.g, cVar.g) == 0) {
                return true;
            }
            return false;
        }

        @Override // com.ellation.crunchyroll.downloading.e0
        public final double f() {
            return this.g;
        }

        @Override // com.ellation.crunchyroll.downloading.e0
        public final b g() {
            return this.b;
        }

        @Override // com.ellation.crunchyroll.downloading.e0
        public final int h() {
            return this.e;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode();
            return Double.hashCode(this.g) + com.amazon.aps.iva.a0.r.a(this.f, com.amazon.aps.iva.a0.r.a(this.e, com.amazon.aps.iva.b8.i.a(this.d, com.amazon.aps.iva.b8.i.a(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31);
        }

        @Override // com.ellation.crunchyroll.downloading.e0
        public final e0 n(b bVar) {
            com.amazon.aps.iva.yb0.j.f(bVar, "state");
            return o(this, bVar);
        }

        public final String toString() {
            return "StartedLocalVideo(id=" + this.a + ", state=" + this.b + ", downloadedSizeBytes=" + this.c + ", estimatedSizeBytes=" + this.d + ", width=" + this.e + ", height=" + this.f + ", progress=" + this.g + ")";
        }
    }

    public final e0 a(b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "state");
        if (this instanceof a) {
            return a.o((a) this, bVar);
        }
        if (this instanceof c) {
            return c.o((c) this, bVar);
        }
        throw new com.amazon.aps.iva.kb0.h();
    }

    public abstract long b();

    public abstract long c();

    public abstract int d();

    public abstract String e();

    public double f() {
        return 0.0d;
    }

    public abstract b g();

    public abstract int h();

    public final boolean i() {
        if (g() == b.COMPLETED) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (g() == b.EXPIRED) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (g() == b.FAILED) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (g() == b.IN_PROGRESS && !m()) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (g() != b.NEW && g() != b.INFO_LOADED && (f() > 0.0d || k())) {
            return false;
        }
        return true;
    }

    public abstract e0 n(b bVar);
}
