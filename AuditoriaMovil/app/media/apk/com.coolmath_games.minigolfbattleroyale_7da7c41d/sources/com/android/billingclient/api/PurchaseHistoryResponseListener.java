package com.android.billingclient.api;

import java.util.List;
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
public interface PurchaseHistoryResponseListener {
    void onPurchaseHistoryResponse(BillingResult billingResult, List<PurchaseHistoryRecord> list);
}
