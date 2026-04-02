package bo.app;
/* loaded from: classes.dex */
public final class n0 {
    private final s1 a;
    private final com.amazon.aps.iva.if0.c b;

    public n0(s1 s1Var) {
        com.amazon.aps.iva.yb0.j.f(s1Var, "request");
        this.a = s1Var;
        this.b = s1Var.e();
    }

    public final s1 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n0) && com.amazon.aps.iva.yb0.j.a(this.a, ((n0) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "DispatchFailedEvent(request=" + this.a + ')';
    }
}
