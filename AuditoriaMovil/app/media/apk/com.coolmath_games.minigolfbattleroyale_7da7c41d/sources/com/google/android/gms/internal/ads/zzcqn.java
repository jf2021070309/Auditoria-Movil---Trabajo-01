package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcqn implements zzezt {
    private final zzcqu zza;
    private final zzcqn zzb = this;
    private final zzgln<Context> zzc;
    private final zzgln<zzexo<zzdsb, zzdrw>> zzd;
    private final zzgln<zzezc> zze;
    private final zzgln<zzfam> zzf;
    private final zzgln<zzezm> zzg;
    private final zzgln<zzezw> zzh;
    private final zzgln<String> zzi;
    private final zzgln<zzezq> zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcqn(zzcqu zzcquVar, Context context, String str, zzcql zzcqlVar) {
        zzgln zzglnVar;
        zzgln zzglnVar2;
        zzgln zzglnVar3;
        zzgln zzglnVar4;
        zzgln zzglnVar5;
        this.zza = zzcquVar;
        zzgla zza = zzglb.zza(context);
        this.zzc = zza;
        zzglnVar = this.zza.zzas;
        zzglnVar2 = this.zza.zzat;
        this.zzd = new zzext(zza, zzglnVar, zzglnVar2);
        zzglnVar3 = this.zza.zzas;
        this.zze = zzgkz.zza(new zzezd(zzglnVar3));
        this.zzf = zzgkz.zza(zzfao.zza());
        zzgln<Context> zzglnVar6 = this.zzc;
        zzglnVar4 = this.zza.zzp;
        zzglnVar5 = this.zza.zzN;
        zzgln<zzezm> zza2 = zzgkz.zza(new zzezn(zzglnVar6, zzglnVar4, zzglnVar5, this.zzd, this.zze, zzfat.zza(), this.zzf));
        this.zzg = zza2;
        this.zzh = zzgkz.zza(new zzezx(zza2, this.zze, this.zzf));
        zzgla zzc = zzglb.zzc(str);
        this.zzi = zzc;
        this.zzj = zzgkz.zza(new zzezr(zzc, this.zzg, this.zzc, this.zze, this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzezt
    public final zzezw zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzezt
    public final zzezq zzb() {
        return this.zzj.zzb();
    }
}
