package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbgh extends zzatk implements zzbgi {
    public zzbgh() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbgf zzbgdVar;
        switch (i) {
            case 2:
                String zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 3:
                List zzu = zzu();
                parcel2.writeNoException();
                parcel2.writeList(zzu);
                return true;
            case 4:
                String zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(zzo);
                return true;
            case 5:
                zzbel zzk = zzk();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzk);
                return true;
            case 6:
                String zzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzp);
                return true;
            case 7:
                String zzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzn);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 10:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 11:
                zzdq zzh = zzh();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzh);
                return true;
            case 12:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                zzbed zzi = zzi();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzi);
                return true;
            case 15:
                zzatl.zzc(parcel);
                zzz((Bundle) zzatl.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                zzatl.zzc(parcel);
                boolean zzI = zzI((Bundle) zzatl.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zzI ? 1 : 0);
                return true;
            case 17:
                zzatl.zzc(parcel);
                zzB((Bundle) zzatl.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                IObjectWrapper zzm = zzm();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzm);
                return true;
            case 19:
                IObjectWrapper zzl = zzl();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzl);
                return true;
            case 20:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzatl.zze(parcel2, zzf);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbgdVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    if (queryLocalInterface instanceof zzbgf) {
                        zzbgdVar = (zzbgf) queryLocalInterface;
                    } else {
                        zzbgdVar = new zzbgd(readStrongBinder);
                    }
                }
                zzatl.zzc(parcel);
                zzF(zzbgdVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzw();
                parcel2.writeNoException();
                return true;
            case ConnectionResult.API_DISABLED /* 23 */:
                List zzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(zzv);
                return true;
            case 24:
                boolean zzH = zzH();
                parcel2.writeNoException();
                int i3 = zzatl.zza;
                parcel2.writeInt(zzH ? 1 : 0);
                return true;
            case 25:
                zzcw zzb = zzcv.zzb(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzy(zzb);
                parcel2.writeNoException();
                return true;
            case 26:
                zzcs zzb2 = zzcr.zzb(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzD(zzb2);
                parcel2.writeNoException();
                return true;
            case 27:
                zzC();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                zzbei zzj = zzj();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzj);
                return true;
            case 30:
                boolean zzG = zzG();
                parcel2.writeNoException();
                int i4 = zzatl.zza;
                parcel2.writeInt(zzG ? 1 : 0);
                return true;
            case 31:
                zzdn zzg = zzg();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzg);
                return true;
            case 32:
                zzdg zzb3 = zzdf.zzb(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzE(zzb3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
