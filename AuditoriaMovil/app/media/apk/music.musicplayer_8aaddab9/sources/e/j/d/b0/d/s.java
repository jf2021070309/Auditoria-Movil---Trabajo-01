package e.j.d.b0.d;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import e.j.d.w;
/* loaded from: classes2.dex */
public final class s extends h.o.c.k implements h.o.b.p<Activity, Application.ActivityLifecycleCallbacks, h.k> {
    public final /* synthetic */ e a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f8603b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(e eVar, boolean z) {
        super(2);
        this.a = eVar;
        this.f8603b = z;
    }

    @Override // h.o.b.p
    public h.k i(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Activity activity2 = activity;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = activityLifecycleCallbacks;
        h.o.c.j.e(activity2, "activity");
        h.o.c.j.e(activityLifecycleCallbacks2, "callbacks");
        boolean z = false;
        if ((activity2 instanceof c.b.c.l) && e.a(this.a, activity2)) {
            c.b.c.l lVar = (c.b.c.l) activity2;
            Intent intent = lVar.getIntent();
            if (intent != null && !intent.getBooleanExtra("show_relaunch", true)) {
                z = true;
            }
            if (z) {
                this.a.f(activity2, this.f8603b);
            } else {
                e.j.d.k.a.a().f8817n.f(lVar, w.K(activity2), true, new r(this.a, activity2, this.f8603b));
            }
        } else {
            e.g(this.a, activity2, false, 2);
        }
        this.a.f8585c.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks2);
        return h.k.a;
    }
}
