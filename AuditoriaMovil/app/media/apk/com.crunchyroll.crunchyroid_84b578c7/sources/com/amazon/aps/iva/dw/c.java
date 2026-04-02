package com.amazon.aps.iva.dw;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.se0.g0;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: ExoDownloadsProvider.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.exoplayer.ExoDownloadsProvider$isExpired$1", f = "ExoDownloadsProvider.kt", l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> {
    public int h;
    public final /* synthetic */ d i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, com.amazon.aps.iva.ob0.d<? super c> dVar2) {
        super(2, dVar2);
        this.i = dVar;
        this.j = str;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new c(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super Boolean> dVar) {
        return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            com.amazon.aps.iva.ew.i iVar = this.i.d;
            this.h = 1;
            obj = iVar.q(this.j, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
