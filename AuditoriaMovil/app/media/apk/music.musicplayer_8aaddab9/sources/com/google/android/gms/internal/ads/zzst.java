package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.Level;
import java.io.IOException;
/* loaded from: classes.dex */
public final class zzst implements zznu {
    public static final zzoa zza = zzss.zza;
    private final zzsu zzb = new zzsu(null);
    private final zzamf zzc = new zzamf(16384);
    private boolean zzd;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        r16.zzl();
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
        if ((r5 - r3) >= 8192) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.ads.zznv r16) throws java.io.IOException {
        /*
            r15 = this;
            com.google.android.gms.internal.ads.zzamf r0 = new com.google.android.gms.internal.ads.zzamf
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.zzi()
            r5 = r16
            com.google.android.gms.internal.ads.zznp r5 = (com.google.android.gms.internal.ads.zznp) r5
            r5.zzh(r4, r2, r1, r2)
            r0.zzh(r2)
            int r4 = r0.zzr()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L9e
            r16.zzl()
            r4 = r16
            com.google.android.gms.internal.ads.zznp r4 = (com.google.android.gms.internal.ads.zznp) r4
            r4.zzj(r3, r2)
            r5 = r3
        L2c:
            r1 = 0
        L2d:
            byte[] r6 = r0.zzi()
            r8 = 7
            r4.zzh(r6, r2, r8, r2)
            r0.zzh(r2)
            int r6 = r0.zzo()
            r9 = 44096(0xac40, float:6.1792E-41)
            r10 = 44097(0xac41, float:6.1793E-41)
            if (r6 == r9) goto L56
            if (r6 == r10) goto L56
            r16.zzl()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L55
            r4.zzj(r5, r2)
            goto L2c
        L55:
            return r2
        L56:
            r9 = 1
            int r1 = r1 + r9
            r11 = 4
            if (r1 < r11) goto L5c
            return r9
        L5c:
            byte[] r9 = r0.zzi()
            int r12 = com.google.android.gms.internal.ads.zznd.zza
            int r12 = r9.length
            r13 = -1
            if (r12 >= r8) goto L68
            r12 = -1
            goto L95
        L68:
            r12 = 2
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            r14 = r9[r7]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12 = r12 | r14
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r12 != r14) goto L8f
            r11 = r9[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 16
            r12 = 5
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            r11 = r11 | r12
            r12 = 6
            r9 = r9[r12]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r12 = r11 | r9
            goto L90
        L8f:
            r8 = 4
        L90:
            if (r6 != r10) goto L94
            int r8 = r8 + 2
        L94:
            int r12 = r12 + r8
        L95:
            if (r12 != r13) goto L98
            return r2
        L98:
            int r12 = r12 + (-7)
            r4.zzj(r12, r2)
            goto L2d
        L9e:
            r0.zzk(r7)
            int r4 = r0.zzA()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzj(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzst.zza(com.google.android.gms.internal.ads.zznv):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzb.zzb(zznxVar, new zzun(Level.ALL_INT, 0, 1));
        zznxVar.zzC();
        zznxVar.zzD(new zzos(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        int zzg = zznvVar.zzg(this.zzc.zzi(), 0, 16384);
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
