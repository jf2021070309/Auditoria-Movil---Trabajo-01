package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbfn extends zzatj implements zzbfp {
    public zzbfn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfp
    public final void zze(zzbff zzbffVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzbffVar);
        zza.writeString(str);
        zzbh(1, zza);
    }
}
