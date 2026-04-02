package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzebm implements zzfrz<ParcelFileDescriptor> {
    final /* synthetic */ zzcbf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebm(zzebq zzebqVar, zzcbf zzcbfVar) {
        this.zza = zzcbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        try {
            this.zza.zzf(com.google.android.gms.ads.internal.util.zzbc.zza(th));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.zza.zze(parcelFileDescriptor);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }
}
