package com.amazon.aps.iva.pi;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.se0.g0;
/* compiled from: WatchMusicPlayerViewModelImpl.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.watch.screen.player.WatchMusicPlayerViewModelImpl$1", f = "WatchMusicPlayerViewModelImpl.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ p i;

    /* compiled from: WatchMusicPlayerViewModelImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.watch.screen.player.WatchMusicPlayerViewModelImpl$1$1", f = "WatchMusicPlayerViewModelImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ye.d, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> {
        public /* synthetic */ Object h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.h = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.ye.d dVar, com.amazon.aps.iva.ob0.d<? super Boolean> dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            boolean z;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            if (((com.amazon.aps.iva.ye.d) this.h).a == com.amazon.aps.iva.ye.e.SESSION_ENDED) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: WatchMusicPlayerViewModelImpl.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ p h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.h = pVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            p pVar = this.h;
            pVar.g.k(Boolean.FALSE);
            pVar.c.O(true);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, com.amazon.aps.iva.ob0.d<? super h> dVar) {
        super(2, dVar);
        this.i = pVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new h(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((h) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            p pVar = this.i;
            com.amazon.aps.iva.ve0.f<com.amazon.aps.iva.ye.d> castStateChangeEventFlow = pVar.f.getCastStateChangeEventFlow();
            a aVar2 = new a(null);
            b bVar = new b(pVar);
            this.h = 1;
            if (com.amazon.aps.iva.dg.b.r(castStateChangeEventFlow, new com.amazon.aps.iva.xy.j(aVar2, bVar, null), this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
