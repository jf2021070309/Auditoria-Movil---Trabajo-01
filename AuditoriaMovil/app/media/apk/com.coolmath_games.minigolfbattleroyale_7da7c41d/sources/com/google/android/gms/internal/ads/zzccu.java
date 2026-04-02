package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzccu extends zzadk implements zzccv {
    public zzccu() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzccp zzccnVar;
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzccnVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    if (queryLocalInterface instanceof zzccp) {
                        zzccnVar = (zzccp) queryLocalInterface;
                    } else {
                        zzccnVar = new zzccn(readStrongBinder);
                    }
                }
                zzg(zzccnVar);
                break;
            case 4:
                zzh(parcel.readInt());
                break;
            case 5:
                zzi((zzbcz) zzadl.zzc(parcel, zzbcz.CREATOR));
                break;
            case 6:
                zzj();
                break;
            case 7:
                zzk();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
