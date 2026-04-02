package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.g;
/* compiled from: ReportFragment.kt */
/* loaded from: classes.dex */
public final class o extends Fragment {
    public static final /* synthetic */ int c = 0;
    public a b;

    /* compiled from: ReportFragment.kt */
    /* loaded from: classes.dex */
    public interface a {
        void onCreate();

        void onResume();

        void onStart();
    }

    /* compiled from: ReportFragment.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public static void a(Activity activity, g.a aVar) {
            com.amazon.aps.iva.yb0.j.f(activity, "activity");
            com.amazon.aps.iva.yb0.j.f(aVar, "event");
            if (activity instanceof com.amazon.aps.iva.i5.p) {
                ((com.amazon.aps.iva.i5.p) activity).getLifecycle().c(aVar);
            } else if (activity instanceof com.amazon.aps.iva.i5.o) {
                g lifecycle = ((com.amazon.aps.iva.i5.o) activity).getLifecycle();
                if (lifecycle instanceof k) {
                    ((k) lifecycle).c(aVar);
                }
            }
        }

        public static void b(Activity activity) {
            com.amazon.aps.iva.yb0.j.f(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.getClass();
                activity.registerActivityLifecycleCallbacks(new c());
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new o(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* compiled from: ReportFragment.kt */
    /* loaded from: classes.dex */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a();

        /* compiled from: ReportFragment.kt */
        /* loaded from: classes.dex */
        public static final class a {
        }

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            com.amazon.aps.iva.yb0.j.f(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new c());
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
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            com.amazon.aps.iva.yb0.j.f(activity, "activity");
            int i = o.c;
            b.a(activity, g.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            com.amazon.aps.iva.yb0.j.f(activity, "activity");
            int i = o.c;
            b.a(activity, g.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            com.amazon.aps.iva.yb0.j.f(activity, "activity");
            int i = o.c;
            b.a(activity, g.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            com.amazon.aps.iva.yb0.j.f(activity, "activity");
            int i = o.c;
            b.a(activity, g.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            com.amazon.aps.iva.yb0.j.f(activity, "activity");
            int i = o.c;
            b.a(activity, g.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            com.amazon.aps.iva.yb0.j.f(activity, "activity");
            int i = o.c;
            b.a(activity, g.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            com.amazon.aps.iva.yb0.j.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            com.amazon.aps.iva.yb0.j.f(activity, "activity");
            com.amazon.aps.iva.yb0.j.f(bundle, "bundle");
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

    public final void a(g.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            com.amazon.aps.iva.yb0.j.e(activity, "activity");
            b.a(activity, aVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a aVar = this.b;
        if (aVar != null) {
            aVar.onCreate();
        }
        a(g.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(g.a.ON_DESTROY);
        this.b = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(g.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        a aVar = this.b;
        if (aVar != null) {
            aVar.onResume();
        }
        a(g.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a aVar = this.b;
        if (aVar != null) {
            aVar.onStart();
        }
        a(g.a.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(g.a.ON_STOP);
    }
}
