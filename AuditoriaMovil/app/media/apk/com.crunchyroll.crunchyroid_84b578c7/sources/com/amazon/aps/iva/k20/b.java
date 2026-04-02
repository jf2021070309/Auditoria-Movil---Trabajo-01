package com.amazon.aps.iva.k20;

import com.crunchyroll.crunchyroid.R;
/* compiled from: CancellationRescuePresenter.kt */
/* loaded from: classes2.dex */
public enum b {
    STORE_DISCOUNTS_AND_GIFTS(R.drawable.cancellation_rescue_store_benefit, R.string.cancellation_rescue_store_benefit),
    STORE_DISCOUNTS(R.drawable.cancellation_rescue_store_benefit, R.string.cancellation_rescue_store_discount_benefit),
    ANNUAL_DISCOUNT(R.drawable.cancellation_rescue_discount_benefit, R.string.cancellation_rescue_discount_benefit);
    
    private final int icon;
    private final int text;

    b(int i, int i2) {
        this.icon = i;
        this.text = i2;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getText() {
        return this.text;
    }
}
