package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzbxg extends zzadk implements zzbxh {
    public zzbxg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zze(zzbvu.zzb(parcel.readStrongBinder()));
        } else if (i == 2) {
            zzf(parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            zzg((zzbcz) zzadl.zzc(parcel, zzbcz.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
