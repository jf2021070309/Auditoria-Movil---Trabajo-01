package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbus extends zzatj {
    public zzbus(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbur zzburVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzburVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbh(2, zza);
    }
}
