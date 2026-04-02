package com.google.android.gms.cast.tv.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast_tv.zzdx;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzao extends com.google.android.gms.internal.cast_tv.zzb implements zzap {
    public zzao() {
        super("com.google.android.gms.cast.tv.internal.IUmaEventSink");
    }

    @Override // com.google.android.gms.internal.cast_tv.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            com.google.android.gms.internal.cast_tv.zzc.zzc(parcel);
            zzb((zzdx) com.google.android.gms.internal.cast_tv.zzc.zza(parcel, zzdx.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
