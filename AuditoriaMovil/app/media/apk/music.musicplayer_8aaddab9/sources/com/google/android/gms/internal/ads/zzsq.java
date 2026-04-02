package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.Level;
import java.io.IOException;
/* loaded from: classes.dex */
public final class zzsq implements zznu {
    public static final zzoa zza = zzsp.zza;
    private final zzsr zzb = new zzsr(null);
    private final zzamf zzc = new zzamf(2786);
    private boolean zzd;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        if ((r5 - r3) >= 8192) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
        r9.zzl();
        r5 = r5 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.ads.zznv r9) throws java.io.IOException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzamf r0 = new com.google.android.gms.internal.ads.zzamf
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.zzi()
            r5 = r9
            com.google.android.gms.internal.ads.zznp r5 = (com.google.android.gms.internal.ads.zznp) r5
            r5.zzh(r4, r2, r1, r2)
            r0.zzh(r2)
            int r4 = r0.zzr()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L65
            r9.zzl()
            r4 = r9
            com.google.android.gms.internal.ads.zznp r4 = (com.google.android.gms.internal.ads.zznp) r4
            r4.zzj(r3, r2)
            r5 = r3
        L29:
            r1 = 0
        L2a:
            byte[] r6 = r0.zzi()
            r7 = 6
            r4.zzh(r6, r2, r7, r2)
            r0.zzh(r2)
            int r6 = r0.zzo()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L4d
            r9.zzl()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L4c
            r4.zzj(r5, r2)
            goto L29
        L4c:
            return r2
        L4d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L53
            return r6
        L53:
            byte[] r6 = r0.zzi()
            int r6 = com.google.android.gms.internal.ads.zzna.zzd(r6)
            r7 = -1
            if (r6 != r7) goto L5f
            return r2
        L5f:
            int r6 = r6 + (-6)
            r4.zzj(r6, r2)
            goto L2a
        L65:
            r4 = 3
            r0.zzk(r4)
            int r4 = r0.zzA()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzj(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsq.zza(com.google.android.gms.internal.ads.zznv):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzb.zzb(zznxVar, new zzun(Level.ALL_INT, 0, 1));
        zznxVar.zzC();
        zznxVar.zzD(new zzos(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        int zzg = zznvVar.zzg(this.zzc.zzi(), 0, 2786);
        if (zzg == -1) {
            return -1;
        }
        this.zzc.zzh(0);
        this.zzc.zzf(zzg);
        if (!this.zzd) {
            this.zzb.zzc(0L, 4);
            this.zzd = true;
        }
        this.zzb.zzd(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j2, long j3) {
        this.zzd = false;
        this.zzb.zza();
    }
}
