package bo.app;
/* loaded from: classes.dex */
public final class f5 {
    private final c5 a;

    public f5(c5 c5Var) {
        com.amazon.aps.iva.yb0.j.f(c5Var, "sealedSession");
        this.a = c5Var;
    }

    public final c5 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f5) && com.amazon.aps.iva.yb0.j.a(this.a, ((f5) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "SessionSealedEvent(sealedSession=" + this.a + ')';
    }
}
