package bo.app;
/* loaded from: classes.dex */
public final class h4 {
    private final i4 a;
    private final String b;

    public h4(i4 i4Var, String str) {
        com.amazon.aps.iva.yb0.j.f(i4Var, "pathType");
        com.amazon.aps.iva.yb0.j.f(str, "remoteUrl");
        this.a = i4Var;
        this.b = str;
    }

    public final i4 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        if (this.a == h4Var.a && com.amazon.aps.iva.yb0.j.a(this.b, h4Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RemotePath(pathType=");
        sb.append(this.a);
        sb.append(", remoteUrl=");
        return com.amazon.aps.iva.o0.t1.b(sb, this.b, ')');
    }
}
