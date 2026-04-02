package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public abstract class zzad extends com.google.android.gms.internal.cast.zzb implements zzae {
    public zzad() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener");
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
                    zzc();
                    parcel2.writeNoException();
                }
            } else {
                zzd();
                parcel2.writeNoException();
            }
        } else {
            IObjectWrapper zzb = zzb();
            parcel2.writeNoException();
            com.google.android.gms.internal.cast.zzc.zze(parcel2, zzb);
        }
        return true;
    }
}
