package com.android.billingclient.api;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
public final class zzt implements Callable<Integer> {
    final /* synthetic */ String zza;
    final /* synthetic */ BillingClientImpl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(BillingClientImpl billingClientImpl, String str) {
        this.zzb = billingClientImpl;
        this.zza = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Integer call() throws Exception {
        com.google.android.gms.internal.play_billing.zzd zzdVar;
        Context context;
        zzdVar = this.zzb.zzg;
        context = this.zzb.zzf;
        String packageName = context.getPackageName();
        String str = this.zza;
        Bundle bundle = new Bundle();
        bundle.putBoolean(BillingFlowParams.EXTRA_PARAM_KEY_VR, true);
        return Integer.valueOf(zzdVar.zzi(7, packageName, str, bundle));
    }
}
