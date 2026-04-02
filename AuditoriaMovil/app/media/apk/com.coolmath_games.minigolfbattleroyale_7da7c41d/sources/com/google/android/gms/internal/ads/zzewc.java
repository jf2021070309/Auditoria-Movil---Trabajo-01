package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzewc implements zzelx<zzcva> {
    final /* synthetic */ zzewd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzewc(zzewd zzewdVar) {
        this.zza = zzewdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(zzcva zzcvaVar) {
        zzevv zzevvVar;
        zzevv zzevvVar2;
        zzcva zzcvaVar2 = zzcvaVar;
        synchronized (this.zza) {
            zzcva zzcvaVar3 = this.zza.zza;
            if (zzcvaVar3 != null) {
                zzcvaVar3.zzT();
            }
            zzewd zzewdVar = this.zza;
            zzewdVar.zza = zzcvaVar2;
            zzcvaVar2.zza(zzewdVar);
            zzevvVar = this.zza.zzg;
            zzewd zzewdVar2 = this.zza;
            zzevvVar2 = zzewdVar2.zzg;
            zzevvVar.zzm(new zzcvb(zzcvaVar2, zzewdVar2, zzevvVar2));
            zzcvaVar2.zzS();
        }
    }
}
