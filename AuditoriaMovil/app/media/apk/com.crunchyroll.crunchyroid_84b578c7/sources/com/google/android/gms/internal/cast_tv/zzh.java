package com.google.android.gms.internal.cast_tv;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.MediaError;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzh extends zzb implements zzi {
    public zzh() {
        super("com.google.android.gms.cast.tv.cac.internal.IReceiverCacChannelImpl");
    }

    public static zzi zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.tv.cac.internal.IReceiverCacChannelImpl");
        if (queryLocalInterface instanceof zzi) {
            return (zzi) queryLocalInterface;
        }
        return new zzg(iBinder);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzc.zzc(parcel);
                zzc(parcel.readString(), (MediaError) zzc.zza(parcel, MediaError.CREATOR));
            } else {
                String readString = parcel.readString();
                long readLong = parcel.readLong();
                zzc.zzc(parcel);
                zzd(readString, readLong);
            }
        } else {
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            zzeq zzb = zzep.zzb(parcel.readStrongBinder());
            zzc.zzc(parcel);
            zzb(readString2, readString3, zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
