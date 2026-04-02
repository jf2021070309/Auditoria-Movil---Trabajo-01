package com.kuaishou.weapon.p0;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class r {
    private static r c;
    private static Application d;
    public boolean a;
    private String e;
    private static Random f = new Random();
    private static Map<String, s> g = new ConcurrentHashMap();
    private static Map<String, s> h = new ConcurrentHashMap();
    public static List<Integer> b = new ArrayList();

    private r() {
    }

    private Pair<Boolean, String> a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return new Pair<>(Boolean.FALSE, "");
        }
        File file = new File(str2);
        if (dm.a(file)) {
            String a = f.a(file);
            return TextUtils.isEmpty(a) ? new Pair<>(Boolean.FALSE, "") : !a.equalsIgnoreCase(str) ? new Pair<>(Boolean.FALSE, a) : new Pair<>(Boolean.TRUE, "");
        }
        return new Pair<>(Boolean.FALSE, "");
    }

    public static r a() {
        return c;
    }

    public static r a(Context context, boolean z) {
        try {
            if (c == null) {
                d = (Application) context.getApplicationContext();
                c = new r();
            }
        } catch (Throwable th) {
        }
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00d5 A[EDGE_INSN: B:104:0x00d5->B:36:0x00d5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0 A[Catch: all -> 0x00df, LOOP:1: B:88:0x00ca->B:35:0x00d0, LOOP_END, TryCatch #5 {all -> 0x00df, blocks: (B:33:0x00ca, B:35:0x00d0, B:36:0x00d5), top: B:88:0x00ca }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.kuaishou.weapon.p0.s r17, java.lang.String r18, java.lang.String r19, java.util.HashSet<java.lang.String> r20, byte[] r21, java.lang.StringBuilder r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.r.a(com.kuaishou.weapon.p0.s, java.lang.String, java.lang.String, java.util.HashSet, byte[], java.lang.StringBuilder, boolean):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:27|(1:220)(11:31|32|33|(4:35|36|(4:54|(3:55|56|(1:58)(1:59))|60|61)|51)|217|36|(2:38|40)|54|(4:55|56|(0)(0)|58)|60|61)|62|63|(1:103)(10:68|69|70|71|72|(4:73|74|75|(2:77|78)(1:88))|89|(1:91)|92|93)|86|87|51|24|25) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(8:(2:5|(16:9|10|(1:12)|13|(1:15)|16|17|18|19|21|22|23|(10:27|(1:220)(11:31|32|33|(4:35|36|(4:54|(3:55|56|(1:58)(1:59))|60|61)|51)|217|36|(2:38|40)|54|(4:55|56|(0)(0)|58)|60|61)|62|63|(1:103)(10:68|69|70|71|72|(4:73|74|75|(2:77|78)(1:88))|89|(1:91)|92|93)|86|87|51|24|25)|221|222|(1:224)))|21|22|23|(2:24|25)|221|222|(0))|262|10|(0)|13|(0)|16|17|18|19|(4:(1:250)|(12:173|130|(1:132)(1:171)|133|134|(1:140)|147|148|149|150|151|(2:153|(3:159|3af|163)(1:157))(1:165))|(0)|(8:134|(3:136|138|140)|147|148|149|150|151|(0)(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bb, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d8, code lost:
        if (r15 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01fb, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01fc, code lost:
        r7 = null;
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x023c, code lost:
        if (r15 != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0257, code lost:
        if (r15 != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0272, code lost:
        if (r15 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0274, code lost:
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0277, code lost:
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x027f, code lost:
        if (r11.contains(android.os.Build.CPU_ABI) == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0281, code lost:
        r0 = new java.lang.StringBuilder();
        r2 = r20;
        r0.append(r2);
        r0.append("/");
        r0.append(android.os.Build.CPU_ABI);
        r1 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x029d, code lost:
        if (android.os.Build.VERSION.SDK_INT < 8) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02a5, code lost:
        if (r11.contains(android.os.Build.CPU_ABI2) == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02bd, code lost:
        r14 = r2 + "/" + android.os.Build.CPU_ABI2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02ed, code lost:
        r2 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02f3, code lost:
        if (android.os.Build.VERSION.SDK_INT < 8) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02fb, code lost:
        if (r11.contains(android.os.Build.CPU_ABI2) == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0321, code lost:
        r1 = r2 + "/" + android.os.Build.CPU_ABI2 + ":" + java.lang.System.getProperty("java.library.path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x041f, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0420, code lost:
        r14 = r10;
        r7 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0397 A[Catch: all -> 0x041b, TryCatch #29 {all -> 0x041b, blocks: (B:212:0x0389, B:214:0x0397, B:216:0x03a1, B:218:0x03ab, B:219:0x03af, B:221:0x03f3, B:220:0x03b0), top: B:257:0x0389 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[Catch: IOException -> 0x0135, EOFException -> 0x0138, FileNotFoundException -> 0x013b, ZipException -> 0x013e, all -> 0x01dc, TryCatch #18 {EOFException -> 0x0138, FileNotFoundException -> 0x013b, ZipException -> 0x013e, IOException -> 0x0135, all -> 0x01dc, blocks: (B:23:0x005e, B:25:0x0064, B:27:0x0077, B:29:0x007d, B:36:0x0088, B:38:0x008e, B:40:0x0094, B:42:0x009a, B:44:0x00a2, B:46:0x00aa, B:48:0x00b0, B:50:0x00b8, B:105:0x01bf, B:107:0x01c5), top: B:273:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x011c A[EDGE_INSN: B:280:0x011c->B:54:0x011c ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117 A[Catch: all -> 0x0123, IOException -> 0x0127, EOFException -> 0x012b, FileNotFoundException -> 0x012f, ZipException -> 0x0131, LOOP:1: B:268:0x0111->B:53:0x0117, LOOP_END, TryCatch #21 {EOFException -> 0x012b, FileNotFoundException -> 0x012f, ZipException -> 0x0131, IOException -> 0x0127, all -> 0x0123, blocks: (B:51:0x0111, B:53:0x0117, B:54:0x011c), top: B:268:0x0111 }] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.kuaishou.weapon.p0.s r19, java.lang.String r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.r.a(com.kuaishou.weapon.p0.s, java.lang.String, java.lang.String, boolean):void");
    }

    private synchronized boolean a(s sVar) {
        if (sVar != null) {
            if (!TextUtils.isEmpty(sVar.e)) {
                s sVar2 = g.get(sVar.e);
                if (sVar2 != null) {
                    if (sVar2.d.equals(sVar.d)) {
                        return true;
                    }
                    a(sVar2.e);
                }
                try {
                    sVar.f = d;
                    if (sVar.p == 1) {
                        if (TextUtils.isEmpty(sVar.c) || TextUtils.isEmpty(sVar.e)) {
                            throw new RuntimeException("apkPackageName or apkPkgPath is null");
                        }
                        sVar.m = d.getFilesDir().getCanonicalPath() + bh.j + sVar.a;
                        String str = sVar.m + "/dex";
                        dm.c(sVar.m + "/lib");
                        String str2 = (sVar.m + "/lib/" + this.e) + "/" + f.nextInt();
                        e(str);
                        dm.a(str, Boolean.FALSE);
                        e(str2);
                        a(sVar, str2, str, false);
                        h.put(sVar.c, sVar);
                        g.put(sVar.e, sVar);
                    }
                    if (sVar.p != 1 || 0 != 0) {
                        PackageInfo packageInfo = sVar.r;
                        if (packageInfo == null || TextUtils.isEmpty(packageInfo.packageName) || TextUtils.isEmpty(packageInfo.versionName)) {
                            packageInfo = d.getPackageManager().getPackageArchiveInfo(sVar.e, 1);
                        }
                        if (TextUtils.isEmpty(packageInfo.packageName) || !packageInfo.packageName.startsWith("com.kuaishou.weapon")) {
                            throw new Exception("weapon package name check failed");
                        }
                        if (sVar.p != 1 && sVar.b != 1 && !((Boolean) a(sVar.j, sVar.e).first).booleanValue()) {
                            return false;
                        }
                        sVar.c = packageInfo.packageName;
                        sVar.o = packageInfo.applicationInfo.className;
                        sVar.d = packageInfo.versionName;
                        sVar.l = packageInfo.activities;
                        sVar.q = packageInfo.applicationInfo.theme;
                        sVar.m = d.getFilesDir().getCanonicalPath() + bh.j + sVar.a;
                        String str3 = sVar.m + "/dex";
                        dm.c(sVar.m + "/lib");
                        String str4 = (sVar.m + "/lib/" + this.e) + "/" + f.nextInt();
                        e(str3);
                        dm.a(str3, Boolean.FALSE);
                        e(str4);
                        a(sVar, str4, str3, true);
                        h.put(sVar.c, sVar);
                        g.put(sVar.e, sVar);
                        b.add(Integer.valueOf(sVar.a));
                    }
                    return true;
                } catch (Throwable th) {
                    try {
                        a(sVar.e);
                    } catch (Throwable th2) {
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean e(String str) {
        try {
            File file = new File(str);
            if (file.exists() && !file.isDirectory()) {
                file.delete();
            }
            if (file.exists()) {
                return true;
            }
            file.mkdirs();
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    public boolean a(s sVar, boolean z) {
        this.a = z;
        this.e = sVar.d;
        return a(sVar);
    }

    public boolean a(String str) {
        s sVar = g.get(str);
        if (sVar != null) {
            g.remove(str);
            h.remove(sVar.c);
            dm.c(sVar.m);
            Application application = d;
            if (application != null) {
                dm.c(application.getFileStreamPath(sVar.c).getAbsolutePath());
                return true;
            }
            return true;
        }
        return false;
    }

    public Map<String, s> b() {
        return h;
    }

    public boolean b(String str) {
        s sVar = h.get(str);
        if (sVar != null) {
            g.remove(sVar.e);
            h.remove(str);
            dm.c(sVar.m);
            Application application = d;
            if (application != null) {
                dm.c(application.getFileStreamPath(sVar.c).getAbsolutePath());
                return true;
            }
            return true;
        }
        return false;
    }

    public s c(String str) {
        try {
            return g.get(str);
        } catch (Throwable th) {
            return null;
        }
    }

    public s d(String str) {
        try {
            return h.get(str);
        } catch (Throwable th) {
            return null;
        }
    }
}
