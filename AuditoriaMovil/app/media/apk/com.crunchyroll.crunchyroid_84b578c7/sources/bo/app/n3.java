package bo.app;

import com.braze.models.IPutIntoJson;
/* loaded from: classes.dex */
public final class n3 implements IPutIntoJson, y1 {
    public static final a d = new a(null);
    private final long b;
    private final boolean c;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    public n3(long j, boolean z) {
        this.b = j;
        this.c = z;
    }

    @Override // bo.app.y1
    public boolean isEmpty() {
        return !this.c;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public com.amazon.aps.iva.if0.c forJsonPut() {
        com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
        cVar.put("config_time", this.b);
        return cVar;
    }
}
