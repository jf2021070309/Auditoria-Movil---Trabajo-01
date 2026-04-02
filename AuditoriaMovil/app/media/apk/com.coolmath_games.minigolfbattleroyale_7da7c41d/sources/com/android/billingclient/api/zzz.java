package com.android.billingclient.api;

import android.content.Context;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import java.util.Arrays;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
public final class zzz implements Callable<Bundle> {
    final /* synthetic */ BillingFlowParams zza;
    final /* synthetic */ SkuDetails zzb;
    final /* synthetic */ BillingClientImpl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzz(BillingClientImpl billingClientImpl, BillingFlowParams billingFlowParams, SkuDetails skuDetails) {
        this.zzc = billingClientImpl;
        this.zza = billingFlowParams;
        this.zzb = skuDetails;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Bundle call() throws Exception {
        com.google.android.gms.internal.play_billing.zzd zzdVar;
        Context context;
        zzdVar = this.zzc.zzg;
        context = this.zzc.zzf;
        return zzdVar.zzf(5, context.getPackageName(), Arrays.asList(this.zza.getOldSku()), this.zzb.getSku(), BillingClient.SkuType.SUBS, null);
    }
}
