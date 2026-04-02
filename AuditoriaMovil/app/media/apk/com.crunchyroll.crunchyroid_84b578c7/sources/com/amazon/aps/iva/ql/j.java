package com.amazon.aps.iva.ql;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
/* compiled from: PlayerSettingsSynchronizer.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.data.PlayerSettingsSynchronizerImpl$synchronize$1", f = "PlayerSettingsSynchronizer.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ i i;
    public final /* synthetic */ ProfileApiModel j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, ProfileApiModel profileApiModel, com.amazon.aps.iva.ob0.d<? super j> dVar) {
        super(2, dVar);
        this.i = iVar;
        this.j = profileApiModel;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new j(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((j) create(g0Var, dVar)).invokeSuspend(q.a);
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
            String subtitleLanguage = this.j.getSubtitleLanguage();
            this.h = 1;
            if (i.a(this.i, subtitleLanguage, this) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
