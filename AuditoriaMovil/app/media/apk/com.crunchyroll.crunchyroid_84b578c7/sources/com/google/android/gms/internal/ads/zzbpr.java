package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbpr extends zzatj implements zzbpt {
    public zzbpr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzg(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzd(zza, zzeVar);
        zzbh(3, zza);
    }
}
