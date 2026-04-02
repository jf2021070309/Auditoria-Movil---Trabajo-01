package com.vungle.publisher.env;

import android.app.KeyguardManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.WindowManager;
import android.webkit.WebView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.vungle.publisher.inject.Injector;
import com.vungle.publisher.lm;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.zb;
import com.vungle.publisher.zj;
import com.vungle.publisher.zo;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class AndroidDevice implements i {
    static int a = 5000;
    String c;
    String d;
    @Inject
    lm e;
    @Inject
    WindowManager f;
    @Inject
    Context g;
    @Inject
    SharedPreferences h;
    @Inject
    DeviceIdStrategy i;
    @Inject
    String j;
    private boolean l;
    private final String k = Build.VERSION.RELEASE;
    final AtomicBoolean b = new AtomicBoolean();

    /* loaded from: classes4.dex */
    public static abstract class DeviceIdStrategy {
        protected abstract void d(AndroidDevice androidDevice);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Inject
    public AndroidDevice() {
        Injector.c().a(this);
    }

    @Override // com.vungle.publisher.env.i
    public String a() {
        h();
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return !TextUtils.isEmpty(this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.c = str;
        c();
        g();
    }

    void c() {
        if (b() && f()) {
            e();
        }
    }

    @Override // com.vungle.publisher.env.i
    public String d() {
        h();
        if (f() && b()) {
            Logger.w(Logger.DEVICE_TAG, "have advertising and Android ID");
            e();
        }
        return this.d;
    }

    void e() {
        Logger.i(Logger.DEVICE_TAG, "clearing Android ID");
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return !TextUtils.isEmpty(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        if (b()) {
            Logger.w(Logger.DEVICE_TAG, "have advertising id - not setting androidId");
            return;
        }
        Logger.d(Logger.DEVICE_TAG, "setting android ID " + str);
        this.d = str;
        g();
    }

    void g() {
        if (!this.b.getAndSet(true)) {
            synchronized (this.b) {
                this.b.notifyAll();
            }
        }
    }

    void h() {
        try {
            if (!this.b.get()) {
                long currentTimeMillis = System.currentTimeMillis() + a;
                synchronized (this.b) {
                    Logger.d(Logger.DEVICE_TAG, "waiting for device ID");
                    while (!this.b.get() && System.currentTimeMillis() < currentTimeMillis) {
                        try {
                            this.b.wait(a);
                        } catch (InterruptedException e) {
                            Logger.v(Logger.DEVICE_TAG, "interrupted while awaiting device ID");
                        }
                    }
                }
                if (this.b.get()) {
                    Logger.d(Logger.DEVICE_TAG, "obtained device ID");
                } else {
                    throw new j("timeout after " + a + " ms");
                }
            }
        } finally {
            if (!i()) {
                Logger.w(Logger.DEVICE_TAG, "no device ID available");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return b() || f();
    }

    @Override // com.vungle.publisher.env.i
    public boolean j() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.l = z;
    }

    @Override // com.vungle.publisher.env.i
    public Float k() {
        try {
            return Float.valueOf(this.e.b());
        } catch (Exception e) {
            Logger.d(Logger.DEVICE_TAG, "error getting volume info", e);
            return null;
        }
    }

    @Override // com.vungle.publisher.env.i
    public boolean l() {
        boolean equals = "mounted".equals(Environment.getExternalStorageState());
        boolean a2 = zj.a(this.g);
        if (a2 && equals) {
            Logger.v(Logger.DEVICE_TAG, "external storage writable");
        } else {
            Logger.w(Logger.DEVICE_TAG, "external storage not writable");
        }
        return a2 && equals;
    }

    public boolean m() {
        return c(Logger.DEVICE_TAG);
    }

    boolean c(String str) {
        boolean z;
        NoClassDefFoundError e;
        IllegalStateException e2;
        int isGooglePlayServicesAvailable;
        try {
            z = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.g) == 0;
            if (!z) {
                try {
                    Logger.w(str, "Google Play Services not available: " + GooglePlayServicesUtil.getErrorString(isGooglePlayServicesAvailable));
                } catch (IllegalStateException e3) {
                    e2 = e3;
                    Logger.w(Logger.CONFIG_TAG, zb.a(e2));
                    return z;
                } catch (NoClassDefFoundError e4) {
                    e = e4;
                    Logger.d(str, e.getClass().getSimpleName() + ": " + e.getMessage());
                    Logger.v(str, e);
                    return z;
                }
            }
        } catch (IllegalStateException e5) {
            z = false;
            e2 = e5;
        } catch (NoClassDefFoundError e6) {
            z = false;
            e = e6;
        }
        return z;
    }

    @Override // com.vungle.publisher.env.i
    public void n() {
        this.i.d(this);
    }

    @Override // com.vungle.publisher.env.i
    public String o() {
        return this.h.getString("defaultUserAgent", null);
    }

    @Override // com.vungle.publisher.env.i
    public void a(WebView webView) {
        this.h.edit().putString("defaultUserAgent", zo.a(webView)).apply();
    }

    @Override // com.vungle.publisher.env.i
    public boolean a(Context context) {
        return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    @Override // com.vungle.publisher.env.i
    public Long p() {
        Long l;
        StorageManager storageManager;
        try {
            File file = new File(this.j);
            StatFs statFs = new StatFs(file.getPath());
            if (Build.VERSION.SDK_INT < 26 || (storageManager = (StorageManager) this.g.getSystemService(StorageManager.class)) == null) {
                l = null;
            } else {
                l = Long.valueOf(storageManager.getCacheQuotaBytes(storageManager.getUuidForPath(file)));
            }
            try {
                l = Build.VERSION.SDK_INT >= 18 ? Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) : Long.valueOf(statFs.getBlockSize() * statFs.getAvailableBlocks());
            } catch (Exception e) {
                Logger.e(Logger.DEVICE_TAG, "error getting available bytes");
                return l;
            }
        } catch (Exception e2) {
            l = null;
        }
        return l;
    }

    @Override // com.vungle.publisher.env.i
    public String q() {
        return Build.FINGERPRINT;
    }

    @Override // com.vungle.publisher.env.i
    public int r() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.vungle.publisher.env.i
    public boolean s() {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                if (this.g.checkCallingOrSelfPermission("android.permission.REQUEST_INSTALL_PACKAGES") == 0) {
                    z = this.g.getApplicationContext().getPackageManager().canRequestPackageInstalls();
                }
            } else {
                z = Settings.Secure.getInt(this.g.getContentResolver(), "install_non_market_apps") == 1;
            }
        } catch (Settings.SettingNotFoundException e) {
            Logger.e(Logger.DEVICE_TAG, "isInstallNonMarketAppsEnabled Settings not found", e);
        }
        Logger.v(Logger.DEVICE_TAG, "isInstallNonMarketAppsEnabled: " + z);
        return z;
    }

    @Override // com.vungle.publisher.env.i
    public boolean t() {
        boolean z;
        boolean z2 = false;
        if (w.a) {
            z = this.g.getApplicationContext().getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
        } else if (Build.VERSION.SDK_INT >= 23) {
            z = ((UiModeManager) this.g.getSystemService("uimode")).getCurrentModeType() == 4;
        } else {
            if (this.g.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.tv") || !this.g.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                z2 = true;
            }
            z = z2;
        }
        Logger.v(Logger.DEVICE_TAG, "isTV: " + z);
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // com.vungle.publisher.env.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.gson.JsonObject u() {
        /*
            r7 = this;
            r3 = 0
            boolean r0 = com.vungle.publisher.env.w.a
            if (r0 == 0) goto L3b
            android.content.Context r0 = r7.g
            java.lang.String r1 = "location"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            r1 = 1
            java.util.List r1 = r0.getProviders(r1)
            java.util.Iterator r4 = r1.iterator()
            r2 = r3
        L19:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            android.location.Location r1 = r0.getLastKnownLocation(r1)
            if (r1 == 0) goto Ldb
            if (r2 == 0) goto L39
            float r5 = r1.getAccuracy()
            float r6 = r2.getAccuracy()
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto Ldb
        L39:
            r2 = r1
            goto L19
        L3b:
            android.content.Context r0 = r7.g     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lcb
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lcb
            java.lang.String r1 = "com.google.android.gms"
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lcb
            int r0 = r0.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lcb
            r1 = 11011000(0xa803b8, float:1.5429697E-38)
            if (r0 >= r1) goto La1
            java.lang.String r0 = "VungleDevice"
            java.lang.String r1 = "Play services version less than 11.0.11 !"
            com.vungle.publisher.log.Logger.w(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lcb
            r0 = r3
        L57:
            r2 = r0
        L58:
            if (r2 == 0) goto La0
            com.google.gson.JsonObject r3 = new com.google.gson.JsonObject
            r3.<init>()
            java.lang.String r0 = "accuracy"
            float r1 = r2.getAccuracy()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.addProperty(r0, r1)
            java.lang.String r0 = "latitude"
            double r4 = r2.getLatitude()
            java.lang.String r1 = java.lang.String.valueOf(r4)
            r3.addProperty(r0, r1)
            java.lang.String r0 = "longitude"
            double r4 = r2.getLongitude()
            java.lang.String r1 = java.lang.String.valueOf(r4)
            r3.addProperty(r0, r1)
            java.lang.String r0 = "speed"
            float r1 = r2.getSpeed()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.addProperty(r0, r1)
            java.lang.String r0 = "timestamp"
            long r4 = r2.getTime()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r3.addProperty(r0, r1)
        La0:
            return r3
        La1:
            android.content.Context r0 = r7.g     // Catch: java.lang.NoClassDefFoundError -> Lc2 android.content.pm.PackageManager.NameNotFoundException -> Lcb java.lang.NoSuchMethodError -> Ld5
            com.google.android.gms.location.FusedLocationProviderClient r0 = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(r0)     // Catch: java.lang.NoClassDefFoundError -> Lc2 android.content.pm.PackageManager.NameNotFoundException -> Lcb java.lang.NoSuchMethodError -> Ld5
            com.google.android.gms.tasks.Task r0 = r0.getLastLocation()     // Catch: java.lang.NoClassDefFoundError -> Lc2 android.content.pm.PackageManager.NameNotFoundException -> Lcb java.lang.NoSuchMethodError -> Ld5
            r4 = 100
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> Lb6 java.lang.NoClassDefFoundError -> Lc2 android.content.pm.PackageManager.NameNotFoundException -> Lcb java.lang.NoSuchMethodError -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.util.concurrent.TimeoutException -> Ld9
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0, r4, r1)     // Catch: java.lang.InterruptedException -> Lb6 java.lang.NoClassDefFoundError -> Lc2 android.content.pm.PackageManager.NameNotFoundException -> Lcb java.lang.NoSuchMethodError -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.util.concurrent.TimeoutException -> Ld9
            android.location.Location r0 = (android.location.Location) r0     // Catch: java.lang.InterruptedException -> Lb6 java.lang.NoClassDefFoundError -> Lc2 android.content.pm.PackageManager.NameNotFoundException -> Lcb java.lang.NoSuchMethodError -> Ld5 java.util.concurrent.ExecutionException -> Ld7 java.util.concurrent.TimeoutException -> Ld9
            goto L57
        Lb6:
            r0 = move-exception
        Lb7:
            java.lang.String r1 = "VungleDevice"
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.NoClassDefFoundError -> Lc2 android.content.pm.PackageManager.NameNotFoundException -> Lcb java.lang.NoSuchMethodError -> Ld5
            com.vungle.publisher.log.Logger.w(r1, r0)     // Catch: java.lang.NoClassDefFoundError -> Lc2 android.content.pm.PackageManager.NameNotFoundException -> Lcb java.lang.NoSuchMethodError -> Ld5
        Lc0:
            r0 = r3
            goto L57
        Lc2:
            r0 = move-exception
        Lc3:
            java.lang.String r0 = "VungleDevice"
            java.lang.String r1 = "Location Play services FusedLocationProviderClient classes not present, cant get Loc data"
            com.vungle.publisher.log.Logger.w(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lcb
            goto Lc0
        Lcb:
            r0 = move-exception
            java.lang.String r0 = "VungleDevice"
            java.lang.String r1 = "Play services not present, No Loc data !"
            com.vungle.publisher.log.Logger.w(r0, r1)
            r2 = r3
            goto L58
        Ld5:
            r0 = move-exception
            goto Lc3
        Ld7:
            r0 = move-exception
            goto Lb7
        Ld9:
            r0 = move-exception
            goto Lb7
        Ldb:
            r1 = r2
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.publisher.env.AndroidDevice.u():com.google.gson.JsonObject");
    }
}
