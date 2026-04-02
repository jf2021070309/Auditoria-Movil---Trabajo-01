package e.d.b.b.i.e;
/* loaded from: classes.dex */
public final class h extends e.d.b.b.i.e.a {
    public final Integer a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6089b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6090c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6091d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6092e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6093f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6094g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6095h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6096i;

    /* renamed from: j  reason: collision with root package name */
    public final String f6097j;

    /* renamed from: k  reason: collision with root package name */
    public final String f6098k;

    /* renamed from: l  reason: collision with root package name */
    public final String f6099l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, a aVar) {
        this.a = num;
        this.f6089b = str;
        this.f6090c = str2;
        this.f6091d = str3;
        this.f6092e = str4;
        this.f6093f = str5;
        this.f6094g = str6;
        this.f6095h = str7;
        this.f6096i = str8;
        this.f6097j = str9;
        this.f6098k = str10;
        this.f6099l = str11;
    }

    @Override // e.d.b.b.i.e.a
    public String a() {
        return this.f6099l;
    }

    @Override // e.d.b.b.i.e.a
    public String b() {
        return this.f6097j;
    }

    @Override // e.d.b.b.i.e.a
    public String c() {
        return this.f6091d;
    }

    @Override // e.d.b.b.i.e.a
    public String d() {
        return this.f6095h;
    }

    @Override // e.d.b.b.i.e.a
    public String e() {
        return this.f6090c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e.d.b.b.i.e.a) {
            e.d.b.b.i.e.a aVar = (e.d.b.b.i.e.a) obj;
            Integer num = this.a;
            if (num != null ? num.equals(aVar.l()) : aVar.l() == null) {
                String str = this.f6089b;
                if (str != null ? str.equals(aVar.i()) : aVar.i() == null) {
                    String str2 = this.f6090c;
                    if (str2 != null ? str2.equals(aVar.e()) : aVar.e() == null) {
                        String str3 = this.f6091d;
                        if (str3 != null ? str3.equals(aVar.c()) : aVar.c() == null) {
                            String str4 = this.f6092e;
                            if (str4 != null ? str4.equals(aVar.k()) : aVar.k() == null) {
                                String str5 = this.f6093f;
                                if (str5 != null ? str5.equals(aVar.j()) : aVar.j() == null) {
                                    String str6 = this.f6094g;
                                    if (str6 != null ? str6.equals(aVar.g()) : aVar.g() == null) {
                                        String str7 = this.f6095h;
                                        if (str7 != null ? str7.equals(aVar.d()) : aVar.d() == null) {
                                            String str8 = this.f6096i;
                                            if (str8 != null ? str8.equals(aVar.f()) : aVar.f() == null) {
                                                String str9 = this.f6097j;
                                                if (str9 != null ? str9.equals(aVar.b()) : aVar.b() == null) {
                                                    String str10 = this.f6098k;
                                                    if (str10 != null ? str10.equals(aVar.h()) : aVar.h() == null) {
                                                        String str11 = this.f6099l;
                                                        if (str11 == null) {
                                                            if (aVar.a() == null) {
                                                                return true;
                                                            }
                                                        } else if (str11.equals(aVar.a())) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // e.d.b.b.i.e.a
    public String f() {
        return this.f6096i;
    }

    @Override // e.d.b.b.i.e.a
    public String g() {
        return this.f6094g;
    }

    @Override // e.d.b.b.i.e.a
    public String h() {
        return this.f6098k;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f6089b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f6090c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f6091d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f6092e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f6093f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f6094g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f6095h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f6096i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f6097j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f6098k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f6099l;
        return hashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // e.d.b.b.i.e.a
    public String i() {
        return this.f6089b;
    }

    @Override // e.d.b.b.i.e.a
    public String j() {
        return this.f6093f;
    }

    @Override // e.d.b.b.i.e.a
    public String k() {
        return this.f6092e;
    }

    @Override // e.d.b.b.i.e.a
    public Integer l() {
        return this.a;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("AndroidClientInfo{sdkVersion=");
        y.append(this.a);
        y.append(", model=");
        y.append(this.f6089b);
        y.append(", hardware=");
        y.append(this.f6090c);
        y.append(", device=");
        y.append(this.f6091d);
        y.append(", product=");
        y.append(this.f6092e);
        y.append(", osBuild=");
        y.append(this.f6093f);
        y.append(", manufacturer=");
        y.append(this.f6094g);
        y.append(", fingerprint=");
        y.append(this.f6095h);
        y.append(", locale=");
        y.append(this.f6096i);
        y.append(", country=");
        y.append(this.f6097j);
        y.append(", mccMnc=");
        y.append(this.f6098k);
        y.append(", applicationBuild=");
        return e.a.d.a.a.r(y, this.f6099l, "}");
    }
}
