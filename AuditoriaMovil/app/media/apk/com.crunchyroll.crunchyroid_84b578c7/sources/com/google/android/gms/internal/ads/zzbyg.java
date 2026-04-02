package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbyg extends zzatj implements zzbyi {
    public zzbyg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final zzbyf zze(IObjectWrapper iObjectWrapper, zzbnt zzbntVar, int i) throws RemoteException {
        zzbyf zzbydVar;
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbntVar);
        zza.writeInt(231004000);
        Parcel zzbg = zzbg(2, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbydVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (queryLocalInterface instanceof zzbyf) {
                zzbydVar = (zzbyf) queryLocalInterface;
            } else {
                zzbydVar = new zzbyd(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbydVar;
    }
}
