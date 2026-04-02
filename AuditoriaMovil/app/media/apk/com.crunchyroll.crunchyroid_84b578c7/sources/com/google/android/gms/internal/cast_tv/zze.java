package com.google.android.gms.internal.cast_tv;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.tv.media.UserActionRequestData;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zze extends zzb implements zzf {
    public zze() {
        super("com.google.android.gms.cast.tv.cac.internal.IReceiverCacChannel");
    }

    public static zzf zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.tv.cac.internal.IReceiverCacChannel");
        if (queryLocalInterface instanceof zzf) {
            return (zzf) queryLocalInterface;
        }
        return new zzd(iBinder);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return false;
                }
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzc.zzc(parcel);
                zzd(readString, readString2);
                parcel2.writeNoException();
                return true;
            }
            zzeq zzb = zzep.zzb(parcel.readStrongBinder());
            zzc.zzc(parcel);
            zzc(parcel.readString(), (UserActionRequestData) zzc.zza(parcel, UserActionRequestData.CREATOR), zzb);
            parcel2.writeNoException();
            return true;
        }
        List zzb2 = zzb();
        parcel2.writeNoException();
        parcel2.writeList(zzb2);
        return true;
    }
}
