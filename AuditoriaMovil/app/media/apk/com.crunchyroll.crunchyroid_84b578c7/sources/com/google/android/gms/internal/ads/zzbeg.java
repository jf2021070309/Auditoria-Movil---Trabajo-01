package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.aps.iva.d0.b2;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbeg extends zzatj implements zzbei {
    public zzbeg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final float zze() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final float zzf() throws RemoteException {
        Parcel zzbg = zzbg(6, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final float zzg() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final zzdq zzh() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        zzdq zzb = zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final IObjectWrapper zzi() throws RemoteException {
        return b2.a(zzbg(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, iObjectWrapper);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final boolean zzk() throws RemoteException {
        Parcel zzbg = zzbg(10, zza());
        boolean zzg = zzatl.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final boolean zzl() throws RemoteException {
        Parcel zzbg = zzbg(8, zza());
        boolean zzg = zzatl.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final void zzm(zzbft zzbftVar) throws RemoteException {
        throw null;
    }
}
