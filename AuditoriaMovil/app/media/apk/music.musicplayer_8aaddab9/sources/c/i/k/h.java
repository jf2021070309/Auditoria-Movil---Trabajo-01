package c.i.k;

import java.util.Objects;
/* loaded from: classes.dex */
public final class h {
    public final Object a;

    public h(Object obj) {
        this.a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((h) obj).a);
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("DisplayCutoutCompat{");
        y.append(this.a);
        y.append("}");
        return y.toString();
    }
}
