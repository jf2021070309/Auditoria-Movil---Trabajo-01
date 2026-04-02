package com.kuaishou.weapon.p0;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.places.model.PlaceFields;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.math.BigDecimal;
/* loaded from: classes.dex */
public class bk {
    public static String A() {
        try {
            String a = bg.a("persist.service.bdroid.bdaddr");
            return TextUtils.isEmpty(a) ? bh.c : a;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String B() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class).invoke(cls, "gsm.version.baseband");
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String C() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            StringBuilder sb = new StringBuilder();
            sb.append(numberOfCameras);
            return sb.toString();
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String D() {
        try {
            return BigDecimal.valueOf(((float) (new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes() >> 20)) / 1024.0f).setScale(2, 4).toString();
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String E() {
        try {
            return BigDecimal.valueOf(((float) (new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes() >> 20)) / 1024.0f).setScale(2, 4).toString();
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String F() {
        File externalStorageDirectory;
        try {
            return (!"mounted".equals(Environment.getExternalStorageState()) || (externalStorageDirectory = Environment.getExternalStorageDirectory()) == null) ? bh.a : BigDecimal.valueOf(((float) (new StatFs(externalStorageDirectory.getPath()).getTotalBytes() >> 20)) / 1024.0f).setScale(2, 4).toString();
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String G() {
        File externalStorageDirectory;
        try {
            return (!"mounted".equals(Environment.getExternalStorageState()) || (externalStorageDirectory = Environment.getExternalStorageDirectory()) == null) ? bh.a : BigDecimal.valueOf(((float) (new StatFs(externalStorageDirectory.getPath()).getAvailableBytes() >> 20)) / 1024.0f).setScale(2, 4).toString();
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static long H() {
        BufferedReader bufferedReader;
        String readLine;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
        } catch (Throwable th) {
            bufferedReader = null;
        }
        do {
            try {
                try {
                    readLine = bufferedReader.readLine();
                    if (readLine != null) {
                    }
                } catch (Throwable th2) {
                    if (bufferedReader == null) {
                        return 0L;
                    }
                    bufferedReader.close();
                    return 0L;
                }
                bufferedReader.close();
                return 0L;
            } catch (IOException e) {
                return 0L;
            }
        } while (!readLine.contains("MemTotal"));
        long longValue = Long.valueOf(readLine.split("\\s+")[1]).longValue();
        try {
            bufferedReader.close();
        } catch (IOException e2) {
        }
        return longValue;
    }

    public static String I() {
        try {
            return f.a(new File("/system/bin/app_process"));
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String J() {
        try {
            File file = new File("/system/bin/servicemanager");
            return (file.exists() && file.canRead()) ? f.a(file) : bh.d;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String K() {
        try {
            File file = new File("/system/framework/framework.jar");
            return (file.exists() && file.canRead()) ? f.a(file) : bh.d;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String L() {
        if (Build.VERSION.SDK_INT >= 14) {
            return Build.getRadioVersion();
        }
        return null;
    }

    private static float a(DisplayMetrics displayMetrics) {
        if (displayMetrics == null) {
            return 0.0f;
        }
        try {
            return displayMetrics.xdpi;
        } catch (Throwable th) {
            return 0.0f;
        }
    }

    public static int a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE);
            if (telephonyManager == null) {
                return -1;
            }
            return telephonyManager.getPhoneType();
        } catch (Throwable th) {
            return -2;
        }
    }

    public static String a() {
        try {
            String str = Build.MANUFACTURER;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    private static float b(DisplayMetrics displayMetrics) {
        if (displayMetrics == null) {
            return 0.0f;
        }
        try {
            return displayMetrics.ydpi;
        } catch (Throwable th) {
            return 0.0f;
        }
    }

    public static String b() {
        try {
            String str = Build.BRAND;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r2) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1b
            r1 = 17
            if (r0 < r1) goto Lc
            java.lang.String r2 = android.webkit.WebSettings.getDefaultUserAgent(r2)     // Catch: java.lang.Throwable -> Lb
            goto L12
        Lb:
            r2 = move-exception
        Lc:
            java.lang.String r2 = "http.agent"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.Throwable -> L1b
        L12:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1a
            java.lang.String r2 = "RISK_GET_FIELD_EMPTY"
        L1a:
            return r2
        L1b:
            r2 = move-exception
            java.lang.String r2 = "RISK_EXCEPTION_HAPPEN"
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.bk.b(android.content.Context):java.lang.String");
    }

    public static String c() {
        try {
            String str = Build.MODEL;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String c(Context context) {
        int i;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            defaultDisplay.getMetrics(new DisplayMetrics());
            int i2 = 0;
            if (Build.VERSION.SDK_INT >= 31) {
                WindowMetrics maximumWindowMetrics = windowManager.getMaximumWindowMetrics();
                i2 = maximumWindowMetrics.getBounds().width();
                i = maximumWindowMetrics.getBounds().height();
            } else if (Build.VERSION.SDK_INT >= 17) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                i2 = point.x;
                i = point.y;
            } else if (Build.VERSION.SDK_INT >= 17 || Build.VERSION.SDK_INT < 14) {
                i = 0;
            } else {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                int intValue = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
                i2 = intValue;
            }
            float a = a(j(context));
            float b = b(j(context));
            if (a != 0.0f && b != 0.0f) {
                int round = Math.round((i2 / a) * 2.54f) * 10;
                int round2 = Math.round((i / b) * 2.54f) * 10;
                if (round > round2) {
                    return round2 + "mm * " + round + "mm";
                }
                return round + "mm * " + round2 + "mm";
            }
            return "";
        } catch (Throwable th) {
            return "";
        }
    }

    public static String d() {
        try {
            String str = Build.HARDWARE;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String d(Context context) {
        int i;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            defaultDisplay.getMetrics(new DisplayMetrics());
            int i2 = 0;
            if (Build.VERSION.SDK_INT >= 31) {
                WindowMetrics maximumWindowMetrics = windowManager.getMaximumWindowMetrics();
                i2 = maximumWindowMetrics.getBounds().width();
                i = maximumWindowMetrics.getBounds().height();
            } else if (Build.VERSION.SDK_INT >= 17) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                i2 = point.x;
                i = point.y;
            } else if (Build.VERSION.SDK_INT >= 17 || Build.VERSION.SDK_INT < 14) {
                i = 0;
            } else {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                int intValue = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
                i2 = intValue;
            }
            if (i2 > i) {
                return i + "*" + i2;
            }
            return i2 + "*" + i;
        } catch (Throwable th) {
            return "";
        }
    }

    public static String e() {
        try {
            String str = Build.PRODUCT;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String e(Context context) {
        DisplayMetrics j = j(context);
        if (j != null) {
            return Integer.toString(j.densityDpi);
        }
        return null;
    }

    public static String f() {
        try {
            String str = Build.DEVICE;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Throwable] */
    public static String f(Context context) {
        Process process;
        InputStream inputStream;
        InputStream inputStream2 = null;
        r7 = null;
        String str = null;
        inputStream2 = null;
        try {
            process = Runtime.getRuntime().exec("cat /proc/version");
            try {
                inputStream = process.getInputStream();
            } catch (Throwable th) {
            }
        } catch (Throwable th2) {
            process = null;
        }
        try {
            byte[] bArr = new byte[1024];
            int read = inputStream.read(bArr);
            if (read <= 0) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                    }
                }
                if (process != null) {
                    process.destroy();
                }
                return bh.c;
            }
            byte[] bArr2 = new byte[read];
            System.arraycopy(bArr, 0, bArr2, 0, read);
            String str2 = new String(bArr2, AudienceNetworkActivity.WEBVIEW_ENCODING);
            int indexOf = str2.indexOf("version");
            if (indexOf != -1) {
                String[] split = str2.substring(indexOf).split(" ");
                if (1 < split.length) {
                    str = split[1];
                }
            }
            if (TextUtils.isEmpty(str)) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th4) {
                    }
                }
                if (process != null) {
                    process.destroy();
                }
                return bh.c;
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th5) {
                }
            }
            if (process != null) {
                process.destroy();
            }
            return str;
        } catch (Throwable th6) {
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Throwable th7) {
                }
            }
            if (process != null) {
                process.destroy();
                return bh.d;
            }
            return bh.d;
        }
    }

    public static int g(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_off_timeout");
        } catch (Exception e) {
            return -2;
        }
    }

    public static String g() {
        try {
            String str = Build.BOARD;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static int h(Context context) {
        try {
            return ((AudioManager) context.getSystemService("audio")).getRingerMode();
        } catch (Exception e) {
            return -2;
        }
    }

    public static String h() {
        try {
            String str = Build.HOST;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static int i(Context context) {
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke((ConnectivityManager) context.getSystemService("connectivity"), new Object[0])).booleanValue() ? 0 : 1;
        } catch (Throwable th) {
            return -2;
        }
    }

    public static String i() {
        try {
            String str = Build.USER;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    private static DisplayMetrics j(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics;
        } catch (Throwable th) {
            return null;
        }
    }

    public static String j() {
        try {
            String str = Build.TYPE;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String k() {
        try {
            String str = Build.TAGS;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String l() {
        try {
            String str = Build.BOOTLOADER;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String m() {
        try {
            String str = Build.ID;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String n() {
        try {
            String str = Build.DISPLAY;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String o() {
        try {
            String str = Build.VERSION.CODENAME;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String p() {
        try {
            String a = bg.a("rild.libpath");
            return TextUtils.isEmpty(a) ? bh.c : a;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String q() {
        try {
            String str = Build.VERSION.RELEASE;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static int r() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Throwable th) {
            return -2;
        }
    }

    public static String s() {
        try {
            String str = Build.FINGERPRINT;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String t() {
        try {
            String property = System.getProperty("http.agent");
            return TextUtils.isEmpty(property) ? bh.c : property;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String u() {
        Process process;
        InputStream inputStream;
        BufferedReader bufferedReader = null;
        try {
            process = Runtime.getRuntime().exec("uname -a");
            try {
                inputStream = process.waitFor() == 0 ? process.getInputStream() : process.getErrorStream();
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream), 512);
                    try {
                        String readLine = bufferedReader2.readLine();
                        try {
                            bufferedReader2.close();
                        } catch (Throwable th) {
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                            }
                        }
                        if (process != null) {
                            process.destroy();
                        }
                        return readLine;
                    } catch (Throwable th3) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th4) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th5) {
                            }
                        }
                        if (process != null) {
                            process.destroy();
                            return bh.d;
                        }
                        return bh.d;
                    }
                } catch (Throwable th6) {
                }
            } catch (Throwable th7) {
                inputStream = null;
            }
        } catch (Throwable th8) {
            process = null;
            inputStream = null;
        }
    }

    public static String v() {
        try {
            String str = Build.RADIO;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String w() {
        try {
            String a = bg.a("ro.build.description");
            return TextUtils.isEmpty(a) ? bh.c : a;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String x() {
        try {
            String str = Build.VERSION.INCREMENTAL;
            return TextUtils.isEmpty(str) ? bh.c : str;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String y() {
        try {
            String a = bg.a("ro.product.name");
            return TextUtils.isEmpty(a) ? bh.c : a;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String z() {
        try {
            String a = bg.a("dalvik.vm.heapgrowthlimit");
            return TextUtils.isEmpty(a) ? bh.c : a;
        } catch (Throwable th) {
            return bh.d;
        }
    }
}
