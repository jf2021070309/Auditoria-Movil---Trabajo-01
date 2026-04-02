package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
/* loaded from: classes.dex */
public final class zzbyl implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbym zza;

    public zzbyl(zzbym zzbymVar) {
        this.zza = zzbymVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.zza.zzf("User canceled the download.");
    }
}
