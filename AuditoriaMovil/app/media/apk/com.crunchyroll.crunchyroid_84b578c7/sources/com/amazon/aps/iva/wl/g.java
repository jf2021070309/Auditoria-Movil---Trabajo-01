package com.amazon.aps.iva.wl;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.se0.g0;
/* compiled from: PlayerSubtitlesSettingsViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.subtitles.PlayerSubtitlesSettingsViewModelImpl$updateCaptionsEnableOption$1", f = "PlayerSubtitlesSettingsViewModel.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ h i;
    public final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, boolean z, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(2, dVar);
        this.i = hVar;
        this.j = z;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new g(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((g) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            com.amazon.aps.iva.ql.a aVar2 = this.i.b;
            this.h = 1;
            if (aVar2.f(this.j, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
