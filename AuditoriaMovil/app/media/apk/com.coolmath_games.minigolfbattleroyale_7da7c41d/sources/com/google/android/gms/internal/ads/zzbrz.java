package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzbrz extends zzadk implements zzbsa {
    public zzbrz() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbsd zzbsbVar;
        if (i == 3) {
            zzbhc zzb = zzb();
            parcel2.writeNoException();
            zzadl.zzf(parcel2, zzb);
            return true;
        } else if (i == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        } else if (i != 5) {
            if (i == 6) {
                zze(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 7) {
                return false;
            } else {
                zzbme zzf = zzf();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzf);
                return true;
            }
        } else {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbsbVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                if (queryLocalInterface instanceof zzbsd) {
                    zzbsbVar = (zzbsd) queryLocalInterface;
                } else {
                    zzbsbVar = new zzbsb(readStrongBinder);
                }
            }
            zzd(asInterface, zzbsbVar);
            parcel2.writeNoException();
            return true;
        }
    }
}
