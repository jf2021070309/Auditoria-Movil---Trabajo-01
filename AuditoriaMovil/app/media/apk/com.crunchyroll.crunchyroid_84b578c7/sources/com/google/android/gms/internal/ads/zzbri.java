package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbri extends zzatk implements zzbrj {
    public zzbri() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbrj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        if (queryLocalInterface instanceof zzbrj) {
            return (zzbrj) queryLocalInterface;
        }
        return new zzbrh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzf();
            } else {
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzatl.zzc(parcel);
                zzg(asInterface, readString, readString2);
            }
        } else {
            zzatl.zzc(parcel);
            zze((Intent) zzatl.zza(parcel, Intent.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
