package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzcqr implements com.google.android.gms.ads.nonagon.signalgeneration.zzf {
    private final zzcqu zza;
    private zzdao zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzz zzc;

    public /* synthetic */ zzcqr(zzcqu zzcquVar, zzcql zzcqlVar) {
        this.zza = zzcquVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzf
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzg zza() {
        zzgli.zzc(this.zzb, zzdao.class);
        zzgli.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzz.class);
        return new zzcqs(this.zza, this.zzc, new zzcyl(), new zzdvv(), this.zzb, new zzfbt(), null, null, null);
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzf zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzz zzzVar) {
        this.zzc = zzzVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzf zzc(zzdao zzdaoVar) {
        this.zzb = zzdaoVar;
        return this;
    }
}
