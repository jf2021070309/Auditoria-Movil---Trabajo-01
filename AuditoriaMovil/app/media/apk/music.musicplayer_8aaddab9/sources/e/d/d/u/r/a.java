package e.d.d.u.r;

import e.d.d.u.r.d;
/* loaded from: classes2.dex */
public final class a extends d {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7609b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7610c;

    /* renamed from: d  reason: collision with root package name */
    public final f f7611d;

    /* renamed from: e  reason: collision with root package name */
    public final d.a f7612e;

    public a(String str, String str2, String str3, f fVar, d.a aVar, C0165a c0165a) {
        this.a = str;
        this.f7609b = str2;
        this.f7610c = str3;
        this.f7611d = fVar;
        this.f7612e = aVar;
    }

    @Override // e.d.d.u.r.d
    public f a() {
        return this.f7611d;
    }

    @Override // e.d.d.u.r.d
    public String b() {
        return this.f7609b;
    }

    @Override // e.d.d.u.r.d
    public String c() {
        return this.f7610c;
    }

    @Override // e.d.d.u.r.d
    public d.a d() {
        return this.f7612e;
    }

    @Override // e.d.d.u.r.d
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.a;
            if (str != null ? str.equals(dVar.e()) : dVar.e() == null) {
                String str2 = this.f7609b;
                if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                    String str3 = this.f7610c;
                    if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                        f fVar = this.f7611d;
                        if (fVar != null ? fVar.equals(dVar.a()) : dVar.a() == null) {
                            d.a aVar = this.f7612e;
                            if (aVar == null) {
                                if (dVar.d() == null) {
                                    return true;
                                }
                            } else if (aVar.equals(dVar.d())) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f7609b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f7610c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f7611d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.a aVar = this.f7612e;
        return hashCode4 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("InstallationResponse{uri=");
        y.append(this.a);
        y.append(", fid=");
        y.append(this.f7609b);
        y.append(", refreshToken=");
        y.append(this.f7610c);
        y.append(", authToken=");
        y.append(this.f7611d);
        y.append(", responseCode=");
        y.append(this.f7612e);
        y.append("}");
        return y.toString();
    }
}
