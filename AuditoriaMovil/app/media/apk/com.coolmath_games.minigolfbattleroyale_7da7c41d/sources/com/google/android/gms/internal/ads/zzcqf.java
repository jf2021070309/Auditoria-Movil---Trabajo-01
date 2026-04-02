package com.google.android.gms.internal.ads;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcqf implements zzdwr {
    private final Context zza;
    private final zzbqm zzb;
    private final zzcqu zzc;
    private final zzcqf zzd = this;
    private final zzgln<zzdwr> zze = zzglb.zza(this);
    private final zzgln<zzbqm> zzf;
    private final zzgln<zzdwm> zzg;
    private final zzgln<zzdwo> zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcqf(zzcqu zzcquVar, Context context, zzbqm zzbqmVar, zzcql zzcqlVar) {
        this.zzc = zzcquVar;
        this.zza = context;
        this.zzb = zzbqmVar;
        zzgla zza = zzglb.zza(zzbqmVar);
        this.zzf = zza;
        zzdwn zzdwnVar = new zzdwn(zza);
        this.zzg = zzdwnVar;
        this.zzh = zzgkz.zza(new zzdwp(this.zze, zzdwnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdwr
    public final zzdwo zzc() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdwr
    public final zzdwi zzd() {
        return new zzcqc(this.zzc, this.zzd, null);
    }
}
