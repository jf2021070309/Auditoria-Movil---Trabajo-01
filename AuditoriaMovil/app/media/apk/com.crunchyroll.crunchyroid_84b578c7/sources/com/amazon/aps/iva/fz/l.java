package com.amazon.aps.iva.fz;

import com.crunchyroll.crunchyroid.R;
/* compiled from: NotificationType.kt */
/* loaded from: classes2.dex */
public enum l {
    GENERAL("indGeneralUpdates", R.string.key_general_updates),
    CONTENT("indContentUpdates", R.string.key_content_updates),
    PROMOTIONAL("indPromotionalUpdates", R.string.key_promotional_updates);
    
    private final int keyRes;
    private final String serializedValue;

    l(String str, int i) {
        this.serializedValue = str;
        this.keyRes = i;
    }

    public final int getKeyRes() {
        return this.keyRes;
    }

    public final String getSerializedValue() {
        return this.serializedValue;
    }
}
