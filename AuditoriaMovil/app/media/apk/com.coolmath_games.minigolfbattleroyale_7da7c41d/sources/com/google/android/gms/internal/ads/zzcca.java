package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcca extends zzadj implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcbz zzcbzVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzf(zza, zzcbzVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbj(2, zza);
    }
}
