package com.android.billingclient.api;

import com.android.billingclient.api.BillingResult;
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
final class zzn implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzo zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzo zzoVar, int i, String str) {
        this.zzc = zzoVar;
        this.zza = i;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener = this.zzc.zzb;
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(this.zza);
        newBuilder.setDebugMessage(this.zzb);
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(newBuilder.build());
    }
}
