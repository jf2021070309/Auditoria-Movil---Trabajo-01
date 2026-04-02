package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
public final class zze {
    private final Context zza;
    private final zzd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zze(Context context, PurchasesUpdatedListener purchasesUpdatedListener) {
        this.zza = context;
        this.zzb = new zzd(this, purchasesUpdatedListener, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzb.zza(this.zza, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PurchasesUpdatedListener zzb() {
        return zzd.zzc(this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        this.zzb.zzb(this.zza);
    }
}
