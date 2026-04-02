package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbse extends zzadj implements zzbsg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbse(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zze(zzbsa zzbsaVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzf(zza, zzbsaVar);
        zzbj(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzf(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbj(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzg(zzbcz zzbczVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzd(zza, zzbczVar);
        zzbj(3, zza);
    }
}
