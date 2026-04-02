package com.braze.ui.widget;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import com.braze.models.cards.Card;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
/* compiled from: BaseCardView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/braze/models/cards/Card;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BaseCardView$handleCardClick$4 extends l implements a<String> {
    final /* synthetic */ Card $card;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCardView$handleCardClick$4(Card card) {
        super(0);
        this.$card = card;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "Card action is null. Not performing any click action on card: " + this.$card.getId();
    }
}
