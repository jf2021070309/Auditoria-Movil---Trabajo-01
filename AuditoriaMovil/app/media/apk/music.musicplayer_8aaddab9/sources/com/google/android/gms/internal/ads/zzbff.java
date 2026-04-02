package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class zzbff extends zzadk implements zzbfg {
    public zzbff() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zze((zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR));
            parcel2.writeNoException();
        } else if (i2 == 2) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else if (i2 == 3) {
            boolean zzg = zzg();
            parcel2.writeNoException();
            zzadl.zzb(parcel2, zzg);
        } else if (i2 == 4) {
            String zzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(zzh);
        } else if (i2 != 5) {
            return false;
        } else {
            zzi((zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
