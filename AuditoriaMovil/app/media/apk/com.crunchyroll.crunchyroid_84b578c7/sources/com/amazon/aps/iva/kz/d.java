package com.amazon.aps.iva.kz;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.ui.badges.CardBadgesKt;
/* compiled from: PlayableAssetCardView.kt */
/* loaded from: classes2.dex */
public final class d extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar) {
        super(2);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            i iVar3 = this.h;
            CardBadgesKt.CardBadges(iVar3.n, null, x.m0(iVar3.m), true, false, false, false, iVar2, 3072, 114);
        }
        return q.a;
    }
}
