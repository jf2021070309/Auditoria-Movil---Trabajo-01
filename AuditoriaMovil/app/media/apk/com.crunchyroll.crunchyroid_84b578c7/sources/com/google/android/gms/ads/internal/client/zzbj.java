package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatk;
import com.google.android.gms.internal.ads.zzatl;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbj extends zzatk implements zzbk {
    public zzbj() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zzatl.zzc(parcel);
            zzb((zze) zzatl.zza(parcel, zze.CREATOR));
        } else {
            zzc();
        }
        parcel2.writeNoException();
        return true;
    }
}
