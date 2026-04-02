package com.amazon.aps.iva.q70;

import com.ellation.crunchyroll.ui.R;
/* compiled from: RatingStarType.kt */
/* loaded from: classes2.dex */
public enum c {
    NOT_RATED(R.drawable.ic_rating_star_empty),
    TWENTY_FIVE_PERCENT_RATED(R.drawable.ic_rating_star_0_25),
    FIFTY_PERCENT_RATED(R.drawable.ic_rating_star_0_5),
    SEVENTY_FIVE_PERCENT_RATED(R.drawable.ic_rating_star_0_75),
    FULLY_RATED(R.drawable.ic_rating_star_filled);
    
    private final int resource;

    c(int i) {
        this.resource = i;
    }

    public final int getResource() {
        return this.resource;
    }
}
