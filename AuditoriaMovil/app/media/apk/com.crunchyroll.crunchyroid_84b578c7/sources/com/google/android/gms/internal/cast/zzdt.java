package com.google.android.gms.internal.cast;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzdt extends zza {
    public zzdt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
    }

    public final void zze() throws RemoteException {
        zzd(3, zza());
    }

    public final void zzf(zzds zzdsVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzdsVar);
        zza.writeInt(i);
        zzd(5, zza);
    }

    public final void zzg(zzds zzdsVar, zzdv zzdvVar, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzdsVar);
        zzc.zze(zza, zzdvVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzc.zzc(zza, bundle);
        zzd(7, zza);
    }

    public final void zzh(zzds zzdsVar, PendingIntent pendingIntent, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzdsVar);
        zzc.zzc(zza, pendingIntent);
        zza.writeString(str);
        zza.writeString(str2);
        zzc.zzc(zza, bundle);
        zzd(8, zza);
    }

    public final void zzi(zzds zzdsVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzdsVar);
        zzd(6, zza);
    }
}
