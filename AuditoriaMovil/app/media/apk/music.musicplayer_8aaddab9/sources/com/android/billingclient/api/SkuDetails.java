package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class SkuDetails {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f2940b;

    public SkuDetails(String str) throws JSONException {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f2940b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public String a() {
        return this.f2940b.optString("freeTrialPeriod");
    }

    public String b() {
        return this.f2940b.has("original_price") ? this.f2940b.optString("original_price") : c();
    }

    public String c() {
        return this.f2940b.optString("price");
    }

    public String d() {
        return this.f2940b.optString("productId");
    }

    public String e() {
        return this.f2940b.optString("type");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.a, ((SkuDetails) obj).a);
        }
        return false;
    }

    public final String f() {
        return this.f2940b.optString("packageName");
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? "SkuDetails: ".concat(valueOf) : new String("SkuDetails: ");
    }
}
