package com.amazon.aps.iva.pi;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kj.a;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.l0;
/* compiled from: WatchMusicPlayerViewModelImpl.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.watch.screen.player.WatchMusicPlayerViewModelImpl$initPlayer$1", f = "WatchMusicPlayerViewModelImpl.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ p i;

    /* compiled from: WatchMusicPlayerViewModelImpl.kt */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.ve0.g<com.amazon.aps.iva.kj.a> {
        public final /* synthetic */ p b;

        public a(p pVar) {
            this.b = pVar;
        }

        @Override // com.amazon.aps.iva.ve0.g
        public final Object a(com.amazon.aps.iva.kj.a aVar, com.amazon.aps.iva.ob0.d dVar) {
            com.amazon.aps.iva.kj.a aVar2 = aVar;
            if (aVar2 instanceof a.c) {
                this.b.b.C0(((a.c) aVar2).a);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, com.amazon.aps.iva.ob0.d<? super j> dVar) {
        super(2, dVar);
        this.i = pVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new j(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((j) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            l0 l0Var = pVar.c.V().f;
            a aVar2 = new a(pVar);
            this.h = 1;
            l0Var.getClass();
            if (l0.l(l0Var, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
