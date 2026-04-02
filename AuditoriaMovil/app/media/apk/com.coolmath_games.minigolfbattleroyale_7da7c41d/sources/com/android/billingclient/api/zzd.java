package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
public final class zzd extends BroadcastReceiver {
    final /* synthetic */ zze zza;
    private final PurchasesUpdatedListener zzb;
    private boolean zzc;

    public /* synthetic */ zzd(zze zzeVar, PurchasesUpdatedListener purchasesUpdatedListener, zzc zzcVar) {
        this.zza = zzeVar;
        this.zzb = purchasesUpdatedListener;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzb.onPurchasesUpdated(com.google.android.gms.internal.play_billing.zza.zzc(intent, "BillingBroadcastManager"), com.google.android.gms.internal.play_billing.zza.zzf(intent.getExtras()));
    }

    public final void zza(Context context, IntentFilter intentFilter) {
        zzd zzdVar;
        if (this.zzc) {
            return;
        }
        zzdVar = this.zza.zzb;
        context.registerReceiver(zzdVar, intentFilter);
        this.zzc = true;
    }

    public final void zzb(Context context) {
        zzd zzdVar;
        if (this.zzc) {
            zzdVar = this.zza.zzb;
            context.unregisterReceiver(zzdVar);
            this.zzc = false;
            return;
        }
        com.google.android.gms.internal.play_billing.zza.zzb("BillingBroadcastManager", "Receiver is not registered.");
    }
}
