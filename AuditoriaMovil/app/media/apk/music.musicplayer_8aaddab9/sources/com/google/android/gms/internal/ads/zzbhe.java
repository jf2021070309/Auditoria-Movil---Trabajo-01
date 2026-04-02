package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class zzbhe extends zzadk implements zzbhf {
    public zzbhe() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zze();
        } else if (i2 == 2) {
            zzf();
        } else if (i2 == 3) {
            zzg();
        } else if (i2 == 4) {
            zzh();
        } else if (i2 != 5) {
            return false;
        } else {
            zzi(zzadl.zza(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
