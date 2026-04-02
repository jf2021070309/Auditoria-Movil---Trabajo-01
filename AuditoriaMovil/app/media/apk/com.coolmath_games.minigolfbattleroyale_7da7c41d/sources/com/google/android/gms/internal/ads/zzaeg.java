package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaeg extends zzahc {
    public static final zzadw<zzaeg> zzh = zzaef.zza;
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final zzafv zzd;
    public final int zze;
    public final zzo zzf;
    final boolean zzg;

    private zzaeg(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static zzaeg zza(IOException iOException, int i) {
        return new zzaeg(0, iOException, i);
    }

    public static zzaeg zzb(Throwable th, String str, int i, zzafv zzafvVar, int i2, boolean z, int i3) {
        return new zzaeg(1, th, null, i3, str, i, zzafvVar, zzafvVar == null ? 4 : i2, z);
    }

    public static zzaeg zzc(RuntimeException runtimeException, int i) {
        return new zzaeg(2, runtimeException, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzaeg zzd(zzo zzoVar) {
        String message = getMessage();
        int i = zzamq.zza;
        return new zzaeg(message, getCause(), this.zzi, this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzoVar, this.zzj, this.zzg);
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
            if (r4 == 0) goto L56
            r0 = 1
            if (r4 == r0) goto Ld
            java.lang.String r0 = "Unexpected runtime error"
            r6 = r18
            r7 = r19
            goto L5c
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r20)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzadx.zzd(r21)
            java.lang.String r2 = java.lang.String.valueOf(r18)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = r2 + 53
            int r2 = r2 + r3
            int r3 = r1.length()
            int r2 = r2 + r3
            r5.<init>(r2)
            r6 = r18
            r5.append(r6)
            java.lang.String r2 = " error, index="
            r5.append(r2)
            r7 = r19
            r5.append(r7)
            java.lang.String r2 = ", format="
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = ", format_supported="
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            goto L5c
        L56:
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L5c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L69
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L69:
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

    private zzaeg(String str, Throwable th, int i, int i2, String str2, int i3, zzafv zzafvVar, int i4, zzo zzoVar, long j, boolean z) {
        super(str, th, i, j);
        int i5;
        boolean z2;
        if (z) {
            i5 = i2;
            if (i5 == 1) {
                i5 = 1;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            i5 = i2;
            z2 = true;
        }
        zzakt.zza(z2);
        zzakt.zza(th != null);
        this.zza = i5;
        this.zzb = str2;
        this.zzc = i3;
        this.zzd = zzafvVar;
        this.zze = i4;
        this.zzf = zzoVar;
        this.zzg = z;
    }
}
