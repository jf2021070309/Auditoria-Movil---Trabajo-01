package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzavo extends zzatk implements zzavp {
    public zzavo() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzavp zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        if (queryLocalInterface instanceof zzavp) {
            return (zzavp) queryLocalInterface;
        }
        return new zzavn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzavm zzavkVar;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzatl.zzc(parcel);
                zzc((zze) zzatl.zza(parcel, zze.CREATOR));
            } else {
                parcel.readInt();
                zzatl.zzc(parcel);
            }
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzavkVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                if (queryLocalInterface instanceof zzavm) {
                    zzavkVar = (zzavm) queryLocalInterface;
                } else {
                    zzavkVar = new zzavk(readStrongBinder);
                }
            }
            zzatl.zzc(parcel);
            zzd(zzavkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
