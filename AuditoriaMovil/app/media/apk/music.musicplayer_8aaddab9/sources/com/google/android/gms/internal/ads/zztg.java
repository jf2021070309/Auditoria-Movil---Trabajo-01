package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
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

    public zztg(zzuq zzuqVar) {
        this.zzb = zzuqVar;
        this.zzd = new boolean[4];
        this.zze = new zzte(128);
        this.zzl = -9223372036854775807L;
        this.zzf = new zztq(178, 128);
        this.zzc = new zzamf();
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
        zzox zzB = zznxVar.zzB(zzunVar.zzb(), 2);
        this.zzj = zzB;
        this.zzg = new zztf(zzB);
        this.zzb.zza(zznxVar, zzunVar);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.zzl = j2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ce A[SYNTHETIC] */
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
}
