package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcpt implements zzeuy {
    private final zzcqu zza;
    private final zzcpt zzb = this;
    private final zzgln<Context> zzc;
    private final zzgln<String> zzd;
    private final zzgln<zzexo<zzcuk, zzcuq>> zze;
    private final zzgln<zzevv> zzf;
    private final zzgln<zzeup> zzg;
    private final zzgln<zzeuv> zzh;
    private final zzgln<zzexo<zzcuv, zzcva>> zzi;
    private final zzgln<zzevx> zzj;
    private final zzgln<zzewd> zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcpt(zzcqu zzcquVar, Context context, String str, zzcql zzcqlVar) {
        zzgln zzglnVar;
        zzgln zzglnVar2;
        zzgln zzglnVar3;
        zzgln zzglnVar4;
        zzgln zzglnVar5;
        zzgln zzglnVar6;
        zzgln zzglnVar7;
        zzgln zzglnVar8;
        zzgln zzglnVar9;
        zzgln zzglnVar10;
        zzgln zzglnVar11;
        zzgln zzglnVar12;
        this.zza = zzcquVar;
        this.zzc = zzglb.zza(context);
        this.zzd = zzglb.zza(str);
        zzgln<Context> zzglnVar13 = this.zzc;
        zzglnVar = this.zza.zzas;
        zzglnVar2 = this.zza.zzat;
        this.zze = new zzexs(zzglnVar13, zzglnVar, zzglnVar2);
        zzglnVar3 = this.zza.zzas;
        this.zzf = zzgkz.zza(new zzevw(zzglnVar3));
        zzgln<Context> zzglnVar14 = this.zzc;
        zzglnVar4 = this.zza.zzp;
        zzglnVar5 = this.zza.zzN;
        this.zzg = zzgkz.zza(new zzeuq(zzglnVar14, zzglnVar4, zzglnVar5, this.zze, this.zzf, zzfat.zza()));
        zzglnVar6 = this.zza.zzN;
        zzgln<Context> zzglnVar15 = this.zzc;
        zzgln<String> zzglnVar16 = this.zzd;
        zzgln<zzeup> zzglnVar17 = this.zzg;
        zzgln<zzevv> zzglnVar18 = this.zzf;
        zzglnVar7 = this.zza.zzi;
        this.zzh = zzgkz.zza(new zzeuw(zzglnVar6, zzglnVar15, zzglnVar16, zzglnVar17, zzglnVar18, zzglnVar7));
        zzgln<Context> zzglnVar19 = this.zzc;
        zzglnVar8 = this.zza.zzas;
        zzglnVar9 = this.zza.zzat;
        this.zzi = new zzexr(zzglnVar19, zzglnVar8, zzglnVar9);
        zzgln<Context> zzglnVar20 = this.zzc;
        zzglnVar10 = this.zza.zzp;
        zzglnVar11 = this.zza.zzN;
        this.zzj = zzgkz.zza(new zzevy(zzglnVar20, zzglnVar10, zzglnVar11, this.zzi, this.zzf, zzfat.zza()));
        zzglnVar12 = this.zza.zzN;
        this.zzk = zzgkz.zza(new zzewe(zzglnVar12, this.zzc, this.zzd, this.zzj, this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final zzeuv zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final zzewd zzb() {
        return this.zzk.zzb();
    }
}
