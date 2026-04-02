package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbvi extends zzatj implements zzbvk {
    public zzbvi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final Bundle zzb() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        Bundle bundle = (Bundle) zzatl.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final zzdn zzc() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        zzdn zzb = zzdm.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final zzbvh zzd() throws RemoteException {
        zzbvh zzbvfVar;
        Parcel zzbg = zzbg(11, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            if (queryLocalInterface instanceof zzbvh) {
                zzbvfVar = (zzbvh) queryLocalInterface;
            } else {
                zzbvfVar = new zzbvf(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbvfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzf(zzl zzlVar, zzbvr zzbvrVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzd(zza, zzlVar);
        zzatl.zzf(zza, zzbvrVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzg(zzl zzlVar, zzbvr zzbvrVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzd(zza, zzlVar);
        zzatl.zzf(zza, zzbvrVar);
        zzbh(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzatl.zza;
        zza.writeInt(z ? 1 : 0);
        zzbh(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzi(zzdd zzddVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzddVar);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzj(zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzdgVar);
        zzbh(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzk(zzbvn zzbvnVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzbvnVar);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzl(zzbvy zzbvyVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzd(zza, zzbvyVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzp(zzbvs zzbvsVar) throws RemoteException {
        throw null;
    }
}
