package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zztd implements zztb {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzox zzb;
    private final zzuq zzd;
    private final zzamf zze;
    private final zztq zzf;
    private final boolean[] zzg;
    private final zztc zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zztd() {
        this(null);
    }

    public zztd(zzuq zzuqVar) {
        zzamf zzamfVar;
        this.zzd = zzuqVar;
        this.zzg = new boolean[4];
        this.zzh = new zztc(128);
        if (zzuqVar != null) {
            this.zzf = new zztq(178, 128);
            zzamfVar = new zzamf();
        } else {
            zzamfVar = null;
            this.zzf = null;
        }
        this.zze = zzamfVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        zzalw.zze(this.zzg);
        this.zzh.zza();
        zztq zztqVar = this.zzf;
        if (zztqVar != null) {
            zztqVar.zza();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        zzunVar.zza();
        this.zza = zzunVar.zzc();
        this.zzb = zznxVar.zzB(zzunVar.zzb(), 2);
        zzuq zzuqVar = this.zzd;
        if (zzuqVar != null) {
            zzuqVar.zza(zznxVar, zzunVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j2, int i2) {
        this.zzm = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e7  */
    @Override // com.google.android.gms.internal.ads.zztb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzamf r20) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztd.zzd(com.google.android.gms.internal.ads.zzamf):void");
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }
}
