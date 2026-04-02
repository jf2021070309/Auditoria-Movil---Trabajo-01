package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes.dex */
public final class zzbqa implements com.google.android.gms.ads.internal.overlay.zzt {
    public boolean zza = false;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzbcv zzc;
    public final /* synthetic */ Map zzd;
    public final /* synthetic */ Map zze;

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
    public final void zzb(int i2) {
    }
}
