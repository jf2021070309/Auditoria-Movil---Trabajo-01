package com.kwad.sdk.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.media.AudioManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.system.Os;
import android.system.StructStat;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.facebook.places.model.PlaceFields;
import com.kwad.sdk.service.ServiceProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
/* loaded from: classes3.dex */
public final class be {
    private static String aJT;
    private static boolean aJV;
    private static String aKg;
    private static String aKh;
    private static int aKp;
    private static long aKq;
    private static String aJU = "";
    private static String aJW = "";
    private static String aJX = "";
    private static int aJY = 0;
    private static boolean aJZ = false;
    private static int aKa = 0;
    private static boolean aKb = false;
    private static final String[] aKc = {"", ""};
    private static String aKd = "";
    private static String aKe = "";
    private static String aKf = "";
    private static int aKi = -1;
    private static boolean aKj = false;
    private static boolean aKk = false;
    private static boolean aKl = false;
    private static boolean aKm = false;
    private static boolean aKn = false;
    private static boolean aKo = false;
    private static String aKr = "";
    private static String aKs = "";
    private static final List<String> aKt = Arrays.asList("a5f5faddde9e9f02", "8e17f7422b35fbea", "b88c3c236923d9d9", "cb36bf76cca443d0", "5d4e49ed381836c5", "cffa38e9136f93e9", "62bd2daa59ea0173", "b7aad49a2d5bc5d9", "f2138912c5e5dd5c", "330a1e81a2bf9f31", "59c0f432ccbef844", "521376155e535f39", "aa5ec6ce14abd680", "5522a09bb500d82f", "6dfe4a96800edfb4", "ecc9a2dded8cdf72", "399f868043955b11", "34dc327c00dbff94", "d1b4e3862c309f8b", "68bdbf71f863ccac", "01558dd995085a35", "351174200a06da52", "fa0988506c76ff4b", "8eb8ef823312c61a", "a72e81be65c4638b", "416d15a015c8f324", "474086ea2d737519", "befdddf908c8d749", "780ee58a6f57aab6", "cfe86fa07cae3601", "704ff4d1534f0ff4", "9298b9e9bbd7cdea", "7b634c42f236c6e8", "11eacf22b9ceab7d", "2941a4f39eec5864", "87d134dc5ba45550", "fdd2313bb1750eb9", "6560ef232d8424bb", "5d876286e1064482", "f66fefb916f4962d", "7baf82d0ac49f596", "57748921d8d88ed4", "120cd57f1a50b8f5", "e164f9610ddd9fc8", "6256f0e8da6389de", "bcb22df712476416", "714fa9aff63f7adb", "cb8252e4da7cf610", "e18f649aa80e140c", "966790a9db5ea8d8", "e1769e681af901dd", "d23f2574a60964a4", "d717e6298d3c9cb2", "f5ea5e8ba730864e", "a8a0a223d1a42232", "6675a4f231f5c8db", "3edb7c2103e5c75a", "8ce6a9a216b326c4", "af606153eb3be0a7", "7ae255c3d760c920", "e50e94c40048c5fd", "55009bca30f9dc4c", "c37566487909214a", "891b74f7e534d14a", "726e190aae663525", "df473127d30fb669", "bfbcc646d92dfd48", "a4a1954c44751936", "da4a44a3d7c4d8be", "5ff5bca4a775dd30", "14917461e1917c53", "14ce20d0a80955fa", "a56a63de4d3f3d39", "f780246adc7bd556", "3495a541aea0da72", "f7f205ce47fed2a5", "f52db3f434279c3a", "dca17088c97dee5e", "dd53a8b3a2a4ccc0", "52e07629290d45e4", "cda522b0f8f50d9a", "b85a1c8bcd51d82c", "e344a00cd3f5e93a", "fa59d8a66d7bdd88", "68fb1f1393a216e8", "4c30ab1fb10af181", "b1376e0578099143", "88752f72d8d305fd", "fddf20078d27bf3c", "dab2120bffa2be8c", "c7c8dde481793471", "e4b1bdbcabfc284d");

    private static long JB() {
        BufferedReader bufferedReader;
        Throwable th;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            do {
                try {
                    readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
                        return 0L;
                    }
                } catch (Exception e) {
                    bufferedReader2 = bufferedReader;
                    com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader2);
                    return 0L;
                } catch (Throwable th2) {
                    th = th2;
                    com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
                    throw th;
                }
            } while (!readLine.contains("MemTotal"));
            long longValue = Long.valueOf(readLine.split("\\s+")[1]).longValue() << 10;
            com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
            return longValue;
        } catch (Exception e2) {
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    public static long JD() {
        return com.kwad.sdk.crash.utils.h.K(Environment.getDataDirectory());
    }

    public static long JE() {
        if (((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(1024L)) {
            return 0L;
        }
        return com.kwad.sdk.crash.utils.h.J(Environment.getDataDirectory());
    }

    public static long JF() {
        try {
            long freeMemory = Runtime.getRuntime().freeMemory();
            if (freeMemory > 0) {
                return freeMemory;
            }
            return 0L;
        } catch (Throwable th) {
            return 0L;
        }
    }

    public static int JG() {
        int i = aKp;
        if (i > 0) {
            return i;
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        aKp = availableProcessors;
        return availableProcessors;
    }

    public static String JH() {
        return Build.MODEL;
    }

    public static synchronized long JI() {
        long j;
        synchronized (be.class) {
            j = 0;
            if (at.IV() && (!TextUtils.isEmpty(at.IW()) || at.IX() != null)) {
                j = 1;
            }
            if (at.IT() && at.IU() != null) {
                j |= 64;
            }
            if (at.IV() && !TextUtils.isEmpty(at.IY())) {
                j |= 2;
            }
            if (at.IZ() && !TextUtils.isEmpty(at.Ja())) {
                j |= 4;
            }
            if (at.Jb() && !TextUtils.isEmpty(at.Jc())) {
                j |= 2048;
            }
            if (at.Jf()) {
                if (at.Jg() != null) {
                    j |= 16;
                }
            }
        }
        return j;
    }

    public static String JJ() {
        return Build.BRAND;
    }

    public static synchronized long JK() {
        long elapsedRealtime;
        synchronized (be.class) {
            elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
        }
        return elapsedRealtime;
    }

    public static synchronized long JL() {
        long j;
        synchronized (be.class) {
            j = Build.TIME;
        }
        return j;
    }

    public static synchronized String JM() {
        String str;
        synchronized (be.class) {
            str = Build.FINGERPRINT;
        }
        return str;
    }

    public static synchronized String JN() {
        synchronized (be.class) {
            if (!TextUtils.isEmpty(aJT)) {
                return aJT;
            }
            String radioVersion = Build.getRadioVersion();
            aJT = radioVersion;
            return radioVersion;
        }
    }

    public static synchronized String JO() {
        String name;
        synchronized (be.class) {
            name = as.getName();
        }
        return name;
    }

    public static synchronized String JP() {
        String version;
        synchronized (be.class) {
            version = as.getVersion();
        }
        return version;
    }

    public static String JQ() {
        return Build.MANUFACTURER;
    }

    public static int JR() {
        if (aKi == -1) {
            aKi = dk(((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext()) ? 4 : 3;
        }
        return aKi;
    }

    public static String JS() {
        if (TextUtils.isEmpty(aKh)) {
            aKh = System.getProperty("os.arch");
        }
        return aKh;
    }

    public static int JT() {
        return Build.VERSION.SDK_INT;
    }

    public static String JU() {
        if (at.Jd() || ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(8L)) {
            return "";
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if ((nextElement instanceof Inet4Address) && !nextElement.isLoopbackAddress()) {
                        return nextElement.getHostAddress();
                    }
                }
            }
        } catch (Throwable th) {
        }
        return "";
    }

    private static String JV() {
        try {
            return a(Long.toHexString(new Random(System.currentTimeMillis()).nextLong()), 16, '0');
        } catch (Throwable th) {
            return null;
        }
    }

    private static String JW() {
        if (((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext() == null) {
            return null;
        }
        String j = y.j("ksadsdk_pref", "android_id", null);
        y.k(j, "ksadsdk_pref", "android_id");
        return j;
    }

    public static String JX() {
        if (TextUtils.isEmpty(aKr)) {
            try {
                String V = q.V(new File("/proc/sys/kernel/random/boot_id"));
                aKr = TextUtils.isEmpty(V) ? "" : V.substring(0, V.indexOf("\n"));
            } catch (Throwable th) {
            }
            return aKr;
        }
        return aKr;
    }

    private static String a(String str, int i, char c) {
        StringBuilder sb = new StringBuilder();
        while (sb.length() + str.length() < 16) {
            sb.append('0');
        }
        sb.append(str);
        return sb.toString();
    }

    public static String bQ(boolean z) {
        Context context = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext();
        String bc = com.kwad.sdk.core.f.a.bc(context);
        return (TextUtils.isEmpty(bc) && !z && TextUtils.isEmpty(dd(context))) ? ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).xy() : bc;
    }

    public static synchronized String cB(Context context) {
        synchronized (be.class) {
            if (context != null) {
                if (!aKk && TextUtils.isEmpty(aKd) && SystemUtil.cZ(context) && !at.IV() && o.Ia()) {
                    try {
                        aKd = ((TelephonyManager) context.getApplicationContext().getSystemService(PlaceFields.PHONE)).getSubscriberId();
                    } catch (Exception e) {
                    }
                    aKk = TextUtils.isEmpty(aKd);
                    return aKd;
                }
            }
            return aKd;
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static String cx(Context context) {
        if (!TextUtils.isEmpty(aKf) || context == null || aKm) {
            return aKf;
        }
        if (at.IV()) {
            return at.IY();
        }
        if (o.HU()) {
            try {
                String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                aKf = string;
                if (!fO(string)) {
                    aKf = "";
                }
            } catch (Exception e) {
            }
            if (TextUtils.isEmpty(aKf)) {
                aKm = true;
            }
            return aKf;
        }
        return aKf;
    }

    public static long da(Context context) {
        if (context == null || ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(1024L)) {
            return 0L;
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY)).getMemoryInfo(memoryInfo);
            return memoryInfo.availMem;
        } catch (Exception e) {
            return 0L;
        }
    }

    public static int db(Context context) {
        if (((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(512L)) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((BatteryManager) context.getApplicationContext().getSystemService("batterymanager")).getIntProperty(4);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public static long dc(Context context) {
        long j = aKq;
        if (j > 0) {
            return j;
        }
        if (context == null) {
            return 0L;
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getApplicationContext().getSystemService(TTDownloadField.TT_ACTIVITY)).getMemoryInfo(memoryInfo);
            long j2 = memoryInfo.totalMem;
            if (j2 <= 0) {
                j2 = JB();
            }
            aKq = j2;
            return j2;
        } catch (Exception e) {
            return 0L;
        }
    }

    private static synchronized String dd(Context context) {
        synchronized (be.class) {
            if (at.IV() && !TextUtils.isEmpty(at.IW())) {
                return at.IW();
            } else if (aKj) {
                return aJW;
            } else {
                if (TextUtils.isEmpty(aJW) && context != null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        return aJW;
                    } else if (at.IV()) {
                        return aJW;
                    } else if (!o.HZ()) {
                        return aJW;
                    } else {
                        boolean z = false;
                        try {
                            z = SystemUtil.cZ(context);
                            if (z) {
                                String deviceId = ((TelephonyManager) context.getSystemService(PlaceFields.PHONE)).getDeviceId();
                                aJW = deviceId;
                                if (TextUtils.isEmpty(deviceId)) {
                                    aKj = true;
                                }
                            }
                        } catch (Exception e) {
                            com.kwad.sdk.core.e.c.printStackTrace(e);
                            if (z) {
                                aKj = true;
                            }
                        }
                        return aJW;
                    }
                }
                return aJW;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.String de(android.content.Context r5) {
        /*
            java.lang.Class<com.kwad.sdk.utils.be> r0 = com.kwad.sdk.utils.be.class
            monitor-enter(r0)
            boolean r1 = com.kwad.sdk.utils.be.aKo     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto Lb
            java.lang.String r5 = com.kwad.sdk.utils.be.aJX     // Catch: java.lang.Throwable -> L79
            monitor-exit(r0)
            return r5
        Lb:
            java.lang.String r1 = com.kwad.sdk.utils.be.aJX     // Catch: java.lang.Throwable -> L79
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L75
            if (r5 != 0) goto L16
            goto L75
        L16:
            boolean r1 = com.kwad.sdk.utils.at.IV()     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L20
            java.lang.String r5 = com.kwad.sdk.utils.be.aJX     // Catch: java.lang.Throwable -> L79
            monitor-exit(r0)
            return r5
        L20:
            boolean r1 = com.kwad.sdk.utils.o.HY()     // Catch: java.lang.Throwable -> L79
            if (r1 != 0) goto L2a
            java.lang.String r5 = com.kwad.sdk.utils.be.aKf     // Catch: java.lang.Throwable -> L79
            monitor-exit(r0)
            return r5
        L2a:
            r1 = 0
            r2 = 1
            boolean r1 = com.kwad.sdk.utils.SystemUtil.cZ(r5)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L79
            if (r1 == 0) goto L71
            java.lang.String r3 = "phone"
            java.lang.Object r5 = r5.getSystemService(r3)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L79
            android.telephony.TelephonyManager r5 = (android.telephony.TelephonyManager) r5     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L79
            if (r5 == 0) goto L71
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L79
            r4 = 26
            if (r3 < r4) goto L51
            java.lang.String r5 = r5.getMeid()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L79
            com.kwad.sdk.utils.be.aJX = r5     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L79
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L79
            if (r5 == 0) goto L71
        L4e:
            com.kwad.sdk.utils.be.aKo = r2     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L79
            goto L71
        L51:
            int r3 = r5.getPhoneType()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L79
            r4 = 2
            if (r3 != r4) goto L65
            java.lang.String r5 = r5.getDeviceId()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L79
            com.kwad.sdk.utils.be.aJX = r5     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L79
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L79
            if (r5 == 0) goto L71
            goto L4e
        L65:
            r5 = 0
            com.kwad.sdk.utils.be.aJX = r5     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L79
            goto L4e
        L69:
            r5 = move-exception
            com.kwad.sdk.core.e.c.printStackTrace(r5)     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L71
            com.kwad.sdk.utils.be.aKo = r2     // Catch: java.lang.Throwable -> L79
        L71:
            java.lang.String r5 = com.kwad.sdk.utils.be.aJX     // Catch: java.lang.Throwable -> L79
            monitor-exit(r0)
            return r5
        L75:
            java.lang.String r5 = com.kwad.sdk.utils.be.aJX     // Catch: java.lang.Throwable -> L79
            monitor-exit(r0)
            return r5
        L79:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.be.de(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x008c, code lost:
        if (android.text.TextUtils.isEmpty(r10[1]) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.String[] df(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.be.df(android.content.Context):java.lang.String[]");
    }

    public static synchronized int dg(Context context) {
        synchronized (be.class) {
            if (aJZ || aJY > 0 || Build.VERSION.SDK_INT < 23 || context == null || at.IV()) {
                return aJY;
            }
            try {
                aJY = ((TelephonyManager) context.getSystemService(PlaceFields.PHONE)).getPhoneCount();
            } catch (Exception e) {
            }
            int i = aJY;
            aJZ = i == 0;
            return i;
        }
    }

    public static int dh(Context context) {
        if (context == null || aKa > 0 || aKb || Build.VERSION.SDK_INT < 22 || !SystemUtil.cZ(context) || at.IV()) {
            return aKa;
        }
        try {
            aKa = ((SubscriptionManager) context.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoCount();
        } catch (Throwable th) {
        }
        int i = aKa;
        aKb = i != 0;
        return i;
    }

    public static String di(Context context) {
        if (!TextUtils.isEmpty(aKe) || context == null) {
            return aKe;
        }
        if (!aKl && !at.IV() && o.Ib()) {
            try {
                if (SystemUtil.cZ(context)) {
                    aKe = ((TelephonyManager) context.getApplicationContext().getSystemService(PlaceFields.PHONE)).getSimSerialNumber();
                }
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
                aKe = null;
            }
            if (TextUtils.isEmpty(aKe)) {
                aKl = true;
            }
            String str = TextUtils.isEmpty(aKe) ? "" : aKe;
            aKe = str;
            return str;
        }
        return aKe;
    }

    public static synchronized int dj(Context context) {
        int ringerMode;
        synchronized (be.class) {
            ringerMode = ((AudioManager) context.getSystemService("audio")).getRingerMode();
        }
        return ringerMode;
    }

    private static boolean dk(Context context) {
        return (context == null || context.getResources() == null || context.getResources().getConfiguration() == null || (context.getResources().getConfiguration().screenLayout & 15) < 3) ? false : true;
    }

    public static synchronized String dl(Context context) {
        synchronized (be.class) {
            if (TextUtils.isEmpty(aJU) && context != null && !aJV) {
                if (at.IZ()) {
                    String Ja = at.Ja();
                    aJU = Ja;
                    return Ja;
                } else if (!o.HV()) {
                    return aJU;
                } else {
                    try {
                        WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
                        if (connectionInfo != null) {
                            aJU = connectionInfo.getMacAddress();
                        }
                        if (fM(aJU)) {
                            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                NetworkInterface networkInterface = (NetworkInterface) it.next();
                                if (networkInterface != null && "wlan0".equals(networkInterface.getName())) {
                                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                                    if (hardwareAddress != null && hardwareAddress.length != 0) {
                                        StringBuilder sb = new StringBuilder();
                                        int length = hardwareAddress.length;
                                        for (int i = 0; i < length; i++) {
                                            sb.append(String.format("%02X:", Byte.valueOf(hardwareAddress[i])));
                                        }
                                        if (sb.length() > 0) {
                                            sb.deleteCharAt(sb.length() - 1);
                                        }
                                        aJU = sb.toString();
                                    }
                                }
                            }
                        }
                        if (fM(aJU)) {
                            aJU = com.kwad.sdk.crash.utils.h.c(Runtime.getRuntime().exec("cat /sys/class/net/wlan0/address ").getInputStream());
                        }
                        if (!fM(aJU)) {
                            aJU = aJU.toUpperCase(Locale.US);
                        }
                    } catch (Exception e) {
                        aJV = true;
                    }
                    aJV = fM(aJU);
                    return aJU;
                }
            }
            return aJU;
        }
    }

    public static List<String> dm(Context context) {
        String[] list;
        if (!c.bH(context) && dn(context)) {
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data");
            if (file.exists() && file.isDirectory() && (list = file.list()) != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    if (!TextUtils.isEmpty(str) && !str.startsWith(".")) {
                        arrayList.add(str);
                    }
                }
                return arrayList;
            }
            return null;
        }
        return new ArrayList();
    }

    public static boolean dn(Context context) {
        return context.checkCallingOrSelfPermission(com.kuaishou.weapon.p0.g.j) == 0;
    }

    private static boolean fM(String str) {
        return TextUtils.isEmpty(str) || str.equals("02:00:00:00:00:00");
    }

    private static boolean fN(String str) {
        return aKt.contains(str.toLowerCase(Locale.US));
    }

    private static boolean fO(String str) {
        for (int i = 0; i < str.length(); i++) {
            try {
                if (str.charAt(i) != '0') {
                    return true;
                }
            } catch (Throwable th) {
            }
        }
        return false;
    }

    private static void fP(String str) {
        if (((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext() == null) {
            return;
        }
        y.a("ksadsdk_pref", "android_id", str, true);
    }

    public static String fQ(String str) {
        String valueOf;
        if (!TextUtils.isEmpty(aKs) || TextUtils.isEmpty(str)) {
            return aKs;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                StructStat stat = Os.stat(str);
                if (stat == null) {
                    return aKs;
                }
                String str2 = "";
                if (Build.VERSION.SDK_INT >= 27) {
                    if (stat.st_atim == null) {
                        valueOf = "";
                    } else {
                        str2 = String.valueOf(stat.st_atim.tv_sec);
                        valueOf = String.valueOf(stat.st_atim.tv_nsec);
                    }
                    aKs = str2 + "." + valueOf;
                } else {
                    if (stat.st_atime != 0) {
                        str2 = String.valueOf(stat.st_atime);
                    }
                    aKs = str2;
                }
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            }
        }
        return aKs;
    }

    public static String getDeviceId() {
        try {
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
        }
        if (TextUtils.isEmpty(aKg)) {
            String JW = JW();
            if (!TextUtils.isEmpty(JW)) {
                String str = "ANDROID_" + JW;
                aKg = str;
                return str;
            }
            String cx = cx(((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext());
            if (!TextUtils.isEmpty(cx) && !fN(cx) && fO(cx)) {
                String str2 = "ANDROID_" + cx;
                aKg = str2;
                return str2;
            }
            String JV = JV();
            if (!TextUtils.isEmpty(JV)) {
                aKg = "ANDROID_" + JV;
                fP(JV);
                return aKg;
            }
            return "ANDROID_";
        }
        return aKg;
    }

    public static String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String getLocale() {
        Locale locale = Build.VERSION.SDK_INT >= 24 ? LocaleList.getDefault().get(0) : Locale.getDefault();
        if (locale == null) {
            locale = Locale.CHINESE;
        }
        return String.valueOf(locale);
    }

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static int getScreenHeight(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception e) {
            return 0;
        }
    }

    public static int getScreenWidth(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        } catch (Exception e) {
            return 0;
        }
    }

    public static String u(Context context, boolean z) {
        if (!at.IV() || TextUtils.isEmpty(at.IW())) {
            String dd = dd(context);
            return (TextUtils.isEmpty(dd) && !z && TextUtils.isEmpty(com.kwad.sdk.core.f.a.bc(context))) ? ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).xx() : dd;
        }
        return at.IW();
    }
}
