package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzf {
    final zzax zza = new zzax();
    final zzg zzb;
    final zzg zzc;
    final zzj zzd;

    public zzf() {
        zzg zzgVar = new zzg(null, this.zza);
        this.zzc = zzgVar;
        this.zzb = zzgVar.zzc();
        this.zzd = new zzj();
        this.zzc.zze("require", new zzv(this.zzd));
        this.zzd.zza("internal.platform", zze.zza);
        this.zzc.zze("runtime.counter", new zzah(Double.valueOf(0.0d)));
    }

    public final zzap zza(zzg zzgVar, zzgt... zzgtVarArr) {
        zzap zzapVar = zzap.zzf;
        for (zzgt zzgtVar : zzgtVarArr) {
            zzapVar = zzi.zzb(zzgtVar);
            zzh.zzk(this.zzc);
            if ((zzapVar instanceof zzaq) || (zzapVar instanceof zzao)) {
                zzapVar = this.zza.zzb(zzgVar, zzapVar);
            }
        }
        return zzapVar;
    }
}
