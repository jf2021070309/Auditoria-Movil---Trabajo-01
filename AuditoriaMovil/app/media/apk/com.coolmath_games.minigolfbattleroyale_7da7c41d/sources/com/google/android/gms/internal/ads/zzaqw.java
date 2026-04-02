package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaqw implements zzapo {
    public static final zzapq zza = new zzaqt();
    private static final int zzb = zzave.zzl("seig");
    private static final byte[] zzc = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private final SparseArray<zzaqv> zzd;
    private final zzaux zze;
    private final zzaux zzf;
    private final zzaux zzg;
    private final zzaux zzh;
    private final zzaux zzi;
    private final byte[] zzj;
    private final Stack<zzaqi> zzk;
    private final LinkedList<zzaqu> zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private zzaux zzq;
    private long zzr;
    private long zzs;
    private zzaqv zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private zzapp zzx;
    private boolean zzy;

    public zzaqw() {
        this(0, null, null);
    }

    private final void zza() {
        this.zzm = 0;
        this.zzp = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x063d, code lost:
        zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0641, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzb(long r50) throws com.google.android.gms.internal.ads.zzanp {
        /*
            Method dump skipped, instructions count: 1602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqw.zzb(long):void");
    }

    private static void zzc(zzaux zzauxVar, int i, zzare zzareVar) throws zzanp {
        zzauxVar.zzi(i + 8);
        int zzf = zzaqk.zzf(zzauxVar.zzr());
        if ((zzf & 1) != 0) {
            throw new zzanp("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzf & 2) != 0;
        int zzu = zzauxVar.zzu();
        int i2 = zzareVar.zze;
        if (zzu != i2) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(zzu);
            sb.append(", ");
            sb.append(i2);
            throw new zzanp(sb.toString());
        }
        Arrays.fill(zzareVar.zzm, 0, zzu, z);
        zzareVar.zza(zzauxVar.zzd());
        zzauxVar.zzk(zzareVar.zzp.zza, 0, zzareVar.zzo);
        zzareVar.zzp.zzi(0);
        zzareVar.zzq = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzapk zzh(java.util.List<com.google.android.gms.internal.ads.zzaqj> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
        L8:
            if (r3 >= r0) goto Lb9
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.zzaqj r5 = (com.google.android.gms.internal.ads.zzaqj) r5
            int r6 = r5.zzaR
            int r7 = com.google.android.gms.internal.ads.zzaqk.zzX
            if (r6 != r7) goto Lb5
            if (r4 != 0) goto L1d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1d:
            com.google.android.gms.internal.ads.zzaux r5 = r5.zza
            byte[] r5 = r5.zza
            com.google.android.gms.internal.ads.zzaux r6 = new com.google.android.gms.internal.ads.zzaux
            r6.<init>(r5)
            int r7 = r6.zze()
            r8 = 32
            if (r7 >= r8) goto L30
        L2e:
            r6 = r2
            goto L99
        L30:
            r6.zzi(r1)
            int r7 = r6.zzr()
            int r8 = r6.zzd()
            int r8 = r8 + 4
            if (r7 == r8) goto L40
            goto L2e
        L40:
            int r7 = r6.zzr()
            int r8 = com.google.android.gms.internal.ads.zzaqk.zzX
            if (r7 == r8) goto L49
            goto L2e
        L49:
            int r7 = r6.zzr()
            int r7 = com.google.android.gms.internal.ads.zzaqk.zze(r7)
            r8 = 1
            if (r7 <= r8) goto L6d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 37
            r6.<init>(r8)
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L2e
        L6d:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.zzs()
            long r12 = r6.zzs()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L85
            int r7 = r6.zzu()
            int r7 = r7 * 16
            r6.zzj(r7)
        L85:
            int r7 = r6.zzu()
            int r8 = r6.zzd()
            if (r7 == r8) goto L90
            goto L2e
        L90:
            byte[] r8 = new byte[r7]
            r6.zzk(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L99:
            if (r6 != 0) goto L9d
            r6 = r2
            goto La1
        L9d:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        La1:
            if (r6 != 0) goto Lab
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto Lb5
        Lab:
            com.google.android.gms.internal.ads.zzapj r7 = new com.google.android.gms.internal.ads.zzapj
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5, r1)
            r4.add(r7)
        Lb5:
            int r3 = r3 + 1
            goto L8
        Lb9:
            if (r4 != 0) goto Lbc
            return r2
        Lbc:
            com.google.android.gms.internal.ads.zzapk r14 = new com.google.android.gms.internal.ads.zzapk
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqw.zzh(java.util.List):com.google.android.gms.internal.ads.zzapk");
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final void zzd(zzapp zzappVar) {
        this.zzx = zzappVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final void zze(long j, long j2) {
        int size = this.zzd.size();
        for (int i = 0; i < size; i++) {
            this.zzd.valueAt(i).zzb();
        }
        this.zzl.clear();
        this.zzk.clear();
        zza();
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final boolean zzf(zzapn zzapnVar) throws IOException, InterruptedException {
        return zzarb.zza(zzapnVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        r2 = r24.zzt;
        r3 = r2.zza;
        r5 = r3.zzh;
        r9 = r2.zze;
        r5 = r5[r9];
        r24.zzu = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (r3.zzl == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
        r5 = r3.zzp;
        r10 = r3.zza.zza;
        r11 = r3.zzn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r11 == null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
        r11 = r2.zzc.zzh[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        r10 = r11.zza;
        r3 = r3.zzm[r9];
        r9 = r24.zzh;
        r11 = r9.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
        if (true == r3) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
        r11[0] = (byte) (r12 | r10);
        r9.zzi(0);
        r2 = r2.zzb;
        r2.zzb(r24.zzh, 1);
        r2.zzb(r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
        if (r3 != false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
        r3 = r5.zzm();
        r5.zzj(-2);
        r3 = (r3 * 6) + 2;
        r2.zzb(r5, r3);
        r10 = (r10 + 1) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
        r24.zzv = r10;
        r5 = r24.zzu + r10;
        r24.zzu = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
        r24.zzv = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e6, code lost:
        if (r24.zzt.zzc.zzg != 1) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
        r24.zzu = r5 - 8;
        r1.zzd(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
        r24.zzm = 4;
        r24.zzw = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
        r2 = r24.zzt;
        r3 = r2.zza;
        r5 = r2.zzc;
        r9 = r2.zzb;
        r2 = r2.zze;
        r6 = r5.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
        if (r6 != 0) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0102, code lost:
        r4 = r24.zzv;
        r6 = r24.zzu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0106, code lost:
        if (r4 >= r6) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
        r24.zzv += r9.zzd(r1, r6 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
        r10 = r24.zzf.zza;
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r4 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0126, code lost:
        if (r24.zzv >= r24.zzu) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
        r11 = r24.zzw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012a, code lost:
        if (r11 != 0) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012c, code lost:
        r1.zzb(r10, r6, r4, false);
        r24.zzf.zzi(0);
        r24.zzw = r24.zzf.zzu() - 1;
        r24.zze.zzi(0);
        r9.zzb(r24.zze, 4);
        r9.zzb(r24.zzf, 1);
        r24.zzv += 5;
        r24.zzu += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
        r11 = r9.zzd(r1, r11, false);
        r24.zzv += r11;
        r24.zzw -= r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0169, code lost:
        r10 = (r3.zzj[r2] + r3.zzi[r2]) * 1000;
        r1 = r3.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0178, code lost:
        if (true == r1) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017a, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017c, code lost:
        r4 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017e, code lost:
        r12 = r4 | (r3.zzk[r2] ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0184, code lost:
        if (r1 == false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0186, code lost:
        r1 = r3.zzn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0188, code lost:
        if (r1 != null) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018a, code lost:
        r1 = r5.zzh[r3.zza.zza];
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0192, code lost:
        r2 = r24.zzt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0196, code lost:
        if (r1 == r2.zzi) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0198, code lost:
        r2 = new com.google.android.gms.internal.ads.zzapw(1, r1.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a0, code lost:
        r2 = r2.zzh;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a2, code lost:
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a4, code lost:
        r1 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a6, code lost:
        r2 = r24.zzt;
        r2.zzh = r15;
        r2.zzi = r1;
        r9.zzc(r10, r12, r24.zzu, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b8, code lost:
        if (r24.zzl.isEmpty() == false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ba, code lost:
        r1 = r24.zzt;
        r1.zze++;
        r2 = r1.zzf + 1;
        r1.zzf = r2;
        r3 = r3.zzg;
        r4 = r1.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cc, code lost:
        if (r2 != r3[r4]) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ce, code lost:
        r1.zzg = r4 + 1;
        r1.zzf = 0;
        r24.zzt = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d6, code lost:
        r24.zzm = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d9, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01da, code lost:
        r2 = r24.zzl.removeFirst();
        r3 = r2.zzb;
        r2 = r2.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e7, code lost:
        throw null;
     */
    @Override // com.google.android.gms.internal.ads.zzapo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzg(com.google.android.gms.internal.ads.zzapn r25, com.google.android.gms.internal.ads.zzapt r26) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqw.zzg(com.google.android.gms.internal.ads.zzapn, com.google.android.gms.internal.ads.zzapt):int");
    }

    public zzaqw(int i, zzavb zzavbVar, zzarc zzarcVar) {
        this.zzi = new zzaux(16);
        this.zze = new zzaux(zzauv.zza);
        this.zzf = new zzaux(5);
        this.zzg = new zzaux();
        this.zzh = new zzaux(1);
        this.zzj = new byte[16];
        this.zzk = new Stack<>();
        this.zzl = new LinkedList<>();
        this.zzd = new SparseArray<>();
        this.zzs = -9223372036854775807L;
        zza();
    }
}
