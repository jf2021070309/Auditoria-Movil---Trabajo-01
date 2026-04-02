package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
/* loaded from: classes.dex */
public final class d0 extends v5 {
    private static final String e = BrazeLogger.getBrazeLogTag(d0.class);
    private String d;

    public d0(com.amazon.aps.iva.if0.c cVar) {
        super(cVar);
        this.d = cVar.getJSONObject("data").getString("event_name");
    }

    @Override // bo.app.v5, bo.app.k2, bo.app.u1
    public boolean a(l2 l2Var) {
        if (l2Var instanceof c0) {
            c0 c0Var = (c0) l2Var;
            if (!StringUtils.isNullOrBlank(c0Var.f()) && c0Var.f().equals(this.d)) {
                return super.a(l2Var);
            }
            return false;
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public com.amazon.aps.iva.if0.c forJsonPut() {
        com.amazon.aps.iva.if0.c u = super.u();
        try {
            u.put("type", "custom_event_property");
            com.amazon.aps.iva.if0.c jSONObject = u.getJSONObject("data");
            jSONObject.put("event_name", this.d);
            u.put("data", jSONObject);
        } catch (com.amazon.aps.iva.if0.b e2) {
            BrazeLogger.e(e, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", e2);
        }
        return u;
    }
}
