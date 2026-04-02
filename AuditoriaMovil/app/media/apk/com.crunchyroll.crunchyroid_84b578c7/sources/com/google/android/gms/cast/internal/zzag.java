package com.google.android.gms.cast.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.zzbu;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzag extends com.google.android.gms.internal.cast.zza {
    public zzag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    public final void zze() throws RemoteException {
        zzd(17, zza());
    }

    public final void zzf() throws RemoteException {
        zzd(1, zza());
    }

    public final void zzg(String str, String str2, zzbu zzbuVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.cast.zzc.zzc(zza, zzbuVar);
        zzd(14, zza);
    }

    public final void zzh(String str, LaunchOptions launchOptions) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.cast.zzc.zzc(zza, launchOptions);
        zzd(13, zza);
    }

    public final void zzi() throws RemoteException {
        zzd(4, zza());
    }

    public final void zzj(zzai zzaiVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zze(zza, zzaiVar);
        zzd(18, zza);
    }

    public final void zzk(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzd(11, zza);
    }

    public final void zzl() throws RemoteException {
        zzd(6, zza());
    }

    public final void zzm(String str, String str2, long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeLong(j);
        zzd(9, zza);
    }

    public final void zzn(boolean z, double d, boolean z2) throws RemoteException {
        Parcel zza = zza();
        int i = com.google.android.gms.internal.cast.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zza.writeDouble(d);
        zza.writeInt(z2 ? 1 : 0);
        zzd(8, zza);
    }

    public final void zzo(double d, double d2, boolean z) throws RemoteException {
        Parcel zza = zza();
        zza.writeDouble(d);
        zza.writeDouble(d2);
        int i = com.google.android.gms.internal.cast.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzd(7, zza);
    }

    public final void zzp(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzd(5, zza);
    }

    public final void zzq() throws RemoteException {
        zzd(19, zza());
    }

    public final void zzr(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzd(12, zza);
    }
}
