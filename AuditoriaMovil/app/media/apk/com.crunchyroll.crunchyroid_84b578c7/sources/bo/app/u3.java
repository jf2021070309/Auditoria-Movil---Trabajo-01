package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
/* loaded from: classes.dex */
public final class u3 extends v5 {
    private static final String e = BrazeLogger.getBrazeLogTag(u3.class);
    private String d;

    public u3(com.amazon.aps.iva.if0.c cVar) {
        super(cVar);
        this.d = cVar.getJSONObject("data").getString("product_id");
    }

    @Override // bo.app.v5, bo.app.k2, bo.app.u1
    public boolean a(l2 l2Var) {
        if (!(l2Var instanceof t3) || StringUtils.isNullOrBlank(this.d)) {
            return false;
        }
        t3 t3Var = (t3) l2Var;
        if (!StringUtils.isNullOrBlank(t3Var.f()) && t3Var.f().equals(this.d)) {
            return super.a(l2Var);
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public com.amazon.aps.iva.if0.c forJsonPut() {
        com.amazon.aps.iva.if0.c u = super.u();
        try {
            u.put("type", "purchase_property");
            com.amazon.aps.iva.if0.c jSONObject = u.getJSONObject("data");
            jSONObject.put("product_id", this.d);
            u.put("data", jSONObject);
        } catch (com.amazon.aps.iva.if0.b e2) {
            BrazeLogger.e(e, "Caught exception creating Json.", e2);
        }
        return u;
    }
}
