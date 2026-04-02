package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbvj extends zzatk implements zzbvk {
    public zzbvj() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbvk zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof zzbvk) {
            return (zzbvk) queryLocalInterface;
        }
        return new zzbvi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbvr zzbvrVar = null;
        zzbvr zzbvrVar2 = null;
        zzbvs zzbvsVar = null;
        zzbvn zzbvnVar = null;
        switch (i) {
            case 1:
                zzl zzlVar = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface instanceof zzbvr) {
                        zzbvrVar = (zzbvr) queryLocalInterface;
                    } else {
                        zzbvrVar = new zzbvp(readStrongBinder);
                    }
                }
                zzatl.zzc(parcel);
                zzf(zzlVar, zzbvrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    if (queryLocalInterface2 instanceof zzbvn) {
                        zzbvnVar = (zzbvn) queryLocalInterface2;
                    } else {
                        zzbvnVar = new zzbvl(readStrongBinder2);
                    }
                }
                zzatl.zzc(parcel);
                zzk(zzbvnVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i3 = zzatl.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzm(asInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    if (queryLocalInterface3 instanceof zzbvs) {
                        zzbvsVar = (zzbvs) queryLocalInterface3;
                    } else {
                        zzbvsVar = new zzbvs(readStrongBinder3);
                    }
                }
                zzatl.zzc(parcel);
                zzp(zzbvsVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzatl.zzc(parcel);
                zzl((zzbvy) zzatl.zza(parcel, zzbvy.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zzdd zzb = zzdc.zzb(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb2 = zzb();
                parcel2.writeNoException();
                zzatl.zze(parcel2, zzb2);
                return true;
            case 10:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zzg = zzatl.zzg(parcel);
                zzatl.zzc(parcel);
                zzn(asInterface2, zzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbvh zzd = zzd();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzd);
                return true;
            case 12:
                zzdn zzc = zzc();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzc);
                return true;
            case 13:
                zzdg zzb3 = zzdf.zzb(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzj(zzb3);
                parcel2.writeNoException();
                return true;
            case 14:
                zzl zzlVar2 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface4 instanceof zzbvr) {
                        zzbvrVar2 = (zzbvr) queryLocalInterface4;
                    } else {
                        zzbvrVar2 = new zzbvp(readStrongBinder4);
                    }
                }
                zzatl.zzc(parcel);
                zzg(zzlVar2, zzbvrVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zzg2 = zzatl.zzg(parcel);
                zzatl.zzc(parcel);
                zzh(zzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
