package bo.app;

import bo.app.o3;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class p5 extends r {
    public static final a C = new a(null);
    private final b1 A;
    private final boolean B;
    private final q5 s;
    private final l2 t;
    private final String u;
    private final long v;
    private final long w;
    private final long x;
    private final q2 y;
    private o3 z;

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
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j) {
            super(0);
            this.b = j;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("Template request has not yet expired. It expires at time: "), this.b, ". Proceeding with retry.");
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;
        final /* synthetic */ p5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, p5 p5Var) {
            super(0);
            this.b = j;
            this.c = p5Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Template request expired at time: " + this.b + " and is not eligible for a response retry. Not retrying or performing any fallback triggers. " + this.c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(String str, q5 q5Var, l2 l2Var, String str2) {
        super(new q4(str.concat("template")), str2);
        com.amazon.aps.iva.yb0.j.f(str, "urlBase");
        com.amazon.aps.iva.yb0.j.f(q5Var, "templatedTriggeredAction");
        com.amazon.aps.iva.yb0.j.f(l2Var, "triggerEvent");
        this.s = q5Var;
        this.t = l2Var;
        this.u = q5Var.z();
        long a2 = a(q5Var.n());
        this.v = a2;
        long min = Math.min(a2, TimeUnit.MINUTES.toMillis(1L));
        this.w = min;
        this.x = q5Var.A();
        this.y = q5Var;
        this.z = new o3.a(null, null, null, null, 15, null).b(str2).a();
        this.A = new b1((int) min, (int) TimeUnit.SECONDS.toMillis(1L));
    }

    @Override // bo.app.e2
    public void a(z1 z1Var, z1 z1Var2, bo.app.d dVar) {
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalPublisher");
        com.amazon.aps.iva.yb0.j.f(z1Var2, "externalPublisher");
        m().c();
        if ((dVar != null ? dVar.i() : null) != null) {
            dVar.i().setLocalPrefetchedAssetPaths(this.s.y());
        }
    }

    @Override // bo.app.r, bo.app.s1
    public boolean c() {
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[Catch: b -> 0x005c, TryCatch #0 {b -> 0x005c, blocks: (B:6:0x000d, B:8:0x0029, B:10:0x0031, B:12:0x003f, B:17:0x004a, B:19:0x0052, B:21:0x0058), top: B:26:0x000d }] */
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
            com.amazon.aps.iva.if0.c r2 = new com.amazon.aps.iva.if0.c
            r2.<init>()
            java.lang.String r3 = "trigger_id"
            java.lang.String r4 = r5.u     // Catch: com.amazon.aps.iva.if0.b -> L5c
            r2.put(r3, r4)     // Catch: com.amazon.aps.iva.if0.b -> L5c
            java.lang.String r3 = "trigger_event_type"
            bo.app.l2 r4 = r5.t     // Catch: com.amazon.aps.iva.if0.b -> L5c
            java.lang.String r4 = r4.d()     // Catch: com.amazon.aps.iva.if0.b -> L5c
            r2.put(r3, r4)     // Catch: com.amazon.aps.iva.if0.b -> L5c
            java.lang.String r3 = "data"
            bo.app.l2 r4 = r5.t     // Catch: com.amazon.aps.iva.if0.b -> L5c
            bo.app.p1 r4 = r4.a()     // Catch: com.amazon.aps.iva.if0.b -> L5c
            if (r4 == 0) goto L30
            java.lang.Object r4 = r4.forJsonPut()     // Catch: com.amazon.aps.iva.if0.b -> L5c
            com.amazon.aps.iva.if0.c r4 = (com.amazon.aps.iva.if0.c) r4     // Catch: com.amazon.aps.iva.if0.b -> L5c
            goto L31
        L30:
            r4 = r1
        L31:
            r2.put(r3, r4)     // Catch: com.amazon.aps.iva.if0.b -> L5c
            java.lang.String r3 = "template"
            r0.put(r3, r2)     // Catch: com.amazon.aps.iva.if0.b -> L5c
            bo.app.o3 r2 = r5.f()     // Catch: com.amazon.aps.iva.if0.b -> L5c
            if (r2 == 0) goto L47
            boolean r2 = r2.y()     // Catch: com.amazon.aps.iva.if0.b -> L5c
            r3 = 1
            if (r2 != r3) goto L47
            goto L48
        L47:
            r3 = 0
        L48:
            if (r3 == 0) goto L5b
            java.lang.String r2 = "respond_with"
            bo.app.o3 r3 = r5.f()     // Catch: com.amazon.aps.iva.if0.b -> L5c
            if (r3 == 0) goto L57
            com.amazon.aps.iva.if0.c r3 = r3.forJsonPut()     // Catch: com.amazon.aps.iva.if0.b -> L5c
            goto L58
        L57:
            r3 = r1
        L58:
            r0.put(r2, r3)     // Catch: com.amazon.aps.iva.if0.b -> L5c
        L5b:
            return r0
        L5c:
            r0 = move-exception
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            bo.app.p5$b r4 = bo.app.p5.b.b
            r2.brazelog(r5, r3, r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.p5.e():com.amazon.aps.iva.if0.c");
    }

    @Override // bo.app.r, bo.app.s1
    public o3 f() {
        return this.z;
    }

    @Override // bo.app.r, bo.app.e2
    /* renamed from: t */
    public b1 m() {
        return this.A;
    }

    public final long u() {
        return this.x;
    }

    public final l2 v() {
        return this.t;
    }

    public final q2 w() {
        return this.y;
    }

    @Override // bo.app.r, bo.app.e2
    public void a(z1 z1Var, z1 z1Var2, g2 g2Var) {
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalPublisher");
        com.amazon.aps.iva.yb0.j.f(z1Var2, "externalPublisher");
        com.amazon.aps.iva.yb0.j.f(g2Var, "responseError");
        super.a(z1Var, z1Var2, g2Var);
        if (g2Var instanceof g) {
            z1Var.a(new h6(this.t, this.s), h6.class);
        }
    }

    @Override // bo.app.r, bo.app.e2
    public boolean a(g2 g2Var) {
        com.amazon.aps.iva.yb0.j.f(g2Var, "responseError");
        if ((g2Var instanceof g3) || (g2Var instanceof t4)) {
            long e = this.t.e() + this.v;
            if (DateTimeUtils.nowInMilliseconds() < e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new c(e), 2, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(e, this), 3, (Object) null);
            return false;
        }
        return false;
    }

    private final long a(h2 h2Var) {
        if (h2Var.k() == -1) {
            return TimeUnit.SECONDS.toMillis(h2Var.o() + 30);
        }
        return h2Var.k();
    }
}
