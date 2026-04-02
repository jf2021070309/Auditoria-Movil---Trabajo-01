package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final class zzegl extends zzbxd {
    private final zzeef<zzbxn, zzefy> zza;

    public /* synthetic */ zzegl(zzegn zzegnVar, zzeef zzeefVar, zzegm zzegmVar) {
        this.zza = zzeefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxe
    public final void zze() throws RemoteException {
        this.zza.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbxe
    public final void zzf(String str) throws RemoteException {
        this.zza.zzc.zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbxe
    public final void zzg(zzbcz zzbczVar) throws RemoteException {
        this.zza.zzc.zzx(zzbczVar);
    }
}
