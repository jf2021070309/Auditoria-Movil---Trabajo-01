package com.google.android.gms.internal.cast_tv;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzek extends zzb implements zzel {
    public zzek() {
        super("com.google.android.libraries.cast.tv.tvlibrary.aidl.ICastTvService");
    }

    @Override // com.google.android.gms.internal.cast_tv.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzej zzejVar = null;
        zzej zzejVar2 = null;
        zzeh zzehVar = null;
        zzeh zzehVar2 = null;
        zzeh zzehVar3 = null;
        zzeq zzeqVar = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.libraries.cast.tv.tvlibrary.aidl.ICastTvClient");
                    if (queryLocalInterface instanceof zzej) {
                        zzejVar = (zzej) queryLocalInterface;
                    } else {
                        zzejVar = new zzei(readStrongBinder);
                    }
                }
                zzc.zzc(parcel);
                zzi(zzejVar);
                return true;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.libraries.cast.tv.tvlibrary.aidl.IMessageResultCallback");
                    if (queryLocalInterface2 instanceof zzeq) {
                        zzeqVar = (zzeq) queryLocalInterface2;
                    } else {
                        zzeqVar = new zzeo(readStrongBinder2);
                    }
                }
                zzc.zzc(parcel);
                zze(readString, readString2, readString3, zzeqVar);
                return true;
            case 3:
                zzeu zzeuVar = (zzeu) zzc.zza(parcel, zzeu.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.libraries.cast.tv.tvlibrary.aidl.IBooleanCallback");
                    if (queryLocalInterface3 instanceof zzeh) {
                        zzehVar3 = (zzeh) queryLocalInterface3;
                    } else {
                        zzehVar3 = new zzeg(readStrongBinder3);
                    }
                }
                zzc.zzc(parcel);
                zzc(zzeuVar, zzehVar3);
                return true;
            case 4:
                zzfa zzfaVar = (zzfa) zzc.zza(parcel, zzfa.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.libraries.cast.tv.tvlibrary.aidl.IBooleanCallback");
                    if (queryLocalInterface4 instanceof zzeh) {
                        zzehVar2 = (zzeh) queryLocalInterface4;
                    } else {
                        zzehVar2 = new zzeg(readStrongBinder4);
                    }
                }
                zzc.zzc(parcel);
                zzd(zzfaVar, zzehVar2);
                return true;
            case 5:
                zzc.zzc(parcel);
                zzf((zzfe) zzc.zza(parcel, zzfe.CREATOR));
                return true;
            case 6:
                zzc.zzc(parcel);
                zzg((zzfc) zzc.zza(parcel, zzfc.CREATOR));
                return true;
            case 7:
                zzh();
                return true;
            case 8:
                zzes zzesVar = (zzes) zzc.zza(parcel, zzes.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.libraries.cast.tv.tvlibrary.aidl.IBooleanCallback");
                    if (queryLocalInterface5 instanceof zzeh) {
                        zzehVar = (zzeh) queryLocalInterface5;
                    } else {
                        zzehVar = new zzeg(readStrongBinder5);
                    }
                }
                zzc.zzc(parcel);
                zzb(zzesVar, zzehVar);
                return true;
            case 9:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.libraries.cast.tv.tvlibrary.aidl.ICastTvClient");
                    if (queryLocalInterface6 instanceof zzej) {
                        zzejVar2 = (zzej) queryLocalInterface6;
                    } else {
                        zzejVar2 = new zzei(readStrongBinder6);
                    }
                }
                zzc.zzc(parcel);
                zzk(zzejVar2, (zzeb) zzc.zza(parcel, zzeb.CREATOR));
                return true;
            case 10:
                zzc.zzc(parcel);
                zzj((zzeb) zzc.zza(parcel, zzeb.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
