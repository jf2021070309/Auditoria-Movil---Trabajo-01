package com.amazon.aps.iva.i00;

import com.crunchyroll.crunchyroid.R;
/* compiled from: SortType.kt */
/* loaded from: classes2.dex */
public enum a {
    OLDEST(R.string.oldest),
    NEWEST(R.string.newest);
    
    private final int resId;

    a(int i) {
        this.resId = i;
    }

    public final int getResId() {
        return this.resId;
    }
}
