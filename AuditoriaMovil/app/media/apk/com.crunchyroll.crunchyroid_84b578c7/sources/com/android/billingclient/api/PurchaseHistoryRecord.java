package com.android.billingclient.api;

import android.text.TextUtils;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class PurchaseHistoryRecord {
    public final String a;
    public final String b;
    public final com.amazon.aps.iva.if0.c c;

    public PurchaseHistoryRecord(String str, String str2) throws com.amazon.aps.iva.if0.b {
        this.a = str;
        this.b = str2;
        this.c = new com.amazon.aps.iva.if0.c(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        if (TextUtils.equals(this.a, purchaseHistoryRecord.a) && TextUtils.equals(this.b, purchaseHistoryRecord.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.a));
    }
}
