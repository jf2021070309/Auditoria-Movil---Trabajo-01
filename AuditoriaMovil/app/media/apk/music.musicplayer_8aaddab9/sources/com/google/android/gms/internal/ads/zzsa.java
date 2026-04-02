package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
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

    public zzsa(zzsm zzsmVar, long j2, long j3, long j4, long j5, boolean z) {
        zzakt.zza(j2 >= 0 && j3 > j2);
        this.zzd = zzsmVar;
        this.zzb = j2;
        this.zzc = j3;
        if (j4 == j3 - j2 || z) {
            this.zzf = j5;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzsg();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    @Override // com.google.android.gms.internal.ads.zzsh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zze(com.google.android.gms.internal.ads.zznv r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsa.zze(com.google.android.gms.internal.ads.zznv):long");
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final void zzf(long j2) {
        this.zzh = zzamq.zzy(j2, 0L, this.zzf - 1);
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
}
