package e.j.d.b0.d;

import android.app.Activity;
import android.os.Bundle;
/* loaded from: classes2.dex */
public final class j extends e.j.d.c0.d {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f8595b;

    /* loaded from: classes2.dex */
    public static final class a extends h.o.c.k implements h.o.b.l<c.b.c.l, h.k> {
        public final /* synthetic */ e a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(1);
            this.a = eVar;
        }

        @Override // h.o.b.l
        public h.k invoke(c.b.c.l lVar) {
            c.b.c.l lVar2 = lVar;
            h.o.c.j.e(lVar2, "it");
            e.c(this.a, lVar2);
            return h.k.a;
        }
    }

    public j(e eVar) {
        this.f8595b = eVar;
    }

    @Override // e.j.d.c0.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        h.o.c.j.e(activity, "activity");
        if (bundle == null) {
            this.a = true;
        }
    }

    @Override // e.j.d.c0.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        h.o.c.j.e(activity, "activity");
        if (this.a) {
            a aVar = new a(this.f8595b);
            h.o.c.j.e(activity, "<this>");
            h.o.c.j.e(aVar, "action");
            if (activity instanceof c.b.c.l) {
                aVar.invoke(activity);
            } else {
                String i2 = h.o.c.j.i("Please use AppCompatActivity for ", activity.getClass().getName());
                h.o.c.j.e(i2, "message");
                if (e.j.d.k.a.a().f8812i.j()) {
                    throw new IllegalStateException(i2.toString());
                }
                n.a.a.f9946d.b(i2, new Object[0]);
            }
        }
        this.f8595b.f8585c.unregisterActivityLifecycleCallbacks(this);
    }
}
