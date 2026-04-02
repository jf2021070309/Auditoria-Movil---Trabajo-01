package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import e.a.d.a.a;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
/* loaded from: classes.dex */
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

    public zzaqw(int i2, zzavb zzavbVar, zzarc zzarcVar) {
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

    private final void zza() {
        this.zzm = 0;
        this.zzp = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x0604, code lost:
        zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0608, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzb(long r48) throws com.google.android.gms.internal.ads.zzanp {
        /*
            Method dump skipped, instructions count: 1545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqw.zzb(long):void");
    }

    private static void zzc(zzaux zzauxVar, int i2, zzare zzareVar) throws zzanp {
        zzauxVar.zzi(i2 + 8);
        int zzf = zzaqk.zzf(zzauxVar.zzr());
        if ((zzf & 1) != 0) {
            throw new zzanp("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzf & 2) != 0;
        int zzu = zzauxVar.zzu();
        int i3 = zzareVar.zze;
        if (zzu != i3) {
            throw new zzanp(a.S(41, "Length mismatch: ", zzu, ", ", i3));
        }
        Arrays.fill(zzareVar.zzm, 0, zzu, z);
        zzareVar.zza(zzauxVar.zzd());
        zzauxVar.zzk(zzareVar.zzp.zza, 0, zzareVar.zzo);
        zzareVar.zzp.zzi(0);
        zzareVar.zzq = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzapk zzh(java.util.List<com.google.android.gms.internal.ads.zzaqj> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r2
        L8:
            if (r3 >= r0) goto La8
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.zzaqj r5 = (com.google.android.gms.internal.ads.zzaqj) r5
            int r6 = r5.zzaR
            int r7 = com.google.android.gms.internal.ads.zzaqk.zzX
            if (r6 != r7) goto La4
            if (r4 != 0) goto L1d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1d:
            com.google.android.gms.internal.ads.zzaux r5 = r5.zza
            byte[] r5 = r5.zza
            com.google.android.gms.internal.ads.zzaux r6 = new com.google.android.gms.internal.ads.zzaux
            r6.<init>(r5)
            int r8 = r6.zze()
            r9 = 32
            if (r8 >= r9) goto L2f
            goto L7d
        L2f:
            r6.zzi(r1)
            int r8 = r6.zzr()
            int r9 = r6.zzd()
            int r9 = r9 + 4
            if (r8 == r9) goto L3f
            goto L7d
        L3f:
            int r8 = r6.zzr()
            if (r8 == r7) goto L46
            goto L7d
        L46:
            int r7 = r6.zzr()
            int r7 = com.google.android.gms.internal.ads.zzaqk.zze(r7)
            r8 = 1
            if (r7 <= r8) goto L5b
            r6 = 37
            java.lang.String r8 = "Unsupported pssh version: "
            java.lang.String r9 = "PsshAtomUtil"
            e.a.d.a.a.D(r6, r8, r7, r9)
            goto L7d
        L5b:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.zzs()
            long r12 = r6.zzs()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L73
            int r7 = r6.zzu()
            int r7 = r7 * 16
            r6.zzj(r7)
        L73:
            int r7 = r6.zzu()
            int r8 = r6.zzd()
            if (r7 == r8) goto L7f
        L7d:
            r6 = r2
            goto L88
        L7f:
            byte[] r8 = new byte[r7]
            r6.zzk(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L88:
            if (r6 != 0) goto L8c
            r6 = r2
            goto L90
        L8c:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L90:
            if (r6 != 0) goto L9a
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto La4
        L9a:
            com.google.android.gms.internal.ads.zzapj r7 = new com.google.android.gms.internal.ads.zzapj
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5, r1)
            r4.add(r7)
        La4:
            int r3 = r3 + 1
            goto L8
        La8:
            if (r4 != 0) goto Lab
            return r2
        Lab:
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
    public final void zze(long j2, long j3) {
        int size = this.zzd.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zzd.valueAt(i2).zzb();
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
        r2 = r25.zzt;
        r3 = r2.zza;
        r5 = r3.zzh;
        r9 = r2.zze;
        r5 = r5[r9];
        r25.zzu = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (r3.zzl == false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
        r5 = r3.zzp;
        r10 = r3.zza.zza;
        r11 = r3.zzn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r11 == null) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
        r11 = r2.zzc.zzh[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        r10 = r11.zza;
        r3 = r3.zzm[r9];
        r9 = r25.zzh;
        r11 = r9.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
        if (true == r3) goto L297;
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
        r2.zzb(r25.zzh, 1);
        r2.zzb(r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
        if (r3 != false) goto L296;
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
        r25.zzv = r10;
        r5 = r25.zzu + r10;
        r25.zzu = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
        r25.zzv = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e6, code lost:
        if (r25.zzt.zzc.zzg != 1) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
        r25.zzu = r5 - 8;
        r26.zzd(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
        r25.zzm = 4;
        r25.zzw = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
        r2 = r25.zzt;
        r3 = r2.zza;
        r5 = r2.zzc;
        r9 = r2.zzb;
        r2 = r2.zze;
        r6 = r5.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
        if (r6 != 0) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0102, code lost:
        r4 = r25.zzv;
        r6 = r25.zzu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0106, code lost:
        if (r4 >= r6) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
        r25.zzv += r9.zzd(r26, r6 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
        r10 = r25.zzf.zza;
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r4 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0126, code lost:
        if (r25.zzv >= r25.zzu) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
        r11 = r25.zzw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012a, code lost:
        if (r11 != 0) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012c, code lost:
        r26.zzb(r10, r6, r4, false);
        r25.zzf.zzi(0);
        r25.zzw = r25.zzf.zzu() - 1;
        r25.zze.zzi(0);
        r9.zzb(r25.zze, 4);
        r9.zzb(r25.zzf, 1);
        r25.zzv += 5;
        r25.zzu += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
        r11 = r9.zzd(r26, r11, false);
        r25.zzv += r11;
        r25.zzw -= r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0169, code lost:
        r10 = (r3.zzj[r2] + r3.zzi[r2]) * 1000;
        r1 = r3.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0179, code lost:
        if (true == r1) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017d, code lost:
        r4 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017f, code lost:
        r12 = r4 | (r3.zzk[r2] ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0185, code lost:
        if (r1 == false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0187, code lost:
        r1 = r3.zzn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0189, code lost:
        if (r1 != null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018b, code lost:
        r1 = r5.zzh[r3.zza.zza];
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0193, code lost:
        r2 = r25.zzt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0197, code lost:
        if (r1 == r2.zzi) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0199, code lost:
        r2 = new com.google.android.gms.internal.ads.zzapw(1, r1.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a1, code lost:
        r2 = r2.zzh;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a3, code lost:
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a5, code lost:
        r1 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a7, code lost:
        r2 = r25.zzt;
        r2.zzh = r15;
        r2.zzi = r1;
        r9.zzc(r10, r12, r25.zzu, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b9, code lost:
        if (r25.zzl.isEmpty() == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01bb, code lost:
        r1 = r25.zzt;
        r1.zze++;
        r2 = r1.zzf + 1;
        r1.zzf = r2;
        r3 = r3.zzg;
        r4 = r1.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cd, code lost:
        if (r2 != r3[r4]) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cf, code lost:
        r1.zzg = r4 + 1;
        r1.zzf = 0;
        r25.zzt = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d7, code lost:
        r25.zzm = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01da, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01db, code lost:
        r2 = r25.zzl.removeFirst().zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e6, code lost:
        throw null;
     */
    @Override // com.google.android.gms.internal.ads.zzapo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzg(com.google.android.gms.internal.ads.zzapn r26, com.google.android.gms.internal.ads.zzapt r27) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqw.zzg(com.google.android.gms.internal.ads.zzapn, com.google.android.gms.internal.ads.zzapt):int");
    }
}
