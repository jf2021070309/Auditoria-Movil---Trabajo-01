package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbfb extends zzadj implements zzbfd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbfd
    public final void zzb() throws RemoteException {
        zzbj(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfd
    public final void zzc(zzbcz zzbczVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzd(zza, zzbczVar);
        zzbj(2, zza);
    }
}
