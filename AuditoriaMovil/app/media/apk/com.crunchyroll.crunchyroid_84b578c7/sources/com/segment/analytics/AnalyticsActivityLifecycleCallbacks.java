package com.segment.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.g;
import com.amazon.aps.iva.i5.g;
import com.amazon.aps.iva.i5.n;
import com.amazon.aps.iva.i5.o;
import com.google.android.gms.common.internal.ImagesContract;
import com.segment.analytics.internal.Utils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class AnalyticsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks, g {
    private static o stubOwner = new o() { // from class: com.segment.analytics.AnalyticsActivityLifecycleCallbacks.1
        androidx.lifecycle.g stubLifecycle = new androidx.lifecycle.g() { // from class: com.segment.analytics.AnalyticsActivityLifecycleCallbacks.1.1
            @Override // androidx.lifecycle.g
            public g.b getCurrentState() {
                return g.b.DESTROYED;
            }

            @Override // androidx.lifecycle.g
            public void addObserver(n nVar) {
            }

            @Override // androidx.lifecycle.g
            public void removeObserver(n nVar) {
            }
        };

        @Override // com.amazon.aps.iva.i5.o
        public androidx.lifecycle.g getLifecycle() {
            return this.stubLifecycle;
        }
    };
    private Analytics analytics;
    private ExecutorService analyticsExecutor;
    private AtomicBoolean firstLaunch;
    private AtomicBoolean isChangingActivityConfigurations;
    private AtomicInteger numberOfActivities;
    private PackageInfo packageInfo;
    private Boolean shouldRecordScreenViews;
    private Boolean shouldTrackApplicationLifecycleEvents;
    private Boolean trackDeepLinks;
    private AtomicBoolean trackedApplicationLifecycleEvents;
    private Boolean useNewLifecycleMethods;

    /* loaded from: classes4.dex */
    public static class Builder {
        private Analytics analytics;
        private ExecutorService analyticsExecutor;
        private PackageInfo packageInfo;
        private Boolean shouldRecordScreenViews;
        private Boolean shouldTrackApplicationLifecycleEvents;
        private Boolean trackDeepLinks;
        private Boolean useNewLifecycleMethods;

        public Builder analytics(Analytics analytics) {
            this.analytics = analytics;
            return this;
        }

        public Builder analyticsExecutor(ExecutorService executorService) {
            this.analyticsExecutor = executorService;
            return this;
        }

        public AnalyticsActivityLifecycleCallbacks build() {
            return new AnalyticsActivityLifecycleCallbacks(this.analytics, this.analyticsExecutor, this.shouldTrackApplicationLifecycleEvents, this.trackDeepLinks, this.shouldRecordScreenViews, this.packageInfo, this.useNewLifecycleMethods);
        }

        public Builder packageInfo(PackageInfo packageInfo) {
            this.packageInfo = packageInfo;
            return this;
        }

        public Builder shouldRecordScreenViews(Boolean bool) {
            this.shouldRecordScreenViews = bool;
            return this;
        }

        public Builder shouldTrackApplicationLifecycleEvents(Boolean bool) {
            this.shouldTrackApplicationLifecycleEvents = bool;
            return this;
        }

        public Builder trackDeepLinks(Boolean bool) {
            this.trackDeepLinks = bool;
            return this;
        }

        public Builder useNewLifecycleMethods(boolean z) {
            this.useNewLifecycleMethods = Boolean.valueOf(z);
            return this;
        }
    }

    private void trackDeepLink(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null && intent.getData() != null) {
            Properties properties = new Properties();
            Uri referrer = Utils.getReferrer(activity);
            if (referrer != null) {
                properties.putReferrer(referrer.toString());
            }
            Uri data = intent.getData();
            try {
                for (String str : data.getQueryParameterNames()) {
                    String queryParameter = data.getQueryParameter(str);
                    if (queryParameter != null && !queryParameter.trim().isEmpty()) {
                        properties.put(str, (Object) queryParameter);
                    }
                }
            } catch (Exception e) {
                this.analytics.logger("LifecycleCallbacks").error(e, "failed to get uri params for %s", data.toString());
            }
            properties.put(ImagesContract.URL, (Object) data.toString());
            this.analytics.track("Deep Link Opened", properties);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivityCreated(activity, bundle));
        if (!this.useNewLifecycleMethods.booleanValue()) {
            onCreate(stubOwner);
        }
        if (this.trackDeepLinks.booleanValue()) {
            trackDeepLink(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivityDestroyed(activity));
        if (!this.useNewLifecycleMethods.booleanValue()) {
            onDestroy(stubOwner);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivityPaused(activity));
        if (!this.useNewLifecycleMethods.booleanValue()) {
            onPause(stubOwner);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivityResumed(activity));
        if (!this.useNewLifecycleMethods.booleanValue()) {
            onStart(stubOwner);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivitySaveInstanceState(activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.shouldRecordScreenViews.booleanValue()) {
            this.analytics.recordScreenViews(activity);
        }
        this.analytics.runOnMainThread(IntegrationOperation.onActivityStarted(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivityStopped(activity));
        if (!this.useNewLifecycleMethods.booleanValue()) {
            onStop(stubOwner);
        }
    }

    @Override // com.amazon.aps.iva.i5.g
    public void onCreate(o oVar) {
        if (!this.trackedApplicationLifecycleEvents.getAndSet(true) && this.shouldTrackApplicationLifecycleEvents.booleanValue()) {
            this.numberOfActivities.set(0);
            this.firstLaunch.set(true);
            this.analytics.trackApplicationLifecycleEvents();
        }
    }

    @Override // com.amazon.aps.iva.i5.g
    public void onStart(o oVar) {
        if (this.shouldTrackApplicationLifecycleEvents.booleanValue() && this.numberOfActivities.incrementAndGet() == 1 && !this.isChangingActivityConfigurations.get()) {
            Properties properties = new Properties();
            if (this.firstLaunch.get()) {
                properties.putValue("version", (Object) this.packageInfo.versionName).putValue("build", (Object) String.valueOf(this.packageInfo.versionCode));
            }
            properties.putValue("from_background", (Object) Boolean.valueOf(true ^ this.firstLaunch.getAndSet(false)));
            this.analytics.track("Application Opened", properties);
        }
    }

    @Override // com.amazon.aps.iva.i5.g
    public void onStop(o oVar) {
        if (this.shouldTrackApplicationLifecycleEvents.booleanValue() && this.numberOfActivities.decrementAndGet() == 0 && !this.isChangingActivityConfigurations.get()) {
            this.analytics.track("Application Backgrounded");
        }
    }

    private AnalyticsActivityLifecycleCallbacks(Analytics analytics, ExecutorService executorService, Boolean bool, Boolean bool2, Boolean bool3, PackageInfo packageInfo, Boolean bool4) {
        this.trackedApplicationLifecycleEvents = new AtomicBoolean(false);
        this.numberOfActivities = new AtomicInteger(1);
        this.firstLaunch = new AtomicBoolean(false);
        this.analytics = analytics;
        this.analyticsExecutor = executorService;
        this.shouldTrackApplicationLifecycleEvents = bool;
        this.trackDeepLinks = bool2;
        this.shouldRecordScreenViews = bool3;
        this.packageInfo = packageInfo;
        this.useNewLifecycleMethods = bool4;
        this.isChangingActivityConfigurations = new AtomicBoolean(false);
    }

    @Override // com.amazon.aps.iva.i5.g
    public void onDestroy(o oVar) {
    }

    @Override // com.amazon.aps.iva.i5.g
    public void onPause(o oVar) {
    }

    @Override // com.amazon.aps.iva.i5.g
    public void onResume(o oVar) {
    }
}
