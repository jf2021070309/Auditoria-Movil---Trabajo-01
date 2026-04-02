package e.j.d.c0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class e implements Application.ActivityLifecycleCallbacks {
    public final Class<? extends Activity> a;

    /* renamed from: b  reason: collision with root package name */
    public final d f8633b;

    public e(Class<? extends Activity> cls, d dVar) {
        h.o.c.j.e(cls, "activityClass");
        h.o.c.j.e(dVar, "callbacks");
        this.a = cls;
        this.f8633b = dVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        h.o.c.j.e(activity, "activity");
        if (h.o.c.j.a(activity.getClass(), this.a)) {
            this.f8633b.onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        h.o.c.j.e(activity, "activity");
        if (h.o.c.j.a(activity.getClass(), this.a)) {
            this.f8633b.onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        h.o.c.j.e(activity, "activity");
        if (h.o.c.j.a(activity.getClass(), this.a)) {
            Objects.requireNonNull(this.f8633b);
            h.o.c.j.e(activity, "activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        h.o.c.j.e(activity, "activity");
        if (h.o.c.j.a(activity.getClass(), this.a)) {
            this.f8633b.onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        h.o.c.j.e(activity, "activity");
        h.o.c.j.e(bundle, "outState");
        if (h.o.c.j.a(activity.getClass(), this.a)) {
            this.f8633b.onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        h.o.c.j.e(activity, "activity");
        if (h.o.c.j.a(activity.getClass(), this.a)) {
            Objects.requireNonNull(this.f8633b);
            h.o.c.j.e(activity, "activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        h.o.c.j.e(activity, "activity");
        if (h.o.c.j.a(activity.getClass(), this.a)) {
            Objects.requireNonNull(this.f8633b);
            h.o.c.j.e(activity, "activity");
        }
    }
}
