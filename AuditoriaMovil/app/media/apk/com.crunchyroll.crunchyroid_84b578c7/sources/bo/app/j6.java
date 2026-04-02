package bo.app;

import java.util.List;
/* loaded from: classes.dex */
public final class j6 {
    private final List a;

    public j6(List list) {
        com.amazon.aps.iva.yb0.j.f(list, "triggeredActions");
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j6) && com.amazon.aps.iva.yb0.j.a(this.a, ((j6) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "TriggeredActionsReceivedEvent(triggeredActions=" + this.a + ')';
    }
}
