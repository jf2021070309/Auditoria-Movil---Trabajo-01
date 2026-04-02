package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public final class zzaeg extends zzahc {
    public static final zzadw<zzaeg> zzh = zzaef.zza;
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final zzafv zzd;
    public final int zze;
    public final zzo zzf;
    public final boolean zzg;

    private zzaeg(int i2, Throwable th, int i3) {
        this(i2, th, null, i3, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzaeg(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, com.google.android.gms.internal.ads.zzafv r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            if (r4 == 0) goto L49
            r0 = 1
            if (r4 == r0) goto Ld
            java.lang.String r0 = "Unexpected runtime error"
            r6 = r18
            r7 = r19
            goto L4f
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r20)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzadx.zzd(r21)
            java.lang.String r2 = java.lang.String.valueOf(r18)
            int r2 = r2.length()
            int r3 = r0.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = r2 + 53
            int r2 = r2 + r3
            int r3 = r1.length()
            int r3 = r3 + r2
            r5.<init>(r3)
            r6 = r18
            r5.append(r6)
            java.lang.String r2 = " error, index="
            r5.append(r2)
            r7 = r19
            r5.append(r7)
            java.lang.String r2 = ", format="
            r5.append(r2)
            java.lang.String r2 = ", format_supported="
            java.lang.String r0 = e.a.d.a.a.s(r5, r0, r2, r1)
            goto L4f
        L49:
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L4f:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L5c
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L5c:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeg.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.zzafv, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzaeg(java.lang.String r9, java.lang.Throwable r10, int r11, int r12, java.lang.String r13, int r14, com.google.android.gms.internal.ads.zzafv r15, int r16, com.google.android.gms.internal.ads.zzo r17, long r18, boolean r20) {
        /*
            r8 = this;
            r6 = r8
            r7 = r20
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r18
            r0.<init>(r1, r2, r3, r4)
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L17
            r2 = r12
            if (r2 != r1) goto L15
            r2 = 1
            goto L18
        L15:
            r3 = 0
            goto L19
        L17:
            r2 = r12
        L18:
            r3 = 1
        L19:
            com.google.android.gms.internal.ads.zzakt.zza(r3)
            if (r10 != 0) goto L1f
            goto L20
        L1f:
            r0 = 1
        L20:
            com.google.android.gms.internal.ads.zzakt.zza(r0)
            r6.zza = r2
            r0 = r13
            r6.zzb = r0
            r0 = r14
            r6.zzc = r0
            r0 = r15
            r6.zzd = r0
            r0 = r16
            r6.zze = r0
            r0 = r17
            r6.zzf = r0
            r6.zzg = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeg.<init>(java.lang.String, java.lang.Throwable, int, int, java.lang.String, int, com.google.android.gms.internal.ads.zzafv, int, com.google.android.gms.internal.ads.zzo, long, boolean):void");
    }

    public static zzaeg zza(IOException iOException, int i2) {
        return new zzaeg(0, iOException, i2);
    }

    public static zzaeg zzb(Throwable th, String str, int i2, zzafv zzafvVar, int i3, boolean z, int i4) {
        return new zzaeg(1, th, null, i4, str, i2, zzafvVar, zzafvVar == null ? 4 : i3, z);
    }

    public static zzaeg zzc(RuntimeException runtimeException, int i2) {
        return new zzaeg(2, runtimeException, i2);
    }

    public final zzaeg zzd(zzo zzoVar) {
        String message = getMessage();
        int i2 = zzamq.zza;
        return new zzaeg(message, getCause(), this.zzi, this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzoVar, this.zzj, this.zzg);
    }
}
