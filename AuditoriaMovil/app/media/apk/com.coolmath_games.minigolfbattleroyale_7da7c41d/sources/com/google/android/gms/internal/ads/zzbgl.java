package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzbgl extends zzadk implements zzbgm {
    public zzbgl() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzbgm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        if (queryLocalInterface instanceof zzbgm) {
            return (zzbgm) queryLocalInterface;
        }
        return new zzbgk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else if (i != 2) {
            return false;
        } else {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        }
        return true;
    }
}
