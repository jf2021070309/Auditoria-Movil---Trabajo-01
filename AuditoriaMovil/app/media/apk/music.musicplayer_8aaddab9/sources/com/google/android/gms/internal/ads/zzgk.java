package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzgk implements zzhx {
    private final zzoa zza;
    private zznu zzb;
    private zznv zzc;

    public zzgk(zzoa zzoaVar) {
        this.zza = zzoaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r6.zzn() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r6.zzn() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        r1 = false;
     */
    @Override // com.google.android.gms.internal.ads.zzhx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzah r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, com.google.android.gms.internal.ads.zznx r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zznp r6 = new com.google.android.gms.internal.ads.zznp
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zznu r8 = r7.zzb
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.gms.internal.ads.zzoa r8 = r7.zza
            com.google.android.gms.internal.ads.zznu[] r8 = r8.zza(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.zzb = r8
            goto L74
        L20:
            r0 = 0
        L21:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.zza(r6)     // Catch: java.lang.Throwable -> L41 java.io.EOFException -> L56
            if (r2 == 0) goto L34
            r7.zzb = r1     // Catch: java.lang.Throwable -> L41 java.io.EOFException -> L56
            com.google.android.gms.internal.ads.zzakt.zzd(r14)
            r6.zzl()
            goto L70
        L34:
            com.google.android.gms.internal.ads.zznu r1 = r7.zzb
            if (r1 != 0) goto L66
            long r1 = r6.zzn()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L64
            goto L66
        L41:
            r8 = move-exception
            com.google.android.gms.internal.ads.zznu r9 = r7.zzb
            if (r9 != 0) goto L4e
            long r9 = r6.zzn()
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 != 0) goto L4f
        L4e:
            r13 = 1
        L4f:
            com.google.android.gms.internal.ads.zzakt.zzd(r13)
            r6.zzl()
            throw r8
        L56:
            com.google.android.gms.internal.ads.zznu r1 = r7.zzb
            if (r1 != 0) goto L66
            long r1 = r6.zzn()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L64
            goto L66
        L64:
            r1 = 0
            goto L67
        L66:
            r1 = 1
        L67:
            com.google.android.gms.internal.ads.zzakt.zzd(r1)
            r6.zzl()
            int r0 = r0 + 1
            goto L21
        L70:
            com.google.android.gms.internal.ads.zznu r10 = r7.zzb
            if (r10 == 0) goto L7a
        L74:
            com.google.android.gms.internal.ads.zznu r8 = r7.zzb
            r8.zzb(r15)
            return
        L7a:
            com.google.android.gms.internal.ads.zzjb r10 = new com.google.android.gms.internal.ads.zzjb
            java.lang.String r8 = com.google.android.gms.internal.ads.zzamq.zzM(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r12 = r8.length()
            int r12 = r12 + 58
            r11.<init>(r12)
            java.lang.String r12 = "None of the available extractors ("
            java.lang.String r13 = ") could read the stream."
            java.lang.String r8 = e.a.d.a.a.s(r11, r12, r8, r13)
            r10.<init>(r8, r9)
            goto L98
        L97:
            throw r10
        L98:
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgk.zza(com.google.android.gms.internal.ads.zzah, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zznx):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zzb() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zzc() {
        zznu zznuVar = this.zzb;
        if (zznuVar instanceof zzqq) {
            ((zzqq) zznuVar).zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final long zzd() {
        zznv zznvVar = this.zzc;
        if (zznvVar != null) {
            return zznvVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zze(long j2, long j3) {
        zznu zznuVar = this.zzb;
        Objects.requireNonNull(zznuVar);
        zznuVar.zzd(j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final int zzf(zzoq zzoqVar) throws IOException {
        zznu zznuVar = this.zzb;
        Objects.requireNonNull(zznuVar);
        zznv zznvVar = this.zzc;
        Objects.requireNonNull(zznvVar);
        return zznuVar.zzc(zznvVar, zzoqVar);
    }
}
