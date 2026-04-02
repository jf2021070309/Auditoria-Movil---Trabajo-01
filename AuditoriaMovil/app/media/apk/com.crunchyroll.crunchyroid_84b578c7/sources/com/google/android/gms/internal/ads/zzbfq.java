package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbfq extends zzatj implements zzbfs {
    public zzbfq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zze(zzbff zzbffVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzbffVar);
        zzbh(1, zza);
    }
}
