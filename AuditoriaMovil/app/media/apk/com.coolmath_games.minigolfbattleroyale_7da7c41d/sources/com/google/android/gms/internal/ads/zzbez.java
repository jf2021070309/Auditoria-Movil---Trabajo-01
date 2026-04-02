package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzbez extends zzadk implements zzbfa {
    public zzbez() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzb();
                break;
            case 2:
                zzc(parcel.readInt());
                break;
            case 3:
                break;
            case 4:
                zzf();
                break;
            case 5:
                zzg();
                break;
            case 6:
                zzh();
                break;
            case 7:
                zzi();
                break;
            case 8:
                zzd((zzbcz) zzadl.zzc(parcel, zzbcz.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
