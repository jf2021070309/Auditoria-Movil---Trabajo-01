package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class zzbfe extends zzadj implements zzbfg {
    public zzbfe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zze(zzbdg zzbdgVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzd(zza, zzbdgVar);
        zzbj(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean zzg() throws RemoteException {
        Parcel zzbi = zzbi(3, zza());
        boolean zza = zzadl.zza(zzbi);
        zzbi.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final String zzh() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzi(zzbdg zzbdgVar, int i2) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzd(zza, zzbdgVar);
        zza.writeInt(i2);
        zzbj(5, zza);
    }
}
