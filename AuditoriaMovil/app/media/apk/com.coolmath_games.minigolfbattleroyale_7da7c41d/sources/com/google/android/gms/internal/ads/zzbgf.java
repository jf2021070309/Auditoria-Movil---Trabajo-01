package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbgf extends zzadj implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzf(zza, iObjectWrapper);
        zza.writeInt(213806000);
        Parcel zzbi = zzbi(1, zza);
        IBinder readStrongBinder = zzbi.readStrongBinder();
        zzbi.recycle();
        return readStrongBinder;
    }
}
