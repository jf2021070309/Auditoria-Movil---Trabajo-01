package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfju extends zzadj implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfju(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfjs zze(zzfjq zzfjqVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzd(zza, zzfjqVar);
        Parcel zzbi = zzbi(1, zza);
        zzfjs zzfjsVar = (zzfjs) zzadl.zzc(zzbi, zzfjs.CREATOR);
        zzbi.recycle();
        return zzfjsVar;
    }

    public final void zzf(zzfjn zzfjnVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzd(zza, zzfjnVar);
        zzbj(2, zza);
    }

    public final zzfkb zzg(zzfjz zzfjzVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzd(zza, zzfjzVar);
        Parcel zzbi = zzbi(3, zza);
        zzfkb zzfkbVar = (zzfkb) zzadl.zzc(zzbi, zzfkb.CREATOR);
        zzbi.recycle();
        return zzfkbVar;
    }
}
