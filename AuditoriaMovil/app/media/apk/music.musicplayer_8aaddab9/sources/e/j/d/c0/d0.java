package e.j.d.c0;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
/* loaded from: classes2.dex */
public final class d0 {
    public final e.a.a.a.j a;

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f8632b;

    public d0(e.a.a.a.j jVar, List<c> list) {
        h.o.c.j.e(jVar, "billingResult");
        this.a = jVar;
        this.f8632b = list;
    }

    public d0(e.a.a.a.j jVar, List list, int i2) {
        int i3 = i2 & 2;
        h.o.c.j.e(jVar, "billingResult");
        this.a = jVar;
        this.f8632b = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return h.o.c.j.a(this.a, d0Var.a) && h.o.c.j.a(this.f8632b, d0Var.f8632b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List<c> list = this.f8632b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("PurchaseResult(billingResult=");
        y.append(this.a);
        y.append(", purchases=");
        y.append(this.f8632b);
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return y.toString();
    }
}
