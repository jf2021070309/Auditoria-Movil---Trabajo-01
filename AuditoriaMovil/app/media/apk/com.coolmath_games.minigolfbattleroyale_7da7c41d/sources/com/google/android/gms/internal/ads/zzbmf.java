package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbmf extends zzadj implements zzbmh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final IObjectWrapper zzb() throws RemoteException {
        Parcel zzbi = zzbi(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbi.readStrongBinder());
        zzbi.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final Uri zzc() throws RemoteException {
        Parcel zzbi = zzbi(2, zza());
        Uri uri = (Uri) zzadl.zzc(zzbi, Uri.CREATOR);
        zzbi.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final double zzd() throws RemoteException {
        Parcel zzbi = zzbi(3, zza());
        double readDouble = zzbi.readDouble();
        zzbi.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final int zze() throws RemoteException {
        Parcel zzbi = zzbi(4, zza());
        int readInt = zzbi.readInt();
        zzbi.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final int zzf() throws RemoteException {
        Parcel zzbi = zzbi(5, zza());
        int readInt = zzbi.readInt();
        zzbi.recycle();
        return readInt;
    }
}
