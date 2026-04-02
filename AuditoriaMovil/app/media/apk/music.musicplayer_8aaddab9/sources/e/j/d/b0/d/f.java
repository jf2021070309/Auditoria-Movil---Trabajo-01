package e.j.d.b0.d;

import android.app.Activity;
import android.app.Application;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;
import com.zipoapps.premiumhelper.ui.startlikepro.StartLikeProActivity;
/* loaded from: classes2.dex */
public final class f extends e.j.d.c0.d {
    public final /* synthetic */ h.o.b.p<Activity, Application.ActivityLifecycleCallbacks, h.k> a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(h.o.b.p<? super Activity, ? super Application.ActivityLifecycleCallbacks, h.k> pVar) {
        this.a = pVar;
    }

    @Override // e.j.d.c0.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        h.o.c.j.e(activity, "activity");
        if ((activity instanceof PHSplashActivity) || (activity instanceof StartLikeProActivity)) {
            return;
        }
        h.o.c.j.e(activity, "<this>");
        if (h.o.c.j.a(activity.getClass(), e.j.d.k.a.a().f8812i.J.getIntroActivityClass())) {
            return;
        }
        this.a.i(activity, this);
    }
}
