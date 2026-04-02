package com.amazon.aps.iva.fw;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: KalturaDownloadsProvider.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.kaltura.KalturaDownloadsProvider$isExpired$1", f = "KalturaDownloadsProvider.kt", l = {73}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> {
    public int h;
    public final /* synthetic */ c i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, com.amazon.aps.iva.ob0.d<? super b> dVar) {
        super(2, dVar);
        this.i = cVar;
        this.j = str;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new b(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super Boolean> dVar) {
        return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
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
            com.amazon.aps.iva.ew.i iVar = this.i.b;
            this.h = 1;
            obj = iVar.q(this.j, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
