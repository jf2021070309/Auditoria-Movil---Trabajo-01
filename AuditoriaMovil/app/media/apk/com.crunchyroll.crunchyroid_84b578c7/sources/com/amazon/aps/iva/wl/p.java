package com.amazon.aps.iva.wl;

import com.amazon.aps.iva.ab.x;
/* compiled from: SubtitlesSettingsViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.subtitles.SubtitlesSettingsViewModelImpl$1", f = "SubtitlesSettingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ye.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ q i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, com.amazon.aps.iva.ob0.d<? super p> dVar) {
        super(2, dVar);
        this.i = qVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        p pVar = new p(this.i, dVar);
        pVar.h = obj;
        return pVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.ye.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((p) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        com.amazon.aps.iva.ye.c cVar = (com.amazon.aps.iva.ye.c) this.h;
        if (cVar != com.amazon.aps.iva.ye.c.CONNECTED && cVar != com.amazon.aps.iva.ye.c.CONNECTING) {
            z = false;
        } else {
            z = true;
        }
        q qVar = this.i;
        if (z) {
            o oVar = qVar.b;
            qVar.e.m(oVar.w());
            qVar.f.m(oVar.S2());
        } else {
            o oVar2 = qVar.c;
            qVar.e.m(oVar2.w());
            qVar.f.m(oVar2.S2());
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
