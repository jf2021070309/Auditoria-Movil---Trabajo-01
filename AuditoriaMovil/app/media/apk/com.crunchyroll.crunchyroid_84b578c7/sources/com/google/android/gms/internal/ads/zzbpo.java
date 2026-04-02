package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbpo extends zzatj implements zzbpq {
    public zzbpo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final zzdq zze() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        zzdq zzb = zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final zzbqe zzf() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        zzbqe zzbqeVar = (zzbqe) zzatl.zza(zzbg, zzbqe.CREATOR);
        zzbg.recycle();
        return zzbqeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final zzbqe zzg() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        zzbqe zzbqeVar = (zzbqe) zzatl.zza(zzbg, zzbqe.CREATOR);
        zzbg.recycle();
        return zzbqeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzq zzqVar, zzbpt zzbptVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzatl.zzd(zza, bundle);
        zzatl.zzd(zza, bundle2);
        zzatl.zzd(zza, zzqVar);
        zzatl.zzf(zza, zzbptVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzi(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpb zzbpbVar, zzbnz zzbnzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatl.zzd(zza, zzlVar);
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbpbVar);
        zzatl.zzf(zza, zzbnzVar);
        zzbh(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzj(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, zzbnz zzbnzVar, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatl.zzd(zza, zzlVar);
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbpeVar);
        zzatl.zzf(zza, zzbnzVar);
        zzatl.zzd(zza, zzqVar);
        zzbh(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzk(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, zzbnz zzbnzVar, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatl.zzd(zza, zzlVar);
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbpeVar);
        zzatl.zzf(zza, zzbnzVar);
        zzatl.zzd(zza, zzqVar);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzl(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbph zzbphVar, zzbnz zzbnzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatl.zzd(zza, zzlVar);
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbphVar);
        zzatl.zzf(zza, zzbnzVar);
        zzbh(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzm(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpk zzbpkVar, zzbnz zzbnzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatl.zzd(zza, zzlVar);
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbpkVar);
        zzatl.zzf(zza, zzbnzVar);
        zzbh(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzn(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpk zzbpkVar, zzbnz zzbnzVar, zzbdz zzbdzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatl.zzd(zza, zzlVar);
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbpkVar);
        zzatl.zzf(zza, zzbnzVar);
        zzatl.zzd(zza, zzbdzVar);
        zzbh(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzo(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpn zzbpnVar, zzbnz zzbnzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatl.zzd(zza, zzlVar);
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbpnVar);
        zzatl.zzf(zza, zzbnzVar);
        zzbh(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzp(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpn zzbpnVar, zzbnz zzbnzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatl.zzd(zza, zzlVar);
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbpnVar);
        zzatl.zzf(zza, zzbnzVar);
        zzbh(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(24, zza);
        boolean zzg = zzatl.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(15, zza);
        boolean zzg = zzatl.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(17, zza);
        boolean zzg = zzatl.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
