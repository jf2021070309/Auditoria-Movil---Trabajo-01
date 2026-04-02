package c.p;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import c.p.j;
@h.m.i.a.e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super h.k>, Object> {
    public /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f2465b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, h.m.d<? super l> dVar) {
        super(2, dVar);
        this.f2465b = lifecycleCoroutineScopeImpl;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        l lVar = new l(this.f2465b, dVar);
        lVar.a = obj;
        return lVar;
    }

    @Override // h.o.b.p
    public Object i(i.a.e0 e0Var, h.m.d<? super h.k> dVar) {
        l lVar = new l(this.f2465b, dVar);
        lVar.a = e0Var;
        h.k kVar = h.k.a;
        lVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        e.j.d.w.E0(obj);
        i.a.e0 e0Var = (i.a.e0) this.a;
        if (((r) this.f2465b.a).f2467c.compareTo(j.b.INITIALIZED) >= 0) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f2465b;
            lifecycleCoroutineScopeImpl.a.a(lifecycleCoroutineScopeImpl);
        } else {
            e.j.d.w.m(e0Var.g(), null, 1, null);
        }
        return h.k.a;
    }
}
