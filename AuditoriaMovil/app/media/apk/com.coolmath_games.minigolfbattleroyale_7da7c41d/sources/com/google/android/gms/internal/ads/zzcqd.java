package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcqd implements zzdwj {
    private final Long zza;
    private final String zzb;
    private final zzcqu zzc;
    private final zzcqf zzd;
    private final zzcqd zze = this;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcqd(zzcqu zzcquVar, zzcqf zzcqfVar, Long l, String str, zzcql zzcqlVar) {
        this.zzc = zzcquVar;
        this.zzd = zzcqfVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdwj
    public final zzdwt zza() {
        Context context;
        zzdwm zzc;
        long longValue = this.zza.longValue();
        context = this.zzd.zza;
        zzc = zzdwn.zzc(this.zzd.zzb);
        return zzdwu.zza(longValue, context, zzc, this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdwj
    public final zzdwx zzb() {
        Context context;
        zzdwm zzc;
        long longValue = this.zza.longValue();
        context = this.zzd.zza;
        zzc = zzdwn.zzc(this.zzd.zzb);
        return zzdwy.zza(longValue, context, zzc, this.zzc, this.zzb);
    }
}
