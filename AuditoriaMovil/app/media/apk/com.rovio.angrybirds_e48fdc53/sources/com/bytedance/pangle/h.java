package com.bytedance.pangle;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.pangle.apm.ApmUtils;
import com.bytedance.pangle.log.IZeusReporter;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.plugin.Plugin;
import com.bytedance.pangle.provider.ContentProviderManager;
import com.bytedance.pangle.servermanager.MainServerManager;
import com.bytedance.pangle.util.FieldUtils;
import com.bytedance.pangle.util.MethodUtils;
import com.bytedance.pangle.util.i;
import com.bytedance.pangle.util.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class h {
    private static volatile h d;
    boolean a;
    final List<ZeusPluginStateListener> b = new CopyOnWriteArrayList();
    final List<ZeusPluginEventCallback> c = new ArrayList();
    private final Handler e = new Handler(Looper.getMainLooper());

    public static h a() {
        if (d == null) {
            synchronized (h.class) {
                if (d == null) {
                    d = new h();
                }
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(Application application, boolean z) {
        if (this.a) {
            ZeusLogger.w(ZeusLogger.TAG_INIT, "ZeusManager zeus has been inited!");
            return;
        }
        a(3000, 0, null, -1, null);
        Zeus.setAppContext(application);
        GlobalParam globalParam = GlobalParam.getInstance();
        globalParam.init();
        if (application == null) {
            throw new IllegalArgumentException("context must be not null !!!");
        }
        ZeusLogger.setDebug(globalParam.isDebug());
        ZeusLogger.i(ZeusLogger.TAG_INIT, "ZeusManager init, context = " + application + ", hParam = " + globalParam);
        com.bytedance.pangle.d.e.a(new Runnable() { // from class: com.bytedance.pangle.h.1
            @Override // java.lang.Runnable
            public final void run() {
                j.b();
            }
        });
        if (GlobalParam.getInstance().isPostBgDexOptByInit()) {
            com.bytedance.pangle.e.f.a();
        }
        if (z) {
            Zeus.onPrivacyAgreed();
        }
        com.bytedance.pangle.c.b a = com.bytedance.pangle.c.b.a();
        com.bytedance.pangle.c.a aVar = new com.bytedance.pangle.c.a() { // from class: com.bytedance.pangle.h.2
            @Override // com.bytedance.pangle.c.a
            public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                String str2;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                String str3 = null;
                if (Zeus.getAppApplication() != null) {
                    Zeus.getAppApplication();
                    str3 = com.bytedance.pangle.d.d.a(com.bytedance.pangle.d.d.a());
                }
                if (Zeus.getAppApplication() == null) {
                    str2 = "";
                } else {
                    str2 = Zeus.getAppApplication().getPackageName();
                }
                if (str3 == null) {
                    str3 = "unknown";
                }
                try {
                    jSONObject.putOpt(ContentProviderManager.PLUGIN_PROCESS_NAME, com.bytedance.pangle.log.b.a(str3));
                    jSONObject.putOpt("host_package_name", str2);
                    Plugin plugin = Zeus.getPlugin(jSONObject.optString("plugin_package_name", ""), false);
                    int i = -1;
                    if (plugin != null) {
                        i = plugin.getApiVersionCode();
                    }
                    jSONObject.putOpt("plugin_api_version", com.bytedance.pangle.log.b.a(Integer.valueOf(i)));
                    jSONObject.putOpt("zeus_sdk_version", com.bytedance.pangle.log.b.a("0.0.1-beta.4200.115-pangle"));
                    ZeusLogger.v(ZeusLogger.TAG_REPORTER, "eventName: " + str + "\ncategoryData:" + jSONObject.toString(1) + "\nmetricData:" + jSONObject2.toString(1) + "\nlogExtrData:" + jSONObject3.toString(1));
                    IZeusReporter reporter = GlobalParam.getInstance().getReporter();
                    if (reporter != null) {
                        JSONObject jSONObject4 = new JSONObject();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject4.putOpt(next, jSONObject.opt(next));
                        }
                        Iterator<String> keys2 = jSONObject2.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            jSONObject4.putOpt(next2, jSONObject2.opt(next2));
                        }
                        Iterator<String> keys3 = jSONObject3.keys();
                        while (keys3.hasNext()) {
                            String next3 = keys3.next();
                            jSONObject4.putOpt(next3, jSONObject3.opt(next3));
                        }
                        reporter.report(str, jSONObject4);
                    }
                    ApmUtils.getApmInstance().monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
                } catch (JSONException e) {
                    ZeusLogger.w(ZeusLogger.TAG_REPORTER, e.getMessage(), e);
                }
            }
        };
        synchronized (a.a) {
            a.a.add(aVar);
        }
        if (!globalParam.isCloseFlipped()) {
            b.a();
        }
        if (Build.VERSION.SDK_INT == 29) {
            com.bytedance.pangle.d.e.a(new Runnable() { // from class: com.bytedance.pangle.h.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        MethodUtils.invokeStaticMethod(Class.forName("com.android.server.SystemConfig"), "getInstance", new Object[0]);
                    } catch (Throwable th) {
                    }
                }
            });
        }
        if (i.j()) {
            try {
                FieldUtils.writeField(com.bytedance.pangle.d.a.a(), "mHiddenApiWarningShown", Boolean.TRUE);
                ZeusLogger.w(ZeusLogger.TAG_INIT, "ZeusManager disableApiWarningShownForAndroidP, true");
            } catch (Exception e) {
                ZeusLogger.errReport(ZeusLogger.TAG_INIT, "disableApiWarningShownForAndroidP failed", e);
            }
        }
        b();
        ContentProviderManager.getInstance().initSystemContentProviderInfo();
        if (!globalParam.closeHookHuaweiOnInit()) {
            Zeus.hookHuaWeiVerifier(application);
        }
        this.a = true;
        a(ZeusPluginEventCallback.EVENT_FINISH_INITIALIZATION, 0, null, -1, null);
    }

    private static void b() {
        ProviderInfo[] providerInfoArr;
        String str;
        try {
            PackageInfo packageInfo = Zeus.getAppApplication().getPackageManager().getPackageInfo(Zeus.getAppApplication().getPackageName(), 8);
            if (packageInfo != null && packageInfo.providers != null) {
                for (ProviderInfo providerInfo : packageInfo.providers) {
                    if (!TextUtils.isEmpty(providerInfo.authority)) {
                        if (providerInfo.authority.contains(Zeus.getAppApplication().getPackageName() + ".pangle.servermanager.")) {
                            if (!TextUtils.isEmpty(providerInfo.processName) && providerInfo.processName.contains(":")) {
                                str = providerInfo.processName.split(":")[1];
                                if (Zeus.getServerManagerHashMap().get(str) != null || !TextUtils.equals(str, "main") || !TextUtils.equals(providerInfo.name, MainServerManager.class.getName())) {
                                    Zeus.getServerManagerHashMap().put(str, providerInfo);
                                }
                            }
                            str = "main";
                            if (Zeus.getServerManagerHashMap().get(str) != null) {
                            }
                            Zeus.getServerManagerHashMap().put(str, providerInfo);
                        }
                    }
                }
                return;
            }
            ZeusLogger.errReport(ZeusLogger.TAG_INIT, "initServerManager failed. packageInfo:".concat(String.valueOf(packageInfo)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final void a(final int i, final int i2, final String str, final int i3, final Throwable th) {
        Object[] c;
        for (final Object obj : c()) {
            this.e.post(new Runnable() { // from class: com.bytedance.pangle.h.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ((ZeusPluginEventCallback) obj).onPluginEvent(i, i2, str, i3, th);
                    } catch (Throwable th2) {
                    }
                }
            });
        }
    }

    private Object[] c() {
        Object[] objArr;
        synchronized (this.c) {
            if (this.c.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.c.toArray();
            }
        }
        if (objArr == null) {
            return new Object[0];
        }
        return objArr;
    }
}
