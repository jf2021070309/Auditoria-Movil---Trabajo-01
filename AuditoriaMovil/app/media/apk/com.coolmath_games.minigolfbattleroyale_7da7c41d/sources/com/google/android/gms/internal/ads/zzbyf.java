package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbyf implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbyh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyf(zzbyh zzbyhVar) {
        this.zza = zzbyhVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        Intent zzc = this.zza.zzc();
        com.google.android.gms.ads.internal.zzt.zzc();
        context = this.zza.zzb;
        com.google.android.gms.ads.internal.util.zzs.zzP(context, zzc);
    }
}
