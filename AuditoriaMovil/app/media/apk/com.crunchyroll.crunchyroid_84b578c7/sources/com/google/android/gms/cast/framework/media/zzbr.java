package com.google.android.gms.cast.framework.media;

import android.content.DialogInterface;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzbr implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbu zza;
    final /* synthetic */ zzbu zzb;
    final /* synthetic */ TracksChooserDialogFragment zzc;

    public zzbr(TracksChooserDialogFragment tracksChooserDialogFragment, zzbu zzbuVar, zzbu zzbuVar2) {
        this.zzc = tracksChooserDialogFragment;
        this.zza = zzbuVar;
        this.zzb = zzbuVar2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        TracksChooserDialogFragment.zzc(this.zzc, this.zza, this.zzb);
    }
}
