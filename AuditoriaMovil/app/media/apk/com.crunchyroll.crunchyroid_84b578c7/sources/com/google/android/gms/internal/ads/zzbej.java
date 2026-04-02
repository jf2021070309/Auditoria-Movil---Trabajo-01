package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.aps.iva.d0.b2;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbej extends zzatj implements zzbel {
    public zzbej(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbel
    public final double zzb() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        double readDouble = zzbg.readDouble();
        zzbg.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbel
    public final int zzc() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        int readInt = zzbg.readInt();
        zzbg.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbel
    public final int zzd() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        int readInt = zzbg.readInt();
        zzbg.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbel
    public final Uri zze() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        Uri uri = (Uri) zzatl.zza(zzbg, Uri.CREATOR);
        zzbg.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbel
    public final IObjectWrapper zzf() throws RemoteException {
        return b2.a(zzbg(1, zza()));
    }
}
