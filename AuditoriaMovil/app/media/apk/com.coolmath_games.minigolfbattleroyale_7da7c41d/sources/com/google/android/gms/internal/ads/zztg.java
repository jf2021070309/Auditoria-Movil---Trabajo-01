package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zztg implements zztb {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzuq zzb;
    private final zzamf zzc;
    private final boolean[] zzd;
    private final zzte zze;
    private final zztq zzf;
    private zztf zzg;
    private long zzh;
    private String zzi;
    private zzox zzj;
    private boolean zzk;
    private long zzl;

    public zztg() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        zzalw.zze(this.zzd);
        this.zze.zza();
        zztf zztfVar = this.zzg;
        if (zztfVar != null) {
            zztfVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        zzunVar.zza();
        this.zzi = zzunVar.zzc();
        this.zzj = zznxVar.zzB(zzunVar.zzb(), 2);
        this.zzg = new zztf(this.zzj);
        this.zzb.zza(zznxVar, zzunVar);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ce A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zztb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzamf r19) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztg.zzd(com.google.android.gms.internal.ads.zzamf):void");
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztg(zzuq zzuqVar) {
        this.zzb = zzuqVar;
        this.zzd = new boolean[4];
        this.zze = new zzte(128);
        this.zzl = -9223372036854775807L;
        this.zzf = new zztq(178, 128);
        this.zzc = new zzamf();
    }
}
