package e.d.b.b.i.e;

import java.util.List;
/* loaded from: classes.dex */
public final class l extends r {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6113b;

    /* renamed from: c  reason: collision with root package name */
    public final p f6114c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f6115d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6116e;

    /* renamed from: f  reason: collision with root package name */
    public final List<q> f6117f;

    /* renamed from: g  reason: collision with root package name */
    public final u f6118g;

    public l(long j2, long j3, p pVar, Integer num, String str, List list, u uVar, a aVar) {
        this.a = j2;
        this.f6113b = j3;
        this.f6114c = pVar;
        this.f6115d = num;
        this.f6116e = str;
        this.f6117f = list;
        this.f6118g = uVar;
    }

    @Override // e.d.b.b.i.e.r
    public p a() {
        return this.f6114c;
    }

    @Override // e.d.b.b.i.e.r
    public List<q> b() {
        return this.f6117f;
    }

    @Override // e.d.b.b.i.e.r
    public Integer c() {
        return this.f6115d;
    }

    @Override // e.d.b.b.i.e.r
    public String d() {
        return this.f6116e;
    }

    @Override // e.d.b.b.i.e.r
    public u e() {
        return this.f6118g;
    }

    public boolean equals(Object obj) {
        p pVar;
        Integer num;
        String str;
        List<q> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.a == rVar.f() && this.f6113b == rVar.g() && ((pVar = this.f6114c) != null ? pVar.equals(rVar.a()) : rVar.a() == null) && ((num = this.f6115d) != null ? num.equals(rVar.c()) : rVar.c() == null) && ((str = this.f6116e) != null ? str.equals(rVar.d()) : rVar.d() == null) && ((list = this.f6117f) != null ? list.equals(rVar.b()) : rVar.b() == null)) {
                u uVar = this.f6118g;
                if (uVar == null) {
                    if (rVar.e() == null) {
                        return true;
                    }
                } else if (uVar.equals(rVar.e())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // e.d.b.b.i.e.r
    public long f() {
        return this.a;
    }

    @Override // e.d.b.b.i.e.r
    public long g() {
        return this.f6113b;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.f6113b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        p pVar = this.f6114c;
        int hashCode = (i2 ^ (pVar == null ? 0 : pVar.hashCode())) * 1000003;
        Integer num = this.f6115d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f6116e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<q> list = this.f6117f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        u uVar = this.f6118g;
        return hashCode4 ^ (uVar != null ? uVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("LogRequest{requestTimeMs=");
        y.append(this.a);
        y.append(", requestUptimeMs=");
        y.append(this.f6113b);
        y.append(", clientInfo=");
        y.append(this.f6114c);
        y.append(", logSource=");
        y.append(this.f6115d);
        y.append(", logSourceName=");
        y.append(this.f6116e);
        y.append(", logEvents=");
        y.append(this.f6117f);
        y.append(", qosTier=");
        y.append(this.f6118g);
        y.append("}");
        return y.toString();
    }
}
