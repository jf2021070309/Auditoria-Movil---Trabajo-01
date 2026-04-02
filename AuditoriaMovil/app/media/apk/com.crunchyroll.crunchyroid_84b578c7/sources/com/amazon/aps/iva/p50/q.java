package com.amazon.aps.iva.p50;

import com.amazon.aps.iva.ee0.f1;
import com.ellation.crunchyroll.api.etp.contentreviews.model.ContentRatingContainer;
/* compiled from: ShowRatingDialogViewModel.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<ContentRatingContainer, n> {
    public static final q h = new q();

    public q() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final n invoke(ContentRatingContainer contentRatingContainer) {
        ContentRatingContainer contentRatingContainer2 = contentRatingContainer;
        com.amazon.aps.iva.yb0.j.f(contentRatingContainer2, "it");
        return new n(contentRatingContainer2.getAverage(), f1.K(Integer.valueOf(contentRatingContainer2.getFiveStars().getPercentage()), Integer.valueOf(contentRatingContainer2.getFourStars().getPercentage()), Integer.valueOf(contentRatingContainer2.getThreeStars().getPercentage()), Integer.valueOf(contentRatingContainer2.getTwoStars().getPercentage()), Integer.valueOf(contentRatingContainer2.getOneStar().getPercentage())), (int) contentRatingContainer2.getTotal(), contentRatingContainer2.getUserContentRating().getNumericValue());
    }
}
