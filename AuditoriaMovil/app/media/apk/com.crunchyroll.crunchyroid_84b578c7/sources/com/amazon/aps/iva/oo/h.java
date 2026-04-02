package com.amazon.aps.iva.oo;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.kj.a;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.l0;
import com.amazon.aps.iva.xb0.p;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
/* compiled from: WatchScreenPlayerViewModelImpl.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.player.WatchScreenPlayerViewModelImpl$2", f = "WatchScreenPlayerViewModelImpl.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ m i;

    /* compiled from: WatchScreenPlayerViewModelImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a implements com.amazon.aps.iva.ve0.g<com.amazon.aps.iva.kj.a> {
        public final /* synthetic */ m b;

        public a(m mVar) {
            this.b = mVar;
        }

        @Override // com.amazon.aps.iva.ve0.g
        public final Object a(com.amazon.aps.iva.kj.a aVar, com.amazon.aps.iva.ob0.d dVar) {
            com.amazon.aps.iva.kj.a aVar2 = aVar;
            if (aVar2 instanceof a.c) {
                this.b.d.i5(((a.c) aVar2).a);
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, com.amazon.aps.iva.ob0.d<? super h> dVar) {
        super(2, dVar);
        this.i = mVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new h(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((h) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            m mVar = this.i;
            l0 l0Var = mVar.b.V().f;
            a aVar2 = new a(mVar);
            this.h = 1;
            l0Var.getClass();
            if (l0.l(l0Var, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
