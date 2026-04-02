package e.d.d.m.j.l;

import e.d.d.m.j.l.c0;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class x extends c0.a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7482b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7483c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7484d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7485e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.d.m.j.e f7486f;

    public x(String str, String str2, String str3, String str4, int i2, e.d.d.m.j.e eVar) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f7482b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f7483c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f7484d = str4;
        this.f7485e = i2;
        Objects.requireNonNull(eVar, "Null developmentPlatformProvider");
        this.f7486f = eVar;
    }

    @Override // e.d.d.m.j.l.c0.a
    public String a() {
        return this.a;
    }

    @Override // e.d.d.m.j.l.c0.a
    public int b() {
        return this.f7485e;
    }

    @Override // e.d.d.m.j.l.c0.a
    public e.d.d.m.j.e c() {
        return this.f7486f;
    }

    @Override // e.d.d.m.j.l.c0.a
    public String d() {
        return this.f7484d;
    }

    @Override // e.d.d.m.j.l.c0.a
    public String e() {
        return this.f7482b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.a) {
            c0.a aVar = (c0.a) obj;
            return this.a.equals(aVar.a()) && this.f7482b.equals(aVar.e()) && this.f7483c.equals(aVar.f()) && this.f7484d.equals(aVar.d()) && this.f7485e == aVar.b() && this.f7486f.equals(aVar.c());
        }
        return false;
    }

    @Override // e.d.d.m.j.l.c0.a
    public String f() {
        return this.f7483c;
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f7482b.hashCode()) * 1000003) ^ this.f7483c.hashCode()) * 1000003) ^ this.f7484d.hashCode()) * 1000003) ^ this.f7485e) * 1000003) ^ this.f7486f.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("AppData{appIdentifier=");
        y.append(this.a);
        y.append(", versionCode=");
        y.append(this.f7482b);
        y.append(", versionName=");
        y.append(this.f7483c);
        y.append(", installUuid=");
        y.append(this.f7484d);
        y.append(", deliveryMechanism=");
        y.append(this.f7485e);
        y.append(", developmentPlatformProvider=");
        y.append(this.f7486f);
        y.append("}");
        return y.toString();
    }
}
