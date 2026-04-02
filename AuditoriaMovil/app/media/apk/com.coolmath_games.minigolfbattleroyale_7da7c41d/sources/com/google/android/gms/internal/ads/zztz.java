package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
        if ((((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            zznpVar.zzj(bArr[13] & 7, false);
            zznpVar.zzh(bArr, 0, 3, false);
            return ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) | (bArr[2] & UByte.MAX_VALUE)) == 1;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzk = zznxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(com.google.android.gms.internal.ads.zznv r14, com.google.android.gms.internal.ads.zzoq r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztz.zzc(com.google.android.gms.internal.ads.zznv, com.google.android.gms.internal.ads.zzoq):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r3 != r5) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[LOOP:0: B:14:0x0030->B:16:0x0038, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(long r3, long r5) {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.zzamn r3 = r2.zzb
            long r3 = r3.zzc()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L23
            com.google.android.gms.internal.ads.zzamn r3 = r2.zzb
            long r3 = r3.zza()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L28
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L28
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L28
        L23:
            com.google.android.gms.internal.ads.zzamn r3 = r2.zzb
            r3.zzd(r5)
        L28:
            com.google.android.gms.internal.ads.zztv r3 = r2.zzj
            r4 = 0
            if (r3 == 0) goto L30
            r3.zzb(r5)
        L30:
            android.util.SparseArray<com.google.android.gms.internal.ads.zzty> r3 = r2.zzc
            int r3 = r3.size()
            if (r4 >= r3) goto L46
            android.util.SparseArray<com.google.android.gms.internal.ads.zzty> r3 = r2.zzc
            java.lang.Object r3 = r3.valueAt(r4)
            com.google.android.gms.internal.ads.zzty r3 = (com.google.android.gms.internal.ads.zzty) r3
            r3.zza()
            int r4 = r4 + 1
            goto L30
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztz.zzd(long, long):void");
    }
}
