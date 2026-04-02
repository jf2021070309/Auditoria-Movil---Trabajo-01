package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatj;
import com.google.android.gms.internal.ads.zzatl;
import com.google.android.gms.internal.ads.zzbeo;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbja;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbjd;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbrj;
import com.google.android.gms.internal.ads.zzbrp;
import com.google.android.gms.internal.ads.zzbrq;
import com.google.android.gms.internal.ads.zzbuu;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbye;
import com.google.android.gms.internal.ads.zzbyf;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class zzcc extends zzatj implements zzce {
    public zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbnt zzbntVar, int i) throws RemoteException {
        zzbq zzboVar;
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzatl.zzf(zza, zzbntVar);
        zza.writeInt(231004000);
        Parcel zzbg = zzbg(3, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzbq) {
                zzboVar = (zzbq) queryLocalInterface;
            } else {
                zzboVar = new zzbo(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbnt zzbntVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzd(zza, zzqVar);
        zza.writeString(str);
        zzatl.zzf(zza, zzbntVar);
        zza.writeInt(231004000);
        Parcel zzbg = zzbg(13, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbnt zzbntVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzd(zza, zzqVar);
        zza.writeString(str);
        zzatl.zzf(zza, zzbntVar);
        zza.writeInt(231004000);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbnt zzbntVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzd(zza, zzqVar);
        zza.writeString(str);
        zzatl.zzf(zza, zzbntVar);
        zza.writeInt(231004000);
        Parcel zzbg = zzbg(2, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzd(zza, zzqVar);
        zza.writeString(str);
        zza.writeInt(231004000);
        Parcel zzbg = zzbg(10, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzco zzcmVar;
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zza.writeInt(231004000);
        Parcel zzbg = zzbg(9, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzco) {
                zzcmVar = (zzco) queryLocalInterface;
            } else {
                zzcmVar = new zzcm(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbnt zzbntVar, int i) throws RemoteException {
        zzdj zzdhVar;
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbntVar);
        zza.writeInt(231004000);
        Parcel zzbg = zzbg(17, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (queryLocalInterface instanceof zzdj) {
                zzdhVar = (zzdj) queryLocalInterface;
            } else {
                zzdhVar = new zzdh(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbep zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, iObjectWrapper2);
        Parcel zzbg = zzbg(5, zza);
        zzbep zzbx = zzbeo.zzbx(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzbx;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbev zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, iObjectWrapper2);
        zzatl.zzf(zza, iObjectWrapper3);
        Parcel zzbg = zzbg(11, zza);
        zzbev zze = zzbeu.zze(zzbg.readStrongBinder());
        zzbg.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbjd zzk(IObjectWrapper iObjectWrapper, zzbnt zzbntVar, int i, zzbja zzbjaVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbntVar);
        zza.writeInt(231004000);
        zzatl.zzf(zza, zzbjaVar);
        Parcel zzbg = zzbg(16, zza);
        zzbjd zzb = zzbjc.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbrj zzl(IObjectWrapper iObjectWrapper, zzbnt zzbntVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbntVar);
        zza.writeInt(231004000);
        Parcel zzbg = zzbg(15, zza);
        zzbrj zzb = zzbri.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbrq zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(8, zza);
        zzbrq zzG = zzbrp.zzG(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzG;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbuu zzn(IObjectWrapper iObjectWrapper, zzbnt zzbntVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvk zzo(IObjectWrapper iObjectWrapper, String str, zzbnt zzbntVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzatl.zzf(zza, zzbntVar);
        zza.writeInt(231004000);
        Parcel zzbg = zzbg(12, zza);
        zzbvk zzq = zzbvj.zzq(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbyf zzp(IObjectWrapper iObjectWrapper, zzbnt zzbntVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbntVar);
        zza.writeInt(231004000);
        Parcel zzbg = zzbg(14, zza);
        zzbyf zzb = zzbye.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }
}
