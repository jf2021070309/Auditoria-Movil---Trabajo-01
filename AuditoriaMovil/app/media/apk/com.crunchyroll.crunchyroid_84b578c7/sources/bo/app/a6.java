package bo.app;
/* loaded from: classes.dex */
public final class a6 {
    private final l2 a;

    public a6(l2 l2Var) {
        com.amazon.aps.iva.yb0.j.f(l2Var, "triggerEvent");
        this.a = l2Var;
    }

    public final l2 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a6) && com.amazon.aps.iva.yb0.j.a(this.a, ((a6) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "TriggerEventEvent(triggerEvent=" + this.a + ')';
    }
}
