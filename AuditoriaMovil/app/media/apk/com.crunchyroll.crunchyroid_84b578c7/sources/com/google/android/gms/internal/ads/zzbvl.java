package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbvl extends zzatj implements zzbvn {
    public zzbvl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zze() throws RemoteException {
        zzbh(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzf() throws RemoteException {
        zzbh(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzg() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzh(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbh(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzi(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzd(zza, zzeVar);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzj() throws RemoteException {
        zzbh(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzk(zzbvh zzbvhVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzbvhVar);
        zzbh(3, zza);
    }
}
