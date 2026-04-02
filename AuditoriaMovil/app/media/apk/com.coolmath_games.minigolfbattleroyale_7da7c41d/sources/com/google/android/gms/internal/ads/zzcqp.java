package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcqp implements zzdsa {
    private final zzcqu zza;
    private zzdgp zzb;
    private zzdao zzc;
    private zzexu zzd;
    private zzewv zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcqp(zzcqu zzcquVar, zzcql zzcqlVar) {
        this.zza = zzcquVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    /* renamed from: zza */
    public final zzdsb zzf() {
        zzgli.zzc(this.zzb, zzdgp.class);
        zzgli.zzc(this.zzc, zzdao.class);
        return new zzcqq(this.zza, new zzcyl(), new zzfbp(), new zzczw(), new zzdvv(), this.zzb, this.zzc, new zzfbt(), null, this.zzd, this.zze, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdsa
    public final /* bridge */ /* synthetic */ zzdsa zzb(zzdao zzdaoVar) {
        this.zzc = zzdaoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdsa
    public final /* bridge */ /* synthetic */ zzdsa zzc(zzdgp zzdgpVar) {
        this.zzb = zzdgpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final /* bridge */ /* synthetic */ zzdak<zzdsb> zzg(zzewv zzewvVar) {
        this.zze = zzewvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final /* bridge */ /* synthetic */ zzdak<zzdsb> zzh(zzexu zzexuVar) {
        this.zzd = zzexuVar;
        return this;
    }
}
