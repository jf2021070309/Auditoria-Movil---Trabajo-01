package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbia extends zzbff {
    final /* synthetic */ zzbib zza;

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zze(zzbdg zzbdgVar) throws RemoteException {
        zzi(zzbdgVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final String zzf() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean zzg() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final String zzh() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzi(zzbdg zzbdgVar, int i) throws RemoteException {
        zzcgt.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcgm.zza.post(new zzbhz(this));
    }
}
