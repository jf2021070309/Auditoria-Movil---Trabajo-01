package bo.app;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import bo.app.h0;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes.dex */
public final class j0 implements v1 {
    public static final a f = new a(null);
    private Context a;
    private final BrazeConfigurationProvider b;
    private final String c;
    public final SharedPreferences d;
    private PackageInfo e;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: bo.app.j0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0077a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final C0077a b = new C0077a();

            public C0077a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Failed to obtain device resolution";
            }
        }

        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final String a(Context context, boolean z) {
            com.amazon.aps.iva.yb0.j.f(context, "context");
            try {
                com.amazon.aps.iva.kb0.j<Integer, Integer> displayHeightAndWidthPixels = BrazeImageUtils.getDisplayHeightAndWidthPixels(context);
                int intValue = displayHeightAndWidthPixels.b.intValue();
                int intValue2 = displayHeightAndWidthPixels.c.intValue();
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(intValue);
                    sb.append('x');
                    sb.append(intValue2);
                    return sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(intValue2);
                sb2.append('x');
                sb2.append(intValue);
                return sb2.toString();
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, C0077a.b);
                return null;
            }
        }

        private a() {
        }

        public final String a(Locale locale) {
            com.amazon.aps.iva.yb0.j.f(locale, "locale");
            String locale2 = locale.toString();
            com.amazon.aps.iva.yb0.j.e(locale2, "locale.toString()");
            return locale2;
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
            return "App version code could not be read. Returning null";
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
            return "Failed to collect background restriction information from Activity Manager";
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
            return "Caught exception while reading the phone carrier name.";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return com.amazon.aps.iva.o0.t1.b(new StringBuilder("Unable to inspect package ["), this.b, ']');
        }
    }

    public j0(Context context, BrazeConfigurationProvider brazeConfigurationProvider) {
        String str;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "configurationProvider");
        this.a = context;
        this.b = brazeConfigurationProvider;
        PackageInfo m = m();
        if (m != null) {
            str = m.versionName;
        } else {
            str = null;
        }
        this.c = str;
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("com.appboy.managers.device_data_provider", 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.d = sharedPreferences;
    }

    private final boolean g() {
        boolean isBackgroundRestricted;
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            Object systemService = this.a.getSystemService("activity");
            com.amazon.aps.iva.yb0.j.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            isBackgroundRestricted = ((ActivityManager) systemService).isBackgroundRestricted();
            return isBackgroundRestricted;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, d.b);
            return false;
        }
    }

    private final boolean h() {
        if (this.a.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private final String i() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    private final String j() {
        try {
            Object systemService = this.a.getSystemService("phone");
            com.amazon.aps.iva.yb0.j.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            if (networkOperatorName == null) {
                return null;
            }
            return com.amazon.aps.iva.oe0.q.O0(networkOperatorName).toString();
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, e.b);
            return null;
        }
    }

    private final Locale k() {
        Locale locale = Locale.getDefault();
        com.amazon.aps.iva.yb0.j.e(locale, "getDefault()");
        return locale;
    }

    private final TimeZone l() {
        TimeZone timeZone = TimeZone.getDefault();
        com.amazon.aps.iva.yb0.j.e(timeZone, "getDefault()");
        return timeZone;
    }

    private final PackageInfo m() {
        PackageInfo packageArchiveInfo;
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of2;
        PackageInfo packageInfo2 = this.e;
        if (packageInfo2 != null) {
            return packageInfo2;
        }
        String packageName = this.a.getPackageName();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.a.getPackageManager();
                of2 = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(packageName, of2);
            } else {
                packageInfo = this.a.getPackageManager().getPackageInfo(packageName, 0);
            }
            this.e = packageInfo;
            return packageInfo;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new f(packageName));
            ApplicationInfo applicationInfo = this.a.getApplicationInfo();
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager2 = this.a.getPackageManager();
                String str = applicationInfo.sourceDir;
                of = PackageManager.PackageInfoFlags.of(0L);
                packageArchiveInfo = packageManager2.getPackageArchiveInfo(str, of);
            } else {
                packageArchiveInfo = this.a.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, 0);
            }
            this.e = packageArchiveInfo;
            return packageArchiveInfo;
        }
    }

    @Override // bo.app.v1
    public String a() {
        return this.c;
    }

    @Override // bo.app.v1
    public h0 b() {
        h0.a e2 = new h0.a(this.b).a(i()).b(j()).e(Build.MODEL);
        a aVar = f;
        return e2.d(aVar.a(k())).g(l().getID()).f(aVar.a(this.a, h())).c(Boolean.valueOf(e())).b(Boolean.valueOf(g())).c(d()).a(f()).a();
    }

    @Override // bo.app.v1
    public String c() {
        long a2;
        PackageInfo m = m();
        if (m != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                a2 = m.getLongVersionCode();
            } else {
                a2 = com.amazon.aps.iva.e3.a.a(m);
            }
            return a2 + ".0.0.0";
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
        return null;
    }

    public final String d() {
        return this.d.getString("google_ad_id", null);
    }

    public final boolean e() {
        Object systemService = this.a.getSystemService("notification");
        com.amazon.aps.iva.yb0.j.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return ((NotificationManager) systemService).areNotificationsEnabled();
    }

    public final Boolean f() {
        if (!this.d.contains("ad_tracking_enabled")) {
            return null;
        }
        return Boolean.valueOf(this.d.getBoolean("ad_tracking_enabled", true));
    }

    @Override // bo.app.v1
    public h0 a(i0 i0Var) {
        com.amazon.aps.iva.yb0.j.f(i0Var, "deviceCache");
        i0Var.a(b());
        return (h0) i0Var.a();
    }
}
