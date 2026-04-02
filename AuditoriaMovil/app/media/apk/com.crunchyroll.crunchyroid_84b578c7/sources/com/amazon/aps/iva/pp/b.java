package com.amazon.aps.iva.pp;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.amazon.aps.iva.yb0.j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProcessLifecycleMonitor.kt */
/* loaded from: classes2.dex */
public final class b implements Application.ActivityLifecycleCallbacks {
    public final a b;
    public final AtomicInteger c = new AtomicInteger(0);
    public final AtomicInteger d = new AtomicInteger(0);
    public final AtomicBoolean e = new AtomicBoolean(true);
    public final AtomicBoolean f = new AtomicBoolean(true);

    /* compiled from: ProcessLifecycleMonitor.kt */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();

        void c();

        void d();
    }

    public b(com.amazon.aps.iva.pp.a aVar) {
        this.b = aVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        j.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        j.f(activity, "activity");
        if (this.c.decrementAndGet() == 0 && !this.e.getAndSet(true)) {
            this.b.d();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        j.f(activity, "activity");
        if (this.c.incrementAndGet() == 1 && this.e.getAndSet(false)) {
            this.b.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j.f(activity, "activity");
        j.f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        j.f(activity, "activity");
        if (this.d.incrementAndGet() == 1 && this.f.getAndSet(false)) {
            this.b.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        j.f(activity, "activity");
        if (this.d.decrementAndGet() == 0 && this.e.get()) {
            this.b.b();
            this.f.set(true);
        }
    }
}
