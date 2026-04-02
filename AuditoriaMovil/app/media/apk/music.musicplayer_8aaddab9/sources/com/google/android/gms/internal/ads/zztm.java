package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class zztm implements zztb {
    private final zzuc zza;
    private String zzb;
    private zzox zzc;
    private zztl zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zztq zzg = new zztq(32, 128);
    private final zztq zzh = new zztq(33, 128);
    private final zztq zzi = new zztq(34, 128);
    private final zztq zzj = new zztq(39, 128);
    private final zztq zzk = new zztq(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzamf zzn = new zzamf();

    public zztm(zzuc zzucVar) {
        this.zza = zzucVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i2, int i3) {
        this.zzd.zzc(bArr, i2, i3);
        if (!this.zze) {
            this.zzg.zzd(bArr, i2, i3);
            this.zzh.zzd(bArr, i2, i3);
            this.zzi.zzd(bArr, i2, i3);
        }
        this.zzj.zzd(bArr, i2, i3);
        this.zzk.zzd(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzalw.zze(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        zztl zztlVar = this.zzd;
        if (zztlVar != null) {
            zztlVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        zzunVar.zza();
        this.zzb = zzunVar.zzc();
        zzox zzB = zznxVar.zzB(zzunVar.zzb(), 2);
        this.zzc = zzB;
        this.zzd = new zztl(zzB);
        this.zza.zza(zznxVar, zzunVar);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.zzm = j2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    @Override // com.google.android.gms.internal.ads.zztb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzamf r28) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztm.zzd(com.google.android.gms.internal.ads.zzamf):void");
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }
}
