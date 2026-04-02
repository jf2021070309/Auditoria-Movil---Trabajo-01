package bo.app;
/* loaded from: classes.dex */
public final class z4 {
    private final y4 a;

    public z4(y4 y4Var) {
        com.amazon.aps.iva.yb0.j.f(y4Var, "serverConfig");
        this.a = y4Var;
    }

    public final y4 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z4) && com.amazon.aps.iva.yb0.j.a(this.a, ((z4) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "ServerConfigReceivedEvent(serverConfig=" + this.a + ')';
    }
}
