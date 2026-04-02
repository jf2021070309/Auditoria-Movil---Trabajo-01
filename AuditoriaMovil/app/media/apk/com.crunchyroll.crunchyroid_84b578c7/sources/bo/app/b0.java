package bo.app;

import com.braze.support.StringUtils;
/* loaded from: classes.dex */
public final class b0 implements k2 {
    private String b;

    public b0(com.amazon.aps.iva.if0.c cVar) {
        this.b = cVar.getJSONObject("data").getString("event_name");
    }

    @Override // bo.app.k2, bo.app.u1
    public boolean a(l2 l2Var) {
        if (l2Var instanceof c0) {
            c0 c0Var = (c0) l2Var;
            if (!StringUtils.isNullOrBlank(c0Var.f()) && c0Var.f().equals(this.b)) {
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
            cVar.put("type", "custom_event");
            com.amazon.aps.iva.if0.c cVar2 = new com.amazon.aps.iva.if0.c();
            cVar2.put("event_name", this.b);
            cVar.put("data", cVar2);
            return cVar;
        } catch (com.amazon.aps.iva.if0.b unused) {
            return null;
        }
    }
}
