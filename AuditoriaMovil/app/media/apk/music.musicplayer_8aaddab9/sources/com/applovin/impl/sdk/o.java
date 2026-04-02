package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
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
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.Window;
import android.view.WindowInsets;
import ch.qos.logback.classic.joran.action.ConfigurationAction;
import ch.qos.logback.core.util.FileSize;
import com.applovin.impl.sdk.e.f;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
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
public class o {

    /* renamed from: h  reason: collision with root package name */
    private static String f4248h;

    /* renamed from: i  reason: collision with root package name */
    private static int f4249i;

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicReference<a> f4250j = new AtomicReference<>();

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicReference<b> f4251l = new AtomicReference<>();
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final v f4252b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f4253c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Object> f4254d;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Object> f4256f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4257g;

    /* renamed from: e  reason: collision with root package name */
    private final Object f4255e = new Object();

    /* renamed from: k  reason: collision with root package name */
    private final AtomicReference<Integer> f4258k = new AtomicReference<>();

    /* loaded from: classes.dex */
    public static class a {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public String f4259b = "";
    }

    /* loaded from: classes.dex */
    public static class b {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4260b;

        public b(String str, int i2) {
            this.a = str;
            this.f4260b = i2;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public int a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f4261b = -1;
    }

    public o(m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.a = mVar;
        this.f4252b = mVar.B();
        this.f4253c = mVar.L();
        this.f4254d = s();
        this.f4256f = u();
    }

    private String A() {
        AudioManager audioManager = (AudioManager) this.f4253c.getSystemService("audio");
        if (audioManager != null) {
            StringBuilder sb = new StringBuilder();
            if (com.applovin.impl.sdk.utils.g.e()) {
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
                this.f4252b.b("DataCollector", "No sound outputs detected");
            }
            return sb2;
        }
        return null;
    }

    private String B() {
        if (com.applovin.impl.sdk.utils.g.f()) {
            try {
                StringBuilder sb = new StringBuilder();
                LocaleList locales = this.f4253c.getResources().getConfiguration().getLocales();
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

    private boolean C() {
        Activity ao;
        Window window;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        return (!com.applovin.impl.sdk.utils.g.g() || (ao = this.a.ao()) == null || (window = ao.getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null || displayCutout.getSafeInsetTop() <= 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Integer D() {
        AudioManager audioManager = (AudioManager) this.f4253c.getSystemService("audio");
        if (audioManager != null) {
            return Integer.valueOf((int) (audioManager.getStreamVolume(3) * ((Float) this.a.a(com.applovin.impl.sdk.c.b.dM)).floatValue()));
        }
        return null;
    }

    private double E() {
        double offset = TimeZone.getDefault().getOffset(new Date().getTime());
        Double.isNaN(offset);
        double round = Math.round((offset * 10.0d) / 3600000.0d);
        Double.isNaN(round);
        return round / 10.0d;
    }

    private boolean F() {
        if (d(this.f4253c)) {
            return true;
        }
        return this.f4253c.getPackageManager().hasSystemFeature(com.applovin.impl.sdk.utils.g.d() ? "android.software.leanback" : "android.hardware.type.television");
    }

    private boolean G() {
        SensorManager sensorManager = (SensorManager) this.f4253c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private String H() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f4253c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String I() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f4253c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                return networkOperator.substring(0, Math.min(3, networkOperator.length()));
            } catch (Throwable th) {
                this.f4252b.b("DataCollector", "Unable to collect mobile country code", th);
                return "";
            }
        }
        return "";
    }

    private String J() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f4253c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                return networkOperator.substring(Math.min(3, networkOperator.length()));
            } catch (Throwable th) {
                this.f4252b.b("DataCollector", "Unable to collect mobile network code", th);
                return "";
            }
        }
        return "";
    }

    private String K() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f4253c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                return telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                this.f4252b.b("DataCollector", "Unable to collect carrier", th);
                return "";
            }
        }
        return "";
    }

    private boolean L() {
        try {
            if (!M()) {
                if (!N()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean M() {
        String str = Build.TAGS;
        return str != null && str.contains(b("lz}$blpz"));
    }

    private boolean N() {
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

    /* JADX WARN: Can't wrap try/catch for region: R(46:1|(45:3|(1:5)(2:101|(1:103))|6|(1:8)|9|(1:12)|13|(1:15)|16|(1:18)|19|(1:21)|22|(1:24)|25|(1:27)|28|(1:30)|(1:32)(1:100)|(1:34)|35|36|37|(2:39|(1:41))|42|(2:92|93)|44|(2:46|(1:48))|49|(1:55)|56|(3:58|59|60)(1:91)|61|(2:63|(1:65))|66|(1:68)|69|(1:73)|74|(1:78)|79|(1:83)|84|(1:86)|87)|104|6|(0)|9|(1:12)|13|(0)|16|(0)|19|(0)|22|(0)|25|(0)|28|(0)|(0)(0)|(0)|35|36|37|(0)|42|(0)|44|(0)|49|(3:51|53|55)|56|(0)(0)|61|(0)|66|(0)|69|(2:71|73)|74|(2:76|78)|79|(2:81|83)|84|(0)|87) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016a, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016b, code lost:
        r6.f4252b.b("DataCollector", "Unable to collect screen brightness", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, java.lang.Object> a(java.util.Map<java.lang.String, java.lang.Object> r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.o.a(java.util.Map, boolean):java.util.Map");
    }

    public static void a(final Context context) {
        new Thread(new Runnable() { // from class: com.applovin.impl.sdk.o.1
            @Override // java.lang.Runnable
            public void run() {
                o.f4250j.set(com.applovin.impl.sdk.utils.c.a(context));
            }
        }).start();
    }

    private void a(Map<String, Object> map) {
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dH)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(y()));
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dI)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(z()));
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dP)).booleanValue()) {
            ac.c(this.a);
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dO)).booleanValue()) {
            ac.b(this.a);
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dN)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dK)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(w()));
        }
        map.put("htn", Boolean.valueOf(C()));
    }

    private boolean a(String str) {
        try {
            return Settings.Secure.getInt(this.f4253c.getContentResolver(), str) == 1;
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

    public static boolean b(Context context) {
        return "amazon".equalsIgnoreCase(Build.MANUFACTURER) || d(context);
    }

    public static void c(final Context context) {
        if (Utils.checkClassExistence("com.google.android.gms.appset.AppSet")) {
            new Thread(new Runnable() { // from class: com.applovin.impl.sdk.o.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.applovin.impl.sdk.o.2.1
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            /* renamed from: a */
                            public void onSuccess(AppSetIdInfo appSetIdInfo) {
                                o.f4251l.set(new b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                            }
                        });
                    } catch (Throwable unused) {
                        v.f("DataCollector", "Could not collect AppSet ID.");
                    }
                }
            }).start();
        } else {
            v.f("DataCollector", "Could not collect AppSet ID.");
        }
    }

    private static boolean d(Context context) {
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    private Map<String, String> r() {
        return Utils.stringifyObjectMap(a(null, true, false));
    }

    private Map<String, Object> s() {
        Map<String, String> metaData;
        HashMap hashMap = new HashMap(32);
        hashMap.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("sim", Boolean.valueOf(n()));
        hashMap.put("aida", Boolean.valueOf(com.applovin.impl.sdk.utils.c.a()));
        hashMap.put("locale", Locale.getDefault().toString());
        hashMap.put("model", Build.MODEL);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("platform", f());
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("tz_offset", Double.valueOf(E()));
        hashMap.put("gy", Boolean.valueOf(G()));
        hashMap.put("country_code", H());
        hashMap.put("mcc", I());
        hashMap.put("mnc", J());
        hashMap.put("carrier", K());
        hashMap.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f4253c)));
        hashMap.put("tv", Boolean.valueOf(F()));
        DisplayMetrics displayMetrics = this.f4253c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            hashMap.put("adns", Float.valueOf(displayMetrics.density));
            hashMap.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            hashMap.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            hashMap.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            Point a2 = com.applovin.impl.sdk.utils.g.a(this.f4253c);
            double sqrt = Math.sqrt(Math.pow(a2.y, 2.0d) + Math.pow(a2.x, 2.0d));
            double d2 = displayMetrics.xdpi;
            Double.isNaN(d2);
            hashMap.put("screen_size_in", Double.valueOf(sqrt / d2));
        }
        hashMap.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        if (this.a.g() && (metaData = Utils.getMetaData(this.a.p())) != null) {
            String str = metaData.get("GraphicsMemorySizeMegabytes");
            if (StringUtils.isValidString(str)) {
                try {
                    hashMap.put("gms_mb", Integer.valueOf(Integer.parseInt(str)));
                } catch (NumberFormatException unused) {
                    this.f4252b.e("DataCollector", "Graphics memory size megabytes couldn't be parsed to an integer: " + str);
                }
            }
        }
        a(hashMap);
        return hashMap;
    }

    private String t() {
        int orientation = Utils.getOrientation(this.f4253c);
        return orientation == 1 ? "portrait" : orientation == 2 ? "landscape" : "none";
    }

    private Map<String, Object> u() {
        PackageInfo packageInfo;
        HashMap hashMap = new HashMap(20);
        PackageManager packageManager = this.f4253c.getPackageManager();
        ApplicationInfo applicationInfo = this.f4253c.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        String str = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.f4253c.getPackageName(), 0);
            try {
                str = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        hashMap.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        hashMap.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        hashMap.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        hashMap.put("package_name", applicationInfo.packageName);
        hashMap.put("vz", StringUtils.toShortSHA1Hash(applicationInfo.packageName));
        if (str == null) {
            str = "";
        }
        hashMap.put("installer_name", str);
        hashMap.put("tg", com.applovin.impl.sdk.utils.o.a(this.a));
        hashMap.put(ConfigurationAction.INTERNAL_DEBUG_ATTR, Boolean.valueOf(Utils.isPubInDebugMode(this.a.L())));
        hashMap.put("ia", Long.valueOf(lastModified));
        m mVar = this.a;
        com.applovin.impl.sdk.c.d<Long> dVar = com.applovin.impl.sdk.c.d.f3940d;
        Long l2 = (Long) mVar.a(dVar);
        if (l2 != null) {
            hashMap.put("ia_v2", l2);
        } else {
            this.a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Long>>) dVar, (com.applovin.impl.sdk.c.d<Long>) Long.valueOf(lastModified));
        }
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        hashMap.put("omid_sdk_version", this.a.am().c());
        String userEngagementSdkVersion = Utils.getUserEngagementSdkVersion();
        if (StringUtils.isValidString(userEngagementSdkVersion)) {
            hashMap.put("ue_sdk_version", userEngagementSdkVersion);
        }
        hashMap.put("api_did", this.a.a(com.applovin.impl.sdk.c.b.ad));
        hashMap.put("first_install", Boolean.valueOf(this.a.P()));
        hashMap.put("first_install_v2", Boolean.valueOf(!this.a.Q()));
        hashMap.put("first_install_v3_ms", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : "");
        hashMap.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        hashMap.put("epv", Integer.valueOf(Utils.tryToGetExoPlayerVersionCode()));
        return hashMap;
    }

    private Map<String, Object> v() {
        HashMap hashMap = new HashMap(2);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f4253c);
        String str = (String) this.a.b(com.applovin.impl.sdk.c.d.f3950n, null, defaultSharedPreferences);
        if (StringUtils.isValidString(str)) {
            hashMap.put("IABTCF_TCString", str);
        }
        Object obj = defaultSharedPreferences.getAll().get(com.applovin.impl.sdk.c.d.o.a());
        if ((obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean)) {
            hashMap.put("IABTCF_gdprApplies", obj);
        }
        return hashMap;
    }

    private boolean w() {
        ConnectivityManager connectivityManager;
        if (com.applovin.impl.sdk.utils.g.f() && (connectivityManager = (ConnectivityManager) this.f4253c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th) {
                this.a.B().b("DataCollector", "Unable to collect constrained network info.", th);
            }
        }
        return false;
    }

    private c x() {
        c cVar = new c();
        Intent registerReceiver = this.f4253c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f4261b = -1;
        } else {
            cVar.f4261b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        cVar.a = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        return cVar;
    }

    private long y() {
        List asList = Arrays.asList(StringUtils.emptyIfNull(Settings.Secure.getString(this.f4253c.getContentResolver(), "enabled_accessibility_services")).split(":"));
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
        if ((this.f4253c.getResources().getConfiguration().uiMode & 48) == 32) {
            j2 |= FileSize.KB_COEFFICIENT;
        }
        if (a("accessibility_enabled")) {
            j2 |= 8;
        }
        if (a("touch_exploration_enabled")) {
            j2 |= 16;
        }
        if (com.applovin.impl.sdk.utils.g.d()) {
            if (a("accessibility_display_inversion_enabled")) {
                j2 |= 32;
            }
            return a("skip_first_use_hints") ? j2 | 64 : j2;
        }
        return j2;
    }

    private float z() {
        try {
            return Settings.System.getFloat(this.f4253c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e2) {
            this.f4252b.b("DataCollector", "Error collecting font scale", e2);
            return -1.0f;
        }
    }

    public String a() {
        String encodeToString = Base64.encodeToString(new JSONObject(r()).toString().getBytes(Charset.defaultCharset()), 2);
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eu)).booleanValue()) {
            return com.applovin.impl.sdk.utils.l.a(encodeToString, this.a.z(), Utils.getServerAdjustedUnixTimestampMillis(this.a));
        }
        return encodeToString;
    }

    public Map<String, Object> a(Map<String, String> map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap(64);
        Map<String, Object> a2 = a(z);
        Map<String, Object> h2 = h();
        Map<String, Object> j2 = j();
        Map<String, Object> k2 = k();
        Map<String, String> a3 = this.a.r().a();
        if (z2) {
            hashMap.put("device_info", a2);
            hashMap.put("app_info", h2);
            if (j2 != null) {
                hashMap.put("connection_info", j2);
            }
            if (map != null) {
                hashMap.put("ad_info", map);
            }
            if (k2 != null) {
                hashMap.put("location_info", k2);
            }
            if (a3 != null) {
                hashMap.put("targeting_data", a3);
            }
        } else {
            hashMap.putAll(a2);
            hashMap.putAll(h2);
            if (j2 != null) {
                hashMap.putAll(j2);
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            if (k2 != null) {
                hashMap.putAll(k2);
            }
            if (a3 != null) {
                hashMap.putAll(a3);
            }
        }
        hashMap.put("accept", "custom_size,launch_app,video");
        hashMap.put("format", "json");
        Utils.putObjectForStringIfValid("mediation_provider", this.a.t(), hashMap);
        Utils.putObjectForStringIfValid("plugin_version", (String) this.a.a(com.applovin.impl.sdk.c.b.dA), hashMap);
        if (!((Boolean) this.a.a(com.applovin.impl.sdk.c.b.et)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.z());
        }
        hashMap.putAll(i());
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.ec)).booleanValue()) {
            com.applovin.impl.sdk.d.g T = this.a.T();
            hashMap.put("li", Long.valueOf(T.b(com.applovin.impl.sdk.d.f.f3995b)));
            hashMap.put("si", Long.valueOf(T.b(com.applovin.impl.sdk.d.f.f3997d)));
            hashMap.put("pf", Long.valueOf(T.b(com.applovin.impl.sdk.d.f.f4001h)));
            hashMap.put("mpf", Long.valueOf(T.b(com.applovin.impl.sdk.d.f.o)));
            hashMap.put("gpf", Long.valueOf(T.b(com.applovin.impl.sdk.d.f.f4002i)));
            hashMap.put("asoac", Long.valueOf(T.b(com.applovin.impl.sdk.d.f.f4006m)));
        }
        hashMap.put("rid", UUID.randomUUID().toString());
        return hashMap;
    }

    public Map<String, Object> a(boolean z) {
        HashMap hashMap;
        synchronized (this.f4255e) {
            hashMap = new HashMap(this.f4254d);
        }
        return a(hashMap, z);
    }

    public Map<String, Object> b() {
        return new HashMap(this.f4254d);
    }

    public Map<String, Object> c() {
        return new HashMap(this.f4256f);
    }

    public Map<String, Object> d() {
        return a(false);
    }

    public void e() {
        synchronized (this.f4255e) {
            a(this.f4254d);
        }
    }

    public String f() {
        return b(this.f4253c) ? "fireos" : "android";
    }

    public boolean g() {
        return this.f4257g;
    }

    public Map<String, Object> h() {
        HashMap hashMap = new HashMap(this.f4256f);
        hashMap.put("test_ads", Boolean.valueOf(this.f4257g));
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dt)).booleanValue()) {
            Utils.putObjectForStringIfValid("cuid", this.a.m(), hashMap);
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dw)).booleanValue()) {
            hashMap.put("compass_random_token", this.a.n());
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dy)).booleanValue()) {
            hashMap.put("applovin_random_token", this.a.o());
        }
        String name = this.a.q().getName();
        if (StringUtils.isValidString(name)) {
            hashMap.put("user_segment_name", name);
        }
        hashMap.putAll(v());
        return hashMap;
    }

    public Map<String, Object> i() {
        HashMap hashMap = new HashMap(5);
        hashMap.put("sc", this.a.a(com.applovin.impl.sdk.c.b.ai));
        hashMap.put("sc2", this.a.a(com.applovin.impl.sdk.c.b.aj));
        hashMap.put("sc3", this.a.a(com.applovin.impl.sdk.c.b.ak));
        hashMap.put("server_installed_at", this.a.a(com.applovin.impl.sdk.c.b.al));
        Utils.putObjectForStringIfValid("persisted_data", (String) this.a.a(com.applovin.impl.sdk.c.d.A), hashMap);
        return hashMap;
    }

    public Map<String, Object> j() {
        b.C0092b a2 = this.a.R().a();
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

    public Map<String, Object> k() {
        if (this.a.p().isLocationCollectionEnabled() && ((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dZ)).booleanValue()) {
            HashMap hashMap = new HashMap(4);
            u an = this.a.an();
            boolean b2 = an.b();
            hashMap.put("loc_services_enabled", Boolean.valueOf(b2));
            if (b2) {
                hashMap.put("loc_auth", Boolean.valueOf(an.a()));
                t c2 = an.c();
                if (c2 != null) {
                    double a2 = c2.a();
                    m mVar = this.a;
                    com.applovin.impl.sdk.c.b<Integer> bVar = com.applovin.impl.sdk.c.b.eb;
                    hashMap.put("loc_lat", Utils.formatDoubleValue(a2, ((Integer) mVar.a(bVar)).intValue()));
                    hashMap.put("loc_long", Utils.formatDoubleValue(c2.b(), ((Integer) this.a.a(bVar)).intValue()));
                }
                return hashMap;
            }
            return hashMap;
        }
        return null;
    }

    public a l() {
        a a2 = com.applovin.impl.sdk.utils.c.a(this.f4253c);
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dr)).booleanValue()) {
            if (a2.a && !((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dq)).booleanValue()) {
                a2.f4259b = "";
            }
            f4250j.set(a2);
        } else {
            a2 = new a();
        }
        this.f4257g = StringUtils.isValidString(a2.f4259b) ? this.a.p().getTestDeviceAdvertisingIds().contains(a2.f4259b) : false;
        return a2;
    }

    public b m() {
        return f4251l.get();
    }

    public boolean n() {
        return a(Build.DEVICE, "goldfish,vbox") || a(Build.HARDWARE, "ranchu,generic,vbox") || a(Build.MANUFACTURER, "Genymotion") || a(Build.MODEL, "Android SDK built for x86");
    }

    public void o() {
        this.a.S().a(new com.applovin.impl.sdk.e.f(this.a, new f.a() { // from class: com.applovin.impl.sdk.o.3
            @Override // com.applovin.impl.sdk.e.f.a
            public void a(a aVar) {
                o.f4250j.set(aVar);
            }
        }), o.a.ADVERTISING_INFO_COLLECTION);
        this.a.S().a(new com.applovin.impl.sdk.e.z(this.a, true, new Runnable() { // from class: com.applovin.impl.sdk.o.4
            @Override // java.lang.Runnable
            public void run() {
                o.this.f4258k.set(o.this.D());
            }
        }), o.a.CACHING_OTHER);
    }
}
