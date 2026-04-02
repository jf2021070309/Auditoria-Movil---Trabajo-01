package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public abstract class zzbxm extends zzadk implements zzbxn {
    public zzbxm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbxn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbxn ? (zzbxn) queryLocalInterface : new zzbxl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbxq zzbxoVar;
        zzbxb zzbxbVar = null;
        zzbxh zzbxfVar = null;
        zzbxb zzbwzVar = null;
        zzbxk zzbxiVar = null;
        zzbxh zzbxfVar2 = null;
        zzbxk zzbxiVar2 = null;
        zzbxe zzbxcVar = null;
        if (i2 == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzadl.zzc(parcel, creator);
            Bundle bundle2 = (Bundle) zzadl.zzc(parcel, creator);
            zzbdl zzbdlVar = (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbxoVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbxoVar = queryLocalInterface instanceof zzbxq ? (zzbxq) queryLocalInterface : new zzbxo(readStrongBinder);
            }
            zze(asInterface, readString, bundle, bundle2, zzbdlVar, zzbxoVar);
            parcel2.writeNoException();
        } else if (i2 == 2) {
            zzbya zzf = zzf();
            parcel2.writeNoException();
            zzadl.zze(parcel2, zzf);
        } else if (i2 == 3) {
            zzbya zzg = zzg();
            parcel2.writeNoException();
            zzadl.zze(parcel2, zzg);
        } else if (i2 == 5) {
            zzbhc zzh = zzh();
            parcel2.writeNoException();
            zzadl.zzf(parcel2, zzh);
        } else if (i2 == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            parcel2.writeNoException();
        } else if (i2 != 11) {
            switch (i2) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    zzbdg zzbdgVar = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbxbVar = queryLocalInterface2 instanceof zzbxb ? (zzbxb) queryLocalInterface2 : new zzbwz(readStrongBinder2);
                    }
                    zzi(readString2, readString3, zzbdgVar, asInterface2, zzbxbVar, zzbvl.zzb(parcel.readStrongBinder()), (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    zzbdg zzbdgVar2 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbxcVar = queryLocalInterface3 instanceof zzbxe ? (zzbxe) queryLocalInterface3 : new zzbxc(readStrongBinder3);
                    }
                    zzj(readString4, readString5, zzbdgVar2, asInterface3, zzbxcVar, zzbvl.zzb(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 15:
                    boolean zzk = zzk(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzadl.zzb(parcel2, zzk);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    zzbdg zzbdgVar3 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbxiVar2 = queryLocalInterface4 instanceof zzbxk ? (zzbxk) queryLocalInterface4 : new zzbxi(readStrongBinder4);
                    }
                    zzl(readString6, readString7, zzbdgVar3, asInterface4, zzbxiVar2, zzbvl.zzb(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 17:
                    boolean zzm = zzm(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzadl.zzb(parcel2, zzm);
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    zzbdg zzbdgVar4 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbxfVar2 = queryLocalInterface5 instanceof zzbxh ? (zzbxh) queryLocalInterface5 : new zzbxf(readStrongBinder5);
                    }
                    zzn(readString8, readString9, zzbdgVar4, asInterface5, zzbxfVar2, zzbvl.zzb(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 19:
                    zzo(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString10 = parcel.readString();
                    String readString11 = parcel.readString();
                    zzbdg zzbdgVar5 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbxiVar = queryLocalInterface6 instanceof zzbxk ? (zzbxk) queryLocalInterface6 : new zzbxi(readStrongBinder6);
                    }
                    zzp(readString10, readString11, zzbdgVar5, asInterface6, zzbxiVar, zzbvl.zzb(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    String readString12 = parcel.readString();
                    String readString13 = parcel.readString();
                    zzbdg zzbdgVar6 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                    IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbwzVar = queryLocalInterface7 instanceof zzbxb ? (zzbxb) queryLocalInterface7 : new zzbwz(readStrongBinder7);
                    }
                    zzq(readString12, readString13, zzbdgVar6, asInterface7, zzbwzVar, zzbvl.zzb(parcel.readStrongBinder()), (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString14 = parcel.readString();
                    String readString15 = parcel.readString();
                    zzbdg zzbdgVar7 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                    IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbxfVar = queryLocalInterface8 instanceof zzbxh ? (zzbxh) queryLocalInterface8 : new zzbxf(readStrongBinder8);
                    }
                    zzr(readString14, readString15, zzbdgVar7, asInterface8, zzbxfVar, zzbvl.zzb(parcel.readStrongBinder()), (zzblv) zzadl.zzc(parcel, zzblv.CREATOR));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            Bundle[] bundleArr = (Bundle[]) parcel.createTypedArray(Bundle.CREATOR);
            parcel2.writeNoException();
        }
        return true;
    }
}
