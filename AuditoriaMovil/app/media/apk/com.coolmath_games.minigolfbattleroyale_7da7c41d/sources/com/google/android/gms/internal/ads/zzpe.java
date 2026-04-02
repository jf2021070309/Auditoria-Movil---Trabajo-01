package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzpe implements zznu {
    public static final zzoa zza = zzpd.zza;
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzc = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] zzd = zzamq.zzs("#!AMR\n");
    private static final byte[] zze = zzamq.zzs("#!AMR-WB\n");
    private static final int zzf = zzc[8];
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zznx zzp;
    private zzox zzq;
    private zzot zzr;
    private boolean zzs;

    public zzpe() {
        this(0);
    }

    public zzpe(int i) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    private final boolean zze(zznv zznvVar) throws IOException {
        if (zzf(zznvVar, zzd)) {
            this.zzh = false;
            ((zznp) zznvVar).zzd(zzd.length, false);
            return true;
        } else if (zzf(zznvVar, zze)) {
            this.zzh = true;
            ((zznp) zznvVar).zzd(zze.length, false);
            return true;
        } else {
            return false;
        }
    }

    private static boolean zzf(zznv zznvVar, byte[] bArr) throws IOException {
        zznvVar.zzl();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zznp) zznvVar).zzh(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[Catch: EOFException -> 0x0098, TryCatch #0 {EOFException -> 0x0098, blocks: (B:4:0x0007, B:6:0x001b, B:20:0x0039, B:22:0x0042, B:21:0x003e, B:31:0x005c, B:32:0x007f, B:33:0x0080, B:34:0x0097), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[Catch: EOFException -> 0x0098, TryCatch #0 {EOFException -> 0x0098, blocks: (B:4:0x0007, B:6:0x001b, B:20:0x0039, B:22:0x0042, B:21:0x003e, B:31:0x005c, B:32:0x007f, B:33:0x0080, B:34:0x0097), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzg(com.google.android.gms.internal.ads.zznv r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.zzk
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L99
            r12.zzl()     // Catch: java.io.EOFException -> L98
            byte[] r0 = r11.zzg     // Catch: java.io.EOFException -> L98
            r4 = r12
            com.google.android.gms.internal.ads.zznp r4 = (com.google.android.gms.internal.ads.zznp) r4     // Catch: java.io.EOFException -> L98
            r4.zzh(r0, r3, r2, r3)     // Catch: java.io.EOFException -> L98
            byte[] r0 = r11.zzg     // Catch: java.io.EOFException -> L98
            r0 = r0[r3]     // Catch: java.io.EOFException -> L98
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L80
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r11.zzh     // Catch: java.io.EOFException -> L98
            if (r4 == 0) goto L2c
            r6 = 10
            if (r0 < r6) goto L37
            r6 = 13
            if (r0 <= r6) goto L2c
            goto L37
        L2c:
            if (r4 != 0) goto L55
            r6 = 12
            if (r0 < r6) goto L37
            r6 = 14
            if (r0 > r6) goto L37
            goto L55
        L37:
            if (r4 == 0) goto L3e
            int[] r4 = com.google.android.gms.internal.ads.zzpe.zzc     // Catch: java.io.EOFException -> L98
            r0 = r4[r0]     // Catch: java.io.EOFException -> L98
            goto L42
        L3e:
            int[] r4 = com.google.android.gms.internal.ads.zzpe.zzb     // Catch: java.io.EOFException -> L98
            r0 = r4[r0]     // Catch: java.io.EOFException -> L98
        L42:
            r11.zzj = r0     // Catch: java.io.EOFException -> L98
            r11.zzk = r0
            int r4 = r11.zzm
            if (r4 != r1) goto L4d
            r11.zzm = r0
            r4 = r0
        L4d:
            if (r4 != r0) goto L99
            int r4 = r11.zzn
            int r4 = r4 + r2
            r11.zzn = r4
            goto L99
        L55:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L5c
            r12 = r3
        L5c:
            int r2 = r12.length()     // Catch: java.io.EOFException -> L98
            int r2 = r2 + 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L98
            r3.<init>(r2)     // Catch: java.io.EOFException -> L98
            java.lang.String r2 = "Illegal AMR "
            r3.append(r2)     // Catch: java.io.EOFException -> L98
            r3.append(r12)     // Catch: java.io.EOFException -> L98
            java.lang.String r12 = " frame type "
            r3.append(r12)     // Catch: java.io.EOFException -> L98
            r3.append(r0)     // Catch: java.io.EOFException -> L98
            java.lang.String r12 = r3.toString()     // Catch: java.io.EOFException -> L98
            com.google.android.gms.internal.ads.zzaha r12 = com.google.android.gms.internal.ads.zzaha.zzb(r12, r5)     // Catch: java.io.EOFException -> L98
            throw r12     // Catch: java.io.EOFException -> L98
        L80:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L98
            r2 = 42
            r12.<init>(r2)     // Catch: java.io.EOFException -> L98
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch: java.io.EOFException -> L98
            r12.append(r0)     // Catch: java.io.EOFException -> L98
            java.lang.String r12 = r12.toString()     // Catch: java.io.EOFException -> L98
            com.google.android.gms.internal.ads.zzaha r12 = com.google.android.gms.internal.ads.zzaha.zzb(r12, r5)     // Catch: java.io.EOFException -> L98
            throw r12     // Catch: java.io.EOFException -> L98
        L98:
            return r1
        L99:
            com.google.android.gms.internal.ads.zzox r4 = r11.zzq
            int r12 = com.google.android.gms.internal.ads.zzov.zza(r4, r12, r0, r2)
            if (r12 != r1) goto La2
            return r1
        La2:
            int r0 = r11.zzk
            int r0 = r0 - r12
            r11.zzk = r0
            if (r0 <= 0) goto Laa
            return r3
        Laa:
            com.google.android.gms.internal.ads.zzox r4 = r11.zzq
            long r5 = r11.zzi
            r7 = 1
            int r8 = r11.zzj
            r9 = 0
            r10 = 0
            r4.zzv(r5, r7, r8, r9, r10)
            long r0 = r11.zzi
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.zzi = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpe.zzg(com.google.android.gms.internal.ads.zznv):int");
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        return zze(zznvVar);
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzp = zznxVar;
        this.zzq = zznxVar.zzB(0, 1);
        zznxVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        zzakt.zze(this.zzq);
        int i = zzamq.zza;
        if (zznvVar.zzn() != 0 || zze(zznvVar)) {
            if (!this.zzs) {
                this.zzs = true;
                boolean z = this.zzh;
                String str = true != z ? "audio/3gpp" : "audio/amr-wb";
                int i2 = true != z ? 8000 : 16000;
                zzox zzoxVar = this.zzq;
                zzaft zzaftVar = new zzaft();
                zzaftVar.zzN(str);
                zzaftVar.zzO(zzf);
                zzaftVar.zzaa(1);
                zzaftVar.zzab(i2);
                zzoxVar.zzs(zzaftVar.zzah());
            }
            int zzg = zzg(zznvVar);
            if (this.zzl) {
                return zzg;
            }
            zzos zzosVar = new zzos(-9223372036854775807L, 0L);
            this.zzr = zzosVar;
            this.zzp.zzD(zzosVar);
            this.zzl = true;
            return zzg;
        }
        throw zzaha.zzb("Could not find AMR header.", null);
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0L;
    }
}
