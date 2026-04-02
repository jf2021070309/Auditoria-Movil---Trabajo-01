package com.android.billingclient.api;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
public final class zzae implements Runnable {
    final /* synthetic */ BillingResult zza;
    final /* synthetic */ zzah zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzae(zzah zzahVar, BillingResult billingResult) {
        this.zzb = zzahVar;
        this.zza = billingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        BillingClientStateListener billingClientStateListener;
        BillingClientStateListener billingClientStateListener2;
        obj = this.zzb.zzb;
        synchronized (obj) {
            billingClientStateListener = this.zzb.zzd;
            if (billingClientStateListener != null) {
                billingClientStateListener2 = this.zzb.zzd;
                billingClientStateListener2.onBillingSetupFinished(this.zza);
            }
        }
    }
}
