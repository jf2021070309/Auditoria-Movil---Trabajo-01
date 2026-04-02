package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbro extends zzatj implements zzbrq {
    public zzbro(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final boolean zzF() throws RemoteException {
        Parcel zzbg = zzbg(11, zza());
        boolean zzg = zzatl.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzg(int i, int i2, Intent intent) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zzatl.zzd(zza, intent);
        zzbh(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzh() throws RemoteException {
        zzbh(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzbh(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzk(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzd(zza, bundle);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzl() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzn() throws RemoteException {
        zzbh(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzo(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzbh(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzp() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzq() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzr(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzd(zza, bundle);
        Parcel zzbg = zzbg(6, zza);
        if (zzbg.readInt() != 0) {
            bundle.readFromParcel(zzbg);
        }
        zzbg.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzs() throws RemoteException {
        zzbh(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzt() throws RemoteException {
        zzbh(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzu() throws RemoteException {
        zzbh(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzw() throws RemoteException {
        zzbh(9, zza());
    }
}
