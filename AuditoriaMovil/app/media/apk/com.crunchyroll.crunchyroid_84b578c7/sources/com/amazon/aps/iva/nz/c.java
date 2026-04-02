package com.amazon.aps.iva.nz;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareState;
import java.util.List;
/* compiled from: PlayheadUpdateMonitor.kt */
/* loaded from: classes2.dex */
public final class c implements b, g0 {
    public final com.amazon.aps.iva.ob0.g b;
    public final /* synthetic */ com.amazon.aps.iva.xe0.d c;
    public final LifecycleAwareState<List<com.amazon.aps.iva.nz.a>> d;

    /* compiled from: PlayheadUpdateMonitor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.playheads.PlayheadUpdateMonitorImpl$sendPlayheadUpdate$1", f = "PlayheadUpdateMonitor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public final /* synthetic */ com.amazon.aps.iva.nz.a[] i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.nz.a[] aVarArr, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = aVarArr;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            c.this.d.b(o.b0(this.i));
            return q.a;
        }
    }

    public c(com.amazon.aps.iva.ob0.g gVar) {
        j.f(gVar, "dispatcher");
        this.b = gVar;
        this.c = z.j();
        this.d = new LifecycleAwareState<>();
    }

    @Override // com.amazon.aps.iva.nz.b
    public final void a(com.amazon.aps.iva.i5.o oVar, l<? super List<com.amazon.aps.iva.nz.a>, q> lVar) {
        j.f(oVar, "lifecycleOwner");
        this.d.a(oVar.getLifecycle(), lVar);
    }

    @Override // com.amazon.aps.iva.nz.b
    public final void b(com.amazon.aps.iva.nz.a... aVarArr) {
        j.f(aVarArr, "playheadUpdates");
        com.amazon.aps.iva.se0.i.d(this, this.b, null, new a(aVarArr, null), 2);
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.c.b;
    }
}
