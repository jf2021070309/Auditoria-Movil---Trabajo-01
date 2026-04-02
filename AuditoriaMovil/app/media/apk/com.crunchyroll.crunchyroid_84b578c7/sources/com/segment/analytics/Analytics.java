package com.segment.analytics;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.g;
import androidx.lifecycle.m;
import com.amazon.aps.iva.v1.p;
import com.amazon.aps.iva.x2.u;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.segment.analytics.AnalyticsActivityLifecycleCallbacks;
import com.segment.analytics.Client;
import com.segment.analytics.Middleware;
import com.segment.analytics.ProjectSettings;
import com.segment.analytics.Traits;
import com.segment.analytics.WebhookIntegration;
import com.segment.analytics.integrations.AliasPayload;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.integrations.GroupPayload;
import com.segment.analytics.integrations.IdentifyPayload;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.Logger;
import com.segment.analytics.integrations.ScreenPayload;
import com.segment.analytics.integrations.TrackPayload;
import com.segment.analytics.internal.NanoDate;
import com.segment.analytics.internal.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public class Analytics {
    private static final String BUILD_KEY = "build";
    static final String OPT_OUT_PREFERENCE_KEY = "opt-out";
    private static final long SETTINGS_REFRESH_INTERVAL = 86400000;
    private static final long SETTINGS_RETRY_INTERVAL = 60000;
    private static final String TRAITS_KEY = "traits";
    private static final String VERSION_KEY = "version";
    static final String WRITE_KEY_RESOURCE_IDENTIFIER = "analytics_write_key";
    final AnalyticsActivityLifecycleCallbacks activityLifecycleCallback;
    private final CountDownLatch advertisingIdLatch;
    final AnalyticsContext analyticsContext;
    private final ExecutorService analyticsExecutor;
    private final Application application;
    final Map<String, Boolean> bundledIntegrations = new ConcurrentHashMap();
    final Cartographer cartographer;
    final Client client;
    final Crypto crypto;
    final Options defaultOptions;
    private final Map<String, List<Middleware>> destinationMiddleware;
    private JSMiddleware edgeFunctionMiddleware;
    private List<Integration.Factory> factories;
    final long flushIntervalInMillis;
    final int flushQueueSize;
    private Map<String, Integration<?>> integrations;
    final g lifecycle;
    private final Logger logger;
    final boolean nanosecondTimestamps;
    final ExecutorService networkExecutor;
    private final BooleanPreference optOut;
    ProjectSettings projectSettings;
    private final ProjectSettings.Cache projectSettingsCache;
    volatile boolean shutdown;
    private final List<Middleware> sourceMiddleware;
    final Stats stats;
    final String tag;
    final Traits.Cache traitsCache;
    final boolean useNewLifecycleMethods;
    final String writeKey;
    static final Handler HANDLER = new Handler(Looper.getMainLooper()) { // from class: com.segment.analytics.Analytics.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            throw new AssertionError("Unknown handler message received: " + message.what);
        }
    };
    static final List<String> INSTANCES = new ArrayList(1);
    @SuppressLint({"StaticFieldLeak"})
    static volatile Analytics singleton = null;
    static final Properties EMPTY_PROPERTIES = new Properties();

    /* loaded from: classes4.dex */
    public enum BundledIntegration {
        AMPLITUDE("Amplitude"),
        APPS_FLYER("AppsFlyer"),
        APPTIMIZE("Apptimize"),
        BUGSNAG("Bugsnag"),
        COUNTLY("Countly"),
        CRITTERCISM("Crittercism"),
        FLURRY("Flurry"),
        GOOGLE_ANALYTICS("Google Analytics"),
        KAHUNA("Kahuna"),
        LEANPLUM("Leanplum"),
        LOCALYTICS("Localytics"),
        MIXPANEL("Mixpanel"),
        QUANTCAST("Quantcast"),
        TAPLYTICS("Taplytics"),
        TAPSTREAM("Tapstream"),
        UXCAM("UXCam");
        
        final String key;

        BundledIntegration(String str) {
            this.key = str;
        }
    }

    /* loaded from: classes4.dex */
    public interface Callback<T> {
        void onReady(T t);
    }

    /* loaded from: classes4.dex */
    public enum LogLevel {
        NONE,
        INFO,
        DEBUG,
        BASIC,
        VERBOSE;

        public boolean log() {
            if (this != NONE) {
                return true;
            }
            return false;
        }
    }

    public Analytics(Application application, ExecutorService executorService, Stats stats, Traits.Cache cache, AnalyticsContext analyticsContext, Options options, Logger logger, String str, List<Integration.Factory> list, Client client, Cartographer cartographer, ProjectSettings.Cache cache2, String str2, int i, long j, ExecutorService executorService2, boolean z, CountDownLatch countDownLatch, boolean z2, boolean z3, BooleanPreference booleanPreference, Crypto crypto, List<Middleware> list2, Map<String, List<Middleware>> map, final JSMiddleware jSMiddleware, final ValueMap valueMap, g gVar, boolean z4, boolean z5, final String str3) {
        this.application = application;
        this.networkExecutor = executorService;
        this.stats = stats;
        this.traitsCache = cache;
        this.analyticsContext = analyticsContext;
        this.defaultOptions = options;
        this.logger = logger;
        this.tag = str;
        this.client = client;
        this.cartographer = cartographer;
        this.projectSettingsCache = cache2;
        this.writeKey = str2;
        this.flushQueueSize = i;
        this.flushIntervalInMillis = j;
        this.advertisingIdLatch = countDownLatch;
        this.optOut = booleanPreference;
        this.factories = list;
        this.analyticsExecutor = executorService2;
        this.crypto = crypto;
        this.sourceMiddleware = list2;
        this.destinationMiddleware = map;
        this.edgeFunctionMiddleware = jSMiddleware;
        this.lifecycle = gVar;
        this.nanosecondTimestamps = z4;
        this.useNewLifecycleMethods = z5;
        namespaceSharedPreferences();
        executorService2.submit(new Runnable() { // from class: com.segment.analytics.Analytics.2
            @Override // java.lang.Runnable
            public void run() {
                Analytics analytics = Analytics.this;
                analytics.projectSettings = analytics.getSettings();
                if (Utils.isNullOrEmpty(Analytics.this.projectSettings)) {
                    if (!valueMap.containsKey("integrations")) {
                        valueMap.put("integrations", (Object) new ValueMap());
                    }
                    if (!valueMap.getValueMap("integrations").containsKey("Segment.io")) {
                        valueMap.getValueMap("integrations").put("Segment.io", (Object) new ValueMap());
                    }
                    if (!valueMap.getValueMap("integrations").getValueMap("Segment.io").containsKey("apiKey")) {
                        valueMap.getValueMap("integrations").getValueMap("Segment.io").putValue("apiKey", Analytics.this.writeKey);
                    }
                    Analytics.this.projectSettings = ProjectSettings.create(valueMap);
                }
                JSMiddleware jSMiddleware2 = jSMiddleware;
                if (jSMiddleware2 != null) {
                    jSMiddleware2.setEdgeFunctionData(Analytics.this.projectSettings.edgeFunctions());
                }
                if (!Analytics.this.projectSettings.getValueMap("integrations").getValueMap("Segment.io").containsKey("apiHost")) {
                    Analytics.this.projectSettings.getValueMap("integrations").getValueMap("Segment.io").putValue("apiHost", str3);
                }
                Analytics.HANDLER.post(new Runnable() { // from class: com.segment.analytics.Analytics.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Analytics analytics2 = Analytics.this;
                        analytics2.performInitializeIntegrations(analytics2.projectSettings);
                    }
                });
            }
        });
        logger.debug("Created analytics client for project with tag:%s.", str);
        AnalyticsActivityLifecycleCallbacks build = new AnalyticsActivityLifecycleCallbacks.Builder().analytics(this).analyticsExecutor(executorService2).shouldTrackApplicationLifecycleEvents(Boolean.valueOf(z)).trackDeepLinks(Boolean.valueOf(z3)).shouldRecordScreenViews(Boolean.valueOf(z2)).packageInfo(getPackageInfo(application)).useNewLifecycleMethods(z5).build();
        this.activityLifecycleCallback = build;
        application.registerActivityLifecycleCallbacks(build);
        if (z5) {
            run(new u(8, this, gVar));
        }
    }

    private void assertNotShutdown() {
        if (!this.shutdown) {
            return;
        }
        throw new IllegalStateException("Cannot enqueue messages after client is shutdown.");
    }

    private ProjectSettings downloadSettings() {
        try {
            ProjectSettings projectSettings = (ProjectSettings) this.networkExecutor.submit(new Callable<ProjectSettings>() { // from class: com.segment.analytics.Analytics.12
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public ProjectSettings call() throws Exception {
                    Client.Connection connection = null;
                    try {
                        connection = Analytics.this.client.fetchSettings();
                        return ProjectSettings.create(Analytics.this.cartographer.fromJson(Utils.buffer(connection.is)));
                    } finally {
                        Utils.closeQuietly(connection);
                    }
                }
            }).get();
            this.projectSettingsCache.set(projectSettings);
            return projectSettings;
        } catch (InterruptedException e) {
            this.logger.error(e, "Thread interrupted while fetching settings.", new Object[0]);
            return null;
        } catch (ExecutionException e2) {
            this.logger.error(e2, "Unable to fetch settings. Retrying in %s ms.", Long.valueOf((long) SETTINGS_RETRY_INTERVAL));
            return null;
        }
    }

    public static PackageInfo getPackageInfo(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new AssertionError("Package not found: " + context.getPackageName());
        }
    }

    private long getSettingsRefreshInterval() {
        if (this.logger.logLevel == LogLevel.DEBUG) {
            return SETTINGS_RETRY_INTERVAL;
        }
        return SETTINGS_REFRESH_INTERVAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(g gVar) {
        gVar.addObserver(this.activityLifecycleCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$shutdown$1() {
        this.lifecycle.removeObserver(this.activityLifecycleCallback);
    }

    private void namespaceSharedPreferences() {
        SharedPreferences segmentSharedPreferences = Utils.getSegmentSharedPreferences(this.application, this.tag);
        BooleanPreference booleanPreference = new BooleanPreference(segmentSharedPreferences, "namespaceSharedPreferences", true);
        if (booleanPreference.get()) {
            Utils.copySharedPreferences(this.application.getSharedPreferences("analytics-android", 0), segmentSharedPreferences);
            booleanPreference.set(false);
        }
    }

    public static void setSingletonInstance(Analytics analytics) {
        synchronized (Analytics.class) {
            if (singleton == null) {
                singleton = analytics;
            } else {
                throw new IllegalStateException("Singleton instance already exists.");
            }
        }
    }

    private void waitForAdvertisingId() {
        try {
            this.advertisingIdLatch.await(15L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            this.logger.error(e, "Thread interrupted while waiting for advertising ID.", new Object[0]);
        }
        if (this.advertisingIdLatch.getCount() == 1) {
            this.logger.debug("Advertising ID may not be collected because the API did not respond within 15 seconds.", new Object[0]);
        }
    }

    public static Analytics with(Context context) {
        if (singleton == null) {
            if (context != null) {
                synchronized (Analytics.class) {
                    if (singleton == null) {
                        Builder builder = new Builder(context, Utils.getResourceString(context, WRITE_KEY_RESOURCE_IDENTIFIER));
                        try {
                            boolean z = false;
                            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0) {
                                z = true;
                            }
                            if (z) {
                                builder.logLevel(LogLevel.INFO);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        singleton = builder.build();
                    }
                }
            } else {
                throw new IllegalArgumentException("Context must not be null.");
            }
        }
        return singleton;
    }

    public void alias(String str) {
        alias(str, null);
    }

    public void enqueue(BasePayload basePayload) {
        if (this.optOut.get()) {
            return;
        }
        this.logger.verbose("Created payload %s.", basePayload);
        new MiddlewareChainRunner(0, basePayload, this.sourceMiddleware, new Middleware.Callback() { // from class: com.segment.analytics.Analytics.9
            @Override // com.segment.analytics.Middleware.Callback
            public void invoke(BasePayload basePayload2) {
                Analytics.this.run(basePayload2);
            }
        }).proceed(basePayload);
    }

    public void fillAndEnqueue(BasePayload.Builder<?, ?> builder, Options options) {
        waitForAdvertisingId();
        if (options == null) {
            options = this.defaultOptions;
        }
        AnalyticsContext analyticsContext = new AnalyticsContext(new LinkedHashMap(this.analyticsContext.size()));
        analyticsContext.putAll(this.analyticsContext);
        analyticsContext.putAll(options.context());
        AnalyticsContext unmodifiableCopy = analyticsContext.unmodifiableCopy();
        builder.context(unmodifiableCopy);
        builder.anonymousId(unmodifiableCopy.traits().anonymousId());
        builder.integrations(options.integrations());
        builder.nanosecondTimestamps(this.nanosecondTimestamps);
        String userId = unmodifiableCopy.traits().userId();
        if (!builder.isUserIdSet() && !Utils.isNullOrEmpty(userId)) {
            builder.userId(userId);
        }
        enqueue(builder.build());
    }

    public void flush() {
        if (!this.shutdown) {
            runOnMainThread(IntegrationOperation.FLUSH);
            return;
        }
        throw new IllegalStateException("Cannot enqueue messages after client is shutdown.");
    }

    public AnalyticsContext getAnalyticsContext() {
        return this.analyticsContext;
    }

    public Application getApplication() {
        return this.application;
    }

    public Options getDefaultOptions() {
        return new Options(this.defaultOptions.integrations(), this.defaultOptions.context());
    }

    public JSMiddleware getEdgeFunctionMiddleware() {
        return this.edgeFunctionMiddleware;
    }

    @Deprecated
    public LogLevel getLogLevel() {
        return this.logger.logLevel;
    }

    public Logger getLogger() {
        return this.logger;
    }

    public ProjectSettings getSettings() {
        ProjectSettings projectSettings = this.projectSettingsCache.get();
        if (Utils.isNullOrEmpty(projectSettings)) {
            return downloadSettings();
        }
        if (projectSettings.timestamp() + getSettingsRefreshInterval() > System.currentTimeMillis()) {
            return projectSettings;
        }
        ProjectSettings downloadSettings = downloadSettings();
        if (Utils.isNullOrEmpty(downloadSettings)) {
            return projectSettings;
        }
        return downloadSettings;
    }

    public StatsSnapshot getSnapshot() {
        return this.stats.createSnapshot();
    }

    public void group(String str) {
        group(str, null, null);
    }

    public void identify(String str) {
        identify(str, null, null);
    }

    public Logger logger(String str) {
        return this.logger.subLog(str);
    }

    @Deprecated
    public void logout() {
        reset();
    }

    public <T> void onIntegrationReady(final String str, final Callback<T> callback) {
        if (!Utils.isNullOrEmpty(str)) {
            this.analyticsExecutor.submit(new Runnable() { // from class: com.segment.analytics.Analytics.11
                @Override // java.lang.Runnable
                public void run() {
                    Analytics.HANDLER.post(new Runnable() { // from class: com.segment.analytics.Analytics.11.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass11 anonymousClass11 = AnonymousClass11.this;
                            Analytics.this.performCallback(str, callback);
                        }
                    });
                }
            });
            return;
        }
        throw new IllegalArgumentException("key cannot be null or empty.");
    }

    public void optOut(boolean z) {
        this.optOut.set(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void performCallback(String str, Callback<T> callback) {
        for (Map.Entry<String, Integration<?>> entry : this.integrations.entrySet()) {
            if (str.equals(entry.getKey())) {
                callback.onReady(entry.getValue().getUnderlyingInstance());
                return;
            }
        }
    }

    public void performInitializeIntegrations(ProjectSettings projectSettings) throws AssertionError {
        if (!Utils.isNullOrEmpty(projectSettings)) {
            ValueMap integrations = projectSettings.integrations();
            this.integrations = new LinkedHashMap(this.factories.size());
            for (int i = 0; i < this.factories.size(); i++) {
                if (Utils.isNullOrEmpty(integrations)) {
                    this.logger.debug("Integration settings are empty", new Object[0]);
                } else {
                    Integration.Factory factory = this.factories.get(i);
                    String key = factory.key();
                    if (!Utils.isNullOrEmpty(key)) {
                        ValueMap valueMap = integrations.getValueMap(key);
                        if (!(factory instanceof WebhookIntegration.WebhookIntegrationFactory) && Utils.isNullOrEmpty(valueMap)) {
                            this.logger.debug("Integration %s is not enabled.", key);
                        } else {
                            Integration<?> create = factory.create(valueMap, this);
                            if (create == null) {
                                this.logger.info("Factory %s couldn't create integration.", factory);
                            } else {
                                this.integrations.put(key, create);
                                this.bundledIntegrations.put(key, Boolean.FALSE);
                            }
                        }
                    } else {
                        throw new AssertionError("The factory key is empty!");
                    }
                }
            }
            this.factories = null;
            return;
        }
        throw new AssertionError("ProjectSettings is empty!");
    }

    public void performRun(IntegrationOperation integrationOperation) {
        for (Map.Entry<String, Integration<?>> entry : this.integrations.entrySet()) {
            String key = entry.getKey();
            long nanoTime = System.nanoTime();
            integrationOperation.run(key, entry.getValue(), this.projectSettings);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.stats.dispatchIntegrationOperation(key, TimeUnit.NANOSECONDS.toMillis(nanoTime2));
            this.logger.debug("Ran %s on integration %s in %d ns.", integrationOperation, key, Long.valueOf(nanoTime2));
        }
    }

    public void recordScreenViews(Activity activity) {
        PackageManager packageManager = activity.getPackageManager();
        try {
            screen(packageManager.getActivityInfo(activity.getComponentName(), 128).loadLabel(packageManager).toString());
        } catch (PackageManager.NameNotFoundException e) {
            throw new AssertionError("Activity Not Found: " + e.toString());
        } catch (Exception e2) {
            this.logger.error(e2, "Unable to track screen view for %s", activity.toString());
        }
    }

    public void reset() {
        SharedPreferences.Editor edit = Utils.getSegmentSharedPreferences(this.application, this.tag).edit();
        edit.remove("traits-" + this.tag);
        edit.apply();
        this.traitsCache.delete();
        this.traitsCache.set(Traits.create());
        this.analyticsContext.setTraits(this.traitsCache.get());
        runOnMainThread(IntegrationOperation.RESET);
    }

    public void run(BasePayload basePayload) {
        this.logger.verbose("Running payload %s.", basePayload);
        final IntegrationOperation segmentEvent = IntegrationOperation.segmentEvent(basePayload, this.destinationMiddleware);
        HANDLER.post(new Runnable() { // from class: com.segment.analytics.Analytics.10
            @Override // java.lang.Runnable
            public void run() {
                Analytics.this.performRun(segmentEvent);
            }
        });
    }

    public void runOnMainThread(final IntegrationOperation integrationOperation) {
        if (this.shutdown) {
            return;
        }
        this.analyticsExecutor.submit(new Runnable() { // from class: com.segment.analytics.Analytics.3
            @Override // java.lang.Runnable
            public void run() {
                Analytics.HANDLER.post(new Runnable() { // from class: com.segment.analytics.Analytics.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        Analytics.this.performRun(integrationOperation);
                    }
                });
            }
        });
    }

    public void screen(String str, String str2) {
        screen(str, str2, null, null);
    }

    public void shutdown() {
        if (this != singleton) {
            if (this.shutdown) {
                return;
            }
            this.application.unregisterActivityLifecycleCallbacks(this.activityLifecycleCallback);
            if (this.useNewLifecycleMethods) {
                run(new p(this, 11));
            }
            this.analyticsExecutor.shutdown();
            ExecutorService executorService = this.networkExecutor;
            if (executorService instanceof Utils.AnalyticsNetworkExecutorService) {
                executorService.shutdown();
            }
            this.stats.shutdown();
            this.shutdown = true;
            List<String> list = INSTANCES;
            synchronized (list) {
                list.remove(this.tag);
            }
            return;
        }
        throw new UnsupportedOperationException("Default singleton instance cannot be shutdown.");
    }

    public void track(String str) {
        track(str, null, null);
    }

    public void trackApplicationLifecycleEvents() {
        PackageInfo packageInfo = getPackageInfo(this.application);
        String str = packageInfo.versionName;
        int i = packageInfo.versionCode;
        SharedPreferences segmentSharedPreferences = Utils.getSegmentSharedPreferences(this.application, this.tag);
        String string = segmentSharedPreferences.getString(VERSION_KEY, null);
        int i2 = segmentSharedPreferences.getInt(BUILD_KEY, -1);
        if (i2 == -1) {
            track("Application Installed", new Properties().putValue(VERSION_KEY, (Object) str).putValue(BUILD_KEY, (Object) String.valueOf(i)));
        } else if (i != i2) {
            track("Application Updated", new Properties().putValue(VERSION_KEY, (Object) str).putValue(BUILD_KEY, (Object) String.valueOf(i)).putValue("previous_version", (Object) string).putValue("previous_build", (Object) String.valueOf(i2)));
        }
        SharedPreferences.Editor edit = segmentSharedPreferences.edit();
        edit.putString(VERSION_KEY, str);
        edit.putInt(BUILD_KEY, i);
        edit.apply();
    }

    public void alias(final String str, final Options options) {
        assertNotShutdown();
        if (!Utils.isNullOrEmpty(str)) {
            final Date nanoDate = this.nanosecondTimestamps ? new NanoDate() : new Date();
            this.analyticsExecutor.submit(new Runnable() { // from class: com.segment.analytics.Analytics.8
                @Override // java.lang.Runnable
                public void run() {
                    Analytics.this.fillAndEnqueue(new AliasPayload.Builder().timestamp(nanoDate).userId(str).previousId(Analytics.this.analyticsContext.traits().currentId()), options);
                }
            });
            return;
        }
        throw new IllegalArgumentException("newId must not be null or empty.");
    }

    public void group(String str, Traits traits) {
        group(str, traits, null);
    }

    public void identify(Traits traits) {
        identify(null, traits, null);
    }

    public void screen(String str, String str2, Properties properties) {
        screen(str, str2, properties, null);
    }

    public void track(String str, Properties properties) {
        track(str, properties, null);
    }

    public void group(final String str, final Traits traits, final Options options) {
        assertNotShutdown();
        if (!Utils.isNullOrEmpty(str)) {
            final Date nanoDate = this.nanosecondTimestamps ? new NanoDate() : new Date();
            this.analyticsExecutor.submit(new Runnable() { // from class: com.segment.analytics.Analytics.5
                @Override // java.lang.Runnable
                public void run() {
                    Traits traits2 = traits;
                    if (traits2 == null) {
                        traits2 = new Traits();
                    }
                    Analytics.this.fillAndEnqueue(new GroupPayload.Builder().timestamp(nanoDate).groupId(str).traits(traits2), options);
                }
            });
            return;
        }
        throw new IllegalArgumentException("groupId must not be null or empty.");
    }

    public void identify(final String str, final Traits traits, final Options options) {
        assertNotShutdown();
        if (Utils.isNullOrEmpty(str) && Utils.isNullOrEmpty(traits)) {
            throw new IllegalArgumentException("Either userId or some traits must be provided.");
        }
        final Date nanoDate = this.nanosecondTimestamps ? new NanoDate() : new Date();
        this.analyticsExecutor.submit(new Runnable() { // from class: com.segment.analytics.Analytics.4
            @Override // java.lang.Runnable
            public void run() {
                Traits traits2 = Analytics.this.traitsCache.get();
                if (!Utils.isNullOrEmpty(str)) {
                    traits2.putUserId(str);
                }
                if (!Utils.isNullOrEmpty(traits)) {
                    traits2.putAll(traits);
                }
                Analytics.this.traitsCache.set(traits2);
                Analytics.this.analyticsContext.setTraits(traits2);
                Analytics.this.fillAndEnqueue(new IdentifyPayload.Builder().timestamp(nanoDate).traits(Analytics.this.traitsCache.get()), options);
            }
        });
    }

    public void screen(String str) {
        screen(null, str, null, null);
    }

    public void track(final String str, final Properties properties, final Options options) {
        assertNotShutdown();
        if (!Utils.isNullOrEmpty(str)) {
            final Date nanoDate = this.nanosecondTimestamps ? new NanoDate() : new Date();
            this.analyticsExecutor.submit(new Runnable() { // from class: com.segment.analytics.Analytics.6
                @Override // java.lang.Runnable
                public void run() {
                    Properties properties2 = properties;
                    if (properties2 == null) {
                        properties2 = Analytics.EMPTY_PROPERTIES;
                    }
                    Analytics.this.fillAndEnqueue(new TrackPayload.Builder().timestamp(nanoDate).event(str).properties(properties2), options);
                }
            });
            return;
        }
        throw new IllegalArgumentException("event must not be null or empty.");
    }

    public void onIntegrationReady(BundledIntegration bundledIntegration, Callback callback) {
        if (bundledIntegration != null) {
            onIntegrationReady(bundledIntegration.key, callback);
            return;
        }
        throw new IllegalArgumentException("integration cannot be null");
    }

    public void screen(String str, Properties properties) {
        screen(null, str, properties, null);
    }

    private void run(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            HANDLER.post(runnable);
        }
    }

    public void screen(final String str, final String str2, final Properties properties, final Options options) {
        assertNotShutdown();
        if (Utils.isNullOrEmpty(str) && Utils.isNullOrEmpty(str2)) {
            throw new IllegalArgumentException("either category or name must be provided.");
        }
        final Date nanoDate = this.nanosecondTimestamps ? new NanoDate() : new Date();
        this.analyticsExecutor.submit(new Runnable() { // from class: com.segment.analytics.Analytics.7
            @Override // java.lang.Runnable
            public void run() {
                Properties properties2 = properties;
                if (properties2 == null) {
                    properties2 = Analytics.EMPTY_PROPERTIES;
                }
                Analytics.this.fillAndEnqueue(new ScreenPayload.Builder().timestamp(nanoDate).name(str2).category(str).properties(properties2), options);
            }
        });
    }

    /* loaded from: classes4.dex */
    public static class Builder {
        private final Application application;
        private ConnectionFactory connectionFactory;
        private Crypto crypto;
        private Options defaultOptions;
        private Map<String, List<Middleware>> destinationMiddleware;
        private JSMiddleware edgeFunctionMiddleware;
        private ExecutorService executor;
        private LogLevel logLevel;
        private ExecutorService networkExecutor;
        private List<Middleware> sourceMiddleware;
        private String tag;
        private String writeKey;
        private boolean collectDeviceID = true;
        private int flushQueueSize = 20;
        private long flushIntervalInMillis = NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS;
        private final List<Integration.Factory> factories = new ArrayList();
        private boolean trackApplicationLifecycleEvents = false;
        private boolean recordScreenViews = false;
        private boolean trackDeepLinks = false;
        private boolean nanosecondTimestamps = false;
        private ValueMap defaultProjectSettings = new ValueMap();
        private boolean useNewLifecycleMethods = true;
        private String defaultApiHost = Utils.DEFAULT_API_HOST;

        public Builder(Context context, String str) {
            if (Utils.hasPermission(context, "android.permission.INTERNET")) {
                this.application = (Application) context.getApplicationContext();
                if (!Utils.isEmptyOrBlank(str)) {
                    this.writeKey = str;
                    return;
                }
                throw new IllegalArgumentException("writeKey must not be empty.");
            }
            throw new IllegalArgumentException("INTERNET permission is required.");
        }

        public Analytics build() {
            Map immutableCopyOf;
            if (Utils.isNullOrEmpty(this.tag)) {
                this.tag = this.writeKey;
            }
            List<String> list = Analytics.INSTANCES;
            synchronized (list) {
                if (!list.contains(this.tag)) {
                    list.add(this.tag);
                } else {
                    throw new IllegalStateException("Duplicate analytics client created with tag: " + this.tag + ". If you want to use multiple Analytics clients, use a different writeKey or set a tag via the builder during construction.");
                }
            }
            if (this.defaultOptions == null) {
                this.defaultOptions = new Options();
            }
            if (this.logLevel == null) {
                this.logLevel = LogLevel.NONE;
            }
            if (this.networkExecutor == null) {
                this.networkExecutor = new Utils.AnalyticsNetworkExecutorService();
            }
            if (this.connectionFactory == null) {
                this.connectionFactory = new ConnectionFactory();
            }
            if (this.crypto == null) {
                this.crypto = Crypto.none();
            }
            Stats stats = new Stats();
            Cartographer cartographer = Cartographer.INSTANCE;
            Client client = new Client(this.writeKey, this.connectionFactory);
            ProjectSettings.Cache cache = new ProjectSettings.Cache(this.application, cartographer, this.tag);
            BooleanPreference booleanPreference = new BooleanPreference(Utils.getSegmentSharedPreferences(this.application, this.tag), Analytics.OPT_OUT_PREFERENCE_KEY, false);
            Traits.Cache cache2 = new Traits.Cache(this.application, cartographer, this.tag);
            if (!cache2.isSet() || cache2.get() == null) {
                cache2.set(Traits.create());
            }
            Logger with = Logger.with(this.logLevel);
            AnalyticsContext create = AnalyticsContext.create(this.application, cache2.get(), this.collectDeviceID);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            create.attachAdvertisingId(this.application, countDownLatch, with);
            create.attachDeviceId(Utils.getSegmentSharedPreferences(this.application, this.tag));
            ArrayList arrayList = new ArrayList(this.factories.size() + 1);
            arrayList.add(SegmentIntegration.FACTORY);
            arrayList.addAll(this.factories);
            JSMiddleware jSMiddleware = this.edgeFunctionMiddleware;
            if (jSMiddleware != null) {
                List<Middleware> list2 = jSMiddleware.sourceMiddleware;
                if (list2 != null) {
                    this.sourceMiddleware = list2;
                }
                Map<String, List<Middleware>> map = jSMiddleware.destinationMiddleware;
                if (map != null) {
                    this.destinationMiddleware = map;
                }
            }
            List immutableCopyOf2 = Utils.immutableCopyOf(this.sourceMiddleware);
            if (Utils.isNullOrEmpty(this.destinationMiddleware)) {
                immutableCopyOf = Collections.emptyMap();
            } else {
                immutableCopyOf = Utils.immutableCopyOf(this.destinationMiddleware);
            }
            Map map2 = immutableCopyOf;
            ExecutorService executorService = this.executor;
            if (executorService == null) {
                executorService = Executors.newSingleThreadExecutor();
            }
            return new Analytics(this.application, this.networkExecutor, stats, cache2, create, this.defaultOptions, with, this.tag, Collections.unmodifiableList(arrayList), client, cartographer, cache, this.writeKey, this.flushQueueSize, this.flushIntervalInMillis, executorService, this.trackApplicationLifecycleEvents, countDownLatch, this.recordScreenViews, this.trackDeepLinks, booleanPreference, this.crypto, immutableCopyOf2, map2, this.edgeFunctionMiddleware, this.defaultProjectSettings, m.j.g, this.nanosecondTimestamps, this.useNewLifecycleMethods, this.defaultApiHost);
        }

        public Builder collectDeviceId(boolean z) {
            this.collectDeviceID = z;
            return this;
        }

        public Builder connectionFactory(ConnectionFactory connectionFactory) {
            if (connectionFactory != null) {
                this.connectionFactory = connectionFactory;
                return this;
            }
            throw new IllegalArgumentException("ConnectionFactory must not be null.");
        }

        public Builder crypto(Crypto crypto) {
            if (crypto != null) {
                this.crypto = crypto;
                return this;
            }
            throw new IllegalArgumentException("Crypto must not be null.");
        }

        public Builder defaultApiHost(String str) {
            this.defaultApiHost = str;
            return this;
        }

        public Builder defaultOptions(Options options) {
            if (options != null) {
                this.defaultOptions = new Options();
                for (Map.Entry<String, Object> entry : options.integrations().entrySet()) {
                    if (entry.getValue() instanceof Boolean) {
                        this.defaultOptions.setIntegration(entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                    } else {
                        this.defaultOptions.setIntegration(entry.getKey(), true);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("defaultOptions must not be null.");
        }

        public Builder defaultProjectSettings(ValueMap valueMap) {
            Utils.assertNotNull(valueMap, "defaultProjectSettings");
            this.defaultProjectSettings = valueMap;
            return this;
        }

        public Builder executor(ExecutorService executorService) {
            this.executor = (ExecutorService) Utils.assertNotNull(executorService, "executor");
            return this;
        }

        public Builder experimentalNanosecondTimestamps() {
            this.nanosecondTimestamps = true;
            return this;
        }

        public Builder experimentalUseNewLifecycleMethods(boolean z) {
            this.useNewLifecycleMethods = z;
            return this;
        }

        public Builder flushInterval(long j, TimeUnit timeUnit) {
            if (timeUnit != null) {
                if (j > 0) {
                    this.flushIntervalInMillis = timeUnit.toMillis(j);
                    return this;
                }
                throw new IllegalArgumentException("flushInterval must be greater than zero.");
            }
            throw new IllegalArgumentException("timeUnit must not be null.");
        }

        public Builder flushQueueSize(int i) {
            if (i > 0) {
                if (i <= 250) {
                    this.flushQueueSize = i;
                    return this;
                }
                throw new IllegalArgumentException("flushQueueSize must be less than or equal to 250.");
            }
            throw new IllegalArgumentException("flushQueueSize must be greater than or equal to zero.");
        }

        public Builder logLevel(LogLevel logLevel) {
            if (logLevel != null) {
                this.logLevel = logLevel;
                return this;
            }
            throw new IllegalArgumentException("LogLevel must not be null.");
        }

        public Builder middleware(Middleware middleware) {
            return useSourceMiddleware(middleware);
        }

        public Builder networkExecutor(ExecutorService executorService) {
            if (executorService != null) {
                this.networkExecutor = executorService;
                return this;
            }
            throw new IllegalArgumentException("Executor service must not be null.");
        }

        public Builder recordScreenViews() {
            this.recordScreenViews = true;
            return this;
        }

        public Builder tag(String str) {
            if (!Utils.isNullOrEmpty(str)) {
                this.tag = str;
                return this;
            }
            throw new IllegalArgumentException("tag must not be null or empty.");
        }

        public Builder trackApplicationLifecycleEvents() {
            this.trackApplicationLifecycleEvents = true;
            return this;
        }

        public Builder trackDeepLinks() {
            this.trackDeepLinks = true;
            return this;
        }

        public Builder use(Integration.Factory factory) {
            if (factory != null) {
                this.factories.add(factory);
                return this;
            }
            throw new IllegalArgumentException("Factory must not be null.");
        }

        public Builder useDestinationMiddleware(String str, Middleware middleware) {
            if (this.edgeFunctionMiddleware == null) {
                if (!Utils.isNullOrEmpty(str)) {
                    Utils.assertNotNull(middleware, "middleware");
                    if (this.destinationMiddleware == null) {
                        this.destinationMiddleware = new HashMap();
                    }
                    List<Middleware> list = this.destinationMiddleware.get(str);
                    if (list == null) {
                        list = new ArrayList<>();
                        this.destinationMiddleware.put(str, list);
                    }
                    if (!list.contains(middleware)) {
                        list.add(middleware);
                        return this;
                    }
                    throw new IllegalStateException("Destination Middleware is already registered.");
                }
                throw new IllegalArgumentException("key must not be null or empty.");
            }
            throw new IllegalStateException("Can not use native middleware and edge function middleware");
        }

        public Builder useEdgeFunctionMiddleware(JSMiddleware jSMiddleware) {
            Utils.assertNotNull(jSMiddleware, "middleware");
            if (this.sourceMiddleware == null && this.destinationMiddleware == null) {
                this.edgeFunctionMiddleware = jSMiddleware;
                return this;
            }
            throw new IllegalStateException("Can not use native middleware and edge function middleware");
        }

        public Builder useSourceMiddleware(Middleware middleware) {
            if (this.edgeFunctionMiddleware == null) {
                Utils.assertNotNull(middleware, "middleware");
                if (this.sourceMiddleware == null) {
                    this.sourceMiddleware = new ArrayList();
                }
                if (!this.sourceMiddleware.contains(middleware)) {
                    this.sourceMiddleware.add(middleware);
                    return this;
                }
                throw new IllegalStateException("Source Middleware is already registered.");
            }
            throw new IllegalStateException("Can not use native middleware and edge function middleware");
        }

        @Deprecated
        public Builder disableBundledIntegrations() {
            return this;
        }

        @Deprecated
        public Builder trackAttributionInformation() {
            return this;
        }
    }
}
