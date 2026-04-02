package bo.app;
/* loaded from: classes.dex */
public final class b5 {
    private final g2 a;

    public b5(g2 g2Var) {
        com.amazon.aps.iva.yb0.j.f(g2Var, "responseError");
        this.a = g2Var;
    }

    public final g2 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b5) && com.amazon.aps.iva.yb0.j.a(this.a, ((b5) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "ServerResponseErrorEvent(responseError=" + this.a + ')';
    }
}
