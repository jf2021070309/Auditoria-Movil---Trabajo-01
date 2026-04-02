package e.a.a.a;

import androidx.annotation.RecentlyNonNull;
import com.android.billingclient.api.Purchase;
import java.util.List;
/* loaded from: classes.dex */
public final class o {
    public final j a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Purchase> f5011b;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@RecentlyNonNull j jVar, @RecentlyNonNull List<? extends Purchase> list) {
        h.o.c.j.e(jVar, "billingResult");
        h.o.c.j.e(list, "purchasesList");
        this.a = jVar;
        this.f5011b = list;
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                return h.o.c.j.a(this.a, oVar.a) && h.o.c.j.a(this.f5011b, oVar.f5011b);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        j jVar = this.a;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        List<Purchase> list = this.f5011b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("PurchasesResult(billingResult=");
        y.append(this.a);
        y.append(", purchasesList=");
        y.append(this.f5011b);
        y.append(")");
        return y.toString();
    }
}
