package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbfh extends zzatj implements zzbfj {
    public zzbfh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zze(zzbfa zzbfaVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzbfaVar);
        zzbh(1, zza);
    }
}
