package com.android.billingclient.api;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
public final class zzaa implements Callable<Bundle> {
    final /* synthetic */ SkuDetails zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ BillingClientImpl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaa(BillingClientImpl billingClientImpl, SkuDetails skuDetails, String str) {
        this.zzc = billingClientImpl;
        this.zza = skuDetails;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Bundle call() throws Exception {
        com.google.android.gms.internal.play_billing.zzd zzdVar;
        Context context;
        zzdVar = this.zzc.zzg;
        context = this.zzc.zzf;
        return zzdVar.zzc(3, context.getPackageName(), this.zza.getSku(), this.zzb, null);
    }
}
