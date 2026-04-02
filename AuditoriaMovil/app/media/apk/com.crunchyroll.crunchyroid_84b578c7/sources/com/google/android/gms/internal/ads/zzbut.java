package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbut extends zzatk implements zzbuu {
    public zzbut() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                zzbux zzbuxVar = null;
                zzbus zzbusVar = null;
                if (i != 3) {
                    if (i != 34) {
                        switch (i) {
                            case 5:
                                boolean zzs = zzs();
                                parcel2.writeNoException();
                                int i3 = zzatl.zza;
                                parcel2.writeInt(zzs ? 1 : 0);
                                break;
                            case 6:
                                zzh();
                                parcel2.writeNoException();
                                break;
                            case 7:
                                zzj();
                                parcel2.writeNoException();
                                break;
                            case 8:
                                zze();
                                parcel2.writeNoException();
                                break;
                            case 9:
                                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzatl.zzc(parcel);
                                zzi(asInterface);
                                parcel2.writeNoException();
                                break;
                            case 10:
                                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzatl.zzc(parcel);
                                zzk(asInterface2);
                                parcel2.writeNoException();
                                break;
                            case 11:
                                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzatl.zzc(parcel);
                                zzf(asInterface3);
                                parcel2.writeNoException();
                                break;
                            case 12:
                                String zzd = zzd();
                                parcel2.writeNoException();
                                parcel2.writeString(zzd);
                                break;
                            case 13:
                                String readString = parcel.readString();
                                zzatl.zzc(parcel);
                                zzp(readString);
                                parcel2.writeNoException();
                                break;
                            case 14:
                                zzby zzb = zzbx.zzb(parcel.readStrongBinder());
                                zzatl.zzc(parcel);
                                zzl(zzb);
                                parcel2.writeNoException();
                                break;
                            case 15:
                                Bundle zzb2 = zzb();
                                parcel2.writeNoException();
                                zzatl.zze(parcel2, zzb2);
                                break;
                            case 16:
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                if (readStrongBinder != null) {
                                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                                    if (queryLocalInterface instanceof zzbus) {
                                        zzbusVar = (zzbus) queryLocalInterface;
                                    } else {
                                        zzbusVar = new zzbus(readStrongBinder);
                                    }
                                }
                                zzatl.zzc(parcel);
                                zzu(zzbusVar);
                                parcel2.writeNoException();
                                break;
                            case 17:
                                parcel.readString();
                                zzatl.zzc(parcel);
                                parcel2.writeNoException();
                                break;
                            case 18:
                                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzatl.zzc(parcel);
                                zzr(asInterface4);
                                parcel2.writeNoException();
                                break;
                            case 19:
                                String readString2 = parcel.readString();
                                zzatl.zzc(parcel);
                                zzm(readString2);
                                parcel2.writeNoException();
                                break;
                            case 20:
                                boolean zzt = zzt();
                                parcel2.writeNoException();
                                int i4 = zzatl.zza;
                                parcel2.writeInt(zzt ? 1 : 0);
                                break;
                            case 21:
                                zzdn zzc = zzc();
                                parcel2.writeNoException();
                                zzatl.zzf(parcel2, zzc);
                                break;
                            default:
                                return false;
                        }
                    } else {
                        boolean zzg = zzatl.zzg(parcel);
                        zzatl.zzc(parcel);
                        zzn(zzg);
                        parcel2.writeNoException();
                    }
                } else {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                        if (queryLocalInterface2 instanceof zzbux) {
                            zzbuxVar = (zzbux) queryLocalInterface2;
                        } else {
                            zzbuxVar = new zzbuv(readStrongBinder2);
                        }
                    }
                    zzatl.zzc(parcel);
                    zzo(zzbuxVar);
                    parcel2.writeNoException();
                }
            } else {
                zzq();
                parcel2.writeNoException();
            }
        } else {
            zzatl.zzc(parcel);
            zzg((zzbuy) zzatl.zza(parcel, zzbuy.CREATOR));
            parcel2.writeNoException();
        }
        return true;
    }
}
