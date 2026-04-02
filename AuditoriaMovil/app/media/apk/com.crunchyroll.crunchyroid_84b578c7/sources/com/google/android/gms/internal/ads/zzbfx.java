package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbfx extends zzatj implements zzbfz {
    public zzbfx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final void zze(zzbgi zzbgiVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzbgiVar);
        zzbh(1, zza);
    }
}
