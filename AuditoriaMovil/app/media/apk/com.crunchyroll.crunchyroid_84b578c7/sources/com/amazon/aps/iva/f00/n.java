package com.amazon.aps.iva.f00;

import com.amazon.aps.iva.o0.e0;
import com.ellation.crunchyroll.ui.badges.CardBadgesKt;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
/* compiled from: PlayableAssetItemView.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ q h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar) {
        super(2);
        this.h = qVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            q qVar = this.h;
            CardBadgesKt.CardBadges(qVar.o, null, com.amazon.aps.iva.ab.x.m0(qVar.n), true, false, false, false, iVar2, LabelUiModel.$stable | 3072, 114);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
