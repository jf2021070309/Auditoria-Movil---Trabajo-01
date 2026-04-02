package com.iab.omid.library.applovin.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
/* loaded from: classes2.dex */
public class b implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})
    private static b a = new b();

    /* renamed from: b  reason: collision with root package name */
    private boolean f4778b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4779c;

    /* renamed from: d  reason: collision with root package name */
    private a f4780d;

    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z);
    }

    private b() {
    }

    public static b a() {
        return a;
    }

    private void a(boolean z) {
        if (this.f4779c != z) {
            this.f4779c = z;
            if (this.f4778b) {
                e();
                a aVar = this.f4780d;
                if (aVar != null) {
                    aVar.a(!z);
                }
            }
        }
    }

    private void e() {
        boolean z = !this.f4779c;
        for (com.iab.omid.library.applovin.adsession.a aVar : com.iab.omid.library.applovin.b.a.a().b()) {
            aVar.getAdSessionStatePublisher().a(z);
        }
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(a aVar) {
        this.f4780d = aVar;
    }

    public void b() {
        this.f4778b = true;
        this.f4779c = false;
        e();
    }

    public void c() {
        this.f4778b = false;
        this.f4779c = false;
        this.f4780d = null;
    }

    public ActivityManager.RunningAppProcessInfo d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        View e2;
        boolean z = true;
        boolean z2 = d().importance != 100;
        boolean z3 = true;
        for (com.iab.omid.library.applovin.adsession.a aVar : com.iab.omid.library.applovin.b.a.a().c()) {
            if (aVar.f() && (e2 = aVar.e()) != null && e2.hasWindowFocus()) {
                z3 = false;
            }
        }
        a((z2 && z3) ? false : false);
    }
}
