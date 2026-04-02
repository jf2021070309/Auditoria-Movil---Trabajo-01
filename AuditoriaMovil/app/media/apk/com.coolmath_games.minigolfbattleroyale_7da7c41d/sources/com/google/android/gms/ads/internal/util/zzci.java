package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class zzci extends BroadcastReceiver {
    final /* synthetic */ zzcj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzci(zzcj zzcjVar) {
        this.zza = zzcjVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zze(context, intent);
    }
}
