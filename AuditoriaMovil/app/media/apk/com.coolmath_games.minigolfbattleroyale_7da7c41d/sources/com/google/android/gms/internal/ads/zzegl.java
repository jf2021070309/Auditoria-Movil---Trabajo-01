package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzegl extends zzbxd {
    private final zzeef<zzbxn, zzefy> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
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
