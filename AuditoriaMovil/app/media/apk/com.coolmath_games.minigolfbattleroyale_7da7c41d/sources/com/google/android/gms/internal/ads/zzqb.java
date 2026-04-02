package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzqb {
    private final byte[] zza = new byte[8];
    private final ArrayDeque<zzpz> zzb = new ArrayDeque<>();
    private final zzqk zzc = new zzqk();
    private zzqc zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zznv zznvVar, int i) throws IOException {
        ((zznp) zznvVar).zza(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zza[i2] & UByte.MAX_VALUE);
        }
        return j;
    }

    public final void zza(zzqc zzqcVar) {
        this.zzd = zzqcVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zza();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r0 == 1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zznv r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqb.zzc(com.google.android.gms.internal.ads.zznv):boolean");
    }
}
