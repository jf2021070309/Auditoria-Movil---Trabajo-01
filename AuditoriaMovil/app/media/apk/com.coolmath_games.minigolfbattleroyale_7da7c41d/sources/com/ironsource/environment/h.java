package com.ironsource.environment;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.integrity.IntegrityManager;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;
/* loaded from: classes2.dex */
public final class h {
    private static String a = null;
    private static String b = null;
    private static String c = "";
    private static String d = "";

    public static int A(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    public static String B(Context context) {
        return d(context) ? "Tablet" : "Phone";
    }

    public static String C(Context context) {
        g gVar = g.a;
        if (g.a()) {
            try {
                Class<?> cls = Class.forName("com.google.android.gms.appset.AppSet");
                Object invoke = cls.getMethod("getClient", Context.class).invoke(cls, context);
                Object invoke2 = invoke.getClass().getMethod("getAppSetIdInfo", new Class[0]).invoke(invoke, new Object[0]);
                Class<?> cls2 = Class.forName("com.google.android.gms.tasks.OnSuccessListener");
                invoke2.getClass().getMethod("addOnSuccessListener", cls2).invoke(invoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.ironsource.environment.h.1
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method, Object[] objArr) {
                        if (objArr != null) {
                            try {
                                if (objArr.length <= 0 || objArr[0] == null) {
                                    return null;
                                }
                                String obj2 = objArr[0].getClass().getMethod("getId", new Class[0]).invoke(objArr[0], new Object[0]).toString();
                                if (TextUtils.isEmpty(obj2)) {
                                    return null;
                                }
                                String unused = h.d = obj2;
                                return null;
                            } catch (Exception e) {
                                e.printStackTrace();
                                return null;
                            }
                        }
                        return null;
                    }
                }));
                return !TextUtils.isEmpty(d) ? d : "";
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
        return "";
    }

    public static long a() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    private static long a(File file) {
        long availableBlocksLong;
        long blockSizeLong;
        StatFs statFs = new StatFs(file.getPath());
        if (Build.VERSION.SDK_INT < 19) {
            availableBlocksLong = statFs.getAvailableBlocks();
            blockSizeLong = statFs.getBlockSize();
        } else {
            availableBlocksLong = statFs.getAvailableBlocksLong();
            blockSizeLong = statFs.getBlockSizeLong();
        }
        return (availableBlocksLong * blockSizeLong) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    public static long a(String str) {
        return a(new File(str));
    }

    public static synchronized void a(Context context, String str) {
        synchronized (h.class) {
            try {
                j.a(context, "Mediation_Shared_Preferences", "browser_user_agent", str);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }

    public static String[] a(Context context) {
        Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
        Object invoke = cls.getMethod("getAdvertisingIdInfo", Context.class).invoke(cls, context);
        Method method = invoke.getClass().getMethod("getId", new Class[0]);
        Method method2 = invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]);
        String obj = method.invoke(invoke, new Object[0]).toString();
        boolean booleanValue = ((Boolean) method2.invoke(invoke, new Object[0])).booleanValue();
        StringBuilder sb = new StringBuilder();
        sb.append(booleanValue);
        return new String[]{obj, sb.toString()};
    }

    public static int b() {
        return -(TimeZone.getDefault().getOffset(a()) / 60000);
    }

    public static String b(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    public static String c() {
        String id = TimeZone.getDefault().getID();
        return id != null ? id : "";
    }

    public static String c(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    public static boolean d() {
        return "mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable();
    }

    public static boolean d(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.widthPixels / displayMetrics.density >= 600.0f) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i = 0; i < 8; i++) {
                if (new File(strArr[i] + str).exists()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static long e(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            if (Build.VERSION.SDK_INT >= 16) {
                return memoryInfo.totalMem;
            }
            return -1L;
        }
        return -1L;
    }

    public static String e() {
        return Build.VERSION.RELEASE;
    }

    public static int f() {
        return Build.VERSION.SDK_INT;
    }

    public static boolean f(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    public static int g(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    public static String g() {
        return Build.MODEL;
    }

    public static String h() {
        return Build.MANUFACTURER;
    }

    public static boolean h(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String i() {
        return Constants.PLATFORM;
    }

    public static boolean i(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String j(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    public static boolean j() {
        return d("su");
    }

    public static int k() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static String k(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    public static int l() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int l(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static float m(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e) {
            e.printStackTrace();
            return -1.0f;
        }
    }

    public static int m() {
        return k();
    }

    public static int n() {
        return l();
    }

    public static int n(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    public static float o() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static String o(Context context) {
        if (context == null) {
            return "";
        }
        int n = n(context);
        if (n != 0) {
            if (n != 1) {
                if (n != 11) {
                    if (n != 12) {
                        switch (n) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return IntegrityManager.INTEGRITY_TYPE_NONE;
                        }
                    }
                }
            }
            return "portrait";
        }
        return "landscape";
    }

    public static int p(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    public static long p() {
        return a(Environment.getDataDirectory());
    }

    public static List<ApplicationInfo> q(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    public static void q() {
        final Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            if (Build.VERSION.SDK_INT < 17) {
                ContextProvider.getInstance().runOnUIThread(new Runnable() { // from class: com.ironsource.environment.h.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            WebView webView = new WebView(applicationContext);
                            webView.setLayerType(1, null);
                            String unused = h.c = webView.getSettings().getUserAgentString();
                            webView.destroy();
                            h.a(applicationContext, h.c);
                        } catch (Exception unused2) {
                        }
                    }
                });
                return;
            }
            try {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
                c = defaultUserAgent;
                a(applicationContext, defaultUserAgent);
            } catch (Exception unused) {
            }
        }
    }

    public static String r() {
        Context applicationContext;
        if (!c.isEmpty() || (applicationContext = ContextProvider.getInstance().getApplicationContext()) == null) {
            return c;
        }
        try {
            return j.b(applicationContext, "Mediation_Shared_Preferences", "browser_user_agent", "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean r(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    public static File s(Context context) {
        return context.getExternalCacheDir();
    }

    public static File t(Context context) {
        return context.getExternalFilesDir(null);
    }

    public static File u(Context context) {
        return context.getCacheDir();
    }

    public static File v(Context context) {
        return context.getFilesDir();
    }

    public static int w(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : 0;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static boolean x(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static synchronized String y(Context context) {
        synchronized (h.class) {
            if (!TextUtils.isEmpty(a)) {
                return a;
            }
            boolean z = true;
            if (context != null) {
                z = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getBoolean("uuidEnabled", true);
            }
            if (z) {
                String b2 = j.b(context, "Mediation_Shared_Preferences", "cachedUUID", "");
                if (TextUtils.isEmpty(b2)) {
                    String uuid = UUID.randomUUID().toString();
                    a = uuid;
                    j.a(context, "Mediation_Shared_Preferences", "cachedUUID", uuid);
                } else {
                    a = b2;
                }
            }
            return a;
        }
    }

    public static synchronized String z(Context context) {
        synchronized (h.class) {
            if (!TextUtils.isEmpty(b)) {
                return b;
            } else if (context == null) {
                return "";
            } else {
                String b2 = j.b(context, "supersonic_shared_preferen", "auid", "");
                b = b2;
                if (TextUtils.isEmpty(b2)) {
                    String uuid = UUID.randomUUID().toString();
                    b = uuid;
                    j.a(context, "supersonic_shared_preferen", "auid", uuid);
                }
                return b;
            }
        }
    }
}
