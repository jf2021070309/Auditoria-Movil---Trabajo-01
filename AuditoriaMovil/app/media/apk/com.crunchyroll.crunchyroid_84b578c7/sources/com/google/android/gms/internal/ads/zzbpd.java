package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbpd extends zzatk implements zzbpe {
    public zzbpd() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    zzboc zzb = zzbob.zzb(parcel.readStrongBinder());
                    zzatl.zzc(parcel);
                    zzh(zzb);
                } else {
                    zzatl.zzc(parcel);
                    zzf((zze) zzatl.zza(parcel, zze.CREATOR));
                }
            } else {
                String readString = parcel.readString();
                zzatl.zzc(parcel);
                zze(readString);
            }
        } else {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzatl.zzc(parcel);
            zzg(asInterface);
        }
        parcel2.writeNoException();
        return true;
    }
}
