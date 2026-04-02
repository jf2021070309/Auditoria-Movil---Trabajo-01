package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzawb extends BroadcastReceiver {
    final /* synthetic */ zzawe zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawb(zzawe zzaweVar) {
        this.zza = zzaweVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzj(3);
    }
}
