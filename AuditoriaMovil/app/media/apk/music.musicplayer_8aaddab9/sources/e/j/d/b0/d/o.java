package e.j.d.b0.d;

import android.app.Activity;
import e.j.d.b0.d.e;
/* loaded from: classes2.dex */
public final class o extends h.o.c.k implements h.o.b.a<h.k> {
    public final /* synthetic */ e a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f8599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e eVar, Activity activity) {
        super(0);
        this.a = eVar;
        this.f8599b = activity;
    }

    @Override // h.o.b.a
    public h.k invoke() {
        e eVar = this.a;
        Activity activity = this.f8599b;
        e.a aVar = e.a;
        eVar.f(activity, true);
        return h.k.a;
    }
}
