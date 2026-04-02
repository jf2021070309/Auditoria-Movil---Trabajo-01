package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public abstract class zzf extends com.google.android.gms.internal.cast.zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    int[] zzg = zzg();
                    parcel2.writeNoException();
                    parcel2.writeIntArray(zzg);
                } else {
                    List zzf = zzf();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(zzf);
                }
            } else {
                IObjectWrapper zze = zze();
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.zzc.zze(parcel2, zze);
            }
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        }
        return true;
    }
}
