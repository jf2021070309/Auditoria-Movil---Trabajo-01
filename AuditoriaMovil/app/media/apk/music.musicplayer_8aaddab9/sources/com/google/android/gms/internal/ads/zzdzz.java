package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
/* loaded from: classes.dex */
public final class zzdzz extends zzcbe {
    public final /* synthetic */ zzeaa zza;

    public zzdzz(zzeaa zzeaaVar) {
        this.zza = zzeaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzc(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzf(com.google.android.gms.ads.internal.util.zzbc zzbcVar) {
        this.zza.zza.zzd(new com.google.android.gms.ads.internal.util.zzbb(zzbcVar.zza, zzbcVar.zzb));
    }
}
