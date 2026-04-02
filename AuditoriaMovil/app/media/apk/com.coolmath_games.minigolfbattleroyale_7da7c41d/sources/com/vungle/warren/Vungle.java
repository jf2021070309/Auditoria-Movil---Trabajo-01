package com.vungle.warren;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vungle.warren.AdConfig;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.VungleSettings;
import com.vungle.warren.downloader.DownloadRequest;
import com.vungle.warren.downloader.Downloader;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.log.LogManager;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.VisionDataDBAdapter;
import com.vungle.warren.persistence.CacheManager;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.FutureResult;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.tasks.AnalyticsJob;
import com.vungle.warren.tasks.JobRunner;
import com.vungle.warren.ui.JavascriptBridge;
import com.vungle.warren.ui.VungleActivity;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.view.VungleNativeView;
import com.vungle.warren.utility.ActivityManager;
import com.vungle.warren.utility.Executors;
import com.vungle.warren.utility.TimeoutProvider;
import com.vungle.warren.utility.platform.Platform;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public class Vungle {
    private static volatile boolean isInitialized;
    private volatile String appID;
    private volatile String consentVersion;
    private Context context;
    static final Vungle _instance = new Vungle();
    private static final String TAG = Vungle.class.getCanonicalName();
    private static AtomicBoolean isInitializing = new AtomicBoolean(false);
    private static AtomicBoolean isDepInit = new AtomicBoolean(false);
    private static CacheManager.Listener cacheListener = new CacheManager.Listener() { // from class: com.vungle.warren.Vungle.16
        @Override // com.vungle.warren.persistence.CacheManager.Listener
        public void onCacheChanged() {
            if (Vungle._instance.context == null) {
                return;
            }
            Vungle.stopPlaying();
            ServiceLocator serviceLocator = ServiceLocator.getInstance(Vungle._instance.context);
            CacheManager cacheManager = (CacheManager) serviceLocator.getService(CacheManager.class);
            Downloader downloader = (Downloader) serviceLocator.getService(Downloader.class);
            if (cacheManager.getCache() != null) {
                List<DownloadRequest> allRequests = downloader.getAllRequests();
                String path = cacheManager.getCache().getPath();
                for (DownloadRequest downloadRequest : allRequests) {
                    if (!downloadRequest.path.startsWith(path)) {
                        downloader.cancel(downloadRequest);
                    }
                }
            }
            downloader.init();
        }
    };
    private final AtomicReference<Consent> consent = new AtomicReference<>();
    private final AtomicReference<Consent> ccpaStatus = new AtomicReference<>();
    private Map<String, Boolean> playOperations = new ConcurrentHashMap();
    private Gson gson = new GsonBuilder().create();
    private AtomicInteger hbpOrdinalViewCount = new AtomicInteger(0);

    /* loaded from: classes2.dex */
    public enum Consent {
        OPTED_IN,
        OPTED_OUT
    }

    private Vungle() {
    }

    static Context getAppContext() {
        return _instance.context;
    }

    @Deprecated
    public static void init(Collection<String> collection, String str, Context context, InitCallback initCallback) throws IllegalArgumentException {
        init(str, context, initCallback, new VungleSettings.Builder().build());
    }

    public static void init(String str, Context context, InitCallback initCallback) throws IllegalArgumentException {
        init(str, context, initCallback, new VungleSettings.Builder().build());
    }

    public static void init(final String str, final Context context, InitCallback initCallback, VungleSettings vungleSettings) throws IllegalArgumentException {
        VungleLogger.debug("Vungle#init", "init request");
        if (initCallback == null) {
            throw new IllegalArgumentException("A valid InitCallback required to ensure API calls are being made after initialize is successful");
        }
        if (context == null) {
            initCallback.onError(new VungleException(6));
            return;
        }
        final ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
        if (!((Platform) serviceLocator.getService(Platform.class)).isAtLeastMinimumSDK()) {
            Log.e(TAG, "SDK is supported only for API versions 21 and above");
            initCallback.onError(new VungleException(35));
            return;
        }
        final RuntimeValues runtimeValues = (RuntimeValues) ServiceLocator.getInstance(context).getService(RuntimeValues.class);
        runtimeValues.settings.set(vungleSettings);
        Executors executors = (Executors) serviceLocator.getService(Executors.class);
        if (!(initCallback instanceof InitCallbackWrapper)) {
            initCallback = new InitCallbackWrapper(executors.getUIExecutor(), initCallback);
        }
        if (str == null || str.isEmpty()) {
            initCallback.onError(new VungleException(6));
        } else if (!(context instanceof Application)) {
            initCallback.onError(new VungleException(7));
        } else if (isInitialized()) {
            Log.d(TAG, "init already complete");
            initCallback.onSuccess();
            VungleLogger.debug("Vungle#init", "init already complete");
        } else if (isInitializing.getAndSet(true)) {
            Log.d(TAG, "init ongoing");
            onInitError(initCallback, new VungleException(8));
        } else if (PermissionChecker.checkCallingOrSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0 || PermissionChecker.checkCallingOrSelfPermission(context, "android.permission.INTERNET") != 0) {
            Log.e(TAG, "Network permissions not granted");
            onInitError(initCallback, new VungleException(34));
            isInitializing.set(false);
        } else {
            runtimeValues.initCallback.set(initCallback);
            executors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.1
                @Override // java.lang.Runnable
                public void run() {
                    Vungle._instance.appID = str;
                    InitCallback initCallback2 = runtimeValues.initCallback.get();
                    if (!Vungle.isDepInit.getAndSet(true)) {
                        VungleLogger.setupLoggerWithLogLevel((LogManager) serviceLocator.getService(LogManager.class), VungleLogger.LoggerLevel.DEBUG, 100);
                        CacheManager cacheManager = (CacheManager) serviceLocator.getService(CacheManager.class);
                        VungleSettings vungleSettings2 = runtimeValues.settings.get();
                        if (vungleSettings2 == null || cacheManager.getBytesAvailable() >= vungleSettings2.getMinimumSpaceForInit()) {
                            cacheManager.addListener(Vungle.cacheListener);
                            Vungle._instance.context = context;
                            Repository repository = (Repository) serviceLocator.getService(Repository.class);
                            try {
                                repository.init();
                                VungleApiClient vungleApiClient = (VungleApiClient) serviceLocator.getService(VungleApiClient.class);
                                vungleApiClient.init();
                                if (vungleSettings2 != null) {
                                    vungleApiClient.setDefaultIdFallbackDisabled(vungleSettings2.getAndroidIdOptOut());
                                }
                                ((AdLoader) serviceLocator.getService(AdLoader.class)).init((JobRunner) serviceLocator.getService(JobRunner.class));
                                if (Vungle._instance.consent.get() != null) {
                                    Vungle.saveGDPRConsent(repository, (Consent) Vungle._instance.consent.get(), Vungle._instance.consentVersion);
                                } else {
                                    Cookie cookie = (Cookie) repository.load(Cookie.CONSENT_COOKIE, Cookie.class).get();
                                    if (cookie == null) {
                                        Vungle._instance.consent.set(null);
                                        Vungle._instance.consentVersion = null;
                                    } else {
                                        Vungle._instance.consent.set(Vungle.getConsent(cookie));
                                        Vungle._instance.consentVersion = Vungle.getConsentMessageVersion(cookie);
                                    }
                                }
                                if (Vungle._instance.ccpaStatus.get() != null) {
                                    Vungle.updateCCPAStatus(repository, (Consent) Vungle._instance.ccpaStatus.get());
                                } else {
                                    Vungle._instance.ccpaStatus.set(Vungle.getCCPAStatus((Cookie) repository.load(Cookie.CCPA_COOKIE, Cookie.class).get()));
                                }
                            } catch (DatabaseHelper.DBException unused) {
                                Vungle.onInitError(initCallback2, new VungleException(26));
                                Vungle.deInit();
                                return;
                            }
                        } else {
                            Vungle.onInitError(initCallback2, new VungleException(16));
                            Vungle.deInit();
                            return;
                        }
                    }
                    Repository repository2 = (Repository) serviceLocator.getService(Repository.class);
                    Cookie cookie2 = (Cookie) repository2.load("appId", Cookie.class).get();
                    if (cookie2 == null) {
                        cookie2 = new Cookie("appId");
                    }
                    cookie2.putValue("appId", str);
                    try {
                        repository2.save(cookie2);
                        Vungle._instance.configure(initCallback2, false);
                        ((JobRunner) serviceLocator.getService(JobRunner.class)).execute(AnalyticsJob.makeJob(2, null, null, 1));
                    } catch (DatabaseHelper.DBException unused2) {
                        if (initCallback2 != null) {
                            Vungle.onInitError(initCallback2, new VungleException(26));
                        }
                        Vungle.isInitializing.set(false);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onInitError(InitCallback initCallback, VungleException vungleException) {
        if (initCallback != null) {
            initCallback.onError(vungleException);
        }
        if (vungleException != null) {
            VungleLogger.error("Vungle#init", (vungleException.getLocalizedMessage() == null || !vungleException.getLocalizedMessage().isEmpty()) ? Integer.toString(vungleException.getExceptionCode()) : vungleException.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void reConfigure() {
        Context context = _instance.context;
        if (context == null) {
            return;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
        Executors executors = (Executors) serviceLocator.getService(Executors.class);
        final RuntimeValues runtimeValues = (RuntimeValues) serviceLocator.getService(RuntimeValues.class);
        if (isInitialized()) {
            executors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.2
                @Override // java.lang.Runnable
                public void run() {
                    Vungle._instance.configure(RuntimeValues.this.initCallback.get(), true);
                }
            });
        } else {
            init(_instance.appID, _instance.context, runtimeValues.initCallback.get());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void configure(com.vungle.warren.InitCallback r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.Vungle.configure(com.vungle.warren.InitCallback, boolean):void");
    }

    public static boolean isInitialized() {
        return isInitialized && _instance.context != null;
    }

    public static void setIncentivizedFields(final String str, final String str2, final String str3, final String str4, final String str5) {
        Context context = _instance.context;
        if (context == null) {
            Log.e(TAG, "Vungle is not initialized, context is null");
            return;
        }
        final ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
        ((Executors) serviceLocator.getService(Executors.class)).getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.7
            @Override // java.lang.Runnable
            public void run() {
                if (!Vungle.isInitialized()) {
                    Log.e(Vungle.TAG, "Vungle is not initialized");
                    return;
                }
                Repository repository = (Repository) ServiceLocator.this.getService(Repository.class);
                Cookie cookie = (Cookie) repository.load(Cookie.INCENTIVIZED_TEXT_COOKIE, Cookie.class).get();
                if (cookie == null) {
                    cookie = new Cookie(Cookie.INCENTIVIZED_TEXT_COOKIE);
                }
                String str6 = TextUtils.isEmpty(str2) ? "" : str2;
                String str7 = TextUtils.isEmpty(str3) ? "" : str3;
                String str8 = TextUtils.isEmpty(str4) ? "" : str4;
                String str9 = TextUtils.isEmpty(str5) ? "" : str5;
                String str10 = TextUtils.isEmpty(str) ? "" : str;
                cookie.putValue("title", str6);
                cookie.putValue(SDKConstants.PARAM_A2U_BODY, str7);
                cookie.putValue("continue", str8);
                cookie.putValue(JavascriptBridge.MraidHandler.CLOSE_ACTION, str9);
                cookie.putValue(SDKConstants.PARAM_USER_ID, str10);
                try {
                    repository.save(cookie);
                } catch (DatabaseHelper.DBException e) {
                    Log.e(Vungle.TAG, "Cannot save incentivized cookie", e);
                }
            }
        });
    }

    public static boolean canPlayAd(String str) {
        return canPlayAd(str, null);
    }

    public static boolean canPlayAd(final String str, final String str2) {
        final Context context = _instance.context;
        if (context == null) {
            Log.e(TAG, "Context is null");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "AdMarkup/PlacementId is null");
            return false;
        } else {
            ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
            return Boolean.TRUE.equals(new FutureResult(((Executors) serviceLocator.getService(Executors.class)).getApiExecutor().submit(new Callable<Boolean>() { // from class: com.vungle.warren.Vungle.8
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Boolean call() {
                    Advertisement advertisement;
                    if (!Vungle.isInitialized()) {
                        Log.e(Vungle.TAG, "Vungle is not initialized");
                        return false;
                    }
                    Repository repository = (Repository) ServiceLocator.getInstance(context).getService(Repository.class);
                    AdRequest adRequest = new AdRequest(str, AdMarkup.fromString(str2));
                    Placement placement = (Placement) repository.load(str, Placement.class).get();
                    if (placement == null || !placement.isValid() || ((placement.isMultipleHBPEnabled() && adRequest.getEventId() == null) || (advertisement = repository.findValidAdvertisementForPlacement(str, adRequest.getEventId()).get()) == null || placement.getPlacementAdType() == 1 || (!AdConfig.AdSize.isDefaultAdSize(placement.getAdSize()) && !placement.getAdSize().equals(advertisement.getAdConfig().getAdSize())))) {
                        return false;
                    }
                    return Boolean.valueOf(Vungle.canPlayAd(advertisement));
                }
            })).get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean canPlayAd(Advertisement advertisement) {
        Context context = _instance.context;
        if (context == null) {
            return false;
        }
        return ((AdLoader) ServiceLocator.getInstance(context).getService(AdLoader.class)).canPlayAd(advertisement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onPlayError(String str, PlayAdCallback playAdCallback, VungleException vungleException) {
        if (playAdCallback != null) {
            playAdCallback.onError(str, vungleException);
        }
        if (vungleException != null) {
            VungleLogger.error("Vungle#playAd", (vungleException.getLocalizedMessage() == null || !vungleException.getLocalizedMessage().isEmpty()) ? Integer.toString(vungleException.getExceptionCode()) : vungleException.getLocalizedMessage());
        }
    }

    public static void playAd(String str, AdConfig adConfig, PlayAdCallback playAdCallback) {
        playAd(str, null, adConfig, playAdCallback);
    }

    public static void playAd(String str, String str2, AdConfig adConfig, PlayAdCallback playAdCallback) {
        VungleLogger.debug("Vungle#playAd", "playAd call invoked");
        if (!isInitialized()) {
            Log.e(TAG, "Locator is not initialized");
            if (playAdCallback != null) {
                onPlayError(str, playAdCallback, new VungleException(9));
            }
        } else if (TextUtils.isEmpty(str)) {
            onPlayError(str, playAdCallback, new VungleException(13));
        } else {
            ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
            Executors executors = (Executors) serviceLocator.getService(Executors.class);
            Repository repository = (Repository) serviceLocator.getService(Repository.class);
            VungleApiClient vungleApiClient = (VungleApiClient) serviceLocator.getService(VungleApiClient.class);
            executors.getBackgroundExecutor().execute(new AnonymousClass9(str, str2, (AdLoader) serviceLocator.getService(AdLoader.class), new PlayAdCallbackWrapper(executors.getUIExecutor(), playAdCallback), repository, adConfig, vungleApiClient, executors));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vungle.warren.Vungle$9  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass9 implements Runnable {
        final /* synthetic */ AdLoader val$adLoader;
        final /* synthetic */ PlayAdCallback val$listener;
        final /* synthetic */ String val$markup;
        final /* synthetic */ String val$placementId;
        final /* synthetic */ Repository val$repository;
        final /* synthetic */ Executors val$sdkExecutors;
        final /* synthetic */ AdConfig val$settings;
        final /* synthetic */ VungleApiClient val$vungleApiClient;

        AnonymousClass9(String str, String str2, AdLoader adLoader, PlayAdCallback playAdCallback, Repository repository, AdConfig adConfig, VungleApiClient vungleApiClient, Executors executors) {
            this.val$placementId = str;
            this.val$markup = str2;
            this.val$adLoader = adLoader;
            this.val$listener = playAdCallback;
            this.val$repository = repository;
            this.val$settings = adConfig;
            this.val$vungleApiClient = vungleApiClient;
            this.val$sdkExecutors = executors;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
            if (r5.getState() == 1) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
            if (r0 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
            r9.val$repository.saveAndApplyState(r5, r9.val$placementId, 4);
            r9.val$adLoader.loadEndlessIfNeeded(r4, r4.getAdSize(), 0);
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 322
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.Vungle.AnonymousClass9.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void renderAd(AdRequest adRequest, PlayAdCallback playAdCallback, Placement placement, Advertisement advertisement) {
        synchronized (Vungle.class) {
            if (!isInitialized()) {
                Log.e(TAG, "Sdk is not initialized");
                return;
            }
            ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
            VungleActivity.setEventListener(new AdEventListener(adRequest, _instance.playOperations, playAdCallback, (Repository) serviceLocator.getService(Repository.class), (AdLoader) serviceLocator.getService(AdLoader.class), (JobRunner) serviceLocator.getService(JobRunner.class), (VisionController) serviceLocator.getService(VisionController.class), placement, advertisement) { // from class: com.vungle.warren.Vungle.10
                @Override // com.vungle.warren.AdEventListener
                protected void onFinished() {
                    super.onFinished();
                    VungleActivity.setEventListener(null);
                }
            });
            ActivityManager.startWhenForeground(_instance.context, AdActivity.createIntent(_instance.context, adRequest), null);
        }
    }

    private static void onLoadError(String str, LoadAdCallback loadAdCallback, VungleException vungleException) {
        if (loadAdCallback != null) {
            loadAdCallback.onError(str, vungleException);
        }
        if (vungleException != null) {
            VungleLogger.error("Vungle#loadAd", (vungleException.getLocalizedMessage() == null || !vungleException.getLocalizedMessage().isEmpty()) ? Integer.toString(vungleException.getExceptionCode()) : vungleException.getLocalizedMessage());
        }
    }

    public static void loadAd(String str, LoadAdCallback loadAdCallback) {
        loadAd(str, new AdConfig(), loadAdCallback);
    }

    public static void loadAd(String str, AdConfig adConfig, LoadAdCallback loadAdCallback) {
        loadAd(str, null, adConfig, loadAdCallback);
    }

    public static void loadAd(String str, String str2, AdConfig adConfig, LoadAdCallback loadAdCallback) {
        VungleLogger.debug("Vungle#loadAd", "loadAd API call invoked");
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized");
            onLoadError(str, loadAdCallback, new VungleException(9));
        } else if (adConfig != null && !AdConfig.AdSize.isDefaultAdSize(adConfig.getAdSize())) {
            onLoadError(str, loadAdCallback, new VungleException(29));
        } else {
            loadAdInternal(str, AdMarkup.fromString(str2), adConfig, loadAdCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void loadAdInternal(String str, AdMarkup adMarkup, AdConfig adConfig, LoadAdCallback loadAdCallback) {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized");
            onLoadError(str, loadAdCallback, new VungleException(9));
            return;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        LoadAdCallbackWrapper loadAdCallbackWrapper = new LoadAdCallbackWrapper(((Executors) serviceLocator.getService(Executors.class)).getUIExecutor(), loadAdCallback);
        AdLoader adLoader = (AdLoader) serviceLocator.getService(AdLoader.class);
        AdRequest adRequest = new AdRequest(str, adMarkup);
        if (adConfig == null) {
            adConfig = new AdConfig();
        }
        adLoader.load(adRequest, adConfig, loadAdCallbackWrapper);
    }

    private static void clearCache() {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized");
            return;
        }
        final ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        ((Executors) serviceLocator.getService(Executors.class)).getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.11
            @Override // java.lang.Runnable
            public void run() {
                ((Downloader) ServiceLocator.this.getService(Downloader.class)).cancelAll();
                ((AdLoader) ServiceLocator.this.getService(AdLoader.class)).clear();
                ((Repository) ServiceLocator.this.getService(Repository.class)).clearAllData();
                Vungle._instance.playOperations.clear();
                Vungle._instance.ccpaStatus.set(null);
                Vungle._instance.configure(((RuntimeValues) ServiceLocator.this.getService(RuntimeValues.class)).initCallback.get(), true);
            }
        });
    }

    private static void clearAdvertisements() {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized");
            return;
        }
        final ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        ((Executors) serviceLocator.getService(Executors.class)).getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.12
            @Override // java.lang.Runnable
            public void run() {
                ((Downloader) ServiceLocator.this.getService(Downloader.class)).cancelAll();
                ((AdLoader) ServiceLocator.this.getService(AdLoader.class)).clear();
                final Repository repository = (Repository) ServiceLocator.this.getService(Repository.class);
                ((Executors) ServiceLocator.this.getService(Executors.class)).getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.12.1
                    @Override // java.lang.Runnable
                    public void run() {
                        List<Advertisement> list = (List) repository.loadAll(Advertisement.class).get();
                        if (list != null) {
                            for (Advertisement advertisement : list) {
                                try {
                                    repository.deleteAdvertisement(advertisement.getId());
                                } catch (DatabaseHelper.DBException unused) {
                                }
                            }
                        }
                    }
                });
            }
        });
    }

    @Deprecated
    public static VungleNativeAd getNativeAd(String str, AdConfig adConfig, PlayAdCallback playAdCallback) {
        return getNativeAd(str, null, adConfig, playAdCallback);
    }

    public static VungleNativeAd getNativeAd(String str, String str2, AdConfig adConfig, PlayAdCallback playAdCallback) {
        if (adConfig == null) {
            adConfig = new AdConfig();
        }
        if (AdConfig.AdSize.isDefaultAdSize(adConfig.getAdSize())) {
            return getNativeAdInternal(str, AdMarkup.fromString(str2), adConfig, playAdCallback);
        }
        if (playAdCallback != null) {
            Log.e(TAG, "Please use Banners.getBanner(... ) to retrieve Banner Ad");
            playAdCallback.onError(str, new VungleException(29));
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static VungleNativeView getNativeAdInternal(String str, AdMarkup adMarkup, AdConfig adConfig, PlayAdCallback playAdCallback) {
        if (_instance.context == null) {
            Log.e(TAG, "Vungle is not initialized, returned VungleNativeAd = null");
            onPlayError(str, playAdCallback, new VungleException(9));
            return null;
        } else if (TextUtils.isEmpty(str)) {
            onPlayError(str, playAdCallback, new VungleException(13));
            return null;
        } else {
            ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
            AdLoader adLoader = (AdLoader) serviceLocator.getService(AdLoader.class);
            AdRequest adRequest = new AdRequest(str, adMarkup);
            boolean isLoading = adLoader.isLoading(adRequest);
            if (Boolean.TRUE.equals(_instance.playOperations.get(str)) || isLoading) {
                String str2 = TAG;
                Log.e(str2, "Playing or Loading operation ongoing. Playing " + _instance.playOperations.get(adRequest.getPlacementId()) + " Loading: " + isLoading);
                onPlayError(str, playAdCallback, new VungleException(8));
                return null;
            }
            try {
                return new VungleNativeView(_instance.context.getApplicationContext(), adRequest, adConfig, (PresentationFactory) serviceLocator.getService(PresentationFactory.class), new AdEventListener(adRequest, _instance.playOperations, playAdCallback, (Repository) serviceLocator.getService(Repository.class), adLoader, (JobRunner) serviceLocator.getService(JobRunner.class), (VisionController) serviceLocator.getService(VisionController.class), null, null));
            } catch (Exception e) {
                VungleLogger.error("Vungle#playAd", "Native ad fail: " + e.getLocalizedMessage());
                if (playAdCallback != null) {
                    playAdCallback.onError(str, new VungleException(10));
                }
                return null;
            }
        }
    }

    public static Collection<String> getValidPlacements() {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized return empty placements list");
            return Collections.emptyList();
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        Collection<String> collection = ((Repository) serviceLocator.getService(Repository.class)).getValidPlacementIds().get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS);
        return collection == null ? Collections.emptyList() : collection;
    }

    static Collection<Placement> getValidPlacementModels() {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized return empty placements list");
            return Collections.emptyList();
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        Collection<Placement> collection = ((Repository) serviceLocator.getService(Repository.class)).loadValidPlacements().get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS);
        return collection == null ? Collections.emptyList() : collection;
    }

    static Collection<Advertisement> getValidAdvertisementModels(String str) {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized return empty placements list");
            return Collections.emptyList();
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        List<Advertisement> list = ((Repository) serviceLocator.getService(Repository.class)).findValidAdvertisementsForPlacement(str, null).get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS);
        return list == null ? Collections.emptyList() : list;
    }

    public static void updateConsentStatus(Consent consent, String str) {
        if (consent == null) {
            Log.e(TAG, "Cannot set consent with a null consent, please check your code");
            return;
        }
        _instance.consent.set(consent);
        _instance.consentVersion = str;
        if (isInitialized() && isDepInit.get()) {
            saveGDPRConsent((Repository) ServiceLocator.getInstance(_instance.context).getService(Repository.class), _instance.consent.get(), _instance.consentVersion);
        } else {
            Log.e(TAG, "Vungle is not initialized");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveGDPRConsent(final Repository repository, final Consent consent, final String str) {
        repository.load(Cookie.CONSENT_COOKIE, Cookie.class, new Repository.LoadCallback<Cookie>() { // from class: com.vungle.warren.Vungle.13
            @Override // com.vungle.warren.persistence.Repository.LoadCallback
            public void onLoaded(Cookie cookie) {
                if (cookie == null) {
                    cookie = new Cookie(Cookie.CONSENT_COOKIE);
                }
                cookie.putValue("consent_status", Consent.this == Consent.OPTED_IN ? Cookie.CONSENT_STATUS_OPTED_IN : Cookie.CONSENT_STATUS_OPTED_OUT);
                cookie.putValue(VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP, Long.valueOf(System.currentTimeMillis() / 1000));
                cookie.putValue("consent_source", "publisher");
                String str2 = str;
                if (str2 == null) {
                    str2 = "";
                }
                cookie.putValue("consent_message_version", str2);
                repository.save(cookie, null, false);
            }
        });
    }

    public static Consent getConsentStatus() {
        if (isInitialized() && isDepInit.get()) {
            ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
            Cookie cookie = (Cookie) ((Repository) serviceLocator.getService(Repository.class)).load(Cookie.CONSENT_COOKIE, Cookie.class).get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS);
            if (cookie == null) {
                return null;
            }
            String string = cookie.getString("consent_status");
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -83053070) {
                if (hashCode != 1230717015) {
                    if (hashCode == 1720328225 && string.equals(Cookie.CONSENT_STATUS_OPTED_OUT)) {
                        c = 1;
                    }
                } else if (string.equals("opted_out_by_timeout")) {
                    c = 0;
                }
            } else if (string.equals(Cookie.CONSENT_STATUS_OPTED_IN)) {
                c = 2;
            }
            if (c == 0 || c == 1) {
                _instance.consent.set(Consent.OPTED_OUT);
                return Consent.OPTED_OUT;
            } else if (c != 2) {
                return null;
            } else {
                _instance.consent.set(Consent.OPTED_IN);
                return Consent.OPTED_IN;
            }
        }
        return _instance.consent.get();
    }

    public static String getConsentMessageVersion() {
        return _instance.consentVersion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Consent getConsent(Cookie cookie) {
        if (cookie == null) {
            return null;
        }
        return Cookie.CONSENT_STATUS_OPTED_IN.equals(cookie.getString("consent_status")) ? Consent.OPTED_IN : Consent.OPTED_OUT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getConsentMessageVersion(Cookie cookie) {
        if (cookie == null) {
            return null;
        }
        return cookie.getString("consent_message_version");
    }

    public static void updateCCPAStatus(Consent consent) {
        if (consent == null) {
            Log.e(TAG, "Unable to update CCPA status, Invalid input parameter.");
            return;
        }
        _instance.ccpaStatus.set(consent);
        if (!isInitialized() || !isDepInit.get()) {
            Log.e(TAG, "Vungle is not initialized");
        } else {
            updateCCPAStatus((Repository) ServiceLocator.getInstance(_instance.context).getService(Repository.class), consent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateCCPAStatus(final Repository repository, final Consent consent) {
        repository.load(Cookie.CCPA_COOKIE, Cookie.class, new Repository.LoadCallback<Cookie>() { // from class: com.vungle.warren.Vungle.14
            @Override // com.vungle.warren.persistence.Repository.LoadCallback
            public void onLoaded(Cookie cookie) {
                if (cookie == null) {
                    cookie = new Cookie(Cookie.CCPA_COOKIE);
                }
                cookie.putValue(Cookie.CCPA_CONSENT_STATUS, Consent.this == Consent.OPTED_OUT ? Cookie.CONSENT_STATUS_OPTED_OUT : Cookie.CONSENT_STATUS_OPTED_IN);
                repository.save(cookie, null, false);
            }
        });
    }

    public static Consent getCCPAStatus() {
        return _instance.ccpaStatus.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Consent getCCPAStatus(Cookie cookie) {
        if (cookie == null) {
            return null;
        }
        return Cookie.CONSENT_STATUS_OPTED_OUT.equals(cookie.getString(Cookie.CCPA_CONSENT_STATUS)) ? Consent.OPTED_OUT : Consent.OPTED_IN;
    }

    public static void setHeaderBiddingCallback(HeaderBiddingCallback headerBiddingCallback) {
        Context context = _instance.context;
        if (context == null) {
            return;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
        ((RuntimeValues) serviceLocator.getService(RuntimeValues.class)).headerBiddingCallback.set(new HeaderBiddingCallbackWrapper(((Executors) serviceLocator.getService(Executors.class)).getUIExecutor(), headerBiddingCallback));
    }

    public static String getAvailableBidTokens(Context context) {
        return getAvailableBidTokensBySize(context, 0);
    }

    public static String getAvailableBidTokensBySize(final Context context, final int i) {
        if (context == null) {
            Log.e(TAG, "Context is null");
            return null;
        }
        if (i <= 0) {
            i = 2147483646;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
        return (String) new FutureResult(((Executors) serviceLocator.getService(Executors.class)).getApiExecutor().submit(new Callable<String>() { // from class: com.vungle.warren.Vungle.15
            @Override // java.util.concurrent.Callable
            public String call() throws Exception {
                Vungle._instance.hbpOrdinalViewCount.incrementAndGet();
                List<String> list = ((Repository) ServiceLocator.getInstance(context).getService(Repository.class)).getAvailableBidTokens(Vungle.getAvailableSizeForHBT(i, "2", Vungle._instance.hbpOrdinalViewCount.toString()), ",".getBytes().length).get();
                String join = (list == null || list.isEmpty()) ? "" : TextUtils.join(",", list);
                String str = new String(Base64.encode((join + CertificateUtil.DELIMITER + Vungle._instance.hbpOrdinalViewCount.toString()).getBytes(), 2), Charset.defaultCharset());
                return "2" + CertificateUtil.DELIMITER + str;
            }
        })).get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS);
    }

    static int getAvailableSizeForHBT(int i, String str, String str2) {
        return (int) Math.max(Math.round(((int) (((Math.floor(((i - str.getBytes().length) - CertificateUtil.DELIMITER.getBytes().length) / 4) * 3.0d) - CertificateUtil.DELIMITER.getBytes().length) - str2.getBytes().length)) / 4.0d) * 4, 0L);
    }

    protected static void deInit() {
        Context context = _instance.context;
        if (context != null) {
            ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
            if (serviceLocator.isCreated(CacheManager.class)) {
                ((CacheManager) serviceLocator.getService(CacheManager.class)).removeListener(cacheListener);
            }
            if (serviceLocator.isCreated(Downloader.class)) {
                ((Downloader) serviceLocator.getService(Downloader.class)).cancelAll();
            }
            if (serviceLocator.isCreated(AdLoader.class)) {
                ((AdLoader) serviceLocator.getService(AdLoader.class)).clear();
            }
            _instance.playOperations.clear();
        }
        ServiceLocator.deInit();
        isInitialized = false;
        isDepInit.set(false);
        isInitializing.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void stopPlaying() {
        if (_instance.context == null) {
            return;
        }
        Intent intent = new Intent(AdContract.AdvertisementBus.ACTION);
        intent.putExtra(AdContract.AdvertisementBus.COMMAND, AdContract.AdvertisementBus.STOP_ALL);
        LocalBroadcastManager.getInstance(_instance.context).sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context appContext() {
        Vungle vungle = _instance;
        if (vungle != null) {
            return vungle.context;
        }
        return null;
    }
}
