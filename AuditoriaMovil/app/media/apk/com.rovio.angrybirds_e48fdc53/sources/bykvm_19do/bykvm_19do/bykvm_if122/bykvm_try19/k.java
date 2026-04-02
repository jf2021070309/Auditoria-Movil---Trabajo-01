package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* loaded from: classes.dex */
public class k {
    private b a;
    private final Application.ActivityLifecycleCallbacks b = new a();

    /* loaded from: classes.dex */
    class a implements Application.ActivityLifecycleCallbacks {
        private int a = 0;

        a() {
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
            int i = this.a + 1;
            this.a = i;
            if (i != 1 || k.this.a == null) {
                return;
            }
            k.this.a.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            int i = this.a - 1;
            this.a = i;
            if (i != 0 || k.this.a == null) {
                return;
            }
            k.this.a.b();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();
    }

    public void a(Application application) {
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.b);
        }
    }

    public void a(Application application, b bVar) {
        if (application != null) {
            this.a = bVar;
            application.registerActivityLifecycleCallbacks(this.b);
        }
    }
}
