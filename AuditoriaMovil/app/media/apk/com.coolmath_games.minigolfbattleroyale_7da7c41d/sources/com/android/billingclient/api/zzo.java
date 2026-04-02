package com.android.billingclient.api;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
public final class zzo implements Callable<Void> {
    final /* synthetic */ AcknowledgePurchaseParams zza;
    final /* synthetic */ AcknowledgePurchaseResponseListener zzb;
    final /* synthetic */ BillingClientImpl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(BillingClientImpl billingClientImpl, AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        this.zzc = billingClientImpl;
        this.zza = acknowledgePurchaseParams;
        this.zzb = acknowledgePurchaseResponseListener;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Void call() throws Exception {
        com.google.android.gms.internal.play_billing.zzd zzdVar;
        Context context;
        String str;
        try {
            zzdVar = this.zzc.zzg;
            context = this.zzc.zzf;
            String packageName = context.getPackageName();
            String purchaseToken = this.zza.getPurchaseToken();
            AcknowledgePurchaseParams acknowledgePurchaseParams = this.zza;
            str = this.zzc.zzb;
            Bundle zzn = zzdVar.zzn(9, packageName, purchaseToken, com.google.android.gms.internal.play_billing.zza.zzk(acknowledgePurchaseParams, str));
            this.zzc.zzB(new zzn(this, com.google.android.gms.internal.play_billing.zza.zzd(zzn, "BillingClient"), com.google.android.gms.internal.play_billing.zza.zze(zzn, "BillingClient")));
            return null;
        } catch (Exception e) {
            this.zzc.zzB(new zzm(this, e));
            return null;
        }
    }
}
