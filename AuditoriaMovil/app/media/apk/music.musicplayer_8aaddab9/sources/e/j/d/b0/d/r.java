package e.j.d.b0.d;

import android.app.Activity;
import e.j.d.b0.d.e;
/* loaded from: classes2.dex */
public final class r extends h.o.c.k implements h.o.b.a<h.k> {
    public final /* synthetic */ e a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f8601b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f8602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(e eVar, Activity activity, boolean z) {
        super(0);
        this.a = eVar;
        this.f8601b = activity;
        this.f8602c = z;
    }

    @Override // h.o.b.a
    public h.k invoke() {
        e eVar = this.a;
        Activity activity = this.f8601b;
        boolean z = this.f8602c;
        e.a aVar = e.a;
        eVar.f(activity, z);
        return h.k.a;
    }
}
