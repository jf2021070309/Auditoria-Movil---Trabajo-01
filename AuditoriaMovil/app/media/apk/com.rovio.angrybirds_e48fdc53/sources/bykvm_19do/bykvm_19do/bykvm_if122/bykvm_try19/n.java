package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.UIUtils;
import com.ss.android.download.api.constant.BaseConstants;
import com.umeng.analytics.pro.bg;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class n {
    private static String a = null;
    private static long b = -1;
    private static int c = 1;
    private static String d = null;
    private static long e = -1;

    public static String a() {
        int i;
        String str;
        if (b == -1) {
            a = a(true);
            str = "--==-- 获取ip，真实获取";
        } else if (SystemClock.elapsedRealtime() - b <= 1800000) {
            if (TextUtils.isEmpty(a) && (i = c) < 9) {
                c = i + 1;
                a = a(true);
                str = "--==-- 获取ip，30min内，ip是空，重试第" + c + "次，真实获取";
            }
            return a;
        } else {
            a = a(true);
            c = 0;
            str = "--==-- 获取ip，大于30min了，真实获取";
        }
        Logger.d("TTMediationSDK", str);
        return a;
    }

    private static String a(int i) {
        return i != 120 ? i != 240 ? i != 320 ? i != 480 ? i != 640 ? "mdpi" : "xxxhdpi" : "xxhdpi" : "xhdpi" : "hdpi" : "ldpi";
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014 A[Catch: Exception -> 0x0061, TryCatch #0 {Exception -> 0x0061, blocks: (B:3:0x0002, B:4:0x000e, B:6:0x0014, B:8:0x001c, B:10:0x0026, B:13:0x002d, B:16:0x0038, B:17:0x004e, B:19:0x0054, B:20:0x005c), top: B:24:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.lang.String r8) {
        /*
            java.lang.String r0 = ""
            java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Exception -> L61
            java.util.ArrayList r1 = java.util.Collections.list(r1)     // Catch: java.lang.Exception -> L61
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L61
        Le:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L61
            if (r2 == 0) goto L62
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L61
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch: java.lang.Exception -> L61
            if (r8 == 0) goto L26
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Exception -> L61
            boolean r3 = r3.equalsIgnoreCase(r8)     // Catch: java.lang.Exception -> L61
            if (r3 == 0) goto Le
        L26:
            byte[] r8 = r2.getHardwareAddress()     // Catch: java.lang.Exception -> L61
            if (r8 != 0) goto L2d
            goto L62
        L2d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L61
            r1.<init>()     // Catch: java.lang.Exception -> L61
            int r2 = r8.length     // Catch: java.lang.Exception -> L61
            r3 = 0
            r4 = r3
        L35:
            r5 = 1
            if (r4 >= r2) goto L4e
            java.lang.String r6 = "%02X:"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L61
            r7 = r8[r4]     // Catch: java.lang.Exception -> L61
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch: java.lang.Exception -> L61
            r5[r3] = r7     // Catch: java.lang.Exception -> L61
            java.lang.String r5 = java.lang.String.format(r6, r5)     // Catch: java.lang.Exception -> L61
            r1.append(r5)     // Catch: java.lang.Exception -> L61
            int r4 = r4 + 1
            goto L35
        L4e:
            int r8 = r1.length()     // Catch: java.lang.Exception -> L61
            if (r8 <= 0) goto L5c
            int r8 = r1.length()     // Catch: java.lang.Exception -> L61
            int r8 = r8 - r5
            r1.deleteCharAt(r8)     // Catch: java.lang.Exception -> L61
        L5c:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L61
            goto L62
        L61:
            r8 = move-exception
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.n.a(java.lang.String):java.lang.String");
    }

    private static String a(boolean z) {
        b = SystemClock.elapsedRealtime();
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        boolean z2 = inetAddress instanceof Inet4Address;
                        String upperCase = inetAddress.getHostAddress().toUpperCase();
                        if (z) {
                            if (z2) {
                                return upperCase;
                            }
                        } else if (!z2) {
                            int indexOf = upperCase.indexOf(37);
                            return indexOf >= 0 ? upperCase.substring(0, indexOf) : upperCase;
                        }
                    }
                }
            }
        } catch (Exception e2) {
        }
        return "";
    }

    public static JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("imei", w.e(context));
            jSONObject.put("android_id", w.a(context));
            jSONObject.put("uuid", w.h(context));
            jSONObject.put("ssid", w.g(context));
            jSONObject.put("wifi_mac", w.i(context));
            jSONObject.put("imsi", w.f(context));
            jSONObject.put("power_on_time", SystemClock.elapsedRealtime() + "");
            jSONObject.put("rom_version", e0.k());
            jSONObject.put("sys_compiling_time", w.b(context));
            jSONObject.put("type", c(context));
            jSONObject.put(bg.x, 1);
            jSONObject.put(bg.y, Build.VERSION.RELEASE + "");
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put(bg.N, Locale.getDefault().getLanguage());
            jSONObject.put("conn_type", z.c(context));
            jSONObject.put("mac", c());
            jSONObject.put("screen_width", UIUtils.getScreenWidth(context));
            jSONObject.put("screen_height", UIUtils.getScreenHeight(context));
            jSONObject.put("oaid", a0.a());
        } catch (Throwable th) {
        }
        return jSONObject;
    }

    public static String b() {
        if (Build.VERSION.SDK_INT >= 21) {
            String languageTag = Locale.getDefault().toLanguageTag();
            return !TextUtils.isEmpty(languageTag) ? languageTag : "";
        }
        return Locale.getDefault().getLanguage();
    }

    private static String b(String str) {
        String[] split = str.split(",");
        return (split == null || split.length <= 0 || TextUtils.isEmpty(split[0])) ? "127.0.0.1" : split[0].trim();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public static org.json.JSONObject b(android.content.Context r4) {
        /*
            r0 = 55
            r1 = 0
        L3:
            r2 = 72
        L5:
            switch(r2) {
                case 72: goto Ld0;
                case 73: goto L18;
                case 74: goto L9;
                default: goto L8;
            }
        L8:
            goto L3
        L9:
            r2 = 53
            if (r1 == r2) goto L12
            r2 = 54
            if (r1 == r2) goto Ld0
            goto L3
        L12:
            switch(r0) {
                case 29: goto L1c;
                case 30: goto L3;
                case 31: goto L9;
                default: goto L15;
            }
        L15:
            r0 = 30
            goto L12
        L18:
            r2 = 57
            if (r1 > r2) goto L3
        L1c:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "os"
            r2 = 1
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "imei"
            java.lang.String r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.w.e(r4)     // Catch: java.lang.Throwable -> Lce
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "imei_md5"
            java.lang.String r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.w.e(r4)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.y.a(r2)     // Catch: java.lang.Throwable -> Lce
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            r1.<init>()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r2 = "IdUtils.getImei(context)"
            java.lang.String r3 = "IdUtils.getImei(context)="
            r1.append(r3)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.w.e(r4)     // Catch: java.lang.Throwable -> Lce
            r1.append(r3)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lce
            com.bytedance.msdk.adapter.util.Logger.d(r2, r1)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "gaid"
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.h r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.h.c()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r2 = r2.a()     // Catch: java.lang.Throwable -> Lce
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "oaid"
            java.lang.String r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a0.a()     // Catch: java.lang.Throwable -> Lce
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "applog_did"
            java.lang.String r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.w.d(r4)     // Catch: java.lang.Throwable -> Lce
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "device_model"
            java.lang.String r2 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> Lce
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "vendor"
            java.lang.String r2 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> Lce
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "ua"
            java.lang.String r2 = j()     // Catch: java.lang.Throwable -> Lce
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "ip"
            java.lang.String r2 = a()     // Catch: java.lang.Throwable -> Lce
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "package_name"
            java.lang.String r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.n0.a()     // Catch: java.lang.Throwable -> Lce
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "publisher_did"
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r2 = r2.t()     // Catch: java.lang.Throwable -> Lce
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "android_id"
            java.lang.String r4 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.w.a(r4)     // Catch: java.lang.Throwable -> Lce
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            r4.<init>()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "os_version"
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> Lce
            r4.append(r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r2 = ""
            r4.append(r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lce
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> Lce
            goto Lcf
        Lce:
            r4 = move-exception
        Lcf:
            return r0
        Ld0:
            r1 = 16
            r2 = 73
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.n.b(android.content.Context):org.json.JSONObject");
    }

    public static int c(Context context) {
        if (e(context)) {
            return 3;
        }
        return d(context) ? 2 : 1;
    }

    public static String c() {
        if (e == -1 || (SystemClock.elapsedRealtime() - e > 1800000 && TextUtils.isEmpty(d))) {
            d = d();
            Logger.d("TTMediationSDK", "--==-- 获取mac，真实获取");
        }
        return d;
    }

    private static String d() {
        e = SystemClock.elapsedRealtime();
        String a2 = a("wlan0");
        if (TextUtils.isEmpty(a2)) {
            a2 = a("eth0");
        }
        return TextUtils.isEmpty(a2) ? "DU:MM:YA:DD:RE:SS" : a2;
    }

    public static boolean d(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    private static String e() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (e0.t()) {
            str = "MIUI-";
        } else if (!e0.q()) {
            String f = e0.f();
            if (e0.d(f)) {
                sb.append("EMUI-");
            }
            if (!TextUtils.isEmpty(f)) {
                sb.append(f);
                str = "-";
            }
            sb.append(Build.VERSION.INCREMENTAL);
            return sb.toString();
        } else {
            str = "FLYME-";
        }
        sb.append(str);
        sb.append(Build.VERSION.INCREMENTAL);
        return sb.toString();
    }

    public static boolean e(Context context) {
        return (context.getResources().getConfiguration().uiMode & 15) == 4;
    }

    private static int f() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / BaseConstants.Time.HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static long g() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            long parseLong = Long.parseLong(bufferedReader.readLine().split("\\s+")[1]);
            bufferedReader.close();
            return parseLong * 1024;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1L;
        }
    }

    public static long h() {
        if (k()) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        }
        return -1L;
    }

    public static JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        Context d2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d();
        try {
            jSONObject.put("device_id", w.d(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()));
            jSONObject.put("user_unique_id", w.d(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()) != null ? w.d(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()) : UUID.randomUUID().toString());
            jSONObject.put("sdk_version", "4.2.0.2");
            jSONObject.put(bg.x, "Android");
            jSONObject.put(bg.y, Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put(bg.z, UIUtils.getScreenHeight(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()) + "x" + UIUtils.getScreenWidth(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()));
            jSONObject.put(bg.N, Locale.getDefault().getLanguage());
            jSONObject.put(bg.M, f());
            jSONObject.put(bg.Q, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.e.c(d2));
            jSONObject.put("openudid", w.a(d2));
            jSONObject.put("aid", "5685");
            jSONObject.put(bg.s, i.b());
            jSONObject.put("app_version", i.a());
            jSONObject.put("package", n0.a());
            jSONObject.put("region", Locale.getDefault().getCountry());
            jSONObject.put("tz_name", Calendar.getInstance().getTimeZone().getID());
            jSONObject.put("tz_offset", Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()) / 1000);
            jSONObject.put("rom", e());
            jSONObject.put(bg.H, Build.MANUFACTURER);
            ArrayList<String> a2 = j.a(d2, "MD5");
            if (a2 != null && !a2.isEmpty()) {
                jSONObject.put("sig_hash", Build.MANUFACTURER);
            }
            jSONObject.put("display_density", a(UIUtils.getDensityDpi(d2)));
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("density_dpi", UIUtils.getDensityDpi(d2));
            jSONObject.put(bg.F, Build.BRAND);
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("build_serial", w.j(d2));
            jSONObject.put("version_code", n0.d());
            jSONObject.put("udid", w.e(d2));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("imei", w.e(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()));
            jSONObject2.put("imei_md5", y.a(w.e(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d())));
            jSONObject2.put("gaid", h.c().a());
            jSONObject2.put("applog_did", w.d(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()));
            jSONObject2.put("publisher_did", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().t());
            jSONObject2.put("android_id", w.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()));
            jSONObject2.put("oaid", a0.a());
            jSONObject.put("custom", jSONObject2);
            String a3 = a();
            if (TextUtils.isEmpty(a3)) {
                a3 = "127.0.0.1";
            } else if (a3.contains(",")) {
                a3 = b(a3);
            }
            jSONObject.put("ip", a3);
        } catch (Exception e2) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b.a("getUploadEventV3Header", "exception: " + e2.toString());
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static String j() {
        String str;
        try {
            str = System.getProperty("http.agent");
        } catch (Exception e2) {
            str = "unKnow";
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(";");
        if (lastIndexOf != -1 && str.length() > lastIndexOf) {
            int i = lastIndexOf + 1;
            String substring = str.substring(0, i);
            str = substring.concat(" " + Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry() + ";").concat(str.substring(i));
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static boolean k() {
        return "mounted".equals(Environment.getExternalStorageState());
    }
}
