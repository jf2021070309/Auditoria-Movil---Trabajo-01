package bo.app;

import com.braze.support.BrazeLogger;
import java.util.Map;
/* loaded from: classes.dex */
public final class a0 extends r {
    public static final a x = new a(null);
    private final long s;
    private final long t;
    private int u;
    private final boolean v;
    private int w;

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
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j) {
            super(0);
            this.b = j;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("ContentCardsSyncRequest scheduled for retry in "), this.b, " ms.");
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
            return "ContentCardsSyncRequest executed successfully.";
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
            return "Experienced JSONException while creating Content Cards request. Returning null.";
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
            return "Retrying Content Card refresh request. Retry count for this request attempt: " + a0.this.w;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(String str, long j, long j2, String str2, int i) {
        super(new q4(str.concat("content_cards/sync")), str2);
        com.amazon.aps.iva.yb0.j.f(str, "urlBase");
        this.s = j;
        this.t = j2;
        this.u = i;
    }

    @Override // bo.app.r, bo.app.s1
    public boolean c() {
        return this.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: b -> 0x0032, TRY_LEAVE, TryCatch #0 {b -> 0x0032, blocks: (B:5:0x0008, B:7:0x001c, B:13:0x0028), top: B:18:0x0008 }] */
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
            java.lang.String r2 = "last_full_sync_at"
            long r3 = r5.t     // Catch: com.amazon.aps.iva.if0.b -> L32
            r0.put(r2, r3)     // Catch: com.amazon.aps.iva.if0.b -> L32
            java.lang.String r2 = "last_card_updated_at"
            long r3 = r5.s     // Catch: com.amazon.aps.iva.if0.b -> L32
            r0.put(r2, r3)     // Catch: com.amazon.aps.iva.if0.b -> L32
            java.lang.String r2 = r5.a()     // Catch: com.amazon.aps.iva.if0.b -> L32
            if (r2 == 0) goto L25
            boolean r2 = com.amazon.aps.iva.oe0.m.b0(r2)     // Catch: com.amazon.aps.iva.if0.b -> L32
            if (r2 == 0) goto L23
            goto L25
        L23:
            r2 = 0
            goto L26
        L25:
            r2 = 1
        L26:
            if (r2 != 0) goto L31
            java.lang.String r2 = "user_id"
            java.lang.String r3 = r5.a()     // Catch: com.amazon.aps.iva.if0.b -> L32
            r0.put(r2, r3)     // Catch: com.amazon.aps.iva.if0.b -> L32
        L31:
            return r0
        L32:
            r0 = move-exception
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            bo.app.a0$d r4 = bo.app.a0.d.b
            r2.brazelog(r5, r3, r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.a0.e():com.amazon.aps.iva.if0.c");
    }

    @Override // bo.app.e2
    public void a(z1 z1Var, z1 z1Var2, bo.app.d dVar) {
        Map f;
        String str;
        Long a2;
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalPublisher");
        com.amazon.aps.iva.yb0.j.f(z1Var2, "externalPublisher");
        if (dVar != null && (f = dVar.f()) != null && (str = (String) f.get("retry-after")) != null && (a2 = com.braze.support.g.a(str)) != null) {
            long longValue = a2.longValue();
            z1Var.a(new w(longValue, this.u + 1), w.class);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(longValue), 3, (Object) null);
            return;
        }
        z1Var.a(new v(), v.class);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
    }

    @Override // bo.app.r, bo.app.s1
    public void a(Map map) {
        com.amazon.aps.iva.yb0.j.f(map, "existingHeaders");
        super.a(map);
        map.put("X-Braze-DataRequest", "true");
        map.put("X-Braze-ContentCardsRequest", "true");
        map.put("BRAZE-SYNC-RETRY-COUNT", String.valueOf(this.u));
    }

    @Override // bo.app.r, bo.app.e2
    public boolean a(g2 g2Var) {
        com.amazon.aps.iva.yb0.j.f(g2Var, "responseError");
        if ((g2Var instanceof g3) || (g2Var instanceof t4)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(), 3, (Object) null);
            int i = this.w + 1;
            this.w = i;
            return i < 3;
        }
        return false;
    }
}
