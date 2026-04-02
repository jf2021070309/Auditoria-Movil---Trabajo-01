package com.amazon.aps.iva.gl;

import android.view.ViewConfiguration;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.j1;
import com.google.ads.AdSize;
/* compiled from: PlayerTapToSeekController.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.playerview.seek.PlayerTapToSeekControllerImpl$handleTapIfNotSeeking$1", f = "PlayerTapToSeekController.kt", l = {AdSize.PORTRAIT_AD_HEIGHT}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ e i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.ob0.d<? super d> dVar) {
        super(2, dVar);
        this.i = eVar;
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new d(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((d) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            this.h = 1;
            if (com.amazon.aps.iva.ab.t.l((long) (ViewConfiguration.getDoubleTapTimeout() * 0.5d), this) == aVar) {
                return aVar;
            }
        }
        j1 j1Var = this.i.f;
        if (j1Var == null || !j1Var.isActive()) {
            z = false;
        }
        if (!z) {
            this.j.invoke();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
