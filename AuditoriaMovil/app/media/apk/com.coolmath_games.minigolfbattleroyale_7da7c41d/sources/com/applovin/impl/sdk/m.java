package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.Window;
import android.view.WindowInsets;
import com.applovin.impl.sdk.e.f;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class m {
    private static String h;
    private static int i;
    private static final AtomicReference<a> j = new AtomicReference<>();
    private final k a;
    private final r b;
    private final Context c;
    private final Map<String, Object> d;
    private final Map<String, Object> f;
    private boolean g;
    private final Object e = new Object();
    private final AtomicReference<Integer> k = new AtomicReference<>();

    /* loaded from: classes.dex */
    public static class a {
        public boolean a;
        public String b = "";
    }

    /* loaded from: classes.dex */
    public static class b {
        public int a = -1;
        public int b = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.a = kVar;
        this.b = kVar.z();
        this.c = kVar.J();
        this.d = o();
        this.f = q();
    }

    private double A() {
        return Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
    }

    private boolean B() {
        return this.c.getPackageManager().hasSystemFeature(com.applovin.impl.sdk.utils.f.d() ? "android.software.leanback" : "android.hardware.type.television");
    }

    private boolean C() {
        SensorManager sensorManager = (SensorManager) this.c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private String D() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String E() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                return telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                this.b.b("DataCollector", "Unable to collect carrier", th);
                return "";
            }
        }
        return "";
    }

    private boolean F() {
        try {
            if (!G()) {
                if (!H()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean G() {
        String str = Build.TAGS;
        return str != null && str.contains(b("lz}$blpz"));
    }

    private boolean H() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i2 = 0; i2 < 9; i2++) {
            if (new File(b(strArr[i2])).exists()) {
                return true;
            }
        }
        return false;
    }

    private String a(int i2) {
        if (i2 == 1) {
            return "receiver";
        }
        if (i2 == 2) {
            return "speaker";
        }
        if (i2 == 4 || i2 == 3) {
            return "headphones";
        }
        if (i2 == 8) {
            return "bluetootha2dpoutput";
        }
        if (i2 == 13 || i2 == 19 || i2 == 5 || i2 == 6 || i2 == 12 || i2 == 11) {
            return "lineout";
        }
        if (i2 == 9 || i2 == 10) {
            return "hdmioutput";
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(42:1|(41:3|(1:5)(2:94|(1:96))|6|(1:8)|9|(1:11)|12|(1:14)|15|(1:17)|18|(1:20)|21|(1:23)|(1:25)(1:93)|(1:27)|28|29|30|(2:32|(1:34))|35|(2:85|86)|37|(2:39|(1:41))|42|(1:48)|49|(3:51|52|53)(1:84)|54|(2:56|(1:58))|59|(1:61)|62|(1:66)|67|(1:71)|72|(1:76)|77|(1:79)|80)|97|6|(0)|9|(0)|12|(0)|15|(0)|18|(0)|21|(0)|(0)(0)|(0)|28|29|30|(0)|35|(0)|37|(0)|42|(3:44|46|48)|49|(0)(0)|54|(0)|59|(0)|62|(2:64|66)|67|(2:69|71)|72|(2:74|76)|77|(0)|80) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011d, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011e, code lost:
        r6.b.b("DataCollector", "Unable to collect screen brightness", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, java.lang.Object> a(java.util.Map<java.lang.String, java.lang.Object> r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.m.a(java.util.Map, boolean):java.util.Map");
    }

    public static void a(final Context context) {
        new Thread(new Runnable() { // from class: com.applovin.impl.sdk.m.1
            @Override // java.lang.Runnable
            public void run() {
                m.j.set(m.c(context));
            }
        }).start();
    }

    private void a(Map<String, Object> map) {
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dG)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(u()));
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dH)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(v()));
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dN)).booleanValue()) {
            y.c(this.a);
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dM)).booleanValue()) {
            y.b(this.a);
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dL)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dI)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(r()));
        }
        map.put("htn", Boolean.valueOf(y()));
    }

    private boolean a(String str) {
        try {
            return Settings.Secure.getInt(this.c.getContentResolver(), str) == 1;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    private boolean a(String str, String str2) {
        for (String str3 : CollectionUtils.explode(str2)) {
            if (str.startsWith(str3)) {
                return true;
            }
        }
        return false;
    }

    private String b(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = str.charAt(i2);
            for (int i3 = 9; i3 >= 0; i3--) {
                cArr[i2] = (char) (cArr[i2] ^ iArr[i3]);
            }
        }
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a c(Context context) {
        if (s()) {
            try {
                a aVar = new a();
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                aVar.a = advertisingIdInfo.isLimitAdTrackingEnabled();
                aVar.b = advertisingIdInfo.getId();
                return aVar;
            } catch (Throwable th) {
                r.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
            }
        } else {
            r.i("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
        }
        return new a();
    }

    private Map<String, String> n() {
        return Utils.stringifyObjectMap(a(null, true, false));
    }

    private Map<String, Object> o() {
        Map<String, String> metaData;
        HashMap hashMap = new HashMap(32);
        hashMap.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("sim", Boolean.valueOf(k()));
        hashMap.put("aida", Boolean.valueOf(s()));
        hashMap.put("locale", Locale.getDefault().toString());
        hashMap.put("model", Build.MODEL);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("platform", Constants.PLATFORM);
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("tz_offset", Double.valueOf(A()));
        hashMap.put("gy", Boolean.valueOf(C()));
        hashMap.put("country_code", D());
        hashMap.put("carrier", E());
        hashMap.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.c)));
        hashMap.put("tv", Boolean.valueOf(B()));
        DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            hashMap.put("adns", Float.valueOf(displayMetrics.density));
            hashMap.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            hashMap.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            hashMap.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            Point a2 = com.applovin.impl.sdk.utils.f.a(this.c);
            hashMap.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(a2.x, 2.0d) + Math.pow(a2.y, 2.0d)) / displayMetrics.xdpi));
        }
        hashMap.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        if (this.a.g() && (metaData = Utils.getMetaData(this.a.p())) != null) {
            String str = metaData.get("GraphicsMemorySizeMegabytes");
            if (StringUtils.isValidString(str)) {
                try {
                    hashMap.put("gms_mb", Integer.valueOf(Integer.parseInt(str)));
                } catch (NumberFormatException unused) {
                    r rVar = this.b;
                    rVar.e("DataCollector", "Graphics memory size megabytes couldn't be parsed to an integer: " + str);
                }
            }
        }
        a(hashMap);
        return hashMap;
    }

    private String p() {
        int orientation = Utils.getOrientation(this.c);
        return orientation == 1 ? "portrait" : orientation == 2 ? "landscape" : IntegrityManager.INTEGRITY_TYPE_NONE;
    }

    private Map<String, Object> q() {
        PackageInfo packageInfo;
        HashMap hashMap = new HashMap(20);
        PackageManager packageManager = this.c.getPackageManager();
        ApplicationInfo applicationInfo = this.c.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        String str = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.c.getPackageName(), 0);
            try {
                str = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        hashMap.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, packageManager.getApplicationLabel(applicationInfo));
        hashMap.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        hashMap.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        hashMap.put("package_name", applicationInfo.packageName);
        hashMap.put("vz", StringUtils.toShortSHA1Hash(applicationInfo.packageName));
        if (str == null) {
            str = "";
        }
        hashMap.put("installer_name", str);
        hashMap.put("tg", com.applovin.impl.sdk.utils.n.a(this.a));
        hashMap.put("debug", Boolean.valueOf(Utils.isPubInDebugMode(this.a.J())));
        hashMap.put("ia", Long.valueOf(lastModified));
        Long l = (Long) this.a.a(com.applovin.impl.sdk.c.d.d);
        if (l != null) {
            hashMap.put("ia_v2", l);
        } else {
            this.a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Long>>) com.applovin.impl.sdk.c.d.d, (com.applovin.impl.sdk.c.d<Long>) Long.valueOf(lastModified));
        }
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        String userEngagementSdkVersion = Utils.getUserEngagementSdkVersion();
        if (StringUtils.isValidString(userEngagementSdkVersion)) {
            hashMap.put("ue_sdk_version", userEngagementSdkVersion);
        }
        hashMap.put("api_did", this.a.a(com.applovin.impl.sdk.c.b.W));
        hashMap.put("first_install", Boolean.valueOf(this.a.N()));
        hashMap.put("first_install_v2", Boolean.valueOf(!this.a.O()));
        hashMap.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        hashMap.put("epv", Integer.valueOf(Utils.tryToGetExoPlayerVersionCode()));
        return hashMap;
    }

    private boolean r() {
        ConnectivityManager connectivityManager;
        if (com.applovin.impl.sdk.utils.f.f() && (connectivityManager = (ConnectivityManager) this.c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th) {
                this.a.z().b("DataCollector", "Unable to collect constrained network info.", th);
            }
        }
        return false;
    }

    private static boolean s() {
        return Utils.checkClassExistence("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    private b t() {
        b bVar = new b();
        Intent registerReceiver = this.c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            bVar.b = -1;
        } else {
            bVar.b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        bVar.a = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        return bVar;
    }

    private long u() {
        List asList = Arrays.asList(StringUtils.emptyIfNull(Settings.Secure.getString(this.c.getContentResolver(), "enabled_accessibility_services")).split(CertificateUtil.DELIMITER));
        long j2 = asList.contains("AccessibilityMenuService") ? 256L : 0L;
        if (asList.contains("SelectToSpeakService")) {
            j2 |= 512;
        }
        if (asList.contains("SoundAmplifierService")) {
            j2 |= 2;
        }
        if (asList.contains("SpeechToTextAccessibilityService")) {
            j2 |= 128;
        }
        if (asList.contains("SwitchAccessService")) {
            j2 |= 4;
        }
        if ((this.c.getResources().getConfiguration().uiMode & 48) == 32) {
            j2 |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        if (a("accessibility_enabled")) {
            j2 |= 8;
        }
        if (a("touch_exploration_enabled")) {
            j2 |= 16;
        }
        if (com.applovin.impl.sdk.utils.f.d()) {
            if (a("accessibility_display_inversion_enabled")) {
                j2 |= 32;
            }
            return a("skip_first_use_hints") ? j2 | 64 : j2;
        }
        return j2;
    }

    private float v() {
        try {
            return Settings.System.getFloat(this.c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e) {
            this.b.b("DataCollector", "Error collecting font scale", e);
            return -1.0f;
        }
    }

    private String w() {
        AudioManager audioManager = (AudioManager) this.c.getSystemService("audio");
        if (audioManager != null) {
            StringBuilder sb = new StringBuilder();
            if (com.applovin.impl.sdk.utils.f.e()) {
                for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                    String a2 = a(audioDeviceInfo.getType());
                    if (!TextUtils.isEmpty(a2)) {
                        sb.append(a2);
                        sb.append(",");
                    }
                }
            } else {
                if (audioManager.isWiredHeadsetOn()) {
                    sb.append("headphones");
                    sb.append(",");
                }
                if (audioManager.isBluetoothA2dpOn()) {
                    sb.append("bluetootha2dpoutput");
                }
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb2)) {
                this.b.b("DataCollector", "No sound outputs detected");
            }
            return sb2;
        }
        return null;
    }

    private String x() {
        if (com.applovin.impl.sdk.utils.f.f()) {
            try {
                StringBuilder sb = new StringBuilder();
                LocaleList locales = this.c.getResources().getConfiguration().getLocales();
                for (int i2 = 0; i2 < locales.size(); i2++) {
                    sb.append(locales.get(i2));
                    sb.append(",");
                }
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                    sb.deleteCharAt(sb.length() - 1);
                }
                return sb.toString();
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    private boolean y() {
        Activity al;
        Window window;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        return (!com.applovin.impl.sdk.utils.f.g() || (al = this.a.al()) == null || (window = al.getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null || displayCutout.getSafeInsetTop() <= 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Integer z() {
        AudioManager audioManager = (AudioManager) this.c.getSystemService("audio");
        if (audioManager != null) {
            return Integer.valueOf((int) (audioManager.getStreamVolume(3) * ((Float) this.a.a(com.applovin.impl.sdk.c.b.dK)).floatValue()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        String encodeToString = Base64.encodeToString(new JSONObject(n()).toString().getBytes(Charset.defaultCharset()), 2);
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eo)).booleanValue()) {
            return com.applovin.impl.sdk.utils.k.a(encodeToString, this.a.x(), Utils.getServerAdjustedUnixTimestampMillis(this.a));
        }
        return encodeToString;
    }

    public Map<String, Object> a(Map<String, String> map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap(64);
        Map<String, Object> a2 = a(z);
        Map<String, Object> g = g();
        Map<String, Object> i2 = i();
        if (z2) {
            hashMap.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, a2);
            hashMap.put("app_info", g);
            if (i2 != null) {
                hashMap.put("connection_info", i2);
            }
            if (map != null) {
                hashMap.put("ad_info", map);
            }
        } else {
            hashMap.putAll(a2);
            hashMap.putAll(g);
            if (i2 != null) {
                hashMap.putAll(i2);
            }
            if (map != null) {
                hashMap.putAll(map);
            }
        }
        hashMap.put("accept", "custom_size,launch_app,video");
        hashMap.put("format", "json");
        Utils.putObjectForStringIfValid("mediation_provider", this.a.s(), hashMap);
        Utils.putObjectForStringIfValid("plugin_version", (String) this.a.a(com.applovin.impl.sdk.c.b.dz), hashMap);
        if (!((Boolean) this.a.a(com.applovin.impl.sdk.c.b.en)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.x());
        }
        hashMap.putAll(h());
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dW)).booleanValue()) {
            com.applovin.impl.sdk.d.g R = this.a.R();
            hashMap.put("li", Long.valueOf(R.b(com.applovin.impl.sdk.d.f.b)));
            hashMap.put("si", Long.valueOf(R.b(com.applovin.impl.sdk.d.f.d)));
            hashMap.put("pf", Long.valueOf(R.b(com.applovin.impl.sdk.d.f.h)));
            hashMap.put("mpf", Long.valueOf(R.b(com.applovin.impl.sdk.d.f.o)));
            hashMap.put("gpf", Long.valueOf(R.b(com.applovin.impl.sdk.d.f.i)));
            hashMap.put("asoac", Long.valueOf(R.b(com.applovin.impl.sdk.d.f.m)));
        }
        hashMap.put("rid", UUID.randomUUID().toString());
        return hashMap;
    }

    public Map<String, Object> a(boolean z) {
        HashMap hashMap;
        synchronized (this.e) {
            hashMap = new HashMap(this.d);
        }
        return a(hashMap, z);
    }

    public Map<String, Object> b() {
        return new HashMap(this.d);
    }

    public Map<String, Object> c() {
        return new HashMap(this.f);
    }

    public Map<String, Object> d() {
        return a(false);
    }

    public void e() {
        synchronized (this.e) {
            a(this.d);
        }
    }

    public boolean f() {
        return this.g;
    }

    public Map<String, Object> g() {
        HashMap hashMap = new HashMap(this.f);
        hashMap.put("test_ads", Boolean.valueOf(this.g));
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.ds)).booleanValue()) {
            Utils.putObjectForStringIfValid("cuid", this.a.m(), hashMap);
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dv)).booleanValue()) {
            hashMap.put("compass_random_token", this.a.n());
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dx)).booleanValue()) {
            hashMap.put("applovin_random_token", this.a.o());
        }
        String name = this.a.q().getName();
        if (StringUtils.isValidString(name)) {
            hashMap.put("user_segment_name", name);
        }
        return hashMap;
    }

    public Map<String, Object> h() {
        HashMap hashMap = new HashMap(5);
        hashMap.put("sc", this.a.a(com.applovin.impl.sdk.c.b.ab));
        hashMap.put("sc2", this.a.a(com.applovin.impl.sdk.c.b.ac));
        hashMap.put("sc3", this.a.a(com.applovin.impl.sdk.c.b.ad));
        hashMap.put("server_installed_at", this.a.a(com.applovin.impl.sdk.c.b.ae));
        Utils.putObjectForStringIfValid("persisted_data", (String) this.a.a(com.applovin.impl.sdk.c.d.y), hashMap);
        return hashMap;
    }

    public Map<String, Object> i() {
        b.C0030b a2 = this.a.P().a();
        if (a2 != null) {
            HashMap hashMap = new HashMap(4);
            hashMap.put("lrm_ts_ms", Long.valueOf(a2.a()));
            hashMap.put("lrm_url", a2.b());
            hashMap.put("lrm_ct_ms", Long.valueOf(a2.d()));
            hashMap.put("lrm_rs", Long.valueOf(a2.c()));
            return hashMap;
        }
        return null;
    }

    public a j() {
        a c = c(this.c);
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dr)).booleanValue()) {
            if (c.a && !((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dq)).booleanValue()) {
                c.b = "";
            }
            j.set(c);
        } else {
            c = new a();
        }
        this.g = StringUtils.isValidString(c.b) ? this.a.p().getTestDeviceAdvertisingIds().contains(c.b) : false;
        return c;
    }

    public boolean k() {
        return a(Build.DEVICE, "goldfish,vbox") || a(Build.HARDWARE, "ranchu,generic,vbox") || a(Build.MANUFACTURER, "Genymotion") || a(Build.MODEL, "Android SDK built for x86");
    }

    public void l() {
        this.a.Q().a(new com.applovin.impl.sdk.e.f(this.a, new f.a() { // from class: com.applovin.impl.sdk.m.2
            @Override // com.applovin.impl.sdk.e.f.a
            public void a(a aVar) {
                m.j.set(aVar);
            }
        }), o.a.ADVERTISING_INFO_COLLECTION);
        this.a.Q().a(new com.applovin.impl.sdk.e.y(this.a, true, new Runnable() { // from class: com.applovin.impl.sdk.m.3
            @Override // java.lang.Runnable
            public void run() {
                m.this.k.set(m.this.z());
            }
        }), o.a.CACHING_OTHER);
    }
}
