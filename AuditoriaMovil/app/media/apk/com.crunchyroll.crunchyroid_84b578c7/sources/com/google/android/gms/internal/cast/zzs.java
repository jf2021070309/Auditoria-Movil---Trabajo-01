package com.google.android.gms.internal.cast;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzs implements com.google.android.gms.cast.framework.zzs {
    final /* synthetic */ zzv zza;

    public /* synthetic */ zzs(zzv zzvVar, zzr zzrVar) {
        this.zza = zzvVar;
    }

    @Override // com.google.android.gms.cast.framework.zzs
    public final void zza() {
        zzv.zzf(this.zza, new zzz(new zzy(3)));
    }

    @Override // com.google.android.gms.cast.framework.zzs
    public final void zzb(String str, long j, int i, long j2, long j3) {
        zzx zzc = zzv.zzc(this.zza);
        zzp zzpVar = new zzp(str);
        zzpVar.zzf(j);
        zzpVar.zzh(i);
        zzpVar.zzg(j2);
        zzpVar.zze(j3);
        zzc.zzb(new zzq(zzpVar));
    }
}
