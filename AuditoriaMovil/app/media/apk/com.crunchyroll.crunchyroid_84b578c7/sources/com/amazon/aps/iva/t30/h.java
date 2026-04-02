package com.amazon.aps.iva.t30;

import android.content.res.Configuration;
import com.amazon.aps.iva.o0.e0;
/* compiled from: EpisodeSearchResultItemDelegate.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ i h;
    public final /* synthetic */ com.amazon.aps.iva.s30.h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, com.amazon.aps.iva.s30.h hVar) {
        super(2);
        this.h = iVar;
        this.i = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        boolean z;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            i iVar3 = this.h;
            com.amazon.aps.iva.mt.n nVar = iVar3.c;
            com.amazon.aps.iva.s30.h hVar = this.i;
            String c = nVar.c(((com.amazon.aps.iva.s30.k) hVar).a());
            iVar2.s(-623391365);
            if ((hVar instanceof com.amazon.aps.iva.s30.m) && ((Configuration) iVar2.i(androidx.compose.ui.platform.d.a)).screenWidthDp >= 768) {
                z = true;
            } else {
                z = false;
            }
            iVar2.G();
            com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, -1395445649, new g(hVar, iVar3, c, z)), iVar2, 6);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
