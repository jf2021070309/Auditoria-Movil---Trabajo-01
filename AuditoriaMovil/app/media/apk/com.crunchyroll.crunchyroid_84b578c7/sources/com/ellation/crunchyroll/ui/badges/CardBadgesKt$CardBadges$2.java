package com.ellation.crunchyroll.ui.badges;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.ff0.b;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import kotlin.Metadata;
/* compiled from: CardBadges.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardBadgesKt$CardBadges$2 extends l implements p<i, Integer, q> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ a<Boolean> $isUserPremium;
    final /* synthetic */ f $modifier;
    final /* synthetic */ Panel $panel;
    final /* synthetic */ boolean $shouldAddMaturityRating;
    final /* synthetic */ boolean $shouldAddMovieBadge;
    final /* synthetic */ boolean $shouldAddNewBadge;
    final /* synthetic */ boolean $shouldAddNowPlayingBadge;
    final /* synthetic */ LabelUiModel $uiModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBadgesKt$CardBadges$2(Panel panel, LabelUiModel labelUiModel, a<Boolean> aVar, f fVar, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        super(2);
        this.$panel = panel;
        this.$uiModel = labelUiModel;
        this.$isUserPremium = aVar;
        this.$modifier = fVar;
        this.$shouldAddMaturityRating = z;
        this.$shouldAddNewBadge = z2;
        this.$shouldAddMovieBadge = z3;
        this.$shouldAddNowPlayingBadge = z4;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public /* bridge */ /* synthetic */ q invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return q.a;
    }

    public final void invoke(i iVar, int i) {
        CardBadgesKt.CardBadges(this.$panel, this.$uiModel, this.$isUserPremium, this.$modifier, this.$shouldAddMaturityRating, this.$shouldAddNewBadge, this.$shouldAddMovieBadge, this.$shouldAddNowPlayingBadge, iVar, b.I(this.$$changed | 1), this.$$default);
    }
}
