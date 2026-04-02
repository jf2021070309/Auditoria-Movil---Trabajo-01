package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzavs extends zzatk implements zzavt {
    public zzavs() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        zzb();
                    } else {
                        zze();
                    }
                } else {
                    zzatl.zzc(parcel);
                    zzd((zze) zzatl.zza(parcel, zze.CREATOR));
                }
            } else {
                zzc();
            }
        } else {
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
