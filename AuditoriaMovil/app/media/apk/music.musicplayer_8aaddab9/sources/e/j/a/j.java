package e.j.a;

import android.app.Activity;
import android.view.ViewGroup;
import c.p.p;
import c.p.q;
import e.j.d.w;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public final class j extends e.j.d.c0.d {
    public final /* synthetic */ k a;

    public j(k kVar) {
        this.a = kVar;
    }

    @Override // e.j.d.c0.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        h.o.c.j.e(activity, "activity");
        if (this.a.f8475c.g()) {
            return;
        }
        this.a.f8474b.h(activity);
    }

    @Override // e.j.d.c0.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        h.o.c.j.e(activity, "activity");
        if (this.a.f8475c.g()) {
            this.a.f8474b.h(activity);
            return;
        }
        b bVar = this.a.f8474b;
        Objects.requireNonNull(bVar);
        h.o.c.j.e(activity, "activity");
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.banner_ad_container);
        if (viewGroup != null && viewGroup.getChildCount() == 0) {
            bVar.f8434d.put(activity.toString(), w.Y(q.a((p) activity), null, null, new d(viewGroup, bVar, null), 3, null));
        }
    }
}
