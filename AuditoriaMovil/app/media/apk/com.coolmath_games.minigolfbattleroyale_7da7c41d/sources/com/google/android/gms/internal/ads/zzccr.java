package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzccr extends zzadk implements zzccs {
    public zzccr() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzccs zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof zzccs) {
            return (zzccs) queryLocalInterface;
        }
        return new zzccq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzccz zzcczVar = null;
        zzccz zzcczVar2 = null;
        zzcda zzcdaVar = null;
        zzccv zzccvVar = null;
        switch (i) {
            case 1:
                zzbdg zzbdgVar = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface instanceof zzccz) {
                        zzcczVar = (zzccz) queryLocalInterface;
                    } else {
                        zzcczVar = new zzccx(readStrongBinder);
                    }
                }
                zzc(zzbdgVar, zzcczVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    if (queryLocalInterface2 instanceof zzccv) {
                        zzccvVar = (zzccv) queryLocalInterface2;
                    } else {
                        zzccvVar = new zzcct(readStrongBinder2);
                    }
                }
                zze(zzccvVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzi = zzi();
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zzi);
                return true;
            case 4:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 5:
                zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    if (queryLocalInterface3 instanceof zzcda) {
                        zzcdaVar = (zzcda) queryLocalInterface3;
                    } else {
                        zzcdaVar = new zzcda(readStrongBinder3);
                    }
                }
                zzp(zzcdaVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzh((zzcdg) zzadl.zzc(parcel, zzcdg.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zzf(zzbgs.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                zzadl.zze(parcel2, zzg);
                return true;
            case 10:
                zzk(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzadl.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                zzccp zzl = zzl();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzl);
                return true;
            case 12:
                zzbgz zzm = zzm();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzm);
                return true;
            case 13:
                zzn(zzbgv.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbdg zzbdgVar2 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface4 instanceof zzccz) {
                        zzcczVar2 = (zzccz) queryLocalInterface4;
                    } else {
                        zzcczVar2 = new zzccx(readStrongBinder4);
                    }
                }
                zzd(zzbdgVar2, zzcczVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzo(zzadl.zza(parcel));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
