package bo.app;
/* loaded from: classes.dex */
public final class g implements g2 {
    private final String a;
    private final s1 b;

    public g(String str, s1 s1Var) {
        com.amazon.aps.iva.yb0.j.f(s1Var, "originalRequest");
        this.a = str;
        this.b = s1Var;
    }

    @Override // bo.app.g2
    public String a() {
        return this.a;
    }

    public s1 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (com.amazon.aps.iva.yb0.j.a(a(), gVar.a()) && com.amazon.aps.iva.yb0.j.a(b(), gVar.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        if (a() == null) {
            hashCode = 0;
        } else {
            hashCode = a().hashCode();
        }
        return b().hashCode() + (hashCode * 31);
    }

    public String toString() {
        return "BasicResponseError(errorMessage=" + a() + ", originalRequest=" + b() + ')';
    }
}
