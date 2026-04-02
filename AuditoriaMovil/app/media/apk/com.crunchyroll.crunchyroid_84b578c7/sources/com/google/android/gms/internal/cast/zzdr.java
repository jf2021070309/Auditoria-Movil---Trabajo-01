package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public abstract class zzdr extends zzb implements zzds {
    public zzdr() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        boolean zzf = zzc.zzf(parcel);
                        zzc.zzb(parcel);
                        zze(zzf);
                    } else {
                        zzc();
                    }
                } else {
                    zzf();
                }
            } else {
                int readInt = parcel.readInt();
                zzc.zzb(parcel);
                zzd(readInt);
            }
        } else {
            zzc.zzb(parcel);
            zzb(parcel.readInt(), parcel.readInt(), (Surface) zzc.zza(parcel, Surface.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
