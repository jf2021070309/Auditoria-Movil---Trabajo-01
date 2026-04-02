package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public abstract class zzaf extends com.google.android.gms.internal.cast.zzb implements zzag {
    public zzaf() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                    } else {
                        int readInt = parcel.readInt();
                        com.google.android.gms.internal.cast.zzc.zzb(parcel);
                        zzb(readInt);
                        parcel2.writeNoException();
                    }
                } else {
                    String readString = parcel.readString();
                    com.google.android.gms.internal.cast.zzc.zzb(parcel);
                    zze(readString);
                    parcel2.writeNoException();
                }
            } else {
                com.google.android.gms.internal.cast.zzc.zzb(parcel);
                zzd(parcel.readString(), (LaunchOptions) com.google.android.gms.internal.cast.zzc.zza(parcel, LaunchOptions.CREATOR));
                parcel2.writeNoException();
            }
        } else {
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            com.google.android.gms.internal.cast.zzc.zzb(parcel);
            zzc(readString2, readString3);
            parcel2.writeNoException();
        }
        return true;
    }
}
