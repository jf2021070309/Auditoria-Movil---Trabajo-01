package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatk;
import com.google.android.gms.internal.ads.zzatl;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbja;
import com.google.android.gms.internal.ads.zzbjd;
import com.google.android.gms.internal.ads.zzbns;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbrj;
import com.google.android.gms.internal.ads.zzbrq;
import com.google.android.gms.internal.ads.zzbuu;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbyf;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public abstract class zzcd extends zzatk implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzatl.zza(parcel, zzq.CREATOR);
                String readString = parcel.readString();
                zzbnt zzf = zzbns.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzatl.zzc(parcel);
                zzbu zzd = zzd(asInterface, zzqVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzd);
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzatl.zza(parcel, zzq.CREATOR);
                String readString2 = parcel.readString();
                zzbnt zzf2 = zzbns.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzatl.zzc(parcel);
                zzbu zze = zze(asInterface2, zzqVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zze);
                return true;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbnt zzf3 = zzbns.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzatl.zzc(parcel);
                zzbq zzb = zzb(asInterface3, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, null);
                return true;
            case 5:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzbep zzi = zzi(asInterface4, asInterface5);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzi);
                return true;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnt zzf4 = zzbns.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzatl.zzc(parcel);
                zzbuu zzn = zzn(asInterface6, zzf4, readInt4);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzn);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, null);
                return true;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzbrq zzm = zzm(asInterface7);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzm);
                return true;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzatl.zzc(parcel);
                zzco zzg = zzg(asInterface8, readInt5);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzg);
                return true;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzatl.zzc(parcel);
                zzbu zzf5 = zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzatl.zza(parcel, zzq.CREATOR), readString4, readInt6);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzf5);
                return true;
            case 11:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzbev zzj = zzj(asInterface9, asInterface10, asInterface11);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzj);
                return true;
            case 12:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbnt zzf6 = zzbns.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzatl.zzc(parcel);
                zzbvk zzo = zzo(asInterface12, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzo);
                return true;
            case 13:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzatl.zza(parcel, zzq.CREATOR);
                String readString6 = parcel.readString();
                zzbnt zzf7 = zzbns.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzatl.zzc(parcel);
                zzbu zzc = zzc(asInterface13, zzqVar3, readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzc);
                return true;
            case 14:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnt zzf8 = zzbns.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzatl.zzc(parcel);
                zzbyf zzp = zzp(asInterface14, zzf8, readInt9);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzp);
                return true;
            case 15:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnt zzf9 = zzbns.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzatl.zzc(parcel);
                zzbrj zzl = zzl(asInterface15, zzf9, readInt10);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzl);
                return true;
            case 16:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnt zzf10 = zzbns.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbja zzc2 = zzbiz.zzc(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzbjd zzk = zzk(asInterface16, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzk);
                return true;
            case 17:
                IObjectWrapper asInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnt zzf11 = zzbns.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzatl.zzc(parcel);
                zzdj zzh = zzh(asInterface17, zzf11, readInt12);
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzh);
                return true;
            default:
                return false;
        }
    }
}
