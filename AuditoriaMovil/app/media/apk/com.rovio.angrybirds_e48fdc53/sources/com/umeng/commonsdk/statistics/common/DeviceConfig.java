package com.umeng.commonsdk.statistics.common;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.places.model.PlaceFields;
import com.kuaishou.weapon.p0.g;
import com.ss.android.download.api.constant.BaseConstants;
import com.umeng.analytics.pro.bg;
import com.umeng.analytics.pro.y;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.idtracking.h;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import javax.microedition.khronos.opengles.GL10;
/* loaded from: classes3.dex */
public class DeviceConfig {
    public static final int DEFAULT_TIMEZONE = 8;
    private static final String KEY_EMUI_VERSION_CODE = "ro.build.hw_emui_api_level";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    public static final String MOBILE_NETWORK = "2G/3G";
    public static final String UNKNOW = "";
    public static final String WIFI = "Wi-Fi";
    protected static final String LOG_TAG = DeviceConfig.class.getName();
    private static DeviceTypeEnum deviceTypeEnum = DeviceTypeEnum.DEFAULT;
    private static volatile String sWifiMac = "";
    private static volatile String sImei = "";
    private static volatile String sMeid = "";
    private static volatile String sImsi = "";
    private static volatile String sSerialNo = "";
    private static volatile String sAndroidID = "";
    private static volatile String sIDFA = "";
    private static volatile String sOAID = "";
    private static volatile String sSecondImei = "";
    private static volatile String sSimSerialNumber = "";
    private static volatile boolean hasReadImeiOrMeid = false;
    private static volatile boolean hasReadSimSerialNumber = false;
    private static volatile boolean hasReadIMEI2 = false;
    private static volatile boolean hasReadSerialNo = false;
    private static volatile boolean hasReadAndroidID = false;
    private static volatile boolean hasReadMac = false;
    private static volatile boolean hasReadImsi = false;
    private static volatile boolean hasReadOAID = false;
    private static volatile boolean hasReadIDFA = false;
    private static volatile String sAppName = "";
    private static volatile String sAppPkgName = "";
    private static volatile boolean hasReadOperator = false;
    private static volatile String sOperator = "";
    private static volatile boolean hasReadOperatorName = false;
    private static volatile String sOperatorName = "";
    private static volatile String sCustomAgt = "";

    public static String getImei(Context context) {
        TelephonyManager telephonyManager;
        if (!TextUtils.isEmpty(sImei)) {
            return sImei;
        }
        String str = null;
        if (hasReadImeiOrMeid) {
            return null;
        }
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.g) && context != null && (telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE)) != null && checkPermission(context, g.c)) {
                str = telephonyManager.getDeviceId();
            }
        } finally {
            try {
                sImei = str;
                return str;
            } finally {
            }
        }
        sImei = str;
        return str;
    }

    public static String getImeiNew(Context context) {
        TelephonyManager telephonyManager;
        if (!TextUtils.isEmpty(sImei)) {
            return sImei;
        }
        String str = null;
        if (hasReadImeiOrMeid) {
            return null;
        }
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.g) && context != null && (telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE)) != null && checkPermission(context, g.c)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Method method = telephonyManager.getClass().getMethod("getImei", new Class[0]);
                        method.setAccessible(true);
                        str = (String) method.invoke(telephonyManager, new Object[0]);
                    } catch (Throwable th) {
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = telephonyManager.getDeviceId();
                    }
                } else {
                    str = telephonyManager.getDeviceId();
                }
            }
        } finally {
            try {
                sImei = str;
                return str;
            } finally {
            }
        }
        sImei = str;
        return str;
    }

    public static String getAndroidId(Context context) {
        if (!UMConfigure.shouldCollectAid()) {
            UMRTLog.i(UMRTLog.RTLOG_TAG, "disallow read aid.");
            return null;
        } else if (!TextUtils.isEmpty(sAndroidID)) {
            return sAndroidID;
        } else {
            if (hasReadAndroidID) {
                return null;
            }
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.i) && context != null) {
                try {
                    sAndroidID = Settings.Secure.getString(context.getContentResolver(), "android_id");
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            return sAndroidID;
        }
    }

    public static String getSerial() {
        return getSerialNo();
    }

    public static String getAppVersionCode(Context context) {
        return UMUtils.getAppVersionCode(context);
    }

    public static String getAppVersionName(Context context) {
        return UMUtils.getAppVersionName(context);
    }

    public static boolean checkPermission(Context context, String str) {
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        }
        try {
            return ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0;
        } catch (Throwable th) {
            return false;
        }
    }

    public static String[] getGPU(GL10 gl10) {
        try {
            return new String[]{gl10.glGetString(7936), gl10.glGetString(7937)};
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.e(LOG_TAG, "Could not read gpu infor:", th);
            }
            return new String[0];
        }
    }

    private static String getMacByJavaAPI() {
        if (!TextUtils.isEmpty(sWifiMac)) {
            return sWifiMac;
        }
        if (hasReadMac) {
            return "";
        }
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.h)) {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if ("wlan0".equals(nextElement.getName()) || "eth0".equals(nextElement.getName())) {
                        byte[] hardwareAddress = nextElement.getHardwareAddress();
                        if (hardwareAddress == null || hardwareAddress.length == 0) {
                            sWifiMac = "";
                        }
                        StringBuilder sb = new StringBuilder();
                        int length = hardwareAddress.length;
                        for (int i = 0; i < length; i++) {
                            sb.append(String.format("%02X:", Byte.valueOf(hardwareAddress[i])));
                        }
                        if (sb.length() > 0) {
                            sb.deleteCharAt(sb.length() - 1);
                        }
                        sWifiMac = sb.toString().toLowerCase(Locale.getDefault());
                    }
                }
            }
        } catch (Throwable th) {
        }
        hasReadMac = true;
        return sWifiMac;
    }

    private static String getMacShell() {
        if (!TextUtils.isEmpty(sWifiMac)) {
            return sWifiMac;
        }
        if (hasReadMac) {
            return "";
        }
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.h)) {
                String[] strArr = {"/sys/class/net/wlan0/address", "/sys/class/net/eth0/address", "/sys/devices/virtual/net/wlan0/address"};
                for (int i = 0; i < 3; i++) {
                    String reaMac = reaMac(strArr[i]);
                    if (reaMac != null) {
                        sWifiMac = reaMac;
                    }
                }
            }
        } catch (Throwable th) {
        }
        hasReadMac = true;
        return sWifiMac;
    }

    private static String reaMac(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String str2 = null;
        try {
            fileReader = new FileReader(str);
        } catch (Throwable th) {
        }
        try {
            bufferedReader = new BufferedReader(fileReader, 1024);
            try {
                str2 = bufferedReader.readLine();
                try {
                    fileReader.close();
                } catch (Throwable th2) {
                }
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                }
                return str2;
            } catch (Throwable th4) {
                th = th4;
                try {
                    fileReader.close();
                } catch (Throwable th5) {
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th6) {
                    }
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            bufferedReader = null;
        }
    }

    public static String getCPU() {
        String str = null;
        try {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
            str = bufferedReader.readLine();
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            MLog.e(LOG_TAG, "Could not open file /proc/cpuinfo", e);
        }
        if (str != null) {
            return str.substring(str.indexOf(58) + 1).trim();
        }
        return "";
    }

    public static String getDeviceId(Context context) {
        if (AnalyticsConstants.getDeviceType() == 2) {
            return getDeviceIdForBox(context);
        }
        return getDeviceIdForGeneral(context);
    }

    public static String getDeviceIdType() {
        return deviceTypeEnum.getDeviceIdType();
    }

    public static String getDeviceIdUmengMD5(Context context) {
        return HelperUtils.getUmengMD5(getDeviceId(context));
    }

    public static String getMCCMNC(Context context) {
        if (context == null) {
            return null;
        }
        if (getImsi(context) == null) {
            return null;
        }
        int i = context.getResources().getConfiguration().mcc;
        int i2 = context.getResources().getConfiguration().mnc;
        if (i != 0) {
            String valueOf = String.valueOf(i2);
            if (i2 < 10) {
                valueOf = String.format("%02d", Integer.valueOf(i2));
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(String.valueOf(i));
            stringBuffer.append(valueOf);
            return stringBuffer.toString();
        }
        return null;
    }

    public static String getImsi(Context context) {
        if (!TextUtils.isEmpty(sImsi)) {
            return sImsi;
        }
        String str = null;
        if (hasReadImsi || context == null) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE);
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.aj)) {
            try {
                if (checkPermission(context, g.c) && telephonyManager != null) {
                    str = telephonyManager.getSubscriberId();
                }
            } catch (Throwable th) {
            }
            hasReadImsi = true;
        }
        sImsi = str;
        return sImsi;
    }

    public static String getMeid(Context context) {
        TelephonyManager telephonyManager;
        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE)) == null || !FieldManager.allow(com.umeng.commonsdk.utils.d.ak)) {
            return null;
        }
        try {
            if (!checkPermission(context, g.c) || telephonyManager == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT < 26) {
                return getIMEI(context);
            }
            try {
                String meid = meid(context);
                if (TextUtils.isEmpty(meid)) {
                    return getIMEI(context);
                }
                return meid;
            } catch (Throwable th) {
                return null;
            }
        } catch (Throwable th2) {
            return null;
        }
    }

    private static String meid(Context context) {
        if (!TextUtils.isEmpty(sMeid)) {
            return sMeid;
        }
        String str = null;
        if (hasReadImeiOrMeid || context == null) {
            return null;
        }
        try {
            Object invoke = Class.forName("android.telephony.TelephonyManager").getMethod("getMeid", new Class[0]).invoke(null, new Object[0]);
            if (invoke != null && (invoke instanceof String)) {
                str = (String) invoke;
            }
        } finally {
            try {
                hasReadImeiOrMeid = true;
                sMeid = str;
                return sMeid;
            } catch (Throwable th) {
            }
        }
        hasReadImeiOrMeid = true;
        sMeid = str;
        return sMeid;
    }

    public static String getSimICCID(Context context) {
        if (!TextUtils.isEmpty(sSimSerialNumber)) {
            return sSimSerialNumber;
        }
        if (hasReadSimSerialNumber) {
            return null;
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.an)) {
            if (context != null) {
                try {
                    if (UMUtils.checkPermission(context, g.c)) {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE);
                        if (telephonyManager != null) {
                            sSimSerialNumber = telephonyManager.getSimSerialNumber();
                        } else {
                            hasReadSimSerialNumber = true;
                            return null;
                        }
                    }
                } catch (Throwable th) {
                }
            }
            hasReadSimSerialNumber = true;
        }
        return sSimSerialNumber;
    }

    public static String getSecondSimIMEi(Context context) {
        return null;
    }

    public static String getRegisteredOperator(Context context) {
        if (!TextUtils.isEmpty(sOperator)) {
            return sOperator;
        }
        if (hasReadOperator || context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE);
            if (checkPermission(context, g.c) && telephonyManager != null) {
                sOperator = telephonyManager.getNetworkOperator();
            }
        } catch (Throwable th) {
        }
        hasReadOperator = true;
        return sOperator;
    }

    public static String getNetworkOperatorName(Context context) {
        if (!TextUtils.isEmpty(sOperatorName)) {
            return sOperatorName;
        }
        if (hasReadOperatorName || context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE);
            if (checkPermission(context, g.c) && telephonyManager != null) {
                sOperatorName = telephonyManager.getNetworkOperatorName();
            }
        } catch (Throwable th) {
        }
        hasReadOperatorName = true;
        return sOperatorName;
    }

    public static String getDisplayResolution(Context context) {
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return "";
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            return String.valueOf(i2) + "*" + String.valueOf(i);
        } catch (Throwable th) {
            return "";
        }
    }

    public static String[] getNetworkAccessMode(Context context) {
        String[] strArr = {"", ""};
        if (context == null) {
            return strArr;
        }
        if (!checkPermission(context, g.b)) {
            strArr[0] = "";
            return strArr;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            strArr[0] = "";
            return strArr;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
            strArr[0] = "Wi-Fi";
            return strArr;
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo2 != null && networkInfo2.getState() == NetworkInfo.State.CONNECTED) {
            strArr[0] = "2G/3G";
            strArr[1] = networkInfo2.getSubtypeName();
            return strArr;
        }
        return strArr;
    }

    public static int getNetworkType(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE);
            if (!checkPermission(context, g.c)) {
                return 0;
            }
            return telephonyManager.getNetworkType();
        } catch (Exception e) {
            return -100;
        }
    }

    public static boolean isWiFiAvailable(Context context) {
        if (context == null) {
            return false;
        }
        return "Wi-Fi".equals(getNetworkAccessMode(context)[0]);
    }

    public static boolean isOnline(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        try {
            if (checkPermission(context, g.b) && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
        } catch (Throwable th) {
        }
        return false;
    }

    public static int getTimeZone(Context context) {
        if (context == null) {
            return 8;
        }
        try {
            Calendar calendar = Calendar.getInstance(getLocale(context));
            if (calendar != null) {
                return calendar.getTimeZone().getRawOffset() / BaseConstants.Time.HOUR;
            }
        } catch (Throwable th) {
            MLog.i(LOG_TAG, "error in getTimeZone", th);
        }
        return 8;
    }

    public static boolean isChineseAera(Context context) {
        String imprintProperty;
        if (context == null) {
            return false;
        }
        try {
            imprintProperty = UMEnvelopeBuild.imprintProperty(context, bg.O, "");
        } catch (Throwable th) {
        }
        if (!TextUtils.isEmpty(imprintProperty)) {
            return imprintProperty.equals("cn");
        }
        if (getImsi(context) == null) {
            String str = getLocaleInfo(context)[0];
            if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase("cn")) {
                return true;
            }
        } else {
            int i = context.getResources().getConfiguration().mcc;
            if (i != 460 && i != 461) {
                if (i == 0) {
                    String str2 = getLocaleInfo(context)[0];
                    if (!TextUtils.isEmpty(str2) && str2.equalsIgnoreCase("cn")) {
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static String[] getLocaleInfo(Context context) {
        String[] strArr = {AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN};
        if (context == null) {
            return strArr;
        }
        try {
            Locale locale = getLocale(context);
            if (locale != null) {
                strArr[0] = locale.getCountry();
                strArr[1] = locale.getLanguage();
            }
            if (TextUtils.isEmpty(strArr[0])) {
                strArr[0] = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            if (TextUtils.isEmpty(strArr[1])) {
                strArr[1] = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            return strArr;
        } catch (Throwable th) {
            MLog.e(LOG_TAG, "error in getLocaleInfo", th);
            return strArr;
        }
    }

    private static Locale getLocale(Context context) {
        Locale locale;
        if (context == null) {
            return Locale.getDefault();
        }
        try {
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            Settings.System.getConfiguration(context.getContentResolver(), configuration);
            locale = configuration.locale;
        } catch (Throwable th) {
            MLog.e(LOG_TAG, "fail to read user config locale");
            locale = null;
        }
        if (locale == null) {
            return Locale.getDefault();
        }
        return locale;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static String getMac(Context context) {
        String str = "";
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.h)) {
            if (context == null) {
                return "";
            }
            try {
                if (Build.VERSION.SDK_INT < 23) {
                    str = getMacBySystemInterface(context);
                } else {
                    ?? r0 = Build.VERSION.SDK_INT;
                    try {
                        if (r0 == 23) {
                            String macByJavaAPI = getMacByJavaAPI();
                            if (!TextUtils.isEmpty(macByJavaAPI)) {
                                str = macByJavaAPI;
                                r0 = macByJavaAPI;
                            } else if (AnalyticsConstants.CHECK_DEVICE) {
                                str = getMacShell();
                                r0 = macByJavaAPI;
                            } else {
                                str = getMacBySystemInterface(context);
                                r0 = macByJavaAPI;
                            }
                        } else {
                            String macByJavaAPI2 = getMacByJavaAPI();
                            if (!TextUtils.isEmpty(macByJavaAPI2)) {
                                str = macByJavaAPI2;
                                r0 = macByJavaAPI2;
                            } else {
                                str = getMacBySystemInterface(context);
                                r0 = macByJavaAPI2;
                            }
                        }
                    } catch (Throwable th) {
                        str = r0;
                    }
                }
            } catch (Throwable th2) {
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String getMacBySystemInterface(Context context) {
        if (!TextUtils.isEmpty(sWifiMac)) {
            return sWifiMac;
        }
        if (hasReadMac || context == null) {
            return "";
        }
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.h)) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (checkPermission(context, g.d)) {
                    if (wifiManager != null) {
                        sWifiMac = wifiManager.getConnectionInfo().getMacAddress();
                    } else {
                        sWifiMac = "";
                    }
                } else {
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.w(LOG_TAG, "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE");
                    }
                    sWifiMac = "";
                }
            }
        } finally {
            try {
                return sWifiMac;
            } finally {
            }
        }
        return sWifiMac;
    }

    public static int[] getResolutionArray(Context context) {
        int i;
        int i2;
        Method method;
        if (context == null) {
            return null;
        }
        int[] iArr = new int[2];
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                try {
                    Class<?> cls = Class.forName("android.view.Display");
                    if (cls != null && (method = cls.getMethod("getRealMetrics", DisplayMetrics.class)) != null) {
                        method.invoke(defaultDisplay, displayMetrics);
                        int i3 = displayMetrics.widthPixels;
                        int i4 = displayMetrics.heightPixels;
                        if (i3 > i4) {
                            iArr[0] = i4;
                            iArr[1] = i3;
                        } else {
                            iArr[0] = i3;
                            iArr[1] = i4;
                        }
                        iArr[0] = displayMetrics.widthPixels;
                        iArr[1] = displayMetrics.heightPixels;
                        return iArr;
                    }
                } catch (Throwable th) {
                    return null;
                }
            } else {
                try {
                    DisplayMetrics displayMetrics2 = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics2);
                    if ((context.getApplicationInfo().flags & 8192) != 0) {
                        i = -1;
                        i2 = -1;
                    } else {
                        i = reflectMetrics(displayMetrics2, "noncompatWidthPixels");
                        i2 = reflectMetrics(displayMetrics2, "noncompatHeightPixels");
                    }
                    if (i == -1 || i2 == -1) {
                        i = displayMetrics2.widthPixels;
                        i2 = displayMetrics2.heightPixels;
                    }
                    if (i > i2) {
                        iArr[0] = i2;
                        iArr[1] = i;
                    } else {
                        iArr[0] = i;
                        iArr[1] = i2;
                    }
                    return iArr;
                } catch (Throwable th2) {
                }
            }
        }
        return null;
    }

    private static int reflectMetrics(Object obj, String str) {
        try {
            Field declaredField = DisplayMetrics.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(obj);
        } catch (Throwable th) {
            return -1;
        }
    }

    public static String getPackageName(Context context) {
        if (!TextUtils.isEmpty(sAppPkgName)) {
            return sAppPkgName;
        }
        if (context == null) {
            return null;
        }
        sAppPkgName = context.getPackageName();
        return sAppPkgName;
    }

    public static String getAppSHA1Key(Context context) {
        try {
            PackageInfo a = com.umeng.commonsdk.utils.b.a().a(context, getPackageName(context), 64);
            if (a == null) {
                return null;
            }
            return byte2HexFormatted(MessageDigest.getInstance("SHA1").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(a.signatures[0].toByteArray()))).getEncoded()));
        } catch (Exception e) {
            return null;
        }
    }

    public static String getAppHashKey(Context context) {
        try {
            PackageInfo a = com.umeng.commonsdk.utils.b.a().a(context, getPackageName(context), 64);
            if (a != null) {
                Signature[] signatureArr = a.signatures;
                if (signatureArr.length > 0) {
                    Signature signature = signatureArr[0];
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                    messageDigest.update(signature.toByteArray());
                    return Base64.encodeToString(messageDigest.digest(), 0).trim();
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            return null;
        }
    }

    public static String getAppMD5Signature(Context context) {
        if (context == null) {
            return null;
        }
        try {
            PackageInfo a = com.umeng.commonsdk.utils.b.a().a(context, getPackageName(context), 64);
            if (a == null) {
                return null;
            }
            return byte2HexFormatted(MessageDigest.getInstance("MD5").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(a.signatures[0].toByteArray()))).getEncoded()));
        } catch (Throwable th) {
            return null;
        }
    }

    private static String byte2HexFormatted(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = AppEventsConstants.EVENT_PARAM_VALUE_NO + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase(Locale.getDefault()));
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    public static String getApplicationLable(Context context) {
        if (context == null) {
            return "";
        }
        return context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
    }

    public static String getAppName(Context context) {
        if (!TextUtils.isEmpty(sAppName)) {
            return sAppName;
        }
        if (context == null) {
            return null;
        }
        try {
            PackageInfo a = com.umeng.commonsdk.utils.b.a().a(context, context.getPackageName(), 64);
            if (a != null) {
                sAppName = a.applicationInfo.loadLabel(context.getPackageManager()).toString();
            }
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.i(LOG_TAG, th);
            }
        }
        return sAppName;
    }

    public static String getDeviceIdForGeneral(Context context) {
        if (context == null) {
            return "";
        }
        try {
            if (Build.VERSION.SDK_INT < 23) {
                String imei = getIMEI(context);
                deviceTypeEnum = DeviceTypeEnum.IMEI;
                if (TextUtils.isEmpty(imei)) {
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.w(LOG_TAG, "No IMEI.");
                    }
                    String macBySystemInterface = getMacBySystemInterface(context);
                    deviceTypeEnum = DeviceTypeEnum.MAC;
                    if (TextUtils.isEmpty(macBySystemInterface)) {
                        if (FieldManager.allow(com.umeng.commonsdk.utils.d.i)) {
                            macBySystemInterface = getAndroidId(context);
                            deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                            if (AnalyticsConstants.UM_DEBUG) {
                                String str = LOG_TAG;
                                MLog.i(str, "getDeviceId, ANDROID_ID: " + macBySystemInterface);
                            }
                        }
                        if (TextUtils.isEmpty(macBySystemInterface)) {
                            String serialNo = getSerialNo();
                            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                            return serialNo;
                        }
                        return macBySystemInterface;
                    }
                    return macBySystemInterface;
                }
                return imei;
            } else if (Build.VERSION.SDK_INT == 23) {
                String imei2 = getIMEI(context);
                deviceTypeEnum = DeviceTypeEnum.IMEI;
                if (TextUtils.isEmpty(imei2)) {
                    String macByJavaAPI = getMacByJavaAPI();
                    deviceTypeEnum = DeviceTypeEnum.MAC;
                    if (TextUtils.isEmpty(macByJavaAPI)) {
                        if (AnalyticsConstants.CHECK_DEVICE) {
                            macByJavaAPI = getMacShell();
                            deviceTypeEnum = DeviceTypeEnum.MAC;
                        } else {
                            macByJavaAPI = getMacBySystemInterface(context);
                            deviceTypeEnum = DeviceTypeEnum.MAC;
                        }
                    }
                    if (AnalyticsConstants.UM_DEBUG) {
                        String str2 = LOG_TAG;
                        MLog.i(str2, "getDeviceId, MAC: " + macByJavaAPI);
                    }
                    if (TextUtils.isEmpty(macByJavaAPI)) {
                        if (FieldManager.allow(com.umeng.commonsdk.utils.d.i)) {
                            macByJavaAPI = getAndroidId(context);
                            deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                            if (AnalyticsConstants.UM_DEBUG) {
                                String str3 = LOG_TAG;
                                MLog.i(str3, "getDeviceId, ANDROID_ID: " + macByJavaAPI);
                            }
                        }
                        if (TextUtils.isEmpty(macByJavaAPI)) {
                            String serialNo2 = getSerialNo();
                            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                            return serialNo2;
                        }
                        return macByJavaAPI;
                    }
                    return macByJavaAPI;
                }
                return imei2;
            } else if (Build.VERSION.SDK_INT >= 29) {
                String oaid = getOaid(context);
                deviceTypeEnum = DeviceTypeEnum.OAID;
                if (TextUtils.isEmpty(oaid)) {
                    String idfa = getIdfa(context);
                    deviceTypeEnum = DeviceTypeEnum.IDFA;
                    if (TextUtils.isEmpty(idfa)) {
                        String androidId = getAndroidId(context);
                        deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                        if (TextUtils.isEmpty(androidId)) {
                            String serialNo3 = getSerialNo();
                            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                            if (TextUtils.isEmpty(serialNo3)) {
                                String macByJavaAPI2 = getMacByJavaAPI();
                                deviceTypeEnum = DeviceTypeEnum.MAC;
                                if (TextUtils.isEmpty(macByJavaAPI2)) {
                                    String macBySystemInterface2 = getMacBySystemInterface(context);
                                    deviceTypeEnum = DeviceTypeEnum.MAC;
                                    return macBySystemInterface2;
                                }
                                return macByJavaAPI2;
                            }
                            return serialNo3;
                        }
                        return androidId;
                    }
                    return idfa;
                }
                return oaid;
            } else {
                String imei3 = getIMEI(context);
                deviceTypeEnum = DeviceTypeEnum.IMEI;
                if (TextUtils.isEmpty(imei3)) {
                    String serialNo4 = getSerialNo();
                    deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                    if (TextUtils.isEmpty(serialNo4)) {
                        if (FieldManager.allow(com.umeng.commonsdk.utils.d.i)) {
                            serialNo4 = getAndroidId(context);
                            deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                            if (AnalyticsConstants.UM_DEBUG) {
                                String str4 = LOG_TAG;
                                MLog.i(str4, "getDeviceId, ANDROID_ID: " + serialNo4);
                            }
                        }
                        if (TextUtils.isEmpty(serialNo4)) {
                            String macByJavaAPI3 = getMacByJavaAPI();
                            deviceTypeEnum = DeviceTypeEnum.MAC;
                            if (TextUtils.isEmpty(macByJavaAPI3)) {
                                String macBySystemInterface3 = getMacBySystemInterface(context);
                                deviceTypeEnum = DeviceTypeEnum.MAC;
                                if (AnalyticsConstants.UM_DEBUG) {
                                    String str5 = LOG_TAG;
                                    MLog.i(str5, "getDeviceId, MAC: " + macBySystemInterface3);
                                    return macBySystemInterface3;
                                }
                                return macBySystemInterface3;
                            }
                            return macByJavaAPI3;
                        }
                        return serialNo4;
                    }
                    return serialNo4;
                }
                return imei3;
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public static String getDeviceIdForBox(Context context) {
        String str = "";
        if (context == null) {
            return "";
        }
        try {
            if (Build.VERSION.SDK_INT < 23) {
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.i)) {
                    str = getAndroidId(context);
                    deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                    if (AnalyticsConstants.UM_DEBUG) {
                        String str2 = LOG_TAG;
                        MLog.i(str2, "getDeviceId, ANDROID_ID: " + str);
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    String macBySystemInterface = getMacBySystemInterface(context);
                    deviceTypeEnum = DeviceTypeEnum.MAC;
                    if (AnalyticsConstants.UM_DEBUG) {
                        String str3 = LOG_TAG;
                        MLog.i(str3, "getDeviceId, MAC: " + macBySystemInterface);
                    }
                    if (TextUtils.isEmpty(macBySystemInterface)) {
                        String serialNo = getSerialNo();
                        deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                        if (TextUtils.isEmpty(serialNo)) {
                            String imei = getIMEI(context);
                            deviceTypeEnum = DeviceTypeEnum.IMEI;
                            return imei;
                        }
                        return serialNo;
                    }
                    return macBySystemInterface;
                }
                return str;
            } else if (Build.VERSION.SDK_INT == 23) {
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.i)) {
                    str = getAndroidId(context);
                    deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                    if (AnalyticsConstants.UM_DEBUG) {
                        String str4 = LOG_TAG;
                        MLog.i(str4, "getDeviceId, ANDROID_ID: " + str);
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    String macByJavaAPI = getMacByJavaAPI();
                    deviceTypeEnum = DeviceTypeEnum.MAC;
                    if (TextUtils.isEmpty(macByJavaAPI)) {
                        if (AnalyticsConstants.CHECK_DEVICE) {
                            macByJavaAPI = getMacShell();
                            deviceTypeEnum = DeviceTypeEnum.MAC;
                        } else {
                            macByJavaAPI = getMacBySystemInterface(context);
                            deviceTypeEnum = DeviceTypeEnum.MAC;
                        }
                    }
                    if (AnalyticsConstants.UM_DEBUG) {
                        String str5 = LOG_TAG;
                        MLog.i(str5, "getDeviceId, MAC: " + macByJavaAPI);
                    }
                    if (TextUtils.isEmpty(macByJavaAPI)) {
                        String serialNo2 = getSerialNo();
                        deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                        if (TextUtils.isEmpty(serialNo2)) {
                            String imei2 = getIMEI(context);
                            deviceTypeEnum = DeviceTypeEnum.IMEI;
                            return imei2;
                        }
                        return serialNo2;
                    }
                    return macByJavaAPI;
                }
                return str;
            } else if (Build.VERSION.SDK_INT >= 29) {
                String oaid = getOaid(context);
                deviceTypeEnum = DeviceTypeEnum.OAID;
                if (TextUtils.isEmpty(oaid)) {
                    String idfa = getIdfa(context);
                    deviceTypeEnum = DeviceTypeEnum.IDFA;
                    if (TextUtils.isEmpty(idfa)) {
                        String androidId = getAndroidId(context);
                        deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                        if (TextUtils.isEmpty(androidId)) {
                            String serialNo3 = getSerialNo();
                            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                            if (TextUtils.isEmpty(serialNo3)) {
                                String macByJavaAPI2 = getMacByJavaAPI();
                                deviceTypeEnum = DeviceTypeEnum.MAC;
                                if (TextUtils.isEmpty(macByJavaAPI2)) {
                                    String macBySystemInterface2 = getMacBySystemInterface(context);
                                    deviceTypeEnum = DeviceTypeEnum.MAC;
                                    return macBySystemInterface2;
                                }
                                return macByJavaAPI2;
                            }
                            return serialNo3;
                        }
                        return androidId;
                    }
                    return idfa;
                }
                return oaid;
            } else {
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.i)) {
                    str = getAndroidId(context);
                    deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                    if (AnalyticsConstants.UM_DEBUG) {
                        String str6 = LOG_TAG;
                        MLog.i(str6, "getDeviceId: ANDROID_ID: " + str);
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    String serialNo4 = getSerialNo();
                    deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                    if (TextUtils.isEmpty(serialNo4)) {
                        String imei3 = getIMEI(context);
                        deviceTypeEnum = DeviceTypeEnum.IMEI;
                        if (TextUtils.isEmpty(imei3)) {
                            String macByJavaAPI3 = getMacByJavaAPI();
                            deviceTypeEnum = DeviceTypeEnum.MAC;
                            if (TextUtils.isEmpty(macByJavaAPI3)) {
                                String macBySystemInterface3 = getMacBySystemInterface(context);
                                deviceTypeEnum = DeviceTypeEnum.MAC;
                                if (AnalyticsConstants.UM_DEBUG) {
                                    String str7 = LOG_TAG;
                                    MLog.i(str7, "getDeviceId, MAC: " + macBySystemInterface3);
                                    return macBySystemInterface3;
                                }
                                return macBySystemInterface3;
                            }
                            return macByJavaAPI3;
                        }
                        return imei3;
                    }
                    return serialNo4;
                }
                return str;
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public static String getOaid(Context context) {
        if (!TextUtils.isEmpty(sOAID)) {
            return sOAID;
        }
        if (hasReadOAID) {
            return "";
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences(h.a, 0);
                if (sharedPreferences != null) {
                    sOAID = sharedPreferences.getString(h.b, "");
                }
            } catch (Throwable th) {
            }
            hasReadOAID = true;
        }
        return sOAID;
    }

    public static String getIdfa(Context context) {
        if (!TextUtils.isEmpty(sIDFA)) {
            return sIDFA;
        }
        if (hasReadIDFA) {
            return "";
        }
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.w)) {
                sIDFA = a.a(context);
            }
        } catch (Throwable th) {
        }
        hasReadIDFA = true;
        return sIDFA;
    }

    private static String getIMEI(Context context) {
        if (!TextUtils.isEmpty(sImei)) {
            return sImei;
        }
        String str = "";
        if (hasReadImeiOrMeid) {
            return "";
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.g)) {
            if (context == null) {
                return "";
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE);
            if (telephonyManager != null) {
                try {
                    if (checkPermission(context, g.c)) {
                        String deviceId = telephonyManager.getDeviceId();
                        try {
                            if (AnalyticsConstants.UM_DEBUG) {
                                String str2 = LOG_TAG;
                                MLog.i(str2, "getDeviceId, IMEI: " + deviceId);
                            }
                            str = deviceId;
                        } catch (Throwable th) {
                            th = th;
                            str = deviceId;
                            try {
                                if (AnalyticsConstants.UM_DEBUG) {
                                    MLog.w(LOG_TAG, "No IMEI.", th);
                                }
                                sImei = str;
                                return sImei;
                            } finally {
                                hasReadImeiOrMeid = true;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        sImei = str;
        return sImei;
    }

    private static String getSerialNo() {
        return "";
    }

    public static String getSubOSName(Context context) {
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty(KEY_MIUI_VERSION_NAME);
            if (TextUtils.isEmpty(property)) {
                if (isFlyMe()) {
                    return "Flyme";
                }
                if (isEmui(buildProp)) {
                    return "Emui";
                }
                if (!TextUtils.isEmpty(getYunOSVersion(buildProp))) {
                    return "YunOS";
                }
                return property;
            }
            return "MIUI";
        } catch (Throwable th) {
            return null;
        }
    }

    public static String getSubOSVersion(Context context) {
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty(KEY_MIUI_VERSION_NAME);
            if (TextUtils.isEmpty(property)) {
                if (isFlyMe()) {
                    try {
                        return getFlymeVersion(buildProp);
                    } catch (Throwable th) {
                        return property;
                    }
                } else if (isEmui(buildProp)) {
                    try {
                        return getEmuiVersion(buildProp);
                    } catch (Throwable th2) {
                        return property;
                    }
                } else {
                    try {
                        return getYunOSVersion(buildProp);
                    } catch (Throwable th3) {
                        return property;
                    }
                }
            }
            return property;
        } catch (Throwable th4) {
            return null;
        }
    }

    private static String getYunOSVersion(Properties properties) {
        try {
            String property = properties.getProperty("ro.yunos.version");
            if (!TextUtils.isEmpty(property)) {
                return property;
            }
            return null;
        } catch (Throwable th) {
            return null;
        }
    }

    private static String getFlymeVersion(Properties properties) {
        try {
            String lowerCase = properties.getProperty("ro.build.display.id").toLowerCase(Locale.getDefault());
            if (lowerCase.contains("flyme os")) {
                return lowerCase.split(" ")[2];
            }
            return null;
        } catch (Throwable th) {
            return null;
        }
    }

    private static String getEmuiVersion(Properties properties) {
        try {
            return properties.getProperty(KEY_EMUI_VERSION_CODE, null);
        } catch (Exception e) {
            return null;
        }
    }

    private static Properties getBuildProp() {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
            } catch (Throwable th) {
            }
        } catch (Throwable th2) {
        }
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (Throwable th3) {
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            return properties;
        }
        return properties;
    }

    private static boolean isFlyMe() {
        try {
            Build.class.getMethod("hasSmartBar", new Class[0]);
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    private static boolean isEmui(Properties properties) {
        try {
            if (properties.getProperty(KEY_EMUI_VERSION_CODE, null) == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static String getDeviceType(Context context) {
        if (context == null) {
            return "Phone";
        }
        try {
            if (!((context.getResources().getConfiguration().screenLayout & 15) >= 3)) {
                return "Phone";
            }
            return "Tablet";
        } catch (Throwable th) {
            return "Phone";
        }
    }

    public static String getDBencryptID(Context context) {
        return UMUtils.genId();
    }

    public static Activity getGlobleActivity(Context context) {
        Activity activity = null;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(invoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField(TTDownloadField.TT_ACTIVITY);
                    declaredField3.setAccessible(true);
                    activity = (Activity) declaredField3.get(obj);
                }
            }
        } catch (Throwable th) {
        }
        return activity;
    }

    public static boolean isHarmony(Context context) {
        try {
            return context.getString(Resources.getSystem().getIdentifier("config_os_brand", "string", "android")).equals("harmony");
        } catch (Throwable th) {
            return false;
        }
    }

    public static String getSid(Context context) {
        return y.a().d(context);
    }

    public static String getCustomAgt() {
        if (!TextUtils.isEmpty(sCustomAgt)) {
            return sCustomAgt;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Dalvik/");
        sb.append(System.getProperty("java.vm.version"));
        sb.append(" (Linux; U; Android ");
        sb.append(")");
        sCustomAgt = sb.toString();
        return sCustomAgt;
    }
}
