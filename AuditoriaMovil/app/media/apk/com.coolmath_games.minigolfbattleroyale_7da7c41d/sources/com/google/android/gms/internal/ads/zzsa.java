package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzsa implements zzsh {
    private final zzsg zza;
    private final long zzb;
    private final long zzc;
    private final zzsm zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzsa(zzsm zzsmVar, long j, long j2, long j3, long j4, boolean z) {
        zzakt.zza(j >= 0 && j2 > j);
        this.zzd = zzsmVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzsg();
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final void zzf(long j) {
        this.zzh = zzamq.zzy(j, 0L, this.zzf - 1);
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final /* bridge */ /* synthetic */ zzot zzg() {
        if (this.zzf != 0) {
            return new zzrz(this, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    @Override // com.google.android.gms.internal.ads.zzsh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zze(com.google.android.gms.internal.ads.zznv r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsa.zze(com.google.android.gms.internal.ads.zznv):long");
    }
}
