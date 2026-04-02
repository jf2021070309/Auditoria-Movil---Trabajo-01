package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzep implements zzdt {
    final /* synthetic */ zzer zza;

    /* JADX INFO: Access modifiers changed from: package-private */
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
