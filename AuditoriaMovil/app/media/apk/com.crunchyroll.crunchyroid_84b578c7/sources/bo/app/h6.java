package bo.app;
/* loaded from: classes.dex */
public final class h6 {
    private final l2 a;
    private final q2 b;

    public h6(l2 l2Var, q2 q2Var) {
        com.amazon.aps.iva.yb0.j.f(l2Var, "originalTriggerEvent");
        com.amazon.aps.iva.yb0.j.f(q2Var, "failedTriggeredAction");
        this.a = l2Var;
        this.b = q2Var;
    }

    public final l2 a() {
        return this.a;
    }

    public final q2 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, h6Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, h6Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        return "TriggeredActionRetryEvent(originalTriggerEvent=" + this.a + ", failedTriggeredAction=" + this.b + ')';
    }
}
