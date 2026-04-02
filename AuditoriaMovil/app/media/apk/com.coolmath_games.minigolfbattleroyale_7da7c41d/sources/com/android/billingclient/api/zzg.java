package com.android.billingclient.api;
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
final class zzg implements Runnable {
    final /* synthetic */ SkuDetailsResponseListener zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(BillingClientImpl billingClientImpl, SkuDetailsResponseListener skuDetailsResponseListener) {
        this.zza = skuDetailsResponseListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.onSkuDetailsResponse(zzam.zzr, null);
    }
}
