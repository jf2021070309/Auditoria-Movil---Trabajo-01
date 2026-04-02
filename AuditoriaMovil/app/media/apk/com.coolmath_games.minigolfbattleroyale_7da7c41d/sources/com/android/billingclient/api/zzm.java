package com.android.billingclient.api;
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
final class zzm implements Runnable {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzo zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(zzo zzoVar, Exception exc) {
        this.zzb = zzoVar;
        this.zza = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("Error acknowledge purchase; ex: ");
        sb.append(valueOf);
        com.google.android.gms.internal.play_billing.zza.zzb("BillingClient", sb.toString());
        this.zzb.zzb.onAcknowledgePurchaseResponse(zzam.zzq);
    }
}
