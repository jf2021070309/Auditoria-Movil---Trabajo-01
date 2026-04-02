package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbnv extends zzatk implements zzbnw {
    public zzbnv() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbnz zzbnzVar = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzatl.zza(parcel, zzq.CREATOR);
                zzl zzlVar = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface instanceof zzbnz) {
                        zzbnzVar = (zzbnz) queryLocalInterface;
                    } else {
                        zzbnzVar = new zzbnx(readStrongBinder);
                    }
                }
                zzbnz zzbnzVar2 = zzbnzVar;
                zzatl.zzc(parcel);
                zzu(asInterface, zzqVar, zzlVar, readString, zzbnzVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzn);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzl zzlVar2 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof zzbnz) {
                        zzbnzVar = (zzbnz) queryLocalInterface2;
                    } else {
                        zzbnzVar = new zzbnx(readStrongBinder2);
                    }
                }
                zzatl.zzc(parcel);
                zzx(asInterface2, zzlVar2, readString2, zzbnzVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzI();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzatl.zza(parcel, zzq.CREATOR);
                zzl zzlVar3 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface3 instanceof zzbnz) {
                        zzbnzVar = (zzbnz) queryLocalInterface3;
                    } else {
                        zzbnzVar = new zzbnx(readStrongBinder3);
                    }
                }
                zzbnz zzbnzVar3 = zzbnzVar;
                zzatl.zzc(parcel);
                zzv(asInterface3, zzqVar2, zzlVar3, readString3, readString4, zzbnzVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzl zzlVar4 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof zzbnz) {
                        zzbnzVar = (zzbnz) queryLocalInterface4;
                    } else {
                        zzbnzVar = new zzbnx(readStrongBinder4);
                    }
                }
                zzbnz zzbnzVar4 = zzbnzVar;
                zzatl.zzc(parcel);
                zzy(asInterface4, zzlVar4, readString5, readString6, zzbnzVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzl zzlVar5 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                String readString7 = parcel.readString();
                zzbvc zzb = zzbvb.zzb(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzatl.zzc(parcel);
                zzp(asInterface5, zzlVar5, readString7, zzb, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                String readString9 = parcel.readString();
                zzatl.zzc(parcel);
                zzs((zzl) zzatl.zza(parcel, zzl.CREATOR), readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzN = zzN();
                parcel2.writeNoException();
                int i3 = zzatl.zza;
                parcel2.writeInt(zzN ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzl zzlVar6 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface5 instanceof zzbnz) {
                        zzbnzVar = (zzbnz) queryLocalInterface5;
                    } else {
                        zzbnzVar = new zzbnx(readStrongBinder5);
                    }
                }
                zzbnz zzbnzVar5 = zzbnzVar;
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzatl.zzc(parcel);
                zzz(asInterface6, zzlVar6, readString10, readString11, zzbnzVar5, (zzbdz) zzatl.zza(parcel, zzbdz.CREATOR), createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzatl.zzf(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzatl.zzf(parcel2, null);
                return true;
            case 17:
                Bundle zze = zze();
                parcel2.writeNoException();
                zzatl.zze(parcel2, zze);
                return true;
            case 18:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzatl.zze(parcel2, zzf);
                return true;
            case 19:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                zzatl.zze(parcel2, zzg);
                return true;
            case 20:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzatl.zzc(parcel);
                zzB((zzl) zzatl.zza(parcel, zzl.CREATOR), readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzD(asInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i4 = zzatl.zza;
                parcel2.writeInt(0);
                return true;
            case ConnectionResult.API_DISABLED /* 23 */:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvc zzb2 = zzbvb.zzb(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzatl.zzc(parcel);
                zzr(asInterface8, zzb2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbff zzi = zzi();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzi);
                return true;
            case 25:
                boolean zzg2 = zzatl.zzg(parcel);
                zzatl.zzc(parcel);
                zzG(zzg2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzdq zzh = zzh();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzh);
                return true;
            case 27:
                zzboi zzk = zzk();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzk);
                return true;
            case 28:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzl zzlVar7 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof zzbnz) {
                        zzbnzVar = (zzbnz) queryLocalInterface6;
                    } else {
                        zzbnzVar = new zzbnx(readStrongBinder6);
                    }
                }
                zzatl.zzc(parcel);
                zzA(asInterface9, zzlVar7, readString14, zzbnzVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzK(asInterface10);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbkd zzb3 = zzbkc.zzb(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbkj.CREATOR);
                zzatl.zzc(parcel);
                zzq(asInterface11, zzb3, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzl zzlVar8 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface7 instanceof zzbnz) {
                        zzbnzVar = (zzbnz) queryLocalInterface7;
                    } else {
                        zzbnzVar = new zzbnx(readStrongBinder7);
                    }
                }
                zzatl.zzc(parcel);
                zzC(asInterface12, zzlVar8, readString15, zzbnzVar);
                parcel2.writeNoException();
                return true;
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                zzbqe zzl = zzl();
                parcel2.writeNoException();
                zzatl.zze(parcel2, zzl);
                return true;
            case 34:
                zzbqe zzm = zzm();
                parcel2.writeNoException();
                zzatl.zze(parcel2, zzm);
                return true;
            case 35:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzatl.zza(parcel, zzq.CREATOR);
                zzl zzlVar9 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface8 instanceof zzbnz) {
                        zzbnzVar = (zzbnz) queryLocalInterface8;
                    } else {
                        zzbnzVar = new zzbnx(readStrongBinder8);
                    }
                }
                zzbnz zzbnzVar6 = zzbnzVar;
                zzatl.zzc(parcel);
                zzw(asInterface13, zzqVar3, zzlVar9, readString16, readString17, zzbnzVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                zzboc zzj = zzj();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzj);
                return true;
            case 37:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzJ(asInterface14);
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzl zzlVar10 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface9 instanceof zzbnz) {
                        zzbnzVar = (zzbnz) queryLocalInterface9;
                    } else {
                        zzbnzVar = new zzbnx(readStrongBinder9);
                    }
                }
                zzatl.zzc(parcel);
                zzt(asInterface15, zzlVar10, readString18, zzbnzVar);
                parcel2.writeNoException();
                return true;
            case 39:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzH(asInterface16);
                parcel2.writeNoException();
                return true;
        }
    }
}
