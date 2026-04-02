package bo.app;

import java.util.Collection;
import java.util.Set;
/* loaded from: classes.dex */
public final class k implements y1 {
    private final Set b;
    private final boolean c;

    public k(Set set) {
        com.amazon.aps.iva.yb0.j.f(set, "eventsList");
        this.b = set;
        this.c = set.isEmpty();
    }

    public final boolean a() {
        boolean z;
        Set<p1> set = this.b;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (p1 p1Var : set) {
            if (p1Var.c() == a1.SESSION_START) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final Set b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && com.amazon.aps.iva.yb0.j.a(this.b, ((k) obj).b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // bo.app.y1
    public boolean isEmpty() {
        return this.c;
    }

    public String toString() {
        return "BrazeEventContainer(eventsList=" + this.b + ')';
    }
}
