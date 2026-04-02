package com.amazon.aps.iva.nl;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ab.x;
import java.util.List;
/* compiled from: AudioSettingsViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.audio.AudioSettingsViewModelImpl$1", f = "AudioSettingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ye.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ u i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, com.amazon.aps.iva.ob0.d<? super r> dVar) {
        super(2, dVar);
        this.i = uVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        r rVar = new r(this.i, dVar);
        rVar.h = obj;
        return rVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.ye.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((r) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        LiveData<List<a>> A7;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        com.amazon.aps.iva.ye.c cVar = (com.amazon.aps.iva.ye.c) this.h;
        if (cVar != com.amazon.aps.iva.ye.c.CONNECTED && cVar != com.amazon.aps.iva.ye.c.CONNECTING) {
            z = false;
        } else {
            z = true;
        }
        u uVar = this.i;
        if (z) {
            uVar.f.m(uVar.d.A7());
        } else {
            q qVar = uVar.c;
            if (qVar != null && (A7 = qVar.A7()) != null) {
                uVar.f.m(A7);
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
