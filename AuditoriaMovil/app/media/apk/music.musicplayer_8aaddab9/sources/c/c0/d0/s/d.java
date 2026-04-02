package c.c0.d0.s;
/* loaded from: classes.dex */
public class d {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public Long f1496b;

    public d(String str, long j2) {
        this.a = str;
        this.f1496b = Long.valueOf(j2);
    }

    public d(String str, boolean z) {
        long j2 = z ? 1L : 0L;
        this.a = str;
        this.f1496b = Long.valueOf(j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.a.equals(dVar.a)) {
                Long l2 = this.f1496b;
                Long l3 = dVar.f1496b;
                return l2 != null ? l2.equals(l3) : l3 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l2 = this.f1496b;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
