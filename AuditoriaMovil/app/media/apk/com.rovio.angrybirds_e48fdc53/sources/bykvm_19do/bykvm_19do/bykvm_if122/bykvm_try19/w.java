package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class w {
    private static volatile String a;
    private static volatile String b;
    private static volatile String c;
    private static volatile String d;
    private static volatile String e;
    private static volatile String f;
    private static volatile String g;
    private static volatile String h;
    private static volatile String i;
    private static final AtomicInteger j = new AtomicInteger(0);

    private static String a() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (e0.t()) {
            str = "MIUI-";
        } else if (!e0.q()) {
            String f2 = e0.f();
            if (e0.d(f2)) {
                sb.append("EMUI-");
            }
            if (!TextUtils.isEmpty(f2)) {
                sb.append(f2);
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

    public static String a(Context context) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUseAndroidId()) {
            if (TextUtils.isEmpty(b)) {
                synchronized (w.class) {
                    if (TextUtils.isEmpty(b)) {
                        n(context);
                    }
                }
            }
            return b;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r2.length() >= 13) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r6, boolean r7) {
        /*
            java.lang.String r0 = "openudid"
            android.content.Context r6 = c(r6)
            r1 = 0
            if (r6 != 0) goto Lb
            goto L8c
        Lb:
            android.content.ContentResolver r2 = r6.getContentResolver()     // Catch: java.lang.Exception -> L16
            java.lang.String r3 = "android_id"
            java.lang.String r2 = android.provider.Settings.Secure.getString(r2, r3)     // Catch: java.lang.Exception -> L16
            goto L18
        L16:
            r2 = move-exception
            r2 = r1
        L18:
            r3 = 13
            if (r2 == 0) goto L2a
            java.lang.String r4 = "9774d56d682e549c"
            boolean r4 = r2.equals(r4)     // Catch: java.lang.Exception -> L8a
            if (r4 != 0) goto L2a
            int r4 = r2.length()     // Catch: java.lang.Exception -> L8a
            if (r4 >= r3) goto L8b
        L2a:
            java.lang.String r4 = "tt_device_info"
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0 r6 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0.a(r4, r6)     // Catch: java.lang.Exception -> L8a
            java.lang.String r1 = r6.a(r0, r1)     // Catch: java.lang.Exception -> L8a
            boolean r4 = a(r1)     // Catch: java.lang.Exception -> L8a
            if (r4 != 0) goto L8c
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch: java.lang.Exception -> L8a
            r1.<init>()     // Catch: java.lang.Exception -> L8a
            java.math.BigInteger r4 = new java.math.BigInteger     // Catch: java.lang.Exception -> L8a
            r5 = 64
            r4.<init>(r5, r1)     // Catch: java.lang.Exception -> L8a
            r1 = 16
            java.lang.String r1 = r4.toString(r1)     // Catch: java.lang.Exception -> L8a
            r4 = 0
            char r4 = r1.charAt(r4)     // Catch: java.lang.Exception -> L8a
            r5 = 45
            if (r4 != r5) goto L5a
            r4 = 1
            java.lang.String r1 = r1.substring(r4)     // Catch: java.lang.Exception -> L8a
        L5a:
            int r4 = r1.length()     // Catch: java.lang.Exception -> L8a
            int r3 = r3 - r4
            if (r3 <= 0) goto L77
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8a
            r4.<init>()     // Catch: java.lang.Exception -> L8a
        L66:
            if (r3 <= 0) goto L70
            r5 = 70
            r4.append(r5)     // Catch: java.lang.Exception -> L8a
            int r3 = r3 + (-1)
            goto L66
        L70:
            r4.append(r1)     // Catch: java.lang.Exception -> L8a
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L8a
        L77:
            if (r7 == 0) goto L86
            java.lang.String r7 = "openudid.dat"
            java.lang.String r7 = a(r7, r1)     // Catch: java.lang.Exception -> L8a
            boolean r3 = a(r7)     // Catch: java.lang.Exception -> L8a
            if (r3 == 0) goto L86
            r1 = r7
        L86:
            r6.b(r0, r1)     // Catch: java.lang.Exception -> L8a
            goto L8c
        L8a:
            r6 = move-exception
        L8b:
            r1 = r2
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.w.a(android.content.Context, boolean):java.lang.String");
    }

    private static String a(WifiManager wifiManager, Context context) {
        String str = "02:00:00:00:00:00";
        if (wifiManager != null && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUseLocation() && k(context)) {
            try {
                List<ScanResult> scanResults = wifiManager.getScanResults();
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                if (scanResults != null && connectionInfo != null && connectionInfo.getBSSID() != null) {
                    for (int i2 = 0; i2 < scanResults.size(); i2++) {
                        ScanResult scanResult = scanResults.get(i2);
                        if (connectionInfo.getBSSID().equals(scanResult.BSSID)) {
                            str = scanResult.BSSID;
                        }
                    }
                }
            } catch (Exception e2) {
            }
        }
        return str;
    }

    private static String a(String str, String str2) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        File file;
        byte[] bArr;
        int read;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            String str3 = Environment.getExternalStorageDirectory().getPath() + "/Android/data/com.snssdk.api/cache";
            String str4 = str3 + "/" + str;
            FileLock fileLock = null;
            try {
                file = new File(str3);
            } catch (Exception e2) {
                randomAccessFile2 = null;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = null;
            }
            if (file.exists() || file.mkdirs()) {
                File file2 = new File(str4);
                randomAccessFile2 = new RandomAccessFile(file2, "rwd");
                try {
                    try {
                        fileLock = randomAccessFile2.getChannel().lock();
                        if (file2.isFile() && (read = randomAccessFile2.read((bArr = new byte[129]), 0, 129)) > 0 && read < 129) {
                            String str5 = new String(bArr, 0, read, "UTF-8");
                            if (a(str5)) {
                                if (fileLock != null) {
                                    try {
                                        fileLock.release();
                                    } catch (Exception e3) {
                                    }
                                }
                                try {
                                    randomAccessFile2.close();
                                } catch (Exception e4) {
                                }
                                return str5;
                            }
                        }
                        byte[] bytes = str2.getBytes("UTF-8");
                        randomAccessFile2.setLength(0L);
                        randomAccessFile2.write(bytes);
                        if (fileLock != null) {
                            try {
                                fileLock.release();
                            } catch (Exception e5) {
                            }
                        }
                    } catch (Exception e6) {
                        if (fileLock != null) {
                            try {
                                fileLock.release();
                            } catch (Exception e7) {
                            }
                        }
                        if (randomAccessFile2 == null) {
                            return str2;
                        }
                        randomAccessFile2.close();
                        return str2;
                    } catch (Throwable th2) {
                        randomAccessFile = randomAccessFile2;
                        th = th2;
                        if (fileLock != null) {
                            try {
                                fileLock.release();
                            } catch (Exception e8) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (Exception e9) {
                            }
                        }
                        throw th;
                    }
                    randomAccessFile2.close();
                    return str2;
                } catch (Exception e10) {
                    return str2;
                }
            }
            return str2;
        }
        return str2;
    }

    public static void a(Context context, String str) {
        synchronized (w.class) {
            if (!TextUtils.isEmpty(str) && !str.equals(a)) {
                f0.a("tt_device_info", context).b("did", str);
                a = str;
            }
        }
    }

    private static boolean a(String str) {
        int length;
        if (str != null && (length = str.length()) >= 13 && length <= 128) {
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && ((charAt < 'A' || charAt > 'F') && charAt != '-'))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static String b(Context context) {
        if (TextUtils.isEmpty(g)) {
            synchronized (w.class) {
                if (TextUtils.isEmpty(g)) {
                    b();
                }
            }
        }
        return g;
    }

    private static void b() {
        synchronized (w.class) {
            g = String.valueOf(Build.TIME);
        }
    }

    private static Context c(Context context) {
        return context == null ? bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d() : context;
    }

    private static void c() {
        synchronized (w.class) {
            a();
        }
    }

    public static String d(Context context) {
        if (TextUtils.isEmpty(a)) {
            synchronized (w.class) {
                if (TextUtils.isEmpty(a)) {
                    p(context);
                }
            }
        }
        return a;
    }

    public static String e(Context context) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUsePhoneState()) {
            if (TextUtils.isEmpty(c)) {
                synchronized (w.class) {
                    if (TextUtils.isEmpty(c)) {
                        s(context);
                    }
                }
            }
            return c;
        }
        return null;
    }

    public static String f(Context context) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUsePhoneState()) {
            if (TextUtils.isEmpty(f)) {
                synchronized (w.class) {
                    if (TextUtils.isEmpty(f)) {
                        s(context);
                    }
                }
            }
            return f;
        }
        return null;
    }

    public static String g(Context context) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUseLocation()) {
            if (TextUtils.isEmpty(d)) {
                synchronized (w.class) {
                    if (TextUtils.isEmpty(d)) {
                        r(context);
                    }
                }
            }
            return d;
        }
        return null;
    }

    public static String h(Context context) {
        if (TextUtils.isEmpty(h)) {
            synchronized (w.class) {
                if (TextUtils.isEmpty(h)) {
                    q(context);
                }
            }
        }
        return h;
    }

    public static String i(Context context) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUseLocation()) {
            if (TextUtils.isEmpty(e)) {
                synchronized (w.class) {
                    if (TextUtils.isEmpty(e)) {
                        r(context);
                    }
                }
            }
            return e;
        }
        return null;
    }

    public static String j(Context context) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUsePhoneState()) {
            if (TextUtils.isEmpty(i)) {
                synchronized (w.class) {
                    if (TextUtils.isEmpty(i)) {
                        o(context);
                    }
                }
            }
            return i;
        }
        return null;
    }

    private static boolean k(Context context) {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108.c.a(context, com.kuaishou.weapon.p0.g.g) == 0 || bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108.c.a(context, com.kuaishou.weapon.p0.g.h) == 0;
    }

    private static boolean l(Context context) {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108.c.a(context, com.kuaishou.weapon.p0.g.c) == 0;
    }

    public static void m(Context context) {
        synchronized (w.class) {
            Context c2 = c(context);
            if (c2 != null) {
                s(c2);
                r(context);
                o(context);
                n(context);
                p(context);
                c();
                b();
                q(context);
            }
        }
    }

    private static void n(Context context) {
        synchronized (w.class) {
            if (context != null) {
                if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUseAndroidId()) {
                    b = a(context, true);
                }
            }
        }
    }

    private static void o(Context context) {
        synchronized (w.class) {
            if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUsePhoneState() && l(context)) {
                try {
                    i = Build.VERSION.SDK_INT >= 28 ? Build.getSerial() : Build.SERIAL;
                } catch (Exception e2) {
                }
            }
        }
    }

    private static void p(Context context) {
        synchronized (w.class) {
            if (context != null) {
                a = q.c();
                if (TextUtils.isEmpty(a)) {
                    a = f0.a("tt_device_info", context).a("did", (String) null);
                } else {
                    a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), a);
                }
            }
        }
    }

    private static void q(Context context) {
        synchronized (w.class) {
            if (context != null) {
                h = f0.a("tt_device_info", context).a("uuid", (String) null);
            }
        }
    }

    private static void r(Context context) {
        WifiInfo connectionInfo;
        synchronized (w.class) {
            if (context != null) {
                try {
                    WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                    if (wifiManager != null) {
                        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUseLocation() && k(context) && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                            d = connectionInfo.getSSID();
                        }
                        e = a(wifiManager, context);
                    }
                } catch (Exception e2) {
                }
            }
        }
    }

    private static void s(Context context) {
        synchronized (w.class) {
            AtomicInteger atomicInteger = j;
            if (atomicInteger.intValue() <= 5 && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUsePhoneState() && l(context)) {
                try {
                    atomicInteger.incrementAndGet();
                    TelephonyManager a2 = c0.a();
                    if (a2 != null) {
                        c = a2.getDeviceId();
                        f = a2.getSubscriberId();
                    }
                } catch (Exception e2) {
                }
            }
        }
    }

    public static void t(Context context) {
        Context c2;
        synchronized (w.class) {
            if (TextUtils.isEmpty(c) && (c2 = c(context)) != null) {
                try {
                    s(c2);
                } catch (Exception e2) {
                }
            }
        }
    }
}
