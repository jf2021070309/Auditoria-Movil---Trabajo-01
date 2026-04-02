package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcqk implements zzeyf {
    private final zzcqu zza;
    private final zzcqk zzb = this;
    private final zzgln<Context> zzc;
    private final zzgln<zzbdl> zzd;
    private final zzgln<String> zze;
    private final zzgln<zzeli> zzf;
    private final zzgln<zzezc> zzg;
    private final zzgln<zzeyc> zzh;
    private final zzgln<zzelq> zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcqk(zzcqu zzcquVar, Context context, String str, zzbdl zzbdlVar, zzcql zzcqlVar) {
        zzgln zzglnVar;
        zzgln zzglnVar2;
        zzgln zzglnVar3;
        zzgln zzglnVar4;
        this.zza = zzcquVar;
        this.zzc = zzglb.zza(context);
        this.zzd = zzglb.zza(zzbdlVar);
        this.zze = zzglb.zza(str);
        zzglnVar = this.zza.zzo;
        this.zzf = zzgkz.zza(new zzelj(zzglnVar));
        zzglnVar2 = this.zza.zzas;
        this.zzg = zzgkz.zza(new zzezd(zzglnVar2));
        zzgln<Context> zzglnVar5 = this.zzc;
        zzglnVar3 = this.zza.zzp;
        zzglnVar4 = this.zza.zzN;
        zzgln<zzeyc> zza = zzgkz.zza(new zzeyd(zzglnVar5, zzglnVar3, zzglnVar4, this.zzf, this.zzg, zzfat.zza()));
        this.zzh = zza;
        this.zzi = zzgkz.zza(new zzelr(this.zzc, this.zzd, this.zze, zza, this.zzf, this.zzg));
    }

    @Override // com.google.android.gms.internal.ads.zzeyf
    public final zzelq zza() {
        return this.zzi.zzb();
    }
}
