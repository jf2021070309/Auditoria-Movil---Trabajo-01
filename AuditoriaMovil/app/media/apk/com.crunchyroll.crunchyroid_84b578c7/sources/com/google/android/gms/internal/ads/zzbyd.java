package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbyd extends zzatj implements zzbyf {
    public zzbyd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyf
    public final void zze(IObjectWrapper iObjectWrapper, zzbyj zzbyjVar, zzbyc zzbycVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzd(zza, zzbyjVar);
        zzatl.zzf(zza, zzbycVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyf
    public final void zzf(zzbso zzbsoVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzd(zza, zzbsoVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyf
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbsf zzbsfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbsfVar);
        zzbh(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyf
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbsf zzbsfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbsfVar);
        zzbh(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyf
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyf
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyf
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbsf zzbsfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbsfVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyf
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbsf zzbsfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbsfVar);
        zzbh(5, zza);
    }
}
