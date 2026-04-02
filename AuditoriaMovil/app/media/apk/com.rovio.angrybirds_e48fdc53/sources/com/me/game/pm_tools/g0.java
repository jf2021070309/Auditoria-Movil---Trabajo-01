package com.me.game.pm_tools;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public class g0 implements Application.ActivityLifecycleCallbacks {
    private static final String g = g0.class.getSimpleName();
    public static final String h = "game_sdk_run_time";
    public static final String i = "net.playmods";
    private SharedPreferences b;
    public int c;
    private Activity d;
    private k e;
    private Handler a = new Handler();
    private Map<String, k> f = new HashMap();

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j = g0.this.j() ? 30000L : TTAdConstant.AD_MAX_EVENT_TIME;
            y.e(g0.g, "checkAndAddTime", Integer.valueOf(g0.this.c), Long.valueOf(j));
            g0 g0Var = g0.this;
            int i = g0Var.c;
            if (i > j) {
                MainActivity.d(g0Var.d);
                return;
            }
            g0Var.c = i + 1000;
            g0Var.b.edit().putInt(g0.h, g0.this.c).apply();
            g0.this.i();
        }
    }

    /* loaded from: classes5.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g0.this.e == null) {
                g0.this.e = new k(g0.this.d);
                g0.this.f.put(g0.this.d.toString(), g0.this.e);
            }
            g0.this.e.show();
        }
    }

    public g0(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("module_info", 0);
        this.b = sharedPreferences;
        this.c = sharedPreferences.getInt(h, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (com.me.game.pm_tools.b.d.c() || (this.d instanceof MainActivity)) {
            return;
        }
        this.a.postDelayed(new a(), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        try {
            com.me.game.pm_tools.b.d.getPackageManager().getPackageInfo(com.me.game.pm_tools.a.b, 0);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void k() {
        long j = 0;
        try {
            if (this.d.getResources().getConfiguration().orientation != 1) {
                this.d.setRequestedOrientation(1);
                j = 1000;
            }
            com.me.game.pm_tools.b.d.f(new b(), j);
        } catch (Exception e) {
            e.printStackTrace();
            k kVar = this.e;
            if (kVar != null) {
                kVar.dismiss();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        p.a().b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        y.e(g, "onActivityResumed", activity);
        p.a().c(activity);
        v.g().c(activity);
        if (activity.equals(this.d)) {
            x.d(this.a);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        y.e(g, "onActivityResumed", activity);
        this.d = activity;
        x.d(this.a);
        p.a().d(activity);
        i();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
