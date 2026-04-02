package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class ContextProvider {
    private static volatile ContextProvider e;
    private Activity a;
    private Context b;
    private Handler d = new Handler(Looper.getMainLooper());
    private ConcurrentHashMap<String, a> c = new ConcurrentHashMap<>();

    /* loaded from: classes2.dex */
    public interface a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (e == null) {
            synchronized (ContextProvider.class) {
                if (e == null) {
                    e = new ContextProvider();
                }
            }
        }
        return e;
    }

    public Context getApplicationContext() {
        Activity activity;
        return (this.b != null || (activity = this.a) == null) ? this.b : activity.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        return this.a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            for (a aVar : this.c.values()) {
                aVar.onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.a = activity;
            for (a aVar : this.c.values()) {
                aVar.onResume(this.a);
            }
        }
    }

    public void postOnUIThread(Runnable runnable) {
        Handler handler = this.d;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void registerLifeCycleListener(a aVar) {
        this.c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void runOnUIThread(Runnable runnable) {
        Activity activity = this.a;
        if (activity != null) {
            activity.runOnUiThread(runnable);
        }
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.b = context;
        }
    }
}
