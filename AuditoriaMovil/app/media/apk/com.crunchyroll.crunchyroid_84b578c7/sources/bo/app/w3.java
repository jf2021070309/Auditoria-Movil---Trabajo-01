package bo.app;

import com.braze.support.StringUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
/* loaded from: classes.dex */
public final class w3 implements k2 {
    private String b;

    public w3(com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.if0.c optJSONObject = cVar.optJSONObject("data");
        if (optJSONObject != null && !optJSONObject.isNull(FirebaseAnalytics.Param.CAMPAIGN_ID)) {
            this.b = optJSONObject.optString(FirebaseAnalytics.Param.CAMPAIGN_ID, null);
        }
    }

    @Override // bo.app.k2, bo.app.u1
    public boolean a(l2 l2Var) {
        if (l2Var instanceof x3) {
            if (StringUtils.isNullOrBlank(this.b)) {
                return true;
            }
            x3 x3Var = (x3) l2Var;
            if (!StringUtils.isNullOrBlank(x3Var.f()) && x3Var.f().equals(this.b)) {
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
            cVar.put("type", "push_click");
            if (this.b != null) {
                com.amazon.aps.iva.if0.c cVar2 = new com.amazon.aps.iva.if0.c();
                cVar2.putOpt(FirebaseAnalytics.Param.CAMPAIGN_ID, this.b);
                cVar.putOpt("data", cVar2);
            }
            return cVar;
        } catch (com.amazon.aps.iva.if0.b unused) {
            return null;
        }
    }
}
