package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import java.util.concurrent.Callable;
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
final class zzs implements Callable<Bundle> {
    final /* synthetic */ String zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ BillingClientImpl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(BillingClientImpl billingClientImpl, String str, Bundle bundle) {
        this.zzc = billingClientImpl;
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Bundle call() throws Exception {
        return BillingClientImpl.zzc(this.zzc).zzj(8, BillingClientImpl.zzb(this.zzc).getPackageName(), this.zza, BillingClient.SkuType.SUBS, this.zzb);
    }
}
