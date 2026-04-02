package bo.app;
/* loaded from: classes.dex */
public final class l4 {
    private final s1 a;

    public l4(s1 s1Var) {
        com.amazon.aps.iva.yb0.j.f(s1Var, "request");
        this.a = s1Var;
    }

    public final s1 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l4) && com.amazon.aps.iva.yb0.j.a(this.a, ((l4) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "RequestDispatchStartedEvent(request=" + this.a + ')';
    }
}
