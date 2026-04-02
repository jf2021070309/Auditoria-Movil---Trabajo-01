package com.google.android.gms.internal.cast_tv;

import android.content.Intent;
import android.media.session.MediaSession;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.tv.media.StoreSessionResponseData;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzq extends zzb implements zzr {
    public zzq() {
        super("com.google.android.gms.cast.tv.media.internal.IReceiverMediaControlChannelImpl");
    }

    public static zzr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.tv.media.internal.IReceiverMediaControlChannelImpl");
        if (queryLocalInterface instanceof zzr) {
            return (zzr) queryLocalInterface;
        }
        return new zzp(iBinder);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzeq zzb = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzk(readString, readString2, zzb);
                parcel2.writeNoException();
                return true;
            case 2:
                zzc.zzc(parcel);
                boolean zzp = zzp((Intent) zzc.zza(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zzp ? 1 : 0);
                return true;
            case 3:
                zzc.zzc(parcel);
                zzo((MediaSession.Token) zzc.zza(parcel, MediaSession.Token.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                int readInt = parcel.readInt();
                zzc.zzc(parcel);
                zzg(readInt);
                parcel2.writeNoException();
                return true;
            case 5:
                zzc.zzc(parcel);
                zzl(parcel.readString(), (com.google.android.gms.cast.tv.media.zzo) zzc.zza(parcel, com.google.android.gms.cast.tv.media.zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 6:
                zzc.zzc(parcel);
                zzm(parcel.readString(), (com.google.android.gms.cast.tv.media.zzr) zzc.zza(parcel, com.google.android.gms.cast.tv.media.zzr.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                zzc.zzc(parcel);
                zzj((com.google.android.gms.cast.tv.media.zzm) zzc.zza(parcel, com.google.android.gms.cast.tv.media.zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zzc.zzc(parcel);
                zzi(parcel.readString(), (MediaError) zzc.zza(parcel, MediaError.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                zzc.zzc(parcel);
                zzh((MediaLoadRequestData) zzc.zza(parcel, MediaLoadRequestData.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                MediaStatus zzf = zzf();
                parcel2.writeNoException();
                zzc.zze(parcel2, zzf);
                return true;
            case 11:
                MediaStatus zze = zze();
                parcel2.writeNoException();
                zzc.zze(parcel2, zze);
                return true;
            case 12:
                zzc.zzc(parcel);
                zzn(parcel.readString(), (StoreSessionResponseData) zzc.zza(parcel, StoreSessionResponseData.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
