package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcpy implements zzewm {
    private final Context zza;
    private final zzbdl zzb;
    private final String zzc;
    private final zzcqu zzd;
    private final zzcpy zze = this;
    private final zzgln<Context> zzf;
    private final zzgln<zzbdl> zzg;
    private final zzgln<zzeli> zzh;
    private final zzgln<zzelm> zzi;
    private final zzgln<zzewj> zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcpy(zzcqu zzcquVar, Context context, String str, zzbdl zzbdlVar, zzcql zzcqlVar) {
        zzgln zzglnVar;
        zzgln zzglnVar2;
        zzgln zzglnVar3;
        this.zzd = zzcquVar;
        this.zza = context;
        this.zzb = zzbdlVar;
        this.zzc = str;
        this.zzf = zzglb.zza(context);
        this.zzg = zzglb.zza(zzbdlVar);
        zzglnVar = this.zzd.zzo;
        this.zzh = zzgkz.zza(new zzelj(zzglnVar));
        this.zzi = zzgkz.zza(zzelo.zza());
        zzgln<Context> zzglnVar4 = this.zzf;
        zzglnVar2 = this.zzd.zzp;
        zzgln<zzbdl> zzglnVar5 = this.zzg;
        zzglnVar3 = this.zzd.zzN;
        this.zzj = zzgkz.zza(new zzewk(zzglnVar4, zzglnVar2, zzglnVar5, zzglnVar3, this.zzh, this.zzi, zzfat.zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzewm
    public final zzeko zza() {
        return new zzeko(this.zza, this.zzb, this.zzc, this.zzj.zzb(), this.zzh.zzb());
    }
}
