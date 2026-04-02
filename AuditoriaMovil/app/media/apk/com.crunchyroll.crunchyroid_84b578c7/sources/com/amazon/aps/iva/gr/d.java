package com.amazon.aps.iva.gr;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.aps.iva.lb0.a0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ActivityLifecycleTrackingStrategy.kt */
/* loaded from: classes2.dex */
public abstract class d implements Application.ActivityLifecycleCallbacks, o {
    public static Map b(Intent intent) {
        if (intent == null) {
            return a0.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String action = intent.getAction();
        if (action != null) {
            linkedHashMap.put("view.intent.action", action);
        }
        String dataString = intent.getDataString();
        if (dataString != null) {
            linkedHashMap.put("view.intent.uri", dataString);
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Set<String> keySet = extras.keySet();
            com.amazon.aps.iva.yb0.j.e(keySet, "bundle.keySet()");
            for (String str : keySet) {
                linkedHashMap.put(com.amazon.aps.iva.oa.a.a("view.arguments.", str), extras.get(str));
            }
        }
        return linkedHashMap;
    }

    public static Map c(Bundle bundle) {
        if (bundle == null) {
            return a0.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = bundle.keySet();
        com.amazon.aps.iva.yb0.j.e(keySet, "bundle.keySet()");
        for (String str : keySet) {
            linkedHashMap.put(com.amazon.aps.iva.oa.a.a("view.arguments.", str), bundle.get(str));
        }
        return linkedHashMap;
    }

    @Override // com.amazon.aps.iva.gr.o
    public final void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // com.amazon.aps.iva.gr.o
    public final void d(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        } else {
            com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.b, "In order to use the RUM automatic tracking feature you will haveto use the Application context when initializing the SDK", null, 6);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        com.amazon.aps.iva.yb0.j.f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
    }
}
