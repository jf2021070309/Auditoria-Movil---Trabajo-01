package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbqa implements com.google.android.gms.ads.internal.overlay.zzt {
    boolean zza = false;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzbcv zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqa(zzbqc zzbqcVar, boolean z, zzbcv zzbcvVar, Map map, Map map2) {
        this.zzb = z;
        this.zzc = zzbcvVar;
        this.zzd = map;
        this.zze = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzt
    public final void zza(boolean z) {
        if (this.zza) {
            return;
        }
        if (z && this.zzb) {
            ((zzdio) this.zzc).zzb();
        }
        this.zza = true;
        this.zzd.put((String) this.zze.get("event_id"), Boolean.valueOf(z));
        ((zzbsi) this.zzc).zze("openIntentAsync", this.zzd);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzt
    public final void zzb(int i) {
    }
}
