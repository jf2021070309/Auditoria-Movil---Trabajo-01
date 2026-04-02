package com.amazon.aps.iva.ss;

import com.crunchyroll.crunchyroid.R;
/* compiled from: BillingPeriodParser.kt */
/* loaded from: classes2.dex */
public enum a {
    DAY(R.string.billing_period_time_unit_day),
    MONTH(R.string.billing_period_time_unit_month),
    YEAR(R.string.billing_period_time_unit_year);
    
    private final int resId;

    a(int i) {
        this.resId = i;
    }

    public final int getResId() {
        return this.resId;
    }
}
