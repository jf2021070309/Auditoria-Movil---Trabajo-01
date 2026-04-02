package com.bytedance.sdk.openadsdk.dr;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* loaded from: classes.dex */
class dr implements Application.ActivityLifecycleCallbacks {
    private static volatile boolean dr = false;
    private int ge = 0;
    private InterfaceC0100dr o;

    /* renamed from: com.bytedance.sdk.openadsdk.dr.dr$dr  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0100dr {
        void dr();

        void ge();
    }

    public Boolean dr() {
        return Boolean.valueOf(dr);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.ge++;
        dr = false;
        InterfaceC0100dr interfaceC0100dr = this.o;
        if (interfaceC0100dr != null) {
            interfaceC0100dr.ge();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i = this.ge - 1;
        this.ge = i;
        if (i == 0) {
            dr = true;
            InterfaceC0100dr interfaceC0100dr = this.o;
            if (interfaceC0100dr != null) {
                interfaceC0100dr.dr();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    public void dr(InterfaceC0100dr interfaceC0100dr) {
        this.o = interfaceC0100dr;
    }
}
