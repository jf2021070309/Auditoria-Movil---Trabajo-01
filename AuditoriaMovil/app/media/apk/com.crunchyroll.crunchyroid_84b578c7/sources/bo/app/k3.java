package bo.app;
/* loaded from: classes.dex */
public final class k3 implements k2 {
    @Override // bo.app.k2, bo.app.u1
    public boolean a(l2 l2Var) {
        return l2Var instanceof l3;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public com.amazon.aps.iva.if0.c forJsonPut() {
        try {
            com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
            cVar.put("type", "open");
            return cVar;
        } catch (com.amazon.aps.iva.if0.b unused) {
            return null;
        }
    }
}
