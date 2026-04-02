package com.android.billingclient.api;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
public final class zzu implements Runnable {
    final /* synthetic */ ConsumeResponseListener zza;
    final /* synthetic */ BillingResult zzb;
    final /* synthetic */ String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzu(BillingClientImpl billingClientImpl, ConsumeResponseListener consumeResponseListener, BillingResult billingResult, String str) {
        this.zza = consumeResponseListener;
        this.zzb = billingResult;
        this.zzc = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.play_billing.zza.zza("BillingClient", "Successfully consumed purchase.");
        this.zza.onConsumeResponse(this.zzb, this.zzc);
    }
}
