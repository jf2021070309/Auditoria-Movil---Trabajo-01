package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class v5 implements k2 {
    private static final String c = BrazeLogger.getBrazeLogTag(v5.class);
    c b;

    public v5(com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.if0.a jSONArray = cVar.getJSONObject("data").getJSONArray("property_filters");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.e(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof com.amazon.aps.iva.if0.a) {
                com.amazon.aps.iva.if0.a aVar = (com.amazon.aps.iva.if0.a) obj;
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < aVar.e(); i2++) {
                    arrayList2.add(new q3(aVar.b(i2)));
                }
                arrayList.add(new m3(arrayList2));
            } else {
                throw new com.amazon.aps.iva.if0.b(com.amazon.aps.iva.c80.a.d("JSONArray[", i, "] is not a JSONArray."));
            }
        }
        this.b = new c(arrayList);
    }

    @Override // bo.app.k2, bo.app.u1
    public boolean a(l2 l2Var) {
        return this.b.a(l2Var);
    }

    public com.amazon.aps.iva.if0.c u() {
        com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
        try {
            com.amazon.aps.iva.if0.c cVar2 = new com.amazon.aps.iva.if0.c();
            cVar2.put("property_filters", this.b.forJsonPut());
            cVar.put("data", cVar2);
        } catch (com.amazon.aps.iva.if0.b e) {
            BrazeLogger.e(c, "Caught exception creating Json.", e);
        }
        return cVar;
    }
}
