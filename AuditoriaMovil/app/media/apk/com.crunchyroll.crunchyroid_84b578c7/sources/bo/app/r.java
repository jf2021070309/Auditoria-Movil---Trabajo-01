package bo.app;

import com.braze.Braze;
import com.braze.enums.SdkFlavor;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class r extends j4 implements s1 {
    public static final a r = new a(null);
    private String b;
    private Long c;
    private String d;
    private String e;
    private String f;
    private h0 g;
    private String h;
    private String i;
    private SdkFlavor j;
    private p3 k;
    private o3 l;
    private bo.app.k m;
    private String n;
    private EnumSet o;
    private final o1 p;
    private final boolean q;

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
            return "Trigger dispatch completed. Alerting subscribers.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error occurred while executing Braze request: " + this.b;
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
            return "******************************************************************";
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
            return "**                        !! WARNING !!                         **";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final f b = new f();

        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "**  The current API key/endpoint combination is invalid. This   **";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final g b = new g();

        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "** is potentially an integration error. Please ensure that your **";
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final h b = new h();

        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "**     API key AND custom endpoint information are correct.     **";
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return ">> API key    : " + r.this.n();
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return ">> Request Uri: " + r.this.i();
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final k b = new k();

        public k() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "******************************************************************";
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final l b = new l();

        public l() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    public /* synthetic */ r(q4 q4Var, String str, int i2, com.amazon.aps.iva.yb0.e eVar) {
        this(q4Var, (i2 & 2) != 0 ? null : str);
    }

    @Override // bo.app.e2
    public boolean a(g2 g2Var) {
        com.amazon.aps.iva.yb0.j.f(g2Var, "responseError");
        return false;
    }

    @Override // bo.app.s1
    public void b(String str) {
        this.f = str;
    }

    @Override // bo.app.s1
    public void c(String str) {
        this.d = str;
    }

    @Override // bo.app.s1
    public void d(String str) {
        this.h = str;
    }

    @Override // bo.app.s1
    public void e(String str) {
        this.n = str;
    }

    @Override // bo.app.s1
    public void f(String str) {
        this.i = str;
    }

    @Override // bo.app.s1
    public void g(String str) {
        this.e = str;
    }

    public boolean h() {
        return this.q;
    }

    @Override // bo.app.e2
    public q4 i() {
        return new q4(Braze.Companion.getApiEndpoint(this.a.a()));
    }

    @Override // bo.app.s1
    public EnumSet j() {
        return this.o;
    }

    @Override // bo.app.s1
    public Long k() {
        return this.c;
    }

    public String l() {
        return this.n;
    }

    @Override // bo.app.e2
    public o1 m() {
        return this.p;
    }

    public String n() {
        return this.e;
    }

    public String o() {
        return this.d;
    }

    public String p() {
        return this.i;
    }

    public String q() {
        return this.h;
    }

    public SdkFlavor r() {
        return this.j;
    }

    public String s() {
        return this.f;
    }

    public String toString() {
        return JsonUtils.getPrettyPrintedString(e()) + "\nto target: " + i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q4 q4Var, String str) {
        super(q4Var);
        com.amazon.aps.iva.yb0.j.f(q4Var, "requestTarget");
        this.b = str;
        this.p = new b1((int) TimeUnit.MINUTES.toMillis(5L), 0, 2, null);
    }

    public String a() {
        return this.b;
    }

    @Override // bo.app.s1
    public h0 b() {
        return this.g;
    }

    public boolean c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(b());
        arrayList.add(d());
        arrayList.add(g());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y1 y1Var = (y1) it.next();
            if (y1Var != null && !y1Var.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // bo.app.s1
    public p3 d() {
        return this.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[Catch: b -> 0x00cf, TryCatch #0 {b -> 0x00cf, blocks: (B:3:0x0005, B:5:0x000b, B:6:0x0014, B:8:0x001a, B:9:0x0023, B:11:0x0029, B:12:0x0032, B:14:0x0038, B:15:0x0041, B:17:0x0047, B:18:0x0050, B:20:0x0056, B:26:0x0062, B:27:0x006b, B:29:0x0071, B:31:0x0077, B:32:0x0080, B:34:0x0086, B:36:0x008c, B:37:0x0095, B:39:0x009b, B:41:0x00a1, B:42:0x00ae, B:44:0x00b4, B:45:0x00bd, B:47:0x00c3), top: B:52:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4 A[Catch: b -> 0x00cf, TryCatch #0 {b -> 0x00cf, blocks: (B:3:0x0005, B:5:0x000b, B:6:0x0014, B:8:0x001a, B:9:0x0023, B:11:0x0029, B:12:0x0032, B:14:0x0038, B:15:0x0041, B:17:0x0047, B:18:0x0050, B:20:0x0056, B:26:0x0062, B:27:0x006b, B:29:0x0071, B:31:0x0077, B:32:0x0080, B:34:0x0086, B:36:0x008c, B:37:0x0095, B:39:0x009b, B:41:0x00a1, B:42:0x00ae, B:44:0x00b4, B:45:0x00bd, B:47:0x00c3), top: B:52:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3 A[Catch: b -> 0x00cf, TRY_LEAVE, TryCatch #0 {b -> 0x00cf, blocks: (B:3:0x0005, B:5:0x000b, B:6:0x0014, B:8:0x001a, B:9:0x0023, B:11:0x0029, B:12:0x0032, B:14:0x0038, B:15:0x0041, B:17:0x0047, B:18:0x0050, B:20:0x0056, B:26:0x0062, B:27:0x006b, B:29:0x0071, B:31:0x0077, B:32:0x0080, B:34:0x0086, B:36:0x008c, B:37:0x0095, B:39:0x009b, B:41:0x00a1, B:42:0x00ae, B:44:0x00b4, B:45:0x00bd, B:47:0x00c3), top: B:52:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.aps.iva.if0.c e() {
        /*
            r4 = this;
            com.amazon.aps.iva.if0.c r0 = new com.amazon.aps.iva.if0.c
            r0.<init>()
            java.lang.String r1 = r4.o()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            if (r1 == 0) goto L14
            java.lang.String r1 = "device_id"
            java.lang.String r2 = r4.o()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            r0.put(r1, r2)     // Catch: com.amazon.aps.iva.if0.b -> Lcf
        L14:
            java.lang.Long r1 = r4.k()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            if (r1 == 0) goto L23
            java.lang.String r1 = "time"
            java.lang.Long r2 = r4.k()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            r0.put(r1, r2)     // Catch: com.amazon.aps.iva.if0.b -> Lcf
        L23:
            java.lang.String r1 = r4.n()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            if (r1 == 0) goto L32
            java.lang.String r1 = "api_key"
            java.lang.String r2 = r4.n()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            r0.put(r1, r2)     // Catch: com.amazon.aps.iva.if0.b -> Lcf
        L32:
            java.lang.String r1 = r4.s()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            if (r1 == 0) goto L41
            java.lang.String r1 = "sdk_version"
            java.lang.String r2 = r4.s()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            r0.put(r1, r2)     // Catch: com.amazon.aps.iva.if0.b -> Lcf
        L41:
            java.lang.String r1 = r4.q()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            if (r1 == 0) goto L50
            java.lang.String r1 = "app_version"
            java.lang.String r2 = r4.q()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            r0.put(r1, r2)     // Catch: com.amazon.aps.iva.if0.b -> Lcf
        L50:
            java.lang.String r1 = r4.p()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            if (r1 == 0) goto L5f
            boolean r1 = com.amazon.aps.iva.oe0.m.b0(r1)     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            if (r1 == 0) goto L5d
            goto L5f
        L5d:
            r1 = 0
            goto L60
        L5f:
            r1 = 1
        L60:
            if (r1 != 0) goto L6b
            java.lang.String r1 = "app_version_code"
            java.lang.String r2 = r4.p()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            r0.put(r1, r2)     // Catch: com.amazon.aps.iva.if0.b -> Lcf
        L6b:
            bo.app.h0 r1 = r4.b()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            if (r1 == 0) goto L80
            boolean r2 = r1.isEmpty()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            if (r2 != 0) goto L80
            java.lang.String r2 = "device"
            com.amazon.aps.iva.if0.c r1 = r1.forJsonPut()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            r0.put(r2, r1)     // Catch: com.amazon.aps.iva.if0.b -> Lcf
        L80:
            bo.app.p3 r1 = r4.d()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            if (r1 == 0) goto L95
            boolean r2 = r1.isEmpty()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            if (r2 != 0) goto L95
            java.lang.String r2 = "attributes"
            com.amazon.aps.iva.if0.a r1 = r1.forJsonPut()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            r0.put(r2, r1)     // Catch: com.amazon.aps.iva.if0.b -> Lcf
        L95:
            bo.app.k r1 = r4.g()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            if (r1 == 0) goto Lae
            boolean r2 = r1.isEmpty()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            if (r2 != 0) goto Lae
            java.lang.String r2 = "events"
            java.util.Set r1 = r1.b()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            com.amazon.aps.iva.if0.a r1 = com.braze.support.JsonUtils.constructJsonArray(r1)     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            r0.put(r2, r1)     // Catch: com.amazon.aps.iva.if0.b -> Lcf
        Lae:
            com.braze.enums.SdkFlavor r1 = r4.r()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            if (r1 == 0) goto Lbd
            java.lang.String r2 = "sdk_flavor"
            java.lang.String r1 = r1.forJsonPut()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            r0.put(r2, r1)     // Catch: com.amazon.aps.iva.if0.b -> Lcf
        Lbd:
            java.util.EnumSet r1 = r4.j()     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            if (r1 == 0) goto Lce
            java.lang.String r2 = "sdk_metadata"
            com.braze.enums.BrazeSdkMetadata$a r3 = com.braze.enums.BrazeSdkMetadata.Companion     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            com.amazon.aps.iva.if0.a r1 = r3.a(r1)     // Catch: com.amazon.aps.iva.if0.b -> Lcf
            r0.put(r2, r1)     // Catch: com.amazon.aps.iva.if0.b -> Lcf
        Lce:
            return r0
        Lcf:
            r0 = move-exception
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.W
            bo.app.r$l r3 = bo.app.r.l.b
            r1.brazelog(r4, r2, r0, r3)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.r.e():com.amazon.aps.iva.if0.c");
    }

    public o3 f() {
        return this.l;
    }

    @Override // bo.app.s1
    public bo.app.k g() {
        return this.m;
    }

    @Override // bo.app.s1
    public void a(String str) {
        this.b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0.x() == true) goto L5;
     */
    @Override // bo.app.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(bo.app.z1 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "internalPublisher"
            com.amazon.aps.iva.yb0.j.f(r10, r0)
            bo.app.o3 r0 = r9.f()
            if (r0 == 0) goto L13
            boolean r0 = r0.x()
            r1 = 1
            if (r0 != r1) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            if (r1 == 0) goto L2c
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            bo.app.r$b r6 = bo.app.r.b.b
            r4 = 0
            r5 = 0
            r7 = 3
            r8 = 0
            r3 = r9
            com.braze.support.BrazeLogger.brazelog$default(r2, r3, r4, r5, r6, r7, r8)
            bo.app.w5 r0 = new bo.app.w5
            r0.<init>(r9)
            java.lang.Class<bo.app.w5> r1 = bo.app.w5.class
            r10.a(r0, r1)
        L2c:
            bo.app.k4 r0 = new bo.app.k4
            r0.<init>(r9)
            java.lang.Class<bo.app.k4> r1 = bo.app.k4.class
            r10.a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.r.b(bo.app.z1):void");
    }

    @Override // bo.app.s1
    public void a(Long l2) {
        this.c = l2;
    }

    @Override // bo.app.s1
    public void a(h0 h0Var) {
        this.g = h0Var;
    }

    @Override // bo.app.s1
    public void a(SdkFlavor sdkFlavor) {
        this.j = sdkFlavor;
    }

    @Override // bo.app.s1
    public void a(p3 p3Var) {
        this.k = p3Var;
    }

    @Override // bo.app.s1
    public void a(bo.app.k kVar) {
        this.m = kVar;
    }

    @Override // bo.app.s1
    public void a(EnumSet enumSet) {
        this.o = enumSet;
    }

    @Override // bo.app.e2
    public void a(z1 z1Var, z1 z1Var2, g2 g2Var) {
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalPublisher");
        com.amazon.aps.iva.yb0.j.f(z1Var2, "externalPublisher");
        com.amazon.aps.iva.yb0.j.f(g2Var, "responseError");
        String a2 = g2Var.a();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new c(a2), 2, (Object) null);
        if (g2Var instanceof y2) {
            z1Var.a(g2Var, y2.class);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, d.b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, e.b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, f.b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, g.b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, h.b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new i(), 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new j(), 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, k.b, 2, (Object) null);
        }
        if (g2Var instanceof t4) {
            z1Var2.a(new BrazeSdkAuthenticationErrorEvent((t4) g2Var), BrazeSdkAuthenticationErrorEvent.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0.x() == true) goto L5;
     */
    @Override // bo.app.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(bo.app.z1 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "internalPublisher"
            com.amazon.aps.iva.yb0.j.f(r3, r0)
            bo.app.o3 r0 = r2.f()
            if (r0 == 0) goto L13
            boolean r0 = r0.x()
            r1 = 1
            if (r0 != r1) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            if (r1 == 0) goto L20
            bo.app.x5 r0 = new bo.app.x5
            r0.<init>(r2)
            java.lang.Class<bo.app.x5> r1 = bo.app.x5.class
            r3.a(r0, r1)
        L20:
            bo.app.l4 r0 = new bo.app.l4
            r0.<init>(r2)
            java.lang.Class<bo.app.l4> r1 = bo.app.l4.class
            r3.a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.r.a(bo.app.z1):void");
    }

    public void a(Map map) {
        com.amazon.aps.iva.yb0.j.f(map, "existingHeaders");
        map.put("X-Braze-Api-Key", n());
        String l2 = l();
        if (l2 == null || l2.length() == 0) {
            return;
        }
        map.put("X-Braze-Auth-Signature", l());
    }
}
