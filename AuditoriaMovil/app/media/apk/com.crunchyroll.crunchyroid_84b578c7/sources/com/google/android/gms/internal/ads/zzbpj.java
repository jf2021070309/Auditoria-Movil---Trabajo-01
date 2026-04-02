package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbpj extends zzatk implements zzbpk {
    public zzbpj() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzatl.zzc(parcel);
                zzf((zze) zzatl.zza(parcel, zze.CREATOR));
            } else {
                String readString = parcel.readString();
                zzatl.zzc(parcel);
                zze(readString);
            }
        } else {
            zzboi zzb = zzboh.zzb(parcel.readStrongBinder());
            zzatl.zzc(parcel);
            zzg(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
