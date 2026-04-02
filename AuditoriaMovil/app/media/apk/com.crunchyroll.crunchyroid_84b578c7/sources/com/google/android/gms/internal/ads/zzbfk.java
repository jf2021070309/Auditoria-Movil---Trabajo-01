package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbfk extends zzatj implements zzbfm {
    public zzbfk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfm
    public final void zze(zzbfc zzbfcVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzbfcVar);
        zzbh(1, zza);
    }
}
