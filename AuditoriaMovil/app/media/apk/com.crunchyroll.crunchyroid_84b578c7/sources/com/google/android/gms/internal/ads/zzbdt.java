package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbdt extends zzatj {
    public zzbdt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbta zzbtaVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzbtaVar);
        zzbh(1, zza);
    }
}
