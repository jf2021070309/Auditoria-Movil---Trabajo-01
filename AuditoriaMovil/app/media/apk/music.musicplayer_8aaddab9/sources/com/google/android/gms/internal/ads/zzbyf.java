package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
/* loaded from: classes.dex */
public final class zzbyf implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbyh zza;

    public zzbyf(zzbyh zzbyhVar) {
        this.zza = zzbyhVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        Context context;
        Intent zzc = this.zza.zzc();
        com.google.android.gms.ads.internal.zzt.zzc();
        context = this.zza.zzb;
        com.google.android.gms.ads.internal.util.zzs.zzP(context, zzc);
    }
}
