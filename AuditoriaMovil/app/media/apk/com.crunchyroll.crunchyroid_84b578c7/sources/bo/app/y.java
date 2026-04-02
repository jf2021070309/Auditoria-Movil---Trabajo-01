package bo.app;
/* loaded from: classes.dex */
public final class y {
    public static final a e = new a(null);
    private final long a;
    private final long b;
    private final boolean c;
    private final com.amazon.aps.iva.if0.a d;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    public y(com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "jsonObject");
        this.a = cVar.optLong("last_card_updated_at", -1L);
        this.b = cVar.optLong("last_full_sync_at", -1L);
        this.c = cVar.optBoolean("full_sync", false);
        this.d = cVar.optJSONArray("cards");
    }

    public final com.amazon.aps.iva.if0.a a() {
        return this.d;
    }

    public final long b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public y(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "serializedCardJson");
        this.c = false;
        this.a = -1L;
        this.b = -1L;
        com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c(str);
        com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
        aVar.b.add(cVar);
        this.d = aVar;
    }
}
