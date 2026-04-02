package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public final class h implements Runnable {
    private Context E;
    private final String a = getClass().getSimpleName();
    private final String b = "bundleId";
    private final String c = "advertisingId";
    private final String d = "isLimitAdTrackingEnabled";
    private final String e = "appKey";
    private final String f = "deviceOS";
    private final String g = "osVersion";
    private final String h = "connectionType";
    private final String i = "language";
    private final String j = "deviceOEM";
    private final String k = "deviceModel";
    private final String l = "mobileCarrier";
    private final String m = "externalFreeMemory";
    private final String n = "internalFreeMemory";
    private final String o = "battery";
    private final String p = "gmtMinutesOffset";
    private final String q = "appVersion";
    private final String r = "sessionId";
    private final String s = "pluginType";
    private final String t = "pluginVersion";
    private final String u = "plugin_fw_v";
    private final String v = "jb";
    private final String w = "advertisingIdType";
    private final String x = "mt";
    private final String y = "firstSession";
    private final String z = "mcc";
    private final String A = "mnc";
    private final String B = "icc";
    private final String C = "tz";
    private final String D = "auid";

    private h() {
    }

    public h(Context context) {
        this.E = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, java.lang.Object> a() {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.h.a():java.util.Map");
    }

    private static String b() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e);
            return "";
        }
    }

    private static String c() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e);
            return "";
        }
    }

    private static String d() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e);
            return "";
        }
    }

    private String e() {
        try {
            return this.E.getPackageName();
        } catch (Exception unused) {
            return "";
        }
    }

    private static String f() {
        try {
            String str = Build.VERSION.RELEASE;
            int i = Build.VERSION.SDK_INT;
            return i + "(" + str + ")";
        } catch (Exception unused) {
            return "";
        }
    }

    private static String g() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception unused) {
            return "";
        }
    }

    private static String h() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String i() {
        try {
            return Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    private String j() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.E.getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                return !networkOperatorName.equals("") ? networkOperatorName : "";
            }
            return "";
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.a + ":getMobileCarrier()", e);
            return "";
        }
    }

    private static boolean k() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception unused) {
            return false;
        }
    }

    private static long l() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception unused) {
            return -1L;
        }
    }

    private int m() {
        try {
            Intent registerReceiver = this.E.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : 0;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.a + ":getBatteryLevel()", e);
            return -1;
        }
    }

    private int n() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round(((timeZone.getOffset(GregorianCalendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15) * 15;
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.a + ":getGmtMinutesOffset()", e);
            return 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.ironsource.mediationsdk.sdk.e.a().a(a());
            IronSourceUtils.saveGeneralProperties(this.E, com.ironsource.mediationsdk.sdk.e.a().b());
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "Thread name = " + getClass().getSimpleName(), e);
        }
    }
}
