package bo.app;

import com.braze.support.BrazeLogger;
import java.util.List;
/* loaded from: classes.dex */
public final class e4 extends r {
    public static final a w = new a(null);
    private final List s;
    private final long t;
    private final boolean u;
    private final boolean v;

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
            return "PushMaxSendRequest failed.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "PushMaxSendRequest executed successfully.";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final d b = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while creating PushMaxSendRequest. Returning null.";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Retrying PushMaxSendRequest " + e4.this + '.';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(String str, String str2, List list, long j) {
        super(new q4(str.concat("push/redeliver")), str2);
        com.amazon.aps.iva.yb0.j.f(str, "urlBase");
        com.amazon.aps.iva.yb0.j.f(list, "campaignIds");
        this.s = list;
        this.t = j;
    }

    @Override // bo.app.e2
    public void a(z1 z1Var, z1 z1Var2, bo.app.d dVar) {
        com.amazon.aps.iva.if0.c g;
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalPublisher");
        com.amazon.aps.iva.yb0.j.f(z1Var2, "externalPublisher");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
        if (dVar == null || (g = dVar.g()) == null) {
            return;
        }
        z1Var.a(new d4(g.getLong("last_sync_at")), d4.class);
    }

    @Override // bo.app.r, bo.app.s1
    public boolean c() {
        return this.u;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a A[Catch: b -> 0x0037, TryCatch #0 {b -> 0x0037, blocks: (B:5:0x0008, B:7:0x000e, B:13:0x001a, B:14:0x0023), top: B:19:0x0008 }] */
    @Override // bo.app.r, bo.app.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.aps.iva.if0.c e() {
        /*
            r5 = this;
            com.amazon.aps.iva.if0.c r0 = super.e()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r2 = r5.a()     // Catch: com.amazon.aps.iva.if0.b -> L37
            if (r2 == 0) goto L17
            boolean r2 = com.amazon.aps.iva.oe0.m.b0(r2)     // Catch: com.amazon.aps.iva.if0.b -> L37
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = 0
            goto L18
        L17:
            r2 = 1
        L18:
            if (r2 != 0) goto L23
            java.lang.String r2 = "user_id"
            java.lang.String r3 = r5.a()     // Catch: com.amazon.aps.iva.if0.b -> L37
            r0.put(r2, r3)     // Catch: com.amazon.aps.iva.if0.b -> L37
        L23:
            java.lang.String r2 = "campaign_ids"
            com.amazon.aps.iva.if0.a r3 = new com.amazon.aps.iva.if0.a     // Catch: com.amazon.aps.iva.if0.b -> L37
            java.util.List r4 = r5.s     // Catch: com.amazon.aps.iva.if0.b -> L37
            r3.<init>(r4)     // Catch: com.amazon.aps.iva.if0.b -> L37
            r0.put(r2, r3)     // Catch: com.amazon.aps.iva.if0.b -> L37
            java.lang.String r2 = "last_sync_at"
            long r3 = r5.t     // Catch: com.amazon.aps.iva.if0.b -> L37
            r0.put(r2, r3)     // Catch: com.amazon.aps.iva.if0.b -> L37
            return r0
        L37:
            r0 = move-exception
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            bo.app.e4$d r4 = bo.app.e4.d.b
            r2.brazelog(r5, r3, r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.e4.e():com.amazon.aps.iva.if0.c");
    }

    @Override // bo.app.r, bo.app.s1
    public boolean h() {
        return this.v;
    }

    @Override // bo.app.r, bo.app.e2
    public void a(z1 z1Var, z1 z1Var2, g2 g2Var) {
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalPublisher");
        com.amazon.aps.iva.yb0.j.f(z1Var2, "externalPublisher");
        com.amazon.aps.iva.yb0.j.f(g2Var, "responseError");
        super.a(z1Var, z1Var2, g2Var);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
    }

    @Override // bo.app.r, bo.app.e2
    public boolean a(g2 g2Var) {
        com.amazon.aps.iva.yb0.j.f(g2Var, "responseError");
        if ((g2Var instanceof g3) || (g2Var instanceof t4)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new e(), 2, (Object) null);
            return true;
        }
        return false;
    }
}
