package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks {
    private final List<com.applovin.impl.sdk.utils.a> a = Collections.synchronizedList(new ArrayList());
    private WeakReference<Activity> b;
    private WeakReference<Activity> c;

    public a(Context context) {
        this.b = new WeakReference<>(null);
        this.c = new WeakReference<>(null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.b = new WeakReference<>(activity);
            if (activity.hasWindowFocus()) {
                this.c = this.b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return this.b.get();
    }

    public void a(com.applovin.impl.sdk.utils.a aVar) {
        this.a.add(aVar);
    }

    public Activity b() {
        return this.c.get();
    }

    public void b(com.applovin.impl.sdk.utils.a aVar) {
        this.a.remove(aVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (com.applovin.impl.sdk.utils.a aVar : new ArrayList(this.a)) {
            aVar.onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        for (com.applovin.impl.sdk.utils.a aVar : new ArrayList(this.a)) {
            aVar.onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.c = new WeakReference<>(null);
        for (com.applovin.impl.sdk.utils.a aVar : new ArrayList(this.a)) {
            aVar.onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.b = weakReference;
        this.c = weakReference;
        for (com.applovin.impl.sdk.utils.a aVar : new ArrayList(this.a)) {
            aVar.onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (com.applovin.impl.sdk.utils.a aVar : new ArrayList(this.a)) {
            aVar.onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        for (com.applovin.impl.sdk.utils.a aVar : new ArrayList(this.a)) {
            aVar.onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        for (com.applovin.impl.sdk.utils.a aVar : new ArrayList(this.a)) {
            aVar.onActivityStopped(activity);
        }
    }
}
