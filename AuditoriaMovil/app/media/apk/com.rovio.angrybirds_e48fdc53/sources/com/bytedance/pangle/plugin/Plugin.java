package com.bytedance.pangle.plugin;

import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.pangle.GlobalParam;
import com.bytedance.pangle.PluginClassLoader;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.ZeusApplication;
import com.bytedance.pangle.d.e;
import com.bytedance.pangle.g;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.util.k;
import com.bytedance.pangle.util.l;
import com.bytedance.pangle.wrapper.PluginApplicationWrapper;
import com.bytedance.sdk.openadsdk.live.TTLiveConstants;
import com.facebook.share.internal.ShareConstants;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class Plugin {
    public static final int LIFE_INSTALLED = 2;
    public static final int LIFE_LOADED = 3;
    public static final int LIFE_PENDING = 1;
    private static final String TAG = "Plugin";
    private int mApiVersionCode;
    public final String mAppKey;
    public final String mAppSecretKey;
    public ZeusApplication mApplication;
    public PluginClassLoader mClassLoader;
    public PluginApplicationWrapper mHostApplication;
    public ApplicationInfo mHostApplicationInfoHookSomeField;
    private volatile boolean mInitialized;
    private String mInternalPath;
    private int mInternalVersionCode;
    public boolean mIsSupportLibIso;
    public int mMaxVersionCode;
    public int mMinVersionCode;
    public final boolean mOpenLoadClassOpt;
    private String mPackageDir;
    public String mPkgName;
    public final boolean mReInstallInternalPluginByMd5;
    public Resources mResources;
    public String mSignature;
    public final boolean mUnInstallPluginWhenHostChange;
    public final boolean mUseMemoryForActivityIntent;
    private int mVersionCode;
    public String response;
    public HashMap<String, ActivityInfo> pluginActivities = new HashMap<>();
    public HashMap<String, ServiceInfo> pluginServices = new HashMap<>();
    public HashMap<String, ActivityInfo> pluginReceiver = new HashMap<>();
    public HashMap<String, ProviderInfo> pluginProvider = new HashMap<>();
    private volatile int mLifeCycle = 1;
    public final List<String> mSharedHostSos = new ArrayList();
    final Object installLock = new Object();
    final Object initializeLock = new Object();

    public Plugin(JSONObject jSONObject) {
        this.mInternalVersionCode = -1;
        this.mMaxVersionCode = Integer.MAX_VALUE;
        this.mPkgName = jSONObject.getString(DBDefinition.PACKAGE_NAME);
        this.mMinVersionCode = jSONObject.optInt("minPluginVersion", 0);
        this.mMaxVersionCode = jSONObject.optInt("maxPluginVersion", Integer.MAX_VALUE);
        this.mApiVersionCode = jSONObject.getInt(TTLiveConstants.LIVE_API_VERSION_KEY);
        String signature = GlobalParam.getInstance().getSignature(this.mPkgName);
        this.mSignature = signature;
        if (TextUtils.isEmpty(signature)) {
            this.mSignature = jSONObject.optString(InAppPurchaseMetaData.KEY_SIGNATURE, "");
        }
        this.mIsSupportLibIso = jSONObject.optBoolean("isSupportLibIsolate", false);
        this.mInternalPath = jSONObject.optString("internalPath", "");
        this.mInternalVersionCode = jSONObject.optInt("internalVersionCode", -1);
        this.mAppKey = jSONObject.optString("appKey", "");
        this.mAppSecretKey = jSONObject.optString("appSecretKey", "");
        this.mOpenLoadClassOpt = jSONObject.optBoolean("loadClassOpt", false);
        this.mUnInstallPluginWhenHostChange = jSONObject.optBoolean("unInstallPluginWhenHostChange", false);
        this.mUseMemoryForActivityIntent = jSONObject.optBoolean("useMemoryForActivityIntent", false);
        this.mReInstallInternalPluginByMd5 = jSONObject.optBoolean("reInstallInternalPluginByMd5", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("sharedHostSo");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.mSharedHostSos.add((String) optJSONArray.get(i));
            }
        }
        setupInternalPlugin();
    }

    private void setupInternalPlugin() {
        String[] list;
        int a;
        if (l.a().a.getInt(String.format(Locale.getDefault(), "OFFLINE_INTERNAL_%s", this.mPkgName), -1) == this.mApiVersionCode) {
            return;
        }
        if (!TextUtils.isEmpty(this.mInternalPath) && this.mInternalVersionCode != -1) {
            return;
        }
        try {
            for (String str : Zeus.getAppApplication().getAssets().list(g.d)) {
                if (str.startsWith(this.mPkgName + "_") && (a = k.a(str.split("_")[1])) != -1) {
                    this.mInternalPath = g.d + "/" + str;
                    this.mInternalVersionCode = a;
                    return;
                }
            }
        } catch (IOException e) {
            ZeusLogger.w(ZeusLogger.TAG_INSTALL, "setupInternalPlugin failed.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void init() {
        boolean z;
        l a;
        String str;
        if (this.mInitialized) {
            return;
        }
        synchronized (this.initializeLock) {
            if (this.mInitialized) {
                return;
            }
            if (com.bytedance.pangle.d.d.a(Zeus.getAppApplication())) {
                int i = 0;
                if (!(!TextUtils.isEmpty(l.a().a.getString("HOST_ABI_".concat(String.valueOf(this.mPkgName)), "")))) {
                    z = false;
                } else {
                    z = !TextUtils.equals(l.a().a.getString("HOST_ABI_".concat(String.valueOf(this.mPkgName)), ""), Zeus.getHostAbi());
                    ZeusLogger.i(ZeusLogger.TAG_INIT, "ZeusSpUtils isHostAbiUpdate HOST_ABI=" + a.a.getString("HOST_ABI_".concat(String.valueOf(str)), "") + ", " + Zeus.getHostAbi() + ", result=" + z);
                }
                deleteIfNeeded();
                int installedMaxVer = getInstalledMaxVer();
                if (checkVersionValid(installedMaxVer, this.mApiVersionCode, z)) {
                    i = modifyResIfNeed(installedMaxVer);
                    updateToInstalled(i);
                }
                deleteOtherExpiredVer(i);
                ZeusLogger.i(ZeusLogger.TAG_INIT, "Plugin initPlugins result=".concat(String.valueOf(this)));
                l a2 = l.a();
                String str2 = this.mPkgName;
                SharedPreferences.Editor edit = a2.a.edit();
                edit.putString("ROM_LAST_".concat(String.valueOf(str2)), Build.VERSION.INCREMENTAL);
                edit.apply();
                l a3 = l.a();
                String str3 = this.mPkgName;
                String string = a3.a.getString("HOST_ABI_".concat(String.valueOf(str3)), "");
                SharedPreferences.Editor edit2 = a3.a.edit();
                edit2.putString("HOST_ABI_".concat(String.valueOf(str3)), Zeus.getHostAbi());
                edit2.apply();
                ZeusLogger.i(ZeusLogger.TAG_INIT, "ZeusSpUtils setHostAbiUpdated HOST_ABI=" + string + " --> " + Zeus.getHostAbi());
                l a4 = l.a();
                String str4 = this.mPkgName;
                String a5 = com.bytedance.pangle.util.b.a(Zeus.getAppApplication());
                String b = a4.b(str4);
                if (!TextUtils.equals(b, a5)) {
                    SharedPreferences.Editor edit3 = a4.a.edit();
                    edit3.putString("HOST_IDENTITY_".concat(String.valueOf(str4)), a5);
                    edit3.apply();
                }
                ZeusLogger.i(ZeusLogger.TAG_INIT, "ZeusSpUtils setHostIdentity(" + str4 + ") " + b + " --> " + a5);
                l a6 = l.a();
                String str5 = this.mPkgName;
                int i2 = this.mApiVersionCode;
                int a7 = a6.a(str5);
                if (a7 != i2) {
                    SharedPreferences.Editor edit4 = a6.a.edit();
                    edit4.putInt("PLUGIN_API_VERSION_".concat(String.valueOf(str5)), i2);
                    edit4.apply();
                }
                ZeusLogger.i(ZeusLogger.TAG_INIT, "ZeusSpUtils setPluginApiVersion " + a7 + " --> " + i2);
            } else {
                updateInstallStateFromMainProcess();
            }
            this.mInitialized = true;
            installInternalPlugin();
        }
    }

    private void installInternalPlugin() {
        if (com.bytedance.pangle.d.d.a(Zeus.getAppApplication())) {
            if (this.mReInstallInternalPluginByMd5) {
                if (getVersion() > this.mInternalVersionCode) {
                    return;
                }
            } else if (getVersion() >= this.mInternalVersionCode) {
                return;
            }
            if (TextUtils.isEmpty(this.mInternalPath)) {
                return;
            }
            e.a(new Runnable() { // from class: com.bytedance.pangle.plugin.Plugin.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String b = com.bytedance.pangle.d.c.b();
                        File file = new File(b, Plugin.this.mPkgName + ".apk");
                        ZeusLogger.i(ZeusLogger.TAG_INIT, "Plugin copyInternalPlugin " + Plugin.this.mInternalPath + " --> " + file.getAbsolutePath());
                        com.bytedance.pangle.util.g.a(Zeus.getAppApplication().getAssets().open(Plugin.this.mInternalPath), new FileOutputStream(file));
                        if (file.exists()) {
                            PluginManager.getInstance().asyncInstall(Plugin.this.mPkgName, file);
                            return;
                        }
                        ZeusLogger.w(ZeusLogger.TAG_INSTALL, "installInternalPlugin failed. " + file.getAbsolutePath() + " is not exists.");
                    } catch (Throwable th) {
                        ZeusLogger.w(ZeusLogger.TAG_INSTALL, "installInternalPlugin failed. " + th.getMessage());
                    }
                }
            });
        }
    }

    private int modifyResIfNeed(int i) {
        String a = com.bytedance.pangle.util.b.a(Zeus.getAppApplication());
        if (TextUtils.isEmpty(a) || !TextUtils.equals(l.a().b(this.mPkgName), a)) {
            if (this.mUnInstallPluginWhenHostChange || GlobalParam.getInstance().unInstallPluginWhenHostChange(this.mPkgName)) {
                ZeusLogger.d(ZeusLogger.TAG_INIT, "uninstall plugin by host update. " + this.mPkgName + " " + i);
                return 0;
            }
            ZeusLogger.d(ZeusLogger.TAG_INIT, "modifyRes by init. " + this.mPkgName + " " + i);
            int a2 = new com.bytedance.pangle.res.a.c().a(new File(com.bytedance.pangle.d.c.b(this.mPkgName, i)), true, new StringBuilder());
            if (a2 == 100 || a2 == 200) {
                return i;
            }
            return 0;
        }
        return i;
    }

    public void setLifeCycle(int i) {
        this.mLifeCycle = i;
    }

    public int getLifeCycle() {
        updateInstallStateFromMainProcess();
        return this.mLifeCycle;
    }

    public int getApiVersionCode() {
        return this.mApiVersionCode;
    }

    public int getVersion() {
        updateInstallStateFromMainProcess();
        return this.mVersionCode;
    }

    public int getInternalVersionCode() {
        return this.mInternalVersionCode;
    }

    private void updateInstallStateFromMainProcess() {
        com.bytedance.pangle.c a;
        try {
            if (!com.bytedance.pangle.d.d.a(Zeus.getAppApplication()) && this.mLifeCycle < 2 && (a = com.bytedance.pangle.servermanager.b.a()) != null && a.a(this.mPkgName)) {
                updateToInstalled(a.b(this.mPkgName));
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("updateInstallStateFromMainProcess error. process = ");
            Zeus.getAppApplication();
            sb.append(com.bytedance.pangle.d.d.a());
            ZeusLogger.w(ZeusLogger.TAG_PPM, sb.toString(), th);
        }
    }

    public boolean isInstalled() {
        updateInstallStateFromMainProcess();
        return this.mLifeCycle >= 2;
    }

    private void updateToInstalled(int i) {
        this.mVersionCode = i;
        this.mLifeCycle = 2;
    }

    public boolean isLoaded() {
        return this.mLifeCycle == 3;
    }

    public int getInstalledMaxVer() {
        if (TextUtils.isEmpty(this.mPackageDir)) {
            this.mPackageDir = com.bytedance.pangle.d.c.a(this.mPkgName);
        }
        File[] listFiles = new File(this.mPackageDir).listFiles(new FileFilter() { // from class: com.bytedance.pangle.plugin.Plugin.2
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return file != null && file.getName().matches("^version-(\\d+)$");
            }
        });
        int i = -1;
        if (listFiles != null && listFiles.length > 0) {
            for (File file : listFiles) {
                int parseInt = Integer.parseInt(file.getName().split("-")[1]);
                if (parseInt > i && l.a().a(this.mPkgName, parseInt) && new File(com.bytedance.pangle.d.c.b(this.mPkgName, parseInt)).exists()) {
                    i = parseInt;
                }
            }
        }
        ZeusLogger.i(ZeusLogger.TAG_INIT, "Plugin getInstalledMaxVersion, pkg=" + this.mPkgName + ", maxVer=" + i);
        return i;
    }

    private boolean checkVersionValid(int i, int i2, boolean z) {
        boolean z2;
        int a = l.a().a(this.mPkgName);
        boolean z3 = false;
        if (a > i2) {
            ZeusLogger.w(ZeusLogger.TAG_INIT, TAG.concat(String.valueOf(String.format(" checkVersionValid %s apiVersion downgrade , lastApiVersion=%s , currentApiVersion=%s", this.mPkgName, Integer.valueOf(a), Integer.valueOf(i2)))));
            return false;
        }
        if (i >= 0 && i >= this.mMinVersionCode && i <= this.mMaxVersionCode) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && i2 != -1) {
            l a2 = l.a();
            String str = this.mPkgName;
            int i3 = a2.a.getInt("API_MIN_" + str + "_" + i, 0);
            l a3 = l.a();
            String str2 = this.mPkgName;
            int i4 = a3.a.getInt("API_MAX_" + str2 + "_" + i, Integer.MAX_VALUE);
            int i5 = i4 != 0 ? i4 : Integer.MAX_VALUE;
            if (i2 < i3 || i2 > i5) {
                ZeusLogger.w(ZeusLogger.TAG_INIT, TAG.concat(String.valueOf(String.format(" checkVersionValid plugin[%s, ver=%s] is not compatible with api[ver_code=%s], apiCompatibleVer=[%s,%s]", this.mPkgName, Integer.valueOf(this.mVersionCode), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i5)))));
                z2 = false;
            }
        }
        if (z2 && z && com.bytedance.pangle.d.b.b(new File(com.bytedance.pangle.d.c.b(this.mPkgName, i)))) {
            ZeusLogger.w(ZeusLogger.TAG_INIT, TAG.concat(String.valueOf(String.format(" checkVersionValid plugin[%s, ver=%s] not match hostAbi", this.mPkgName, Integer.valueOf(i)))));
        } else {
            z3 = z2;
        }
        ZeusLogger.i(ZeusLogger.TAG_INIT, "Plugin checkVersionValid, pkg=" + this.mPkgName + ", ver=" + this.mVersionCode + ", valid=" + z3);
        return z3;
    }

    private void deleteIfNeeded() {
        if (com.bytedance.pangle.d.d.a(Zeus.getAppApplication())) {
            if (l.a().a.getBoolean("UNINSTALL__".concat(String.valueOf(this.mPkgName)), false)) {
                l a = l.a();
                String str = this.mPkgName;
                SharedPreferences.Editor edit = a.a.edit();
                edit.remove("UNINSTALL__".concat(String.valueOf(str)));
                edit.apply();
                deleteInstalledPlugin();
                ZeusLogger.w(ZeusLogger.TAG_INIT, "Plugin deleteIfNeeded " + this.mPkgName);
            }
        }
    }

    private void deleteInstalledPlugin() {
        if (TextUtils.isEmpty(this.mPackageDir)) {
            this.mPackageDir = com.bytedance.pangle.d.c.a(this.mPkgName);
        }
        new File(this.mPackageDir).listFiles(new FileFilter() { // from class: com.bytedance.pangle.plugin.Plugin.3
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                if (file.getName().matches("^version-(\\d+)$")) {
                    l.a().a(Plugin.this.mPkgName, Integer.parseInt(file.getName().split("-")[1]), false);
                }
                return false;
            }
        });
        com.bytedance.pangle.util.g.a(this.mPackageDir);
    }

    private void deleteOtherExpiredVer(int i) {
        if (com.bytedance.pangle.d.d.a(Zeus.getAppApplication())) {
            if (TextUtils.isEmpty(this.mPackageDir)) {
                this.mPackageDir = com.bytedance.pangle.d.c.a(this.mPkgName);
            }
            final String concat = "version-".concat(String.valueOf(i));
            new File(this.mPackageDir).listFiles(new FileFilter() { // from class: com.bytedance.pangle.plugin.Plugin.4
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    if (file != null && !concat.equals(file.getName()) && !ShareConstants.WEB_DIALOG_PARAM_DATA.equals(file.getName())) {
                        com.bytedance.pangle.util.g.a(file.getAbsolutePath());
                        ZeusLogger.w(ZeusLogger.TAG_INIT, "Plugin deleteOtherExpired " + file.getAbsolutePath());
                        if (file.getName().matches("^version-(\\d+)$")) {
                            l.a().a(Plugin.this.mPkgName, Integer.parseInt(file.getName().split("-")[1]), false);
                        }
                    }
                    return false;
                }
            });
        }
    }

    public void setApiCompatVersion(int i, int i2, int i3) {
        l a = l.a();
        String str = this.mPkgName;
        SharedPreferences.Editor edit = a.a.edit();
        edit.putInt("API_MIN_" + str + "_" + i, i2);
        edit.putInt("API_MAX_" + str + "_" + i, i3);
        edit.apply();
    }

    public boolean isVersionInstalled(int i) {
        return l.a().a(this.mPkgName, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean install(File file, com.bytedance.pangle.f.a.e eVar) {
        boolean z = false;
        try {
            ZeusLogger.i(ZeusLogger.TAG_INSTALL, "Plugin install from local file " + file + ", " + Thread.currentThread().getName());
            String str = eVar.a;
            int i = eVar.b;
            synchronized (this.installLock) {
                ZeusLogger.i(ZeusLogger.TAG_INSTALL, "Plugin synchronized begin, plugin=".concat(String.valueOf(this)));
                boolean checkValid = checkValid(file, str, i);
                if (checkValid) {
                    String str2 = com.bytedance.pangle.util.c.a(file)[0];
                    z = b.a(file, str, i);
                    if (z) {
                        l a = l.a();
                        String str3 = this.mPkgName;
                        SharedPreferences.Editor edit = a.a.edit();
                        edit.putString("IDENTITY_".concat(String.valueOf(str3)), str2);
                        edit.apply();
                        l.a().a(this.mPkgName, i, true);
                        ZeusLogger.i(ZeusLogger.TAG_INSTALL, "Plugin markPluginInstalled, " + this.mPkgName + ":" + i + " identity=" + str2);
                        com.bytedance.pangle.util.g.a(file);
                    }
                }
                synchronized (this) {
                    if (checkValid) {
                        if (this.mLifeCycle != 3) {
                            if (z) {
                                updateToInstalled(i);
                                ZeusLogger.i(ZeusLogger.TAG_INSTALL, "Plugin INSTALLED " + str + ":" + i);
                            } else {
                                ZeusLogger.i(ZeusLogger.TAG_INSTALL, "Plugin INSTALL_FAILED" + str + ":" + i);
                                com.bytedance.pangle.util.g.a(file);
                                ZeusLogger.w(ZeusLogger.TAG_INSTALL, "Plugin delete file by failedCount > 0 " + str + ":" + i);
                            }
                        } else {
                            ZeusLogger.w(ZeusLogger.TAG_INSTALL, "Plugin LIFE_LOADED, valid next restart " + str + ":" + i);
                        }
                    } else {
                        com.bytedance.pangle.util.g.a(file);
                        ZeusLogger.w(ZeusLogger.TAG_INSTALL, "Plugin deleting invalid " + str + ":" + i);
                    }
                }
            }
        } catch (Throwable th) {
            ZeusLogger.errReport(ZeusLogger.TAG_INSTALL, "Plugin IMPOSSIBLE!!!", th);
        }
        return z;
    }

    private boolean checkValid(File file, String str, int i) {
        if (!TextUtils.equals(this.mPkgName, str)) {
            ZeusLogger.w(ZeusLogger.TAG_INSTALL, "Plugin checkValid " + str + " package name not match !!!");
            return false;
        } else if (i < this.mMinVersionCode || i > this.mMaxVersionCode) {
            String format = String.format(" pluginApk ver[%s] not match plugin VerRange[%s, %s].", Integer.valueOf(i), Integer.valueOf(this.mMinVersionCode), Integer.valueOf(this.mMaxVersionCode));
            ZeusLogger.w(ZeusLogger.TAG_INSTALL, "Plugin checkValid " + str + " " + format);
            return false;
        } else if (i < this.mVersionCode && isInstalled()) {
            String format2 = String.format(" pluginApk ver[%s] lower than installed plugin[%s].", Integer.valueOf(i), Integer.valueOf(this.mVersionCode));
            ZeusLogger.w(ZeusLogger.TAG_INSTALL, "Plugin checkValid " + str + format2);
            return false;
        } else if (file == null || !file.exists()) {
            ZeusLogger.w(ZeusLogger.TAG_INSTALL, "Plugin checkValid " + str + " pluginApk not exist.");
            return false;
        } else if (i == this.mVersionCode && l.a().a.getString("IDENTITY_".concat(String.valueOf(str)), "").equals(com.bytedance.pangle.util.c.a(file)[0])) {
            ZeusLogger.w(ZeusLogger.TAG_INSTALL, "Plugin checkValid " + str + " pluginApk with the same identity has already installed.");
            return false;
        } else {
            ZeusLogger.i(ZeusLogger.TAG_INSTALL, "Plugin checkValid " + str + ":" + i + " true");
            return true;
        }
    }

    public String getNativeLibraryDir() {
        int i = this.mVersionCode;
        if (i > 0) {
            return com.bytedance.pangle.d.c.d(this.mPkgName, i);
        }
        return com.bytedance.pangle.d.c.a(this.mPkgName);
    }

    public void injectResponse(String str) {
        this.response = str;
    }

    public String getInternalPath() {
        return this.mInternalPath;
    }

    public String toString() {
        return "Plugin{pkg=" + this.mPkgName + ", ver=" + this.mVersionCode + ", life=" + this.mLifeCycle + '}';
    }
}
