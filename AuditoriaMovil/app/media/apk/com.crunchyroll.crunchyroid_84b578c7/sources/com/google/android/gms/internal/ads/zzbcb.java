package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbcb extends zzatj implements zzbcd {
    public zzbcb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbcd
    public final void zze(zzbca zzbcaVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzbcaVar);
        zzbh(1, zza);
    }
}
