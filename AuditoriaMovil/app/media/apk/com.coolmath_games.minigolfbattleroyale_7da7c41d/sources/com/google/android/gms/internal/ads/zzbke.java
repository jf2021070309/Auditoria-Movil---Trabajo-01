package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbke extends zzadj implements zzbkg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbke(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zze(zzbkd zzbkdVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzf(zza, zzbkdVar);
        zzbj(1, zza);
    }
}
