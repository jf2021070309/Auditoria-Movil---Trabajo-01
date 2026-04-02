package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public abstract class zzccb extends zzadk implements zzccc {
    public zzccb() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zzb((zzccg) zzadl.zzc(parcel, zzccg.CREATOR));
            parcel2.writeNoException();
        } else if (i2 != 2) {
            zzccf zzccfVar = null;
            zzcca zzccaVar = null;
            if (i2 == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzccfVar = queryLocalInterface instanceof zzccf ? (zzccf) queryLocalInterface : new zzccd(readStrongBinder);
                }
                zzd(zzccfVar);
                parcel2.writeNoException();
            } else if (i2 != 34) {
                switch (i2) {
                    case 5:
                        boolean zze = zze();
                        parcel2.writeNoException();
                        zzadl.zzb(parcel2, zze);
                        break;
                    case 6:
                        zzf();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzg();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        zzi(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 10:
                        zzj(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 11:
                        zzk(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String zzl = zzl();
                        parcel2.writeNoException();
                        parcel2.writeString(zzl);
                        break;
                    case 13:
                        zzm(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 14:
                        zzn(zzbfq.zzb(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle zzo = zzo();
                        parcel2.writeNoException();
                        zzadl.zze(parcel2, zzo);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzccaVar = queryLocalInterface2 instanceof zzcca ? (zzcca) queryLocalInterface2 : new zzcca(readStrongBinder2);
                        }
                        zzu(zzccaVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        parcel2.writeNoException();
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        zzp(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 19:
                        zzq(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zzs = zzs();
                        parcel2.writeNoException();
                        zzadl.zzb(parcel2, zzs);
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        zzbgz zzt = zzt();
                        parcel2.writeNoException();
                        zzadl.zzf(parcel2, zzt);
                        break;
                    default:
                        return false;
                }
            } else {
                zzr(zzadl.zza(parcel));
                parcel2.writeNoException();
            }
        } else {
            zzc();
            parcel2.writeNoException();
        }
        return true;
    }
}
