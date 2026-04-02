package bo.app;

import com.braze.support.BrazeLogger;
/* loaded from: classes.dex */
public final class g4 implements d2 {
    public static final a c = new a(null);
    private final int b;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Could not convert ReEligibilityConfig to JSON";
        }
    }

    public g4(int i) {
        this.b = i;
    }

    @Override // bo.app.d2
    public boolean e() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    @Override // bo.app.d2
    public Integer g() {
        int i = this.b;
        if (i > 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    @Override // bo.app.d2
    public boolean h() {
        if (this.b == -1) {
            return true;
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public com.amazon.aps.iva.if0.c forJsonPut() {
        try {
            return new com.amazon.aps.iva.if0.c().put("re_eligibility", this.b);
        } catch (com.amazon.aps.iva.if0.b e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
            return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g4(com.amazon.aps.iva.if0.c cVar) {
        this(cVar.optInt("re_eligibility", -1));
        com.amazon.aps.iva.yb0.j.f(cVar, "json");
    }
}
