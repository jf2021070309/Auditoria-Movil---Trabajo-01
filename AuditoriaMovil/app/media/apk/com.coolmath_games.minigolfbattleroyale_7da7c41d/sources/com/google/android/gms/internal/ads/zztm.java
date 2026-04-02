package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zzd(bArr, i, i2);
            this.zzh.zzd(bArr, i, i2);
            this.zzi.zzd(bArr, i, i2);
        }
        this.zzj.zzd(bArr, i, i2);
        this.zzk.zzd(bArr, i, i2);
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
        this.zzc = zznxVar.zzB(zzunVar.zzb(), 2);
        this.zzd = new zztl(this.zzc);
        this.zza.zza(zznxVar, zzunVar);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzm = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x039a  */
    @Override // com.google.android.gms.internal.ads.zztb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzamf r30) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztm.zzd(com.google.android.gms.internal.ads.zzamf):void");
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }
}
