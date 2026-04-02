package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
public final class zzawb extends BroadcastReceiver {
    public final /* synthetic */ zzawe zza;

    public zzawb(zzawe zzaweVar) {
        this.zza = zzaweVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzj(3);
    }
}
