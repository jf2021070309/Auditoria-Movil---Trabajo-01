package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbgu extends zzadj implements zzbgw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zze(zzbdn zzbdnVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzd(zza, zzbdnVar);
        zzbj(1, zza);
    }
}
