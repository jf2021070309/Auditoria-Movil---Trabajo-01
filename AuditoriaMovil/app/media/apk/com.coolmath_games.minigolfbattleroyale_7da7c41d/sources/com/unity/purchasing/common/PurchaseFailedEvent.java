package com.unity.purchasing.common;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class PurchaseFailedEvent {
    public static String jsonEncodePurchaseFailure(String str, PurchaseFailureReason purchaseFailureReason, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productId", str);
            jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, purchaseFailureReason);
            jSONObject.put("message", str2);
            return jSONObject.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
