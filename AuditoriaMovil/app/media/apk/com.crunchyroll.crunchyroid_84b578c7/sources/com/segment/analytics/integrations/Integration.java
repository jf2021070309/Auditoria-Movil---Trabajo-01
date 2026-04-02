package com.segment.analytics.integrations;

import android.app.Activity;
import android.os.Bundle;
import com.segment.analytics.Analytics;
import com.segment.analytics.ValueMap;
/* loaded from: classes4.dex */
public abstract class Integration<T> {

    /* loaded from: classes4.dex */
    public interface Factory {
        Integration<?> create(ValueMap valueMap, Analytics analytics);

        String key();
    }

    public T getUnderlyingInstance() {
        return null;
    }

    public void flush() {
    }

    public void reset() {
    }

    public void alias(AliasPayload aliasPayload) {
    }

    public void group(GroupPayload groupPayload) {
    }

    public void identify(IdentifyPayload identifyPayload) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void screen(ScreenPayload screenPayload) {
    }

    public void track(TrackPayload trackPayload) {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
