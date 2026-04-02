package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.aps.iva.d0.b2;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbgg extends zzatj implements zzbgi {
    public zzbgg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzA() throws RemoteException {
        zzbh(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzd(zza, bundle);
        zzbh(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzC() throws RemoteException {
        zzbh(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzD(zzcs zzcsVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzcsVar);
        zzbh(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzE(zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzdgVar);
        zzbh(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzF(zzbgf zzbgfVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzbgfVar);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final boolean zzG() throws RemoteException {
        Parcel zzbg = zzbg(30, zza());
        boolean zzg = zzatl.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final boolean zzH() throws RemoteException {
        Parcel zzbg = zzbg(24, zza());
        boolean zzg = zzatl.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final boolean zzI(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzd(zza, bundle);
        Parcel zzbg = zzbg(16, zza);
        boolean zzg = zzatl.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final double zze() throws RemoteException {
        Parcel zzbg = zzbg(8, zza());
        double readDouble = zzbg.readDouble();
        zzbg.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final Bundle zzf() throws RemoteException {
        Parcel zzbg = zzbg(20, zza());
        Bundle bundle = (Bundle) zzatl.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final zzdn zzg() throws RemoteException {
        Parcel zzbg = zzbg(31, zza());
        zzdn zzb = zzdm.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final zzdq zzh() throws RemoteException {
        Parcel zzbg = zzbg(11, zza());
        zzdq zzb = zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final zzbed zzi() throws RemoteException {
        zzbed zzbebVar;
        Parcel zzbg = zzbg(14, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbebVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            if (queryLocalInterface instanceof zzbed) {
                zzbebVar = (zzbed) queryLocalInterface;
            } else {
                zzbebVar = new zzbeb(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final zzbei zzj() throws RemoteException {
        zzbei zzbegVar;
        Parcel zzbg = zzbg(29, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbegVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            if (queryLocalInterface instanceof zzbei) {
                zzbegVar = (zzbei) queryLocalInterface;
            } else {
                zzbegVar = new zzbeg(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final zzbel zzk() throws RemoteException {
        zzbel zzbejVar;
        Parcel zzbg = zzbg(5, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbejVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof zzbel) {
                zzbejVar = (zzbel) queryLocalInterface;
            } else {
                zzbejVar = new zzbej(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final IObjectWrapper zzl() throws RemoteException {
        return b2.a(zzbg(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final IObjectWrapper zzm() throws RemoteException {
        return b2.a(zzbg(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final String zzn() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final String zzo() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final String zzp() throws RemoteException {
        Parcel zzbg = zzbg(6, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final String zzq() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final String zzr() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final String zzs() throws RemoteException {
        Parcel zzbg = zzbg(10, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final String zzt() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final List zzu() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzatl.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final List zzv() throws RemoteException {
        Parcel zzbg = zzbg(23, zza());
        ArrayList zzb = zzatl.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzw() throws RemoteException {
        zzbh(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzx() throws RemoteException {
        zzbh(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzy(zzcw zzcwVar) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzf(zza, zzcwVar);
        zzbh(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzatl.zzd(zza, bundle);
        zzbh(15, zza);
    }
}
