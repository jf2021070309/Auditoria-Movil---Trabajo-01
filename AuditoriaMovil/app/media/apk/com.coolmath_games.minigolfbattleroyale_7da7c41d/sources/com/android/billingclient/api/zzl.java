package com.android.billingclient.api;
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
final class zzl implements Runnable {
    final /* synthetic */ PurchaseHistoryResponseListener zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(BillingClientImpl billingClientImpl, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        this.zza = purchaseHistoryResponseListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.onPurchaseHistoryResponse(zzam.zzr, null);
    }
}
