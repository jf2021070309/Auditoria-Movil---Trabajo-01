package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.reflect.Method;
/* loaded from: classes3.dex */
public class ZIDManager {
    public static ZIDManager d;
    public boolean a = false;
    public boolean b = false;
    public boolean c;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ IZIDCompletionCallback b;

        public a(Context context, IZIDCompletionCallback iZIDCompletionCallback) {
            this.a = context;
            this.b = iZIDCompletionCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            String a = ZIDManager.a(ZIDManager.this, this.a);
            if (TextUtils.isEmpty(a)) {
                IZIDCompletionCallback iZIDCompletionCallback = this.b;
                if (iZIDCompletionCallback != null) {
                    iZIDCompletionCallback.onFailure("1002", "获取zid失败");
                    return;
                }
                return;
            }
            IZIDCompletionCallback iZIDCompletionCallback2 = this.b;
            if (iZIDCompletionCallback2 != null) {
                iZIDCompletionCallback2.onSuccess(a);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public final /* synthetic */ Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            ZIDManager.this.b(this.a);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public final /* synthetic */ Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            ZIDManager.a(ZIDManager.this, this.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:6:0x0010, B:21:0x0056, B:22:0x005b, B:26:0x006b, B:28:0x008a, B:30:0x009f, B:32:0x00b4, B:33:0x00b7, B:35:0x00c3, B:36:0x00c6, B:38:0x00d2, B:39:0x00d5, B:19:0x0051), top: B:50:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:6:0x0010, B:21:0x0056, B:22:0x005b, B:26:0x006b, B:28:0x008a, B:30:0x009f, B:32:0x00b4, B:33:0x00b7, B:35:0x00c3, B:36:0x00c6, B:38:0x00d2, B:39:0x00d5, B:19:0x0051), top: B:50:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.String a(com.umeng.umzid.ZIDManager r10, android.content.Context r11) {
        /*
            boolean r0 = r10.a
            r1 = 0
            if (r0 == 0) goto L7
            goto Ldf
        L7:
            r0 = 1
            r10.a = r0
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r3 = 0
            java.lang.String r4 = com.umeng.umzid.Spy.getID()     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = "z"
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = com.umeng.umzid.d.e(r11)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r6 = "mc"
            r2.put(r6, r5)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r6 = com.umeng.umzid.d.f(r11)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r7 = "o"
            r2.put(r7, r6)     // Catch: java.lang.Throwable -> Ld9
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4e
            r7.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r8 = "vpn_pxy"
            boolean r9 = com.umeng.umzid.d.i(r11)     // Catch: java.lang.Throwable -> L4c
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r8 = "wifi_pxy"
            boolean r9 = com.umeng.umzid.d.j(r11)     // Catch: java.lang.Throwable -> L4c
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r8 = "double"
            boolean r9 = com.umeng.umzid.d.g(r11)     // Catch: java.lang.Throwable -> L4c
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L4c
            goto L54
        L4c:
            r8 = move-exception
            goto L51
        L4e:
            r7 = move-exception
            r8 = r7
            r7 = r1
        L51:
            r8.printStackTrace()     // Catch: java.lang.Throwable -> Ld9
        L54:
            if (r7 == 0) goto L5b
            java.lang.String r8 = "anti"
            r2.put(r8, r7)     // Catch: java.lang.Throwable -> Ld9
        L5b:
            r10.a(r11, r2)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r7 = com.umeng.umzid.d.b(r11)     // Catch: java.lang.Throwable -> Ld9
            int r8 = r7.length()     // Catch: java.lang.Throwable -> Ld9
            if (r8 <= 0) goto L69
            goto L6b
        L69:
            java.lang.String r7 = "https://utoken.umeng.com"
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld9
            r8.<init>()     // Catch: java.lang.Throwable -> Ld9
            r8.append(r7)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r7 = "/anti/postZdata"
            r8.append(r7)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r2 = com.umeng.umzid.a.a(r7, r2)     // Catch: java.lang.Throwable -> Ld9
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Ld9
            if (r7 != 0) goto Ld5
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld9
            r7.<init>(r2)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r2 = "suc"
            boolean r2 = r7.optBoolean(r2)     // Catch: java.lang.Throwable -> Ld9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> Ld9
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Ld9
            if (r2 != r0) goto Ld5
            com.umeng.umzid.d.f(r11, r4)     // Catch: java.lang.Throwable -> Ld9
            com.umeng.umzid.d.a(r11, r5)     // Catch: java.lang.Throwable -> Ld9
            com.umeng.umzid.d.b(r11, r6)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r0 = "aaid"
            java.lang.String r1 = r7.optString(r0)     // Catch: java.lang.Throwable -> Ld9
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Ld9
            if (r0 != 0) goto Lb7
            com.umeng.umzid.d.e(r11, r1)     // Catch: java.lang.Throwable -> Ld9
        Lb7:
            java.lang.String r0 = "uabc"
            java.lang.String r0 = r7.optString(r0)     // Catch: java.lang.Throwable -> Ld9
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Ld9
            if (r2 != 0) goto Lc6
            com.umeng.umzid.d.d(r11, r0)     // Catch: java.lang.Throwable -> Ld9
        Lc6:
            java.lang.String r0 = "resetToken"
            java.lang.String r0 = r7.optString(r0)     // Catch: java.lang.Throwable -> Ld9
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Ld9
            if (r2 != 0) goto Ld5
            com.umeng.umzid.d.c(r11, r0)     // Catch: java.lang.Throwable -> Ld9
        Ld5:
            r10.a(r11)     // Catch: java.lang.Throwable -> Ld9
            goto Ldd
        Ld9:
            r11 = move-exception
            r11.printStackTrace()     // Catch: java.lang.Throwable -> Le0
        Ldd:
            r10.a = r3
        Ldf:
            return r1
        Le0:
            r11 = move-exception
            r10.a = r3
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umzid.ZIDManager.a(com.umeng.umzid.ZIDManager, android.content.Context):java.lang.String");
    }

    public static void configureDomain(Context context, String str) {
        SharedPreferences a2;
        SharedPreferences.Editor edit;
        String b2 = d.b(str);
        if (context == null || b2 == null || TextUtils.isEmpty(b2) || (a2 = com.umeng.umzid.a.a(context)) == null || (edit = a2.edit()) == null) {
            return;
        }
        edit.putString("inputDomain", b2).commit();
    }

    public static synchronized ZIDManager getInstance() {
        ZIDManager zIDManager;
        synchronized (ZIDManager.class) {
            if (d == null) {
                d = new ZIDManager();
            }
            zIDManager = d;
        }
        return zIDManager;
    }

    public static String getSDKVersion() {
        return "1.8.0";
    }

    public final void a(Context context) {
        Method declaredMethod;
        Object invoke;
        Method declaredMethod2;
        try {
            Class<?> cls = Class.forName("com.uyumao.sdk.UYMManager");
            if (cls == null || (declaredMethod = cls.getDeclaredMethod("getInstance", new Class[0])) == null || (invoke = declaredMethod.invoke(cls, new Object[0])) == null || (declaredMethod2 = cls.getDeclaredMethod("init", Context.class)) == null) {
                return;
            }
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(invoke, context);
        } catch (Exception e) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:14|(3:80|81|(27:83|17|(1:79)(2:21|(1:23))|24|(1:78)(2:28|(1:30))|31|32|(1:36)|37|(1:39)|40|41|42|43|44|45|46|47|48|(1:50)|51|(1:53)|54|(2:56|(6:58|(1:60)|61|(1:63)|64|(1:66)))|67|68|69))|16|17|(1:19)|79|24|(1:26)|78|31|32|(2:34|36)|37|(0)|40|41|42|43|44|45|46|47|48|(0)|51|(0)|54|(0)|67|68|69) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f3, code lost:
        r11 = r6;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f5, code lost:
        r11.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056 A[Catch: all -> 0x0174, TryCatch #2 {all -> 0x0174, blocks: (B:18:0x0038, B:20:0x003e, B:22:0x0046, B:24:0x0056, B:26:0x005c, B:28:0x0068, B:30:0x006e, B:32:0x007e, B:34:0x0084, B:36:0x0090, B:38:0x0096, B:41:0x00b9, B:43:0x00bf, B:44:0x00c3, B:46:0x00ca, B:61:0x00fa, B:62:0x00ff, B:66:0x010c, B:68:0x012b, B:70:0x0140, B:72:0x0153, B:73:0x0156, B:75:0x0160, B:76:0x0163, B:78:0x016d, B:79:0x0170, B:59:0x00f5), top: B:88:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[Catch: all -> 0x0174, TryCatch #2 {all -> 0x0174, blocks: (B:18:0x0038, B:20:0x003e, B:22:0x0046, B:24:0x0056, B:26:0x005c, B:28:0x0068, B:30:0x006e, B:32:0x007e, B:34:0x0084, B:36:0x0090, B:38:0x0096, B:41:0x00b9, B:43:0x00bf, B:44:0x00c3, B:46:0x00ca, B:61:0x00fa, B:62:0x00ff, B:66:0x010c, B:68:0x012b, B:70:0x0140, B:72:0x0153, B:73:0x0156, B:75:0x0160, B:76:0x0163, B:78:0x016d, B:79:0x0170, B:59:0x00f5), top: B:88:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9 A[Catch: all -> 0x0174, TRY_ENTER, TryCatch #2 {all -> 0x0174, blocks: (B:18:0x0038, B:20:0x003e, B:22:0x0046, B:24:0x0056, B:26:0x005c, B:28:0x0068, B:30:0x006e, B:32:0x007e, B:34:0x0084, B:36:0x0090, B:38:0x0096, B:41:0x00b9, B:43:0x00bf, B:44:0x00c3, B:46:0x00ca, B:61:0x00fa, B:62:0x00ff, B:66:0x010c, B:68:0x012b, B:70:0x0140, B:72:0x0153, B:73:0x0156, B:75:0x0160, B:76:0x0163, B:78:0x016d, B:79:0x0170, B:59:0x00f5), top: B:88:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca A[Catch: all -> 0x0174, TRY_LEAVE, TryCatch #2 {all -> 0x0174, blocks: (B:18:0x0038, B:20:0x003e, B:22:0x0046, B:24:0x0056, B:26:0x005c, B:28:0x0068, B:30:0x006e, B:32:0x007e, B:34:0x0084, B:36:0x0090, B:38:0x0096, B:41:0x00b9, B:43:0x00bf, B:44:0x00c3, B:46:0x00ca, B:61:0x00fa, B:62:0x00ff, B:66:0x010c, B:68:0x012b, B:70:0x0140, B:72:0x0153, B:73:0x0156, B:75:0x0160, B:76:0x0163, B:78:0x016d, B:79:0x0170, B:59:0x00f5), top: B:88:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa A[Catch: all -> 0x0174, TryCatch #2 {all -> 0x0174, blocks: (B:18:0x0038, B:20:0x003e, B:22:0x0046, B:24:0x0056, B:26:0x005c, B:28:0x0068, B:30:0x006e, B:32:0x007e, B:34:0x0084, B:36:0x0090, B:38:0x0096, B:41:0x00b9, B:43:0x00bf, B:44:0x00c3, B:46:0x00ca, B:61:0x00fa, B:62:0x00ff, B:66:0x010c, B:68:0x012b, B:70:0x0140, B:72:0x0153, B:73:0x0156, B:75:0x0160, B:76:0x0163, B:78:0x016d, B:79:0x0170, B:59:0x00f5), top: B:88:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012b A[Catch: all -> 0x0174, TryCatch #2 {all -> 0x0174, blocks: (B:18:0x0038, B:20:0x003e, B:22:0x0046, B:24:0x0056, B:26:0x005c, B:28:0x0068, B:30:0x006e, B:32:0x007e, B:34:0x0084, B:36:0x0090, B:38:0x0096, B:41:0x00b9, B:43:0x00bf, B:44:0x00c3, B:46:0x00ca, B:61:0x00fa, B:62:0x00ff, B:66:0x010c, B:68:0x012b, B:70:0x0140, B:72:0x0153, B:73:0x0156, B:75:0x0160, B:76:0x0163, B:78:0x016d, B:79:0x0170, B:59:0x00f5), top: B:88:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umzid.ZIDManager.b(android.content.Context):java.lang.String");
    }

    public synchronized String getZID(Context context) {
        if (context == null) {
            return "";
        }
        Context applicationContext = context.getApplicationContext();
        String d2 = d.d(applicationContext);
        if (TextUtils.isEmpty(d2)) {
            com.umeng.umzid.c.a(new c(applicationContext));
            return "";
        }
        return d2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0077 A[Catch: all -> 0x00a6, TryCatch #1 {, blocks: (B:3:0x0001, B:9:0x000f, B:12:0x0018, B:15:0x0020, B:18:0x0029, B:21:0x0031, B:23:0x0037, B:25:0x003d, B:27:0x0043, B:28:0x004c, B:30:0x0052, B:33:0x0059, B:35:0x0063, B:37:0x006f, B:39:0x0077, B:40:0x007f, B:42:0x0085, B:47:0x0097, B:36:0x0067), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:9:0x000f, B:12:0x0018, B:15:0x0020, B:18:0x0029, B:21:0x0031, B:23:0x0037, B:25:0x003d, B:27:0x0043, B:28:0x004c, B:30:0x0052, B:33:0x0059, B:35:0x0063, B:37:0x006f, B:39:0x0077, B:40:0x007f, B:42:0x0085, B:47:0x0097, B:36:0x0067), top: B:55:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void init(android.content.Context r4, java.lang.String r5, com.umeng.umzid.IZIDCompletionCallback r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = com.umeng.umzid.d.h(r4)     // Catch: java.lang.Throwable -> La6
            r3.c = r0     // Catch: java.lang.Throwable -> La6
            if (r0 != 0) goto Lb
            monitor-exit(r3)
            return
        Lb:
            if (r4 != 0) goto L18
            if (r6 == 0) goto L16
            java.lang.String r4 = "1001"
            java.lang.String r5 = "传入参数Context为null"
            r6.onFailure(r4, r5)     // Catch: java.lang.Throwable -> La6
        L16:
            monitor-exit(r3)
            return
        L18:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L29
            if (r6 == 0) goto L27
            java.lang.String r4 = "1003"
            java.lang.String r5 = "传入参数appkey为空"
            r6.onFailure(r4, r5)     // Catch: java.lang.Throwable -> La6
        L27:
            monitor-exit(r3)
            return
        L29:
            android.content.Context r0 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L4c
            if (r5 == 0) goto L4c
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> La6
            if (r1 != 0) goto L4c
            android.content.SharedPreferences r1 = com.umeng.umzid.a.a(r0)     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L4c
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L4c
            java.lang.String r2 = "appkey"
            android.content.SharedPreferences$Editor r5 = r1.putString(r2, r5)     // Catch: java.lang.Throwable -> La6
            r5.commit()     // Catch: java.lang.Throwable -> La6
        L4c:
            java.lang.String r5 = com.umeng.umzid.d.d(r0)     // Catch: java.lang.Throwable -> La6
            if (r5 == 0) goto L67
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L59
            goto L67
        L59:
            com.umeng.umzid.ZIDManager$b r1 = new com.umeng.umzid.ZIDManager$b     // Catch: java.lang.Throwable -> La6
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La6
            com.umeng.umzid.c.a(r1)     // Catch: java.lang.Throwable -> La6
            if (r6 == 0) goto L6f
            r6.onSuccess(r5)     // Catch: java.lang.Throwable -> La6
            goto L6f
        L67:
            com.umeng.umzid.ZIDManager$a r5 = new com.umeng.umzid.ZIDManager$a     // Catch: java.lang.Throwable -> La6
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> La6
            com.umeng.umzid.c.a(r5)     // Catch: java.lang.Throwable -> La6
        L6f:
            java.lang.String r5 = ""
            android.content.SharedPreferences r6 = com.umeng.umzid.a.a(r4)     // Catch: java.lang.Throwable -> La6
            if (r6 == 0) goto L7f
            java.lang.String r5 = "uuid"
            java.lang.String r0 = ""
            java.lang.String r5 = r6.getString(r5, r0)     // Catch: java.lang.Throwable -> La6
        L7f:
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> La6
            if (r5 == 0) goto La4
            java.lang.String r5 = ""
            android.content.SharedPreferences r4 = com.umeng.umzid.a.a(r4)     // Catch: java.lang.Throwable -> La6
            java.util.UUID r6 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> La6
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L94
            goto L95
        L94:
            r6 = move-exception
        L95:
            if (r4 == 0) goto La4
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> La6
            java.lang.String r6 = "uuid"
            android.content.SharedPreferences$Editor r4 = r4.putString(r6, r5)     // Catch: java.lang.Throwable -> La6
            r4.commit()     // Catch: java.lang.Throwable -> La6
        La4:
            monitor-exit(r3)
            return
        La6:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umzid.ZIDManager.init(android.content.Context, java.lang.String, com.umeng.umzid.IZIDCompletionCallback):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:1|(5:92|93|(2:100|101)|95|(33:97|4|5|6|(2:11|(28:15|16|17|18|19|20|(3:71|72|(5:74|75|(2:78|76)|79|80))|22|(1:24)(1:70)|25|(1:27)(1:69)|28|29|30|31|32|33|34|35|36|37|(1:41)|42|43|44|(2:49|(2:53|54))|56|57))|90|16|17|18|19|20|(0)|22|(0)(0)|25|(0)(0)|28|29|30|31|32|33|34|35|36|37|(2:39|41)|42|43|44|(4:46|47|49|(3:51|53|54))|56|57))|3|4|5|6|(4:8|9|11|(29:13|15|16|17|18|19|20|(0)|22|(0)(0)|25|(0)(0)|28|29|30|31|32|33|34|35|36|37|(0)|42|43|44|(0)|56|57))|90|16|17|18|19|20|(0)|22|(0)(0)|25|(0)(0)|28|29|30|31|32|33|34|35|36|37|(0)|42|43|44|(0)|56|57) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ec, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0136, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0137, code lost:
        r5.printStackTrace();
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0159, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015a, code lost:
        r5.printStackTrace();
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0172, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0173, code lost:
        r5.printStackTrace();
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject a(android.content.Context r10, org.json.JSONObject r11) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.umzid.ZIDManager.a(android.content.Context, org.json.JSONObject):org.json.JSONObject");
    }
}
