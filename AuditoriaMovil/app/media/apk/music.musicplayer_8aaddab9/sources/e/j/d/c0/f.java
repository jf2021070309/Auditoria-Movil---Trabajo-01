package e.j.d.c0;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes2.dex */
public final class f extends d {
    public final /* synthetic */ Class<? extends Activity> a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Application f8634b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h.o.c.q<e> f8635c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h.o.b.l<Activity, h.k> f8636d;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Class<? extends Activity> cls, Application application, h.o.c.q<e> qVar, h.o.b.l<? super Activity, h.k> lVar) {
        this.a = cls;
        this.f8634b = application;
        this.f8635c = qVar;
        this.f8636d = lVar;
    }

    @Override // e.j.d.c0.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        h.o.c.j.e(activity, "activity");
        if (h.o.c.j.a(activity.getClass(), this.a)) {
            this.f8634b.unregisterActivityLifecycleCallbacks(this.f8635c.a);
            this.f8636d.invoke(activity);
        }
    }
}
