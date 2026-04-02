package bo.app;

import java.util.List;
/* loaded from: classes.dex */
public final class l1 {
    private final List a;

    public l1(List list) {
        com.amazon.aps.iva.yb0.j.f(list, "geofencesList");
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l1) && com.amazon.aps.iva.yb0.j.a(this.a, ((l1) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "GeofencesReceivedEvent(geofencesList=" + this.a + ')';
    }
}
