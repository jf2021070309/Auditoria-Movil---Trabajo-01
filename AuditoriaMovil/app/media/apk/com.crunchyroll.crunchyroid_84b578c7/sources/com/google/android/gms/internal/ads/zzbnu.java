package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.aps.iva.d0.b2;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbnu extends zzatj implements zzbnw {
    public zzbnu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzA(IObjectWrapper iObjectWrapper, zzl zzlVar, String str, zzbnz zzbnzVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzd(zza, zzlVar);
        zza.writeString(str);
        zzatl.zzf(zza, zzbnzVar);
        zzbh(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzB(zzl zzlVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzC(IObjectWrapper iObjectWrapper, zzl zzlVar, String str, zzbnz zzbnzVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzd(zza, zzlVar);
        zza.writeString(str);
        zzatl.zzf(zza, zzbnzVar);
        zzbh(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzE() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzF() throws RemoteException {
        zzbh(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzG(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzatl.zza;
        zza.writeInt(z ? 1 : 0);
        zzbh(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzbh(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzI() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzbh(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzbh(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzL() throws RemoteException {
        zzbh(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final boolean zzM() throws RemoteException {
        Parcel zzbg = zzbg(22, zza());
        boolean zzg = zzatl.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final boolean zzN() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        boolean zzg = zzatl.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final zzboe zzO() throws RemoteException {
        zzboe zzboeVar;
        Parcel zzbg = zzbg(15, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzboeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            if (queryLocalInterface instanceof zzboe) {
                zzboeVar = (zzboe) queryLocalInterface;
            } else {
                zzboeVar = new zzboe(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzboeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final zzbof zzP() throws RemoteException {
        zzbof zzbofVar;
        Parcel zzbg = zzbg(16, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbofVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            if (queryLocalInterface instanceof zzbof) {
                zzbofVar = (zzbof) queryLocalInterface;
            } else {
                zzbofVar = new zzbof(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbofVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final zzdq zzh() throws RemoteException {
        Parcel zzbg = zzbg(26, zza());
        zzdq zzb = zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final zzbff zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final zzboc zzj() throws RemoteException {
        zzboc zzboaVar;
        Parcel zzbg = zzbg(36, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzboaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            if (queryLocalInterface instanceof zzboc) {
                zzboaVar = (zzboc) queryLocalInterface;
            } else {
                zzboaVar = new zzboa(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzboaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final zzboi zzk() throws RemoteException {
        zzboi zzbogVar;
        Parcel zzbg = zzbg(27, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbogVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            if (queryLocalInterface instanceof zzboi) {
                zzbogVar = (zzboi) queryLocalInterface;
            } else {
                zzbogVar = new zzbog(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final zzbqe zzl() throws RemoteException {
        Parcel zzbg = zzbg(33, zza());
        zzbqe zzbqeVar = (zzbqe) zzatl.zza(zzbg, zzbqe.CREATOR);
        zzbg.recycle();
        return zzbqeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final zzbqe zzm() throws RemoteException {
        Parcel zzbg = zzbg(34, zza());
        zzbqe zzbqeVar = (zzbqe) zzatl.zza(zzbg, zzbqe.CREATOR);
        zzbg.recycle();
        return zzbqeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final IObjectWrapper zzn() throws RemoteException {
        return b2.a(zzbg(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzo() throws RemoteException {
        zzbh(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzp(IObjectWrapper iObjectWrapper, zzl zzlVar, String str, zzbvc zzbvcVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzd(zza, zzlVar);
        zza.writeString(null);
        zzatl.zzf(zza, zzbvcVar);
        zza.writeString(str2);
        zzbh(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzq(IObjectWrapper iObjectWrapper, zzbkd zzbkdVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbkdVar);
        zza.writeTypedList(list);
        zzbh(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzr(IObjectWrapper iObjectWrapper, zzbvc zzbvcVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbvcVar);
        zza.writeStringList(list);
        zzbh(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzs(zzl zzlVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzd(zza, zzlVar);
        zza.writeString(str);
        zzbh(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzt(IObjectWrapper iObjectWrapper, zzl zzlVar, String str, zzbnz zzbnzVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzd(zza, zzlVar);
        zza.writeString(str);
        zzatl.zzf(zza, zzbnzVar);
        zzbh(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzu(IObjectWrapper iObjectWrapper, zzq zzqVar, zzl zzlVar, String str, zzbnz zzbnzVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzv(IObjectWrapper iObjectWrapper, zzq zzqVar, zzl zzlVar, String str, String str2, zzbnz zzbnzVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzd(zza, zzqVar);
        zzatl.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzatl.zzf(zza, zzbnzVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzw(IObjectWrapper iObjectWrapper, zzq zzqVar, zzl zzlVar, String str, String str2, zzbnz zzbnzVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzd(zza, zzqVar);
        zzatl.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzatl.zzf(zza, zzbnzVar);
        zzbh(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzx(IObjectWrapper iObjectWrapper, zzl zzlVar, String str, zzbnz zzbnzVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzy(IObjectWrapper iObjectWrapper, zzl zzlVar, String str, String str2, zzbnz zzbnzVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzatl.zzf(zza, zzbnzVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzz(IObjectWrapper iObjectWrapper, zzl zzlVar, String str, String str2, zzbnz zzbnzVar, zzbdz zzbdzVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzatl.zzf(zza, zzbnzVar);
        zzatl.zzd(zza, zzbdzVar);
        zza.writeStringList(list);
        zzbh(14, zza);
    }
}
