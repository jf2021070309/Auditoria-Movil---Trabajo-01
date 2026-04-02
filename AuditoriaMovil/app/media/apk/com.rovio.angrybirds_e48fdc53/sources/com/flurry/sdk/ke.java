package com.flurry.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.flurry.sdk.kd;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class ke {
    private static final String a = ke.class.getSimpleName();
    private static ke b;
    private Application.ActivityLifecycleCallbacks c;

    private ke() {
        if (Build.VERSION.SDK_INT < 14 || this.c != null) {
            return;
        }
        Context context = ka.a().a;
        if (!(context instanceof Application)) {
            return;
        }
        this.c = new Application.ActivityLifecycleCallbacks() { // from class: com.flurry.sdk.ke.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                ko.a(3, ke.a, "onActivityCreated for activity:" + activity);
                a(activity, kd.a.kCreated);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                ko.a(3, ke.a, "onActivityStarted for activity:" + activity);
                a(activity, kd.a.kStarted);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                ko.a(3, ke.a, "onActivityResumed for activity:" + activity);
                a(activity, kd.a.kResumed);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                ko.a(3, ke.a, "onActivityPaused for activity:" + activity);
                a(activity, kd.a.kPaused);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                ko.a(3, ke.a, "onActivityStopped for activity:" + activity);
                a(activity, kd.a.kStopped);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                ko.a(3, ke.a, "onActivitySaveInstanceState for activity:" + activity);
                a(activity, kd.a.kSaveState);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                ko.a(3, ke.a, "onActivityDestroyed for activity:" + activity);
                a(activity, kd.a.kDestroyed);
            }

            private static void a(Activity activity, kd.a aVar) {
                kd kdVar = new kd();
                kdVar.a = new WeakReference<>(activity);
                kdVar.b = aVar;
                kdVar.b();
            }
        };
        ((Application) context).registerActivityLifecycleCallbacks(this.c);
    }

    public static synchronized ke a() {
        ke keVar;
        synchronized (ke.class) {
            if (b == null) {
                b = new ke();
            }
            keVar = b;
        }
        return keVar;
    }

    public final boolean b() {
        return this.c != null;
    }
}
