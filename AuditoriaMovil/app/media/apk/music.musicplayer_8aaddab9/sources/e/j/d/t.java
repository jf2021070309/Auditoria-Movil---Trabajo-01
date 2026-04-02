package e.j.d;

import i.a.e0;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper$registerProcessLifecycleCallbacks$1$onStart$1$1", f = "PremiumHelper.kt", l = {649}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class t extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super h.k>, Object> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f8848b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(k kVar, h.m.d<? super t> dVar) {
        super(2, dVar);
        this.f8848b = kVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new t(this.f8848b, dVar);
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
        return new t(this.f8848b, dVar).invokeSuspend(h.k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        int i2 = this.a;
        if (i2 == 0) {
            w.E0(obj);
            e.j.d.c0.i iVar = this.f8848b.r;
            this.a = 1;
            if (iVar.j(this) == aVar) {
                return aVar;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            w.E0(obj);
        }
        return h.k.a;
    }
}
