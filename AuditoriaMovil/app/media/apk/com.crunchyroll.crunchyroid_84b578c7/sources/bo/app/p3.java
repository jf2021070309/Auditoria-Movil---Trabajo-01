package bo.app;

import com.braze.models.IPutIntoJson;
/* loaded from: classes.dex */
public final class p3 implements IPutIntoJson, y1 {
    private final com.amazon.aps.iva.if0.c b;
    private final com.amazon.aps.iva.if0.a c;

    public p3(com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "userObject");
        this.b = cVar;
        com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
        aVar.b.add(cVar);
        this.c = aVar;
    }

    @Override // bo.app.y1
    public boolean isEmpty() {
        if (this.b.length() == 0) {
            return true;
        }
        if (this.b.length() == 1 && this.b.has("user_id")) {
            return true;
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public com.amazon.aps.iva.if0.a forJsonPut() {
        com.amazon.aps.iva.if0.a aVar = this.c;
        com.amazon.aps.iva.yb0.j.e(aVar, "jsonArrayForJsonPut");
        return aVar;
    }

    public final com.amazon.aps.iva.if0.c v() {
        return this.b;
    }
}
