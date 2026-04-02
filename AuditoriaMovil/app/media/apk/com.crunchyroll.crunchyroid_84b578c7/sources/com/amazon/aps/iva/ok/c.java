package com.amazon.aps.iva.ok;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.nk.j;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.xb0.p;
/* compiled from: PlayerTextTracksController.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.text.PlayerTextTracksControllerImpl$1", f = "PlayerTextTracksController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends i implements p<j, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
        super(2, dVar);
        this.h = eVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new c(this.h, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(j jVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((c) create(jVar, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        this.h.c();
        return q.a;
    }
}
