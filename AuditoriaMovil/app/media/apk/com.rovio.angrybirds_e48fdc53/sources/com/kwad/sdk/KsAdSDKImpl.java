package com.kwad.sdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.kwad.components.core.request.f;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.library.solder.lib.i;
import com.kwad.sdk.api.KsInitCallback;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.SdkConfig;
import com.kwad.sdk.api.core.IKsAdSDK;
import com.kwad.sdk.api.core.KsAdSdkDynamicImpl;
import com.kwad.sdk.api.loader.DynamicInstallReceiver;
import com.kwad.sdk.api.proxy.BaseProxyActivity;
import com.kwad.sdk.api.proxy.BaseProxyFragmentActivity;
import com.kwad.sdk.api.proxy.IComponentProxy;
import com.kwad.sdk.core.imageloader.ImageLoaderPerfUtil;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.SdkConfigData;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ap;
import com.kwad.sdk.utils.au;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.ax;
import com.kwad.sdk.utils.bg;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.utils.y;
import java.io.File;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
@KsAdSdkDynamicImpl(IKsAdSDK.class)
/* loaded from: classes.dex */
public class KsAdSDKImpl implements IKsAdSDK {
    private static final String TAG = "KSAdSDK";
    private boolean adxEnable;
    private boolean isExternal;
    private KsLoadManager mAdRequestManager;
    private int mApiVersionCode;
    private String mApiVersionName;
    private String mAppTag;
    private long mInitTime;
    private volatile boolean mIsSdkInit;
    private long mLaunchTime;
    private volatile boolean personalRecommend;
    private boolean programmaticRecommend;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private static final KsAdSDKImpl ahq = new KsAdSDKImpl();
    }

    private KsAdSDKImpl() {
        this.mIsSdkInit = false;
        this.mApiVersionName = "";
        this.personalRecommend = true;
        this.programmaticRecommend = true;
        this.adxEnable = false;
    }

    @KsAdSdkDynamicImpl(IKsAdSDK.class)
    public static KsAdSDKImpl get() {
        return a.ahq;
    }

    private void initApkClean() {
        try {
            com.kwad.sdk.core.diskcache.a.aU(getContext());
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initAppTag() {
        y.ad(ServiceProvider.getContext(), this.mAppTag);
        this.mAppTag = null;
    }

    private void initCommercialLogger() {
        try {
            KSLoggerReporter.a(new KSLoggerReporter.a() { // from class: com.kwad.sdk.KsAdSDKImpl.1
                @Override // com.kwad.sdk.core.report.KSLoggerReporter.a
                public final void j(String str, String str2, boolean z) {
                    com.kwad.components.core.p.a.pC().e(str, str2, false);
                }

                @Override // com.kwad.sdk.core.report.KSLoggerReporter.a
                public final boolean xk() {
                    return com.kwad.sdk.core.config.d.b(com.kwad.sdk.core.config.c.akL);
                }

                @Override // com.kwad.sdk.core.report.KSLoggerReporter.a
                public final JSONObject xl() {
                    return com.kwad.sdk.core.config.d.a(com.kwad.sdk.core.config.c.akW);
                }
            });
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initComponents() {
        try {
            com.kwad.sdk.components.b.init(ServiceProvider.getContext());
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initComponentsManager() {
        try {
            com.kwad.sdk.components.c.init(getContext());
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initConfigRequestManager() {
        try {
            com.kwad.components.core.request.f.a(ServiceProvider.getContext(), new f.a() { // from class: com.kwad.sdk.KsAdSDKImpl.4
                @Override // com.kwad.components.core.request.f.a
                public final void a(SdkConfigData sdkConfigData) {
                    com.kwad.sdk.core.e.c.i(KsAdSDKImpl.TAG, "onConfigRefresh()");
                    try {
                        KsAdSDKImpl.this.initOnConfigRefresh(sdkConfigData);
                    } catch (Throwable th) {
                        com.kwad.components.core.d.a.b(th);
                    }
                }

                @Override // com.kwad.components.core.request.f.a
                public final void pJ() {
                    com.kwad.sdk.core.e.c.J(KsAdSDKImpl.TAG, "onCacheLoaded()");
                    if (((com.kwad.components.a.a.a) com.kwad.sdk.components.c.f(com.kwad.components.a.a.a.class)) != null) {
                        ServiceProvider.getContext();
                    }
                }
            });
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initDownload() {
        try {
            com.kwad.sdk.core.download.a.aV(ServiceProvider.getContext());
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initExceptionModule() {
        try {
            com.kwad.components.core.d.a.initAsync(ServiceProvider.getContext());
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initHybrid() {
        try {
            com.kwad.sdk.core.webview.b.a.Ed().init(getContext());
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initIDC() {
        try {
            com.kwad.sdk.core.network.idc.a.Bm().init(getContext());
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initInstalledReceiver() {
        try {
            com.kwad.sdk.b.b.yy().checkInit();
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initKSPlugin() {
        try {
            com.kwad.sdk.m.e.KM().init();
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initLifecycleHolder() {
        try {
            com.kwad.sdk.core.c.b.AT().init(ServiceProvider.getContext());
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initLottie() {
    }

    private void initOAID() {
        try {
            com.kwad.sdk.core.f.a.initAsync(getContext());
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initOfflineComponents() {
        try {
            com.kwad.components.core.n.b.b.init(getContext());
        } catch (Throwable th) {
            m.k(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initOnConfigRefresh(SdkConfigData sdkConfigData) {
        com.kwad.sdk.components.c.f(com.kwad.components.a.a.a.class);
        initHybrid();
        com.kwad.sdk.core.config.d.xr();
        if (com.kwad.sdk.core.config.d.zc() || com.kwad.framework.a.a.mp.booleanValue()) {
            DynamicInstallReceiver.registerToApp(ServiceProvider.getContext());
        }
        if (com.kwad.sdk.core.config.d.zM()) {
            com.kwad.sdk.c.a.init(com.kwad.sdk.m.l.KR());
        }
        initSpeedLimitConfig();
        ax.init(getContext());
        com.kwad.components.core.a.a.mh().eZ();
        com.kwad.sdk.utils.f.a(getContext(), 30000L, new com.kwad.sdk.collector.h() { // from class: com.kwad.sdk.KsAdSDKImpl.5
            @Override // com.kwad.sdk.collector.h
            public final void c(JSONArray jSONArray) {
                com.kwad.components.core.p.a.pC().c(jSONArray);
            }
        });
        com.kwad.sdk.core.network.idc.a.Bm().a(com.kwad.sdk.core.config.d.zN());
        bg.a(com.kwad.sdk.core.config.d.zO(), com.kwad.sdk.core.config.d.zP(), ServiceProvider.getContext());
        initInstalledReceiver();
        initApkClean();
        com.kwad.components.core.h.a.oc().ac(getContext());
        com.kwad.sdk.crash.online.monitor.a.dG(com.kwad.sdk.core.config.d.a(com.kwad.sdk.core.config.c.amt));
        ImageLoaderPerfUtil.report();
        com.kwad.sdk.ranger.e.dG(com.kwad.sdk.core.config.d.a(com.kwad.sdk.core.config.c.amx));
        com.kwad.sdk.core.threads.c.dG(com.kwad.sdk.core.config.d.a(com.kwad.sdk.core.config.c.amy));
        com.kwad.sdk.i.b.Gd();
        com.kwad.sdk.m.l.x(getContext(), ((Boolean) com.kwad.sdk.core.config.d.zv().getAppConfigData(Boolean.FALSE, new com.kwad.sdk.g.b<JSONObject, Boolean>() { // from class: com.kwad.sdk.KsAdSDKImpl.6
            private static Boolean f(JSONObject jSONObject) {
                return Boolean.valueOf(jSONObject.optBoolean("useContextClassLoader"));
            }

            @Override // com.kwad.sdk.g.b
            public final /* synthetic */ Boolean apply(JSONObject jSONObject) {
                return f(jSONObject);
            }
        })).booleanValue());
    }

    private void initPackCheck() {
        try {
            com.kwad.components.core.t.k.qq().init();
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initPrivateData() {
        try {
            au.init(getContext());
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initSDKModule() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.mInitTime = elapsedRealtime;
        com.kwad.sdk.service.b.init();
        j.xn();
        initSdkLog();
        initKSPlugin();
        initCommercialLogger();
        l.R(this.mLaunchTime);
        initComponents();
        initOAID();
        initIDC();
        initDownload();
        initSOLoader();
        initAppTag();
        initConfigRequestManager();
        initExceptionModule();
        initComponentsManager();
        initOfflineComponents();
        initLifecycleHolder();
        initLottie();
        initPrivateData();
        initPackCheck();
        com.kwad.sdk.a.a.c.xY().ya();
        com.kwad.components.core.p.a.pC().pD();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        com.kwad.sdk.core.e.c.d(TAG, "KSAdSDK init time:" + elapsedRealtime2);
        l.S(elapsedRealtime2);
        notifyInitSuccess(ServiceProvider.HB());
        com.kwad.sdk.i.a.report();
        this.mIsSdkInit = true;
    }

    private void initSOLoader() {
        try {
            com.kwad.library.solder.lib.i.a(new i.a() { // from class: com.kwad.sdk.KsAdSDKImpl.8
                @Override // com.kwad.library.solder.lib.i.a
                public final void b(String str, File file) {
                    com.kwad.sdk.core.download.a.a(str, file, true);
                }

                @Override // com.kwad.library.solder.lib.i.a
                public final void d(String str, Throwable th) {
                    if (th instanceof Exception) {
                        com.kwad.sdk.core.network.idc.a.Bm().f(str, th);
                    }
                }

                @Override // com.kwad.library.solder.lib.i.a
                public final int getMaxRetryCount() {
                    return com.kwad.sdk.core.config.d.a(com.kwad.sdk.core.config.c.alU);
                }

                @Override // com.kwad.library.solder.lib.i.a
                public final boolean wl() {
                    return com.kwad.sdk.core.config.d.a(com.kwad.sdk.core.config.c.alT);
                }
            });
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initSdkLog() {
        try {
            com.kwad.sdk.core.e.c.a(ServiceProvider.HB().enableDebug, new com.kwad.sdk.core.e.a.a() { // from class: com.kwad.sdk.KsAdSDKImpl.7
                @Override // com.kwad.sdk.core.e.a.a
                public final void z(String str, String str2) {
                    com.kwad.sdk.core.report.m mVar = new com.kwad.sdk.core.report.m();
                    mVar.arh = str;
                    KSLoggerReporter.a(mVar, str2);
                }
            });
        } catch (Throwable th) {
            m.k(th);
        }
    }

    private void initSpeedLimitConfig() {
        com.kwad.components.core.q.b.pN();
        com.kwad.components.core.q.b.e(com.kwad.sdk.core.config.d.zf(), com.kwad.sdk.core.config.d.zg());
    }

    private boolean isRemoteService(Context context) {
        String processName = ap.getProcessName(context);
        return !TextUtils.isEmpty(processName) && processName.endsWith("kssdk_remote");
    }

    public static void notifyInitFail(SdkConfig sdkConfig, final f fVar) {
        if (sdkConfig != null) {
            try {
                final KsInitCallback ksInitCallback = sdkConfig.ksInitCallback;
                if (ksInitCallback != null) {
                    bj.postOnUiThread(new aw() { // from class: com.kwad.sdk.KsAdSDKImpl.2
                        @Override // com.kwad.sdk.utils.aw
                        public final void doTask() {
                            KsInitCallback.this.onFail(fVar.code, fVar.msg);
                        }
                    });
                }
            } catch (Throwable th) {
            }
        }
    }

    public static void notifyInitSuccess(SdkConfig sdkConfig) {
        if (sdkConfig != null) {
            try {
                final KsInitCallback ksInitCallback = sdkConfig.ksInitCallback;
                if (ksInitCallback != null) {
                    bj.postOnUiThread(new aw() { // from class: com.kwad.sdk.KsAdSDKImpl.3
                        @Override // com.kwad.sdk.utils.aw
                        public final void doTask() {
                            KsInitCallback.this.onSuccess();
                        }
                    });
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void addHp(Map<String, String> map) {
        com.kwad.sdk.core.a.d.e(map);
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public Object dM(String str, Object... objArr) {
        if ("autoRT".equals(str)) {
            return -1;
        }
        if ("getAutoRevertTime".equals(str)) {
            return 10000;
        }
        boolean z = false;
        if ("TRANSFORM_API_HOST".equals(str)) {
            return com.kwad.sdk.core.network.idc.a.Bm().O(objArr[0].toString(), "api");
        }
        if ("reportDynamicUpdate".equals(str)) {
            KSLoggerReporter.r((JSONObject) objArr[0]);
            return Boolean.TRUE;
        } else if ("enableDynamic".equals(str)) {
            if (ap.isInMainProcess(ServiceProvider.getContext()) && com.kwad.framework.a.a.aap.booleanValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else {
            return null;
        }
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void deleteCache() {
        com.kwad.sdk.core.diskcache.b.a.At().delete();
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public KsLoadManager getAdManager() {
        if (this.mAdRequestManager == null) {
            this.mAdRequestManager = new com.kwad.components.core.b();
        }
        return this.mAdRequestManager;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public String getApiVersion() {
        return this.mApiVersionName;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public int getApiVersionCode() {
        return this.mApiVersionCode;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public String getAppId() {
        return ServiceProvider.HB().appId;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public JSONObject getAppInfo() {
        return com.kwad.sdk.core.request.model.a.Cq();
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public String getAppName() {
        return ServiceProvider.HB().appName;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public Context getContext() {
        return ServiceProvider.getContext();
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public JSONObject getDeviceInfo() {
        return com.kwad.sdk.core.request.model.b.Cs().toJson();
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public String getDid() {
        return au.getDeviceId();
    }

    public boolean getIsExternal() {
        return this.isExternal;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public JSONObject getNetworkInfo() {
        return com.kwad.sdk.core.request.model.d.Cv().toJson();
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public String getRD(String str) {
        return com.kwad.sdk.core.a.d.getResponseData(str);
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public String getRM(String str) {
        return com.kwad.sdk.core.a.d.cQ(str);
    }

    public long getSDKInitTime() {
        return this.mInitTime;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public int getSDKType() {
        return 1;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public String getSDKVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public int getSDKVersionCode() {
        return BuildConfig.VERSION_CODE;
    }

    public boolean hasInitFinish() {
        return this.mIsSdkInit;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public synchronized void init(Context context, SdkConfig sdkConfig) {
        if (context != null && sdkConfig != null) {
            try {
            } catch (Throwable th) {
                Log.e(TAG, "init error", th);
                notifyInitFail(sdkConfig, new f(10002, Log.getStackTraceString(th)));
            }
            if (!TextUtils.isEmpty(sdkConfig.appId)) {
                Log.d(TAG, "init appId:" + sdkConfig.appId + "--mIsSdkInit:" + this.mIsSdkInit);
                if (this.mIsSdkInit) {
                    ServiceProvider.a(sdkConfig);
                    return;
                }
                ServiceProvider.a(sdkConfig);
                ServiceProvider.bE(context);
                if (isRemoteService(context)) {
                    Log.d(TAG, "intKSRemoteProcess appId=" + sdkConfig.appId);
                    ServiceProvider.Hz();
                    j.xn();
                    initSdkLog();
                    this.mIsSdkInit = true;
                } else {
                    m.xS();
                    initSDKModule();
                }
                return;
            }
        }
        Log.e(TAG, "KSAdSDK SDKInit:init error,please check appID and config item");
        notifyInitFail(sdkConfig, f.ahg);
    }

    public boolean isAdxEnable() {
        return this.adxEnable;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public boolean isDebugLogEnable() {
        return ServiceProvider.HB().enableDebug;
    }

    public boolean isPersonalRecommend() {
        return this.personalRecommend;
    }

    public boolean isProgrammaticRecommend() {
        return this.programmaticRecommend;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public <T extends IComponentProxy> T newComponentProxy(Class<?> cls, Object obj) {
        try {
            Class g = com.kwad.sdk.service.b.g(cls);
            if (g == null) {
                if (obj instanceof BaseProxyActivity) {
                    g = com.kwad.components.core.o.a.class;
                } else if (obj instanceof BaseProxyFragmentActivity) {
                    g = com.kwad.components.core.o.b.class;
                }
                com.kwad.components.core.d.a.b(new RuntimeException("--getIsExternal:" + getIsExternal() + "--mIsSdkInit:" + hasInitFinish() + "--componentClass" + cls));
            }
            return (T) g.newInstance();
        } catch (Exception e) {
            com.kwad.components.core.d.a.b(e);
            com.kwad.sdk.core.e.c.printStackTrace(e);
            return null;
        }
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public <T> T newInstance(Class<T> cls) {
        try {
            return (T) com.kwad.sdk.service.b.h(cls).newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void pauseCurrentPlayer() {
        com.kwad.sdk.components.c.f(com.kwad.components.a.a.a.class);
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void re(Object obj) {
        if (obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            if (com.kwad.framework.a.a.mp.booleanValue()) {
                th.printStackTrace();
            }
            com.kwad.components.core.d.a.b(th);
        }
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void reportBatchEvent(int i, Map<String, Object> map) {
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void resumeCurrentPlayer() {
        com.kwad.sdk.components.c.f(com.kwad.components.a.a.a.class);
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void sR(String str, Map<String, String> map, String str2) {
        com.kwad.sdk.core.a.d.a(str, map, str2);
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void setAdxEnable(boolean z) {
        this.adxEnable = z;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void setApiVersion(String str) {
        this.mApiVersionName = str;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void setApiVersionCode(int i) {
        this.mApiVersionCode = i;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void setAppTag(String str) {
        if (this.mIsSdkInit) {
            y.ad(ServiceProvider.getContext(), this.mAppTag);
        } else {
            this.mAppTag = str;
        }
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void setIsExternal(boolean z) {
        this.isExternal = z;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void setLaunchTime(long j) {
        this.mLaunchTime = j;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void setLoadingLottieAnimation(boolean z, int i) {
        com.kwad.sdk.components.c.f(com.kwad.components.a.a.a.class);
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void setLoadingLottieAnimationColor(boolean z, int i) {
        com.kwad.sdk.components.c.f(com.kwad.components.a.a.a.class);
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void setPersonalRecommend(boolean z) {
        this.personalRecommend = z;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void setProgrammaticRecommend(boolean z) {
        this.programmaticRecommend = z;
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void setThemeMode(int i) {
        com.kwad.sdk.components.c.f(com.kwad.components.a.a.a.class);
    }

    @Override // com.kwad.sdk.api.core.IKsAdSDK
    public void unInit() {
        com.kwad.sdk.core.download.c.Av().aX(getContext());
    }
}
