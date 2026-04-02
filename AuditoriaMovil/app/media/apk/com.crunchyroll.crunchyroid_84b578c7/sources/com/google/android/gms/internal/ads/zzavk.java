package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzavk extends zzatj implements zzavm {
    public zzavk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzavm
    public final zzbu zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzavm
    public final zzdn zzf() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        zzdn zzb = zzdm.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzavm
    public final void zzg(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzatl.zza;
        zza.writeInt(z ? 1 : 0);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzavm
    public final void zzh(zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzdgVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzavm
    public final void zzi(IObjectWrapper iObjectWrapper, zzavt zzavtVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzatl.zzf(zza, zzavtVar);
        zzbh(4, zza);
    }
}
