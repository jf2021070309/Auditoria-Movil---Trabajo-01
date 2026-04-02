package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzaii extends BroadcastReceiver {
    final /* synthetic */ zzaij zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaii(zzaij zzaijVar, zzaig zzaigVar) {
        this.zza = zzaijVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Handler zza = zzaij.zza(this.zza);
        final zzaij zzaijVar = this.zza;
        zza.post(new Runnable(zzaijVar) { // from class: com.google.android.gms.internal.ads.zzaih
            private final zzaij zza;

            /* JADX INFO: Access modifiers changed from: package-private */
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
