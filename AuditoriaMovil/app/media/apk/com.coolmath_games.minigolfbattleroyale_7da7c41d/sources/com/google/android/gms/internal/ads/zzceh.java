package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzceh extends zzcfb {
    private final Clock zzb;
    private final zzceh zzc = this;
    private final zzgln<Context> zzd;
    private final zzgln<com.google.android.gms.ads.internal.util.zzg> zze;
    private final zzgln<zzcfa> zzf;
    private final zzgln<zzcdz> zzg;
    private final zzgln<Clock> zzh;
    private final zzgln<zzceb> zzi;
    private final zzgln<zzced> zzj;
    private final zzgln<zzcfg> zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzceh(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcfa zzcfaVar, zzceg zzcegVar) {
        this.zzb = clock;
        this.zzd = zzglb.zza(context);
        this.zze = zzglb.zza(zzgVar);
        zzgla zza = zzglb.zza(zzcfaVar);
        this.zzf = zza;
        this.zzg = zzgkz.zza(new zzcea(this.zzd, this.zze, zza));
        zzgla zza2 = zzglb.zza(clock);
        this.zzh = zza2;
        zzgln<zzceb> zza3 = zzgkz.zza(new zzcec(zza2, this.zze, this.zzf));
        this.zzi = zza3;
        zzcee zzceeVar = new zzcee(this.zzh, zza3);
        this.zzj = zzceeVar;
        this.zzk = zzgkz.zza(new zzcfh(this.zzd, zzceeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    final zzcdz zza() {
        return this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzcfb
    public final zzced zzb() {
        return new zzced(this.zzb, this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    final zzcfg zzc() {
        return this.zzk.zzb();
    }
}
