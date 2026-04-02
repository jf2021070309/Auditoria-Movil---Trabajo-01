package e.j.d.b0.d;

import android.app.Activity;
import e.j.d.w;
/* loaded from: classes2.dex */
public final class p extends h.o.c.k implements h.o.b.a<h.k> {
    public final /* synthetic */ Activity a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f8600b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Activity activity, e eVar) {
        super(0);
        this.a = activity;
        this.f8600b = eVar;
    }

    @Override // h.o.b.a
    public h.k invoke() {
        e.j.d.b0.c.g gVar = e.j.d.k.a.a().f8817n;
        Activity activity = this.a;
        gVar.f((c.b.c.l) activity, w.K(activity), true, new o(this.f8600b, this.a));
        return h.k.a;
    }
}
