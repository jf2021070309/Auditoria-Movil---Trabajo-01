package com.amazon.aps.iva.xk;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.el.c0;
import com.amazon.aps.iva.nk.j;
import com.amazon.aps.iva.xb0.q;
/* compiled from: PlayerMaturityLabelDataProvider.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.controls.maturityrestrictionlabel.PlayerMaturityLabelDataProviderImpl$showMaturityLabel$1", f = "PlayerMaturityLabelDataProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.qb0.i implements q<j, com.amazon.aps.iva.ez.d<? extends c0>, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> {
    public /* synthetic */ j h;
    public /* synthetic */ com.amazon.aps.iva.ez.d i;

    public e(com.amazon.aps.iva.ob0.d<? super e> dVar) {
        super(3, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(j jVar, com.amazon.aps.iva.ez.d<? extends c0> dVar, com.amazon.aps.iva.ob0.d<? super Boolean> dVar2) {
        e eVar = new e(dVar2);
        eVar.h = jVar;
        eVar.i = dVar;
        return eVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        j jVar = this.h;
        if (!((c0) this.i.b).isVisible() && !jVar.m.b) {
            if (jVar.g != com.amazon.aps.iva.nk.e.BUFFERING) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
