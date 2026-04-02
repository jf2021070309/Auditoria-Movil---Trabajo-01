package bo.app;
/* loaded from: classes.dex */
public final class v3 extends j {
    public static final a k = new a(null);
    private final boolean j;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final p1 a(String str, String str2, String str3) {
            com.amazon.aps.iva.yb0.j.f(str, "campaignId");
            com.amazon.aps.iva.yb0.j.f(str2, "actionId");
            com.amazon.aps.iva.yb0.j.f(str3, "actionType");
            com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
            cVar.put("cid", str);
            cVar.put("a", str2);
            return new v3(a1.PUSH_ACTION_BUTTON_CLICKED, cVar, str3, null);
        }

        private a() {
        }
    }

    public /* synthetic */ v3(a1 a1Var, com.amazon.aps.iva.if0.c cVar, String str, com.amazon.aps.iva.yb0.e eVar) {
        this(a1Var, cVar, str);
    }

    public final boolean x() {
        return this.j;
    }

    private v3(a1 a1Var, com.amazon.aps.iva.if0.c cVar, String str) {
        super(a1Var, cVar, 0.0d, (String) null, 12, (com.amazon.aps.iva.yb0.e) null);
        this.j = com.amazon.aps.iva.yb0.j.a(str, "ab_none");
    }
}
