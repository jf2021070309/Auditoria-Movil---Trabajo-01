package e.j.a;

import java.util.Objects;
/* loaded from: classes2.dex */
public final class m {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            Objects.requireNonNull((m) obj);
            return h.o.c.j.a(null, null);
        }
        return false;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "BannerContainerConfig(containerViewId=0, bannerSize=null)";
    }
}
