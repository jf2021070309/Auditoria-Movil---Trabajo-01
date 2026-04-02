package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbnm extends zzadj implements zzbno {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbno
    public final void zze(zzbnb zzbnbVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzf(zza, zzbnbVar);
        zzbj(1, zza);
    }
}
