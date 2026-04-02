package com.facebook.appevents.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityLifecycleTracker.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1 implements Runnable {
    final /* synthetic */ String $activityName;
    final /* synthetic */ long $currentTime;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1(long j, String str) {
        this.$currentTime = j;
        this.$activityName = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SessionInfo sessionInfo;
        SessionInfo sessionInfo2;
        AtomicInteger atomicInteger;
        long j;
        SessionInfo sessionInfo3;
        Object obj;
        ScheduledExecutorService scheduledExecutorService;
        int sessionTimeoutInSeconds;
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
                ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(this.$currentTime), null, null, 4, null);
            }
            ActivityLifecycleTracker activityLifecycleTracker3 = ActivityLifecycleTracker.INSTANCE;
            sessionInfo2 = ActivityLifecycleTracker.currentSession;
            if (sessionInfo2 != null) {
                sessionInfo2.setSessionLastEventTime(Long.valueOf(this.$currentTime));
            }
            ActivityLifecycleTracker activityLifecycleTracker4 = ActivityLifecycleTracker.INSTANCE;
            atomicInteger = ActivityLifecycleTracker.foregroundActivityCount;
            if (atomicInteger.get() <= 0) {
                Runnable runnable = new Runnable() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1$task$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SessionInfo sessionInfo4;
                        AtomicInteger atomicInteger2;
                        Object obj2;
                        SessionInfo sessionInfo5;
                        String str;
                        if (CrashShieldHandler.isObjectCrashing(this)) {
                            return;
                        }
                        try {
                            if (CrashShieldHandler.isObjectCrashing(this)) {
                                return;
                            }
                            ActivityLifecycleTracker activityLifecycleTracker5 = ActivityLifecycleTracker.INSTANCE;
                            sessionInfo4 = ActivityLifecycleTracker.currentSession;
                            if (sessionInfo4 == null) {
                                ActivityLifecycleTracker activityLifecycleTracker6 = ActivityLifecycleTracker.INSTANCE;
                                ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1.this.$currentTime), null, null, 4, null);
                            }
                            ActivityLifecycleTracker activityLifecycleTracker7 = ActivityLifecycleTracker.INSTANCE;
                            atomicInteger2 = ActivityLifecycleTracker.foregroundActivityCount;
                            if (atomicInteger2.get() <= 0) {
                                String str2 = ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1.this.$activityName;
                                ActivityLifecycleTracker activityLifecycleTracker8 = ActivityLifecycleTracker.INSTANCE;
                                sessionInfo5 = ActivityLifecycleTracker.currentSession;
                                ActivityLifecycleTracker activityLifecycleTracker9 = ActivityLifecycleTracker.INSTANCE;
                                str = ActivityLifecycleTracker.appId;
                                SessionLogger.logDeactivateApp(str2, sessionInfo5, str);
                                SessionInfo.Companion.clearSavedSessionFromDisk();
                                ActivityLifecycleTracker activityLifecycleTracker10 = ActivityLifecycleTracker.INSTANCE;
                                ActivityLifecycleTracker.currentSession = null;
                            }
                            ActivityLifecycleTracker activityLifecycleTracker11 = ActivityLifecycleTracker.INSTANCE;
                            obj2 = ActivityLifecycleTracker.currentFutureLock;
                            synchronized (obj2) {
                                ActivityLifecycleTracker activityLifecycleTracker12 = ActivityLifecycleTracker.INSTANCE;
                                ActivityLifecycleTracker.currentFuture = null;
                                Unit unit = Unit.INSTANCE;
                            }
                        } catch (Throwable th) {
                            CrashShieldHandler.handleThrowable(th, this);
                        }
                    }
                };
                ActivityLifecycleTracker activityLifecycleTracker5 = ActivityLifecycleTracker.INSTANCE;
                obj = ActivityLifecycleTracker.currentFutureLock;
                synchronized (obj) {
                    ActivityLifecycleTracker activityLifecycleTracker6 = ActivityLifecycleTracker.INSTANCE;
                    ActivityLifecycleTracker activityLifecycleTracker7 = ActivityLifecycleTracker.INSTANCE;
                    scheduledExecutorService = ActivityLifecycleTracker.singleThreadExecutor;
                    sessionTimeoutInSeconds = ActivityLifecycleTracker.INSTANCE.getSessionTimeoutInSeconds();
                    ActivityLifecycleTracker.currentFuture = scheduledExecutorService.schedule(runnable, sessionTimeoutInSeconds, TimeUnit.SECONDS);
                    Unit unit = Unit.INSTANCE;
                }
            }
            ActivityLifecycleTracker activityLifecycleTracker8 = ActivityLifecycleTracker.INSTANCE;
            j = ActivityLifecycleTracker.currentActivityAppearTime;
            AutomaticAnalyticsLogger.logActivityTimeSpentEvent(this.$activityName, j > 0 ? (this.$currentTime - j) / 1000 : 0L);
            ActivityLifecycleTracker activityLifecycleTracker9 = ActivityLifecycleTracker.INSTANCE;
            sessionInfo3 = ActivityLifecycleTracker.currentSession;
            if (sessionInfo3 != null) {
                sessionInfo3.writeSessionToDisk();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
