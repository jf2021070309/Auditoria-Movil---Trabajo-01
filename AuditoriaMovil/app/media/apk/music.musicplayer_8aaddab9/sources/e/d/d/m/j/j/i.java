package e.d.d.m.j.j;

import java.io.File;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class i extends c0 {
    public final e.d.d.m.j.l.a0 a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7174b;

    /* renamed from: c  reason: collision with root package name */
    public final File f7175c;

    public i(e.d.d.m.j.l.a0 a0Var, String str, File file) {
        Objects.requireNonNull(a0Var, "Null report");
        this.a = a0Var;
        Objects.requireNonNull(str, "Null sessionId");
        this.f7174b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.f7175c = file;
    }

    @Override // e.d.d.m.j.j.c0
    public e.d.d.m.j.l.a0 a() {
        return this.a;
    }

    @Override // e.d.d.m.j.j.c0
    public File b() {
        return this.f7175c;
    }

    @Override // e.d.d.m.j.j.c0
    public String c() {
        return this.f7174b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return this.a.equals(c0Var.a()) && this.f7174b.equals(c0Var.c()) && this.f7175c.equals(c0Var.b());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f7174b.hashCode()) * 1000003) ^ this.f7175c.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("CrashlyticsReportWithSessionId{report=");
        y.append(this.a);
        y.append(", sessionId=");
        y.append(this.f7174b);
        y.append(", reportFile=");
        y.append(this.f7175c);
        y.append("}");
        return y.toString();
    }
}
