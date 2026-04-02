package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbje extends zzatj implements zzbjg {
    public zzbje(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbjg
    public final zzbjd zze(IObjectWrapper iObjectWrapper, zzbnt zzbntVar, int i, zzbja zzbjaVar) throws RemoteException {
        zzbjd zzbjbVar;
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbntVar);
        zza.writeInt(231004000);
        zzatl.zzf(zza, zzbjaVar);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbjbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            if (queryLocalInterface instanceof zzbjd) {
                zzbjbVar = (zzbjd) queryLocalInterface;
            } else {
                zzbjbVar = new zzbjb(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbjbVar;
    }
}
