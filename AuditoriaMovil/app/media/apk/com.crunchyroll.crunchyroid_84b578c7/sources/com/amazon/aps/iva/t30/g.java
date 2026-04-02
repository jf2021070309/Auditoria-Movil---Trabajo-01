package com.amazon.aps.iva.t30;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.o0.e0;
import com.ellation.crunchyroll.model.DurationProviderKt;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: EpisodeSearchResultItemDelegate.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.s30.h h;
    public final /* synthetic */ i i;
    public final /* synthetic */ String j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.s30.h hVar, i iVar, String str, boolean z) {
        super(2);
        this.h = hVar;
        this.i = iVar;
        this.j = str;
        this.k = z;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.s30.h hVar = this.h;
            com.amazon.aps.iva.s30.k kVar = (com.amazon.aps.iva.s30.k) hVar;
            Panel a = kVar.a();
            i iVar3 = this.i;
            com.amazon.aps.iva.xb0.a<Boolean> aVar = iVar3.b;
            String formatDuration = iVar3.d.formatDuration(DurationProviderKt.getDurationSecs(kVar.a().getMetadata()));
            com.amazon.aps.iva.u30.a.a(a, aVar, this.j, this.k, new f(iVar3, hVar), x.m0(iVar3.e.a(kVar.a())), kVar.a().getWatchlistStatus(), null, formatDuration, true, iVar2, 805306368 | Panel.$stable | 0, 128);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
