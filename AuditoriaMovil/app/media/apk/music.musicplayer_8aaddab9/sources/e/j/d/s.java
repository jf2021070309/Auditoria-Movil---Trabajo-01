package e.j.d;

import android.app.Activity;
import e.j.d.b0.c.g;
/* loaded from: classes2.dex */
public final class s implements g.a {
    public final /* synthetic */ Activity a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f8847b;

    public s(Activity activity, k kVar) {
        this.a = activity;
        this.f8847b = kVar;
    }

    @Override // e.j.d.b0.c.g.a
    public void a(g.c cVar, boolean z) {
        h.o.c.j.e(cVar, "reviewUiShown");
        if (cVar == g.c.IN_APP_REVIEW) {
            this.a.finish();
        } else if (this.f8847b.f8815l.g(this.a)) {
            this.a.finish();
        }
    }
}
