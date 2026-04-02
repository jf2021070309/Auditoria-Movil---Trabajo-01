package bo.app;

import com.braze.support.StringUtils;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class s2 implements k2 {
    private String b;
    private Set c = new HashSet();

    public s2(com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.if0.c jSONObject = cVar.getJSONObject("data");
        this.b = jSONObject.getString("id");
        com.amazon.aps.iva.if0.a optJSONArray = jSONObject.optJSONArray("buttons");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.e(); i++) {
                this.c.add(optJSONArray.d(i));
            }
        }
    }

    @Override // bo.app.k2, bo.app.u1
    public boolean a(l2 l2Var) {
        if (l2Var instanceof t2) {
            t2 t2Var = (t2) l2Var;
            if (!StringUtils.isNullOrBlank(t2Var.g()) && t2Var.g().equals(this.b)) {
                if (this.c.size() > 0) {
                    if (StringUtils.isNullOrBlank(t2Var.f()) || !this.c.contains(t2Var.f())) {
                        return false;
                    }
                    return true;
                }
                return StringUtils.isNullOrBlank(t2Var.f());
            }
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public com.amazon.aps.iva.if0.c forJsonPut() {
        try {
            com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
            cVar.put("type", "iam_click");
            com.amazon.aps.iva.if0.c cVar2 = new com.amazon.aps.iva.if0.c();
            cVar2.put("id", this.b);
            if (this.c.size() > 0) {
                com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
                for (String str : this.c) {
                    aVar.put(str);
                }
                cVar2.put("buttons", aVar);
            }
            cVar.put("data", cVar2);
            return cVar;
        } catch (com.amazon.aps.iva.if0.b unused) {
            return null;
        }
    }
}
