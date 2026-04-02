package com.amazon.aps.iva.xl;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import org.apache.commons.codec.binary.BaseNCodec;
/* compiled from: ChromecastSubtitlesSettingsViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.subtitles.chromecast.ChromecastSubtitlesSettingsViewModelImpl$updateCaptionsEnableOption$1", f = "ChromecastSubtitlesSettingsViewModel.kt", l = {BaseNCodec.MIME_CHUNK_SIZE, 77}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ k i;
    public final /* synthetic */ String j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, String str, boolean z, com.amazon.aps.iva.ob0.d<? super j> dVar) {
        super(2, dVar);
        this.i = kVar;
        this.j = str;
        this.k = z;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new j(this.i, this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((j) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        k kVar = this.i;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    x.i0(obj);
                    return q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.i0(obj);
        } else {
            x.i0(obj);
            com.amazon.aps.iva.ql.d dVar = kVar.c;
            this.h = 1;
            if (dVar.e(this.j, this) == aVar) {
                return aVar;
            }
        }
        com.amazon.aps.iva.ql.d dVar2 = kVar.c;
        this.h = 2;
        if (dVar2.f(this.k, this) == aVar) {
            return aVar;
        }
        return q.a;
    }
}
