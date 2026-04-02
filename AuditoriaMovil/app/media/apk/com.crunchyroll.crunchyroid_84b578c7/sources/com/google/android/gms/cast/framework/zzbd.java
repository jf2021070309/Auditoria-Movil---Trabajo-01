package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public abstract class zzbd extends com.google.android.gms.internal.cast.zzb implements zzbe {
    public zzbd() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper zzc = zzc();
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.zzc.zze(parcel2, zzc);
                return true;
            case 2:
                com.google.android.gms.internal.cast.zzc.zzb(parcel);
                zzh((Bundle) com.google.android.gms.internal.cast.zzc.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
                com.google.android.gms.internal.cast.zzc.zzb(parcel);
                zzg((Bundle) com.google.android.gms.internal.cast.zzc.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zzf = com.google.android.gms.internal.cast.zzc.zzf(parcel);
                com.google.android.gms.internal.cast.zzc.zzb(parcel);
                zzd(zzf);
                parcel2.writeNoException();
                return true;
            case 5:
                long zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeLong(zzb);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                return true;
            case 7:
                com.google.android.gms.internal.cast.zzc.zzb(parcel);
                zzf((Bundle) com.google.android.gms.internal.cast.zzc.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.internal.cast.zzc.zzb(parcel);
                zze((Bundle) com.google.android.gms.internal.cast.zzc.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                com.google.android.gms.internal.cast.zzc.zzb(parcel);
                zzi((Bundle) com.google.android.gms.internal.cast.zzc.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
