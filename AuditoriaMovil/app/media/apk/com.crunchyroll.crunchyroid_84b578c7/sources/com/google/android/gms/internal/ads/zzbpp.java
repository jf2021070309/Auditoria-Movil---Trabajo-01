package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbpp extends zzatk implements zzbpq {
    public zzbpp() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbpq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzbpq) {
            return (zzbpq) queryLocalInterface;
        }
        return new zzbpo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbpt zzbptVar = null;
        zzbpb zzbozVar = null;
        zzbpk zzbpiVar = null;
        zzbpe zzbpcVar = null;
        zzbpn zzbplVar = null;
        zzbpk zzbpiVar2 = null;
        zzbpn zzbplVar2 = null;
        zzbph zzbpfVar = null;
        zzbpe zzbpcVar2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 10) {
                            if (i != 11) {
                                switch (i) {
                                    case 13:
                                        String readString = parcel.readString();
                                        String readString2 = parcel.readString();
                                        zzl zzlVar = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                                        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder = parcel.readStrongBinder();
                                        if (readStrongBinder != null) {
                                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                            if (queryLocalInterface instanceof zzbpe) {
                                                zzbpcVar2 = (zzbpe) queryLocalInterface;
                                            } else {
                                                zzbpcVar2 = new zzbpc(readStrongBinder);
                                            }
                                        }
                                        zzbpe zzbpeVar = zzbpcVar2;
                                        zzatl.zzc(parcel);
                                        zzj(readString, readString2, zzlVar, asInterface, zzbpeVar, zzbny.zzb(parcel.readStrongBinder()), (zzq) zzatl.zza(parcel, zzq.CREATOR));
                                        parcel2.writeNoException();
                                        break;
                                    case 14:
                                        String readString3 = parcel.readString();
                                        String readString4 = parcel.readString();
                                        zzl zzlVar2 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                                        IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                                        if (readStrongBinder2 != null) {
                                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                            if (queryLocalInterface2 instanceof zzbph) {
                                                zzbpfVar = (zzbph) queryLocalInterface2;
                                            } else {
                                                zzbpfVar = new zzbpf(readStrongBinder2);
                                            }
                                        }
                                        zzbph zzbphVar = zzbpfVar;
                                        zzbnz zzb = zzbny.zzb(parcel.readStrongBinder());
                                        zzatl.zzc(parcel);
                                        zzl(readString3, readString4, zzlVar2, asInterface2, zzbphVar, zzb);
                                        parcel2.writeNoException();
                                        break;
                                    case 15:
                                        IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        zzatl.zzc(parcel);
                                        boolean zzs = zzs(asInterface3);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(zzs ? 1 : 0);
                                        break;
                                    case 16:
                                        String readString5 = parcel.readString();
                                        String readString6 = parcel.readString();
                                        zzl zzlVar3 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                                        IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                                        if (readStrongBinder3 != null) {
                                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                            if (queryLocalInterface3 instanceof zzbpn) {
                                                zzbplVar2 = (zzbpn) queryLocalInterface3;
                                            } else {
                                                zzbplVar2 = new zzbpl(readStrongBinder3);
                                            }
                                        }
                                        zzbpn zzbpnVar = zzbplVar2;
                                        zzbnz zzb2 = zzbny.zzb(parcel.readStrongBinder());
                                        zzatl.zzc(parcel);
                                        zzp(readString5, readString6, zzlVar3, asInterface4, zzbpnVar, zzb2);
                                        parcel2.writeNoException();
                                        break;
                                    case 17:
                                        IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        zzatl.zzc(parcel);
                                        boolean zzt = zzt(asInterface5);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(zzt ? 1 : 0);
                                        break;
                                    case 18:
                                        String readString7 = parcel.readString();
                                        String readString8 = parcel.readString();
                                        zzl zzlVar4 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                                        IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder4 = parcel.readStrongBinder();
                                        if (readStrongBinder4 != null) {
                                            IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                            if (queryLocalInterface4 instanceof zzbpk) {
                                                zzbpiVar2 = (zzbpk) queryLocalInterface4;
                                            } else {
                                                zzbpiVar2 = new zzbpi(readStrongBinder4);
                                            }
                                        }
                                        zzbpk zzbpkVar = zzbpiVar2;
                                        zzbnz zzb3 = zzbny.zzb(parcel.readStrongBinder());
                                        zzatl.zzc(parcel);
                                        zzm(readString7, readString8, zzlVar4, asInterface6, zzbpkVar, zzb3);
                                        parcel2.writeNoException();
                                        break;
                                    case 19:
                                        String readString9 = parcel.readString();
                                        zzatl.zzc(parcel);
                                        zzq(readString9);
                                        parcel2.writeNoException();
                                        break;
                                    case 20:
                                        String readString10 = parcel.readString();
                                        String readString11 = parcel.readString();
                                        zzl zzlVar5 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                                        IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder5 = parcel.readStrongBinder();
                                        if (readStrongBinder5 != null) {
                                            IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                            if (queryLocalInterface5 instanceof zzbpn) {
                                                zzbplVar = (zzbpn) queryLocalInterface5;
                                            } else {
                                                zzbplVar = new zzbpl(readStrongBinder5);
                                            }
                                        }
                                        zzbpn zzbpnVar2 = zzbplVar;
                                        zzbnz zzb4 = zzbny.zzb(parcel.readStrongBinder());
                                        zzatl.zzc(parcel);
                                        zzo(readString10, readString11, zzlVar5, asInterface7, zzbpnVar2, zzb4);
                                        parcel2.writeNoException();
                                        break;
                                    case 21:
                                        String readString12 = parcel.readString();
                                        String readString13 = parcel.readString();
                                        zzl zzlVar6 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                                        IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder6 = parcel.readStrongBinder();
                                        if (readStrongBinder6 != null) {
                                            IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                            if (queryLocalInterface6 instanceof zzbpe) {
                                                zzbpcVar = (zzbpe) queryLocalInterface6;
                                            } else {
                                                zzbpcVar = new zzbpc(readStrongBinder6);
                                            }
                                        }
                                        zzbpe zzbpeVar2 = zzbpcVar;
                                        zzatl.zzc(parcel);
                                        zzk(readString12, readString13, zzlVar6, asInterface8, zzbpeVar2, zzbny.zzb(parcel.readStrongBinder()), (zzq) zzatl.zza(parcel, zzq.CREATOR));
                                        parcel2.writeNoException();
                                        break;
                                    case 22:
                                        String readString14 = parcel.readString();
                                        String readString15 = parcel.readString();
                                        zzl zzlVar7 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                                        IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder7 = parcel.readStrongBinder();
                                        if (readStrongBinder7 != null) {
                                            IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                            if (queryLocalInterface7 instanceof zzbpk) {
                                                zzbpiVar = (zzbpk) queryLocalInterface7;
                                            } else {
                                                zzbpiVar = new zzbpi(readStrongBinder7);
                                            }
                                        }
                                        zzbpk zzbpkVar2 = zzbpiVar;
                                        zzatl.zzc(parcel);
                                        zzn(readString14, readString15, zzlVar7, asInterface9, zzbpkVar2, zzbny.zzb(parcel.readStrongBinder()), (zzbdz) zzatl.zza(parcel, zzbdz.CREATOR));
                                        parcel2.writeNoException();
                                        break;
                                    case ConnectionResult.API_DISABLED /* 23 */:
                                        String readString16 = parcel.readString();
                                        String readString17 = parcel.readString();
                                        zzl zzlVar8 = (zzl) zzatl.zza(parcel, zzl.CREATOR);
                                        IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        IBinder readStrongBinder8 = parcel.readStrongBinder();
                                        if (readStrongBinder8 != null) {
                                            IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                            if (queryLocalInterface8 instanceof zzbpb) {
                                                zzbozVar = (zzbpb) queryLocalInterface8;
                                            } else {
                                                zzbozVar = new zzboz(readStrongBinder8);
                                            }
                                        }
                                        zzbpb zzbpbVar = zzbozVar;
                                        zzbnz zzb5 = zzbny.zzb(parcel.readStrongBinder());
                                        zzatl.zzc(parcel);
                                        zzi(readString16, readString17, zzlVar8, asInterface10, zzbpbVar, zzb5);
                                        parcel2.writeNoException();
                                        break;
                                    case 24:
                                        IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                        zzatl.zzc(parcel);
                                        boolean zzr = zzr(asInterface11);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(zzr ? 1 : 0);
                                        break;
                                    default:
                                        return false;
                                }
                            } else {
                                parcel.createStringArray();
                                Bundle[] bundleArr = (Bundle[]) parcel.createTypedArray(Bundle.CREATOR);
                                zzatl.zzc(parcel);
                                parcel2.writeNoException();
                            }
                        } else {
                            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                            zzatl.zzc(parcel);
                            parcel2.writeNoException();
                        }
                    } else {
                        zzdq zze = zze();
                        parcel2.writeNoException();
                        zzatl.zzf(parcel2, zze);
                    }
                } else {
                    zzbqe zzg = zzg();
                    parcel2.writeNoException();
                    zzatl.zze(parcel2, zzg);
                }
            } else {
                zzbqe zzf = zzf();
                parcel2.writeNoException();
                zzatl.zze(parcel2, zzf);
            }
        } else {
            IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString18 = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzatl.zza(parcel, creator);
            Bundle bundle2 = (Bundle) zzatl.zza(parcel, creator);
            zzq zzqVar = (zzq) zzatl.zza(parcel, zzq.CREATOR);
            IBinder readStrongBinder9 = parcel.readStrongBinder();
            if (readStrongBinder9 != null) {
                IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (queryLocalInterface9 instanceof zzbpt) {
                    zzbptVar = (zzbpt) queryLocalInterface9;
                } else {
                    zzbptVar = new zzbpr(readStrongBinder9);
                }
            }
            zzbpt zzbptVar2 = zzbptVar;
            zzatl.zzc(parcel);
            zzh(asInterface12, readString18, bundle, bundle2, zzqVar, zzbptVar2);
            parcel2.writeNoException();
        }
        return true;
    }
}
