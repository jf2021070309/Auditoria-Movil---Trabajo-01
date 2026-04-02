package bo.app;

import com.braze.support.StringUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
/* loaded from: classes.dex */
public final class s3 implements k2 {
    String b;

    public s3(com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.if0.c optJSONObject = cVar.optJSONObject("data");
        if (optJSONObject != null && !optJSONObject.isNull("product_id")) {
            this.b = optJSONObject.optString("product_id", null);
        }
    }

    @Override // bo.app.k2, bo.app.u1
    public boolean a(l2 l2Var) {
        if (l2Var instanceof t3) {
            if (StringUtils.isNullOrBlank(this.b)) {
                return true;
            }
            t3 t3Var = (t3) l2Var;
            if (!StringUtils.isNullOrBlank(t3Var.f()) && t3Var.f().equals(this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public com.amazon.aps.iva.if0.c forJsonPut() {
        try {
            com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
            cVar.put("type", FirebaseAnalytics.Event.PURCHASE);
            if (this.b != null) {
                com.amazon.aps.iva.if0.c cVar2 = new com.amazon.aps.iva.if0.c();
                cVar2.putOpt("product_id", this.b);
                cVar.putOpt("data", cVar2);
            }
            return cVar;
        } catch (com.amazon.aps.iva.if0.b unused) {
            return null;
        }
    }
}
