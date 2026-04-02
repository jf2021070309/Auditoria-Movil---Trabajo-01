package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzep implements zzdt {
    public final /* synthetic */ zzer zza;

    public /* synthetic */ zzep(zzer zzerVar, zzeq zzeqVar) {
        this.zza = zzerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zza() {
        if (zzer.zzb(this.zza) != null) {
            zzer.zzb(this.zza).zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzb(Exception exc) {
        zzaln.zzb("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzer.zza(this.zza).zzi(exc);
    }
}
