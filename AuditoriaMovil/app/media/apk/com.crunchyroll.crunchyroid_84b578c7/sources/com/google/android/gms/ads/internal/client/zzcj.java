package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatj;
import com.google.android.gms.internal.ads.zzatl;
import com.google.android.gms.internal.ads.zzbns;
import com.google.android.gms.internal.ads.zzbnt;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class zzcj extends zzatj implements zzcl {
    public zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzbnt getAdapterCreator() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        zzbnt zzf = zzbns.zzf(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzen getLiteSdkVersion() throws RemoteException {
        Parcel zzbg = zzbg(1, zza());
        zzen zzenVar = (zzen) zzatl.zza(zzbg, zzen.CREATOR);
        zzbg.recycle();
        return zzenVar;
    }
}
