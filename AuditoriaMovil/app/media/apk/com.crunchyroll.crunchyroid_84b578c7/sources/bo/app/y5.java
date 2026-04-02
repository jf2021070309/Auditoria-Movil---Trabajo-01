package bo.app;
/* loaded from: classes.dex */
public final class y5 {
    private final String a;
    private final p1 b;

    public y5(String str, p1 p1Var) {
        com.amazon.aps.iva.yb0.j.f(str, "campaignId");
        com.amazon.aps.iva.yb0.j.f(p1Var, "pushClickEvent");
        this.a = str;
        this.b = p1Var;
    }

    public final String a() {
        return this.a;
    }

    public final p1 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return false;
        }
        y5 y5Var = (y5) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, y5Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, y5Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        return "TriggerEligiblePushClickEvent(campaignId=" + this.a + ", pushClickEvent=" + this.b + ')';
    }
}
