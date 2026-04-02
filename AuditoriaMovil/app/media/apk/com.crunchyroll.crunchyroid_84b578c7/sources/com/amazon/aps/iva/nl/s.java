package com.amazon.aps.iva.nl;

import com.amazon.aps.iva.ab.x;
/* compiled from: AudioSettingsViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.audio.AudioSettingsViewModelImpl$2", f = "AudioSettingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<a, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ u i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, com.amazon.aps.iva.ob0.d<? super s> dVar) {
        super(2, dVar);
        this.i = uVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        s sVar = new s(this.i, dVar);
        sVar.h = obj;
        return sVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(a aVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((s) create(aVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        a aVar2 = (a) this.h;
        u uVar = this.i;
        if (uVar.e.isTryingToCast() && aVar2 != null) {
            uVar.b.d().k(new com.amazon.aps.iva.ez.d<>(aVar2));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
