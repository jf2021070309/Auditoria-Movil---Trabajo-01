package com.android.billingclient.api;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
public final class zzy implements Callable<Bundle> {
    final /* synthetic */ int zza;
    final /* synthetic */ SkuDetails zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ BillingFlowParams zzd;
    final /* synthetic */ Bundle zze;
    final /* synthetic */ BillingClientImpl zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzy(BillingClientImpl billingClientImpl, int i, SkuDetails skuDetails, String str, BillingFlowParams billingFlowParams, Bundle bundle) {
        this.zzf = billingClientImpl;
        this.zza = i;
        this.zzb = skuDetails;
        this.zzc = str;
        this.zzd = billingFlowParams;
        this.zze = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Bundle call() throws Exception {
        com.google.android.gms.internal.play_billing.zzd zzdVar;
        Context context;
        zzdVar = this.zzf.zzg;
        int i = this.zza;
        context = this.zzf.zzf;
        return zzdVar.zzg(i, context.getPackageName(), this.zzb.getSku(), this.zzc, null, this.zze);
    }
}
