package com.vungle.warren.utility;

import com.vungle.warren.SessionData;
import com.vungle.warren.utility.ActivityManager;
/* loaded from: classes2.dex */
public class AppSession {
    ActivityManager.LifeCycleCallback appLifeCycleCallback = new ActivityManager.LifeCycleCallback() { // from class: com.vungle.warren.utility.AppSession.1
        private long timestamp;

        @Override // com.vungle.warren.utility.ActivityManager.LifeCycleCallback
        public void onStart() {
            if (this.timestamp <= 0) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.timestamp;
            if (AppSession.this.sessionData == null || AppSession.this.sessionData.getTimeout() <= -1 || currentTimeMillis < AppSession.this.sessionData.getTimeout() * 1000 || AppSession.this.sessionCallback == null) {
                return;
            }
            AppSession.this.sessionCallback.onSessionTimeout();
        }

        @Override // com.vungle.warren.utility.ActivityManager.LifeCycleCallback
        public void onStop() {
            this.timestamp = System.currentTimeMillis();
        }
    };
    private SessionCallback sessionCallback;
    private SessionData sessionData;

    /* loaded from: classes2.dex */
    public interface SessionCallback {
        void onSessionTimeout();
    }

    public AppSession setSessionData(SessionData sessionData) {
        this.sessionData = sessionData;
        return this;
    }

    public AppSession setSessionCallback(SessionCallback sessionCallback) {
        this.sessionCallback = sessionCallback;
        return this;
    }

    public void observe() {
        ActivityManager.getInstance().addListener(this.appLifeCycleCallback);
    }
}
