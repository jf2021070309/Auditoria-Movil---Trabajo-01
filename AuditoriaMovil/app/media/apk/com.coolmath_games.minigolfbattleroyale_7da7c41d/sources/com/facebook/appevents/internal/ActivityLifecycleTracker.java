package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ActivityLifecycleTracker.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\n\u0010 \u001a\u0004\u0018\u00010\rH\u0007J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0007J\b\u0010#\u001a\u00020$H\u0007J\b\u0010%\u001a\u00020$H\u0007J\u0012\u0010&\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\rH\u0002J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\rH\u0002J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\rH\u0007J\u001a\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/facebook/appevents/internal/ActivityLifecycleTracker;", "", "()V", "INCORRECT_IMPL_WARNING", "", "INTERRUPTION_THRESHOLD_MILLISECONDS", "", "TAG", "activityReferences", "", "appId", "currActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "currentActivityAppearTime", "currentFuture", "Ljava/util/concurrent/ScheduledFuture;", "currentFutureLock", "currentSession", "Lcom/facebook/appevents/internal/SessionInfo;", "foregroundActivityCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "sessionTimeoutInSeconds", "getSessionTimeoutInSeconds", "()I", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "tracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cancelCurrentTask", "", "getCurrentActivity", "getCurrentSessionGuid", "Ljava/util/UUID;", "isInBackground", "", "isTracking", "onActivityCreated", "activity", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "startTracking", "application", "Landroid/app/Application;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class ActivityLifecycleTracker {
    private static final String INCORRECT_IMPL_WARNING = "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method";
    public static final ActivityLifecycleTracker INSTANCE = new ActivityLifecycleTracker();
    private static final long INTERRUPTION_THRESHOLD_MILLISECONDS = 1000;
    private static final String TAG;
    private static int activityReferences;
    private static String appId;
    private static WeakReference<Activity> currActivity;
    private static long currentActivityAppearTime;
    private static volatile ScheduledFuture<?> currentFuture;
    private static final Object currentFutureLock;
    private static volatile SessionInfo currentSession;
    private static final AtomicInteger foregroundActivityCount;
    private static final ScheduledExecutorService singleThreadExecutor;
    private static final AtomicBoolean tracking;

    static {
        String canonicalName = ActivityLifecycleTracker.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        TAG = canonicalName;
        singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
        currentFutureLock = new Object();
        foregroundActivityCount = new AtomicInteger(0);
        tracking = new AtomicBoolean(false);
    }

    private ActivityLifecycleTracker() {
    }

    @JvmStatic
    public static final void startTracking(Application application, String str) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (tracking.compareAndSet(false, true)) {
            FeatureManager.checkFeature(FeatureManager.Feature.CodelessEvents, new FeatureManager.Callback() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker$startTracking$1
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z) {
                    if (z) {
                        CodelessManager.enable();
                    } else {
                        CodelessManager.disable();
                    }
                }
            });
            appId = str;
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker$startTracking$2
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    String str2;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                    str2 = ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str2, "onActivityCreated");
                    AppEventUtility.assertIsMainThread();
                    ActivityLifecycleTracker.onActivityCreated(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    int i;
                    String str2;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                    i = ActivityLifecycleTracker.activityReferences;
                    ActivityLifecycleTracker.activityReferences = i + 1;
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    ActivityLifecycleTracker activityLifecycleTracker2 = ActivityLifecycleTracker.INSTANCE;
                    str2 = ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str2, "onActivityStarted");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    String str2;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                    str2 = ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str2, "onActivityResumed");
                    AppEventUtility.assertIsMainThread();
                    ActivityLifecycleTracker.onActivityResumed(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    String str2;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                    str2 = ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str2, "onActivityPaused");
                    AppEventUtility.assertIsMainThread();
                    ActivityLifecycleTracker.INSTANCE.onActivityPaused(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    String str2;
                    int i;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                    str2 = ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str2, "onActivityStopped");
                    AppEventsLogger.Companion.onContextStop();
                    ActivityLifecycleTracker activityLifecycleTracker2 = ActivityLifecycleTracker.INSTANCE;
                    i = ActivityLifecycleTracker.activityReferences;
                    ActivityLifecycleTracker.activityReferences = i - 1;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                    String str2;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Intrinsics.checkNotNullParameter(outState, "outState");
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                    str2 = ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str2, "onActivitySaveInstanceState");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    String str2;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                    str2 = ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str2, "onActivityDestroyed");
                    ActivityLifecycleTracker.INSTANCE.onActivityDestroyed(activity);
                }
            });
        }
    }

    @JvmStatic
    public static final boolean isInBackground() {
        return activityReferences == 0;
    }

    @JvmStatic
    public static final boolean isTracking() {
        return tracking.get();
    }

    @JvmStatic
    public static final UUID getCurrentSessionGuid() {
        SessionInfo sessionInfo;
        if (currentSession == null || (sessionInfo = currentSession) == null) {
            return null;
        }
        return sessionInfo.getSessionId();
    }

    @JvmStatic
    public static final void onActivityCreated(Activity activity) {
        singleThreadExecutor.execute(new Runnable() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker$onActivityCreated$1
            @Override // java.lang.Runnable
            public final void run() {
                SessionInfo sessionInfo;
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    if (CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                    sessionInfo = ActivityLifecycleTracker.currentSession;
                    if (sessionInfo == null) {
                        ActivityLifecycleTracker activityLifecycleTracker2 = ActivityLifecycleTracker.INSTANCE;
                        ActivityLifecycleTracker.currentSession = SessionInfo.Companion.getStoredSessionInfo();
                    }
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        });
    }

    @JvmStatic
    public static final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        currActivity = new WeakReference<>(activity);
        foregroundActivityCount.incrementAndGet();
        INSTANCE.cancelCurrentTask();
        final long currentTimeMillis = System.currentTimeMillis();
        currentActivityAppearTime = currentTimeMillis;
        final String activityName = Utility.getActivityName(activity);
        CodelessManager.onActivityResumed(activity);
        MetadataIndexer.onActivityResumed(activity);
        SuggestedEventsManager.trackActivity(activity);
        InAppPurchaseManager.startTracking();
        final Context applicationContext = activity.getApplicationContext();
        singleThreadExecutor.execute(new Runnable() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker$onActivityResumed$handleActivityResume$1
            @Override // java.lang.Runnable
            public final void run() {
                SessionInfo sessionInfo;
                SessionInfo sessionInfo2;
                int sessionTimeoutInSeconds;
                SessionInfo sessionInfo3;
                SessionInfo sessionInfo4;
                String str;
                String str2;
                SessionInfo sessionInfo5;
                SessionInfo sessionInfo6;
                String str3;
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    if (CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                    sessionInfo = ActivityLifecycleTracker.currentSession;
                    Long sessionLastEventTime = sessionInfo != null ? sessionInfo.getSessionLastEventTime() : null;
                    ActivityLifecycleTracker activityLifecycleTracker2 = ActivityLifecycleTracker.INSTANCE;
                    sessionInfo2 = ActivityLifecycleTracker.currentSession;
                    if (sessionInfo2 == null) {
                        ActivityLifecycleTracker activityLifecycleTracker3 = ActivityLifecycleTracker.INSTANCE;
                        ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(currentTimeMillis), null, null, 4, null);
                        String str4 = activityName;
                        ActivityLifecycleTracker activityLifecycleTracker4 = ActivityLifecycleTracker.INSTANCE;
                        str3 = ActivityLifecycleTracker.appId;
                        Context appContext = applicationContext;
                        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                        SessionLogger.logActivateApp(str4, null, str3, appContext);
                    } else if (sessionLastEventTime != null) {
                        long longValue = currentTimeMillis - sessionLastEventTime.longValue();
                        sessionTimeoutInSeconds = ActivityLifecycleTracker.INSTANCE.getSessionTimeoutInSeconds();
                        if (longValue > sessionTimeoutInSeconds * 1000) {
                            String str5 = activityName;
                            ActivityLifecycleTracker activityLifecycleTracker5 = ActivityLifecycleTracker.INSTANCE;
                            sessionInfo4 = ActivityLifecycleTracker.currentSession;
                            ActivityLifecycleTracker activityLifecycleTracker6 = ActivityLifecycleTracker.INSTANCE;
                            str = ActivityLifecycleTracker.appId;
                            SessionLogger.logDeactivateApp(str5, sessionInfo4, str);
                            String str6 = activityName;
                            ActivityLifecycleTracker activityLifecycleTracker7 = ActivityLifecycleTracker.INSTANCE;
                            str2 = ActivityLifecycleTracker.appId;
                            Context appContext2 = applicationContext;
                            Intrinsics.checkNotNullExpressionValue(appContext2, "appContext");
                            SessionLogger.logActivateApp(str6, null, str2, appContext2);
                            ActivityLifecycleTracker activityLifecycleTracker8 = ActivityLifecycleTracker.INSTANCE;
                            ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(currentTimeMillis), null, null, 4, null);
                        } else if (longValue > 1000) {
                            ActivityLifecycleTracker activityLifecycleTracker9 = ActivityLifecycleTracker.INSTANCE;
                            sessionInfo3 = ActivityLifecycleTracker.currentSession;
                            if (sessionInfo3 != null) {
                                sessionInfo3.incrementInterruptionCount();
                            }
                        }
                    }
                    ActivityLifecycleTracker activityLifecycleTracker10 = ActivityLifecycleTracker.INSTANCE;
                    sessionInfo5 = ActivityLifecycleTracker.currentSession;
                    if (sessionInfo5 != null) {
                        sessionInfo5.setSessionLastEventTime(Long.valueOf(currentTimeMillis));
                    }
                    ActivityLifecycleTracker activityLifecycleTracker11 = ActivityLifecycleTracker.INSTANCE;
                    sessionInfo6 = ActivityLifecycleTracker.currentSession;
                    if (sessionInfo6 != null) {
                        sessionInfo6.writeSessionToDisk();
                    }
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivityPaused(Activity activity) {
        if (foregroundActivityCount.decrementAndGet() < 0) {
            foregroundActivityCount.set(0);
            Log.w(TAG, INCORRECT_IMPL_WARNING);
        }
        cancelCurrentTask();
        long currentTimeMillis = System.currentTimeMillis();
        String activityName = Utility.getActivityName(activity);
        CodelessManager.onActivityPaused(activity);
        singleThreadExecutor.execute(new ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1(currentTimeMillis, activityName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivityDestroyed(Activity activity) {
        CodelessManager.onActivityDestroyed(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSessionTimeoutInSeconds() {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        if (appSettingsWithoutQuery == null) {
            return Constants.getDefaultAppEventsSessionTimeoutInSeconds();
        }
        return appSettingsWithoutQuery.getSessionTimeoutInSeconds();
    }

    private final void cancelCurrentTask() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (currentFutureLock) {
            if (currentFuture != null && (scheduledFuture = currentFuture) != null) {
                scheduledFuture.cancel(false);
            }
            currentFuture = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = currActivity;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
