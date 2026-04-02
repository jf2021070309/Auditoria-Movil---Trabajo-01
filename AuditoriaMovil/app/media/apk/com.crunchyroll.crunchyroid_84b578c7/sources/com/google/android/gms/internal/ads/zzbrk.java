package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbrk extends zzatj implements zzbrm {
    public zzbrk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final zzbrj zze(IObjectWrapper iObjectWrapper, zzbnt zzbntVar, int i) throws RemoteException {
        zzbrj zzbrhVar;
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbntVar);
        zza.writeInt(231004000);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (queryLocalInterface instanceof zzbrj) {
                zzbrhVar = (zzbrj) queryLocalInterface;
            } else {
                zzbrhVar = new zzbrh(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbrhVar;
    }
}
