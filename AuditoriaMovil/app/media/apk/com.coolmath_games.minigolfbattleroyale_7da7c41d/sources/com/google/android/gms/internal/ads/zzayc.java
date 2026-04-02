package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzayc extends zzadk implements zzayd {
    public zzayc() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzc();
        } else if (i == 2) {
            zzd();
        } else if (i == 3) {
            zze((zzbcz) zzadl.zzc(parcel, zzbcz.CREATOR));
        } else if (i == 4) {
            zzf();
        } else if (i != 5) {
            return false;
        } else {
            zzg();
        }
        parcel2.writeNoException();
        return true;
    }
}
