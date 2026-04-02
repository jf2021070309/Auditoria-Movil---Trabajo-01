package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class i0 extends bo.app.a {
    public static final a f = new a(null);
    private final BrazeConfigurationProvider b;
    private final SharedPreferences c;
    private final SharedPreferences d;
    private h0 e;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: bo.app.i0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0074a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final C0074a b = new C0074a();

            public C0074a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Caught json exception while creating the diff. Returning null";
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
                return "shouldReportPushPermissionsAsGranted: Returning true given that push is permissible now and notifications enabled transitioned to true.";
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
                return "shouldReportPushPermissionsAsGranted: Returning true since notifications enabled is true and device has upgraded to Tiramisu or beyond.";
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
                return "Returning false for shouldReportPushPermissionsAsGranted.";
            }
        }

        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.amazon.aps.iva.if0.c a(com.amazon.aps.iva.if0.c cVar, com.amazon.aps.iva.if0.c cVar2) {
            com.amazon.aps.iva.if0.c cVar3 = new com.amazon.aps.iva.if0.c();
            Iterator<String> keys = cVar2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = cVar2.opt(next);
                Object opt2 = cVar.opt(next);
                if (opt != null) {
                    try {
                        if (opt instanceof com.amazon.aps.iva.if0.c) {
                            if (opt2 == null || !JsonUtils.areJsonObjectsEqual((com.amazon.aps.iva.if0.c) opt, (com.amazon.aps.iva.if0.c) opt2)) {
                                cVar3.put(next, opt);
                            }
                        } else if (!com.amazon.aps.iva.yb0.j.a(opt, opt2)) {
                            cVar3.put(next, opt);
                        }
                    } catch (com.amazon.aps.iva.if0.b e) {
                        BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, C0074a.b);
                        return null;
                    }
                }
            }
            return cVar3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.amazon.aps.iva.if0.c a(SharedPreferences sharedPreferences) {
            String string = sharedPreferences.getString("cached_device", "{}");
            return new com.amazon.aps.iva.if0.c(string != null ? string : "{}");
        }

        public final boolean a(com.amazon.aps.iva.if0.c cVar, com.amazon.aps.iva.if0.c cVar2, int i, int i2) {
            int i3;
            boolean z;
            com.amazon.aps.iva.yb0.j.f(cVar, "cachedDeviceJson");
            com.amazon.aps.iva.yb0.j.f(cVar2, "liveDeviceJson");
            if (i2 >= 33) {
                i3 = i;
                z = true;
            } else {
                i3 = i;
                z = false;
            }
            boolean z2 = !(i3 >= 33) && z;
            DeviceKey deviceKey = DeviceKey.NOTIFICATIONS_ENABLED;
            boolean optBoolean = cVar2.optBoolean(deviceKey.getKey(), false);
            boolean z3 = optBoolean && !cVar.optBoolean(deviceKey.getKey(), false);
            if (z && z3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
                return true;
            } else if (optBoolean && z2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
                return true;
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, d.b, 2, (Object) null);
                return false;
            }
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
            return "Caught exception confirming and unlocking device cache.";
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
            return "Sending full device on next export but keeping cache intact.";
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
            return "Caught exception confirming and unlocking JSON objects.";
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
            return "Failed to generate diff between the cached and live device. Returning the live device.";
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
            return "Remote Notification Enabled changed to true. Updating user subscription.";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z, boolean z2) {
            super(0);
            this.b = z;
            this.c = z2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Exporting the full device due to either: shouldShouldFullDeviceOnNextExport: " + this.b + ", shouldReportPushPermissionsAsGranted: " + this.c;
        }
    }

    public /* synthetic */ i0(Context context, String str, String str2, int i, com.amazon.aps.iva.yb0.e eVar) {
        this(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public final void a(h0 h0Var) {
        this.e = h0Var;
    }

    public final void e() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, c.b, 2, (Object) null);
        this.d.edit().putBoolean("sfone", true).apply();
    }

    @Override // bo.app.a
    /* renamed from: f */
    public h0 d() {
        com.amazon.aps.iva.if0.c cVar;
        com.amazon.aps.iva.if0.c a2;
        com.amazon.aps.iva.if0.c cVar2 = new com.amazon.aps.iva.if0.c();
        h0 h0Var = this.e;
        if (h0Var == null || (cVar = h0Var.forJsonPut()) == null) {
            cVar = new com.amazon.aps.iva.if0.c();
        }
        try {
            cVar2 = f.a(this.c);
        } catch (com.amazon.aps.iva.if0.b e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, d.b);
        }
        a aVar = f;
        SharedPreferences sharedPreferences = this.d;
        int i = Build.VERSION.SDK_INT;
        boolean a3 = aVar.a(cVar2, cVar, sharedPreferences.getInt("ldov", i), i);
        boolean z = this.d.getBoolean("sfone", false);
        if (!z && !a3) {
            a2 = aVar.a(cVar2, cVar);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new g(z, a3), 3, (Object) null);
            a2 = aVar.a(new com.amazon.aps.iva.if0.c(), cVar);
        }
        if (a2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, e.b, 3, (Object) null);
            return this.e;
        }
        h0 a4 = h0.n.a(this.b, a2);
        if (a3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, f.b, 2, (Object) null);
            a4.a(true);
        }
        return a4;
    }

    public i0(Context context, String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.b = new BrazeConfigurationProvider(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.device_cache.v3" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…y), Context.MODE_PRIVATE)");
        this.c = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.braze.storage.device_cache.metadata" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences2, "context.getSharedPrefere…y), Context.MODE_PRIVATE)");
        this.d = sharedPreferences2;
    }

    @Override // bo.app.a
    /* renamed from: a */
    public void b(h0 h0Var, boolean z) {
        com.amazon.aps.iva.yb0.j.f(h0Var, "outboundObject");
        if (z) {
            try {
                this.c.edit().putString("cached_device", JsonUtils.mergeJsonObjects(f.a(this.c), h0Var.forJsonPut()).toString()).apply();
                this.d.edit().putBoolean("sfone", false).putInt("ldov", Build.VERSION.SDK_INT).apply();
            } catch (com.amazon.aps.iva.if0.b e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, b.b);
            }
        }
    }
}
