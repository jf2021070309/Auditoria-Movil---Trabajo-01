package com.rovio.rcs.payment.google;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class SkuDetails {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public SkuDetails(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.a = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.b = jSONObject.optString(InAppPurchaseMetaData.KEY_PRICE);
        this.c = jSONObject.optString("title");
        this.d = jSONObject.optString("description");
        this.e = jSONObject.optString("price_currency_code");
        this.f = jSONObject.optString("price_amount_micros");
    }

    public String getProductId() {
        return this.a;
    }

    public String getPrice() {
        return this.b;
    }

    public String getTitle() {
        return this.c;
    }

    public String getDescription() {
        return this.d;
    }

    public String getCurrencyCode() {
        return this.e;
    }

    public String getPriceAmoutMicro() {
        return this.f;
    }
}
