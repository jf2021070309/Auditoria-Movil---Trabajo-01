package com.amazon.aps.iva.nz;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: PlayheadsSynchronizerAgent.kt */
/* loaded from: classes2.dex */
public final class h implements f, g0 {
    public final e b;
    public final b c;
    public final com.amazon.aps.iva.xb0.a<Boolean> d;
    public final /* synthetic */ com.amazon.aps.iva.xe0.d e = z.j();

    /* compiled from: PlayheadsSynchronizerAgent.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.playheads.PlayheadsSynchronizerAgentImpl$syncOfflinePlayheads$1", f = "PlayheadsSynchronizerAgent.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
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
                e eVar = h.this.b;
                this.h = 1;
                if (eVar.b(this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    public h(com.ellation.crunchyroll.application.d dVar, com.crunchyroll.connectivity.d dVar2, e eVar, c cVar, com.amazon.aps.iva.xb0.a aVar) {
        this.b = eVar;
        this.c = cVar;
        this.d = aVar;
        dVar.Lf(this);
        dVar2.a(this);
        eVar.c(new g(this));
    }

    public final void a() {
        if (this.d.invoke().booleanValue()) {
            com.amazon.aps.iva.mf0.a.a.a("Playheads synchronization triggered", new Object[0]);
            com.amazon.aps.iva.se0.i.d(this, null, null, new a(null), 3);
        }
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.e.b;
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppCreate() {
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppResume(boolean z) {
        a();
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppStop() {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionLost() {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRefresh(boolean z) {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRestored() {
        a();
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionUpdated(boolean z) {
    }

    @Override // com.amazon.aps.iva.nz.f
    public final void onSignIn() {
        a();
    }
}
