package e.a.a.a;

import androidx.annotation.RecentlyNonNull;
import com.android.billingclient.api.PurchaseHistoryRecord;
import java.util.List;
/* loaded from: classes.dex */
public final class m {
    public final j a;

    /* renamed from: b  reason: collision with root package name */
    public final List<PurchaseHistoryRecord> f5009b;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@RecentlyNonNull j jVar, List<? extends PurchaseHistoryRecord> list) {
        h.o.c.j.e(jVar, "billingResult");
        this.a = jVar;
        this.f5009b = list;
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (this != obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                return h.o.c.j.a(this.a, mVar.a) && h.o.c.j.a(this.f5009b, mVar.f5009b);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        j jVar = this.a;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        List<PurchaseHistoryRecord> list = this.f5009b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("PurchaseHistoryResult(billingResult=");
        y.append(this.a);
        y.append(", purchaseHistoryRecordList=");
        y.append(this.f5009b);
        y.append(")");
        return y.toString();
    }
}
