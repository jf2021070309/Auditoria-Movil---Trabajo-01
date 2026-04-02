package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzbvi extends zzadk implements zzbvj {
    public zzbvi() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbvm zzbvmVar = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdl zzbdlVar = (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR);
                zzbdg zzbdgVar = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface instanceof zzbvm) {
                        zzbvmVar = (zzbvm) queryLocalInterface;
                    } else {
                        zzbvmVar = new zzbvk(readStrongBinder);
                    }
                }
                zze(asInterface, zzbdlVar, zzbdgVar, readString, zzbvmVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzf = zzf();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzf);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdg zzbdgVar2 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof zzbvm) {
                        zzbvmVar = (zzbvm) queryLocalInterface2;
                    } else {
                        zzbvmVar = new zzbvk(readStrongBinder2);
                    }
                }
                zzg(asInterface2, zzbdgVar2, readString2, zzbvmVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdl zzbdlVar2 = (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR);
                zzbdg zzbdgVar3 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface3 instanceof zzbvm) {
                        zzbvmVar = (zzbvm) queryLocalInterface3;
                    } else {
                        zzbvmVar = new zzbvk(readStrongBinder3);
                    }
                }
                zzj(asInterface3, zzbdlVar2, zzbdgVar3, readString3, readString4, zzbvmVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdg zzbdgVar4 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof zzbvm) {
                        zzbvmVar = (zzbvm) queryLocalInterface4;
                    } else {
                        zzbvmVar = new zzbvk(readStrongBinder4);
                    }
                }
                zzk(asInterface4, zzbdgVar4, readString5, readString6, zzbvmVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzm();
                parcel2.writeNoException();
                return true;
            case 10:
                zzn(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR), parcel.readString(), zzccj.zzb(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                zzo((zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzq = zzq();
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zzq);
                return true;
            case 14:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdg zzbdgVar5 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface5 instanceof zzbvm) {
                        zzbvmVar = (zzbvm) queryLocalInterface5;
                    } else {
                        zzbvmVar = new zzbvk(readStrongBinder5);
                    }
                }
                zzr(asInterface5, zzbdgVar5, readString7, readString8, zzbvmVar, (zzblv) zzadl.zzc(parcel, zzblv.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzadl.zzf(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzadl.zzf(parcel2, null);
                return true;
            case 17:
                Bundle zzs = zzs();
                parcel2.writeNoException();
                zzadl.zze(parcel2, zzs);
                return true;
            case 18:
                Bundle zzt = zzt();
                parcel2.writeNoException();
                zzadl.zze(parcel2, zzt);
                return true;
            case 19:
                Bundle zzu = zzu();
                parcel2.writeNoException();
                zzadl.zze(parcel2, zzu);
                return true;
            case 20:
                zzv((zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                zzw(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                zzadl.zzb(parcel2, false);
                return true;
            case 23:
                zzy(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzccj.zzb(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                zzbnb zzz = zzz();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzz);
                return true;
            case 25:
                zzA(zzadl.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                zzbhc zzB = zzB();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzB);
                return true;
            case 27:
                zzbvv zzC = zzC();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzC);
                return true;
            case 28:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdg zzbdgVar6 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                String readString9 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof zzbvm) {
                        zzbvmVar = (zzbvm) queryLocalInterface6;
                    } else {
                        zzbvmVar = new zzbvk(readStrongBinder6);
                    }
                }
                zzD(asInterface6, zzbdgVar6, readString9, zzbvmVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                zzE(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                zzF(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzbro.zzb(parcel.readStrongBinder()), parcel.createTypedArrayList(zzbrv.CREATOR));
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdg zzbdgVar7 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                String readString10 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface7 instanceof zzbvm) {
                        zzbvmVar = (zzbvm) queryLocalInterface7;
                    } else {
                        zzbvmVar = new zzbvk(readStrongBinder7);
                    }
                }
                zzG(asInterface7, zzbdgVar7, readString10, zzbvmVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbya zzH = zzH();
                parcel2.writeNoException();
                zzadl.zze(parcel2, zzH);
                return true;
            case 34:
                zzbya zzI = zzI();
                parcel2.writeNoException();
                zzadl.zze(parcel2, zzI);
                return true;
            case 35:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdl zzbdlVar3 = (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR);
                zzbdg zzbdgVar8 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface8 instanceof zzbvm) {
                        zzbvmVar = (zzbvm) queryLocalInterface8;
                    } else {
                        zzbvmVar = new zzbvk(readStrongBinder8);
                    }
                }
                zzJ(asInterface8, zzbdlVar3, zzbdgVar8, readString11, readString12, zzbvmVar);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbvp zzK = zzK();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzK);
                return true;
            case 37:
                zzL(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
