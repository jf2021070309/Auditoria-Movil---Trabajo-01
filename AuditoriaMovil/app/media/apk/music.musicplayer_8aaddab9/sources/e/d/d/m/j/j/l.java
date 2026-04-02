package e.d.d.m.j.j;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
/* loaded from: classes.dex */
public class l {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    public static long f7184b = -1;

    /* loaded from: classes2.dex */
    public enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, a> matcher;

        static {
            a aVar = X86_32;
            a aVar2 = ARMV6;
            a aVar3 = ARMV7;
            a aVar4 = ARM64;
            HashMap hashMap = new HashMap(4);
            matcher = hashMap;
            hashMap.put("armeabi-v7a", aVar3);
            hashMap.put("armeabi", aVar2);
            hashMap.put("arm64-v8a", aVar4);
            hashMap.put("x86", aVar);
        }

        public static a getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                e.d.d.m.j.f.a.a(2);
                return UNKNOWN;
            }
            a aVar = matcher.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                if (e.d.d.m.j.f.a.a(6)) {
                    Log.e("FirebaseCrashlytics", str, e2);
                }
            }
        }
    }

    public static long b(String str, String str2, int i2) {
        return Long.parseLong(str.split(str2)[0].trim()) * i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        r2 = r3[1];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L5d
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
        L15:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L57
            if (r3 == 0) goto L53
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L57
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L57
            int r4 = r3.length     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L57
            r5 = 1
            if (r4 <= r5) goto L15
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L57
            boolean r4 = r4.equals(r7)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L57
            if (r4 == 0) goto L15
            r6 = r3[r5]     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L57
            r2 = r6
            goto L53
        L37:
            r7 = move-exception
            goto L3d
        L39:
            r6 = move-exception
            goto L59
        L3b:
            r7 = move-exception
            r1 = r2
        L3d:
            e.d.d.m.j.f r3 = e.d.d.m.j.f.a     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r4.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch: java.lang.Throwable -> L57
            r4.append(r6)     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L57
            r3.c(r6, r7)     // Catch: java.lang.Throwable -> L57
        L53:
            a(r1, r0)
            goto L5d
        L57:
            r6 = move-exception
            r2 = r1
        L59:
            a(r2, r0)
            throw r6
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.d.m.j.j.l.c(java.io.File, java.lang.String):java.lang.String");
    }

    public static boolean d(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int g2 = g(context, str, "bool");
            if (g2 > 0) {
                return resources.getBoolean(g2);
            }
            int g3 = g(context, str, "string");
            if (g3 > 0) {
                return Boolean.parseBoolean(context.getString(g3));
            }
        }
        return z;
    }

    public static int e(Context context) {
        boolean z = true;
        int i2 = k(context) ? 1 : 0;
        if (l(context)) {
            i2 |= 2;
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            z = false;
        }
        return z ? i2 | 4 : i2;
    }

    public static String f(Context context) {
        int g2 = g(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (g2 == 0) {
            g2 = g(context, "com.crashlytics.android.build_id", "string");
        }
        if (g2 != 0) {
            return context.getResources().getString(g2);
        }
        return null;
    }

    public static int g(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i2);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static SharedPreferences h(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static synchronized long i() {
        long j2;
        synchronized (l.class) {
            if (f7184b == -1) {
                long j3 = 0;
                String c2 = c(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(c2)) {
                    String upperCase = c2.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j3 = b(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j3 = b(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j3 = b(upperCase, "GB", 1073741824);
                        } else {
                            e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
                            fVar.d("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e2) {
                        e.d.d.m.j.f fVar2 = e.d.d.m.j.f.a;
                        fVar2.c("Unexpected meminfo format while computing RAM: " + upperCase, e2);
                    }
                }
                f7184b = j3;
            }
            j2 = f7184b;
        }
        return j2;
    }

    public static String j(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            char[] cArr2 = a;
            cArr[i4] = cArr2[i3 >>> 4];
            cArr[i4 + 1] = cArr2[i3 & 15];
        }
        return new String(cArr);
    }

    public static boolean k(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu") && string != null) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(Context context) {
        boolean k2 = k(context);
        String str = Build.TAGS;
        if ((k2 || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !k2 && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static String m(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return j(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
            fVar.c("Could not create hashing algorithm: SHA-1, returning empty string.", e2);
            return "";
        }
    }

    public static String n(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }
}
