package bo.app;
/* loaded from: classes.dex */
public final class d5 {
    private final c5 a;

    public d5(c5 c5Var) {
        com.amazon.aps.iva.yb0.j.f(c5Var, "session");
        this.a = c5Var;
        if (!c5Var.y()) {
            return;
        }
        throw new IllegalArgumentException("Session created events cannot be created with already sealed sessions.".toString());
    }

    public final c5 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d5) && com.amazon.aps.iva.yb0.j.a(this.a, ((d5) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "SessionCreatedEvent(session=" + this.a + ')';
    }
}
