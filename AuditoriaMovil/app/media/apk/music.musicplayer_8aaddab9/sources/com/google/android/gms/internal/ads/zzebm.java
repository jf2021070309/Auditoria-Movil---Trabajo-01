package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class zzebm implements zzfrz<ParcelFileDescriptor> {
    public final /* synthetic */ zzcbf zza;

    public zzebm(zzebq zzebqVar, zzcbf zzcbfVar) {
        this.zza = zzcbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        try {
            this.zza.zzf(com.google.android.gms.ads.internal.util.zzbc.zza(th));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.zza.zze(parcelFileDescriptor);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e2);
        }
    }
}
