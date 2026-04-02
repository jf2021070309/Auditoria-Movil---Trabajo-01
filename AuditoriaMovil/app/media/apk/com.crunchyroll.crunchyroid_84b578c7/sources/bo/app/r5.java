package bo.app;
/* loaded from: classes.dex */
public final class r5 implements k2 {
    @Override // bo.app.k2, bo.app.u1
    public boolean a(l2 l2Var) {
        return l2Var instanceof s5;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public com.amazon.aps.iva.if0.c forJsonPut() {
        try {
            com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
            cVar.put("type", "test");
            return cVar;
        } catch (com.amazon.aps.iva.if0.b unused) {
            return null;
        }
    }
}
