package com.android.billingclient.api;

import com.android.billingclient.api.BillingResult;
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
final class zzac implements Runnable {
    final /* synthetic */ zzap zza;
    final /* synthetic */ zzad zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzac(zzad zzadVar, zzap zzapVar) {
        this.zzb = zzadVar;
        this.zza = zzapVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SkuDetailsResponseListener skuDetailsResponseListener = this.zzb.zzc;
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(this.zza.zzb());
        newBuilder.setDebugMessage(this.zza.zzc());
        skuDetailsResponseListener.onSkuDetailsResponse(newBuilder.build(), this.zza.zza());
    }
}
