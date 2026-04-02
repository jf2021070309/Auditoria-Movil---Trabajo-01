package e.j.d.c0;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class c {
    public final Purchase a;

    /* renamed from: b  reason: collision with root package name */
    public final SkuDetails f8628b;

    /* renamed from: c  reason: collision with root package name */
    public final e0 f8629c;

    public c(Purchase purchase, SkuDetails skuDetails, e0 e0Var) {
        h.o.c.j.e(purchase, "purchase");
        h.o.c.j.e(e0Var, "status");
        this.a = purchase;
        this.f8628b = skuDetails;
        this.f8629c = e0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return h.o.c.j.a(this.a, cVar.a) && h.o.c.j.a(this.f8628b, cVar.f8628b) && this.f8629c == cVar.f8629c;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        SkuDetails skuDetails = this.f8628b;
        return this.f8629c.hashCode() + ((hashCode + (skuDetails == null ? 0 : skuDetails.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("\nActivePurchase: ");
        y.append(this.f8629c.name());
        y.append("\nPurchase JSON:\n");
        y.append((Object) new JSONObject(this.a.a).toString(4));
        y.append("\nSkuDetails JSON: \n");
        SkuDetails skuDetails = this.f8628b;
        y.append((Object) new JSONObject((skuDetails == null || (r3 = skuDetails.a) == null) ? "null" : "null").toString(4));
        return y.toString();
    }
}
