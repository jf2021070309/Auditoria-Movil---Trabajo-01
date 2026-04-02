package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzatk;
import com.google.android.gms.internal.ads.zzatl;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzbfo;
import com.google.android.gms.internal.ads.zzbfp;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbfy;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzbku;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbp extends zzatk implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbhVar = null;
        zzcf zzcfVar = null;
        switch (i) {
            case 1:
                zzbn zze = zze();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzbh) {
                        zzbhVar = (zzbh) queryLocalInterface;
                    } else {
                        zzbhVar = new zzbf(readStrongBinder);
                    }
                }
                zzatl.zzc(parcel);
                zzl(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbfj zzb = zzbfi.zzb(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzf(zzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbfm zzb2 = zzbfl.zzb(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzg(zzb2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzbfs zzb3 = zzbfr.zzb(parcel.readStrongBinder());
                zzbfp zzb4 = zzbfo.zzb(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzh(readString, zzb3, zzb4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzatl.zzc(parcel);
                zzo((zzbdz) zzatl.zza(parcel, zzbdz.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface2 instanceof zzcf) {
                        zzcfVar = (zzcf) queryLocalInterface2;
                    } else {
                        zzcfVar = new zzcf(readStrongBinder2);
                    }
                }
                zzatl.zzc(parcel);
                zzq(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzatl.zzc(parcel);
                zzj(zzbfv.zzb(parcel.readStrongBinder()), (zzq) zzatl.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                zzatl.zzc(parcel);
                zzp((PublisherAdViewOptions) zzatl.zza(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                zzbfz zzb5 = zzbfy.zzb(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzk(zzb5);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzatl.zzc(parcel);
                zzn((zzbkl) zzatl.zza(parcel, zzbkl.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbku zzb6 = zzbkt.zzb(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzi(zzb6);
                parcel2.writeNoException();
                return true;
            case 15:
                zzatl.zzc(parcel);
                zzm((AdManagerAdViewOptions) zzatl.zza(parcel, AdManagerAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
