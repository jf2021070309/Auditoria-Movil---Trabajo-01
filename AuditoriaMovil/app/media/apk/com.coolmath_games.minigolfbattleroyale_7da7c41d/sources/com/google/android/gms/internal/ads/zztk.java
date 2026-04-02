package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zztk implements zztb {
    private final zzuc zza;
    private long zze;
    private String zzg;
    private zzox zzh;
    private zztj zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zztq zzb = new zztq(7, 128);
    private final zztq zzc = new zztq(8, 128);
    private final zztq zzd = new zztq(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzamf zzm = new zzamf();

    public zztk(zzuc zzucVar, boolean z, boolean z2) {
        this.zza = zzucVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        if (!this.zzj) {
            this.zzb.zzd(bArr, i, i2);
            this.zzc.zzd(bArr, i, i2);
        }
        this.zzd.zzd(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzalw.zze(this.zzf);
        this.zzb.zza();
        this.zzc.zza();
        this.zzd.zza();
        zztj zztjVar = this.zzi;
        if (zztjVar != null) {
            zztjVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        zzunVar.zza();
        this.zzg = zzunVar.zzc();
        this.zzh = zznxVar.zzB(zzunVar.zzb(), 2);
        this.zzi = new zztj(this.zzh, false, false);
        this.zza.zza(zznxVar, zzunVar);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
        this.zzl |= (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0183 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zztb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzamf r20) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztk.zzd(com.google.android.gms.internal.ads.zzamf):void");
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }
}
