package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzaqa {
    private final byte[] zza = new byte[8];
    private final Stack<zzapy> zzb = new Stack<>();
    private final zzaqh zzc = new zzaqh();
    private int zzd;
    private int zze;
    private long zzf;
    private zzaqc zzg;

    private final long zzd(zzapn zzapnVar, int i) throws IOException, InterruptedException {
        zzapnVar.zzb(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zza[i2] & UByte.MAX_VALUE);
        }
        return j;
    }

    public final void zza() {
        this.zzd = 0;
        this.zzb.clear();
        this.zzc.zza();
    }

    public final void zzb(zzaqc zzaqcVar) {
        this.zzg = zzaqcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        if (r0 == 1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzapn r12) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqa.zzc(com.google.android.gms.internal.ads.zzapn):boolean");
    }
}
