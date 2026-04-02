package com.kwad.sdk.core.c;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {
    private final List<WeakReference<Activity>> aoA;
    private WeakReference<Activity> currentActivity;
    private Application mApplication;
    private boolean mEnable;
    private boolean mIsInBackground;
    private final List<c> mListeners;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.sdk.core.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0247a {
        static final a aoB = new a((byte) 0);
    }

    private a() {
        this.mIsInBackground = true;
        this.mListeners = new CopyOnWriteArrayList();
        this.aoA = new ArrayList();
        this.mEnable = false;
    }

    /* synthetic */ a(byte b) {
        this();
    }

    public static a AR() {
        return C0247a.aoB;
    }

    private boolean AS() {
        return b.AU() || !this.mEnable;
    }

    private void f(Activity activity) {
        for (WeakReference<Activity> weakReference : this.aoA) {
            if (weakReference.get() == activity) {
                return;
            }
        }
        this.aoA.add(new WeakReference<>(activity));
    }

    private void g(Activity activity) {
        Activity activity2;
        if (activity == null) {
            return;
        }
        Iterator<WeakReference<Activity>> it = this.aoA.iterator();
        while (it.hasNext()) {
            WeakReference<Activity> next = it.next();
            if (next != null && ((activity2 = next.get()) == activity || activity2 == null)) {
                it.remove();
            }
        }
    }

    public final void a(c cVar) {
        this.mListeners.add(cVar);
    }

    public final Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void init(Context context) {
        try {
            Application application = (Application) context;
            this.mApplication = application;
            application.registerActivityLifecycleCallbacks(this);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final boolean isAppOnForeground() {
        return !this.mIsInBackground;
    }

    public final boolean isEnable() {
        return this.mEnable;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.mEnable = true;
        if (AS()) {
            return;
        }
        try {
            for (c cVar : this.mListeners) {
                cVar.a(activity, bundle);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (AS()) {
            return;
        }
        try {
            for (c cVar : this.mListeners) {
                cVar.d(activity);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (AS()) {
            return;
        }
        try {
            for (c cVar : this.mListeners) {
                cVar.b(activity);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (AS()) {
            return;
        }
        try {
            this.currentActivity = new WeakReference<>(activity);
            for (c cVar : this.mListeners) {
                cVar.c(activity);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (AS()) {
            return;
        }
        try {
            f(activity);
            if (this.aoA.size() == 1) {
                this.mIsInBackground = false;
                for (c cVar : this.mListeners) {
                    cVar.onBackToForeground();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (AS()) {
            return;
        }
        try {
            g(activity);
            if (this.aoA.size() == 0) {
                this.mIsInBackground = true;
                for (c cVar : this.mListeners) {
                    cVar.onBackToBackground();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
