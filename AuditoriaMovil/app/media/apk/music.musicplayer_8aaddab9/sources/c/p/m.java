package c.p;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class m {
    public static AtomicBoolean a = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static class a extends g {
        @Override // c.p.g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            c0.c(activity);
        }

        @Override // c.p.g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // c.p.g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }
}
