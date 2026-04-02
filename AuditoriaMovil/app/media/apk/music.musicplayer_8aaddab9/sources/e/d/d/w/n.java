package e.d.d.w;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes2.dex */
public class n implements Application.ActivityLifecycleCallbacks {
    public final Set<Intent> a = Collections.newSetFromMap(new WeakHashMap());

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle extras;
        Intent intent = activity.getIntent();
        if (intent == null || !this.a.add(intent) || (extras = intent.getExtras()) == null) {
            return;
        }
        Bundle bundle2 = extras.getBundle("gcm.n.analytics_data");
        if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
            if (bundle2 != null) {
                if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                    e.d.d.g b2 = e.d.d.g.b();
                    b2.a();
                    e.d.d.k.a.a aVar = (e.d.d.k.a.a) b2.f7043g.a(e.d.d.k.a.a.class);
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (aVar != null) {
                        String string = bundle2.getString("google.c.a.c_id");
                        aVar.f(AppMeasurement.FCM_ORIGIN, "_ln", string);
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("source", "Firebase");
                        bundle3.putString("medium", "notification");
                        bundle3.putString("campaign", string);
                        aVar.c(AppMeasurement.FCM_ORIGIN, "_cmp", bundle3);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
            }
            e.d.b.d.a.S("_no", bundle2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.a.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
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
