package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbny extends zzatk implements zzbnz {
    public zzbny() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbnz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof zzbnz) {
            return (zzbnz) queryLocalInterface;
        }
        return new zzbnx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                zzatl.zzc(parcel);
                zzg(readInt);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof zzbod) {
                        zzbod zzbodVar = (zzbod) queryLocalInterface;
                    }
                }
                zzatl.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzatl.zzc(parcel);
                zzq(readString, readString2);
                break;
            case 10:
                zzbfe.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzatl.zzc(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                zzatl.zzc(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                zzatl.zzc(parcel);
                zzs((zzbvd) zzatl.zza(parcel, zzbvd.CREATOR));
                break;
            case 15:
                zzw();
                break;
            case 16:
                zzbvh zzb = zzbvg.zzb(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzt(zzb);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzatl.zzc(parcel);
                zzj(readInt2);
                break;
            case 18:
                zzu();
                break;
            case 19:
                Bundle bundle = (Bundle) zzatl.zza(parcel, Bundle.CREATOR);
                zzatl.zzc(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String readString3 = parcel.readString();
                zzatl.zzc(parcel);
                zzl(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzatl.zzc(parcel);
                zzi(readInt3, readString4);
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
                zzatl.zzc(parcel);
                zzh((zze) zzatl.zza(parcel, zze.CREATOR));
                break;
            case 24:
                zzatl.zzc(parcel);
                zzk((zze) zzatl.zza(parcel, zze.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
