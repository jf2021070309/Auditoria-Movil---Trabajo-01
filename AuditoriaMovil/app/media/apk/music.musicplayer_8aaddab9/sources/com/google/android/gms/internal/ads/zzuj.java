package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzuj implements zznu {
    public static final zzoa zza = zzug.zza;
    private final List<zzamn> zzb;
    private final zzamf zzc;
    private final SparseIntArray zzd;
    private final zzum zze;
    private final SparseArray<zzuo> zzf;
    private final SparseBooleanArray zzg;
    private final SparseBooleanArray zzh;
    private final zzuf zzi;
    private zzue zzj;
    private zznx zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;

    public zzuj() {
        this(0);
    }

    public zzuj(int i2) {
        this(1, 0, 112800);
    }

    public zzuj(int i2, int i3, int i4) {
        zzamn zzamnVar = new zzamn(0L);
        this.zze = new zzsy(0);
        this.zzb = Collections.singletonList(zzamnVar);
        this.zzc = new zzamf(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzg = sparseBooleanArray;
        this.zzh = new SparseBooleanArray();
        SparseArray<zzuo> sparseArray = new SparseArray<>();
        this.zzf = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzi = new zzuf(112800);
        this.zzk = zznx.zza;
        this.zzq = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.zzf.put(sparseArray2.keyAt(i5), (zzuo) sparseArray2.valueAt(i5));
        }
        this.zzf.put(0, new zzub(new zzuh(this)));
    }

    public static /* synthetic */ boolean zzm(zzuj zzujVar, boolean z) {
        zzujVar.zzm = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.ads.zznv r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzamf r0 = r6.zzc
            byte[] r0 = r0.zzi()
            com.google.android.gms.internal.ads.zznp r7 = (com.google.android.gms.internal.ads.zznp) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.zzh(r0, r1, r2, r1)
            r2 = 0
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = 0
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zzd(r2, r1)
            r7 = 1
            return r7
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuj.zza(com.google.android.gms.internal.ads.zznv):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzk = zznxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ae, code lost:
        if (r2 == false) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(com.google.android.gms.internal.ads.zznv r19, com.google.android.gms.internal.ads.zzoq r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuj.zzc(com.google.android.gms.internal.ads.zznv, com.google.android.gms.internal.ads.zzoq):int");
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j2, long j3) {
        zzue zzueVar;
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzamn zzamnVar = this.zzb.get(i2);
            if (zzamnVar.zzc() != -9223372036854775807L) {
                long zza2 = zzamnVar.zza();
                if (zza2 != -9223372036854775807L) {
                    if (zza2 != 0) {
                        if (zza2 == j3) {
                        }
                    }
                }
            }
            zzamnVar.zzd(j3);
        }
        if (j3 != 0 && (zzueVar = this.zzj) != null) {
            zzueVar.zzb(j3);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        for (int i3 = 0; i3 < this.zzf.size(); i3++) {
            this.zzf.valueAt(i3).zzb();
        }
        this.zzp = 0;
    }
}
