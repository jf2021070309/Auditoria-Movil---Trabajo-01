package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcoe extends zzadj implements zzcog {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcoe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.zzcog
    public final void zze(IObjectWrapper iObjectWrapper, zzcod zzcodVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzf(zza, iObjectWrapper);
        zzadl.zzf(zza, zzcodVar);
        zzbj(2, zza);
    }
}
