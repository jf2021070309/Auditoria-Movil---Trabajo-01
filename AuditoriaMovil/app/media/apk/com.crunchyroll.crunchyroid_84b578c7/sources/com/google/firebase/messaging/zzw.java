package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
/* loaded from: classes4.dex */
final class zzw extends BroadcastReceiver {
    final /* synthetic */ zzx zza;
    private zzx zzb;

    public zzw(zzx zzxVar, zzx zzxVar2) {
        this.zza = zzxVar;
        this.zzb = zzxVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        boolean zzb;
        zzu zzuVar;
        zzx zzxVar = this.zzb;
        if (zzxVar == null) {
            return;
        }
        zzb = zzxVar.zzb();
        if (!zzb) {
            return;
        }
        zzx.zzc();
        zzuVar = this.zzb.zzd;
        zzuVar.zza(this.zzb, 0L);
        context.unregisterReceiver(this);
        this.zzb = null;
    }
}
