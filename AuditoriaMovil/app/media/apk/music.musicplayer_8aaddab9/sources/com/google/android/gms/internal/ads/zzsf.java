package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzsf {
    private final zzsg zza = new zzsg();
    private final zzamf zzb = new zzamf(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i2) {
        int i3;
        int i4 = 0;
        this.zzd = 0;
        do {
            int i5 = this.zzd;
            int i6 = i2 + i5;
            zzsg zzsgVar = this.zza;
            if (i6 >= zzsgVar.zzc) {
                break;
            }
            int[] iArr = zzsgVar.zzf;
            this.zzd = i5 + 1;
            i3 = iArr[i6];
            i4 += i3;
        } while (i3 == 255);
        return i4;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(com.google.android.gms.internal.ads.zznv r7) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r6.zze
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r6.zze = r1
            com.google.android.gms.internal.ads.zzamf r0 = r6.zzb
            r0.zza(r1)
        Ld:
            boolean r0 = r6.zze
            r2 = 1
            if (r0 != 0) goto L9b
            int r0 = r6.zzc
            if (r0 >= 0) goto L4e
            com.google.android.gms.internal.ads.zzsg r0 = r6.zza
            r3 = -1
            boolean r0 = r0.zzb(r7, r3)
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.zzsg r0 = r6.zza
            boolean r0 = r0.zzc(r7, r2)
            if (r0 != 0) goto L29
            goto L4d
        L29:
            com.google.android.gms.internal.ads.zzsg r0 = r6.zza
            int r3 = r0.zzd
            int r0 = r0.zza
            r0 = r0 & r2
            if (r0 != r2) goto L42
            com.google.android.gms.internal.ads.zzamf r0 = r6.zzb
            int r0 = r0.zze()
            if (r0 != 0) goto L42
            int r0 = r6.zzf(r1)
            int r3 = r3 + r0
            int r0 = r6.zzd
            goto L43
        L42:
            r0 = 0
        L43:
            boolean r3 = com.google.android.gms.internal.ads.zzny.zzd(r7, r3)
            if (r3 != 0) goto L4a
            return r1
        L4a:
            r6.zzc = r0
            goto L4e
        L4d:
            return r1
        L4e:
            int r0 = r6.zzf(r0)
            int r3 = r6.zzc
            int r4 = r6.zzd
            int r3 = r3 + r4
            if (r0 <= 0) goto L90
            com.google.android.gms.internal.ads.zzamf r4 = r6.zzb
            int r5 = r4.zze()
            int r5 = r5 + r0
            r4.zzc(r5)
            com.google.android.gms.internal.ads.zzamf r4 = r6.zzb
            byte[] r4 = r4.zzi()
            com.google.android.gms.internal.ads.zzamf r5 = r6.zzb
            int r5 = r5.zze()
            boolean r4 = com.google.android.gms.internal.ads.zzny.zzc(r7, r4, r5, r0)
            if (r4 != 0) goto L76
            return r1
        L76:
            com.google.android.gms.internal.ads.zzamf r4 = r6.zzb
            int r5 = r4.zze()
            int r5 = r5 + r0
            r4.zzf(r5)
            com.google.android.gms.internal.ads.zzsg r0 = r6.zza
            int[] r0 = r0.zzf
            int r4 = r3 + (-1)
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L8d
            goto L8e
        L8d:
            r2 = 0
        L8e:
            r6.zze = r2
        L90:
            com.google.android.gms.internal.ads.zzsg r0 = r6.zza
            int r0 = r0.zzc
            if (r3 != r0) goto L97
            r3 = -1
        L97:
            r6.zzc = r3
            goto Ld
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsf.zzb(com.google.android.gms.internal.ads.zznv):boolean");
    }

    public final zzsg zzc() {
        return this.zza;
    }

    public final zzamf zzd() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zzb.zzi().length == 65025) {
            return;
        }
        zzamf zzamfVar = this.zzb;
        zzamfVar.zzb(Arrays.copyOf(zzamfVar.zzi(), Math.max(65025, this.zzb.zze())), this.zzb.zze());
    }
}
