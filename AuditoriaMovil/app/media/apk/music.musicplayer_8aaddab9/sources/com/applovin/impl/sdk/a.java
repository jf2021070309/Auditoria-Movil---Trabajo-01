package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks {
    private final List<com.applovin.impl.sdk.utils.a> a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Activity> f3792b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<Activity> f3793c;

    public a(Context context) {
        this.f3792b = new WeakReference<>(null);
        this.f3793c = new WeakReference<>(null);
        v.f("AppLovinSdk", "Attaching Activity lifecycle manager...");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f3792b = new WeakReference<>(activity);
            if (activity.hasWindowFocus()) {
                this.f3793c = this.f3792b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return this.f3792b.get();
    }

    public void a(com.applovin.impl.sdk.utils.a aVar) {
        this.a.add(aVar);
    }

    public Activity b() {
        return this.f3793c.get();
    }

    public void b(com.applovin.impl.sdk.utils.a aVar) {
        this.a.remove(aVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f3793c = new WeakReference<>(null);
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.f3792b = weakReference;
        this.f3793c = weakReference;
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityStopped(activity);
        }
    }
}
