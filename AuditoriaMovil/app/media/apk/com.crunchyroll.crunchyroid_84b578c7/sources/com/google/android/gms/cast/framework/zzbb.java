package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public abstract class zzbb extends com.google.android.gms.internal.cast.zzb implements zzbc {
    public zzbb() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                } else {
                    String zzc = zzc();
                    parcel2.writeNoException();
                    parcel2.writeString(zzc);
                }
            } else {
                boolean zzd = zzd();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.cast.zzc.zza;
                parcel2.writeInt(zzd ? 1 : 0);
            }
        } else {
            String readString = parcel.readString();
            com.google.android.gms.internal.cast.zzc.zzb(parcel);
            IObjectWrapper zzb = zzb(readString);
            parcel2.writeNoException();
            com.google.android.gms.internal.cast.zzc.zze(parcel2, zzb);
        }
        return true;
    }
}
