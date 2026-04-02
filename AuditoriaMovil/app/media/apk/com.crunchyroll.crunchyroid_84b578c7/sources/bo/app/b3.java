package bo.app;

import com.braze.support.BrazeLogger;
import java.util.List;
/* loaded from: classes.dex */
public abstract class b3 implements u1 {
    private static final String c = BrazeLogger.getBrazeLogTag(b3.class);
    protected final List b;

    public b3(List list) {
        this.b = list;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public com.amazon.aps.iva.if0.a forJsonPut() {
        com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
        try {
            for (u1 u1Var : this.b) {
                aVar.put(u1Var.forJsonPut());
            }
        } catch (Exception e) {
            BrazeLogger.e(c, "Caught exception creating Json.", e);
        }
        return aVar;
    }
}
