package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatk;
import com.google.android.gms.internal.ads.zzatl;
import com.google.android.gms.internal.ads.zzavo;
import com.google.android.gms.internal.ads.zzavp;
import com.google.android.gms.internal.ads.zzbcc;
import com.google.android.gms.internal.ads.zzbcd;
import com.google.android.gms.internal.ads.zzbry;
import com.google.android.gms.internal.ads.zzbrz;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbuw;
import com.google.android.gms.internal.ads.zzbux;
import com.google.zxing.aztec.encoder.Encoder;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbt extends zzatk implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface instanceof zzbu) {
            return (zzbu) queryLocalInterface;
        }
        return new zzbs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbhVar = null;
        zzci zzciVar = null;
        zzbk zzbkVar = null;
        zzdg zzdgVar = null;
        zzby zzbyVar = null;
        zzcf zzcfVar = null;
        zzbe zzbeVar = null;
        zzcb zzcbVar = null;
        switch (i) {
            case 1:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzZ = zzZ();
                parcel2.writeNoException();
                int i3 = zzatl.zza;
                parcel2.writeInt(zzZ ? 1 : 0);
                return true;
            case 4:
                zzatl.zzc(parcel);
                boolean zzaa = zzaa((zzl) zzatl.zza(parcel, zzl.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zzaa ? 1 : 0);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
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
                zzD(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof zzcb) {
                        zzcbVar = (zzcb) queryLocalInterface2;
                    } else {
                        zzcbVar = new zzbz(readStrongBinder2);
                    }
                }
                zzatl.zzc(parcel);
                zzG(zzcbVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzq zzg = zzg();
                parcel2.writeNoException();
                zzatl.zze(parcel2, zzg);
                return true;
            case 13:
                zzatl.zzc(parcel);
                zzF((zzq) zzatl.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbrz zzb = zzbry.zzb(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzM(zzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbsc zzb2 = zzbsb.zzb(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzatl.zzc(parcel);
                zzQ(zzb2, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 19:
                zzbcd zzb3 = zzbcc.zzb(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzO(zzb3);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface3 instanceof zzbe) {
                        zzbeVar = (zzbe) queryLocalInterface3;
                    } else {
                        zzbeVar = new zzbc(readStrongBinder3);
                    }
                }
                zzatl.zzc(parcel);
                zzC(zzbeVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface4 instanceof zzcf) {
                        zzcfVar = (zzcf) queryLocalInterface4;
                    } else {
                        zzcfVar = new zzcf(readStrongBinder4);
                    }
                }
                zzatl.zzc(parcel);
                zzab(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zzg2 = zzatl.zzg(parcel);
                zzatl.zzc(parcel);
                zzN(zzg2);
                parcel2.writeNoException();
                return true;
            case ConnectionResult.API_DISABLED /* 23 */:
                boolean zzY = zzY();
                parcel2.writeNoException();
                int i4 = zzatl.zza;
                parcel2.writeInt(zzY ? 1 : 0);
                return true;
            case 24:
                zzbux zzb4 = zzbuw.zzb(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzS(zzb4);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zzatl.zzc(parcel);
                zzT(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzdq zzl = zzl();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzl);
                return true;
            case 29:
                zzatl.zzc(parcel);
                zzU((zzfl) zzatl.zza(parcel, zzfl.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                zzatl.zzc(parcel);
                zzK((zzdu) zzatl.zza(parcel, zzdu.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 32:
                zzcb zzj = zzj();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzj);
                return true;
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                zzbh zzi = zzi();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzi);
                return true;
            case 34:
                boolean zzg3 = zzatl.zzg(parcel);
                zzatl.zzc(parcel);
                zzL(zzg3);
                parcel2.writeNoException();
                return true;
            case 35:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface5 instanceof zzby) {
                        zzbyVar = (zzby) queryLocalInterface5;
                    } else {
                        zzbyVar = new zzbw(readStrongBinder5);
                    }
                }
                zzatl.zzc(parcel);
                zzE(zzbyVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle zzd = zzd();
                parcel2.writeNoException();
                zzatl.zze(parcel2, zzd);
                return true;
            case 38:
                String readString3 = parcel.readString();
                zzatl.zzc(parcel);
                zzR(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzatl.zzc(parcel);
                zzI((zzw) zzatl.zza(parcel, zzw.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                zzavp zze = zzavo.zze(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzH(zze);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdn zzk = zzk();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzk);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if (queryLocalInterface6 instanceof zzdg) {
                        zzdgVar = (zzdg) queryLocalInterface6;
                    } else {
                        zzdgVar = new zzde(readStrongBinder6);
                    }
                }
                zzatl.zzc(parcel);
                zzP(zzdgVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzl zzlVar = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    if (queryLocalInterface7 instanceof zzbk) {
                        zzbkVar = (zzbk) queryLocalInterface7;
                    } else {
                        zzbkVar = new zzbi(readStrongBinder7);
                    }
                }
                zzatl.zzc(parcel);
                zzy(zzlVar, zzbkVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzW(asInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    if (queryLocalInterface8 instanceof zzci) {
                        zzciVar = (zzci) queryLocalInterface8;
                    } else {
                        zzciVar = new zzcg(readStrongBinder8);
                    }
                }
                zzatl.zzc(parcel);
                zzJ(zzciVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
