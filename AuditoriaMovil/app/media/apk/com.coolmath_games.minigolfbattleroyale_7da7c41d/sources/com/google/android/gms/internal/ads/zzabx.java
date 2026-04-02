package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzabx extends BroadcastReceiver {
    final /* synthetic */ zzaby zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabx(zzaby zzabyVar) {
        this.zza = zzabyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzg();
    }
}
