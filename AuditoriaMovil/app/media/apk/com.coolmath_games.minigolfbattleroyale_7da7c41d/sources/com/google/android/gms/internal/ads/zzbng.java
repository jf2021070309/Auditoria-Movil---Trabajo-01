package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbng extends zzadj implements zzbni {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbng(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zze(zzbmy zzbmyVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzf(zza, zzbmyVar);
        zzbj(1, zza);
    }
}
