package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
/* loaded from: classes.dex */
public final class zzaii extends BroadcastReceiver {
    public final /* synthetic */ zzaij zza;

    public /* synthetic */ zzaii(zzaij zzaijVar, zzaig zzaigVar) {
        this.zza = zzaijVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Handler zza = zzaij.zza(this.zza);
        final zzaij zzaijVar = this.zza;
        zza.post(new Runnable(zzaijVar) { // from class: com.google.android.gms.internal.ads.zzaih
            private final zzaij zza;

            {
                this.zza = zzaijVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzaij.zzf(this.zza);
            }
        });
    }
}
