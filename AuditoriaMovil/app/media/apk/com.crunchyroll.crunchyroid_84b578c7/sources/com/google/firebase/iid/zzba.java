package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.util.VisibleForTesting;
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
@VisibleForTesting
/* loaded from: classes4.dex */
final class zzba extends BroadcastReceiver {
    private zzbb zza;

    public zzba(zzbb zzbbVar) {
        this.zza = zzbbVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzbb zzbbVar = this.zza;
        if (zzbbVar == null || !zzbbVar.zzb()) {
            return;
        }
        FirebaseInstanceId.zzd();
        FirebaseInstanceId.zza(this.zza, 0L);
        this.zza.zza().unregisterReceiver(this);
        this.zza = null;
    }

    public final void zza() {
        FirebaseInstanceId.zzd();
        this.zza.zza().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
}
