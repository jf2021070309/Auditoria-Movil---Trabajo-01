package com.google.android.gms.internal.cast_tv;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzei extends zza implements zzej {
    public zzei(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.cast.tv.tvlibrary.aidl.ICastTvClient");
    }

    @Override // com.google.android.gms.internal.cast_tv.zzej
    public final void zze(zzed zzedVar, zzen zzenVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, zzedVar);
        zzc.zzf(zza, zzenVar);
        zzH(7, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzej
    public final void zzf(zzdx zzdxVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, zzdxVar);
        zzH(5, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzej
    public final void zzg(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzH(4, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzej
    public final void zzh(zzdz zzdzVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, zzdzVar);
        zzH(1, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzej
    public final void zzi(String str, String str2, String str3) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzH(2, zza);
    }
}
