package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
/* loaded from: classes.dex */
public final class zztz implements zznu {
    public static final zzoa zza = zztx.zza;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private zztv zzj;
    private zznx zzk;
    private boolean zzl;
    private final zzamn zzb = new zzamn(0);
    private final zzamf zzd = new zzamf(4096);
    private final SparseArray<zzty> zzc = new SparseArray<>();
    private final zztw zze = new zztw();

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        byte[] bArr = new byte[14];
        zznp zznpVar = (zznp) zznvVar;
        zznpVar.zzh(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            zznpVar.zzj(bArr[13] & 7, false);
            zznpVar.zzh(bArr, 0, 3, false);
            return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzk = zznxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0151  */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(com.google.android.gms.internal.ads.zznv r13, com.google.android.gms.internal.ads.zzoq r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztz.zzc(com.google.android.gms.internal.ads.zznv, com.google.android.gms.internal.ads.zzoq):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r4 != r6) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[LOOP:0: B:14:0x0030->B:16:0x0038, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(long r4, long r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzamn r4 = r3.zzb
            long r4 = r4.zzc()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L23
            com.google.android.gms.internal.ads.zzamn r4 = r3.zzb
            long r4 = r4.zza()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L28
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L28
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L28
        L23:
            com.google.android.gms.internal.ads.zzamn r4 = r3.zzb
            r4.zzd(r6)
        L28:
            com.google.android.gms.internal.ads.zztv r4 = r3.zzj
            r5 = 0
            if (r4 == 0) goto L30
            r4.zzb(r6)
        L30:
            android.util.SparseArray<com.google.android.gms.internal.ads.zzty> r4 = r3.zzc
            int r4 = r4.size()
            if (r5 >= r4) goto L46
            android.util.SparseArray<com.google.android.gms.internal.ads.zzty> r4 = r3.zzc
            java.lang.Object r4 = r4.valueAt(r5)
            com.google.android.gms.internal.ads.zzty r4 = (com.google.android.gms.internal.ads.zzty) r4
            r4.zza()
            int r5 = r5 + 1
            goto L30
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztz.zzd(long, long):void");
    }
}
