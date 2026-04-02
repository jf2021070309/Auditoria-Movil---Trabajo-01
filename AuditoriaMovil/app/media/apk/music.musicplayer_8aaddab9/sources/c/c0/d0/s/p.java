package c.c0.d0.s;

import c.c0.v;
import c.c0.y;
/* loaded from: classes.dex */
public final class p {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public y f1507b;

    /* renamed from: c  reason: collision with root package name */
    public String f1508c;

    /* renamed from: d  reason: collision with root package name */
    public String f1509d;

    /* renamed from: e  reason: collision with root package name */
    public c.c0.f f1510e;

    /* renamed from: f  reason: collision with root package name */
    public c.c0.f f1511f;

    /* renamed from: g  reason: collision with root package name */
    public long f1512g;

    /* renamed from: h  reason: collision with root package name */
    public long f1513h;

    /* renamed from: i  reason: collision with root package name */
    public long f1514i;

    /* renamed from: j  reason: collision with root package name */
    public c.c0.d f1515j;

    /* renamed from: k  reason: collision with root package name */
    public int f1516k;

    /* renamed from: l  reason: collision with root package name */
    public c.c0.a f1517l;

    /* renamed from: m  reason: collision with root package name */
    public long f1518m;

    /* renamed from: n  reason: collision with root package name */
    public long f1519n;
    public long o;
    public long p;
    public boolean q;
    public v r;

    /* loaded from: classes.dex */
    public static class a {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public y f1520b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f1520b != aVar.f1520b) {
                    return false;
                }
                return this.a.equals(aVar.a);
            }
            return false;
        }

        public int hashCode() {
            return this.f1520b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    static {
        c.c0.r.e("WorkSpec");
    }

    public p(p pVar) {
        this.f1507b = y.ENQUEUED;
        c.c0.f fVar = c.c0.f.f1599b;
        this.f1510e = fVar;
        this.f1511f = fVar;
        this.f1515j = c.c0.d.a;
        this.f1517l = c.c0.a.EXPONENTIAL;
        this.f1518m = 30000L;
        this.p = -1L;
        this.r = v.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.a = pVar.a;
        this.f1508c = pVar.f1508c;
        this.f1507b = pVar.f1507b;
        this.f1509d = pVar.f1509d;
        this.f1510e = new c.c0.f(pVar.f1510e);
        this.f1511f = new c.c0.f(pVar.f1511f);
        this.f1512g = pVar.f1512g;
        this.f1513h = pVar.f1513h;
        this.f1514i = pVar.f1514i;
        this.f1515j = new c.c0.d(pVar.f1515j);
        this.f1516k = pVar.f1516k;
        this.f1517l = pVar.f1517l;
        this.f1518m = pVar.f1518m;
        this.f1519n = pVar.f1519n;
        this.o = pVar.o;
        this.p = pVar.p;
        this.q = pVar.q;
        this.r = pVar.r;
    }

    public p(String str, String str2) {
        this.f1507b = y.ENQUEUED;
        c.c0.f fVar = c.c0.f.f1599b;
        this.f1510e = fVar;
        this.f1511f = fVar;
        this.f1515j = c.c0.d.a;
        this.f1517l = c.c0.a.EXPONENTIAL;
        this.f1518m = 30000L;
        this.p = -1L;
        this.r = v.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.a = str;
        this.f1508c = str2;
    }

    public long a() {
        if (this.f1507b == y.ENQUEUED && this.f1516k > 0) {
            return Math.min(18000000L, this.f1517l == c.c0.a.LINEAR ? this.f1518m * this.f1516k : Math.scalb((float) this.f1518m, this.f1516k - 1)) + this.f1519n;
        }
        if (!c()) {
            long j2 = this.f1519n;
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            return j2 + this.f1512g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = this.f1519n;
        long j4 = j3 == 0 ? currentTimeMillis + this.f1512g : j3;
        long j5 = this.f1514i;
        long j6 = this.f1513h;
        if (j5 != j6) {
            return j4 + j6 + (j3 == 0 ? j5 * (-1) : 0L);
        }
        return j4 + (j3 != 0 ? j6 : 0L);
    }

    public boolean b() {
        return !c.c0.d.a.equals(this.f1515j);
    }

    public boolean c() {
        return this.f1513h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f1512g == pVar.f1512g && this.f1513h == pVar.f1513h && this.f1514i == pVar.f1514i && this.f1516k == pVar.f1516k && this.f1518m == pVar.f1518m && this.f1519n == pVar.f1519n && this.o == pVar.o && this.p == pVar.p && this.q == pVar.q && this.a.equals(pVar.a) && this.f1507b == pVar.f1507b && this.f1508c.equals(pVar.f1508c)) {
            String str = this.f1509d;
            if (str == null ? pVar.f1509d == null : str.equals(pVar.f1509d)) {
                return this.f1510e.equals(pVar.f1510e) && this.f1511f.equals(pVar.f1511f) && this.f1515j.equals(pVar.f1515j) && this.f1517l == pVar.f1517l && this.r == pVar.r;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int x = e.a.d.a.a.x(this.f1508c, (this.f1507b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        String str = this.f1509d;
        int hashCode = str != null ? str.hashCode() : 0;
        int hashCode2 = this.f1510e.hashCode();
        int hashCode3 = this.f1511f.hashCode();
        long j2 = this.f1512g;
        long j3 = this.f1513h;
        long j4 = this.f1514i;
        int hashCode4 = this.f1515j.hashCode();
        int hashCode5 = this.f1517l.hashCode();
        long j5 = this.f1518m;
        long j6 = this.f1519n;
        long j7 = this.o;
        long j8 = this.p;
        return this.r.hashCode() + ((((((((((((hashCode5 + ((((hashCode4 + ((((((((hashCode3 + ((hashCode2 + ((x + hashCode) * 31)) * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31)) * 31) + this.f1516k) * 31)) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31);
    }

    public String toString() {
        return e.a.d.a.a.r(e.a.d.a.a.y("{WorkSpec: "), this.a, "}");
    }
}
