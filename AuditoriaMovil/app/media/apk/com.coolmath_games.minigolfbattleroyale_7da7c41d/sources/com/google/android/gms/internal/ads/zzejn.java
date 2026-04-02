package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzejn implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzchl zza;
    final /* synthetic */ zzfal zzb;
    final /* synthetic */ zzezz zzc;
    final /* synthetic */ zzejt zzd;
    final /* synthetic */ zzejo zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejn(zzejo zzejoVar, zzchl zzchlVar, zzfal zzfalVar, zzezz zzezzVar, zzejt zzejtVar) {
        this.zze = zzejoVar;
        this.zza = zzchlVar;
        this.zzb = zzfalVar;
        this.zzc = zzezzVar;
        this.zzd = zzejtVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        zzejx zzejxVar;
        zzchl zzchlVar = this.zza;
        zzejxVar = this.zze.zzd;
        zzchlVar.zzc(zzejxVar.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
