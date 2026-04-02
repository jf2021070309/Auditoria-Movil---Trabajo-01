package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbrp extends zzatk implements zzbrq {
    public zzbrp() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzbrq zzG(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        if (queryLocalInterface instanceof zzbrq) {
            return (zzbrq) queryLocalInterface;
        }
        return new zzbro(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzatl.zzc(parcel);
                zzk((Bundle) zzatl.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                zzs();
                parcel2.writeNoException();
                return true;
            case 4:
                zzq();
                parcel2.writeNoException();
                return true;
            case 5:
                zzn();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle = (Bundle) zzatl.zza(parcel, Bundle.CREATOR);
                zzatl.zzc(parcel);
                zzr(bundle);
                parcel2.writeNoException();
                zzatl.zze(parcel2, bundle);
                return true;
            case 7:
                zzt();
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzw();
                parcel2.writeNoException();
                return true;
            case 10:
                zzh();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zzF = zzF();
                parcel2.writeNoException();
                int i3 = zzatl.zza;
                parcel2.writeInt(zzF ? 1 : 0);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                Intent intent = (Intent) zzatl.zza(parcel, Intent.CREATOR);
                zzatl.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzj(asInterface);
                parcel2.writeNoException();
                return true;
            case 14:
                zzu();
                parcel2.writeNoException();
                return true;
            case 15:
                int readInt = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                zzatl.zzc(parcel);
                zzo(readInt, createStringArray, createIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
