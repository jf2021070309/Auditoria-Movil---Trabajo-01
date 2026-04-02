package e.j.d.c0;

import android.app.Activity;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.PremiumHelperUtils$openGooglePlay$1", f = "PremiumHelperUtils.kt", l = {303}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c0 extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super h.k>, Object> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f8630b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f8631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(boolean z, Activity activity, h.m.d<? super c0> dVar) {
        super(2, dVar);
        this.f8630b = z;
        this.f8631c = activity;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new c0(this.f8630b, this.f8631c, dVar);
    }

    @Override // h.o.b.p
    public Object i(i.a.e0 e0Var, h.m.d<? super h.k> dVar) {
        return new c0(this.f8630b, this.f8631c, dVar).invokeSuspend(h.k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        int i2 = this.a;
        if (i2 == 0) {
            e.j.d.w.E0(obj);
            if (this.f8630b) {
                this.a = 1;
                if (e.j.d.w.z(500L, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            e.j.d.w.E0(obj);
        }
        b0.m(this.f8631c);
        return h.k.a;
    }
}
