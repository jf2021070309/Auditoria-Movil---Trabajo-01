package com.umeng.commonsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.as;
import com.umeng.analytics.pro.au;
import com.umeng.analytics.pro.bg;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.bj;
import com.umeng.analytics.pro.bk;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.UMInnerManager;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.idtracking.h;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.onMessageSendListener;
import java.io.File;
import java.lang.reflect.Method;
import org.json.JSONObject;
/* compiled from: UMInternalDataProtocol.java */
/* loaded from: classes3.dex */
public class c implements UMLogDataProtocol {
    public static final String b = "preInitInvokedFlag";
    public static final String c = "policyGrantInvokedFlag";
    public static final String d = "policyGrantResult";
    private Context e;
    private static int f = 1;
    public static final String a = as.b().b(as.q);
    private static Class<?> g = null;
    private static Method h = null;
    private static Method i = null;
    private static Method j = null;
    private static volatile String k = "";
    private static volatile String l = "";
    private static boolean m = false;

    static {
        c();
    }

    private static void c() {
        try {
            Class<?> cls = Class.forName("com.umeng.umzid.ZIDManager");
            if (cls != null) {
                g = cls;
                Method declaredMethod = cls.getDeclaredMethod("getInstance", new Class[0]);
                if (declaredMethod != null) {
                    h = declaredMethod;
                }
                Method declaredMethod2 = g.getDeclaredMethod("getZID", Context.class);
                if (declaredMethod2 != null) {
                    i = declaredMethod2;
                }
                Method declaredMethod3 = g.getDeclaredMethod("getSDKVersion", new Class[0]);
                if (declaredMethod3 != null) {
                    j = declaredMethod3;
                }
            }
        } catch (Throwable th) {
        }
    }

    public String a() {
        Method method;
        if (!TextUtils.isEmpty(k)) {
            return k;
        }
        Class<?> cls = g;
        if (cls == null || (method = h) == null || i == null) {
            return "";
        }
        try {
            Object invoke = method.invoke(cls, new Object[0]);
            if (invoke == null) {
                return "";
            }
            String str = (String) i.invoke(invoke, this.e);
            try {
                k = str;
                return str;
            } catch (Throwable th) {
                return str;
            }
        } catch (Throwable th2) {
            return "";
        }
    }

    public static String b() {
        Method method;
        if (!TextUtils.isEmpty(l)) {
            return l;
        }
        Class<?> cls = g;
        if (cls == null || (method = h) == null || j == null) {
            return "";
        }
        try {
            Object invoke = method.invoke(cls, new Object[0]);
            if (invoke == null) {
                return "";
            }
            String str = (String) j.invoke(invoke, new Object[0]);
            try {
                l = str;
                return str;
            } catch (Throwable th) {
                return str;
            }
        } catch (Throwable th2) {
            return "";
        }
    }

    public c(Context context) {
        if (context != null) {
            this.e = context.getApplicationContext();
        }
    }

    private void a(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("appkey"), UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), UMGlobalContext.getInstance(context).getAppVersion());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(bg.x), "Android");
            JSONObject buildZeroEnvelopeWithExtHeader = UMEnvelopeBuild.buildZeroEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.ZCFG_PATH);
            if (buildZeroEnvelopeWithExtHeader == null || !buildZeroEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文 成功!!!");
            } else {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文失败.");
            }
        } catch (Throwable th) {
        }
    }

    private void b(Context context) {
        try {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(context, bg.g, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("appkey"), UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(bg.g), imprintProperty);
            JSONObject buildSilentEnvelopeWithExtHeader = UMEnvelopeBuild.buildSilentEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.SILENT_HEART_BEAT);
            if (buildSilentEnvelopeWithExtHeader == null || !buildSilentEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建心跳报文 成功!!!");
            } else {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建心跳报文失败.");
            }
        } catch (Throwable th) {
        }
    }

    private void d() {
        bi a2 = bi.a(this.e);
        bj a3 = a2.a(bk.c);
        if (a3 != null) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建成真正信封。");
            try {
                String str = a3.a;
                String str2 = a3.b;
                JSONObject a4 = new com.umeng.commonsdk.statistics.b().a(this.e.getApplicationContext(), new JSONObject(a3.c), new JSONObject(a3.d), a3.e, str2, a3.f);
                if (a4 == null || !a4.has("exception")) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 成功! 删除二级缓存记录。");
                } else {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 失败。删除二级缓存记录");
                }
                a2.a(bk.c, str);
                a2.b();
            } catch (Throwable th) {
            }
        }
    }

    public static void a(final Context context, final boolean z) {
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(h.a, 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    String a2 = au.a(context);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(a2) && sharedPreferences != null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString(h.c, (currentTimeMillis2 - currentTimeMillis) + "");
                        edit.commit();
                    }
                    if (sharedPreferences != null) {
                        try {
                            SharedPreferences.Editor edit2 = sharedPreferences.edit();
                            edit2.putString(h.b, a2);
                            edit2.commit();
                        } catch (Throwable th) {
                            return;
                        }
                    }
                    if (z) {
                        UMConfigureImpl.removeInterruptFlag();
                    }
                } catch (Exception e) {
                }
            }
        }).start();
    }

    private static void a(Context context, final OnGetOaidListener onGetOaidListener) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.2
            @Override // java.lang.Runnable
            public void run() {
                String a2 = au.a(applicationContext);
                OnGetOaidListener onGetOaidListener2 = onGetOaidListener;
                if (onGetOaidListener2 != null) {
                    onGetOaidListener2.onGetOaid(a2);
                }
            }
        }).start();
    }

    private static void c(final Context context) {
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            a(context, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.3
                @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                public void onGetOaid(String str) {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences = context.getSharedPreferences(h.a, 0);
                        if (sharedPreferences != null && !sharedPreferences.getString(h.b, "").equalsIgnoreCase(str)) {
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 更新本地缓存OAID");
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putString(h.b, str);
                            edit.commit();
                        }
                    } catch (Throwable th) {
                    }
                }
            });
        }
    }

    private void e() {
        if (!m) {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
                m = true;
                a(this.e, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.4
                    @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                    public void onGetOaid(String str) {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> OAID云控参数更新(不采集->采集)：采集完成");
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                SharedPreferences sharedPreferences = c.this.e.getSharedPreferences(h.a, 0);
                                if (sharedPreferences != null) {
                                    SharedPreferences.Editor edit = sharedPreferences.edit();
                                    edit.putString(h.b, str);
                                    edit.commit();
                                }
                            } catch (Throwable th) {
                            }
                            UMWorkDispatch.sendEvent(c.this.e, a.w, b.a(c.this.e).a(), null);
                            return;
                        }
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> oaid返回null或者空串，不需要 伪冷启动。");
                    }
                });
            }
        } else if (!FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            m = false;
        }
    }

    private void f() {
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            m = true;
            UMConfigureImpl.registerInterruptFlag();
            UMConfigureImpl.init(this.e);
            f++;
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 要读取 oaid，需等待读取结果.");
            UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() { // from class: com.umeng.commonsdk.internal.c.5
                @Override // com.umeng.commonsdk.utils.onMessageSendListener
                public void onMessageSend() {
                    if (c.this.e != null) {
                        UMWorkDispatch.sendEvent(c.this.e, a.x, b.a(c.this.e).a(), null);
                    }
                    UMConfigureImpl.removeMessageSendListener(this);
                }
            });
            a(this.e, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(android.content.Context r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L3
            return
        L3:
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            java.lang.String r1 = "debugkey"
            java.lang.String r0 = com.umeng.common.b.a(r11, r0, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L97
            java.lang.String r2 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            java.lang.String r3 = "startTime"
            java.lang.String r2 = com.umeng.common.b.a(r11, r2, r3)
            java.lang.String r3 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            java.lang.String r4 = "period"
            java.lang.String r3 = com.umeng.common.b.a(r11, r3, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            r5 = 0
            if (r4 != 0) goto L35
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L34
            long r7 = r2.longValue()     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r2 = move-exception
        L35:
            r7 = r5
        L36:
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L46
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L45
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r2 = move-exception
        L46:
            r2 = r5
        L47:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            java.lang.String r9 = "MobclickRT"
            if (r4 == 0) goto L8c
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto L52
            goto L8c
        L52:
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r7
            r6 = 60
            long r2 = r2 * r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r6
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L75
            java.lang.String r0 = "--->>> [RTD]本地缓存dk值已经超时，清除缓存数据。"
            com.umeng.commonsdk.debug.UMRTLog.i(r9, r0)
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            com.umeng.common.b.a(r11, r0)
            boolean r11 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()
            if (r11 == 0) goto L97
            com.umeng.analytics.AnalyticsConfig.turnOffRealTimeDebug()
            goto L97
        L75:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r11.put(r1, r0)
            boolean r0 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()
            if (r0 != 0) goto L97
            java.lang.String r0 = "--->>> [RTD]本地缓存dk值在有效期内，切换到埋点验证模式。"
            com.umeng.commonsdk.debug.UMRTLog.i(r9, r0)
            com.umeng.analytics.AnalyticsConfig.turnOnRealTimeDebug(r11)
            goto L97
        L8c:
            java.lang.String r0 = "--->>> [RTD]本地缓存startTime或者duration值无效，清除缓存数据"
            com.umeng.commonsdk.debug.UMRTLog.i(r9, r0)
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            com.umeng.common.b.a(r11, r0)
            return
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.c.d(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02cd A[Catch: all -> 0x02eb, TryCatch #8 {all -> 0x02eb, blocks: (B:100:0x0288, B:102:0x02a0, B:104:0x02ab, B:107:0x02b2, B:109:0x02b8, B:111:0x02c3, B:116:0x02cd, B:118:0x02d3, B:119:0x02de, B:120:0x02e4), top: B:198:0x0288 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e4 A[Catch: all -> 0x02eb, TRY_LEAVE, TryCatch #8 {all -> 0x02eb, blocks: (B:100:0x0288, B:102:0x02a0, B:104:0x02ab, B:107:0x02b2, B:109:0x02b8, B:111:0x02c3, B:116:0x02cd, B:118:0x02d3, B:119:0x02de, B:120:0x02e4), top: B:198:0x0288 }] */
    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void workEvent(java.lang.Object r13, int r14) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.c.workEvent(java.lang.Object, int):void");
    }

    private static Class<?> a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    private void e(Context context) {
        Object invoke;
        Context applicationContext = context.getApplicationContext();
        String appkey = UMUtils.getAppkey(context);
        try {
            Class<?> a2 = a("com.umeng.umzid.ZIDManager");
            Method declaredMethod = a2.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod != null && (invoke = declaredMethod.invoke(a2, new Object[0])) != null) {
                Method declaredMethod2 = a2.getDeclaredMethod("init", Context.class, String.class, a("com.umeng.umzid.IZIDCompletionCallback"));
                if (declaredMethod2 != null) {
                    try {
                        declaredMethod2.invoke(invoke, applicationContext, appkey, null);
                    } catch (Throwable th) {
                    }
                }
            }
        } catch (Throwable th2) {
        }
    }

    private void g() {
        if (f <= 0) {
            h();
            e(this.e);
        }
    }

    private static void f(Context context) {
        File filesDir = context.getFilesDir();
        File file = new File(filesDir.getAbsolutePath() + File.separator + bk.l);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Throwable th) {
            }
        }
    }

    private void h() {
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 真实构建条件满足，开始构建业务信封。");
        if (UMUtils.isMainProgress(this.e)) {
            f(this.e);
            UMInnerManager.sendInnerPackage(this.e);
            if (!FieldManager.allow(com.umeng.commonsdk.utils.d.ar) && SdkVersion.SDK_TYPE == 0 && UMUtils.isMainProgress(this.e)) {
                Context context = this.e;
                UMWorkDispatch.sendEvent(context, a.G, b.a(context).a(), null, PushUIConfig.dismissTime);
            }
            Context context2 = this.e;
            UMWorkDispatch.sendEvent(context2, o.a.y, CoreProtocol.getInstance(context2), null);
            Context context3 = this.e;
            UMWorkDispatch.sendEvent(context3, a.t, b.a(context3).a(), null);
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j2) {
        return null;
    }
}
