package com.amazon.aps.iva.k9;
/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public final class c {
    public static final c i = new c(new a());
    public n a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public d h;

    /* compiled from: Constraints.java */
    /* loaded from: classes.dex */
    public static final class a {
        public n a = n.NOT_REQUIRED;
        public final long b = -1;
        public final long c = -1;
        public final d d = new d();
    }

    public c() {
        this.a = n.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.b != cVar.b || this.c != cVar.c || this.d != cVar.d || this.e != cVar.e || this.f != cVar.f || this.g != cVar.g || this.a != cVar.a) {
            return false;
        }
        return this.h.equals(cVar.h);
    }

    public final int hashCode() {
        long j = this.f;
        long j2 = this.g;
        return this.h.hashCode() + (((((((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public c(a aVar) {
        this.a = n.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        new d();
        this.b = false;
        this.c = false;
        this.a = aVar.a;
        this.d = false;
        this.e = false;
        this.h = aVar.d;
        this.f = aVar.b;
        this.g = aVar.c;
    }

    public c(c cVar) {
        this.a = n.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new d();
        this.b = cVar.b;
        this.c = cVar.c;
        this.a = cVar.a;
        this.d = cVar.d;
        this.e = cVar.e;
        this.h = cVar.h;
    }
}
