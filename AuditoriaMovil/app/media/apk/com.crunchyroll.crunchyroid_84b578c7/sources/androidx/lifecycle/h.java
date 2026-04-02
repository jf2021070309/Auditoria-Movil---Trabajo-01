package androidx.lifecycle;

import androidx.lifecycle.g;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.se0.g0;
/* compiled from: Lifecycle.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ LifecycleCoroutineScopeImpl i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, com.amazon.aps.iva.ob0.d<? super h> dVar) {
        super(2, dVar);
        this.i = lifecycleCoroutineScopeImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        h hVar = new h(this.i, dVar);
        hVar.h = obj;
        return hVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((h) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        g0 g0Var = (g0) this.h;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.i;
        if (lifecycleCoroutineScopeImpl.b.getCurrentState().compareTo(g.b.INITIALIZED) >= 0) {
            lifecycleCoroutineScopeImpl.b.addObserver(lifecycleCoroutineScopeImpl);
        } else {
            com.amazon.aps.iva.a60.b.j(g0Var.getCoroutineContext(), null);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
