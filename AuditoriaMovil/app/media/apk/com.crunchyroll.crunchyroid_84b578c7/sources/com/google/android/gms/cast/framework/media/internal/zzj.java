package com.google.android.gms.cast.framework.media.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public abstract class zzj extends com.google.android.gms.internal.cast.zzb implements zzk {
    public zzj() {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } else {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            com.google.android.gms.internal.cast.zzc.zzb(parcel);
            zzb(readLong, readLong2);
            parcel2.writeNoException();
        }
        return true;
    }
}
