package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzbff extends zzadk implements zzbfg {
    public zzbff() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zze((zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR));
            parcel2.writeNoException();
        } else if (i == 2) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else if (i == 3) {
            boolean zzg = zzg();
            parcel2.writeNoException();
            zzadl.zzb(parcel2, zzg);
        } else if (i == 4) {
            String zzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(zzh);
        } else if (i != 5) {
            return false;
        } else {
            zzi((zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
