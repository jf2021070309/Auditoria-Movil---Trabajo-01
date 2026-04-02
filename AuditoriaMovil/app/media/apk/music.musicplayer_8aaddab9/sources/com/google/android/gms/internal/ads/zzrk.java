package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.SparseArray;
import e.a.d.a.a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
/* loaded from: classes.dex */
public final class zzrk implements zznu {
    public static final zzoa zza = zzrh.zza;
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzafv zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zznx zzD;
    private zzox[] zzE;
    private zzox[] zzF;
    private boolean zzG;
    private final List<zzafv> zzd;
    private final SparseArray<zzrj> zze;
    private final zzamf zzf;
    private final zzamf zzg;
    private final zzamf zzh;
    private final byte[] zzi;
    private final zzamf zzj;
    private final zzaja zzk;
    private final zzamf zzl;
    private final ArrayDeque<zzqv> zzm;
    private final ArrayDeque<zzri> zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzamf zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzrj zzy;
    private int zzz;

    static {
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzN("application/x-emsg");
        zzc = zzaftVar.zzah();
    }

    public zzrk() {
        this(0, null);
    }

    public zzrk(int i2, zzamn zzamnVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzaja();
        this.zzl = new zzamf(16);
        this.zzf = new zzamf(zzalw.zza);
        this.zzg = new zzamf(5);
        this.zzh = new zzamf();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzamf(bArr);
        this.zzm = new ArrayDeque<>();
        this.zzn = new ArrayDeque<>();
        this.zze = new SparseArray<>();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zznx.zza;
        this.zzE = new zzox[0];
        this.zzF = new zzox[0];
    }

    private final void zze() {
        this.zzo = 0;
        this.zzr = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0334  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzf(long r45) throws com.google.android.gms.internal.ads.zzaha {
        /*
            Method dump skipped, instructions count: 1761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrk.zzf(long):void");
    }

    private static int zzg(int i2) throws zzaha {
        if (i2 >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(i2);
        throw zzaha.zzb(sb.toString(), null);
    }

    private static void zzh(zzamf zzamfVar, int i2, zzrw zzrwVar) throws zzaha {
        zzamfVar.zzh(i2 + 8);
        int zzv = zzamfVar.zzv() & 16777215;
        if ((zzv & 1) != 0) {
            throw zzaha.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzv & 2) != 0;
        int zzB = zzamfVar.zzB();
        if (zzB == 0) {
            Arrays.fill(zzrwVar.zzm, 0, zzrwVar.zze, false);
            return;
        }
        int i3 = zzrwVar.zze;
        if (zzB != i3) {
            throw zzaha.zzb(a.S(80, "Senc sample count ", zzB, " is different from fragment sample count", i3), null);
        }
        Arrays.fill(zzrwVar.zzm, 0, zzB, z);
        zzrwVar.zza(zzamfVar.zzd());
        zzamfVar.zzm(zzrwVar.zzo.zzi(), 0, zzrwVar.zzo.zze());
        zzrwVar.zzo.zzh(0);
        zzrwVar.zzp = false;
    }

    private static zzn zzi(List<zzqw> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            zzqw zzqwVar = list.get(i2);
            if (zzqwVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] zzi = zzqwVar.zza.zzi();
                UUID zza2 = zzrr.zza(zzi);
                if (zza2 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzm(zza2, null, "video/mp4", zzi));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzn(arrayList);
    }

    private static final zzrf zzj(SparseArray<zzrf> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        zzrf zzrfVar = sparseArray.get(i2);
        Objects.requireNonNull(zzrfVar);
        return zzrfVar;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        return zzrt.zza(zznvVar);
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzD = zznxVar;
        zze();
        zzox[] zzoxVarArr = new zzox[2];
        this.zzE = zzoxVarArr;
        int i2 = 0;
        zzox[] zzoxVarArr2 = (zzox[]) zzamq.zzf(zzoxVarArr, 0);
        this.zzE = zzoxVarArr2;
        for (zzox zzoxVar : zzoxVarArr2) {
            zzoxVar.zzs(zzc);
        }
        this.zzF = new zzox[this.zzd.size()];
        int i3 = 100;
        while (i2 < this.zzF.length) {
            int i4 = i3 + 1;
            zzox zzB = this.zzD.zzB(i3, 3);
            zzB.zzs(this.zzd.get(i2));
            this.zzF[i2] = zzB;
            i2++;
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0254, code lost:
        if (r0.zzn.isEmpty() != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0256, code lost:
        r1 = r0.zzn.removeFirst();
        r0.zzu -= r1.zzb;
        r6 = r1.zza + r14;
        r3 = r0.zzE;
        r15 = r3.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x026d, code lost:
        if (r14 >= r15) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x026f, code lost:
        r3[r14].zzv(r6, 1, r1.zzb, r0.zzu, null);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0287, code lost:
        if (r2.zzi() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0289, code lost:
        r0.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x028c, code lost:
        r0.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x028f, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
        if (r0.zzo != 3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
        r3 = r2.zzg();
        r0.zzz = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
        if (r2.zzf >= r2.zzi) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
        ((com.google.android.gms.internal.ads.zznp) r1).zzd(r3, false);
        r1 = r2.zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
        if (r1 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
        r3 = r2.zzb.zzo;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
        if (r1 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
        r3.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
        if (r2.zzb.zzc(r2.zzf) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
        r3.zzk(r3.zzo() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
        if (r2.zzi() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d8, code lost:
        r0.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00da, code lost:
        r0.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
        if (r2.zzd.zza.zzg != 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
        r0.zzz = r3 - 8;
        ((com.google.android.gms.internal.ads.zznp) r1).zzd(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0100, code lost:
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzl) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
        r0.zzA = r2.zzj(r0.zzz, 7);
        com.google.android.gms.internal.ads.zznd.zzb(r0.zzz, r0.zzj);
        com.google.android.gms.internal.ads.zzov.zzb(r2.zza, r0.zzj, 7);
        r3 = r0.zzA + 7;
        r0.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
        r3 = r2.zzj(r0.zzz, 0);
        r0.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0127, code lost:
        r0.zzz += r3;
        r0.zzo = 4;
        r0.zzB = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0131, code lost:
        r3 = r2.zzd.zza;
        r9 = r2.zza;
        r14 = r2.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013d, code lost:
        if (r3.zzj != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013f, code lost:
        r3 = r0.zzA;
        r4 = r0.zzz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
        if (r3 >= r4) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0145, code lost:
        r0.zzA += com.google.android.gms.internal.ads.zzov.zza(r9, r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0150, code lost:
        r5 = r0.zzg.zzi();
        r5[0] = 0;
        r5[1] = 0;
        r5[2] = 0;
        r10 = r3.zzj;
        r11 = r10 + 1;
        r10 = 4 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0167, code lost:
        if (r0.zzA >= r0.zzz) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0169, code lost:
        r12 = r0.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016d, code lost:
        if (r12 != 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016f, code lost:
        ((com.google.android.gms.internal.ads.zznp) r1).zza(r5, r10, r11, r8);
        r0.zzg.zzh(r8);
        r12 = r0.zzg.zzv();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0180, code lost:
        if (r12 <= 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0182, code lost:
        r0.zzB = r12 - 1;
        r0.zzf.zzh(r8);
        com.google.android.gms.internal.ads.zzov.zzb(r9, r0.zzf, 4);
        com.google.android.gms.internal.ads.zzov.zzb(r9, r0.zzg, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0199, code lost:
        if (r0.zzF.length <= 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019b, code lost:
        r8 = r3.zzf.zzl;
        r12 = r5[4];
        r16 = com.google.android.gms.internal.ads.zzalw.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a9, code lost:
        if ("video/avc".equals(r8) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ad, code lost:
        if ((r12 & 31) == r4) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b3, code lost:
        if ("video/hevc".equals(r8) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ba, code lost:
        if (((r12 & 126) >> r7) != 39) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bc, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01be, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bf, code lost:
        r0.zzC = r6;
        r0.zzA += 5;
        r0.zzz += r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d4, code lost:
        throw com.google.android.gms.internal.ads.zzaha.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d7, code lost:
        if (r0.zzC == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d9, code lost:
        r0.zzh.zza(r12);
        ((com.google.android.gms.internal.ads.zznp) r1).zza(r0.zzh.zzi(), 0, r0.zzB, false);
        com.google.android.gms.internal.ads.zzov.zzb(r9, r0.zzh, r0.zzB);
        r4 = r0.zzB;
        r6 = com.google.android.gms.internal.ads.zzalw.zza(r0.zzh.zzi(), r0.zzh.zze());
        r0.zzh.zzh("video/hevc".equals(r3.zzf.zzl) ? 1 : 0);
        r0.zzh.zzf(r6);
        com.google.android.gms.internal.ads.zznm.zza(r14, r0.zzh, r0.zzF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0220, code lost:
        r4 = com.google.android.gms.internal.ads.zzov.zza(r9, r1, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0225, code lost:
        r0.zzA += r4;
        r0.zzB -= r4;
        r4 = 6;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0232, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0236, code lost:
        r12 = r2.zzh();
        r1 = r2.zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x023e, code lost:
        if (r1 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0240, code lost:
        r1 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0243, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0244, code lost:
        r9.zzv(r14, r12, r0.zzz, 0, r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v17, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v22 */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(com.google.android.gms.internal.ads.zznv r29, com.google.android.gms.internal.ads.zzoq r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrk.zzc(com.google.android.gms.internal.ads.zznv, com.google.android.gms.internal.ads.zzoq):int");
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j2, long j3) {
        int size = this.zze.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zze.valueAt(i2).zzd();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j3;
        this.zzm.clear();
        zze();
    }
}
