package bo.app;

import com.braze.support.BrazeLogger;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class b4 extends r {
    public static final a w = new a(null);
    private final List s;
    private final boolean t;
    private final boolean u;
    private final o1 v;

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
            return "PushDeliverySendRequest failed.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;
        final /* synthetic */ b4 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, b4 b4Var) {
            super(0);
            this.b = j;
            this.c = b4Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Scheduling a retry of PushDeliverySendRequest after a delay of " + this.b + " ms. " + this.c;
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
            return "PushDeliverySendRequest executed successfully.";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final e b = new e();

        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while creating PushDeliverySendRequest. Returning null.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(String str, String str2, List list) {
        super(new q4(str.concat("push/delivery_events")), str2);
        com.amazon.aps.iva.yb0.j.f(str, "urlBase");
        com.amazon.aps.iva.yb0.j.f(list, "pushDeliveryEvents");
        this.s = list;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.v = new b1((int) timeUnit.toMillis(10L), (int) timeUnit.toMillis(1L));
    }

    @Override // bo.app.e2
    public void a(z1 z1Var, z1 z1Var2, bo.app.d dVar) {
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalPublisher");
        com.amazon.aps.iva.yb0.j.f(z1Var2, "externalPublisher");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, d.b, 3, (Object) null);
    }

    @Override // bo.app.r, bo.app.s1
    public boolean c() {
        return this.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[Catch: b -> 0x004f, TryCatch #0 {b -> 0x004f, blocks: (B:5:0x0008, B:6:0x0013, B:8:0x0019, B:9:0x002e, B:11:0x0034, B:17:0x0040, B:18:0x0049), top: B:23:0x0008 }] */
    @Override // bo.app.r, bo.app.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.aps.iva.if0.c e() {
        /*
            r6 = this;
            com.amazon.aps.iva.if0.c r0 = super.e()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.amazon.aps.iva.if0.a r2 = new com.amazon.aps.iva.if0.a     // Catch: com.amazon.aps.iva.if0.b -> L4f
            r2.<init>()     // Catch: com.amazon.aps.iva.if0.b -> L4f
            java.util.List r3 = r6.s     // Catch: com.amazon.aps.iva.if0.b -> L4f
            java.util.Iterator r3 = r3.iterator()     // Catch: com.amazon.aps.iva.if0.b -> L4f
        L13:
            boolean r4 = r3.hasNext()     // Catch: com.amazon.aps.iva.if0.b -> L4f
            if (r4 == 0) goto L2e
            java.lang.Object r4 = r3.next()     // Catch: com.amazon.aps.iva.if0.b -> L4f
            bo.app.z3 r4 = (bo.app.z3) r4     // Catch: com.amazon.aps.iva.if0.b -> L4f
            java.lang.String r5 = r6.a()     // Catch: com.amazon.aps.iva.if0.b -> L4f
            r4.a(r5)     // Catch: com.amazon.aps.iva.if0.b -> L4f
            com.amazon.aps.iva.if0.c r4 = r4.forJsonPut()     // Catch: com.amazon.aps.iva.if0.b -> L4f
            r2.put(r4)     // Catch: com.amazon.aps.iva.if0.b -> L4f
            goto L13
        L2e:
            java.lang.String r3 = r6.a()     // Catch: com.amazon.aps.iva.if0.b -> L4f
            if (r3 == 0) goto L3d
            boolean r3 = com.amazon.aps.iva.oe0.m.b0(r3)     // Catch: com.amazon.aps.iva.if0.b -> L4f
            if (r3 == 0) goto L3b
            goto L3d
        L3b:
            r3 = 0
            goto L3e
        L3d:
            r3 = 1
        L3e:
            if (r3 != 0) goto L49
            java.lang.String r3 = "user_id"
            java.lang.String r4 = r6.a()     // Catch: com.amazon.aps.iva.if0.b -> L4f
            r0.put(r3, r4)     // Catch: com.amazon.aps.iva.if0.b -> L4f
        L49:
            java.lang.String r3 = "events"
            r0.put(r3, r2)     // Catch: com.amazon.aps.iva.if0.b -> L4f
            return r0
        L4f:
            r0 = move-exception
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.W
            bo.app.b4$e r4 = bo.app.b4.e.b
            r2.brazelog(r6, r3, r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.b4.e():com.amazon.aps.iva.if0.c");
    }

    @Override // bo.app.r, bo.app.s1
    public boolean h() {
        return this.u;
    }

    @Override // bo.app.r, bo.app.e2
    public o1 m() {
        return this.v;
    }

    public final List t() {
        return this.s;
    }

    @Override // bo.app.r, bo.app.e2
    public void a(z1 z1Var, z1 z1Var2, g2 g2Var) {
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalPublisher");
        com.amazon.aps.iva.yb0.j.f(z1Var2, "externalPublisher");
        com.amazon.aps.iva.yb0.j.f(g2Var, "responseError");
        super.a(z1Var, z1Var2, g2Var);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
        if ((g2Var instanceof g3) || (g2Var instanceof t4)) {
            long a2 = m().a();
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new c(a2, this), 2, (Object) null);
            z1Var.a(new s4(a2), s4.class);
        }
    }
}
