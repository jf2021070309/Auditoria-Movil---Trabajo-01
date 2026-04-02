package bo.app;
/* loaded from: classes.dex */
public final class p0 {
    private final s1 a;

    public p0(s1 s1Var) {
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
        if ((obj instanceof p0) && com.amazon.aps.iva.yb0.j.a(this.a, ((p0) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "DispatchSucceededEvent(request=" + this.a + ')';
    }
}
