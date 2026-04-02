package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzejw implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzdjj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejw(zzejx zzejxVar, zzdjj zzdjjVar) {
        this.zza = zzdjjVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        this.zza.zzc().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        this.zza.zzd().zza();
        this.zza.zze().zza();
    }
}
