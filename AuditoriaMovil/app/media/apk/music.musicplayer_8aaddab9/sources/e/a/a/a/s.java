package e.a.a.a;

import androidx.annotation.RecentlyNonNull;
import com.android.billingclient.api.SkuDetails;
import java.util.List;
/* loaded from: classes.dex */
public final class s {
    public final j a;

    /* renamed from: b  reason: collision with root package name */
    public final List<SkuDetails> f5018b;

    /* JADX WARN: Multi-variable type inference failed */
    public s(@RecentlyNonNull j jVar, List<? extends SkuDetails> list) {
        h.o.c.j.e(jVar, "billingResult");
        this.a = jVar;
        this.f5018b = list;
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (this != obj) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                return h.o.c.j.a(this.a, sVar.a) && h.o.c.j.a(this.f5018b, sVar.f5018b);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        j jVar = this.a;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        List<SkuDetails> list = this.f5018b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("SkuDetailsResult(billingResult=");
        y.append(this.a);
        y.append(", skuDetailsList=");
        y.append(this.f5018b);
        y.append(")");
        return y.toString();
    }
}
