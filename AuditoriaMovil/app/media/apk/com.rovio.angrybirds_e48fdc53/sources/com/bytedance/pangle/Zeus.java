package com.bytedance.pangle;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.pm.ProviderInfo;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.apm.ApmUtils;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.plugin.Plugin;
import com.bytedance.pangle.plugin.PluginManager;
import com.bytedance.pangle.util.FieldUtils;
import com.bytedance.pangle.util.MethodUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public class Zeus {
    private static Application sApplication;
    private static final HashMap<String, ProviderInfo> serverManagerHashMap = new HashMap<>();
    static final Object wait = new Object();
    private static volatile boolean onPrivacyAgreed = false;

    public static Application getAppApplication() {
        if (sApplication == null) {
            b.a();
            try {
                sApplication = (Application) MethodUtils.invokeMethod(com.bytedance.pangle.d.a.a(), "getApplication", new Object[0]);
            } catch (Throwable th) {
            }
        }
        return sApplication;
    }

    public static void setAppContext(Application application) {
        if (application != null && TextUtils.equals(application.getClass().getSimpleName(), "PluginApplicationWrapper")) {
            try {
                sApplication = (Application) FieldUtils.readField(application, "mOriginApplication");
                return;
            } catch (Throwable th) {
            }
        }
        sApplication = application;
    }

    public static HashMap<String, ProviderInfo> getServerManagerHashMap() {
        return serverManagerHashMap;
    }

    public static void init(Application application, boolean z) {
        h.a().a(application, z);
        Object obj = wait;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public static boolean waitInit(int i) {
        if (h.a().a) {
            return true;
        }
        Object obj = wait;
        synchronized (obj) {
            if (!h.a().a) {
                try {
                    if (i == -1) {
                        obj.wait();
                    } else {
                        obj.wait(i);
                    }
                } catch (InterruptedException e) {
                }
            }
        }
        return h.a().a;
    }

    public static synchronized void onPrivacyAgreed() {
        synchronized (Zeus.class) {
            if (onPrivacyAgreed) {
                return;
            }
            ApmUtils.getApmInstance().init();
            onPrivacyAgreed = true;
        }
    }

    public static void hookHuaWeiVerifier(Application application) {
        com.bytedance.pangle.receiver.b.a(application);
    }

    public static void installFromDownloadDir() {
        if (com.bytedance.pangle.d.d.a(getAppApplication())) {
            PluginManager.getInstance().installFromDownloadDir();
        }
    }

    public static void triggerBgDexOpt() {
        com.bytedance.pangle.e.f.a();
    }

    public static boolean hasInit() {
        return h.a().a;
    }

    public static void fetchPlugin(final String str) {
        com.bytedance.pangle.download.a a = com.bytedance.pangle.download.a.a();
        if (!com.bytedance.pangle.d.d.a(getAppApplication())) {
            return;
        }
        if (GlobalParam.getInstance().autoFetch()) {
            final com.bytedance.pangle.download.b a2 = com.bytedance.pangle.download.b.a();
            Runnable runnable = a2.c.get(str);
            if (runnable != null) {
                a2.b.removeCallbacks(runnable);
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.pangle.download.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    List<ActivityManager.RunningTaskInfo> runningTasks;
                    Application appApplication = Zeus.getAppApplication();
                    String packageName = appApplication.getPackageName();
                    boolean z = true;
                    if (!TextUtils.isEmpty(packageName) && (runningTasks = ((ActivityManager) appApplication.getSystemService(TTDownloadField.TT_ACTIVITY)).getRunningTasks(1)) != null && !runningTasks.isEmpty()) {
                        ComponentName componentName = runningTasks.get(0).topActivity;
                        if (componentName == null || !packageName.equals(componentName.getPackageName())) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        b.this.b.postDelayed(this, 1800000L);
                    }
                }
            };
            a2.c.put(str, runnable2);
            a2.b.postDelayed(runnable2, 1800000L);
            com.bytedance.pangle.download.b.a();
            if (a.a.contains(str)) {
                return;
            }
            a.a.add(str);
            return;
        }
        com.bytedance.pangle.download.b.a();
    }

    public static void registerPluginStateListener(ZeusPluginStateListener zeusPluginStateListener) {
        h.a().b.add(zeusPluginStateListener);
    }

    public static void unregisterPluginStateListener(ZeusPluginStateListener zeusPluginStateListener) {
        h a = h.a();
        if (a.b == null) {
            return;
        }
        a.b.remove(zeusPluginStateListener);
    }

    public static void addPluginEventCallback(ZeusPluginEventCallback zeusPluginEventCallback) {
        h a = h.a();
        if (zeusPluginEventCallback == null) {
            return;
        }
        synchronized (a.c) {
            a.c.add(zeusPluginEventCallback);
        }
    }

    public static void removePluginEventCallback(ZeusPluginEventCallback zeusPluginEventCallback) {
        h a = h.a();
        if (zeusPluginEventCallback == null) {
            return;
        }
        synchronized (a.c) {
            a.c.remove(zeusPluginEventCallback);
        }
    }

    public static Plugin getPlugin(String str) {
        return getPlugin(str, true);
    }

    public static Plugin getPlugin(String str, boolean z) {
        return PluginManager.getInstance().getPlugin(str, z);
    }

    public static boolean isPluginInstalled(String str) {
        Plugin plugin = PluginManager.getInstance().getPlugin(str);
        return plugin != null && plugin.isInstalled();
    }

    public static boolean isPluginLoaded(String str) {
        return PluginManager.getInstance().isLoaded(str);
    }

    public static boolean loadPlugin(String str) {
        return PluginManager.getInstance().loadPlugin(str);
    }

    public static boolean syncInstallPlugin(String str, String str2) {
        c a = com.bytedance.pangle.servermanager.b.a();
        if (a != null) {
            try {
                return a.a(str, str2);
            } catch (RemoteException e) {
                ZeusLogger.w(ZeusLogger.TAG_INSTALL, "syncInstallPlugin error.", e);
                return false;
            }
        }
        return false;
    }

    public static void unInstallPlugin(String str) {
        PluginManager.getInstance().unInstallPackage(str);
    }

    public static void setAllowDownloadPlugin(String str, int i, boolean z) {
        PluginManager.getInstance().setAllowDownloadPlugin(str, i, z);
    }

    public static String getHostAbi() {
        return com.bytedance.pangle.d.b.a();
    }

    public static int getMaxInstallVer(String str) {
        if (com.bytedance.pangle.d.d.a(getAppApplication())) {
            return getPlugin(str).getInstalledMaxVer();
        }
        return -1;
    }

    public static int getHostAbiBit() {
        return com.bytedance.pangle.d.b.b();
    }

    public static int getInstalledPluginVersion(String str) {
        Plugin plugin = PluginManager.getInstance().getPlugin(str);
        if (plugin == null) {
            return -1;
        }
        int version = plugin.getVersion();
        ZeusLogger.d(ZeusLogger.TAG_DOWNLOAD, " getInstalledPluginVersion, " + str + " = " + version);
        return version;
    }

    public static void addExternalAssetsForPlugin(String str, String str2) {
        Plugin plugin;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (plugin = getPlugin(str)) != null && plugin.mResources != null) {
            new com.bytedance.pangle.res.a().a(plugin.mResources.getAssets(), str2, false);
        }
    }

    public static String getZeusDid() {
        String did = GlobalParam.getInstance().getDid();
        if (!TextUtils.isEmpty(did)) {
            return did;
        }
        return ApmUtils.getApmInstance().getDid();
    }
}
