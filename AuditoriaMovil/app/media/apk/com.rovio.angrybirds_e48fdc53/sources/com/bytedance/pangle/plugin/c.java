package com.bytedance.pangle.plugin;

import android.content.ComponentCallbacks;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.bytedance.pangle.ComponentManager;
import com.bytedance.pangle.PluginClassLoader;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.ZeusApplication;
import com.bytedance.pangle.ZeusPluginEventCallback;
import com.bytedance.pangle.ZeusPluginStateListener;
import com.bytedance.pangle.c.b;
import com.bytedance.pangle.d.e;
import com.bytedance.pangle.e.g;
import com.bytedance.pangle.h;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.provider.ContentProviderManager;
import com.bytedance.pangle.res.PluginResources;
import com.bytedance.pangle.transform.ZeusTransformUtils;
import com.bytedance.pangle.util.FieldUtils;
import com.bytedance.pangle.util.MethodUtils;
import com.bytedance.pangle.util.i;
import com.bytedance.pangle.wrapper.PluginApplicationWrapper;
import com.facebook.share.internal.ShareConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c {
    private static final h a = h.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(String str) {
        Plugin plugin = PluginManager.getInstance().getPlugin(str);
        if (plugin == null) {
            ZeusLogger.w(ZeusLogger.TAG_LOAD, "PluginLoader loadPlugin, plugin == null, pkg = ".concat(String.valueOf(str)));
            return false;
        }
        synchronized (plugin) {
            if (!plugin.isInstalled()) {
                ZeusLogger.w(ZeusLogger.TAG_LOAD, "PluginLoader loadPlugin, UN_INSTALLED, ".concat(String.valueOf(str)));
                return false;
            } else if (plugin.isLoaded()) {
                return true;
            } else {
                h hVar = a;
                hVar.a(2000, 0, plugin.mPkgName, plugin.getVersion(), null);
                com.bytedance.pangle.log.a a2 = com.bytedance.pangle.log.a.a(ZeusLogger.TAG_LOAD, "PluginLoader", "loadPlugin:".concat(String.valueOf(str)));
                a(com.bytedance.pangle.c.b.g, b.a.D, plugin.mPkgName, plugin.getVersion(), -1L, (String) null);
                ZeusPluginStateListener.postStateChange(str, 8, new Object[0]);
                StringBuilder sb = new StringBuilder();
                boolean a3 = a(str, plugin, sb);
                a2.a("loadPluginInternal:".concat(String.valueOf(a3)));
                if (a3) {
                    plugin.setLifeCycle(3);
                    a(com.bytedance.pangle.c.b.h, b.a.E, plugin.mPkgName, plugin.getVersion(), a2.a(), sb.toString());
                    ZeusPluginStateListener.postStateChange(str, 9, new Object[0]);
                    hVar.a(ZeusPluginEventCallback.EVENT_FINISH_LOAD, 0, plugin.mPkgName, plugin.getVersion(), null);
                } else {
                    sb.append("plugin:");
                    sb.append(plugin.mPkgName);
                    sb.append(" versionCode:");
                    sb.append(plugin.getVersion());
                    sb.append("load failed;");
                    a(com.bytedance.pangle.c.b.h, b.a.F, plugin.mPkgName, plugin.getVersion(), -1L, sb.toString());
                    ZeusPluginStateListener.postStateChange(str, 10, new Object[0]);
                    hVar.a(ZeusPluginEventCallback.EVENT_FINISH_LOAD, -1, plugin.mPkgName, plugin.getVersion(), null);
                }
                ZeusLogger.i(ZeusLogger.TAG_LOAD, "PluginLoader loadFinished, ".concat(String.valueOf(plugin)));
                if (!plugin.isLoaded()) {
                    return false;
                }
                ZeusLogger.d(ZeusLogger.TAG_LOAD, "PluginLoader postResult, LOADED " + plugin.mPkgName);
                return true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x018e A[Catch: all -> 0x022b, TryCatch #0 {all -> 0x022b, blocks: (B:47:0x016a, B:49:0x018e, B:56:0x01b8, B:58:0x01be, B:59:0x01c1, B:61:0x01cb, B:63:0x0224, B:62:0x0201), top: B:76:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cb A[Catch: all -> 0x022b, TryCatch #0 {all -> 0x022b, blocks: (B:47:0x016a, B:49:0x018e, B:56:0x01b8, B:58:0x01be, B:59:0x01c1, B:61:0x01cb, B:63:0x0224, B:62:0x0201), top: B:76:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0201 A[Catch: all -> 0x022b, TryCatch #0 {all -> 0x022b, blocks: (B:47:0x016a, B:49:0x018e, B:56:0x01b8, B:58:0x01be, B:59:0x01c1, B:61:0x01cb, B:63:0x0224, B:62:0x0201), top: B:76:0x016a }] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(final java.lang.String r22, final com.bytedance.pangle.plugin.Plugin r23, final java.lang.StringBuilder r24) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.plugin.c.a(java.lang.String, com.bytedance.pangle.plugin.Plugin, java.lang.StringBuilder):boolean");
    }

    private static void a(Plugin plugin, StringBuilder sb, PackageInfo packageInfo) {
        ActivityInfo[] activityInfoArr = packageInfo.activities;
        if (activityInfoArr != null) {
            for (ActivityInfo activityInfo : activityInfoArr) {
                if (TextUtils.isEmpty(activityInfo.processName) || !activityInfo.processName.contains(":")) {
                    activityInfo.processName = "main";
                } else {
                    activityInfo.processName = activityInfo.processName.split(":")[1];
                }
                plugin.pluginActivities.put(activityInfo.name, activityInfo);
            }
        }
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (TextUtils.isEmpty(serviceInfo.processName) || !serviceInfo.processName.contains(":")) {
                    serviceInfo.processName = "main";
                } else {
                    serviceInfo.processName = serviceInfo.processName.split(":")[1];
                }
                plugin.pluginServices.put(serviceInfo.name, serviceInfo);
            }
        }
        ActivityInfo[] activityInfoArr2 = packageInfo.receivers;
        if (activityInfoArr2 != null) {
            for (ActivityInfo activityInfo2 : activityInfoArr2) {
                if (TextUtils.isEmpty(activityInfo2.processName) || !activityInfo2.processName.contains(":")) {
                    activityInfo2.processName = "main";
                } else {
                    activityInfo2.processName = activityInfo2.processName.split(":")[1];
                }
                plugin.pluginReceiver.put(activityInfo2.name, activityInfo2);
            }
        }
        ProviderInfo[] providerInfoArr = packageInfo.providers;
        if (providerInfoArr != null) {
            for (ProviderInfo providerInfo : providerInfoArr) {
                if (TextUtils.isEmpty(providerInfo.processName) || !providerInfo.processName.contains(":")) {
                    providerInfo.processName = "main";
                } else {
                    providerInfo.processName = providerInfo.processName.split(":")[1];
                }
                plugin.pluginProvider.put(providerInfo.name, providerInfo);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (plugin.pluginProvider != null && plugin.pluginProvider.size() > 0) {
            ContentProviderManager.getInstance().installContentProviders(plugin.pluginProvider.values(), plugin);
        }
        sb.append("installProvider cost:");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(";");
        long currentTimeMillis2 = System.currentTimeMillis();
        if (!TextUtils.isEmpty(packageInfo.applicationInfo.className)) {
            plugin.mApplication = (ZeusApplication) plugin.mClassLoader.loadClass(packageInfo.applicationInfo.className).newInstance();
            plugin.mApplication.attach(plugin, Zeus.getAppApplication());
        }
        sb.append("makeApplication cost:");
        sb.append(System.currentTimeMillis() - currentTimeMillis2);
        sb.append(";");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PackageInfo a(String str, final Plugin plugin, StringBuilder sb, String str2, File file) {
        long currentTimeMillis = System.currentTimeMillis();
        PackageInfo packageArchiveInfo = Zeus.getAppApplication().getPackageManager().getPackageArchiveInfo(str2, 143);
        plugin.mHostApplication = (PluginApplicationWrapper) ZeusTransformUtils.wrapperContext2Application(Zeus.getAppApplication(), plugin.mPkgName);
        plugin.mHostApplicationInfoHookSomeField = new ApplicationInfo(Zeus.getAppApplication().getApplicationInfo());
        plugin.mHostApplicationInfoHookSomeField.nativeLibraryDir = file.getAbsolutePath();
        plugin.mHostApplicationInfoHookSomeField.dataDir = plugin.mHostApplication.getDataDir().getAbsolutePath();
        plugin.mHostApplicationInfoHookSomeField.sourceDir = str2;
        if (TextUtils.isEmpty(packageArchiveInfo.applicationInfo.sourceDir)) {
            packageArchiveInfo.applicationInfo.sourceDir = str2;
        }
        if (TextUtils.isEmpty(packageArchiveInfo.applicationInfo.publicSourceDir)) {
            packageArchiveInfo.applicationInfo.publicSourceDir = str2;
        }
        plugin.mResources = new PluginResources(Zeus.getAppApplication().getPackageManager().getResourcesForApplication(packageArchiveInfo.applicationInfo), str);
        Zeus.getAppApplication().registerComponentCallbacks(new ComponentCallbacks() { // from class: com.bytedance.pangle.plugin.c.3
            @Override // android.content.ComponentCallbacks
            public final void onConfigurationChanged(Configuration configuration) {
                plugin.mResources.updateConfiguration(configuration, Zeus.getAppApplication().getResources().getDisplayMetrics());
            }

            @Override // android.content.ComponentCallbacks
            public final void onLowMemory() {
            }
        });
        sb.append("makeResources cost:");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(";");
        return packageArchiveInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Plugin plugin, String str, File file, File file2, StringBuilder sb) {
        long currentTimeMillis = System.currentTimeMillis();
        a(plugin, str, file, file2);
        sb.append("classLoader cost:");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(" ;");
        if (plugin.mOpenLoadClassOpt) {
            e.a(new Runnable() { // from class: com.bytedance.pangle.plugin.c.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        plugin.mClassLoader.setAllPluginClasses((HashSet) MethodUtils.invokeStaticMethod(plugin.mClassLoader.loadClass("com.volcengine.PluginClassHolder"), "getPluginClasses", new Object[0]));
                    } catch (Throwable th) {
                    }
                }
            });
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            String str2 = (String) FieldUtils.readStaticField(plugin.mClassLoader.loadClass("com.volcengine.StubConfig"), "actStubV1");
            if (str2 != null) {
                a(plugin, str2);
            }
        } catch (ClassNotFoundException e) {
        } catch (Throwable th) {
            sb.append("actStubV1 cost:");
            sb.append(System.currentTimeMillis() - currentTimeMillis2);
            sb.append(";");
            throw th;
        }
        sb.append("actStubV1 cost:");
        sb.append(System.currentTimeMillis() - currentTimeMillis2);
        sb.append(";");
    }

    private static void a(Plugin plugin, String str) {
        JSONObject optJSONObject;
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("mapping");
            HashMap hashMap = new HashMap();
            if (optJSONObject2 != null) {
                Iterator<String> keys = optJSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, optJSONObject2.getString(next));
                }
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("forceMappings");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    int optInt = jSONObject2.optInt("minApi", 0);
                    int optInt2 = jSONObject2.optInt("maxApi", Integer.MAX_VALUE);
                    int apiVersionCode = plugin.getApiVersionCode();
                    if (apiVersionCode <= optInt2 && apiVersionCode >= optInt && (optJSONObject = jSONObject2.optJSONObject("mapping")) != null) {
                        Iterator<String> keys2 = optJSONObject.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            hashMap.put(next2, optJSONObject.getString(next2));
                        }
                    }
                }
            }
            for (String str2 : hashMap.keySet()) {
                String str3 = (String) hashMap.get(str2);
                String str4 = plugin.mPkgName;
                StringBuilder sb = new StringBuilder();
                sb.append((str3 == null || !str3.contains(".")) ? plugin.mPkgName + "." : "");
                sb.append((String) hashMap.get(str2));
                ComponentManager.registerActivity(str4, sb.toString(), str2);
            }
        }
    }

    private static void a(String str, int i, String str2, int i2, long j, String str3) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.putOpt(MonitorConstants.STATUS_CODE, com.bytedance.pangle.log.b.a(Integer.valueOf(i)));
            jSONObject.putOpt("plugin_package_name", com.bytedance.pangle.log.b.a(str2));
            jSONObject.putOpt("version_code", com.bytedance.pangle.log.b.a(Integer.valueOf(i2)));
            jSONObject3.putOpt("duration", Integer.valueOf(com.bytedance.pangle.log.b.b(Long.valueOf(j))));
            jSONObject2.putOpt(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, com.bytedance.pangle.log.b.a(str3));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.bytedance.pangle.c.b.a().a(str, jSONObject, jSONObject3, jSONObject2);
    }

    private static void a(Object obj, String str) {
        try {
            MethodUtils.getAccessibleMethod(BaseDexClassLoader.class, "addDexPath", String.class).invoke(obj, str);
            ZeusLogger.i(ZeusLogger.TAG_LOAD, "PluginLoader createPluginClassLoader#addDexPath success >>>".concat(String.valueOf(str)));
        } catch (Throwable th) {
            ZeusLogger.errReport(ZeusLogger.TAG_LOAD, "PluginLoader createPluginClassLoader#addDexPath fail >>>".concat(String.valueOf(str)), th);
        }
    }

    private static void a(Plugin plugin, String str, File file, File file2) {
        if (i.k()) {
            plugin.mClassLoader = new PluginClassLoader("", file2, file.getAbsolutePath(), null);
            a(plugin.mClassLoader, str);
        } else if (i.b()) {
            String a2 = g.a(plugin.mPkgName, plugin.getVersion());
            String[] split = a2.split(":");
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = !com.bytedance.pangle.e.b.a(file2.getAbsolutePath(), split);
            ZeusLogger.d(ZeusLogger.TAG_LOAD, "useDirect:" + (System.currentTimeMillis() - currentTimeMillis) + " " + z);
            plugin.mClassLoader = new PluginClassLoader(z ? "" : a2, file2, file.getAbsolutePath(), null);
            if (z) {
                com.bytedance.pangle.dex.a.a(plugin.mClassLoader, plugin.mPkgName, plugin.getVersion());
            }
        } else {
            plugin.mClassLoader = new PluginClassLoader(str, file2, file.getAbsolutePath(), null);
        }
    }
}
