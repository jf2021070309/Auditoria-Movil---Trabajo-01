package com.amazon.aps.iva.a00;

import com.crunchyroll.crunchyroid.R;
/* compiled from: NewestSection.kt */
/* loaded from: classes2.dex */
public enum c {
    PAST_DAY("pastDay", R.string.browse_category_past_day),
    PAST_WEEK("pastWeek", R.string.browse_category_past_week),
    EARLIER("earlier", R.string.browse_category_earlier);
    
    private final String analyticsName;
    private final int resId;

    c(String str, int i) {
        this.analyticsName = str;
        this.resId = i;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final int getResId() {
        return this.resId;
    }
}
