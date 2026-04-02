package c.p;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import c.p.c0;
import c.p.j;
/* loaded from: classes.dex */
public class b0 implements p {
    public static final b0 a = new b0();

    /* renamed from: f  reason: collision with root package name */
    public Handler f2437f;

    /* renamed from: b  reason: collision with root package name */
    public int f2433b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f2434c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2435d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2436e = true;

    /* renamed from: g  reason: collision with root package name */
    public final r f2438g = new r(this);

    /* renamed from: h  reason: collision with root package name */
    public Runnable f2439h = new a();

    /* renamed from: i  reason: collision with root package name */
    public c0.a f2440i = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0 b0Var = b0.this;
            if (b0Var.f2434c == 0) {
                b0Var.f2435d = true;
                b0Var.f2438g.e(j.a.ON_PAUSE);
            }
            b0 b0Var2 = b0.this;
            if (b0Var2.f2433b == 0 && b0Var2.f2435d) {
                b0Var2.f2438g.e(j.a.ON_STOP);
                b0Var2.f2436e = true;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements c0.a {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public class c extends g {

        /* loaded from: classes.dex */
        public class a extends g {
            public a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                b0.this.a();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                b0.this.b();
            }
        }

        public c() {
        }

        @Override // c.p.g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                int i2 = c0.a;
                ((c0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f2441b = b0.this.f2440i;
            }
        }

        @Override // c.p.g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            b0 b0Var = b0.this;
            int i2 = b0Var.f2434c - 1;
            b0Var.f2434c = i2;
            if (i2 == 0) {
                b0Var.f2437f.postDelayed(b0Var.f2439h, 700L);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // c.p.g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            b0 b0Var = b0.this;
            int i2 = b0Var.f2433b - 1;
            b0Var.f2433b = i2;
            if (i2 == 0 && b0Var.f2435d) {
                b0Var.f2438g.e(j.a.ON_STOP);
                b0Var.f2436e = true;
            }
        }
    }

    public void a() {
        int i2 = this.f2434c + 1;
        this.f2434c = i2;
        if (i2 == 1) {
            if (!this.f2435d) {
                this.f2437f.removeCallbacks(this.f2439h);
                return;
            }
            this.f2438g.e(j.a.ON_RESUME);
            this.f2435d = false;
        }
    }

    public void b() {
        int i2 = this.f2433b + 1;
        this.f2433b = i2;
        if (i2 == 1 && this.f2436e) {
            this.f2438g.e(j.a.ON_START);
            this.f2436e = false;
        }
    }

    public void c(Context context) {
        this.f2437f = new Handler();
        this.f2438g.e(j.a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    @Override // c.p.p
    public j getLifecycle() {
        return this.f2438g;
    }
}
