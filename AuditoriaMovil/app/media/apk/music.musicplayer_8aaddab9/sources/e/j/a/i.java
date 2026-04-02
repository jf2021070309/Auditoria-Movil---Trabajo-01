package e.j.a;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import c.m.b.x;
import c.p.p;
import c.p.q;
import e.j.d.w;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class i extends e.j.d.c0.d {
    public final /* synthetic */ k a;

    public i(k kVar) {
        this.a = kVar;
    }

    @Override // e.j.d.c0.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        h.o.c.j.e(activity, "activity");
        if (this.a.f8475c.g() || !(activity instanceof c.b.c.l)) {
            return;
        }
        k kVar = this.a;
        c.b.c.l lVar = (c.b.c.l) activity;
        Objects.requireNonNull(kVar);
        h hVar = new h(kVar);
        lVar.getSupportFragmentManager().f412m.a.add(new x.a(hVar, false));
        kVar.f8476d.put(lVar.toString(), hVar);
    }

    @Override // e.j.d.c0.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        FragmentManager.j remove;
        h.o.c.j.e(activity, "activity");
        if ((activity instanceof l) && !this.a.f8475c.g()) {
            this.a.f8474b.i(activity);
        }
        if (!(activity instanceof c.b.c.l) || (remove = this.a.f8476d.remove(activity.toString())) == null) {
            return;
        }
        x xVar = ((c.b.c.l) activity).getSupportFragmentManager().f412m;
        synchronized (xVar.a) {
            int i2 = 0;
            int size = xVar.a.size();
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (xVar.a.get(i2).a == remove) {
                    xVar.a.remove(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
    }

    @Override // e.j.d.c0.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        h.o.c.j.e(activity, "activity");
        if (activity instanceof l) {
            if (this.a.f8475c.g()) {
                this.a.f8474b.i(activity);
                return;
            }
            b bVar = this.a.f8474b;
            Objects.requireNonNull(bVar);
            h.o.c.j.e(activity, "activity");
            bVar.f8434d.put(activity.toString(), w.Y(q.a((p) activity), null, null, new f(((l) activity).a(), activity, bVar, null), 3, null));
        }
    }
}
