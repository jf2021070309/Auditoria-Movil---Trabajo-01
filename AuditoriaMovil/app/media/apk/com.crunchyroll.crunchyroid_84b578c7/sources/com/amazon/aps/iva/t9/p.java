package com.amazon.aps.iva.t9;

import com.google.android.gms.cast.framework.media.NotificationOptions;
/* compiled from: WorkSpec.java */
/* loaded from: classes.dex */
public final class p {
    public static final /* synthetic */ int s = 0;
    public String a;
    public com.amazon.aps.iva.k9.t b;
    public String c;
    public String d;
    public androidx.work.b e;
    public androidx.work.b f;
    public long g;
    public long h;
    public long i;
    public com.amazon.aps.iva.k9.c j;
    public int k;
    public com.amazon.aps.iva.k9.a l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public com.amazon.aps.iva.k9.q r;

    /* compiled from: WorkSpec.java */
    /* loaded from: classes.dex */
    public static class a {
        public String a;
        public com.amazon.aps.iva.k9.t b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b != aVar.b) {
                return false;
            }
            return this.a.equals(aVar.a);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    static {
        com.amazon.aps.iva.k9.m.e("WorkSpec");
    }

    public p(String str, String str2) {
        this.b = com.amazon.aps.iva.k9.t.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.b;
        this.e = bVar;
        this.f = bVar;
        this.j = com.amazon.aps.iva.k9.c.i;
        this.l = com.amazon.aps.iva.k9.a.EXPONENTIAL;
        this.m = NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS;
        this.p = -1L;
        this.r = com.amazon.aps.iva.k9.q.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.a = str;
        this.c = str2;
    }

    public final long a() {
        boolean z;
        long j;
        long j2;
        long scalb;
        boolean z2 = true;
        boolean z3 = false;
        if (this.b == com.amazon.aps.iva.k9.t.ENQUEUED && this.k > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.l == com.amazon.aps.iva.k9.a.LINEAR) {
                z3 = true;
            }
            if (z3) {
                scalb = this.m * this.k;
            } else {
                scalb = Math.scalb((float) this.m, this.k - 1);
            }
            j2 = this.n;
            j = Math.min(18000000L, scalb);
        } else {
            long j3 = 0;
            if (c()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j4 = this.n;
                int i = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
                if (i == 0) {
                    j4 = this.g + currentTimeMillis;
                }
                long j5 = this.i;
                long j6 = this.h;
                if (j5 == j6) {
                    z2 = false;
                }
                if (z2) {
                    if (i == 0) {
                        j3 = j5 * (-1);
                    }
                    return j4 + j6 + j3;
                }
                if (i != 0) {
                    j3 = j6;
                }
                return j4 + j3;
            }
            j = this.n;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            j2 = this.g;
        }
        return j + j2;
    }

    public final boolean b() {
        return !com.amazon.aps.iva.k9.c.i.equals(this.j);
    }

    public final boolean c() {
        if (this.h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.g != pVar.g || this.h != pVar.h || this.i != pVar.i || this.k != pVar.k || this.m != pVar.m || this.n != pVar.n || this.o != pVar.o || this.p != pVar.p || this.q != pVar.q || !this.a.equals(pVar.a) || this.b != pVar.b || !this.c.equals(pVar.c)) {
            return false;
        }
        String str = this.d;
        if (str == null ? pVar.d != null : !str.equals(pVar.d)) {
            return false;
        }
        if (this.e.equals(pVar.e) && this.f.equals(pVar.f) && this.j.equals(pVar.j) && this.l == pVar.l && this.r == pVar.r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode();
        int b = com.amazon.aps.iva.c80.a.b(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = this.e.hashCode();
        int hashCode3 = this.f.hashCode();
        long j = this.g;
        long j2 = this.h;
        long j3 = this.i;
        int hashCode4 = this.j.hashCode();
        int hashCode5 = this.l.hashCode();
        long j4 = this.m;
        long j5 = this.n;
        long j6 = this.o;
        long j7 = this.p;
        return this.r.hashCode() + ((((((((((((hashCode5 + ((((hashCode4 + ((((((((hashCode3 + ((hashCode2 + ((b + i) * 31)) * 31)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.k) * 31)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return defpackage.b.c(new StringBuilder("{WorkSpec: "), this.a, "}");
    }

    public p(p pVar) {
        this.b = com.amazon.aps.iva.k9.t.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.b;
        this.e = bVar;
        this.f = bVar;
        this.j = com.amazon.aps.iva.k9.c.i;
        this.l = com.amazon.aps.iva.k9.a.EXPONENTIAL;
        this.m = NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS;
        this.p = -1L;
        this.r = com.amazon.aps.iva.k9.q.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.a = pVar.a;
        this.c = pVar.c;
        this.b = pVar.b;
        this.d = pVar.d;
        this.e = new androidx.work.b(pVar.e);
        this.f = new androidx.work.b(pVar.f);
        this.g = pVar.g;
        this.h = pVar.h;
        this.i = pVar.i;
        this.j = new com.amazon.aps.iva.k9.c(pVar.j);
        this.k = pVar.k;
        this.l = pVar.l;
        this.m = pVar.m;
        this.n = pVar.n;
        this.o = pVar.o;
        this.p = pVar.p;
        this.q = pVar.q;
        this.r = pVar.r;
    }
}
