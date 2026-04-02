package com.amazon.aps.iva.s50;

import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.contentreviews.model.ContentRatingContainer;
/* compiled from: ShowRatingViewModel.kt */
/* loaded from: classes2.dex */
public final class i extends l implements com.amazon.aps.iva.xb0.l<ContentRatingContainer, f> {
    public static final i h = new i();

    public i() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final f invoke(ContentRatingContainer contentRatingContainer) {
        ContentRatingContainer contentRatingContainer2 = contentRatingContainer;
        com.amazon.aps.iva.yb0.j.f(contentRatingContainer2, "it");
        return new f(contentRatingContainer2.getAverage(), contentRatingContainer2.getUserContentRating().getNumericValue(), contentRatingContainer2.getTotal());
    }
}
