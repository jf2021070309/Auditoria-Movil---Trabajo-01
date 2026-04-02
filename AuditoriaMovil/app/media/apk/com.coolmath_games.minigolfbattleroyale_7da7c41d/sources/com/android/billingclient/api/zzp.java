package com.android.billingclient.api;
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
final class zzp implements Runnable {
    final /* synthetic */ AcknowledgePurchaseResponseListener zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(BillingClientImpl billingClientImpl, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        this.zza = acknowledgePurchaseResponseListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.onAcknowledgePurchaseResponse(zzam.zzr);
    }
}
