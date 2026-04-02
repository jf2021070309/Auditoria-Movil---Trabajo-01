package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzpv extends zzoi {
    private final long zza;

    public zzpv(zznv zznvVar, long j2) {
        super(zznvVar);
        zzakt.zza(zznvVar.zzn() >= j2);
        this.zza = j2;
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
