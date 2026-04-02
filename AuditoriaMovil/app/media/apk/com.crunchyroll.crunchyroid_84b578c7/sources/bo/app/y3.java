package bo.app;
/* loaded from: classes.dex */
public final class y3 extends j {
    public static final a j = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final y3 a(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "campaignId");
            com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
            cVar.put("cid", str);
            return new y3(a1.PUSH_CLICKED, cVar, null);
        }

        private a() {
        }

        public final String a(p1 p1Var) {
            com.amazon.aps.iva.yb0.j.f(p1Var, "event");
            String string = p1Var.q().getString("cid");
            com.amazon.aps.iva.yb0.j.e(string, "event.data.getString(IBrazeEvent.DATA_CAMPAIGN_ID)");
            return string;
        }
    }

    public /* synthetic */ y3(a1 a1Var, com.amazon.aps.iva.if0.c cVar, com.amazon.aps.iva.yb0.e eVar) {
        this(a1Var, cVar);
    }

    private y3(a1 a1Var, com.amazon.aps.iva.if0.c cVar) {
        super(a1Var, cVar, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
    }
}
