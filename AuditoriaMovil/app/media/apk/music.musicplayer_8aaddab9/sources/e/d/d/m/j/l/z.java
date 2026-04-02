package e.d.d.m.j.l;

import e.d.d.m.j.l.c0;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class z extends c0.c {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7495b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7496c;

    public z(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "Null osRelease");
        this.a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f7495b = str2;
        this.f7496c = z;
    }

    @Override // e.d.d.m.j.l.c0.c
    public boolean a() {
        return this.f7496c;
    }

    @Override // e.d.d.m.j.l.c0.c
    public String b() {
        return this.f7495b;
    }

    @Override // e.d.d.m.j.l.c0.c
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.c) {
            c0.c cVar = (c0.c) obj;
            return this.a.equals(cVar.c()) && this.f7495b.equals(cVar.b()) && this.f7496c == cVar.a();
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f7495b.hashCode()) * 1000003) ^ (this.f7496c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("OsData{osRelease=");
        y.append(this.a);
        y.append(", osCodeName=");
        y.append(this.f7495b);
        y.append(", isRooted=");
        y.append(this.f7496c);
        y.append("}");
        return y.toString();
    }
}
