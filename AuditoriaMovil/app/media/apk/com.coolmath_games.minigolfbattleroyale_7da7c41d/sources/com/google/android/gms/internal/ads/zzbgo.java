package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbgo extends zzadj implements zzbgq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zze(zzbcz zzbczVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzd(zza, zzbczVar);
        zzbj(1, zza);
    }
}
