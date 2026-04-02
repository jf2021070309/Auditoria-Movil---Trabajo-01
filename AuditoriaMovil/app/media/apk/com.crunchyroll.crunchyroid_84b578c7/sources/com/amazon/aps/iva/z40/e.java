package com.amazon.aps.iva.z40;

import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.z40.a;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareState;
/* compiled from: InactiveClientMonitor.kt */
/* loaded from: classes2.dex */
public final class e implements c {
    public final LifecycleAwareState<q> a = new LifecycleAwareState<>();

    @Override // com.amazon.aps.iva.z40.c
    public final void a(o oVar, a.C0912a c0912a) {
        j.f(oVar, "lifecycleOwner");
        this.a.a(oVar.getLifecycle(), new d(c0912a));
    }

    @Override // com.amazon.aps.iva.z40.c
    public final void b() {
        this.a.b(q.a);
    }
}
