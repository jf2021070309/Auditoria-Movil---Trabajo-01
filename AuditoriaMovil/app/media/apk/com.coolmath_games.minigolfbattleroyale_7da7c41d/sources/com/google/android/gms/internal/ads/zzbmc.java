package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbmc extends zzadj implements zzbme {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final float zze() throws RemoteException {
        Parcel zzbi = zzbi(2, zza());
        float readFloat = zzbi.readFloat();
        zzbi.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzf(zza, iObjectWrapper);
        zzbj(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final IObjectWrapper zzg() throws RemoteException {
        Parcel zzbi = zzbi(4, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbi.readStrongBinder());
        zzbi.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final float zzh() throws RemoteException {
        Parcel zzbi = zzbi(5, zza());
        float readFloat = zzbi.readFloat();
        zzbi.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final float zzi() throws RemoteException {
        Parcel zzbi = zzbi(6, zza());
        float readFloat = zzbi.readFloat();
        zzbi.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final zzbhc zzj() throws RemoteException {
        Parcel zzbi = zzbi(7, zza());
        zzbhc zzb = zzbhb.zzb(zzbi.readStrongBinder());
        zzbi.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final boolean zzk() throws RemoteException {
        Parcel zzbi = zzbi(8, zza());
        boolean zza = zzadl.zza(zzbi);
        zzbi.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzl(zzbnp zzbnpVar) throws RemoteException {
        throw null;
    }
}
