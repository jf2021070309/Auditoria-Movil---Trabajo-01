package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    private final void zze() {
        this.zzo = 0;
        this.zzr = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0339  */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzf(long r48) throws com.google.android.gms.internal.ads.zzaha {
        /*
            Method dump skipped, instructions count: 1816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrk.zzf(long):void");
    }

    private static int zzg(int i) throws zzaha {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw zzaha.zzb(sb.toString(), null);
    }

    private static void zzh(zzamf zzamfVar, int i, zzrw zzrwVar) throws zzaha {
        zzamfVar.zzh(i + 8);
        int zzv = zzamfVar.zzv() & ViewCompat.MEASURED_SIZE_MASK;
        if ((zzv & 1) != 0) {
            throw zzaha.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzv & 2) != 0;
        int zzB = zzamfVar.zzB();
        if (zzB == 0) {
            Arrays.fill(zzrwVar.zzm, 0, zzrwVar.zze, false);
            return;
        }
        int i2 = zzrwVar.zze;
        if (zzB != i2) {
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(zzB);
            sb.append(" is different from fragment sample count");
            sb.append(i2);
            throw zzaha.zzb(sb.toString(), null);
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
        for (int i = 0; i < size; i++) {
            zzqw zzqwVar = list.get(i);
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

    private static final zzrf zzj(SparseArray<zzrf> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        zzrf zzrfVar = sparseArray.get(i);
        if (zzrfVar != null) {
            return zzrfVar;
        }
        throw null;
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
        int i = 0;
        zzox[] zzoxVarArr2 = (zzox[]) zzamq.zzf(zzoxVarArr, 0);
        this.zzE = zzoxVarArr2;
        for (zzox zzoxVar : zzoxVarArr2) {
            zzoxVar.zzs(zzc);
        }
        this.zzF = new zzox[this.zzd.size()];
        int i2 = 100;
        while (i < this.zzF.length) {
            int i3 = i2 + 1;
            zzox zzB = this.zzD.zzB(i2, 3);
            zzB.zzs(this.zzd.get(i));
            this.zzF[i] = zzB;
            i++;
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024b, code lost:
        r5.zzv(r10, r20, r33.zzz, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x025e, code lost:
        if (r33.zzn.isEmpty() != false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0260, code lost:
        r1 = r33.zzn.removeFirst();
        r33.zzu -= r1.zzb;
        r3 = r1.zza + r10;
        r5 = r33.zzE;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0276, code lost:
        if (r8 >= r6) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0278, code lost:
        r5[r8].zzv(r3, 1, r1.zzb, r33.zzu, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0290, code lost:
        if (r2.zzi() != false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0292, code lost:
        r33.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0294, code lost:
        r33.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0298, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
        if (r33.zzo != 3) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
        r3 = r2.zzg();
        r33.zzz = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
        if (r2.zzf >= r2.zzi) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
        ((com.google.android.gms.internal.ads.zznp) r1).zzd(r3, false);
        r1 = r2.zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
        if (r1 != null) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
        r3 = r2.zzb.zzo;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
        if (r1 == 0) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00be, code lost:
        r3.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
        if (r2.zzb.zzc(r2.zzf) == false) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
        r3.zzk(r3.zzo() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
        if (r2.zzi() != false) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d9, code lost:
        r33.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00db, code lost:
        r33.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
        if (r2.zzd.zza.zzg != 1) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
        r33.zzz = r3 - 8;
        ((com.google.android.gms.internal.ads.zznp) r1).zzd(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0102, code lost:
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzl) == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0104, code lost:
        r33.zzA = r2.zzj(r33.zzz, 7);
        com.google.android.gms.internal.ads.zznd.zzb(r33.zzz, r33.zzj);
        com.google.android.gms.internal.ads.zzov.zzb(r2.zza, r33.zzj, 7);
        r3 = r33.zzA + 7;
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0121, code lost:
        r3 = r2.zzj(r33.zzz, 0);
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0129, code lost:
        r33.zzz += r3;
        r33.zzo = 4;
        r33.zzB = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0133, code lost:
        r3 = r2.zzd.zza;
        r5 = r2.zza;
        r10 = r2.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
        if (r3.zzj != 0) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
        r3 = r33.zzA;
        r4 = r33.zzz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0145, code lost:
        if (r3 >= r4) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0147, code lost:
        r33.zzA += com.google.android.gms.internal.ads.zzov.zza(r5, r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0152, code lost:
        r6 = r33.zzg.zzi();
        r6[0] = 0;
        r6[1] = 0;
        r6[2] = 0;
        r13 = r3.zzj;
        r14 = r13 + 1;
        r13 = 4 - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
        if (r33.zzA >= r33.zzz) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016c, code lost:
        r12 = r33.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0170, code lost:
        if (r12 != 0) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0172, code lost:
        ((com.google.android.gms.internal.ads.zznp) r1).zza(r6, r13, r14, r9);
        r33.zzg.zzh(r9);
        r12 = r33.zzg.zzv();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0183, code lost:
        if (r12 <= 0) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0185, code lost:
        r33.zzB = r12 - 1;
        r33.zzf.zzh(r9);
        com.google.android.gms.internal.ads.zzov.zzb(r5, r33.zzf, 4);
        com.google.android.gms.internal.ads.zzov.zzb(r5, r33.zzg, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019c, code lost:
        if (r33.zzF.length <= 0) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019e, code lost:
        r12 = r3.zzf.zzl;
        r17 = r6[4];
        r9 = com.google.android.gms.internal.ads.zzalw.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ac, code lost:
        if ("video/avc".equals(r12) == false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b0, code lost:
        if ((r17 & 31) == r4) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b3, code lost:
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b9, code lost:
        if ("video/hevc".equals(r12) == false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
        if (((r17 & 126) >> r8) != 39) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c3, code lost:
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c4, code lost:
        r33.zzC = r9;
        r33.zzA += 5;
        r33.zzz += r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d8, code lost:
        throw com.google.android.gms.internal.ads.zzaha.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01db, code lost:
        if (r33.zzC == false) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01dd, code lost:
        r33.zzh.zza(r12);
        ((com.google.android.gms.internal.ads.zznp) r1).zza(r33.zzh.zzi(), 0, r33.zzB, false);
        com.google.android.gms.internal.ads.zzov.zzb(r5, r33.zzh, r33.zzB);
        r4 = r33.zzB;
        r8 = com.google.android.gms.internal.ads.zzalw.zza(r33.zzh.zzi(), r33.zzh.zze());
        r33.zzh.zzh("video/hevc".equals(r3.zzf.zzl) ? 1 : 0);
        r33.zzh.zzf(r8);
        com.google.android.gms.internal.ads.zznm.zza(r10, r33.zzh, r33.zzF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0224, code lost:
        r4 = com.google.android.gms.internal.ads.zzov.zza(r5, r1, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x022a, code lost:
        r33.zzA += r4;
        r33.zzB -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0236, code lost:
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023a, code lost:
        r20 = r2.zzh();
        r1 = r2.zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0242, code lost:
        if (r1 == null) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0244, code lost:
        r23 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0249, code lost:
        r23 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v11 */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(com.google.android.gms.internal.ads.zznv r34, com.google.android.gms.internal.ads.zzoq r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrk.zzc(com.google.android.gms.internal.ads.zznv, com.google.android.gms.internal.ads.zzoq):int");
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        int size = this.zze.size();
        for (int i = 0; i < size; i++) {
            this.zze.valueAt(i).zzd();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j2;
        this.zzm.clear();
        zze();
    }

    public zzrk(int i, zzamn zzamnVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzaja();
        this.zzl = new zzamf(16);
        this.zzf = new zzamf(zzalw.zza);
        this.zzg = new zzamf(5);
        this.zzh = new zzamf();
        this.zzi = new byte[16];
        this.zzj = new zzamf(this.zzi);
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
}
