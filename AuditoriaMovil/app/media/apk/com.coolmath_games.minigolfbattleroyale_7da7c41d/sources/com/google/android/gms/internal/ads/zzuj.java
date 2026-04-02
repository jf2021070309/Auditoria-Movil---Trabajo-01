package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    /* JADX INFO: Access modifiers changed from: package-private */
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
            r2 = r1
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = r1
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
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
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
    public final void zzd(long j, long j2) {
        zzue zzueVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            zzamn zzamnVar = this.zzb.get(i);
            if (zzamnVar.zzc() != -9223372036854775807L) {
                long zza2 = zzamnVar.zza();
                if (zza2 != -9223372036854775807L) {
                    if (zza2 != 0) {
                        if (zza2 == j2) {
                        }
                    }
                }
            }
            zzamnVar.zzd(j2);
        }
        if (j2 != 0 && (zzueVar = this.zzj) != null) {
            zzueVar.zzb(j2);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zzf.size(); i2++) {
            this.zzf.valueAt(i2).zzb();
        }
        this.zzp = 0;
    }

    public zzuj(int i) {
        this(1, 0, 112800);
    }

    public zzuj(int i, int i2, int i3) {
        zzamn zzamnVar = new zzamn(0L);
        this.zze = new zzsy(0);
        this.zzb = Collections.singletonList(zzamnVar);
        this.zzc = new zzamf(new byte[9400], 0);
        this.zzg = new SparseBooleanArray();
        this.zzh = new SparseBooleanArray();
        this.zzf = new SparseArray<>();
        this.zzd = new SparseIntArray();
        this.zzi = new zzuf(112800);
        this.zzk = zznx.zza;
        this.zzq = -1;
        this.zzg.clear();
        this.zzf.clear();
        SparseArray sparseArray = new SparseArray();
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzf.put(sparseArray.keyAt(i4), (zzuo) sparseArray.valueAt(i4));
        }
        this.zzf.put(0, new zzub(new zzuh(this)));
    }
}
