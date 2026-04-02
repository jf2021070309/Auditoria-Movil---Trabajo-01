package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class PurchaseHistoryRecord {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2938b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f2939c;

    public PurchaseHistoryRecord(String str, String str2) throws JSONException {
        this.a = str;
        this.f2938b = str2;
        this.f2939c = new JSONObject(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PurchaseHistoryRecord) {
            PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
            return TextUtils.equals(this.a, purchaseHistoryRecord.a) && TextUtils.equals(this.f2938b, purchaseHistoryRecord.f2938b);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? "PurchaseHistoryRecord. Json: ".concat(valueOf) : new String("PurchaseHistoryRecord. Json: ");
    }
}
