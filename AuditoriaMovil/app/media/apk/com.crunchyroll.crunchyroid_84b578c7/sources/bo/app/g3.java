package bo.app;
/* loaded from: classes.dex */
public final class g3 implements g2 {
    private final String a;
    private final s1 b;

    public g3(String str, s1 s1Var) {
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
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        if (com.amazon.aps.iva.yb0.j.a(a(), g3Var.a()) && com.amazon.aps.iva.yb0.j.a(b(), g3Var.b())) {
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
        return "NetworkCommunicationFailureResponseError(errorMessage=" + a() + ", originalRequest=" + b() + ')';
    }
}
