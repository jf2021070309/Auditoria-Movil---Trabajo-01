package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzid implements zziu {
    final /* synthetic */ zzig zza;
    private final int zzb;

    public zzid(zzig zzigVar, int i) {
        this.zza = zzigVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final boolean zzb() {
        return this.zza.zzw(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzc() throws IOException {
        this.zza.zzx(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final int zzd(zzafw zzafwVar, zzaf zzafVar, int i) {
        return this.zza.zzz(this.zzb, zzafwVar, zzafVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final int zze(long j) {
        return this.zza.zzA(this.zzb, j);
    }
}
