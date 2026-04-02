package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbvm extends zzatk implements zzbvn {
    public zzbvm() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbvh zzbvfVar;
        switch (i) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
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
                zzatl.zzc(parcel);
                zzk(zzbvfVar);
                break;
            case 4:
                int readInt = parcel.readInt();
                zzatl.zzc(parcel);
                zzh(readInt);
                break;
            case 5:
                zzatl.zzc(parcel);
                zzi((zze) zzatl.zza(parcel, zze.CREATOR));
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
