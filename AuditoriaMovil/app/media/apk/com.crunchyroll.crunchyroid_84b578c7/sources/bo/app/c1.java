package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class c1 {
    public static final a h = new a(null);
    private final a5 a;
    private final r1 b;
    private List c;
    private final SharedPreferences d;
    private final SharedPreferences e;
    private final SharedPreferences f;
    private final AtomicInteger g;

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
            return "Did not find stored Feature Flags.";
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
            return "Failed to find stored Feature Flag keys.";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.b.c(new StringBuilder("Received null or blank serialized Feature Flag string for Feature Flag id "), this.b, " from shared preferences. Not parsing.");
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Encountered unexpected exception while parsing stored feature flags: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h() {
            super(0);
            c1.this = r1;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Not refreshing Feature Flags since another " + c1.this.b().get() + " request is currently in-flight.";
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j) {
            super(0);
            c1.this = r1;
            this.c = j;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Not enough time has passed since last Feature Flags refresh. Not refreshing Feature Flags. " + ((c1.this.e() - this.c) + c1.this.d().h()) + " seconds remaining until next available flush.";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ FeatureFlag b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(FeatureFlag featureFlag) {
            super(0);
            this.b = featureFlag;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error storing Feature Flag: " + this.b + '.';
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
            return "Added new Feature Flags to local storage.";
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(long j) {
            super(0);
            this.b = j;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Updating last Feature Flags refresh time: " + this.b;
        }
    }

    public c1(Context context, String str, String str2, z1 z1Var, a5 a5Var, r1 r1Var) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, "apiKey");
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalEventPublisher");
        com.amazon.aps.iva.yb0.j.f(a5Var, "serverConfigStorageProvider");
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        this.a = a5Var;
        this.b = r1Var;
        this.c = com.amazon.aps.iva.lb0.z.b;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.managers.featureflags.eligibility" + StringUtils.getCacheFileSuffix(context, str2, str), 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.d = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.braze.managers.featureflags.storage" + StringUtils.getCacheFileSuffix(context, str2, str), 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences2, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.e = sharedPreferences2;
        SharedPreferences sharedPreferences3 = context.getSharedPreferences("com.braze.managers.featureflags.impressions" + StringUtils.getCacheFileSuffix(context, str2, str), 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences3, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f = sharedPreferences3;
        this.g = new AtomicInteger(0);
        f();
        z1Var.b(l4.class, new com.amazon.aps.iva.y9.a(this, 0));
        z1Var.b(k4.class, new com.amazon.aps.iva.y9.b(this, 0));
        z1Var.b(e1.class, new com.amazon.aps.iva.y9.c(this, 0));
    }

    public final long e() {
        return this.d.getLong("last_refresh", 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x006c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f() {
        /*
            r15 = this;
            android.content.SharedPreferences r0 = r15.e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r0 = r0.getAll()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L18
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L16
            goto L18
        L16:
            r4 = r2
            goto L19
        L18:
            r4 = r3
        L19:
            com.amazon.aps.iva.lb0.z r5 = com.amazon.aps.iva.lb0.z.b
            if (r4 == 0) goto L2c
            com.braze.support.BrazeLogger r6 = com.braze.support.BrazeLogger.INSTANCE
            bo.app.c1$b r10 = bo.app.c1.b.b
            r8 = 0
            r9 = 0
            r11 = 3
            r12 = 0
            r7 = r15
            com.braze.support.BrazeLogger.brazelog$default(r6, r7, r8, r9, r10, r11, r12)
            r15.c = r5
            return
        L2c:
            java.util.Set r4 = r0.keySet()
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L46
            com.braze.support.BrazeLogger r7 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r9 = com.braze.support.BrazeLogger.Priority.W
            bo.app.c1$c r11 = bo.app.c1.c.b
            r10 = 0
            r12 = 2
            r13 = 0
            r8 = r15
            com.braze.support.BrazeLogger.brazelog$default(r7, r8, r9, r10, r11, r12, r13)
            r15.c = r5
            return
        L46:
            java.util.Iterator r4 = r4.iterator()
        L4a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9b
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L69
            boolean r7 = com.amazon.aps.iva.oe0.m.b0(r6)     // Catch: java.lang.Exception -> L67
            if (r7 == 0) goto L65
            goto L69
        L65:
            r7 = r2
            goto L6a
        L67:
            r5 = move-exception
            goto L8e
        L69:
            r7 = r3
        L6a:
            if (r7 == 0) goto L7d
            com.braze.support.BrazeLogger r8 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L67
            com.braze.support.BrazeLogger$Priority r10 = com.braze.support.BrazeLogger.Priority.W     // Catch: java.lang.Exception -> L67
            r11 = 0
            bo.app.c1$d r12 = new bo.app.c1$d     // Catch: java.lang.Exception -> L67
            r12.<init>(r5)     // Catch: java.lang.Exception -> L67
            r13 = 2
            r14 = 0
            r9 = r15
            com.braze.support.BrazeLogger.brazelog$default(r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> L67
            goto L4a
        L7d:
            com.amazon.aps.iva.if0.c r5 = new com.amazon.aps.iva.if0.c     // Catch: java.lang.Exception -> L67
            r5.<init>(r6)     // Catch: java.lang.Exception -> L67
            com.braze.support.d r7 = com.braze.support.d.a     // Catch: java.lang.Exception -> L67
            com.braze.models.FeatureFlag r5 = r7.a(r5)     // Catch: java.lang.Exception -> L67
            if (r5 == 0) goto L4a
            r1.add(r5)     // Catch: java.lang.Exception -> L67
            goto L4a
        L8e:
            com.braze.support.BrazeLogger r7 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r8 = com.braze.support.BrazeLogger.Priority.E
            bo.app.c1$e r9 = new bo.app.c1$e
            r9.<init>(r6)
            r7.brazelog(r15, r8, r5, r9)
            goto L4a
        L9b:
            r15.c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.c1.f():void");
    }

    private final void i() {
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new l(nowInSeconds), 2, (Object) null);
        this.d.edit().putLong("last_refresh", nowInSeconds).apply();
    }

    public final void g() {
        if (this.g.get() > 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(), 3, (Object) null);
            return;
        }
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        if (nowInSeconds - e() < this.a.h()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new i(nowInSeconds), 2, (Object) null);
        } else {
            a();
        }
    }

    public final void h() {
        this.f.edit().clear().apply();
    }

    public static final void a(c1 c1Var, l4 l4Var) {
        com.amazon.aps.iva.yb0.j.f(c1Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(l4Var, "it");
        if (l4Var.a() instanceof f1) {
            c1Var.g.incrementAndGet();
        }
    }

    public final AtomicInteger b() {
        return this.g;
    }

    public final List c() {
        List<FeatureFlag> list = this.c;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
        for (FeatureFlag featureFlag : list) {
            arrayList.add(featureFlag.deepcopy$android_sdk_base_release());
        }
        return arrayList;
    }

    public final a5 d() {
        return this.a;
    }

    public static final void a(c1 c1Var, k4 k4Var) {
        com.amazon.aps.iva.yb0.j.f(c1Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(k4Var, "it");
        if (k4Var.a() instanceof f1) {
            c1Var.g.decrementAndGet();
        }
    }

    public static final void a(c1 c1Var, e1 e1Var) {
        com.amazon.aps.iva.yb0.j.f(c1Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(e1Var, "it");
        c1Var.i();
    }

    public final void a() {
        this.b.refreshFeatureFlags();
    }

    public final FeatureFlagsUpdatedEvent a(com.amazon.aps.iva.if0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "featureFlagsData");
        this.c = com.braze.support.d.a.a(aVar);
        SharedPreferences.Editor edit = this.e.edit();
        edit.clear();
        for (FeatureFlag featureFlag : this.c) {
            try {
                edit.putString(featureFlag.getId(), featureFlag.forJsonPut().toString());
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new j(featureFlag));
            }
        }
        edit.apply();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, k.b, 3, (Object) null);
        return new FeatureFlagsUpdatedEvent(c());
    }
}
