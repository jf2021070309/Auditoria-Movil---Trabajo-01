package bo.app;

import com.braze.support.BrazeLogger;
import java.util.Map;
/* loaded from: classes.dex */
public final class f1 extends r {
    public static final a t = new a(null);
    private final boolean s;

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
            return "FeatureFlagsSyncRequest failed.";
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
            return "FeatureFlagsSyncRequest executed successfully.";
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
            return "Experienced JSONException while creating Feature Flags request. Returning null.";
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
            return "Retrying FeatureFlagsSyncRequest " + f1.this + '.';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(String str, String str2) {
        super(new q4(str.concat("feature_flags/sync")), str2);
        com.amazon.aps.iva.yb0.j.f(str, "urlBase");
    }

    @Override // bo.app.e2
    public void a(z1 z1Var, z1 z1Var2, bo.app.d dVar) {
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalPublisher");
        com.amazon.aps.iva.yb0.j.f(z1Var2, "externalPublisher");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
        z1Var.a(new e1(this), e1.class);
    }

    @Override // bo.app.r, bo.app.s1
    public boolean c() {
        return this.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a A[Catch: b -> 0x0024, TRY_LEAVE, TryCatch #0 {b -> 0x0024, blocks: (B:5:0x0008, B:7:0x000e, B:13:0x001a), top: B:18:0x0008 }] */
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
            java.lang.String r2 = r5.a()     // Catch: com.amazon.aps.iva.if0.b -> L24
            if (r2 == 0) goto L17
            boolean r2 = com.amazon.aps.iva.oe0.m.b0(r2)     // Catch: com.amazon.aps.iva.if0.b -> L24
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
            java.lang.String r3 = r5.a()     // Catch: com.amazon.aps.iva.if0.b -> L24
            r0.put(r2, r3)     // Catch: com.amazon.aps.iva.if0.b -> L24
        L23:
            return r0
        L24:
            r0 = move-exception
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            bo.app.f1$d r4 = bo.app.f1.d.b
            r2.brazelog(r5, r3, r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.f1.e():com.amazon.aps.iva.if0.c");
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

    @Override // bo.app.r, bo.app.s1
    public void a(Map map) {
        com.amazon.aps.iva.yb0.j.f(map, "existingHeaders");
        super.a(map);
        map.put("X-Braze-DataRequest", "true");
        map.put("X-Braze-FeatureFlagsRequest", "true");
    }
}
