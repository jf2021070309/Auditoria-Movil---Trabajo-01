package bo.app;
/* loaded from: classes.dex */
public final class y2 implements g2 {
    private final String a;
    private final s1 b;

    public y2(String str, s1 s1Var) {
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
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        if (com.amazon.aps.iva.yb0.j.a(a(), y2Var.a()) && com.amazon.aps.iva.yb0.j.a(b(), y2Var.b())) {
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
        return "InvalidApiKeyError(errorMessage=" + a() + ", originalRequest=" + b() + ')';
    }
}
