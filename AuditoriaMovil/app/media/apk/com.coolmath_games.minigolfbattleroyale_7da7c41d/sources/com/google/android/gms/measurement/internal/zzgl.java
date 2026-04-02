package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
final class zzgl implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzgm zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgl(zzgm zzgmVar, String str, String str2, String str3, long j) {
        this.zze = zzgmVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkn zzknVar;
        zzkn zzknVar2;
        String str = this.zza;
        if (str == null) {
            zzknVar2 = this.zze.zza;
            zzknVar2.zzN().zzx().zzn(this.zzb, null);
            return;
        }
        zzid zzidVar = new zzid(this.zzc, str, this.zzd);
        zzknVar = this.zze.zza;
        zzknVar.zzN().zzx().zzn(this.zzb, zzidVar);
    }
}
