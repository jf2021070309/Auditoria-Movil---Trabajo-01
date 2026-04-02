package bo.app;
/* loaded from: classes.dex */
public final class e1 {
    private final f1 a;

    public e1(f1 f1Var) {
        com.amazon.aps.iva.yb0.j.f(f1Var, "request");
        this.a = f1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e1) && com.amazon.aps.iva.yb0.j.a(this.a, ((e1) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "FeatureFlagsRequestSuccessEvent(request=" + this.a + ')';
    }
}
