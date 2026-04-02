package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzbfi extends zzadk implements zzbfj {
    public zzbfi() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbfa zzbfaVar = null;
        zzbfy zzbfyVar = null;
        switch (i) {
            case 1:
                zzbfg zze = zze();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzbfa) {
                        zzbfaVar = (zzbfa) queryLocalInterface;
                    } else {
                        zzbfaVar = new zzbey(readStrongBinder);
                    }
                }
                zzf(zzbfaVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzg(zzbne.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                zzh(zzbnh.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                zzi(parcel.readString(), zzbnn.zzb(parcel.readStrongBinder()), zzbnk.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                zzj((zzblv) zzadl.zzc(parcel, zzblv.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface2 instanceof zzbfy) {
                        zzbfyVar = (zzbfy) queryLocalInterface2;
                    } else {
                        zzbfyVar = new zzbfy(readStrongBinder2);
                    }
                }
                zzq(zzbfyVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzk(zzbnr.zzb(parcel.readStrongBinder()), (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                zzl((PublisherAdViewOptions) zzadl.zzc(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                zzm(zzbnu.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzn((zzbrx) zzadl.zzc(parcel, zzbrx.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzo(zzbsf.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                zzp((AdManagerAdViewOptions) zzadl.zzc(parcel, AdManagerAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
