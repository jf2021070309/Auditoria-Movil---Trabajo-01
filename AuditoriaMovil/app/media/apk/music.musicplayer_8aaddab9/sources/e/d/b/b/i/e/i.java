package e.d.b.b.i.e;

import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class i extends o {
    public final List<r> a;

    public i(List<r> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.a = list;
    }

    @Override // e.d.b.b.i.e.o
    public List<r> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.a.equals(((o) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("BatchedLogRequest{logRequests=");
        y.append(this.a);
        y.append("}");
        return y.toString();
    }
}
