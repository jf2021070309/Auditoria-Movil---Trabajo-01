package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzbhb extends zzadk implements zzbhc {
    public zzbhb() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzbhc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        if (queryLocalInterface instanceof zzbhc) {
            return (zzbhc) queryLocalInterface;
        }
        return new zzbha(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbhf zzbhdVar;
        switch (i) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                zzf();
                parcel2.writeNoException();
                return true;
            case 3:
                zzg(zzadl.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zzh = zzh();
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zzh);
                return true;
            case 5:
                int zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeInt(zzi);
                return true;
            case 6:
                float zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeFloat(zzj);
                return true;
            case 7:
                float zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(zzk);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbhdVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    if (queryLocalInterface instanceof zzbhf) {
                        zzbhdVar = (zzbhf) queryLocalInterface;
                    } else {
                        zzbhdVar = new zzbhd(readStrongBinder);
                    }
                }
                zzl(zzbhdVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeFloat(zzm);
                return true;
            case 10:
                boolean zzn = zzn();
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zzn);
                return true;
            case 11:
                zzbhf zzo = zzo();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzo);
                return true;
            case 12:
                boolean zzp = zzp();
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zzp);
                return true;
            case 13:
                zzq();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
