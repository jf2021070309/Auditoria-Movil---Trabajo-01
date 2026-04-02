package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzpv extends zzoi {
    private final long zza;

    public zzpv(zznv zznvVar, long j) {
        super(zznvVar);
        zzakt.zza(zznvVar.zzn() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzoi, com.google.android.gms.internal.ads.zznv
    public final long zzm() {
        return super.zzm() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzoi, com.google.android.gms.internal.ads.zznv
    public final long zzn() {
        return super.zzn() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzoi, com.google.android.gms.internal.ads.zznv
    public final long zzo() {
        return super.zzo() - this.zza;
    }
}
