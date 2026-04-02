package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatk;
import com.google.android.gms.internal.ads.zzatl;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public abstract class zzca extends zzatk implements zzcb {
    public zzca() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static zzcb zzd(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        if (queryLocalInterface instanceof zzcb) {
            return (zzcb) queryLocalInterface;
        }
        return new zzbz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzatl.zzc(parcel);
            zzc(readString, readString2);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
