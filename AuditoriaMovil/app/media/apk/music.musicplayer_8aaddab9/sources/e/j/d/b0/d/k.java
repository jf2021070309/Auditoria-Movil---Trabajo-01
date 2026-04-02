package e.j.d.b0.d;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes2.dex */
public final class k extends h.o.c.k implements h.o.b.p<Activity, Application.ActivityLifecycleCallbacks, h.k> {
    public final /* synthetic */ e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar) {
        super(2);
        this.a = eVar;
    }

    @Override // h.o.b.p
    public h.k i(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Activity activity2 = activity;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = activityLifecycleCallbacks;
        h.o.c.j.e(activity2, "activity");
        h.o.c.j.e(activityLifecycleCallbacks2, "callbacks");
        if (!e.a(this.a, activity2)) {
            e.g(this.a, activity2, false, 2);
        } else if (activity2 instanceof c.b.c.l) {
            e.c(this.a, (c.b.c.l) activity2);
        } else {
            e.g(this.a, activity2, false, 2);
            String i2 = h.o.c.j.i("Please use AppCompatActivity for ", activity2.getClass().getName());
            h.o.c.j.e(i2, "message");
            if (e.j.d.k.a.a().f8812i.j()) {
                throw new IllegalStateException(i2.toString());
            }
            n.a.a.f9946d.b(i2, new Object[0]);
        }
        this.a.f8585c.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks2);
        return h.k.a;
    }
}
