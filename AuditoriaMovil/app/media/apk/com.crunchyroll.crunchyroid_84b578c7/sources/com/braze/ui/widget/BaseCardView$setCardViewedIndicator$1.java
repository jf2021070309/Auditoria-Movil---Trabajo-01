package com.braze.ui.widget;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
/* compiled from: BaseCardView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/braze/models/cards/Card;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BaseCardView$setCardViewedIndicator$1 extends l implements a<String> {
    public static final BaseCardView$setCardViewedIndicator$1 INSTANCE = new BaseCardView$setCardViewedIndicator$1();

    public BaseCardView$setCardViewedIndicator$1() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "imageSwitcher is null. Can't set card viewed indicator.";
    }
}
