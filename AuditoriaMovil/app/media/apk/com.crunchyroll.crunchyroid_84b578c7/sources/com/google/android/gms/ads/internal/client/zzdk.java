package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatj;
import com.google.android.gms.internal.ads.zzatl;
import com.google.android.gms.internal.ads.zzbnt;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class zzdk extends zzatj {
    public zzdk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final zzdj zze(IObjectWrapper iObjectWrapper, zzbnt zzbntVar, int i) throws RemoteException {
        zzdj zzdhVar;
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzbntVar);
        zza.writeInt(231004000);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (queryLocalInterface instanceof zzdj) {
                zzdhVar = (zzdj) queryLocalInterface;
            } else {
                zzdhVar = new zzdh(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzdhVar;
    }
}
