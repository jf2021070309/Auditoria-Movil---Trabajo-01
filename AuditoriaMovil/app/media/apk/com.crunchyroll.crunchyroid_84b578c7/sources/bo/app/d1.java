package bo.app;
/* loaded from: classes.dex */
public final class d1 {
    private final com.amazon.aps.iva.if0.a a;

    public d1(com.amazon.aps.iva.if0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "featureFlagsData");
        this.a = aVar;
    }

    public final com.amazon.aps.iva.if0.a a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d1) && com.amazon.aps.iva.yb0.j.a(this.a, ((d1) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "FeatureFlagsReceivedEvent(featureFlagsData=" + this.a + ')';
    }
}
