package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbnd extends zzadj implements zzbnf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final void zze(zzbmw zzbmwVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzf(zza, zzbmwVar);
        zzbj(1, zza);
    }
}
