package com.android.billingclient.api;
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
final class zzi implements Runnable {
    final /* synthetic */ ConsumeResponseListener zza;
    final /* synthetic */ ConsumeParams zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzi(BillingClientImpl billingClientImpl, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        this.zza = consumeResponseListener;
        this.zzb = consumeParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.onConsumeResponse(zzam.zzr, this.zzb.getPurchaseToken());
    }
}
