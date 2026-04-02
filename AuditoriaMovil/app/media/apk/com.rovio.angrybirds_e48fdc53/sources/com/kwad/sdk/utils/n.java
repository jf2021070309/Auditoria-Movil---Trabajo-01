package com.kwad.sdk.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.kwad.sdk.service.ServiceProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
/* loaded from: classes3.dex */
public final class n {
    public static com.kwad.sdk.k.a.d aIo;

    /* loaded from: classes3.dex */
    static class a extends com.kwad.sdk.k.a.a {
        public a() {
            HT();
        }

        private void HT() {
            this.aGs = new ArrayList();
            this.aGs.add(new com.kwad.sdk.k.a.a(this.enabled) { // from class: com.kwad.sdk.utils.n.a.1
                @Override // com.kwad.sdk.k.a.a
                public final boolean bD(Context context) {
                    int i = (Build.PRODUCT.contains("sdk") || Build.PRODUCT.contains("Andy") || Build.PRODUCT.contains("ttVM_Hdragon") || Build.PRODUCT.contains("google_sdk") || Build.PRODUCT.contains("Droid4X") || Build.PRODUCT.contains("nox") || Build.PRODUCT.contains("sdk_x86") || Build.PRODUCT.contains("sdk_google") || Build.PRODUCT.contains("vbox86p") || Build.PRODUCT.contains("aries")) ? 1 : 0;
                    if (Build.MANUFACTURER.equals("unknown") || Build.MANUFACTURER.equals("Genymotion") || Build.MANUFACTURER.contains("Andy") || Build.MANUFACTURER.contains("MIT") || Build.MANUFACTURER.contains("nox") || Build.MANUFACTURER.contains("TiantianVM")) {
                        i++;
                    }
                    if (Build.BRAND.equals(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE) || Build.BRAND.equals("generic_x86") || Build.BRAND.equals("TTVM") || Build.BRAND.contains("Andy")) {
                        i++;
                    }
                    if (Build.DEVICE.contains(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE) || Build.DEVICE.contains("generic_x86") || Build.DEVICE.contains("Andy") || Build.DEVICE.contains("ttVM_Hdragon") || Build.DEVICE.contains("Droid4X") || Build.DEVICE.contains("nox") || Build.DEVICE.contains("generic_x86_64") || Build.DEVICE.contains("vbox86p") || Build.DEVICE.contains("aries")) {
                        i++;
                    }
                    if (Build.MODEL.equals("sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.equals("google_sdk") || Build.MODEL.contains("Droid4X") || Build.MODEL.contains("TiantianVM") || Build.MODEL.contains("Andy") || Build.MODEL.equals("Android SDK built for x86_64") || Build.MODEL.equals("Android SDK built for x86")) {
                        i++;
                    }
                    if (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("vbox86") || Build.HARDWARE.contains("nox") || Build.HARDWARE.contains("ttVM_x86")) {
                        i++;
                    }
                    if (Build.FINGERPRINT.contains("generic/sdk/generic") || Build.FINGERPRINT.contains("generic_x86/sdk_x86/generic_x86") || Build.FINGERPRINT.contains("Andy") || Build.FINGERPRINT.contains("ttVM_Hdragon") || Build.FINGERPRINT.contains("generic_x86_64") || Build.FINGERPRINT.contains("generic/google_sdk/generic") || Build.FINGERPRINT.contains("vbox86p") || Build.FINGERPRINT.contains("generic/vbox86p/vbox86p")) {
                        i++;
                    }
                    int i2 = i;
                    try {
                        if (new File(Environment.getExternalStorageDirectory().toString() + File.separatorChar + "windows" + File.separatorChar + "BstSharedFolder").exists()) {
                            i2 += 10;
                        }
                    } catch (Exception e) {
                    }
                    return i2 > 3;
                }
            });
            this.aGs.add(new com.kwad.sdk.k.a.a(this.enabled) { // from class: com.kwad.sdk.utils.n.a.2
                @Override // com.kwad.sdk.k.a.a
                public final boolean bD(Context context) {
                    return "1".equals(bd.get("ro.kernel.qemu"));
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    static class b extends com.kwad.sdk.k.a.a {
    }

    /* loaded from: classes3.dex */
    static class c extends com.kwad.sdk.k.a.a {
    }

    /* loaded from: classes3.dex */
    static class d extends com.kwad.sdk.k.a.a {
        public d() {
            HT();
        }

        private void HT() {
            this.aGs = new ArrayList();
            this.aGs.add(new com.kwad.sdk.k.a.a(this.enabled) { // from class: com.kwad.sdk.utils.n.d.1
                @Override // com.kwad.sdk.k.a.a
                public final boolean bD(Context context) {
                    return new File("/system/app/Superuser.apk").exists();
                }
            });
            this.aGs.add(new com.kwad.sdk.k.a.a(this.enabled) { // from class: com.kwad.sdk.utils.n.d.2
                @Override // com.kwad.sdk.k.a.a
                public final boolean bD(Context context) {
                    String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
                    for (int i = 0; i < 5; i++) {
                        if (new File(strArr[i] + com.kuaishou.weapon.p0.bh.y).exists()) {
                            return true;
                        }
                    }
                    return false;
                }
            });
            this.aGs.add(new com.kwad.sdk.k.a.a(this.enabled) { // from class: com.kwad.sdk.utils.n.d.3
                @Override // com.kwad.sdk.k.a.a
                public final boolean bD(Context context) {
                    return !TextUtils.isEmpty(n.g(new String[]{"/system/xbin/which", com.kuaishou.weapon.p0.bh.y}));
                }
            });
            this.aGs.add(new com.kwad.sdk.k.a.a(this.enabled) { // from class: com.kwad.sdk.utils.n.d.4
                @Override // com.kwad.sdk.k.a.a
                public final boolean bD(Context context) {
                    Charset forName = Charset.forName("UTF-8");
                    File file = new File("/data/su_test");
                    try {
                        q.a(file, "ok", forName, false);
                        return q.a(file, forName).equals("ok");
                    } catch (Throwable th) {
                        return false;
                    }
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    static class e extends com.kwad.sdk.k.a.a {
        public e() {
            HT();
        }

        private void HT() {
            this.aGs = new ArrayList();
            this.aGs.add(new com.kwad.sdk.k.a.a(this.enabled) { // from class: com.kwad.sdk.utils.n.e.1
                @Override // com.kwad.sdk.k.a.a
                public final boolean bD(Context context) {
                    return ak.ak(context, "de.robv.android.xposed.installer") || ak.ak(context, "com.saurik.substrate");
                }
            });
            this.aGs.add(new com.kwad.sdk.k.a.a(this.enabled) { // from class: com.kwad.sdk.utils.n.e.2
                @Override // com.kwad.sdk.k.a.a
                public final boolean bD(Context context) {
                    StackTraceElement[] stackTrace;
                    try {
                        throw new Exception("empty");
                    } catch (Exception e) {
                        boolean z = false;
                        int i = 0;
                        for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                            String className = stackTraceElement.getClassName();
                            String methodName = stackTraceElement.getMethodName();
                            if (className.equals("com.android.internal.os.ZygoteInit") && (i = i + 1) == 2) {
                                z = true;
                            }
                            if (className.equals("com.saurik.substrate.MS$2") && methodName.equals("invoked")) {
                                Log.wtf("HookDetection", "A method on the stack trace has been hooked using Substrate.");
                                z = true;
                            }
                            if (className.equals(com.kuaishou.weapon.p0.an.b) && methodName.equals("main")) {
                                z = true;
                            }
                            if (className.equals(com.kuaishou.weapon.p0.an.b) && methodName.equals("handleHookedMethod")) {
                                z = true;
                            }
                        }
                        return z;
                    }
                }
            });
            this.aGs.add(new com.kwad.sdk.k.a.a(this.enabled) { // from class: com.kwad.sdk.utils.n.e.3
                @Override // com.kwad.sdk.k.a.a
                public final boolean bD(Context context) {
                    BufferedReader bufferedReader;
                    FileReader fileReader;
                    Throwable th;
                    HashSet<String> hashSet;
                    BufferedReader bufferedReader2 = null;
                    boolean z = false;
                    try {
                        hashSet = new HashSet();
                        fileReader = new FileReader("/proc/" + Process.myPid() + "/maps");
                    } catch (Exception e) {
                        fileReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = null;
                        fileReader = null;
                    }
                    try {
                        bufferedReader = new BufferedReader(fileReader);
                        while (true) {
                            try {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                } else if (readLine.endsWith(".so") || readLine.endsWith(".jar")) {
                                    hashSet.add(readLine.substring(readLine.lastIndexOf(" ") + 1));
                                }
                            } catch (Exception e2) {
                                bufferedReader2 = bufferedReader;
                                com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader2);
                                com.kwad.sdk.crash.utils.b.closeQuietly(fileReader);
                                return z;
                            } catch (Throwable th3) {
                                th = th3;
                                com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
                                com.kwad.sdk.crash.utils.b.closeQuietly(fileReader);
                                throw th;
                            }
                        }
                        for (String str : hashSet) {
                            if (str.contains("com.saurik.substrate")) {
                                Log.wtf("HookDetection", "Substrate shared object found: " + str);
                                z = true;
                            }
                            if (str.contains("XposedBridge.jar")) {
                                Log.wtf("HookDetection", "Xposed JAR found: " + str);
                                z = true;
                            }
                        }
                        com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
                    } catch (Exception e3) {
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedReader = null;
                        th = th;
                        com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
                        com.kwad.sdk.crash.utils.b.closeQuietly(fileReader);
                        throw th;
                    }
                    com.kwad.sdk.crash.utils.b.closeQuietly(fileReader);
                    return z;
                }
            });
        }
    }

    public static synchronized com.kwad.sdk.k.a.d HS() {
        synchronized (n.class) {
            if (((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).xw()) {
                com.kwad.sdk.k.a.d dVar = aIo;
                if (dVar != null) {
                    return dVar;
                }
                Context applicationContext = ServiceProvider.getContext().getApplicationContext();
                com.kwad.sdk.k.a.d dVar2 = new com.kwad.sdk.k.a.d(applicationContext);
                boolean bC = new d().bC(applicationContext);
                boolean bC2 = new e().bC(applicationContext);
                boolean bC3 = new b().bC(applicationContext);
                boolean bC4 = new a().bC(applicationContext);
                boolean bC5 = new c().bC(applicationContext);
                dVar2.bx(bC);
                dVar2.by(bC2);
                dVar2.bz(bC3);
                dVar2.bB(bC4);
                dVar2.bC(bC5);
                aIo = dVar2;
                return dVar2;
            }
            return null;
        }
    }

    public static String g(String[] strArr) {
        try {
            return com.kwad.sdk.crash.utils.h.c(Runtime.getRuntime().exec(strArr).getInputStream());
        } catch (Exception e2) {
            return null;
        }
    }
}
