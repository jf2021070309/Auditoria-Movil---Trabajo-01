package androidx.lifecycle;

import androidx.lifecycle.g;
import kotlin.Metadata;
/* compiled from: Lifecycle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Lcom/amazon/aps/iva/i5/m;", "Landroidx/lifecycle/j;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends com.amazon.aps.iva.i5.m implements j {
    public final g b;
    public final com.amazon.aps.iva.ob0.g c;

    public LifecycleCoroutineScopeImpl(g gVar, com.amazon.aps.iva.ob0.g gVar2) {
        com.amazon.aps.iva.yb0.j.f(gVar2, "coroutineContext");
        this.b = gVar;
        this.c = gVar2;
        if (gVar.getCurrentState() == g.b.DESTROYED) {
            com.amazon.aps.iva.a60.b.j(gVar2, null);
        }
    }

    @Override // androidx.lifecycle.j
    public final void U2(com.amazon.aps.iva.i5.o oVar, g.a aVar) {
        g gVar = this.b;
        if (gVar.getCurrentState().compareTo(g.b.DESTROYED) <= 0) {
            gVar.removeObserver(this);
            com.amazon.aps.iva.a60.b.j(this.c, null);
        }
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.c;
    }
}
